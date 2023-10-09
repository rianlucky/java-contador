import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
        recolherDados();
    }	

    static void recolherDados(){
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);
    }

	static void contar(int parametroUm, int parametroDois){
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois > parametroUm){
            int contagem = (parametroDois - parametroUm)+1;
            for(int indiceContagem = 0;indiceContagem < contagem;indiceContagem++){
                System.out.println("Imprimindo o número "+(indiceContagem+parametroUm));
            }
            //realizar o for para imprimir os números com base na variável contagem

        }else{
            ParametrosInvalidosException();
        }
        
          

    }
    static void ParametrosInvalidosException(){
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        System.out.println("Reiniciando programa...");
        
        recolherDados();
    }
	
}
