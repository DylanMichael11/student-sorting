package studentmanagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create ArrayList to store students
        ArrayList<Student> students = new ArrayList<>();
        
        // Add 10 students
        students.add(new Student(104, "Alice", "123 Main St"));
        students.add(new Student(102, "Bob", "456 Oak Ave"));
        students.add(new Student(106, "Charlie", "789 Pine Rd"));
        students.add(new Student(101, "David", "321 Elm St"));
        students.add(new Student(105, "Eve", "654 Maple Dr"));
        students.add(new Student(103, "Frank", "987 Cedar Ln"));
        students.add(new Student(108, "Grace", "147 Birch Rd"));
        students.add(new Student(107, "Henry", "258 Spruce Ave"));
        students.add(new Student(110, "Ivy", "369 Willow St"));
        students.add(new Student(109, "Jack", "741 Pine Ct"));
        
        // Print original list
        System.out.println("Original List:");
        printStudents(students);
        
        // Sort by name
        SelectionSort.sort(students, new StudentNameComparator());
        System.out.println("\nSorted by Name:");
        printStudents(students);
        
        // Sort by roll number
        SelectionSort.sort(students, new StudentRollNoComparator());
        System.out.println("\nSorted by Roll Number:");
        printStudents(students);
    }
    
    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}