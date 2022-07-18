package logica;

public class Inicio {

	public static void main(String[] args) {
		
		//1.- CREAR PELÍCULAS Y AÑADIRLAS A LA LISTA
		Pelicula p1 = new Pelicula("001", "PulpFiction", "Suspense", 4.8, Restriccion.MAYORES18 );
		Pelicula p2 = new Pelicula("002","Aniquilacion","Ciencia Ficcion", 4.2, Restriccion.MAYORES13);
		Pelicula p3 = new Pelicula("003", "The equalizer", "Suspense", 4.5, Restriccion.MAYORES13);
		Pelicula p4 = new Pelicula("004", "Llenos de gracia", "Comedia", 4.1, Restriccion.TODOSLOSPUBLICOS);
		Pelicula p5 = new Pelicula("005","Expediente Warren","Terror", 3.5, Restriccion.MAYORES18);
			
		GestionPelicula.anyadirPelicula(p1);
		GestionPelicula.anyadirPelicula(p2);
		GestionPelicula.anyadirPelicula(p3);
		GestionPelicula.anyadirPelicula(p4);
		GestionPelicula.anyadirPelicula(p5);
		
		System.out.println("//2.- MOSTRAR PELICULAS SIN TODOS LOS ATRIBUTOS"+"\n");		
		GestionPelicula.mostrarPeliculas();
		
		System.out.println("\n"+"//3. MODIFICAR 2 PELÍCULAS");
		String aCambiar = p5.getTitulo();
		String tituloNuevo = "Expediente Warren: El caso Endfield";
		double retingNuevo = 3.2;
		GestionPelicula.cambiarDatosPelicula(aCambiar, tituloNuevo, retingNuevo);
		
		String aCambiar2 = p3.getTitulo();
		String tituloNuevo2 = "The equalizer 2";
		double retingNuevo2 = 2.8;
		GestionPelicula.cambiarDatosPelicula(aCambiar2, tituloNuevo2, retingNuevo2);	
		GestionPelicula.mostrarPeliculas2();
		
		System.out.println("\n"+"//4.- MOSTRAR PELICULAS QUE TENGAN GÉNERO SUSPENSE");		
		GestionPelicula.mostrarGenero("Suspense");
	}

}
