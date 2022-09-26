public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a[]=new int[3];
    	   a[3]=40/0;
       }
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("In catch Block");
       }
	}

}
