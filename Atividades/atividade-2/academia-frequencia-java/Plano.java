import java.util.ArrayList;

// Plano é o plano de assinatura de um Aluno.
public class Plano {
    private double valorBase;
    private StatusPlano status;
    private ArrayList<Mensalidade> mensalidades;

    public Plano(double valorBase) {
        this.valorBase = valorBase;
        this.status = StatusPlano.ATIVO;
        this.mensalidades = new ArrayList<>();
    }

    public double getValorBase() {
        return valorBase;
    }

    public StatusPlano getStatus() {
        return status;
    }

    public ArrayList<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    // Gera uma nova mensalidade e tenta pagar com a forma de pagamento informada.
    public boolean renovar(FormaDePagamento pagamento) {
        Mensalidade mensalidade = new Mensalidade(valorBase);
        boolean pago = mensalidade.registrarPagamento(pagamento);

        if (pago) {
            mensalidades.add(mensalidade);
            status = StatusPlano.ATIVO;
        }
        return pago;
    }

    public void marcarVencido() {
        status = StatusPlano.VENCIDO;
    }

    public void cancelar() {
        status = StatusPlano.CANCELADO;
    }

    // O plano só está ativo se o status for ATIVO.
    public boolean estaAtivo() {
        return status == StatusPlano.ATIVO;
    }
}
