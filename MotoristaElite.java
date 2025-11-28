public class MotoristaElite extends MotoristaExperiente {

    private int numCorridasPremium;

    public MotoristaElite(String nome, int numCorridas, double totalArrecadado, double notaMedia,
            int numCorridasPremium) {
        super(nome, numCorridas, totalArrecadado, notaMedia);
        this.numCorridasPremium = numCorridasPremium;
    }

    public int getNumCorridasPremium() {
        return numCorridasPremium;
    }

    public void setNumCorridasPremium(int numCorridasPremium) {
        this.numCorridasPremium = numCorridasPremium;
    }

    public String toString() {
        return "nome: " + nome + "\nnumerro de corridas: " + numCorridas + "\narrecadamento total: " + totalArrecadado
                + "\nnota: " + notaMedia + "\ncorridas premium: " + numCorridasPremium;
    }

    public double calcularPagamento() {
        double pagamento = totalArrecadado * 0.80;
        if (notaMedia > 4.6) {
            pagamento *= 1.05;
        }
        pagamento += numCorridasPremium * 5;
        return pagamento;
    }
}
