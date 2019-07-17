package com.java1234.xml;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DOM4J02 {

	public static void main(String[] args) throws Exception{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/students.xml");
		Element rootElement=document.getRootElement();
		Iterator iter=rootElement.elementIterator();
		while(iter.hasNext()){
			Element studentElement=(Element)iter.next();
			System.out.println("ѧ�ţ�"+studentElement.attributeValue("id"));
			System.out.println("������"+studentElement.elementText("name"));
			System.out.println("�Ա�"+studentElement.elementText("sex"));
			System.out.println("���䣺"+studentElement.elementText("age"));
			System.out.println("=========");
		}
	}
}
