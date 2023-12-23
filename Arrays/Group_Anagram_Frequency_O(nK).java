class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0)
            return new ArrayList<>();
        
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String s:strs)
        {
        String freqString = getFrequencyString(s);
        if(anagramMap.containsKey(freqString)){
            anagramMap.get(freqString).add(s);
        }
        else
        {
            List<String> strList = new ArrayList<>();
            strList.add(s);
            anagramMap.put(freqString, strList);
        }
        }
        return new ArrayList<>(anagramMap.values());

    }

    private String getFrequencyString(String str)
    {
        int[] freq = new int[26];
        for (char c:str.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder freqString = new StringBuilder("");
        char c = 'a';
        for(int i : freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return freqString.toString();
    }
}