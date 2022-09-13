package view;

import javax.swing.JOptionPane;

import controller.SalarioController;

public class Main_Ex16 {

	public static void main(String[] args) {
		
		SalarioController sCont = new SalarioController();
		
		String horas, valorHora, percDesc, numDep;
		double ht, vh, pDesc, sFinal;
		int dep;
		
		horas = JOptionPane.showInputDialog("Horas trabalhadas");
		ht = Double.parseDouble(horas);
		
		valorHora = JOptionPane.showInputDialog("Valor por hora");
		vh = Double.parseDouble(valorHora);
		
		percDesc = JOptionPane.showInputDialog("Percentual de desconto");
		pDesc = Double.parseDouble(percDesc);
		
		numDep = JOptionPane.showInputDialog("Número de dependentes");
		dep = Integer.parseInt(numDep);
		
		sFinal = sCont.sFinal(ht, vh, pDesc, dep);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Horas trabalhadas = ");
		buffer.append(ht);
		buffer.append("\n");
		buffer.append("Valor por hora = R$ ");
		buffer.append(vh);
		buffer.append("\n");
		buffer.append("Percentual de desconto = ");
		buffer.append(pDesc);
		buffer.append("%");
		buffer.append("\n");
		buffer.append("Número de dependentes = ");
		buffer.append(dep);
		buffer.append("\n");
		buffer.append("Salário final a receber = R$ ");
		buffer.append(sFinal);
		
		System.out.println(buffer);
	}

}
