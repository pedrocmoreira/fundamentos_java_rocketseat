package pessoa;

import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    //nome, idade, cpf
    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(int indice){
        return "O nome da pessoa é " + nome + " a idade é "
                    + idade + " e o cpf é " + cpf + " e o indíce é " + indice;
    }
}
