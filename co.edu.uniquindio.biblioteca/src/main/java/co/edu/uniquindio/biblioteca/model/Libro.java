package co.edu.uniquindio.biblioteca.model;

public class Libro {
    public String title;
    public String gender;
    public String author;
    public Integer publicationYear;
    public String editorial;
    public Integer pageNumber;

    // MÉTODOS

    public String getTitle(){
        return this.title;
    }

    public String getGender(){
        return this.gender;
    }

    public String getAuthor(){
        return this.author;
    }
    public Integer getPublicationYear(){
        return this.publicationYear;
    }

    public String getEditorial(){
        return this.editorial;
    }

    public Integer getPageNumber(){
        return this.pageNumber;
    }
    
}
