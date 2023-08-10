class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars=s.toCharArray();
        char[] tchars=t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tchars);
        return Arrays.equals(sChars,tchars);
    }
}
