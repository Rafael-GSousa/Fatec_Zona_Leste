package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
	
	public KillController() {
		super();
	}
	
/*Método chamado "os", identifica e retorna o sistema operacional
	para os métodos "listaProcessos", "mataPid" e "mataNome. (método privado)*/
	private String os() {
		
/*operação que identifica o nome do SO com retorno*/		
		String opSystem = System.getProperty("os.name");
		return opSystem;
	}
	
	public void listaProcessos(String chamaLista) {
		
	
		
		KillController opSystem = new KillController();
		String so = opSystem.os();
		
		if(so.contains("Windows")) {
			chamaLista = "cmd /c start C:\\Windows\\System32\\cmd.exe";
		}else {
			chamaLista = "sudo su \\usr\\bin\\exo-open";
		}
		
		try {
//			Execução do comando para abrir o prompt de comando
			Runtime.getRuntime().exec(chamaLista.toString());
			} catch (IOException e) {
				e.printStackTrace();
				}
		
			StringBuffer buffer = new StringBuffer();
			if(so.contains("Windows")) {
				buffer.append("tasklist /fo table");
			}else {
				buffer.append("ps -ef");
			}
			
			
			
			try {
			
			Process rodaCmd = Runtime.getRuntime().exec(buffer.toString());
			InputStream fluxo = rodaCmd.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer1 = new BufferedReader(leitor);
			String linha = buffer1.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = buffer1.readLine();
			}
			buffer1.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}


	public void mataPid(int pid) {
		
		KillController opSystem = new KillController();
		String so = opSystem.os();
		
		
		String comando = " ";		
		if(so.contains("Windows")) {
			comando = "taskkill /pid";
		}else {
			comando = "kill -9";
		}
		StringBuffer buffer = new StringBuffer();
		
		try {
			buffer.append(comando);
			buffer.append(" ");
			buffer.append(pid);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
		Process rodaCmd = Runtime.getRuntime().exec(buffer.toString());
		InputStream fluxo = rodaCmd.getInputStream();
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer1 = new BufferedReader(leitor);
		String linha = buffer1.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = buffer1.readLine();
		}
		buffer1.close();
		leitor.close();
		fluxo.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		System.exit(0);
		
	}
	
	public void mataNome(String nome) {
		KillController opSystem = new KillController();
		String so = opSystem.os();
		
		
		String comando = " ";		
		if(so.contains("Windows")) {
			comando = "taskkill /im";
		}else {
			comando = "pkill -f";
		}
		StringBuffer buffer = new StringBuffer();
		
		try {
			buffer.append(comando);
			buffer.append(" ");
			buffer.append(nome);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
		Process rodaCmd = Runtime.getRuntime().exec(buffer.toString());
		InputStream fluxo = rodaCmd.getInputStream();
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer1 = new BufferedReader(leitor);
		String linha = buffer1.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = buffer1.readLine();
		}
		buffer1.close();
		leitor.close();
		fluxo.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		System.exit(0);
	}
	
}



