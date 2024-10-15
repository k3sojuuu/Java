package com.example.javademo.PrimitiveAndObject.Primitive;

public class EntityPrimitive {
    private int NumberInt;//    32byte
    private short NumberShort;//    16byte
    private byte NumberByte;//    8byte
    private long NumberLong ;//64byte
    private float NumberFloat;//32byte
    private double NumberDouble;//64byte
    private boolean Status;//
    private char Char;//16byte

    public EntityPrimitive() {
    }

    public EntityPrimitive(int numberInt, short numberShort, byte numberByte, long numberLong, float numberFloat, double numberDouble, boolean status, char aChar) {
        NumberInt = numberInt;
        NumberShort = numberShort;
        NumberByte = numberByte;
        NumberLong = numberLong;
        NumberFloat = numberFloat;
        NumberDouble = numberDouble;
        Status = status;
        Char = aChar;
    }

    public int getNumberInt() {
        return NumberInt;
    }

    public void setNumberInt(int numberInt) {
        NumberInt = numberInt;
    }

    public short getNumberShort() {
        return NumberShort;
    }

    public void setNumberShort(short numberShort) {
        NumberShort = numberShort;
    }

    public byte getNumberByte() {
        return NumberByte;
    }

    public void setNumberByte(byte numberByte) {
        NumberByte = numberByte;
    }

    public long getNumberLong() {
        return NumberLong;
    }

    public void setNumberLong(long numberLong) {
        NumberLong = numberLong;
    }

    public float getNumberFloat() {
        return NumberFloat;
    }

    public void setNumberFloat(float numberFloat) {
        NumberFloat = numberFloat;
    }

    public double getNumberDouble() {
        return NumberDouble;
    }

    public void setNumberDouble(double numberDouble) {
        NumberDouble = numberDouble;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public char getChar() {
        return Char;
    }

    public void setChar(char aChar) {
        Char = aChar;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "NumberInt=" + NumberInt +
                ", NumberShort=" + NumberShort +
                ", NumberByte=" + NumberByte +
                ", NumberLong=" + NumberLong +
                ", NumberFloat=" + NumberFloat +
                ", NumberDouble=" + NumberDouble +
                ", Status=" + Status +
                ", Char=" + Char +
                '}';
    }
}
