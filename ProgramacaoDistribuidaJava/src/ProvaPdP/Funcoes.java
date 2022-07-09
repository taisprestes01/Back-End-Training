package ProvaPdP;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*nesta classe temos todas as funcoes da atividade,
*
*/
public class Funcoes  {

	public void IdentificaSubPastas(String diretorio,String buscaNome,String buscarTipo,int buscaTamanho) throws IOException{	
		File folder = new File(diretorio);
			File[] files = folder.listFiles();
 
			int count = files.length;
			int j =0;
			for (int i = 0; i < count; i++) {
			    buscaPorTipo(diretorio, buscarTipo);
			    buscaTamanho( diretorio, buscaTamanho);
			    buscarPorNome( diretorio,  buscaNome);
			    if (((files[i].isFile()==false))) {
			      //  System.out.printf("\n\tArquivo (%s) existe \n",
			    	//files[i].getName());
			        MyRunnable myRunnable = new MyRunnable(diretorio +"\\"+ files[j].getName(),buscarTipo,buscaTamanho);
			        Thread threadCliente = new Thread(myRunnable);
					threadCliente.start();
			    }
			      j++;
			    }
	
	}
	public void buscaTamanho(String diretorio, int buscaTamanho){	
		File folder = new File(diretorio);
	    File[] files = folder.listFiles();
	    int count = files.length;
	    for (int i = 0; i < count; i++) {
	        if (files[i].length()==buscaTamanho) {
	            System.out.printf("\nO tamanho existe em (%s) - %d bytes\n",
	            files[i].getName(), files[i].length());
	        }
	    }
	}
	
	public void buscaPorTipo(String diretorio, String buscarTipo){	
		 File folder = new File(diretorio);
	     File[] files = folder.listFiles();

	        int count = files.length;
	 
	        for (int i = 0; i < count; i++) {
	            if (((files[i].getName().endsWith(buscarTipo)))) {
	            	System.out.printf("\nO tipo de aquivo existe - (%s)\n",
	        	    files[i].getName());
	                
	            }
	        }
 	}

	public void buscarPorNome(String diretorio, String buscaNome) {

	   File objFile = new File(diretorio+"\\"+buscaNome);
	    if (objFile.exists()) {
	       if (objFile.isFile()) {
	    	   
	    		   System.out.printf("\nO nome (%s) existe - tamanho: %d bytes\n",
	    				   objFile.getName(),  objFile.length());
	    	   }	   
	    		   objFile.getAbsoluteFile();
	        
	       
	    } 
	}
	
}