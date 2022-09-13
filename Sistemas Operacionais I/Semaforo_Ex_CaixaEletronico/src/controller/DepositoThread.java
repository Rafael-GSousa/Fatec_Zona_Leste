package controller;

import java.util.concurrent.Semaphore;

public class DepositoThread extends Thread {
	private int idConta;
	private double saldoConta;
	private double valorTransacao;
	private Semaphore limitacao;

	public DepositoThread(int idConta, double saldoConta, double valorTransacao, Semaphore limitacao) {
		this.idConta = idConta;
		this.saldoConta = saldoConta;
		this.valorTransacao = valorTransacao;
		this.limitacao = limitacao;
	}

	@Override
	public void run() {
		try {
			limitacao.acquire();
			creditar();
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			limitacao.release();
		}
	}

	public void creditar() {
		System.out.format("Conta %d - Saldo Anterior: R$ %.2f Deposito no valor de: R$ %.2f Novo saldo: R$ %.2f%n",
				idConta, saldoConta, valorTransacao, saldoConta + valorTransacao);
		this.saldoConta += valorTransacao;
	}

}