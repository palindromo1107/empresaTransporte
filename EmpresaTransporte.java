public class EmpresaTransporte {

    private Motorista[] motoristas = new Motorista[10];
    private int pos = 0;

    public void cadastrarMotorista(Motorista motorista) {
        if (pos < 10) {
            motoristas[pos] = motorista;
            pos++;
        } else {
            System.out.println("numeros maximo de motoristas atingido");
        }
    }

    public Motorista pesquisarMotoristaPeloNome(String nome) {
        for (Motorista motorista : motoristas) {
            if (motorista.getNome().equals(nome)) {
                return motorista;
            }
        }
        return null;
    }

    public void excluirMotoristaPeloNome(String nome) {
        for (int i = 0; i < motoristas.length; i++) {
            if (motoristas[i].getNome().equals(nome)) {
                for (int j = i; j < motoristas.length - 1; j++) {
                    motoristas[j] = motoristas[j + 1];
                }
                motoristas[motoristas.length - 1] = null;
                break;
            }
        }
    }

    public double calcularPagamentoTotal() {
        double total = 0;
        for (Motorista motorista : motoristas) {
            total += motorista.calcularPagamento();
        }
        return total;
    }

    public void gerarRelatorioMotoristas() {
        for (Motorista motorista : motoristas) {
            if (motorista != null) {
                System.out.println(motorista.toString());
                System.out.println("pagamento: R$ " + motorista.calcularPagamento() + "\n");
            }
        }
    }
}