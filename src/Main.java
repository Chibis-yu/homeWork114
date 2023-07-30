public class Main {
    public static void main(String[] args) {
        Author kovi = new Author("Стивен", "Кови");
        Author karnegi = new Author("Дейл", "Карнеги");

        Book theSevenHabitsOfHighlyEffectivePeople = new Book("7 навыков высокоэффективных людей", kovi, 1989);
        Book howToWinFriends = new Book("Как завоевывать друзей", karnegi, 1935);

        printBook(theSevenHabitsOfHighlyEffectivePeople);
        printBook(howToWinFriends);

        howToWinFriends.setPublishingYear(2012);
        printBook(howToWinFriends);

    }
    private static void printBook(Book book) {
        System.out.println(book.getTitle() + " " + book.getPublishingYear() + " " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
    }
}