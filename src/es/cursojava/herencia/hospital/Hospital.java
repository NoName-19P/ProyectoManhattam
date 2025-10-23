package es.cursojava.herencia.hospital;

import java.util.ArrayList;

public class Hospital {

	/*
	 * Hospital
	+ nombre
	+ habitaciones [2]
	+ salaDeEspera [3]

	+ main () 
		--> abrirHospital()
		--> ficharEmpleados()
		--> horaDeComer()
		--> pasarConsultas()
		
	+ abrirHospital()
		+ 2 objetos de tipo habitación
		+ 3 pacientes --> Meterlos en la sala de espera
		+ 1 enfermero
		+ 1 doctor
		
	+ ficharEmpleados ()
		//Crear método que ponga a fichar a todos los empleados del hospital
	+ horaDeComer()
		//Crear método para poner a todas las personas del hospital a comer
		
	+ pasarConsultas()
		//Por cada paciente que esté en la salaDeEspera el enfermero atiende al paciente
			+ Sacar al paciente de la sala de espera
			+ Asignar al paciente al doctor
			+ Doctor diagnosticarPaciente
			+ Si el paciente está enfermo --> ingresa (Se le asigna habitación) se le debe 					asignar una habitación vacía
				- si no hay habitaciones disponibles se le indica
	 * 
	 * 
	 * 
	 */

	private String nombre;
	private Habitacion[]habitaciones = new Habitacion[2];
	private ArrayList<Paciente> salaDeEspera = new ArrayList<>();
	private EmpleadosHospital[] empleados=new EmpleadosHospital[2];
	private Persona[] personas;
	
	
	
	public Hospital(String nombre, Habitacion[] habitaciones, ArrayList<Paciente> salaDeEspera,
			EmpleadosHospital[] empleados) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaDeEspera = salaDeEspera;
		this.empleados = empleados;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

	}
	
	


	public void abrirHospital(ArrayList<Paciente> salaDeEspera, Habitacion[]habitaciones) {

		
		Hospital hospital = new Hospital("Hospital Central ",habitaciones,salaDeEspera,empleados);
		
		for (Paciente salaDeEspera1 : salaDeEspera) {

			String[] sintomas = { "dasdas", "dadsadad", "DASdsad" };
			Paciente paciente1 = new Paciente("paciente1", 25, sintomas);
			Paciente paciente2 = new Paciente("paciente2", 18, sintomas);
			Paciente paciente3 = new Paciente("paciente3", 85, sintomas);

			salaDeEspera.add(paciente1);
			salaDeEspera.add(paciente2);
			salaDeEspera.add(paciente3);

		}

		
		for(int i=0;i<habitaciones.length;i++) {
			
			Habitacion habitacion1 = new Habitacion(1);
			Habitacion habitacion2 = new Habitacion(2);
			habitaciones[0]=habitacion1;
			habitaciones[1]=habitacion2;
		}
		
		
	

		Enfermero enfermero1 = new Enfermero("abcd", 25, "abcd", "abcd");
		Doctor Doctor1 = new Doctor("abcascd", 45, "abcd", "abcd");

	}

	public void ficharEmpleados(EmpleadosHospital[] empleados) {
		for (EmpleadosHospital empleadoHospital : empleados) {

			empleadoHospital.fichar();
		}

	}

	public void horaDeComer(Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
			
		}
	}
	
	public void pasarConsulta(ArrayList<Paciente> salaDeEspera,Doctor doctor,Habitacion[]habitaciones) {
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * //Por cada paciente que esté en la salaDeEspera el enfermero atiende al paciente
			+ Sacar al paciente de la sala de espera
			+ Asignar al paciente al doctor
			+ Doctor diagnosticarPaciente
			+ Si el paciente está enfermo --> ingresa (Se le asigna habitación) se le debe asignar una habitación vacía
				- si no hay habitaciones disponibles se le indica
				
				
		 */
		for (int i=0;i<salaDeEspera.size();i++) {
			salaDeEspera.set(i, null);
			
			
		}
		
		for (int i=0;i<salaDeEspera.size();i++) {
			
			Paciente p= salaDeEspera.get(i);
			
			Enfermo e=doctor.diagnosticarPaciente(p);
			
			if( e.getEnfermedad() == null) {
				System.out.println("El paciente no  esta enfermo");
			}else {
				System.out.println("El paciente esta enfermo ");
				for(int j=0;j<habitaciones.length;j++) {
					//habitaciones[j]=
					
					
					
				}
				
				
				
				}
				
			}
		
		}
		
			
			
			
	}
		
	
		
		



