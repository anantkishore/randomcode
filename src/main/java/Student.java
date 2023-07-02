public class Student {
    String name;
    int age;
    String sex;
    String standard;

    public void study(){
        System.out.println("barking...");
    }



    public static void main(String[] args) {

        Student anant = new Student();
        anant.age = 33;
        anant.name = "anant kishore";
        anant.sex = "male";
        anant.standard = "BE";

        Student kk = new Student();
        kk.age = 33;
        kk.name = "krishan kant";
        kk.sex = "male";
        kk.standard = "BE";

        System.out.println(anant.toString());
        System.out.println(kk.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }
}
