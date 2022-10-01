package controller;

public class VolumeController {
	
	public VolumeController() {
		super();
	}
	
	public double calcVolume(double comp, double larg, double alt) {
		double volume = 0;
		
		if(comp == 0 || larg == 0 || alt == 0) {
			return 0;
		}else {
			volume = (comp * larg * alt);
		}
		
		return volume;
	}

}
