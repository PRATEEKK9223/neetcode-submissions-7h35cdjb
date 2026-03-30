class Solution {

  public String encode(List<String> strs) {

    StringBuilder sb = new StringBuilder();

    for(String s : strs){
        sb.append(String.format("%04d", s.length()));
        sb.append(s);
    }

    return sb.toString();
}

   public List<String> decode(String s) {

    List<String> result = new ArrayList<>();
    int i = 0;

    while(i < s.length()){

        int length = Integer.parseInt(s.substring(i, i+4));
        i += 4;

        String word = s.substring(i, i + length);
        result.add(word);

        i += length;
    }

    return result;
}
}
