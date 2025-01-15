class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int videoLen = convertToSeconds(video_len);
        int position = convertToSeconds(pos);
        int openStart = convertToSeconds(op_start);
        int openEnd = convertToSeconds(op_end);

        // opening 건너뛰기
        position = skipOpening(position, openStart, openEnd);

        // prev, next 로직
        for(String command : commands) {
            if (command.equals("prev")) {
                position = skipOpening(Math.max(0, position - 10),openStart,openEnd);
            } else if (command.equals("next")) {
                position = skipOpening(Math.min(videoLen, position + 10), openStart, openEnd);
            }
        }

        answer = convertoString(position);
        return answer;
    }
    
    private int skipOpening(int position, int openStart, int openEnd) {
        if (position >= openStart && position <= openEnd) {
            position = openEnd;
        }
        return position;
    }

    private String convertoString(int position) {
        String minutes = String.format("%02d",position / 60);
        String seconds = String.format("%02d",position % 60);
        return minutes + ":" + seconds;
    }

    private int convertToSeconds(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, time.length()));
    }
}