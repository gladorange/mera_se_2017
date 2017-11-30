public class Author extends Person {
    private Book books[] = new Book[100];
    private int booksCount = 0;

    public Author(String authorName,
                  String authorSurname,
                  int authorDateOfBirth,
                  String authorCountry) {
        super(authorName, authorSurname, authorDateOfBirth, authorCountry);
    }

    public void addBook(Book book){
        //to do: add verification of array's size
        this.books[booksCount] = book;
        booksCount++;
    }

    public int getPages(){
        int commonPageNumber = 0;
        for(int i = 0; i < booksCount; i++){
            commonPageNumber+=books[i].pageNumber;
        }
        return commonPageNumber;
    }
}
