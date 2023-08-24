package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Libro;
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
            libro1.setTitle("Suma");
            libro1.setGender("Académico");
            libro1.setAuthor("Loaiza");
            libro1.setPublicationYear(1956);
            libro1.setEditorial("Norma");
            libro1.setPageNumber(246);
        Libro libro2 = new Libro();
            libro2.setTitle("Producto");
            libro2.setGender("Académico");
            libro2.setAuthor("Atehortua");
            libro2.setPublicationYear(1945);
            libro2.setEditorial("Santillana");
            libro2.setPageNumber(500);
        Libro libro3 = new Libro();
            libro3.setTitle("Cálculo Integral");
            libro3.setGender("Académico");
            libro3.setAuthor("Stewart");
            libro3.setPublicationYear(2000);
            libro3.setEditorial("Sol");
            libro3.setPageNumber(793);
        Libro libro4 = new Libro();
            libro4.setTitle("Oblicuo");
            libro4.setGender("Académico");
            libro4.setAuthor("Hernández");
            libro4.setPublicationYear(2007);
            libro4.setEditorial("Luna");
            libro4.setPageNumber(1234);
        Libro libro5 = new Libro();
            libro5.setTitle("Amor");
            libro5.setGender("Literatura");
            libro5.setAuthor("Henao");
            libro5.setPublicationYear(1956);
            libro5.setEditorial("Periodistas");
            libro5.setPageNumber(607);

        // LLAMAR FUNCIÓN AÑO DE PUBLICACIÓN
        anioPublicacion(libro1, libro2, libro3, libro4, libro5);

        // LLAMAR FUNCIÓN VOCAL O CONSONANTE
        vocalesConsonantes(libro1, libro2, libro3, libro4, libro5);

        // LLAMAR FUNCIÓN MODIFICAR TÍTULO
        modificarTitulo(libro1, libro2, libro3, libro4, libro5);

        // CANTIDAD GENERO ACADÉMICO
        cantidadAcademico(libro1, libro2, libro3, libro4, libro5);
    }
    private static void anioPublicacion(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        int anioPublicacion1 = libro1.getPublicationYear();
        int anioPublicacion2 = libro2.getPublicationYear();
        int anioPublicacion3 = libro3.getPublicationYear();
        int anioPublicacion4 = libro4.getPublicationYear();
        int anioPublicacion5 = libro5.getPublicationYear();
        int antesDosmil = 0;
        int despuesDosmil = 0;

        if (anioPublicacion1 < 2000) {
            antesDosmil = antesDosmil + 1;
        } else {
            despuesDosmil = despuesDosmil + 1;
        }
        if (anioPublicacion2 < 2000) {
            antesDosmil = antesDosmil + 1;
        } else {
            despuesDosmil = despuesDosmil + 1;
        }
        if (anioPublicacion3 < 2000) {
            antesDosmil = antesDosmil + 1;
        } else {
            despuesDosmil = despuesDosmil + 1;
        }
        if (anioPublicacion4 < 2000) {
            antesDosmil = antesDosmil + 1;
        } else {
            despuesDosmil = despuesDosmil + 1;
        }
        if (anioPublicacion5 < 2000) {
            antesDosmil = antesDosmil + 1;
        } else {
            despuesDosmil = despuesDosmil + 1;
        }
        System.out.println("La cantidad de libros publicados antes del año 2000 son: "+antesDosmil);
        System.out.println("La cantidad de libros publicados a partir del año 2000 son: "+despuesDosmil);

    }
    private static void vocalesConsonantes(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        char inicialLibro1 = libro1.getTitle().charAt(0);
        char inicialLibro2 = libro2.getTitle().charAt(0);
        char inicialLibro3 = libro3.getTitle().charAt(0);
        char inicialLibro4 = libro4.getTitle().charAt(0);
        char inicialLibro5 = libro5.getTitle().charAt(0);
        int cantidadVaocales=0;
        int cantidadConsonantes=0;
        if(inicialLibro1=='a' || inicialLibro1=='A' ||
                inicialLibro1=='e' || inicialLibro1=='E' ||
                inicialLibro1=='i' || inicialLibro1=='I' ||
                inicialLibro1=='o' || inicialLibro1=='O' ||
                inicialLibro1=='u' || inicialLibro1=='U')
        {
            cantidadVaocales=cantidadVaocales+1;
        }
        else {
            cantidadConsonantes=cantidadConsonantes+1;
        }
        if(inicialLibro2=='a' || inicialLibro2=='A' ||
                inicialLibro2=='e' || inicialLibro2=='E' ||
                inicialLibro2=='i' || inicialLibro2=='I' ||
                inicialLibro2=='o' || inicialLibro2=='O' ||
                inicialLibro2=='u' || inicialLibro2=='U')
        {
            cantidadVaocales=cantidadVaocales+1;
        }
        else {
            cantidadConsonantes=cantidadConsonantes+1;
        }
        if(inicialLibro3=='a' || inicialLibro3=='A' ||
                inicialLibro3=='e' || inicialLibro3=='E' ||
                inicialLibro3=='i' || inicialLibro3=='I' ||
                inicialLibro3=='o' || inicialLibro3=='O' ||
                inicialLibro3=='u' || inicialLibro3=='U')
        {
            cantidadVaocales=cantidadVaocales+1;
        }
        else {
            cantidadConsonantes=cantidadConsonantes+1;
        }
        if(inicialLibro4=='a' || inicialLibro4=='A' ||
                inicialLibro4=='e' || inicialLibro4=='E' ||
                inicialLibro4=='i' || inicialLibro4=='I' ||
                inicialLibro4=='o' || inicialLibro4=='O' ||
                inicialLibro4=='u' || inicialLibro4=='U')
        {
            cantidadVaocales=cantidadVaocales+1;
        }
        else {
            cantidadConsonantes=cantidadConsonantes+1;
        }
        if(inicialLibro5=='a' || inicialLibro5=='A' ||
                inicialLibro5=='e' || inicialLibro5=='E' ||
                inicialLibro5=='i' || inicialLibro5=='I' ||
                inicialLibro5=='o' || inicialLibro5=='O' ||
                inicialLibro5=='u' || inicialLibro5=='U')
        {
            cantidadVaocales=cantidadVaocales+1;
        }
        else {
            cantidadConsonantes=cantidadConsonantes+1;
        }
        System.out.println("La cantidad de libros que inician por vocal es: "+cantidadVaocales);
        System.out.println("La cantidad de libros que inicial por consonante son: "+cantidadConsonantes);
    }
    private static void modificarTitulo(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        // MODIFICAR LIBRO
        String tituloActual = "Cálculo Integral";
        String tituloCambio = "Calculo Integral y Diferencial";

        if(libro1.getTitle().equalsIgnoreCase(tituloActual))
        {
            libro1.setTitle(tituloCambio);
            System.out.println("Se cambió el título Cálculo Integral por el de: "+libro1.getTitle());
        }
        if(libro2.getTitle().equalsIgnoreCase(tituloActual))
        {
            libro2.setTitle(tituloCambio);
            System.out.println("Se cambió el título Cálculo Integral por el de: "+libro2.getTitle());
        }
        if(libro3.getTitle().equalsIgnoreCase(tituloActual))
        {
            libro3.setTitle(tituloCambio);
            System.out.println("Se cambió el título Cálculo Integral por el de: "+libro3.getTitle());
        }
        if(libro4.getTitle().equalsIgnoreCase(tituloActual))
        {
            libro4.setTitle(tituloCambio);
            System.out.println("Se cambió el título Cálculo Integral por el de: "+libro4.getTitle());
        }
        if(libro5.getTitle().equalsIgnoreCase(tituloActual))
        {
            libro5.setTitle(tituloCambio);
            System.out.println("Se cambió el título Cálculo Integral por el de: "+libro5.getTitle());
        }
    }
    private static void cantidadAcademico(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        String libroAcademico="Académico";
        int cantidadAcademico = 0;
        if(libro1.getGender().equalsIgnoreCase(libroAcademico))
        {
            cantidadAcademico=cantidadAcademico+1;
        }
        if(libro2.getGender().equalsIgnoreCase(libroAcademico))
        {
            cantidadAcademico=cantidadAcademico+1;
        }
        if(libro3.getGender().equalsIgnoreCase(libroAcademico))
        {
            cantidadAcademico=cantidadAcademico+1;
        }
        if(libro4.getGender().equalsIgnoreCase(libroAcademico))
        {
            cantidadAcademico=cantidadAcademico+1;
        }
        if(libro5.getGender().equalsIgnoreCase(libroAcademico))
        {
            cantidadAcademico=cantidadAcademico+1;
        }
        System.out.println("La cantidad de libros, de género académico, son: "+cantidadAcademico);
    }
}