package com.java1234.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOM02 {

	public static void printNodeAttr(Node node){
		NamedNodeMap namedNodeMap=node.getAttributes();
		for(int i=0;i<namedNodeMap.getLength();i++){
			Node attrNode=namedNodeMap.item(i);
			System.out.println(attrNode.getNodeName()+":"+attrNode.getFirstChild().getNodeValue());
		}
	}
	
	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.parse("src/students.xml");
			NodeList nodeList=doc.getElementsByTagName("students");
			Element element=(Element)nodeList.item(0);
			NodeList studentsNodeList=element.getElementsByTagName("student");
			for(int i=0;i<studentsNodeList.getLength();i++){
				Element e=(Element)studentsNodeList.item(i);
				System.out.println("姓名："+e.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
				printNodeAttr(e.getElementsByTagName("name").item(0));
				System.out.println("性别："+e.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue());
				System.out.println("年龄："+e.getElementsByTagName("age").item(0).getFirstChild().getNodeValue());
				System.out.println("================");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
