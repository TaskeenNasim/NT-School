public class StringPractice {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        name.append("Bhavleen").append("Singh");
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(4)); //l
        name.setCharAt(4,'k');
        System.out.println(name.charAt(4));
    }
}
