public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("HI");

		Cal cal = new Cal();

		//Test
		System.out.println("getGop(3,5) : " + cal.getGop(3,5));
		System.out.println("getZegop(3) : " + cal.getZegop(3));
    }
}

class Cal {
	int getGop(int a, int b) {
		return a * b;
	}

	int getZegop(int a) {
		return a * a;
	}
}