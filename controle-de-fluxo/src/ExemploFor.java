//estrutura do controle de fluxo for

//  for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
//  {
      // comando que será executado até que a 
     // expressão de validação torne-se falsa 
//  }

//Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:
public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){ // essa linha de lê assim, começando pelo For leia assim: "Precisamos montar um for onde a gente tem uma variavel do tipo inteira, chamamos de carneirinhos e ela começa com 0. ( ou então podemos começar com 1 se for o caso)" esse é o bloco de declaração da variavel... agora vamos para o bloco de validação, "enquanto carneirinhos for menor ou igual a 20" bloco de atualização " carneirinhos acrescenta conforme solicitado +1, +2 +3 etc.. nesse caso foi apenas 1 incremento, ou seja, carneirinho++ "
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        System.out.println("Joãozinho dormiu");
    }
}
//estrutura 2
//o que importa é somente o bloco condicional
//int carneirinhos = 1;
//for( ; carneirinhos <=20; ) {
   //  System.out.println(carneirinhos + " - Carneirinho(s)");
   //  carneirinhos ++;
//}

//for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final d