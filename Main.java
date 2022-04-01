package kombinasyonHesaplama;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Klavyeden girilen N elemanlý kümenin R gruplu kombinasyonunu hesaplayan program
		//C(n,r) = n! / (r! * (n-r)!)
		Scanner scanner=new Scanner(System.in);
		long n,r,nFaktoriyel=1,rFaktoriyel=1,farkFaktoriyel=1,formul;
		System.out.println("Kümenin kaç elemanlý olduðunu giriniz:");
		n=scanner.nextLong();
		System.out.println("Kaçlý grup kombinasyonu hesaplanacak?");
		r=scanner.nextLong();
		
		for(int i=1;i<n+1;i++) {
			nFaktoriyel*=i;
			
		}
		for(int j=1;j<=r;j++) {
			rFaktoriyel*=j;
		}
		for(int k=1;k<=(n-r);k++) {
			farkFaktoriyel*=k;
		}		
		formul=nFaktoriyel/(rFaktoriyel*farkFaktoriyel);		
		System.out.println(n+ " elemanlý kümenin "+r +" gruplu faktöriyeli "+formul+"dür" );
	}

}
