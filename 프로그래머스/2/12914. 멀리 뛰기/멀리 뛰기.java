import java.util.HashMap;
import java.util.Map;

class Solution {
		private Map<Integer, Long> fibo = new HashMap<>();
	
	public long solution(int n) {
	    if (n <= 3) {
	        return n;
	    } 
	    if(fibo.containsKey(n)) return fibo.get(n);
	    
	    long fib = (solution(n - 1) + solution(n - 2)) % 1234567;
	    fibo.put(n, fib);
	    return fib;
	}
}