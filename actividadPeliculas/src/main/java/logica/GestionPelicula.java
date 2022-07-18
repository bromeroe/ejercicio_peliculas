package logica;

import java.util.ArrayList;
import java.util.List;

public class GestionPelicula {
	
	static List<Pelicula> listaPeliculas = new ArrayList <Pelicula>();
	
	public static void anyadirPelicula (Pelicula recibida) {
		listaPeliculas.add(recibida);
	}
	
	//No muestra todos los atributos
	public static void mostrarPeliculas () {
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula.mostrarPeli());
		}
	}
	
	//Muestra todos los atributos
	public static void mostrarPeliculas2() {
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula.toString());
		}
	}
	public static void cambiarDatosPelicula(String peliParaCambiar, String nombreRecibido, double rentingRecibido) {
		for (Pelicula pelicula : listaPeliculas) {
			if(pelicula.getTitulo().equals(peliParaCambiar)) {
				pelicula.setTitulo(nombreRecibido);
				pelicula.setRating(rentingRecibido);					
			}				
		}				
	}
	
	public static void mostrarGenero (String generoRecibido) {
		for (Pelicula pelicula : listaPeliculas) {
			if(pelicula.getGenero().equals(generoRecibido)) {
				System.out.println(pelicula.toString());
			}	
		}				
	}
}
