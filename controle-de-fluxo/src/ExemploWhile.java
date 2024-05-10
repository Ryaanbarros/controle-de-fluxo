//estrutura do controle de fluxo while

//while (expressão booleana de validação)
//{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
//}

//Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, ENQUANTO o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
import java.util.concurrent.ThreadLocalRandom; //importante classe para simular valores aleatórios
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0) { //enquanto valor da mesada for maior que zero
            Double valorDoce = valorAleatorio(); //Joaozinho vai pegar um doce com algum valor aleatorio
           /* 
            if(valorDoce > mesada)
                valorDoce = mesada; // essa linha é pra não precisar fazer novas verificações
            */ 
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce; //é importante que a variavel que seja a condicional em algum momento ela precisa ser tratada para que ela se torne falsa, em algum momento ela precisa dizer que agora podemos encerrar o nosso fluxo.
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
