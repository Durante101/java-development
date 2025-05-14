package com.pluralsight;

public class Asset {
    private String description;
    private String dateAcquired;
    private double original;

    public Asset(String description, String dateAcquired, double original) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.original = original;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginal() {
        return original;
    }

    public void setOriginal(double original) {
        this.original = original;
    }

    public double getValue() {
        return original;
    }
}

