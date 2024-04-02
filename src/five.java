public class five {
    public static void main(String[] args) {

        String str1="це";
        String str2="рядок";

        int strLength1=str1.length();
        int strLength2=str2.length();

        if ( strLength1 > strLength2 ) {
            System.out.println("Перший рядок має більше символів.");
        } else if (   strLength2 >strLength1  ) {
            System.out.println("Другий рядок має більше символів.");
        } else {
            System.out.println("Рядки мають однакову кількість символів.");
        }

    }
}
