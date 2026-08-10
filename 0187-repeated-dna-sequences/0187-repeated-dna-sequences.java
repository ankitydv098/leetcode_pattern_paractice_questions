class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int len = 10;
        int i=0,n=s.length();
       
        while(i<=(n-len)){
            String sub = s.substring(i,i+len);

            if(seen.contains(sub)){
                repeated.add(sub);
            }
            else{
                seen.add(sub);
            }
            i++;
            
        }
        return new ArrayList<>(repeated);
        

        
    }
}