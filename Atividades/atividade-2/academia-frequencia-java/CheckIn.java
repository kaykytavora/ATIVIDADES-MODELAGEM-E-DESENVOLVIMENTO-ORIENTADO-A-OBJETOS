// CheckIn representa a tentativa de entrada de um aluno na academia.
public class CheckIn {
    private boolean autorizado;

    public CheckIn(Aluno aluno) {
        this.autorizado = aluno.getPlano().estaAtivo();
    }

    public boolean isAutorizado() {
        return autorizado;
    }
}
