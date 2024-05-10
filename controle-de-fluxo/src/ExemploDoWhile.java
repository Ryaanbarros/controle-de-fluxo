//estrutura do controle de fluxo do while

//do
//{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
//}
//while (expressão booleana de validação);

// Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos:
import java.util.Random; // classe random
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {  //metodo tocando diante a classe random
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
    }
}
