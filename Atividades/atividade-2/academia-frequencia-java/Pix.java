// Forma de pagamento por Pix.
public class Pix implements FormaDePagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Gerando cobrança Pix de R$" + valor + " para a chave " + chavePix);
        return true; // aqui estamos simulando que o pagamento sempre é aprovado
    }
}
