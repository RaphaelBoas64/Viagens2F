import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Turista mochileiro = new Turista("Lucas");
        Turista mochileira = new Turista();

        Validacao validacao = new Validacao();
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileiro.setNome("Namor");
        mochileira.setCpf("456");

        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null,retorno);

    }
}
