public class Solution {
    public int evalRPN(String[] tokens){


    	if (tokens.length==0 || tokens==null || tokens.length==2){
             return 0;
    	}
    	if ((tokens.length==1) {
          if((tokens[0]>='0') && (tokens[0]<='9')){
              return Character.getNumericValue(tokens[0]);
    	  }
    	  else{
    	  	return 0;
    	  }
        }
    

    	Stack<String> info = new Stack<String>();
        for(int i=0;i<tokens.length;i++){
           if (tokens[i]>='0' && tokens[i]<='9'){
           	  info.push(tokens[i]);
           }
           if (Arrays.asList("+","-","*","/").contains(tokens[i])){
              int a = info.pop();
              int b = info.pop();
              int c =0;
              if (tokens[i].equals("+")){
                  c = a + b;
              }
              else if (tokens[i].equals("-")){
              	  c = a - b;
              }
              else if (tokens[i].equals("*")){
              	  c = a * b;
              }
              else{
              	  c = a / b;
              }
                info.push(Integer.toString(c));
           }
        }
           return info.pop()
    }
}