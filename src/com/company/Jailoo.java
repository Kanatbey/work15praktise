package com.company;

public class Jailoo {
    private String name;
    private String adress;
    private String owner;
    private At[] attar;
    private Uyi[] uyilar;
    private Koyi[] koilor;

    public Jailoo(String name,String adress, String owner,Koyi[] koilor, Uyi[] uyilar, At[] attar ) {
        this.name = name;
        this.adress = adress;
        this.owner = owner;
        this.koilor = koilor;
        this.uyilar = uyilar;
        this.attar = attar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setAttar(At[] attar) {
        this.attar = attar;
    }

    public At[] getAttar() {
        return attar;
    }

    public void setUilar(Uyi[] uilar) {
        this.uyilar = uilar;
    }

    public Uyi[] getUilar() {
        return uyilar;
    }

    public void setKoilor(Koyi[] koilor) {
        this.koilor = koilor;
    }

    public Koyi[] getKoilor() {
        return koilor;
    }

}
