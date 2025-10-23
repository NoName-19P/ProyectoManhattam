package es.cursojava.ejercicio.supermercado;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.cursojava.interfaces.ejercicio.Alimentos;
import es.cursojava.interfaces.ejercicio.oo.Manzana;
import es.cursojava.interfaces.ejercicio.oo.Pan;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ClienteSupermercado> clientesAñadidos = new ArrayList<>();

		List<List<Alimentos>> stock = new ArrayList<>();

		List<Alimentos> listapanes = new ArrayList<>();

		List<Alimentos> listamanzanas = new ArrayList<>();

		agregarAlimentos(stock, listapanes, listamanzanas);

		insertarClientes(clientesAñadidos);
		Supermercado supermerc = new Supermercado("Mercadona", stock, clientesAñadidos);

		// mostrarClientes(clientesAñadidos);
		mostrarProductosCantidad(supermerc, stock);

	}

	public static void agregarAlimentos(List<List<Alimentos>> stock, List<Alimentos> listapanes,
			List<Alimentos> listamanzanas) {

		try {

			Pan p1 = new Pan("Baguett", 1, 212121, "Diciembre");
			Pan p2 = new Pan("Pico", 2, 12121, "Enero");
			Pan p3 = new Pan("Chapata", 3, 22223, "Septiembre");
			listapanes.add(p1);
			listapanes.add(p2);
			listapanes.add(p3);
			stock.add(listapanes);

			Manzana m1 = new Manzana("a", 1, 12312, "Febrero");
			Manzana m2 = new Manzana("b", 2, 32323, "Mayo");
			Manzana m3 = new Manzana("c", 3, 34343, "Junio");
			listamanzanas.add(m1);
			listamanzanas.add(m2);
			listamanzanas.add(m3);
			stock.add(listamanzanas);
			System.out.println("Alimentos agregados correctamente");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void insertarClientes(List<ClienteSupermercado> clientesAñadidos) {
		System.out.println("Cuantos clientes quieres añadir");
		int cantidad = sc.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el nombre del cliente que quieres añadir");
			String nombre = sc.next();
			List<Alimentos> carrito = new ArrayList<>();
			ClienteSupermercado clienteSupermercado = new ClienteSupermercado(nombre, carrito);
			clientesAñadidos.add(clienteSupermercado);

		}
		System.out.println("Cliente agregados correctamente con carritos vacios");

	}

	public static void mostrarClientes(List<ClienteSupermercado> clientesAñadidos) {
		for (ClienteSupermercado clienteSupermercado : clientesAñadidos) {
			System.out.println(clienteSupermercado.toString());
		}

	}

	public static void mostrarProductosCantidad(Supermercado supermerc, List<List<Alimentos>> stock) {

		String nombre;
		do {

			mostrarClientes(supermerc.getClientes());
			System.out.println("Introduce el nombre del cliente con el que quieras operar");
			nombre = sc.next();

		} while (!existe(supermerc, nombre));

		for (int i = 0; i < supermerc.getClientes().size(); i++) {
			if (supermerc.getClientes().get(i).getNombre().equals(nombre)) {
				System.out.println(stock.toString());
				System.out.println("Que categoria quiere comprar");
				String categoria = sc.next();
				if (supermerc.getStock().equals(categoria)) {
					System.out.println("Has seleccionado la categoria " + categoria);
					System.out.println("Introdece el tipo de pan que quieras comprar");
					String nombrePan=sc.next();
					if(supermerc.getStock().equals(nombre)) {
						
					}

				}
			}
		}

	}

	public static boolean existe(Supermercado supermerc, String nombre) {
		for (int i = 0; i < supermerc.getClientes().size(); i++) {
			if (supermerc.getClientes().get(i).getNombre().equals(nombre)) {
				return true;
			}

		}
		return false;

	}

}
