import java.util.*;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return id + " - " + name + " - " + course;
    }
}

interface Dao<T, K> {
    void save(T obj);
    T find(K id);
    List<T> findAll();
}

class StudentDao implements Dao<Student, Integer> {

    ArrayList<Student> students = new ArrayList<>();

    public void save(Student s) {
        students.add(s);
    }

    public Student find(Integer id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    public List<Student> findAll() {
        return students;
    }
}

public class Main {

    public static void main(String[] args) {

        StudentDao dao = new StudentDao();

        dao.save(new Student(101, "Sirisha", "CSE"));
        dao.save(new Student(102, "Bhavya", "CSE"));
        dao.save(new Student(103, "Bhuvana", "AI"));

        System.out.println("All Students:");

        for (Student s : dao.findAll()) {
            System.out.println(s);
        }

        System.out.println("\nSearching Student ID 102:");

        Student result = dao.find(102);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Student not found");
        }
    }
}
