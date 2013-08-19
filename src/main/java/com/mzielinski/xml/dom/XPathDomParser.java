package com.mzielinski.xml.dom;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 7/3/13
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class XPathDomParser {

    public static void main(String... args) throws Exception {
        //obtain Document somehow, doesn't matter how
        DocumentBuilder b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputStream inputStream = XPathDomParser.class.getClassLoader().getResourceAsStream("page.html");
        org.w3c.dom.Document doc = b.parse(inputStream);

        //Evaluate XPath against Document itself
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodes = (NodeList) xPath.evaluate("/html/body/p/div[3]/a", doc.getDocumentElement(), XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); ++i) {
            Element e = (Element) nodes.item(i);
            System.out.println(e.getFirstChild().getNodeValue());
        }
    }

}
