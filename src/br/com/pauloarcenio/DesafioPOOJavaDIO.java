package br.com.pauloarcenio;

import java.time.LocalDate;

public class DesafioPOOJavaDIO {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev Junior");
        bootcamp.setDescricao("Descricao Bootcamp Dio Java Dev Junior");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());
        devPaulo.progredir();
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

        System.out.println("------------------------------");
        
        Dev devArcenio = new Dev();
        devArcenio.setNome("Arcenio");
        devArcenio.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arcenio: " + devArcenio.getConteudosInscritos());
        System.out.println("XP: "+ devArcenio.calcularTotalXp());
        devArcenio.progredir();
        devArcenio.progredir();
        devArcenio.progredir();
        System.out.println("Conteúdos Inscritos Arcenio: " + devArcenio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Arcenio: " + devArcenio.getConteudosConcluidos());
        System.out.println("XP: "+ devArcenio.calcularTotalXp());

    }

}
