package org.sdp.test;

import org.sdp.beans.HTMLMessageWriter;
import org.sdp.beans.MessageDisplay;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("org/sdp/common/application-context.xml"));
        MessageDisplay messageDisplay = factory.getBean("messageDisplay", MessageDisplay.class);
        messageDisplay.setMessageWriter(factory.getBean("htmlMessageWriter", HTMLMessageWriter.class));
        messageDisplay.displayMessage();
    }
}
