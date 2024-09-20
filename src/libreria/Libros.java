package libreria;

public class Libros {
    String titulo;
    String autor;
    int numeroPaginas;
    int anoPublicacion;

    public Libros(String titulo, String autor, int numeroPaginas, int anoPublicacion){
        this.titulo= titulo;
        this.autor= autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion= anoPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public int getAnoPublicacion() {
        return anoPublicacion;
    }
    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
   public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   public void mostrsrLibro(){
       System.out.println("Titulo" + titulo);
       System.out.println("Autor" + autor);
       System.out.println("Número de Paginas" + numeroPaginas);
       System.out.println("Año de Publicación" + anoPublicacion);
   }

}
