public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    int start=0, end=a.size()-1, mid=0;
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(0,-1);
	    list.add(1,-1);
	    while(start<end)     
	    {
	        mid= start + ((end-start)>>1);
	        if(a.get(mid) < b)
	        	start= mid+1;
            	else
                	end=mid;
	    }
	    
	    if(a.get(start)!=b)
	        return list;
	    else
	        list.set(0,start);
	        
	        end=a.size()-1;

	    while(start<end)   //Look for the 
            {
            	mid = (start + ((end-start)>>1))+1;
            	if(a.get(mid)>b)
                	end=mid-1;
                else
                	start=mid;
            }
        
            list.set(1,end);
	    return list;
	}
}
