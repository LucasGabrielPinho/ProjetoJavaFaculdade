import java.util.Scanner;

public class Exercicio{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in); 
		int n1 = 0;
		int n2 = 0;
		String aritmetica = "";
		
		System.out.println("Digite a opcao aritmetica:");
		System.out.print("| Somar = '+' \n| Dividir = '/' \n| Multiplicar = '*' \n| Subtratir = '-' \n| Maior num = '>'");
		aritmetica = input.nextLine();
		System.out.print("Digite o primeiro valor:");
		n1 = input.nextInt();
		System.out.print("Digite o segundo valor:");
		n2 = input.nextInt();
		
		functionAritmetica(aritmetica,n1,n2);
	}
	
	public static void functionAritmetica(String aritmetica, int n1, int n2){
		int resultado = 0;
		if(aritmetica.equals("+")){
			resultado = n1 + n2;
		}else if(aritmetica.equals("-")){
			resultado = n1 - n2;
		}else if(aritmetica.equals("/")){
			resultado = n1 / n2;
		}else if(aritmetica.equals("*")){
			resultado = n1 * n2;
		}else if(aritmetica.equals(">")){
			if(n1 > n2){
				resultado = n1;
			}else{
				resultado = n2;
			}
		}
		System.out.printf("O resultado eh: %d", resultado);
	}
	
	
}

