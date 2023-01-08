package ex1.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student("AA", "NY", "C", 2021, 15000);
        System.out.println("name is " + s1.getName()
                + ", address is " + s1.getAddress()
                + ", program is " + s1.getProgram()
                + ", year is " + s1.getYear()
                + ", fee is " + s1.getFee());
        s1.setFee(123000);
        s1.setYear(2022);
        s1.setProgram("D");
        s1.setAddress("LA");
        System.out.println(s1);

        Staff staff = new Staff("BB", "CL", "D", 1234445);
        System.out.println("name is " + staff.getName()
                + " address is " + staff.getAddress()
                + " school is " + staff.getSchool()
                + " pay is " + staff.getPay());
        System.out.println(staff);
    }
}
