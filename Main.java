public class Main {
    public static void main(String[] args) {

        EmpresaTransporte empresa = new EmpresaTransporte();

        empresa.cadastrarMotorista(new MotoristaIniciante("João", 40, 2000));
        empresa.cadastrarMotorista(new MotoristaExperiente("Maria", 60, 4000, 4.8));
        empresa.cadastrarMotorista(new MotoristaElite("Carlos", 100, 9000, 4.9, 20));
        empresa.cadastrarMotorista(new MotoristaExperiente("Ana", 30, 1500, 4.4));
        empresa.cadastrarMotorista(new MotoristaElite("Pedro", 70, 7000, 4.5, 10));

        empresa.gerarRelatorioMotoristas();

        System.out.println("\nTOTAL A PAGAR: R$ " + empresa.calcularPagamentoTotal());

        System.out.println("\nPesquisa por 'Maria':");
        Motorista encontrado = empresa.pesquisarMotoristaPeloNome("Maria");
        System.out.println(encontrado != null ? encontrado : "Não encontrado");

        empresa.excluirMotoristaPeloNome("Ana");

        System.out.println("\nRELATÓRIO APÓS EXCLUSÃO:");
        empresa.gerarRelatorioMotoristas();
    }
}