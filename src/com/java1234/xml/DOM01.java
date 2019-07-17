package com.java1234.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOM01 {

	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.parse("src/student.xml");
			NodeList nodeList=doc.getElementsByTagName("student");
			Element e=(Element)nodeList.item(0);
			System.out.println("������"+e.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
			System.out.println("�Ա�"+e.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue());
			System.out.println("���䣺"+e.getElementsByTagName("age").item(0).getFirstChild().getNodeValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
