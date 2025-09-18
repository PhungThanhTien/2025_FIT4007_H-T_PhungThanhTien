+-------------------+
|       Book        |
+-------------------+
| - bookId: String  |
| - title: String   |
| - price: double   |
| - discount: double|
+-------------------+
| + Book(bookId: String, title: String) |
| + Book(bookId: String, title: String, price: double, discount: double) |
| + getBookId(): String                 |
| + setBookId(bookId: String): void     |
| + getTitle(): String                  |
| + setTitle(title: String): void       |
| + getPrice(): double                  |
| + setPrice(price: double): void       |
| + getDiscount(): double               |
| + setDiscount(discount: double): void |
| + getSalePrice(): double              |
| + displayInfo(): void                 |
+-------------------+

+-----------------------+
|        Student        |
+-----------------------+
| - studentId: String   |
| - fullName: String    |
| - yearOfBirth: int    |
| - address: String     |
+-----------------------+
| + Student(studentId: String, fullName: String) |
| + Student(studentId: String, fullName: String, yearOfBirth: int, address: String) |
| + getStudentId(): String                       |
| + setStudentId(studentId: String): void        |
| + getFullName(): String                        |
| + setFullName(fullName: String): void          |
| + getYearOfBirth(): int                        |
| + setYearOfBirth(yearOfBirth: int): void       |
| + getAddress(): String                         |
| + setAddress(address: String): void            |
| + getAge(): int                                |
| + displayInfo(): void                          |
+-----------------------+

+---------------------+
|       Circle        |
+---------------------+
| - radius: double    |
+---------------------+
| + Circle()          |
| + Circle(radius: double) |
| + getRadius(): double    |
| + setRadius(radius: double): void |
| + input(): void     |
| + output(): void    |
| + getArea(): double |
| + getCircumference(): double |
+---------------------+
