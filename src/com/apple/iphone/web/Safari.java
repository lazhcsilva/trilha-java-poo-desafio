package com.apple.iphone.web;

public class Safari implements NavegadorInternet{
    @Override
    public void exibirPagina(String pagina) {
        System.out.printf("Exibindo página no Safari %s%n", pagina);
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        System.out.printf("Adicionando nova aba no Safari %s%n", pagina);
    }

    @Override
    public void atualizarPagina(String pagina) {
        System.out.printf("Atualizando página no Safari %S%n", pagina);
    }
}
