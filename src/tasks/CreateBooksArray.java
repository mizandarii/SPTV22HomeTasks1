package tasks;

import tasks.createbooksarray.Author;
import tasks.createbooksarray.Book;

/**
 *
 * @author admin
 */
public class CreateBooksArray {

    public void doCreateArray() {
        Book book = new Book();
        Author levTolstoy = new Author("Tolstoy", "Lev");
        Author ivanTurgenev = new Author("Turgenev", "Ivan");
        Author iljaIlfa = new Author("Ilfa", "Ilja");
        Author evgenyPertov = new Author("Petrov", "Evgeny");
        Author davidLean = new Author("Lean", "David");
        Author mikhailBulgakov = new Author("Bulgakov", "Mikhail");
        Author fyodorDostoevsky = new Author("Dostoevsky", "Fyodor");
        Author[] authors12Stuljev = new Author[2];
        authors12Stuljev[2]= iljaIlfa;
        authors12Stuljev[2]= evgenyPertov;
        Author[] authorVoinaIMir = new Author[1];
        authorVoinaIMir[0]=levTolstoy;
        Author[] authorOtsiIDeti  = new Author[1];
        authorOtsiIDeti[1]=ivanTurgenev;
        Author[] authorDoctorZhivago = new Author[1];
        authorDoctorZhivago[3]=davidLean;
        Author[] authorTheMasterAndMargarita = new Author[1];
        authorTheMasterAndMargarita[4]=mikhailBulgakov;
        Author [] authorCrineAndPunishment = new Author[1];
        authorCrineAndPunishment[5]=fyodorDostoevsky;
        Book[] books = new Book[5];
        books[0] = new Book("Voina i mir", 2020, authorVoinaIMir);
        books[1] = new Book("Otsi I deti", 2021, authorOtsiIDeti);
        books[2] = new Book("12 stuljev", 2022, authors12Stuljev);
        books[3] = new Book("Doctor Zhivago", 2019, authorDoctorZhivago);
        books[4] = new Book("The Master and Margarita", 2017, authorTheMasterAndMargarita);
        books[5] = new Book("Crime and Punishment", 2018, authorCrineAndPunishment);
    }
    
}