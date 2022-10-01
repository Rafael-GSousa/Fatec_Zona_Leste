package controller;

public class VelocidadeMediaController {
	public VelocidadeMediaController() {
		super();
	}
	
	public double vMedia(int voltas, double extensao, double minutos) {
		double vMedia = 0;
		
		vMedia = (voltas * extensao / 1000) / (minutos / 60);
		
		return vMedia;
	}

}
