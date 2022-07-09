package ProvaPdP;
import java.io.File;
import java.util.Scanner;

public class Principal extends Funcoes {

	public static void main(String[] args) throws Exception {
		Scanner ler = new Scanner(System.in);
		Funcoes fun = new Funcoes();
		
		String BuscarTipo = null;
		int BuscarTamanho = 0;
		String BuscarNome = null;
		
		System.out.printf("Informe o diretório:\n");
		String nome = ler.nextLine();
		
		System.out.printf("Digite o nome:\n");
		BuscarNome = ler.nextLine();
		
		System.out.printf("Digite o tipo:\n");
		BuscarTipo = ler.nextLine();
		
		System.out.printf("Digite o tamanho:\n");
		BuscarTamanho = ler.nextInt();
		
		fun.IdentificaSubPastas(nome,BuscarNome,
		BuscarTipo,BuscarTamanho);
		}
		
	
   
}