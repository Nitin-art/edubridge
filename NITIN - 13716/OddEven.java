public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0, even=0;
       for(int i=1;i<=50;i++)
       {
    	   if(i%2==0)
    	   {
    		   even=even+i;
    	   }else {
    		   odd=odd+i;
    	   }
       }
       System.out.println(odd);
       System.out.println(even);
	}
	

}
