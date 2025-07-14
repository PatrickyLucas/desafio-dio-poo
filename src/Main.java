import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criando Cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Básico");
        cursoJava.setDescricao("Aprenda os fundamentos da linguagem Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoPOO = new Curso();
        cursoPOO.setTitulo("Programação Orientada a Objetos");
        cursoPOO.setDescricao("POO com Java na prática");
        cursoPOO.setCargaHoraria(10);

        // Criando Mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria: Boas práticas em Java");
        mentoriaJava.setDescricao("Discussão ao vivo com especialista");
        mentoriaJava.setData(LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo com foco em backend Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPOO);
        bootcamp.getConteudos().add(mentoriaJava);

        // Criando Dev 1
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\n📘 João - Conteúdos Inscritos: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        System.out.println("✅ João - Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("📗 João - Conteúdos Restantes: " + devJoao.getConteudosInscritos());
        System.out.println("🏅 João - XP Total: " + devJoao.calcularTotalXp());

        // Criando Dev 2
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("\n📘 Maria - Conteúdos Inscritos: " + devMaria.getConteudosInscritos());

        devMaria.progredir(); // conclui 1
        System.out.println("✅ Maria - Conteúdos Concluídos: " + devMaria.getConteudosConcluidos());
        System.out.println("📗 Maria - Conteúdos Restantes: " + devMaria.getConteudosInscritos());
        System.out.println("🏅 Maria - XP Total: " + devMaria.calcularTotalXp());

        // Tentando progredir sem conteúdos
        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.progredir(); // Não está inscrito
    }

}
