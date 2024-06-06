import java.util.Scanner;
public class ClassePrincipal 
{
    public static void main(String[]args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ola, qual o seu nome? ");
        String nome = entrada.nextLine();
        System.out.println("Ola, ".concat(nome).concat(" em qual ano voce nasceu?"));
        int idade = entrada.nextInt();
        if(idade <= 0 || idade >= 2024)
        {
            while(idade <= 0 || idade >= 100)
            {
                System.out.println("Insira um ano valido!");
                idade = entrada.nextInt();
            }
        }
        idade = 2024-idade;
        System.out.println("qual a sua cor favorita ? \n"+"1-vermelho  2-verde 3-amarelo 4-azul");
        byte respostaCor = entrada.nextByte();
        if(respostaCor < 1 || respostaCor > 4)
        {
            while(respostaCor < 1 || respostaCor > 4)
            {
               System.out.println("Insira uma resposta valida");
               respostaCor = entrada.nextByte();
            }
        }
        String saidaCor = null;
        switch (respostaCor)
        {
            case 1 : saidaCor = "O oposto de vermelho e verde!";
            break;
            case 2 : saidaCor = "O oposto de verde e vermelho!";
            break;
            case 3 : saidaCor = "O oposto de amarelo e azul!";
            break;
            case 4 : saidaCor = "O oposto de azul e amarelo!";
            break;
        }
        System.out.println("quais destes lugares voce gostaria de visitar? \n"+" 1-Paris 2-egito 3-tokyo");
        int respostaPais = entrada.nextInt();
        if(respostaPais < 1 || respostaPais > 3)
        {
            while(respostaPais < 1 || respostaPais > 3)
            {
                System.out.println("Insira uma resposta valida");
                respostaPais = entrada.nextInt();
            }
        }
        String saidaPais = null;
        switch (respostaPais)
        {
            case 1 : saidaPais = "Paris fica na franca!";
            break;
            case 2 : saidaPais = "Egito fica na africa!";
            break;
            case 3 : saidaPais = "Tokyo fica no japao!";
            break;
        }
        System.out.println("Aqui estao algumas curiosidades para voce "+nome+"!");
        System.out.println("Voce tem "+idade+" anos!");
        System.out.println(saidaPais);
        System.out.println(saidaCor);
    }
}
