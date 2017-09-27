class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=1;i<n+1;i++){
           if(i%3!=0 && i%5!=0){ result.add(Integer.toString(i));}
           if(i%3==0 && i%15!=0){result.add("Fizz");}
           if(i%5==0 && i%15!=0){result.add("Buzz");}
           if(i%15==0){result.add("FizzBuzz");}  
        }
        return result;
    }
}
