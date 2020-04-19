package JDK8Feature;

	@FunctionalInterface 
	interface MyInterface{  
	    void display();  
	}  
	public class MethodReferences {  
	    public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
	    MethodReferences obj = new MethodReferences();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  
	}