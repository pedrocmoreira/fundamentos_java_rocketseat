package conta;

public class TesteDeContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234");

        contaBancaria1.setTitular("José");

        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);

        System.out.println(contaBancaria1.saldo);
    }
}
