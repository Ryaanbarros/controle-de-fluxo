public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3) // o IF interrompeu o FOR por conta do Break, então será impresso só os numeros 1 e 2
                break; // se fosse o continue no lugar do break só não seria impresso o numero 3, pois o continue interrompe somente a condição do IF, ou seja somente o 3, ou seja não parou o For completamente
            System.out.println(numero);
            
        } 
    }
}
