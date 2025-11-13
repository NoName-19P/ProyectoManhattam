package es.cursojava.bbdd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.cursojava.ficheros.ArchivoServicio;
import es.cursojava.utils.UtilidadesBD;

public class ConsultaProductos {
	private static final String CONSULTA_PRODUCTOS = "SELECT "
			+ "ID,NOMBRE,CATEGORIA,PRECIO,STOCK,FECHA_ALTA,ESTADO,CODIGO_SKU,CREADO_POR,IVA "
			+ "FROM TB_PRODUCTOS_PROFE";

	public static void main(String[] args) {
		String ruta="./recursos/ejemploConsulta";
		List<Producto> productos = new ArrayList<>();
		productos = consultaProductos();
		crearfichero(productos,ruta);

	}

	public static List<Producto> consultaProductos() {

		Connection conexion = UtilidadesBD.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		List<Producto> productos = new ArrayList<>();
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_PRODUCTOS);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("NOMBRE");
				String categoria = rs.getString("CATEGORIA");
				double precio = rs.getDouble("PRECIO");
				String stock = rs.getString("STOCK");
				String estado = rs.getString("ESTADO");
				String sku = rs.getString("CODIGO_SKU");
				String creador = rs.getString("CREADO_POR");
				int iva = rs.getInt("IVA");
				Date fechaAlta = rs.getDate("FECHA_ALTA");

				Producto p = new Producto(id, nombre, categoria, precio, id, fechaAlta, estado, sku, creador, iva);
				productos.add(p);
				// System.out.println(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			UtilidadesBD.cierraConexion(conexion);
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("TERMINA");
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		return productos;
	}

	public static void crearfichero(List<Producto> productos,String ruta) {
		File archivo = new File(ruta);
		String separador=" | ";
		try (FileWriter fw = new FileWriter(archivo, true);
				BufferedWriter buffer = new BufferedWriter(fw);) {
				StringBuilder st=new StringBuilder();
			for (int i = 0; i < productos.size(); i++) {
				//buffer.append(productos.get(i).getId()+" | "+productos.get(i).getNombre()+" | "+productos.get(i).getCategoria()+"\n");
				//buffer.append(productos.get(i).toString()+"\n");
				st.append(productos.get(i).getId()+separador+productos.get(i).getNombre()+separador+productos.get(i).getCategoria()+"\n");
				
				
			}
			buffer.append(st.toString());
			

			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
