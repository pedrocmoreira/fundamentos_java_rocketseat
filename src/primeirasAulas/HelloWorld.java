package primeirasAulas;

public class HelloWorld {
    public static void main(String[] args) {
    /*
    *Tipos de dados
    * Números (int, double, float, long )
    * Texto (strig)
    * Booleanos (boolean)
    *
    */
        int dadoDoTipoInt = 11;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f; /* Em float é preciso colocar o f na frente, senão o java não identifica e fica como erro de identificação */
        long dadoDoTipoLong = 8984372984237479823L; /*O long comporta um número maior que o número do int*/
        String dadoDoTipoString = "Colocar o texto da forma que desejo";
        boolean dadoDoTipoBoolean = false;

        //if - else
        if(dadoDoTipoInt == 10) {
            System.out.println("Entrou no if");
        }else if (dadoDoTipoInt == 12){
            System.out.println("Entrou no else");
        }
        else{
            System.out.println("Entrou no segundo else");
        }

        // While => enquanto algum valor for verdadeiro faça algo
    }
}