class Book {
    // Thuộc tính
    private String bookId;
    private String title;
    private double price;
    private double discount;

    // Constructor 1: chỉ có mã sách và tên sách
    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    // Constructor 2: đầy đủ thông tin
    public Book(String bookId, String title, double price, double discount) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.discount = discount;
    }

    // Getter và Setter
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Tính giá bán
    public double getSalePrice() {
        return price - discount;
    }

    // Hiển thị thông tin sách
    public void displayInfo() {
        System.out.println("Thông tin quyển sách: - Mã số sách: " + bookId +
                           " - Tên sách: " + title +
                           " - Giá sách: " + price +
                           " - Giảm giá: " + discount);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        // Tạo sách với đầy đủ thông tin
        Book book = new Book("B1234", "Mindset", 70000, 7000);

        // Xuất thông tin và giá bán ban đầu
        System.out.print("Thông tin quyển sách hiện tại: ");
        book.displayInfo();
        System.out.println("Giá bán của sách: " + book.getSalePrice());

        // Thay đổi giảm giá
        book.setDiscount(24000);

        // Xuất thông tin và giá bán mới
        System.out.print("Thông tin quyển sách sau khi cập nhật: ");
        book.displayInfo();
        System.out.println("Giá bán của sách: " + book.getSalePrice());
    }
}
