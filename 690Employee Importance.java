import java.util.Queue;

class Solution {
    public int getImportance(List<Employee> es, int id) {
        if (es == null) return 0;
        Map<Integer, Employee> indx = new HashMap<Integer, Employee>();
        for(Employee e: es){
            indx.put(new Integer(e.id),e);
 	    }
	    Queue<Employee> queue = new LinkedList<Employee>();
        queue.add(indx.get(id));
        int sum = 0;
        while(!queue.isEmpty()){
            Employee current = queue.remove();
            sum += current.importance;
            for(Integer i:current.subordinates){
		        queue.add(indx.get(i));
	        }
        }
        return sum;
    }
}
