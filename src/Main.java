import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução ao Git e GitHub");
        curso1.setDescricao("Aprendendo a usar o Git e o GitHub.");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Dominando IDEs Java");
        curso2.setDescricao("Instalação e utilização das principais IDEs utilizadas.");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Aula Inaugural");
        mentoria1.setDescricao("Boas vindas ao Santander Code Girls.");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(" ");
        System.out.println(curso2);
        System.out.println(" ");
        System.out.println(mentoria1);


    }
}
