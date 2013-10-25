package com.simplicityitself.corespringdistilled.koans

import com.simplicityitself.corespringdistilled.koans.persistence.Repository
import com.simplicityitself.corespringdistilled.koans.persistence.SampleRepository
import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.context.support.GenericApplicationContext;
import spock.lang.Specification;

class Koan3 extends Specification {
    def "Add a Spring Bean Programmatically To An Application Context and Retrieve by the Spring Bean's Type"() {

        given: "You have an Application Context and have registered a Bean with the Bean Builder"
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(SampleRepository.class);

        when: "Register the bean definition with the name 'repository' with the applicationContext"


        then: "Bean retrieved from the ApplicationContext should not be null"
        Repository beanRetrievedByType = applicationContext.getBean(Repository.class);
        beanRetrievedByType != null;
    }
}  
