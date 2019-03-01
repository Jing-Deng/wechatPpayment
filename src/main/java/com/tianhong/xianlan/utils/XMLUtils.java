package com.tianhong.xianlan.utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.Map;

/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 15:10
 */
public class XMLUtils {

    /**
     * @Description :map 转 xml
     **/
    public static String mapToXml(Map<String, String> map) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        org.w3c.dom.Document document = documentBuilder.newDocument();
        org.w3c.dom.Element element = document.createElement("xml");
        document.appendChild(element);
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (value == null) {
                value = "";
            }
            value = value.trim();
            org.w3c.dom.Element filed = document.createElement(key);
            filed.appendChild(document.createTextNode(value));
            element.appendChild(filed);
        }
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StringWriter write = new StringWriter();
        StreamResult result = new StreamResult(write);
        transformer.transform(source, result);
        String output = write.getBuffer().toString();////.replaceAll("\n|\r", "");
        try {
            write.close();
        } catch (Exception e) {

        }
        return output;
    }
}
