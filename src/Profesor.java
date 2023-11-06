package src;

public class Profesor extends Person{
    public String[] courses;

    public String[] getCourses(){
        return this.courses;
    }
    public void setCourses(String[] courses){
        this.courses=courses;
    }
}
