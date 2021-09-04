package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cosmetics cream = new Cosmetics(Brand.GIVENCHY,"Paris", "France",
                "Крем RESSOURCE", new ProdAndExpDate(12.20,04.23));
        System.out.println(cream.getInfo());
        cream.setThePrice(3200);

        System.out.println("-----------------------------------------------------");


        Perfume n5 = new Perfume(Brand.CHANEL,"Paris","France", "Парфюм №5",
                new ProdAndExpDate(10.19,3.22),Scent.JASMINE,100);
        System.out.println(n5.getInfo());
        n5.setThePrice(10500);
        n5.setThePrice(120,15,350);


        System.out.println("-----------------------------------------------------------");


        Perfume eauDeParfum = new Perfume(Brand.GUCCI,"Rome","Italy", "Парфюм EAU DE PARFUM 2",
                new ProdAndExpDate(2.21,8.25),Scent.ROSE,70);
        System.out.println(eauDeParfum.getInfo());
        n5.setThePrice(12500);
        n5.setThePrice(135,20,450);
    }
}
