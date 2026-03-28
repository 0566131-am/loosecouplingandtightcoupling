package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Book Details ===");
        Author author = new AuthorImpl("John Doe", "An experienced writer in fiction.");
        Book book = new Book("The Great Adventure", author);
        System.out.println("Book Title:  " + book.getTitle());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Bio:  " + book.getAuthor().getBio());

        System.out.println("\n=== Department 1 Details ===");
        Employee e1 = new EmployeeImpl("mubeena", 1, "Computer Science");
        Department d1 = new DepartmentImpl("Computer Science", "Block A", e1);
        d1.displayDetails();

        System.out.println("\n=== Department 2 Details ===");
        Employee e2 = new EmployeeImpl("sweety", 2, "Information Technology");
        Department d2 = new DepartmentImpl("Information Technology", "Block B", e2);
        d2.displayDetails();
    }
}
