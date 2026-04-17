class Solution {

    public String encode(List<String> strs) {

     StringBuilder sb= new StringBuilder();
     for(String str: strs){
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)==';'){
                sb.append("/;");
            }
            else if(str.charAt(i)=='/'){
                sb.append("//");
            }
            else{
                sb.append(str.charAt(i));
            }
            i++;
        }
        sb.append(";");
     }
     return sb.toString();
    }

    public List<String> decode(String str){
      
    List<String> decodedString= new ArrayList<>();
    StringBuilder sb= new StringBuilder();
    int i=0;

    while(i<str.length()){
        if(str.charAt(i)=='/'){
            sb.append(str.charAt(i+1));
            i+=2;
        }
        else if(str.charAt(i)==';'){
             decodedString.add(sb.toString());
            sb.setLength(0);
            i++;
        }
        else{
            sb.append(str.charAt(i));  
            i++;
        }
    }
    return decodedString;
        
    }
}
