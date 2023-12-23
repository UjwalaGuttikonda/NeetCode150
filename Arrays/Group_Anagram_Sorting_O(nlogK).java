class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0)
            return new ArrayList<>();
        
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String s:strs)
        {
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
        

            if(!anagramMap.containsKey(key))
                anagramMap.put(key, new ArrayList<>());
            anagramMap.get(key).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> anagrams : anagramMap.entrySet()){
            result.add(anagrams.getValue());
        }
        return result;

    }
}

