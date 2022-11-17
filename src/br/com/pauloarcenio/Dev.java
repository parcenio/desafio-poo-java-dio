
package br.com.pauloarcenio;

public class Dev {
    
    private String nome;
    private Mentoria mentoria;
    private Curso curso;

    public Dev(String nome, Mentoria mentoria, Curso curso) {
        this.nome = nome;
        this.mentoria = mentoria;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mentoria getMentoria() {
        return mentoria;
    }

    public void setMentoria(Mentoria mentoria) {
        this.mentoria = mentoria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Dev{" + "nome=" + nome + ", mentoria=" + mentoria + ", curso=" + curso + '}';
    }
    
    private void inscrever(Curso curso, Mentoria mentoria){
        
    }
}
