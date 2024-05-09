public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 11.0;
 
        if(valorSolicitado < saldo) //OBS: caso dentro do if ou dentro do else tiver mais de uma instrução, devemos colocar entre chaves se não da erro de sintaxe
            saldo = saldo - valorSolicitado;

            System.out.println("Seu saldo é de agora é de " + saldo);

        /* }else
            System.out.println("Você não tem saldo suficiente para saque, seu saldo é de " + saldo + " e o valor solicitado é de " +valorSolicitado); */
    }
}
