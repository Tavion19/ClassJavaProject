package com.binary.day1;

public class Table {
    String color;
    double height;
    double width;
    double length;
    String size;


    // updating we call is setting
    // receiving a value - we call it getting

    public void setColor(String inputColor){
        color = inputColor;
    }

    public String getColor(){
        return color;
    }

    public void setHeight(int inputHeight){
        height = inputHeight;


    }
    public double getHeight(){
        return height;
    }

    public void setWidth(int inputWidth){
        width = inputWidth;
    }
    public double getWidth(){
        return width;
    }

    public void setLength(int inputLength){
        length = inputLength;
    }
    public double getLength(){
        return length;
    }

}
