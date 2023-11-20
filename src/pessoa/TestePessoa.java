package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "33222111";
        pessoa1.nome = "Pedro";
        pessoa1.idade = 26;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));


        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "33222111";
        pessoa2.nome = "Ana";
        pessoa2.idade = 19;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));
    }
}
