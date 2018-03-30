class Solution {
    public List<String> letterCombinations(String digits) {
        
        LinkedList<String> queue = new LinkedList<>();
        if(digits.length() == 0)
            return queue;
        
        String mapping[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        queue.add("");
        for(int i =0;i<digits.length();i++){
            int map = Character.getNumericValue(digits.charAt(i));
            while(queue.peek().length()==i){
                String element = queue.remove();
                for(char w:mapping[map].toCharArray()){
                    queue.add(element + w);
                }
            }
        }
        return queue;
    }
}