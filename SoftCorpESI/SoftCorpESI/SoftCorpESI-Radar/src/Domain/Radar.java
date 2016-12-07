package Domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Persistence.GeneralDao;

public class Radar extends Thread{
	private boolean estado;
	private String location;
	private double maxSpeed;
	public Radar(String location, double max){		
		this.estado = true;
		this.location = location;
		this.maxSpeed = max;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}	
	
	public void run(){
		try {
			detectarVehiculos();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public <T> void detectarVehiculos() throws InterruptedException{
		while(isEstado()){
			int n = 0;
			GeneralDao<T> gd = new GeneralDao();
			ArrayList l = (ArrayList) gd.findAll(Vehicle.class);
			Collections.shuffle(l);
			Random rnd = new Random();
			if(rnd.nextDouble()>0.75)
				n = (int)(rnd.nextDouble() * (201-(int)(this.maxSpeed*1.25+1)) + (int)(this.maxSpeed*1.25+1));
			else
				n = (int)(rnd.nextDouble() * (int)(this.maxSpeed*1.25+1) + 1);
			if(n>this.maxSpeed){
				Manager.get().openInquiry(((Vehicle) l.get(0)).getLicense(), (double) n, this.location, this.maxSpeed);
				System.out.println(((Vehicle) l.get(0)).getLicense());
			}
			Thread.sleep(3000);
		}
	}
}

