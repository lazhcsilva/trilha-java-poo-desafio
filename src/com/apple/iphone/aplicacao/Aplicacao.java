package com.apple.iphone.aplicacao;

import com.apple.iphone.smartphone.IPhone;
import com.apple.iphone.reprodutor.IPod;
import com.apple.iphone.telefone.Telefone;
import com.apple.iphone.web.Chrome;
import com.apple.iphone.web.Safari;

public class Aplicacao {

    public static void main(String[] args) {
        IPhone iPhoneSafari = new IPhone(new IPod(), new Telefone(), new Safari());
        IPhone iPhoneChrome = new IPhone(new IPod(), new Telefone(), new Chrome());

        iPhoneSafari.selecionarMusica();

        iPhoneSafari.exibirPagina("https://www.google.com");
        iPhoneSafari.adicionarNovaAba("https://web.dio.me/home");

        iPhoneChrome.exibirPagina("https://www.google.com");
        iPhoneChrome.adicionarNovaAba("https://www.google.com");

        iPhoneSafari.atender();

    }

}
