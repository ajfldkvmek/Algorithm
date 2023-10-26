class Solution {
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String s1 = "";
        String s2 = "";
        
        for(int i = 0; i < n; i++){
            String res= "";
            s1 = bin(arr1[i], n);
            s2 = bin(arr2[i], n);
            for(int j = 0; j < n; j++){
                if(s1.charAt(j) == '0' && s2.charAt(j) == '0') {
                    res = " "+res;
                }
                else res = "#"+res;
            }
            
            answer[i] = res;
        }
        
        return answer;      

    }
    

       public String bin(int num, int n) {
    	
    	String s1 = "";    	
    	while(true) {    		
    		s1 = s1+num%2;
    		num=num/2;    		
    		if(num <= 0) break;
    	} 
         if(s1.length() < n) {
    		for(int i = s1.length(); i < n; i++) {
    			s1 = s1+0;
    		}
    	}
    	return s1;
    }    
}