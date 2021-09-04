package com.company;

public final class Perfume extends Cosmetics{
    private Scent scent;
    private int volume;

    public Perfume(Brand brand, String city, String country,
                   String name, ProdAndExpDate prodAndExpDate, Scent scent, int volume) {
        super(brand, city, country, name, prodAndExpDate);
        this.scent = scent;
        this.volume = volume;
    }

    public Scent getScent() {
        return scent;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nАромат: " + scent + "\nОбъем: " + volume;
    }

    @Override
    public void setThePrice(int pricePerMl, int volume, int atomizerPrice) {
        super.setThePrice(pricePerMl, volume,atomizerPrice);
        System.out.println("Сумма: " + ((pricePerMl * volume) + atomizerPrice));
    }
}
