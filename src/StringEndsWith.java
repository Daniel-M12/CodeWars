public class StringEndsWith {
    public static void main(String[] args) {
        boolean result = solution("abc\n", "abc");
        System.out.println(result);
    }

    private static boolean solution(String str, String ending) {
        //boolean result = str.endsWith(ending);
        boolean result = true;
        try{
            for (int i = 0; i < ending.length(); i++) {
                if (!(ending.charAt(i) == str.charAt(str.length()-ending.length()+i))){
                    return false;
                }
            }
        } catch (Exception e){
            return false;
        }
        return result;
    }

}
