package es.cursojava.herencia.hospital;

public class EmpleadosHospital extends Persona {
	private String turno;

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	public void fichar() {
		System.out.println("El"+this.getClass().getName()+" esta fichando");
	}
	
	
	@Override
	public void comer() {
		System.out.println("El"+this.getClass().getName()+" esta comiendo en el comedor");
		
	}

}
