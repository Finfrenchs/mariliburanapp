package com.project.mariliburancom._model;

public class ModelTransport {

    private int image;
    private String carsName, typeTransmisi, priceRent, include, seeDetil;

    public ModelTransport(int image, String carsName, String typeTransmisi, String priceRent, String include, String seeDetil) {
        this.image = image;
        this.carsName = carsName;
        this.typeTransmisi = typeTransmisi;
        this.priceRent = priceRent;
        this.include = include;
        this.seeDetil = seeDetil;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCarsName() {
        return carsName;
    }

    public void setCarsName(String carsName) {
        this.carsName = carsName;
    }

    public String getTypeTransmisi() {
        return typeTransmisi;
    }

    public void setTypeTransmisi(String typeTransmisi) {
        this.typeTransmisi = typeTransmisi;
    }

    public String getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(String priceRent) {
        this.priceRent = priceRent;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getSeeDetil() {
        return seeDetil;
    }

    public void setSeeDetil(String seeDetil) {
        this.seeDetil = seeDetil;
    }
}
