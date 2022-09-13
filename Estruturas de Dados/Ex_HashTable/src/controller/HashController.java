package controller;

public class HashController {

	public HashController() { }

	public int minhaFuncaoHash(long chave) {
		return (int)(chave % 3 *2);
	}
	
}