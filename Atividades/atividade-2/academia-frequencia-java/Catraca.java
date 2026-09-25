// Catraca é o equipamento que libera o acesso do aluno na academia.
public class Catraca {
    private String identificador;

    public Catraca(String identificador) {
        this.identificador = identificador;
    }

    public boolean liberarAcesso(Aluno aluno) {
        return aluno.getPlano().estaAtivo();
    }

    // Cria o check-in do aluno e mostra na tela se o acesso foi liberado ou não.
    public CheckIn registrarCheckIn(Aluno aluno) {
        CheckIn checkIn = new CheckIn(aluno);

        if (checkIn.isAutorizado()) {
            System.out.println("Catraca " + identificador + ": acesso liberado para " + aluno.getNome());
        } else {
            System.out.println("Catraca " + identificador + ": acesso NEGADO para " + aluno.getNome());
        }

        return checkIn;
    }
}
