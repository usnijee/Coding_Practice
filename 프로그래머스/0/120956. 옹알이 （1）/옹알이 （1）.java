class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String babble : babbling) {
            if (validate(babble)) {
                answer++;
            }
        }
        return answer;
    }
    
    public static boolean validate(String word) {
        String[] canSpeak = {"aya","ye","woo","ma"};
        for (String speak : canSpeak) {
            if (word.contains(speak)) {
                word = word.replaceFirst(speak, "*");
            }
        }
        word = word.replace("*", "");
        return word.isEmpty();
    }
}