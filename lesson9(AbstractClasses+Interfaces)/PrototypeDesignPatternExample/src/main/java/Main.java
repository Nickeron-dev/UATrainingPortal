import entity.BookShop;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setName("BookShop");
        bookShop.loadData();
        System.out.println(bookShop);

        BookShop bs1 = bookShop.clone();
        System.out.println(bs1);
    }
}
