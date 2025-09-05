package es.cursojava.oo.tienda;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1=new Producto("p1",6.5,20);
		Producto p2=new Producto("p2",6.5,20);
		Producto p3=new Producto("p3",6.5,20);
		Producto p4=new Producto("p4",6.5,20);
		
		Producto[] productos = {p1,p2,p3,p4};
		for(Producto producto:productos) {
			producto.mostrarInfo();
		}
		
		
		double total = UtilidadesTienda.calcularValorInventario(productos);
		System.out.println("Valor total: "+total);
	}

}
