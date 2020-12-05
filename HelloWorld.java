
public class HelloWorld {
	
	static int j=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld object = new HelloWorld();
		object.welcome();
		
		for(int i=0;i<10;i++) {
			
			int res=j*(i+1);
			System.out.println(j+"*"+(i+1)+"="+res);
			
		}
		
		object.tearDown();

	}
	
	public void welcome() {
		
		System.out.println("Welcome to Git");
	}
	
	public void tearDown() {
		
		System.out.println("Good Bye from Git");
	}

}
