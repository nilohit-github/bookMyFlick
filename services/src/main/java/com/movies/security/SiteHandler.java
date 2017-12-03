package com.movies.security;

import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SiteHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public void close(MessageContext arg0) {
		System.out.println("close");
		
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		System.out.println("handleFault");
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isResponse = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		System.out.println("handle message called");
		if(!isResponse)
		{
			SOAPMessage soapmessage = context.getMessage();
			try {
				SOAPEnvelope soapenvelope = soapmessage.getSOAPPart().getEnvelope();
				SOAPHeader header = soapenvelope.getHeader();
				Iterator childElements = header.getChildElements();
				while(childElements.hasNext())
				{
					Node eachNode = (Node) childElements.next();
					String name = eachNode.getLocalName();
					if(name != null && name.equals("SiteName"))
							{
								System.out.println("Site name equals"+eachNode.getValue());
							}
				}
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Response on the way");
		}
		
		
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("getHeaders");
		return null;
	}

}
