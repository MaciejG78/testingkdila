package com.example;

import java.util.List;

public class Dom {
    Double wysokosc;
    Integer iloscPomieszczen;

    List<Okno> listaOkien;

    List<Okno> listaOkienDachowych;

    public Dom(Double wysokosc, Integer iloscPomieszczen) {
        this.wysokosc = wysokosc;
        this.iloscPomieszczen = iloscPomieszczen;
    }

    public Dom(Double wysokosc, Integer iloscPomieszczen, List<Okno> listaOkien, List<Okno> listaOkienDachowych) {
        this.wysokosc = wysokosc;
        this.iloscPomieszczen = iloscPomieszczen;
        this.listaOkien = listaOkien;
        this.listaOkienDachowych = listaOkienDachowych;
    }

    public String paint(String kolor) {
        return "Pomalowano dom na :" + kolor;
    }

    public Integer rozbudujDom(Integer nowaIlosPomieszczen) {
        this.iloscPomieszczen = this.iloscPomieszczen + nowaIlosPomieszczen;;
        return this.iloscPomieszczen;
    }
}
