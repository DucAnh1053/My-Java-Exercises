package builder.exercise;

public class Student {
    private final int id;
    private final String name;
    private final String email;
    private final String birthday;

    public Student(int id, String name, String email, String birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private String email;
        private String birthday;

        public StudentBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Student build() {
            return new Student(this.id, this.name, this.email, this.birthday);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
