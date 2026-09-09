import java.time.LocalDate;

public class Aluno {
    long id;
    LocalDate nasc;
    String ra;
    String nome;

    // Construtor
    public Aluno(long id, LocalDate nasc, String ra, String nome) {
        this.id = id;
        this.nasc = nasc;
        this.ra = ra;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID do Aluno: " + id +
               "\nNome: " + nome +
               "\nRA: " + ra +
               "\nData de nascimento: " + nasc;
    }
}