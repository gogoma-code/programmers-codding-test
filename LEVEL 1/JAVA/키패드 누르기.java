// 키패드 누르기 :: https://gogoma.tistory.com/123
// https://school.programmers.co.kr/learn/courses/30/lessons/67256?language=java
import java.util.Arrays;
import java.util.List;

class Solution {
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		List<Integer> leftKey = Arrays.asList(1, 4, 7);
		List<Integer> midKey = Arrays.asList(2, 5, 8, 0);
		List<Integer> rightKey = Arrays.asList(3, 6, 9);
		
		String putLeftHand = "L", putRightHand = "R";
		int leftHand = 3, rightHand = 3;
		int number = 0;
		for(int i=0; i<numbers.length; i++) {
			number = numbers[i];
			
			if(leftKey.contains(number)) { //왼쪽키 = 왼손
				putLeftHand = "L";
				leftHand = leftKey.indexOf(number);
				sb.append("L");
			} else if(rightKey.contains(number)) { //오른쪽키 == 오른손
				putRightHand = "R";
				rightHand = rightKey.indexOf(number);
				sb.append("R");
			} else { //중앙키
				String putMid = new String();
				int midIndex = midKey.indexOf(number);
				int leftDist = Math.abs(midIndex - leftHand);
				int rightDist = Math.abs(midIndex - rightHand);
				
				leftDist = putLeftHand.equals("M") ? leftDist-1 : leftDist;
				rightDist = putRightHand.equals("M") ? rightDist-1 : rightDist;
				
				if(leftDist < rightDist) putMid = "L"; //왼손이 더 가까울 때
				else if(leftDist > rightDist) putMid = "R"; //오른손이 더 가까울 때
				else putMid = hand.equals("left") ? "L" : "R"; //왼손과 오른손의 길이가 같을 때, 왼손잡이인지? 오른손잡이인지?
				
				if(putMid.equals("L")) {
					putLeftHand = "M";
					leftHand = midKey.indexOf(number);
					sb.append("L");
				} else {
					putRightHand = "M";
					rightHand = midKey.indexOf(number);
					sb.append("R");
				}
			}
		}
		
		return sb.toString();
	}
	
	public String solution3(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		hand = hand.equals("left") ? "L" : "R";
		
		// 0 ... 9 행 번호
		int[] rowKey = { 3, 0, 0, 0, 1, 1, 1, 2, 2, 2 }; 
		
		Thumb thumb_l = new Thumb("L", 3); // 왼손
		Thumb thumb_r = new Thumb("R", 3); // 오른손
		
		for (int number : numbers) {
			int row = rowKey[number]; // 행 번호
			String[] pressWithThumb = new String[2]; // [0]=누르는 엄지, [1]=키의 위치
			
			switch(number) {
			case 1: case 4: case 7:
				pressWithThumb[0] = "L"; pressWithThumb[1] = "L";
				break;
			case 3: case 6: case 9:
				pressWithThumb[0] = "R"; pressWithThumb[1] = "R";
				break;
			default:
				int dist = thumb_l.getMidDist(row) - thumb_r.getMidDist(row); // 거리 계산
				pressWithThumb[0] = (dist == 0) ? hand : ( (dist < 0) ? "L" : "R" ); 
				pressWithThumb[1] = "M";
				break;
			}
			
			sb.append(pressWithThumb[0]);
			if(pressWithThumb[0].equals("L")) thumb_l.setThumb(pressWithThumb[1], row);
			else thumb_r.setThumb(pressWithThumb[1], row);
		}
		
		return sb.toString();
	}
	
	public class Thumb {
		String position; // 엄지의 위치
		int row;
		
		public Thumb(String position, int row) {
			this.position = position;
			this.row = row;
		}
		
		private void setThumb(String position, int row) {
			this.position = position;
			this.row = row;
		}
		
		private int getMidDist(int mid) {
			return Math.abs(mid - this.row) - (this.position.equals("M") ? 1 : 0);
		}
	}
}