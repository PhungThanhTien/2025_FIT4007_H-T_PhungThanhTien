import java.time.Year;

class Student {
    // Thuộc tính
    private String studentId;
    private String fullName;
    private int birthYear;
    private String address;

    // Constructor 1: chỉ có mã SV và họ tên
    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    // Constructor 2: đầy đủ thông tin
    public Student(String studentId, String fullName, int birthYear, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.address = address;
    }

    // Getter và Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Tính tuổi
    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("Thông tin sinh viên: - Mã sinh viên: " + studentId 
                         + " - Họ tên: " + fullName 
                         + " - Năm sinh: " + birthYear 
                         + " - Địa chỉ: " + address);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        // Tạo sinh viên bằng constructor đầy đủ
        Student sv = new Student("151234", "Nguyen Van A", 1997, "123 Nguyen Trai, Thanh Xuan, Ha Noi");

        // In thông tin sinh viên
        sv.displayInfo();

        // In tuổi sinh viên
        System.out.println("Tuổi của sinh viên: " + sv.getAge() + " tuổi");
    }
}

