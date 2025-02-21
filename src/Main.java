import br.com.dio.deasfio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso2);
//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descricao Bootcamp java developer");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("luiz");
        devLuiz.inscreverBo0tcamp(bootcamp);
        System.out.println("conteudos luiz:"+ devLuiz.getConteudosIncritos());
        devLuiz.progredir();
        System.out.println("progrediu");
        System.out.println("conteudos luiz:"+ devLuiz.getConteudosConcluidos());
        System.out.println("conteudos luiz:"+ devLuiz.getConteudosIncritos());
        System.out.println("XP: "+devLuiz.calcularTotalXP());
        devLuiz.progredir();
        System.out.println("XP: "+devLuiz.calcularTotalXP());
        System.out.println();

        Dev devPedre = new Dev();
        devPedre.setNome("pedre");
        devPedre.inscreverBo0tcamp(bootcamp);
        System.out.println("conteudos pedre:"+ devPedre.getConteudosIncritos());
        devPedre.progredir();
        devPedre.progredir();
        devPedre.progredir();
        System.out.println("progrediu");
        System.out.println("conteudos pedre:"+ devPedre.getConteudosConcluidos());
        System.out.println("conteudos pedre:"+ devPedre.getConteudosIncritos());
        System.out.println("XP: "+devPedre.calcularTotalXP());
    }
}