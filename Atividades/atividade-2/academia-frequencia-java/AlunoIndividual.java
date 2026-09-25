// AlunoIndividual paga apenas o valor base do plano.
public class AlunoIndividual extends Aluno {

    public AlunoIndividual(String nome, String documento, String telefone, Plano plano) {
        super(nome, documento, telefone, plano);
    }

    @Override
    public double calcularMensalidade() {
        return getPlano().getValorBase();
    }
}
