public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; //array de alunos, array é um conjunto de elementos de um tipo correspondente, e cada elemento é separado por uma virgula 
    
        for (int x=0; x<alunos.length; x++) { // usamos muito o X, ele representa o indice de um elemento do array, a segunda parte se lê "Enquanto X for menor que o tamanho de alunos", ou seja, length significa tamanho
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]); // será impresso o nome dos alunos pelo indice que obteve no valor X, ou seja como X será incrementado até o tamanho total do array, a palavra alunos[x] pegará o nome do aluno que estiver na posição X
        }
        
    }
}
//Observe que, como os arrays começam com índice igual a 0 (zero), iniciamos a nossa variável X também com valor zero e validamos a quantidade de repetições, a partir da quantidade de elementos do array.

//Existe também o For Each que serve para Arrays e coleções, é tipo uma forma abreviada de se trabalhar, consultar outro exemplo