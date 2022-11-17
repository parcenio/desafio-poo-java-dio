
package br.com.pauloarcenio;


public class Curso {
    private String descricao;
    private String titulo;
    private int cargaHoraria;

    public Curso(String descricao, String titulo, int cargaHoraria) {
        this.descricao = descricao;
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "descricao=" + descricao + ", titulo=" + titulo + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    
    
}
