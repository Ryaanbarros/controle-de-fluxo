public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        int nota = 7;

        if(nota >= 7) //true
        System.out.println("aprovado");
        else if(nota >= 5 && nota < 7) //true ou false
        System.out.println("recuperação");
        else //false
        System.out.println("reprovado");
    }
}
