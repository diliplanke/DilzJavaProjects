
public class EchoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Echo e1 = new Echo();
		Echo e2 = new Echo();
		int x = 0;
		while (x < 4){
			e1.hello();
			if ( x < 5  ){
				e2.count = e2.count + 1;
				e1.count = e1.count + 1;
			}
			if ( x < 5 ){
				e1.count = e1.count + 1;
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
			
		}
		System.out.println(e2.count);
	}

}
