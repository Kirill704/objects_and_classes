public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Дмитрий", "Сивухин");
        Author author2 = new Author("Наталья", "Карпушина");
        Book book1 = new Book("Атомная и ядерная физика", author1, 2008);
        Book book2 = new Book("Вне формата", author2, 2012);
        System.out.println("Книга: " + book1.getTitle() + ", автор: " + book1.getAuthor().getAuthor1() + ", год издания: " + book1.getYear());
        System.out.println("Книга: " + book2.getTitle() + ", автор: " + book2.getAuthor().getAuthor1() + ", год издания: " + book2.getYear());
        book2.setYear(2013);
        System.out.println("Книга: " + book2.getTitle() + ", автор: " + book2.getAuthor().getAuthor1() + ", год издания: " + book2.getYear());
    }
}
