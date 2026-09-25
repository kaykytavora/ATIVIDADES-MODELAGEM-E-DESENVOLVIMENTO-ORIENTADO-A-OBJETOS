// Aluno é uma classe abstrata: representa qualquer aluno da academia.
// Cada tipo de aluno (individual ou família) calcula a mensalidade do seu jeito.
public abstract class Aluno {
    private String nome;
    private String documento;
    private String telefone;
    private Plano plano;

    public Aluno(String nome, String documento, String telefone, Plano plano) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public Plano getPlano() {
        return plano;
    }

    // Método abstrato: cada subclasse implementa do seu jeito (polimorfismo).
    public abstract double calcularMensalidade();
}
