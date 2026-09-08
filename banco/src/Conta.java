package banco.src;
import java.time.LocalDate;

public class Conta {
    private double saldo;
    private String numero;
    private String senha;
    private Transacao[] historico;

    public boolean efetuarSaque(double valor){
        return true;
    }

    public boolean efetuarDeposito(double valor){
        return true;
    }

    public boolean efetuarPagamento(double valor, String boleto){
        return true;
    }

    public Transacao[] extrato(LocalDate inicio, LocalDate fim) {
        return historico;
    }
}
