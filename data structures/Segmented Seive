// Java program to print print all primes range between m and n
//using segmented sieve 


import java.util.ArrayList; 
import static java.lang.Math.sqrt; 
import static java.lang.Math.floor; 

public class Test 
{ 
	// This method finds all primes sqrt(high)
	// using simple sieve of eratosthenes. It also stores 
	// found primes in ArrayList prime[] 
	static void simpleSieve(int limit, ArrayList<Integer> prime) 
	{ 
		// Create a boolean array "mark[0..n-1]" and initialize 
		// all entries of it as true. A value in mark[p] will 
		// finally be false if 'p' is Not a prime, else true. 
		boolean mark[] = new boolean[limit+1]; 
		
		for (int i = 0; i < mark.length; i++) 
			mark[i] = true; 
	
		for (int p=2; p*p<=limit; p++) 
		{ 
			// If p is not changed, then it is a prime 
			if (mark[p] == true) 
			{ 
				// Update all multiples of p 
				for (int i=p*2; i<=limit; i+=p) 
					mark[i] = false; 
			} 
		} 
	
		// Print all prime numbers and store them in prime 
		for (int p=2; p<=limit; p++) 
		{ 
			if (mark[p] == true) 
			{ 
				prime.add(p); 
			 
			} 
		} 
		
	} 
	
	// Prints all prime numbers in range between  high and low
	static void segmentedSieve(int low,int high) 
	{ 
		// Compute all primes smaller than or equal 
		// to square root of high using simple sieve 
		int sqroot = (int) (floor(sqrt(high))); 
		ArrayList<Integer> prime = new ArrayList<>(); 
		simpleSieve(sqroot, prime); 
	
		// Divide the range [low..high] in different segments 
		// We have chosen segment size as sqrt(high). 
		
	
		// While all segments of range [low..high] are not processed, 
		// process one segment at a time 
		
			// To mark primes in current range. A value in mark[i] 
			// will finally be false if 'i-low' is Not a prime, 
			// else true. 
			boolean mark[] = new boolean[high-low+1]; 
			
			for (int i = 0; i < mark.length; i++) 
				mark[i] = true; 
	
			// Use the found primes by simpleSieve() to find 
			// primes in current range 
			for (int i = 0; i < prime.size(); i++) 
			{ 
				// Find the minimum number in [low..high] that is 
				// a multiple of prime.get(i) (divisible by prime.get(i)) 
				// For example, if low is 31 and prime.get(i) is 3, 
				// we start with 33. 
				int loLim = (int) (floor(low/prime.get(i)) * prime.get(i)); 
				if (loLim < low) 
					loLim += prime.get(i); 
	
				/* Mark multiples of prime.get(i) in [low..high]: 
					and mark that numbers;
					for range */
				for (int j=loLim; j<=high; j+=prime.get(i)) 
					mark[j-low] = false; 
			    
			    if(loLim==prime.get(i))
			    {
			        mark[loLim-low]=true;
			    }
			
			} 
	        
	        int start=low;
	        if(low==1)
	        {
	            start=2;
	        }
			// Numbers which are not marked as false are prime 
			for (int i = start; i<=high; i++) 
				if (mark[i - low] == true) 
					System.out.print(i + " "); 
	
		
		
	} 
	
	// Driver method 
	public static void main(String args[]) 
	{ 
		int m=10, n = 20; 
		System.out.println("Primes in range between "+m+" to " + n + " are :-"); 
		segmentedSieve(m,n); 
	} 
} 
