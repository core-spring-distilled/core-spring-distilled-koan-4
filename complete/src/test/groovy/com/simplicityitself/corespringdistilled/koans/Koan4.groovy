package com.simplicityitself.corespringdistilled.koans

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import spock.lang.Specification

class Koan4 extends Specification {
    def "Configure an ApplicationContext using an XML configuration file"() {

        when: "Begin your Koan Here: Create an appropriate empty no-beans.xml configuration file"
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("com/simplicityitself/corespringdistilled/koans/configuration/no-beans.xml");

        then: "The application context should not be null"
        applicationContext != null;
        applicationContext.getBeanDefinitionCount() == 0;
    }
}
