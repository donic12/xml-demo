package com.java1234.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DOM4J01 {

	public static void main(String[] args) {
		Document document=DocumentHelper.createDocument();
		Element studentElement=document.addElement("student");
		studentElement.addAttribute("id", "001");
		studentElement.addAttribute("aa", "xx");
		
		Element name=studentElement.addElement("name");
		name.setText("����");
		Element sex=studentElement.addElement("sex");
		sex.setText("��");
		Element age=studentElement.addElement("age");
		age.setText("20");
		
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		try {
			XMLWriter writer=new XMLWriter(new FileOutputStream("src/student3.xml"),format);
			writer.write(document);
			writer.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
