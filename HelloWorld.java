
public class HelloWorld {
	
	static int j=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld object = new HelloWorld();
		object.welcome();
		
		for(int i=1;i<=10;i++) {
			
			int res=j*i;
			System.out.println(j+"*"+i+"="+res);
			
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
