import br.com.dio.deasfio.dominio.Curso;
import br.com.dio.deasfio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}