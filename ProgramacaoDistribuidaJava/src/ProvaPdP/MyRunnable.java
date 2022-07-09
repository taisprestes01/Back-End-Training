package ProvaPdP;
import java.io.File;
import java.io.IOException;

public class MyRunnable implements Runnable  {
	
	Principal p = new Principal();
	
	private String nome;
	private String Tipo;
	private int tam;
	
	public MyRunnable(String nome, String tipo, int tam) {
		
		this.nome = nome;
		this.Tipo = tipo;
		this.tam = tam;
	}
	
	public void run() {
	
		Funcoes fun = new Funcoes();
		   File objFile = new File(nome);
		  
		   if (objFile.exists()) {
		
		        // System.out.printf("\nConteúdo do diretório:\n");
		         String diretorio[] = objFile.list();
		         
		         for (String item: diretorio) {
		        	// System.out.printf(" %s: %s\n",nome, item);
		        	 fun.buscarPorNome(nome, item);
		        	 fun.buscaPorTipo(nome, Tipo);
				     fun.buscaTamanho( nome, tam);
				     try {
						fun.IdentificaSubPastas(nome,nome, Tipo, tam);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		         }
		         
		    } else System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
		
	}

	
	

}
