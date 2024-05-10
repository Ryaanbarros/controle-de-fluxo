public class ExemploForEachArray {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviad de interagir com elementos de um array
        for(String aluno : alunos) { //Estamos iniciando um for, e eu sei que tenho elementos, e esses elementos são de um tipo, quando coloco os dois pontos ele diz que a cada interação de alunos, o aluno atual do indice atual vai atualizar automaticamente essa variavel.
          System.out.println("Nome do aluno é " + aluno);
        }
    
    }
}
