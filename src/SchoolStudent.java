public class SchoolStudent extends person {
    public String course;
    public SchoolStudent(String address, String courses){
        super(address);
    }
    public void getCourses(){
        System.out.println("Courses"+course);
    }

}
