package com.trainingbasket;

import com.trainingbasket.beans.Envelope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Envelope envelope1 = (Envelope) context.getBean("envelopeDefault");
        Envelope envelope2 = (Envelope) context.getBean("envelopeByName");
        Envelope envelope3 = (Envelope) context.getBean("envelopeByType");

        System.out.println(envelope1);
        System.out.println(envelope2);
        System.out.println(envelope3);
    }
}
