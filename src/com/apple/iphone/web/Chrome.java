package com.apple.iphone.web;

public class Chrome implements NavegadorInternet{
    @Override
    public void exibirPagina(String pagina) {
        System.out.printf("Exibindo página no Chrome %s%n", pagina);
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        System.out.printf("Adiconando nova aba no Chrome %s%n", pagina);
    }

    @Override
    public void atualizarPagina(String pagina) {
        System.out.printf("Atualizando pagina no Chrome %s%n", pagina);
    }
}
