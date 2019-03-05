package com.ttnd.extra.DesignPatterns;

interface Polygon{
    void getPolygon();
}
class Triangle implements Polygon{
    @Override
    public void getPolygon() {
        System.out.println("This class will give a Triangle.");

    }
}
class Square implements Polygon{
    @Override
    public void getPolygon() {
        System.out.println("This class will give a Square.");
    }
}
class Rectangle implements Polygon{
    @Override
    public void getPolygon() {
        System.out.println("This class will give a Rectangle.");
    }
}
class PreparePolygon{
    Polygon polygon;
    public Polygon getPolygonShape(){
        return this.polygon;
    }
    public void setPolygonShape(Polygon polygon){
        this.polygon = polygon;
    }
}
class PolygonFactory{
    static PreparePolygon getPolygonObject(String name){
        PreparePolygon preparePolygon = new PreparePolygon();
        if(name.equals("Triangle")){
            preparePolygon.setPolygonShape(new Triangle());
        }
        else if(name.equals("Square")){
            preparePolygon.setPolygonShape(new Square());
        }
        else{
            preparePolygon.setPolygonShape(new Rectangle());
        }
        return preparePolygon;
    }
}

public class Q2 {
    public static void main(String[] args) {
        PreparePolygon prepareTriangle = PolygonFactory.getPolygonObject("Triangle");
        prepareTriangle.getPolygonShape().getPolygon();
        PreparePolygon prepareSquare = PolygonFactory.getPolygonObject("Square");
        prepareSquare.getPolygonShape().getPolygon();
        PreparePolygon prepareRectangle = PolygonFactory.getPolygonObject("Rectangle");
        prepareRectangle.getPolygonShape().getPolygon();
    }
}