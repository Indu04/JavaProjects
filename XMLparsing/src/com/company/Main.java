package com.company;

//import javax.swing.text.Document;

//import javax.swing.text.Document;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import org.xml.sax.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerConfigurationException, TransformerException
    {
        Document dom;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();
        dom = builder.parse("C:\\books.xml");
        Element catalog = dom.getDocumentElement();
        NodeList books = catalog.getElementsByTagName("book");

        for (int i=0; i < books.getLength(); i++)
        {
            Element book = (Element)books.item(i);
//            System.out.println(book);

            if (book.getAttribute("id").equals("bk102"))
            {
             NodeList price = book.getElementsByTagName("price");
             System.out.println(price.item(0).getTextContent());
             price.item(0).setTextContent("7.9");
             System.out.println(price.item(0).getTextContent());


            }
        }
        // Update XML with new value
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        StreamResult result = new StreamResult("C:\\books.xml");
        DOMSource src = new DOMSource(dom);
        transformer.transform(src, result);



    }
}
