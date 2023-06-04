// java - Class Reflection
import java.lang.Class;
class Class_Data{
    public static void main(String[] args){
        A a = new A(100,"Welcome");
        a.display();
        
        try{
            // reflection using getclass methode
        Class a1 = a.getClass();

        // refletion using forname methode
        // Class a2 = Class.forName("A", false, null);

        // reflection using class extension
        // Class a3 = A.class;

        System.out.println("class name : "+a1.getName());
        System.out.println("class modifiers : "+a1.getModifiers());
        System.out.println("super class : "+a1.getSuperclass());
        }catch(Exception e){
            System.out.println("Error Occured !");
        }
    }
}
class A{
    int num;
    String str;
    A(int num,String str){
        this.num = num;
        this.str = str;
    }
    public void display(){
        System.out.println("Class Data : "+num+' '+str);
    }
}