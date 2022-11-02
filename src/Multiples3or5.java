public class Multiples3or5 {
    public static void main(String[] args) {
        Solution solucion = new Solution();
        System.out.println(solucion.solution(10));

    }
    public static class Solution {

        public int solution(int number) {
            int result = 0;

            if (number <= 2) {
                return result;
            } else {
                for (int i = number-1; i > 2; i--) {
                    result += evaluateNumber(i);
                }
            }
            return result;
        }

        private int evaluateNumber(int i) {
            if (((i % 3 == 0) && (i % 5 == 0)) || (i % 5 == 0) || (i % 3 == 0)){
                return i;
            }
            return 0;
        }
    }
}