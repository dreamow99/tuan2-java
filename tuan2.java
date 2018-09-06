/**
* Student la class de bieu dien 1 sv
* @param name la ten cua sv
* @param id la mssv
* @param group la nhom cua sv
* @param email la mail cua sv

*/
class Student {
  private String name;
  private String id;
  private String group;
  private String email;
  public Student(){
    this.name = "Student";
    this.id = "000";
    this.group = "K59CB";
    this.email = "uet@vnu.edu.vn";
  }
  public Student(String n, String sid, String em){
    this.name = n;
    this.id = sid;
    this.group = "K59CB";
    this.email = em;
  }
  public Student(Student s){
    this.name = s.name;
    this.id = s.id;
    this.group = s.group;
    this.email = s.email;
  }
  /**
  * getName de lay ten cua sv
  */
  public String getName(){
    return this.name;
  }
  /**
  * ham setName de dat ten
  */
  public void setName(String n){
    this.name = n;
  }
  /**
  * getName de lay ten cua sv
  */
  public String getId(){
    return this.id;
  }
  /**
  * ham setName de dat ten
  */
  public void setId(String n){
    this.id = n;
  }
  /**
  * getName de lay ten cua sv
  */
  public String getGroup(){
    return this.group;
  }
  /**
  * ham setName de dat ten
  */
  public void setGroup(String n){
    this.group = n;
  }
  /**
  * getName de lay ten cua sv
  */
  public String getEmail(){
    return this.email;
  }
  /**
  * ham setName de dat ten
  */
  public void setEmail(String n){
    this.email = n;
  }
  String getInfo(){
    String info = name + " " + id + " " + group + " " + email;
    return info;
  }
}
public class tuan2 {
  public static boolean sameGroup(Student s1, Student s2){
    if (s1.getGroup() != s2.getGroup()) return false;
    return true;
  }
  public static void main(String[] args) {
    Student sv1 = new Student();
    Student sv2 = new Student();
    Student sv3 = new Student();
    sv1.setName("Pham Duy");
    sv1.setId("11171963");
    sv1.setEmail("dreamow9@gmail.com");
    sv1.setGroup("1");
    sv3.setGroup("K59CLC");
    System.out.println(sv1.getName());
    System.out.println(sv1.getInfo());
    System.out.println(sv2.getInfo());
    System.out.println(sv3.getInfo());
    System.out.println(sameGroup(sv2, sv3));
  }
}
