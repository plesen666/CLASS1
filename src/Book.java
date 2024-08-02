public class Book {
    private Author author;//тип данных состоящий из String firstName, String lastName
    private String titleName;
    private int publicationYear;

    public Book(Author author, String titleName, int publicationYear) {
        this.author = author;
        this.titleName = titleName;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getTitleName() {
        return this.titleName;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    @Override
    //  Не понимаю эту часть кода
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(titleName, author) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return publicationYear.hash(author, titleName);
    }

}

}

