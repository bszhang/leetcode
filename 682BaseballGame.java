class Solution {
    public int calPoints(String[] ops) {
        if (ops==null || ops.length ==0){return 0;}
        Stack<String> stack = new Stack<String>();
        int num = 0;
        for(int i=0;i<ops.length;i++){
            char a = ops[i].charAt(0);
            if (a>=48 && a<=57){ num = num + a-48;}
        }
    }
}
