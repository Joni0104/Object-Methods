public class Main {
    public static void main(String[] args) {

        Author chekhov1 = new Author("Антон", "Чехов");
        Author chekhov2 = new Author("Антон", "Чехов");
        Author turgenev = new Author("Иван", "Тургенев");


        Book gull = new Book("Чайка", chekhov1, 1895);
        Book gull2 = new Book("Чайка", chekhov2, 1895);
        Book fathersAndChildren = new Book("Отцы и дети", turgenev , 1862);


        System.out.println("toString()");
        System.out.println(chekhov1);
        System.out.println(gull);

        System.out.println("equals() для авторов");
        System.out.println(" equals()");
        System.out.println(chekhov1.equals(chekhov2));
        System.out.println(chekhov1.equals(turgenev));

        System.out.println("equals() для книг");
        System.out.println(gull.equals(gull2));
        System.out.println(gull.equals(fathersAndChildren));


        System.out.println("hashCode()");
        System.out.println((chekhov1.hashCode() == chekhov2.hashCode()));
        System.out.println((chekhov1.hashCode() == turgenev.hashCode()));

    }
}