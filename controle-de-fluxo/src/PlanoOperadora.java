/* Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

O sistema terá 03 planos: BASIC, MIDIA , TURBO;

BASIC: 100 minutos de ligação;

MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;

TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube. */


//Neste exemplo usando if else, está sendo repetido informações varias vezes, 100 minutos de ligação, whatsapp e instagram gratis, se utilizar o switch case não tem necessidade dessa repetição
public class PlanoOperadora {
    public static void main(String[] args) {
        /*  String plano = "M"; //M / T
            
            if(plano == "B") {
                System.out.println("100 minutos de ligação");
            }else if(plano == "M") {
                System.out.println("100 minutos de ligação");
                System.out.println("WhatsApp e Instagram grátis");	
            }else if(plano == "T") {
                System.out.println("100 minutos de ligação");
                System.out.println("WhatsApp e Instagram grátis");	
                System.out.println("5Gb Youtube");	
            } */

        // Modo condicional switch/case

		String plano = "M"; // M / T

		switch (plano) {  //OBS: Sem o brake os proximos cases serão lidos, por exemplo a condição plano é o M, por tanto como não tem brake no M, será lido do M pra baixo, no caso M e B... 
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
        }
    }
}
