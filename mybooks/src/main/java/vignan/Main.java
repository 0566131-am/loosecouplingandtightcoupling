package vignan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("mubeena");
        System.out.println("hi i am learning java fundas");

        // Author objects
        Author me = new Author();
        me.setName("mubeena");
        me.setBio("a passionate java developer");

        Author you = new Author();
        you.setName("sweety");
        you.setBio("a passionate java developer");

        // Book objects
        Book b1 = new Book();
        b1.setTitle("java for beginners");
        b1.setPrice(500);
        b1.setObj(me);

        Book b2 = new Book();
        b2.setTitle("java for beginners");
        b2.setPrice(500);
        b2.setObj(you);

        System.out.println("book name is " + b1.getTitle());
        System.out.println("book price is " + b1.getPrice());
        System.out.println("book author is " + b1.getObj().getName());
        System.out.println("book name is " + b2.getTitle());
        System.out.println("book price is " + b2.getPrice());
        System.out.println("book author is " + b2.getObj().getName());

        // ✅ Department objects
        Department d1 = new Department();
        d1.setName("Computer Science");
        d1.setCode(101);

        Department d2 = new Department();
        d2.setName("Information Technology");
        d2.setCode(102);

        System.out.println("Department Name: " + d1.getName());
        System.out.println("Department Code: " + d1.getCode());
        System.out.println("Department Name: " + d2.getName());
        System.out.println("Department Code: " + d2.getCode());

        // ✅ Employee objects
        Employee e1 = new Employee();
        e1.setName("mubeena");
        e1.setId(1);
        e1.setDepartment(d1.getName());

        Employee e2 = new Employee();
        e2.setName("sweety");
        e2.setId(2);
        e2.setDepartment(d2.getName());

        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Department: " + e1.getDepartment());
        System.out.println("Employee Name: " + e2.getName());
        System.out.println("Employee ID: " + e2.getId());
        System.out.println("Employee Department: " + e2.getDepartment());
    }
}
