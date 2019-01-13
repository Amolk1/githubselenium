package appModules;

class Platinus{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Platinus(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String[] args){  
    //creating objects and passing values  
    Platinus s1 = new Platinus(111,"Karan");  
    Platinus s2 = new Platinus(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  