class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
 
        Map<String, List<String>> answer= new HashMap<>();

        for(String str: strs){
          char[] chars= str.toCharArray();
          Arrays.sort(chars);

          String key= new String(chars);

          if(!answer.containsKey(key)){
            answer.put(key, new ArrayList<>());
          }
          answer.get(key).add(str);
        }
        return new ArrayList<>(answer.values());

    }
}

