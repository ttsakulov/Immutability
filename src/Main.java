public class Main {
    public static void main(String[] args) {
        Book book = new Book("Руслан и Людмила", "А.С.Пушкин", 264, "978-5-389-13586-4");
        System.out.println("Название книги - " + book.getName());
        System.out.println("Автор - " + book.getAuthor());
        System.out.println("Количество страниц - " + book.getCountOfPages());
        System.out.println("Номер ISBN - " + book.getISBN());
    }
}