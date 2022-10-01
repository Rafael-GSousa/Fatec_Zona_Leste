package controller;

import java.util.Calendar;

public class IdController {
	
	public IdController() {
		super();
	}
	
	public void idade(int anoN, int mesN, int diaN) {
		
		Calendar cal = Calendar.getInstance();
		
		int anoA, mesA, diaA;
		int anoId = 0, mesId = 0, diaId = 0;
		
		anoA = cal.get(Calendar.YEAR);
		mesA = cal.get(Calendar.MONTH);
		diaA = cal.get(Calendar.DAY_OF_MONTH);

		while(mesN < mesA - 1 || anoN < anoA) {
			mesN ++;
			mesId ++;
			if(mesId == 12) {
				mesId = 0;
				anoId ++;
			}
			if(mesN == 12) {
				anoN++;
				mesN = 0;
			}
		}
		
		if(diaN == diaA) {
			mesId ++;
			diaId = 0;
		}
		else if(diaN < diaA) {
			mesId ++;
			diaId = diaA - diaN;
		}
		else {
			diaId = diasNoMes(mesA - 1, anoA) + diaA - diaN;
		}
		
		
		System.out.println(anoId + " ano(s) " + mesId + " mes(es) " + diaId + " dia(s)");
	}
	
	public boolean bissexto(int ano) {
		
		if(ano % 4 == 0 || ano % 400 == 0 && ano % 100 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean validarData(int ano, int mes, int dia) {
		
		if(mes < 1 || mes > 12 || dia < 1 || dia > 31) {
			
			return false;
			
		}
		
		else if(dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {

			return false;
	
		}
		
		else if(mes == 2 && dia > 29) {
			
			return false;
		
		}
		
		else if(mes == 2 && dia == 29 && bissexto(ano)) {
		
			return false;
		
		}
		
		else {
		
			return true;
		
		}
		
	}
	
	public int diasNoMes(int mes, int ano) {
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
		
			return 31;
		
		}
		
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
		
			return 30;
		
		}
		
		else if(bissexto(ano)){
		
			return 29;
		
		}
		
		else {
			
			return 28;
			
		}
		
	}
	
}
