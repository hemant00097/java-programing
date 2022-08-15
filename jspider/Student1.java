 public class Student1{
    String FirstName(String fname)
    {
        return "$"+ fname;
    }
    String LastName(String lname)
    {
        return lname +"$";
    }
    void FullName(String fname,String lname)
    {
        String name=fname+" "+lname;
        System.out.println(name);
    }
    public static void main(String[] args) 
    {
        Student1 S1=new Student1();
        String X=S1.FirstName("RAHUL");
        String Y=S1.LastName("PATEL");
        S1.FullName(X,Y);
    }


}