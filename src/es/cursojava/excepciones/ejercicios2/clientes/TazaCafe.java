package es.cursojava.excepciones.ejercicios2.clientes;


public class TazaCafe  {


	
	private int temperatura;
	private String tipoCafe;
	

	public TazaCafe(int temperatura, String tipoCafe) {
		super();
		this.temperatura = temperatura;
		this.tipoCafe = tipoCafe;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public String getTipoCafe() {
		return tipoCafe;
	}
	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	
	
	
	
	@Override
	public String toString() {
		return "TazaCafe [temperatura=" + temperatura + ", tipoCafe=" + tipoCafe + "]";
	}
	
}
