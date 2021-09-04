package com.company;

public class ProdAndExpDate {
    private double productionDate;
    private double expirationDate;

    public ProdAndExpDate(double productionDate, double expirationDate) {
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public double getProductionDate() {
        return productionDate;
    }

    public double getExpirationDate() {
        return expirationDate;
    }
}
