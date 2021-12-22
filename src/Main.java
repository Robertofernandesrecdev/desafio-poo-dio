import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(12);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp(); // estanciar o bootcamp
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Roberto" + devRoberto.getConteudosInscritos());
        devRoberto.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Roberto" + devRoberto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Roberto" + devRoberto.getConteudosConcluidos());
        System.out.println("XP: " + devRoberto.calcularTotalXp());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos  João" + devRoberto.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos  João" + devRoberto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos  João" + devRoberto.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
