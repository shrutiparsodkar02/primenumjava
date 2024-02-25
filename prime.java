class Prime{
	static int primecount=0;
	static int nonprimecount=0;
	public static boolean isPrime(long num){
		if(num<2){
			return false;
			}
		else if(num==2 || num==3){
		return true;
		}
		else if(num%2==0||num%3==0){
		return false;
		}
		for(int i=5;i<num;i=i+6){
			if(num%i==0||num%(i+2)==0){
			return false;
			}
			else{
			return true;
			}
			}
		return true;
	}
	
	
	public static long genrate_1_digit_num(){
	//here we are genrating randomly 1 digit number
	long n1=System.nanoTime();
	//System.out.println(n1);
	long num=(n1%10);
	//System.out.println(num);
	return num;
	}
	
	public static long genrate_7_digit_num(){
	long num_7=0;
	for(int i=0;i<7;i++){
	num_7=num_7*10+genrate_1_digit_num();
	}
	//System.out.print(num_7);
	return num_7;
	}
	public static long[] genrate_10lakh_array(){
	//it will store 10lakhs number in that array
	//in that we will pass genrate 7 random number function 
		long[] arr=new long[1000000];
		for(int i=0;i<1000000;i++){
		arr[i]=genrate_7_digit_num();
		//System.out.println(arr[i]);
		}
		return arr;
	}
	public static void countPrimeNumBy_ifelse(long arr[]){
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])==true){
				primecount++;
				}
			else{
			nonprimecount++;
			}
	
	}
	}
	public static void countPrimeNumBy_elseif(long arr[]){
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])!=true){
				nonprimecount++;
				}
			else{
			primecount++;
			}
	
	}
	}
	public static void main(String args[]){
	long arr[]=genrate_10lakh_array();
	System.out.println("approach 1");
		
	int i=0;
	while(i<5){
	long starttime=System.nanoTime();
	countPrimeNumBy_ifelse(arr);
	long endtime=System.nanoTime();
	System.out.println("prime count--"+primecount);
	System.out.println("non prime count --"+nonprimecount);
	System.out.println("start time and end time diffrence --"+(endtime-starttime));
	primecount=0;
	nonprimecount=0;
	i++;
	}
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("approach 2");
		
	//approach 2
	int j=0;
	while(j<5){
	long starttime=System.nanoTime();
	countPrimeNumBy_elseif(arr);
	long endtime=System.nanoTime();
	System.out.println("prime count--"+primecount);
	System.out.println("non prime count --"+nonprimecount);
	System.out.println("start time and end time diffrence --"+(endtime-starttime));
	primecount=0;
	nonprimecount=0;
	j++;
	}
}
}
	
