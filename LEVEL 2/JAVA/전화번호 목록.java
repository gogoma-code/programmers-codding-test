// 전화번호 목록
// https://school.programmers.co.kr/learn/courses/30/lessons/42577
class Solution {
    public boolean solution(String[] phone_book) {
		String phone = new String("");
		for(int i=0; i<phone_book.length; i++) {
			for(int j=0; j<phone_book.length; j++) { 
				if(i!=j && phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
		
		return true;
	}
}