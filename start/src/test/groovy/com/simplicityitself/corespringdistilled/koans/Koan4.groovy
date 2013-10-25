package com.simplicityitself.corespringdistilled.koans

import org.springframework.context.ApplicationContext
import spock.lang.Specification

class Koan4 extends Specification {
    def "Add a Spring Bean Programmatically To An Application Context and Retrieve by the Spring Bean's Type"() {

        when: "Begin your Koan Here: Create a ClassPathXmlApplicationContext based on the no-beans.xml file available on the classpath"
        ApplicationContext applicationContext = null;

        then: "The application context should not be null"
        applicationContext != null;
    }
}  
