public class Main {
    public static void main(String[] args) {

    		System.out.println("HI");
    	}
		public int getSum(int a, int b) {
			return a + b;
		}

    public int getDivie(int a, int b){
        if(b==0) throw new ArithmeticException("Divie by zero");
        return a/b;
    }

    public int getSumSum(int a, int b, int c){
        return a + b + c;
    }

}