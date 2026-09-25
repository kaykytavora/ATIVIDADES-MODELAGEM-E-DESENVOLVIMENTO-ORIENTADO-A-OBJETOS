// Mensalidade é uma cobrança gerada pelo Plano.
public class Mensalidade {
    private double valor;
    private boolean paga;

    public Mensalidade(double valor) {
        this.valor = valor;
        this.paga = false;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPaga() {
        return paga;
    }

    // Tenta pagar a mensalidade usando a forma de pagamento escolhida.
    public boolean registrarPagamento(FormaDePagamento formaDePagamento) {
        boolean aprovado = formaDePagamento.processarPagamento(valor);
        if (aprovado) {
            paga = true;
        }
        return aprovado;
    }
}
