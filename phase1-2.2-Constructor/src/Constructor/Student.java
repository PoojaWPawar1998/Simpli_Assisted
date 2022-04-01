package Constructor;

class Student{  
    int id;  
    String name;  
  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
  
    void display(){
    	
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
   
    	 Student s1 = new  Student(234,"Samar");  
    	 Student s2 = new  Student(672,"Aayush");  
    
        s1.display();  
        s2.display();  
   }  
}  