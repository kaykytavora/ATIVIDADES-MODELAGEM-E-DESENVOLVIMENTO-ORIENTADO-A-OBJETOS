import java.util.ArrayList;

// AlunoPlanoFamilia é o titular de um plano família, que pode ter vários dependentes.
public class AlunoPlanoFamilia extends Aluno {
    private ArrayList<Aluno> dependentes;
    private static final double VALOR_POR_DEPENDENTE = 50.0;

    public AlunoPlanoFamilia(String nome, String documento, String telefone, Plano plano) {
        super(nome, documento, telefone, plano);
        this.dependentes = new ArrayList<>();
    }

    public int getNumeroDependentes() {
        return dependentes.size();
    }

    public ArrayList<Aluno> getDependentes() {
        return dependentes;
    }

    public void adicionarDependente(Aluno dependente) {
        dependentes.add(dependente);
    }

    // Mensalidade = valor base do plano + um valor fixo por dependente.
    @Override
    public double calcularMensalidade() {
        double total = getPlano().getValorBase();
        total = total + (dependentes.size() * VALOR_POR_DEPENDENTE);
        return total;
    }
}
