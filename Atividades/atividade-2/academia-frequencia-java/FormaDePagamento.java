// Interface: qualquer forma de pagamento precisa saber processar um pagamento.
public interface FormaDePagamento {
    boolean processarPagamento(double valor);
}
