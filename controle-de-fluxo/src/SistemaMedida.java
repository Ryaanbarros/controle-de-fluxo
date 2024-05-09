public class SistemaMedida {
    public static void main(String[] args) {
        // Modo condicional if/else
     /* String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");   */


        // Modo condicional switch / case

        String sigla = "M";

		switch (sigla) { //condição
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
        //a usabilidade do switch case deve ser bem avaliada com o time pra ver se compensa usa-lo ao inves do if else
        //Usamos mais o switch case para que eu tenha algo complementar e não controle de fluxos condicionais que sejam encandeaveis.
        //Exemplo de uma situação de uso na classe PlanoOperadora.. 
    }
}
