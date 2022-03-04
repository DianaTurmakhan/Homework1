class Solution {
    public String restoreString(String s, int[] indices) {
         char[] ch = new char[s.length()];
         for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        StringBuilder res = new StringBuilder(s);
        for(int i =0; i < indices.length; ++i){
            res.setCharAt(indices[i],ch[i]);
      }
        return res.toString();
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        int result=x;
        int reverse=0;
        int sum=0;
        while(x!=0){
            if (x<0){
                return false;
            }
            reverse=x%10;
            sum=sum*10+reverse;
            x=x/10;
        }
        return sum==result;
    }
}

class Solution {
    public int numberOfSteps(int num) {
        int counter=0;
        while(num!=0){

            if(num%2==0){
                num=num/2;
                counter++;
            } else{
                num=num-1;
                counter++;
            }
        }
        return counter;
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            w1.append(word1[i]);
        }
        
        for(int i=0;i<word2.length;i++){
            w2.append(word2[i]);
        }
        
        if( w1.toString().equals(w2.toString())){
             return true;
        }
         return false;
     
    }
}

class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int j=0;
        for (int i=1;i<=n/2;i++){
            arr[j]=i;
            arr[j+1]=i*-1;
            j=j+2;
        }
        return arr;
    }
}

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int len=1;len<=n;len+=2)
            for(int i=0;i<n-len+1;i++)
               for(int j=i;j<i+len;j++) 
                    sum+=arr[j];
    
    return sum;
    }
}
