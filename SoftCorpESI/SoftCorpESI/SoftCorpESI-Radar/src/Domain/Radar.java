package Domain;

public class Radar {
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
}

