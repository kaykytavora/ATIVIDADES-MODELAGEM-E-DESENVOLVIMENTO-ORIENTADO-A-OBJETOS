// Main é onde o programa começa a rodar e mostramos o sistema funcionando.
public class Main {
    public static void main(String[] args) {

        // Criando os planos
        Plano planoIndividual = new Plano(100.0);
        Plano planoFamilia = new Plano(150.0);

        // Criando os alunos
        AlunoIndividual joao = new AlunoIndividual("João Silva", "111.111.111-11", "11999990000", planoIndividual);

        AlunoPlanoFamilia maria = new AlunoPlanoFamilia("Maria Souza", "222.222.222-22", "11988880000", planoFamilia);
        AlunoIndividual filho1 = new AlunoIndividual("Pedro Souza", "333.333.333-33", null, planoFamilia);
        AlunoIndividual filho2 = new AlunoIndividual("Ana Souza", "444.444.444-44", null, planoFamilia);
        maria.adicionarDependente(filho1);
        maria.adicionarDependente(filho2);

        System.out.println("Mensalidade do João: R$" + joao.calcularMensalidade());
        System.out.println("Mensalidade da Maria (" + maria.getNumeroDependentes() + " dependentes): R$" + maria.calcularMensalidade());

        // Pagando e renovando os planos
        FormaDePagamento cartao = new CartaoRecorrente("1234567890123456");
        FormaDePagamento pix = new Pix("joao@email.com");

        planoIndividual.renovar(cartao);
        planoFamilia.renovar(pix);

        System.out.println("Plano do João está ativo? " + planoIndividual.estaAtivo());
        System.out.println("Mensalidades geradas para o plano do João: " + planoIndividual.getMensalidades().size());

        // Testando a catraca
        Catraca catracaEntrada = new Catraca("CATRACA-01");
        catracaEntrada.registrarCheckIn(joao);
        catracaEntrada.registrarCheckIn(maria);

        // Simulando um plano vencido
        planoIndividual.marcarVencido();
        System.out.println("Plano do João está ativo após vencer? " + planoIndividual.estaAtivo());
        catracaEntrada.registrarCheckIn(joao); // agora deve ser negado
    }
}
