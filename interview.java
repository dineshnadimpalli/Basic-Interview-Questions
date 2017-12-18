
//Interview Questions
import java.util.*;

public class inter{

	String reverse = "";

	public void fibonacci(int count){
		int n0=0,n1=1;
		System.out.print(n0+" "+n1+" ");
		for(int i=0;i<count;i++){
			int s = n0+n1;
			System.out.print(s+" ");
			n0=n1;
			n1=s;

		}
	}

	public void prime(int num){
		int count=0;
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i==0){
				count=1;
				System.out.println("not a prime");
				break;
			}
		}
		if(count==0){
				System.out.println("prime");

		}

	}

	public void swap(int a,int b){
		System.out.println("before swaap :\n" +"a="+a+"  b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swaap :\n" +"a="+a+"  b="+b);

	}

	public void swapwithouttemp(int a,int b){
		System.out.println("before swaap :\n" +"a="+a+"  b="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swaap :\n" +"a="+a+"  b="+b);

	}

	public void strreverse(String str){
		char[] a = str.toCharArray();
		int left=0,right=a.length-1;
		for(left=0,right=a.length-1;left<right;left++,right--){
			char temp=a[left];
			a[left]=a[right];
			a[right]=temp;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);

		}


	}

	public String reverseStringRecursion(String str){
         
        if(str.length() == 1){
            return str;
        } 
        else {
            reverse += str.charAt(str.length()-1) + reverseStringRecursion(str.substring(0,str.length()-1));
            return reverse;
        }
    }

    public void reversearray(){
       int size, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
       size = scan.nextInt();
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   j = size - 1;     // now j will point to the last element
       i = 0;         // and i will point to the first element
	   while(i<j)
       {
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
	   System.out.print("Now the Reverse of Array is : \n");
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i]+ "  ");
       }       
   }

   public void reverseNum(int num){
   	int reverse=0;
   		while(num!=0){
   			int d= num/10;
   			int r= num%10;
   			reverse = reverse*10 + r;
   			num=d;
   		}
   	System.out.println(reverse);
   }

   public void fact(){
   		Scanner sc = new Scanner(System.in);
   		int num= sc.nextInt();
   		long fact=1;
   		for(int i=num;i>0;i--){
   			fact = fact*i;
   		}
   		System.out.println(fact);
	}

	public void sumofdigits(){
		Scanner sc = new Scanner(System.in);
   		int num= sc.nextInt();
   		int sum=0;
   		while(num!=0){
   			int d= num/10;
   			int r= num%10;
   			sum += r;
   			num=d;
   		}
   		System.out.println(sum);

	}

	public void pangram(){
		Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int a[]=new int[26];
        int l=s.length();
        for(int i=0;i<26;i++){
            a[i]=0;
        }
        for(int i=0;i<l;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                a[(int)s.charAt(i)-'a']++;
            }
            if(s.charAt(i)>'A' && s.charAt(i)<'Z'){
                a[(int)s.charAt(i)-'A']++;
            }
        }
        for(int i=0;i<26;i++){
            if(a[i]==0){
                System.out.println("not pangram");
                return;
            }
            
        }
      System.out.println("pangram");
 	}
        
   


    
	public static void main(String[] args){
		inter ques = new inter();
		//ques.fibonacci(10);
		//ques.prime(59);
		//ques.swap(10,12);
		//ques.swapwithouttemp(10,12);
		//ques.strreverse("Will get a job soon");
		//System.out.println("Reverse string is: "+ques.reverseStringRecursion("Will get a job soon"));
		//ques.reversearray();
		//ques.reverseNum(123456);
		//ques.fact();
		//ques.sumofdigits();
		ques.pangram();

	}
}