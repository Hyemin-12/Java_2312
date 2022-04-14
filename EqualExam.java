public class EqualExam {
    public static void main(String[] args) {
        String str1 = "mirim";
        String str2 = "mirim";
        String str3 = new String("highschool"); //생성자로 쓴 건 주소가 다르다.
        String str4 = new String("highschool");
        String str5 = "test";
        String str6 = new String("test");

        if(str1 == str2) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");
        if(str3 == str4) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");

        if(str1.equals(str2)) System.out.println("내용 같다.");
        else System.out.println("내용 다르다.");
        if(str3.equals(str4)) System.out.println("내용 같다.");
        else System.out.println("내용 다르다.");

        if(str5 == str6) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");
        if(str5.equals(str6)) System.out.println("내용 같다.");
        else System.out.println("내용 다르다.");
    }
}
