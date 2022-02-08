package com.company;

public class Main {

    public static void main(String[] args) {

        Uyi uyi1 = new Uyi("text", 5, 143.34);
        Uyi uyi2 = new Uyi("text", 3, 123.34);
        Uyi uyi3 = new Uyi("text", 4, 133.34);
        Uyi uyi4 = new Uyi("text", 3, 92.34);
        Uyi uyi5 = new Uyi("text", 2, 134.34);

        Koyi koi1 = new Koyi("text", 4, 22.34);
        Koyi koi2 = new Koyi("text", 3, 33.4);
        Koyi koi3 = new Koyi("text", 1, 32.5);
        Koyi koi4 = new Koyi("text", 3, 34.0);
        Koyi koi5 = new Koyi("text", 2, 23.34);
        Koyi koi6 = new Koyi("text", 1, 16.34);
        Koyi koi7 = new Koyi("text", 4, 34.34);
        Koyi koi8 = new Koyi("text", 3, 61.34);

        At at1 = new At("text", 2, 234.5);
        At at2 = new At("text", 1, 424.0);
        At at3 = new At("text", 5, 424.0);
        At at4 = new At("text", 4, 424.0);
        At at5 = new At("text", 6, 424.0);

        Jailoo jailoo1 = new Jailoo("Nazvanie fermy : fazenda ", " adress: vostok-5 ",
                " vladeles: Aizhan", new Koyi[]{koi1, koi2, koi3, koi4, koi5, koi6, koi7, koi8},
                new Uyi[]{uyi1, uyi2, uyi3, uyi4, uyi5}, new At[]{at1, at2});
        System.out.print("\n" + jailoo1.getName() + jailoo1.getAdress() + jailoo1.getOwner() + "\nNa ferme : " +
                jailoo1.getKoilor().length + " koi " + jailoo1.getUilar().length + " ui " +
                jailoo1.getAttar().length + " at\nKoilor :\n");

        for (Koyi b : jailoo1.getKoilor()) {
            System.out.println(b.getAge() + "  " + b.getName() + "  " + b.getWeight());
        }

        System.out.println("Uilar :  ");
        for (Uyi b : jailoo1.getUilar()) {
            System.out.println(b.getAge() + "  " + b.getName() + "  " + b.getWeight());
        }

        System.out.println("Attar :  ");
        for (At b : jailoo1.getAttar()) {
            System.out.println(b.getAge() + "  " + b.getName() + "  " + b.getWeight());
        }

        Jailoo jailoo2 = new Jailoo("Nazvanie fermy : mazenda ", " adress: tes ",
                " vladeles: Akim", new Koyi[]{koi1, koi2, koi3, koi4}, new Uyi[]{uyi1, uyi2},
                new At[]{at1, at2, at3, at4, at5});

        System.out.print(jailoo2.getName() + jailoo2.getAdress() + jailoo2.getOwner() + "\nNa ferme : " +
                jailoo2.getKoilor().length + " koi " + jailoo2.getUilar().length + " ui " +
                jailoo2.getAttar().length + " at");

        for (Koyi b : jailoo2.getKoilor()) {
            System.out.println(b.getAge() + "  " + b.getName() + "  " + b.getWeight());
        }

        System.out.println("Uilar :  ");
        for (Uyi b : jailoo2.getUilar()) {
            System.out.println(b.getAge() + "  " + b.getName() + "  " + b.getWeight());
        }

        System.out.println("Attar :  ");
        for (At b : jailoo2.getAttar()) {
            System.out.println(b.getAge() + "  " + b.getName() + "  " + b.getWeight());
        }
    }
}
