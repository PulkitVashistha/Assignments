package demo.service

import demo.domain.Order
import spock.lang.Specification

import javax.management.relation.RoleInfo

class EmailServiceSpec extends Specification{

    def "Testing sendEmail(Order)"(){
        setup:
        EmailService emailService = new EmailService()
        Order order = new Order()
        when:
        emailService.sendEmail(order)
        then:
        thrown(RuntimeException)
    }

    def "Testing sendEmail(Order,String)"(){
        setup:
        EmailService emailService = new EmailService()
        Order order = new Order()
        when:
        Boolean b = emailService.sendEmail(order,"jfb")
        then:
        b
    }

}
