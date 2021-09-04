package com.company;

public class Cosmetics extends Manufacture{
    private String name;
    private ProdAndExpDate prodAndExpDate;

    public Cosmetics(Brand brand, String city, String country, String name, ProdAndExpDate prodAndExpDate) {
        super(brand, city, country);
        this.name = name;
        this.prodAndExpDate = prodAndExpDate;
    }

    public String getName() {
        return name;
    }

    public ProdAndExpDate getProdAndExpDate() {
        return prodAndExpDate;
    }

    public String getInfo(){
        return "\nНазвание: " + getName() + "\nПроизводитель: " + getBrand() + " "
                + getCity() + " " + getCountry() + "\nДата приозводства: " + getProdAndExpDate().getProductionDate() +
                "\nГоден до: " + getProdAndExpDate().getExpirationDate();
    }

    public final void setThePrice(int price){
        System.out.println("Цена за упаковку: " + price);;
    }

    public void setThePrice(int pricePerMl, int volume, int atomizerPrice){
        System.out.println("Цена за мл: " + pricePerMl + ", Объем:" +
                volume + ", Цена атомайзера: " + atomizerPrice);
    }
}
