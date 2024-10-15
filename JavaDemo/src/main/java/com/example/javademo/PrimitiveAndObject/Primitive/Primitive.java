package com.example.javademo.PrimitiveAndObject.Primitive;

public class Primitive {
    public void Print(){
        EntityPrimitive entity = new EntityPrimitive();
        entity.setNumberInt(1);
        entity.setNumberByte((byte) 2);
        entity.setNumberLong(3);
        entity.setNumberShort((short) 4);
        entity.setNumberFloat(2);
        entity.setNumberDouble(2);
        entity.setChar('a');
        System.out.printf(entity.toString());
    }
    public static void main(String[] args) {
        Primitive primitive = new Primitive();
        primitive.Print();
    }
}
