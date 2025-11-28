// Esta clase esta servindo como um molde para as categorias de motorista
// Aprincipal ocorrencia de polimorfismo ocorre na classe empresaTransporte

public abstract class Motorista {

    protected String nome;
    protected int numCorridas;
    protected double totalArrecadado;

    public Motorista(String nome, int numCorridas, double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
        this.nome = nome;
        this.numCorridas = numCorridas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumCorridas() {
        return numCorridas;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumCorridas(int numCorridas) {
        this.numCorridas = numCorridas;
    }

    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }

    public abstract String toString();

    public abstract double calcularPagamento();
}


