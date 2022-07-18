package logica;

public class Pelicula {
	
	private String codigo;
	private String titulo;
	private String genero;
	private double rating;
	private Restriccion restriccion;
	
	
	public Pelicula() {
	
	}
	public Pelicula(String codigo, String titulo, String genero, double rating, Restriccion restriccion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.rating = rating;
		this.restriccion = restriccion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	public String mostrarPeli() {
		return titulo + ", " + genero + ", " + rating ;
	}
	
	@Override
	public String toString() {
		return codigo + ", " + titulo + ", " + genero + ", " + rating + ", " + restriccion;
	}
}
