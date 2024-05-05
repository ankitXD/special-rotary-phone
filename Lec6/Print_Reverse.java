package Lec6;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
        int n= -891;
        System.out.println(reverse(n));
	}
	public static int reverse(int n) {
		 int rev=0;
	     	while(n>0)
	     	{
	          int rem=n%10;
	          rev=rev*10+rem;
	          
	          n/=10;
	          
	     	}
		return rev;
	}

}
