package builder.exercise;

public class TestBuilder {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder(21002117, "LDA")
                .setEmail("luongducanh_t66@hus.edu.vn")
                .setBirthday("10/05/2003")
                .build();
        System.out.println(student);
    }
}
