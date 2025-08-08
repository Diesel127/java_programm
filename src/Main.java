public class Main {
    public static void main(String[] args) {

        String string1 = "Амиго";
        String string2 = string1;
        String string3 = new String(string1);
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        if (string1 == string2){
            System.out.println(same);
        } else {
            System.out.println(different);
        } if (string2 == string3){
            System.out.println(same);
        } else {
            System.out.println(different);
        } if (string1 == string3){
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}