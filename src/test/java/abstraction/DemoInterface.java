package abstraction;

public class DemoInterface implements Calcs, SuperClass {

	public void multipulication(int x, int y) {
		// TODO Auto-generated method stub
		
		int m = x * y;
		System.out.println(m);
			
		
	}
	public void sqrt(int x){
		
		double s = Math.sqrt(x);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		DemoInterface di = new DemoInterface();
		di.sqrt(16);
		di.multipulication(10, 3);
	}
	
	

}
