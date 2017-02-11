package reflectionLearn;

@MyAnno(place = "Student Class Annotation", setting = "class setting")
public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @SpecialMethod
    public @MyAnno(place = "Return Annotation12", setting = "setting x") Student shoutName(@MyAnno(place = "Parameter Annotation") String slogan) {
            System.out.println(getName() + slogan);
            return this;
    }

    public String getName() {
        return name;
    }
}
