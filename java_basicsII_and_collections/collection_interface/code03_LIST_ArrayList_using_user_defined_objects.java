import java.util.ArrayList;
import java.util.Iterator;

class Student{
  int rollno;
  String name;
  int age;
  Student(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
  }
}

class TestCollection3{
 public static void main(String args[]){

  Student s1=new Student(101,"Sara",23);
  Student s2=new Student(102,"Pino",21);
  Student s3=new Student(103,"Javier",25);

  ArrayList<Student> al=new ArrayList<Student>();
  al.add(s1);
  al.add(s2);
  al.add(s3);

  Iterator<Student> itr=al.iterator();
  Student st;
  while(itr.hasNext()){
    st = itr.next();
    System.out.println(st.rollno+" "+st.name+" "+st.age);
  }
  System.out.println(itr);
 }
}
