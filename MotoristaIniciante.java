public class MotoristaIniciante extends Motorista {

    public MotoristaIniciante(String nome, int numCorridas, double totalArrecadado) {
        super(nome, numCorridas, totalArrecadado);
    }

    public String toString() {
        return "nome: " + nome + "\nnumerro de corridas: " + numCorridas + "\narrecadamento total: " + totalArrecadado;
    }

    public double calcularPagamento() {
        return totalArrecadado * 0.70;
    }
    /*
     * Uma empresa de transporte por aplicativo deseja gerenciar seus motoristas. Os
     * motoristas podem ser de três categorias: Iniciante, que recebe 70% do valor
     * da corrida; Experiente, que recebe 75% do valor da corrida e tem bônus de 5%
     * por média da avaliação maior que 4.6; e Elite, que recebe 80% do valor da
     * corrida, tem bônus de 5% por avaliação maior que 4.6 e R$ 5,00 por cada
     * corrida premium que realizou.
     */
}
