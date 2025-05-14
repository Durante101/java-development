package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condion;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double original, String address, int condion, int squareFoot, int lotSize) {
        super(description, dateAcquired, original);
        this.address = address;
        this.condion = condion;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondion() {
        return condion;
    }

    public void setCondion(int condion) {
        this.condion = condion;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}

