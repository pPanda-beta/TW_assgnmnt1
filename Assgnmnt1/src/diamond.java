/**
 * Created by palashd on 11/02/2017.
 */
public class diamond {
	
	public static void isosceles(int n){
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	public static void diamond(int n){ //This is not constructor! - its black magic
		
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println("");
		}
		
		for(int i=n-1;i>=1;i--){
			for(int j=i+1;j<=n;j++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	public static void diamond(int n,String nm){ //This is also not constructor! - its black magic
		
		for(int i=1;i<=n-1;i++){
			for(int j=i+1;j<=n;j++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println("");
		}
		System.out.println(nm);
		for(int i=n-1;i>=1;i--){
			for(int j=i+1;j<=n;j++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	public static void main(String... args){
		System.out.println("Pattern : ");
		isosceles(3);
		System.out.println("Pattern : ");
		diamond(3);
		System.out.println("Pattern : ");
		diamond(3,"Billy");
		
	}
	
}
