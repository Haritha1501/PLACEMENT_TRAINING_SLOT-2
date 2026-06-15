class Current{
private String userName;
void setName(String userName){
this.userName = userName;
}
String getName(){
return userName;
}
}
public class GetSet{
public static void main(String[] args){
Current student = new Current();
student.setName("Bhava MS");
System.out.println(student.getName());
}
}
