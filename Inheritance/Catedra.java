public class Catedra extends Teacher {
private String courseName;

public Catedra(String name, String lastName, String id, String docType, String CourseName){
super(name, lastName, id, docType);
this.courseName = CourseName;
    }

public void setCourseName(String courseName) {
    this.courseName = courseName;
}

public String getCourseName() {
    return courseName;
}

@Override
public String toString() {
    return super.toString() + " courseName=" + courseName;
}


}
