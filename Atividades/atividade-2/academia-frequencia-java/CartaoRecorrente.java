// Forma de pagamento por cartão de crédito.
public class CartaoRecorrente implements FormaDePagamento {
    private String numeroCartao;

    public CartaoRecorrente(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Cobrando R$" + valor + " no cartão " + numeroCartao);
        return true; // aqui estamos simulando que o pagamento sempre é aprovado
    }
}
