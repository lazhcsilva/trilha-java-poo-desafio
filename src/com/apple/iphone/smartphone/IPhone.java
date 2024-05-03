package com.apple.iphone.smartphone;

import com.apple.iphone.reprodutor.ReprodutorMusical;
import com.apple.iphone.telefone.AparelhoTelefonico;
import com.apple.iphone.web.NavegadorInternet;

public class IPhone {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public IPhone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico,
                  NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void ligar() {
        reprodutorMusical.pausar();
        aparelhoTelefonico.ligar();
    }

    public void atender() {
        reprodutorMusical.pausar();
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        reprodutorMusical.pausar();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void exibirPagina(String pagina) {
        navegadorInternet.exibirPagina(pagina);
    }

    public void atualizarPagina(String pagina) {
        navegadorInternet.atualizarPagina(pagina);
    }

    public void adicionarNovaAba(String pagina) {
        navegadorInternet.adicionarNovaAba(pagina);
    }

    public void tocar() {
        reprodutorMusical.tocar();
    }

    public void pausar() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }

}
