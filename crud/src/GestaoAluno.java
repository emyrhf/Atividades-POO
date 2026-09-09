import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAluno {

    private Aluno[] alunos = new Aluno[50];
    private int indice = 0;

    public void criar(long id, String Snasc, String ra, String nome) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nasc = LocalDate.parse(Snasc, formatador);

        alunos[indice] = new Aluno(id, nasc, ra, nome);
        indice++;

        System.out.println("Aluno registrado com sucesso!");
    }

    public void atualizar(String raAtualizar, Scanner scan) {

        for (int i = 0; i < 50; i++) {

            if (alunos[i] != null && raAtualizar.equals(alunos[i].ra)) {
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                System.out.println("Atualize o nome do Aluno: ");
                String novoNome = scan.nextLine();

                alunos[i].nome = novoNome;

                System.out.println();

                System.out.println("Atualize a data de nascimento do Aluno: ");
                String novaData = scan.nextLine();

                LocalDate novoNasc = LocalDate.parse(novaData, formatador);

                alunos[i].nasc = novoNasc;

                System.out.println("Registro atualizado com sucesso!");

                return;
            }
        }

        System.out.println("Aluno não encontrado!");
    }

    public void excluir(String raDeletar) {

        for (int i = 0; i < 50; i++) {

            if (alunos[i] != null && raDeletar.equals(alunos[i].ra)) {

                alunos[i] = null;

                System.out.println("Aluno excluído com sucesso!");

                return;
            }
        }

        System.out.println("Aluno não encontrado!");
    }

    public void exibir() {

        for (int i = 0; i < 50; i++) {

            if (alunos[i] != null) {
                System.out.println(alunos[i]);
                System.out.println();
            }
        }
    }

    public void menu() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n --- MENU ---\n Digite uma das opções abaixo:\n C - Criar Aluno\n A - Atualizar Aluno\n E - Exibir Alunos\n R - Remover Aluno\n S - Sair");

            String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);

            switch (letra) {

                case 'C':
                    System.out.println("Digite o ID do Aluno: ");

                    long id = scan.nextLong();
                    scan.nextLine();

                    System.out.println("Digite a data de nascimento do Aluno no formato [dd/mm/aaaa]: ");
                    String data_nasc = scan.nextLine();

                    System.out.println("Digite o RA do Aluno: ");
                    String ra = scan.nextLine();

                    System.out.println("Digite o nome do Aluno: ");
                    String nome = scan.nextLine();

                    this.criar(id, data_nasc, ra, nome);

                    break;

                case 'A':

                    System.out.println("Digite o RA do Aluno que será atualizado: ");

                    String raAtualizar = scan.nextLine();

                    this.atualizar(raAtualizar, scan);

                    break;

                case 'E':

                    this.exibir();

                    break;

                case 'R':

                    System.out.println("Digite o RA do Aluno que será deletado: ");

                    String raDeletar = scan.nextLine();

                    this.excluir(raDeletar);

                    break;

                case 'S':

                    scan.close();
                    System.exit(0);

                default:

                    System.out.println("Opção inválida! Digite novamente");
            }
        }
    }
}
