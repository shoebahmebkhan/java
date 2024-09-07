 class book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks=0;
    }
    {
         totalNoOfBooks++;
    }
    book(String isbn , String title , String author) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;

    }
    book(String isbn) {
        this(isbn, "Unknown", "Unkown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void  borrowBook(){
        if(isBorrowed){
            System.out.println("book is already borrowed");
        }else {
            this.isBorrowed=true;
            System.out.println("enjoy the book");
        }

    }

    void  returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("hope you enjoyed , please give review");
        }else {
            System.out.println("this book is already in labrary");
        }

    }

     public static void main(String[] args) {
         book theLove=new book("1","love","david");
         book thala=new book("2");
         System.out.println(book.getTotalNoOfBooks());
         theLove.borrowBook();
         thala.borrowBook();
         theLove.borrowBook();
         theLove.returnBook();
         theLove.returnBook();
     }

}
