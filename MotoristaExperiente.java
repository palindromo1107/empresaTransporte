public class MotoristaExperiente extends Motorista {

    protected double notaMedia;

    public MotoristaExperiente(String nome, int numCorridas, double totalArrecadado, double notaMedia) {
        super(nome, numCorridas, totalArrecadado);
        this.notaMedia = notaMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String toString() {
        return "nome: " + nome + "\nnumerro de corridas: " + numCorridas + "\narrecadamento total: " + totalArrecadado
                + "\nnota: " + notaMedia;
    }

    public double calcularPagamento() {
        double pagamento = totalArrecadado * 0.75;
        if (notaMedia > 4.6) {
            return pagamento * 1.05;
        } else {
            return pagamento;
        }
    }
}