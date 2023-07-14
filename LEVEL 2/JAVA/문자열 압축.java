// 문자열 압축
// https://school.programmers.co.kr/learn/courses/30/lessons/60057?language=java
class Solution {
    public int solution(String s) {
		StringBuilder sb = new StringBuilder();
		int plusCnt = 0, idx = 0;
		int danwi = 1;
		int len = s.length();
		int minCnt = s.length();
		
		String firstStr = new String();
		String tmpStr = new String();
		while(danwi < len+1) {
			firstStr = s.substring(0, danwi);
			plusCnt = 1;
			
			for(int i=1; i*danwi<len; i++) {
				idx = danwi * (i+1) < len ? danwi * (i+1) : len;
				tmpStr = s.substring(danwi * i, idx);
				if(firstStr.equals(tmpStr)) {
					plusCnt++;
				} else {
					if(plusCnt > 1) sb.append(plusCnt + firstStr);
					else sb.append(firstStr);
					
					firstStr = tmpStr;
					plusCnt = 1;
				}
				
			}
            
            if(plusCnt > 1) sb.append(plusCnt + firstStr);
            else sb.append(firstStr);

            if(minCnt > sb.length()) minCnt = sb.length();
            
			sb.setLength(0);
			danwi++;
		}
		
		return minCnt;
	}
}