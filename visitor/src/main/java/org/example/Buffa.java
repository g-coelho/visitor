package org.example;

public class Buffa implements Opera{
    private String titulo;
    private String autor;
    private String idioma;
    private int numeroPapeis;

    public Buffa(String titulo, String autor, String idioma, int numeroPapeis) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.numeroPapeis = numeroPapeis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumeroPapeis() {
        return numeroPapeis;
    }

    public void setNumeroPapeis(int numeroPapeis) {
        this.numeroPapeis = numeroPapeis;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirBuffa(this);
    }
}
