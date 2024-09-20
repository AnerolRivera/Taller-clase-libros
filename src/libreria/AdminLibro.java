package libreria;

public class AdminLibro {
    public static void main(String[] args) {
        Libros libroUno = new Libros("Más alla del odio", "Eduardo Cañas", 230, 2019);
        Libros libroDos = new Libros("Familia", "Eduardo Cañas", 199, 2022);
        Libros libroTres = new Libros("Una vida con proposito", "Rick Warren", 399, 2018);

        System.out.println("Libro 1:" );
        libroUno.mostrsrLibro();
        System.out.println("Libro 2:");
        libroDos.mostrsrLibro();
        System.out.println("Libro3:");
        libroTres.mostrsrLibro();

        System.out.println("Libro 3:" + libroTres.getAutor());
        libroTres.setAutor("Eduardo Cañas");
        System.out.println("Autro Libro 3 modificado:" + libroTres.getAutor());
    }
}
