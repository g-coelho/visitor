package org.example;

public class OperaVisitor implements Visitor{

    public String exibir(Opera opera){
        return opera.aceitar(this);
    }

    @Override
    public String exibirBuffa(Buffa buffa) {
        return "Buffa{" +
                "Titulo: " + buffa.getTitulo() +
                ", Autor: '" + buffa.getAutor() + '\'' +
                ", Idioma: " + buffa.getIdioma() +
                ", Papeis: " + buffa.getNumeroPapeis() +
                '}';
    }

    @Override
    public String exibirComique(Comique comique) {
        return "Comique{" +
                "Titulo: " + comique.getTitulo() +
                ", Autor: '" + comique.getAutor() + '\'' +
                ", Idioma: " + comique.getIdioma() +
                ", Papeis: " + comique .getNumeroPapeis() +
                '}';
    }

    @Override
    public String exibirVerismo(Verismo verismo) {
        return "Verismo{" +
                "Titulo: " + verismo.getTitulo() +
                ", Autor: '" + verismo.getAutor() + '\'' +
                ", Idioma: " + verismo.getIdioma() +
                ", Papeis: " + verismo .getNumeroPapeis() +
                '}';
    }
}
