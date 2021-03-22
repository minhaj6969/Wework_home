package abstraction;

public class AdvancedCalcs extends BasicCalcs{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedCalcs bc = new AdvancedCalcs();
		bc.add(10, 10);
		

	}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		int add = x + y;
		System.out.println(add);
		
		
	}

	

}
