package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification{

    def "Testing getQuantity() "(){
        setup :
         Order order = new Order()
        order.setQuantity(5)
        when :
         int quantity = order.getQuantity()
        then :
        quantity==5
    }

    def "Testing setQuantity() "(){
        setup :
        Order order = new Order()
        when :
        Order order1 = order.setQuantity(5)
        then :
        order1.getQuantity()==5
    }

    def "Testing getItemName() "(){
        setup :
        Order order = new Order()
        order.setItemName("Item1")
        when :
        String s = order.getItemName()
        then :
        s.equals("Item1")
    }

    def "Testing setItemName() "(){
        setup :
        Order order = new Order()
        when :
        Order order1 = order.setItemName("Item1")
        then :
        order1.getItemName().equals("Item1")
    }

    def "Testing getPrice() "(){
        setup :
        Order order = new Order()
        order.setPrice(45.0d)
        when :
        double price = order.getPrice()
        then :
        price==45.0d
    }

    def "Testing setPrice() "(){
        setup :
        Order order = new Order()
        when :
        Order order1 = order.setPrice(5.0d)
        then :
        order1.getPrice()==5.0d
    }
    def "Testing getPriceWithTex() "(){
        setup :
        Order order = new Order()
        order.setPriceWithTex(4.0d)
        when :
        double price = order.getPriceWithTex()
        then :
        price==4.0d
    }

    def "Testing setPriceWithTex() "(){
        setup :
        Order order = new Order()
        when :
        Order order1 = order.setPriceWithTex(5.0d)
        then :
        order1.getPriceWithTex()==5.0d
    }
}
