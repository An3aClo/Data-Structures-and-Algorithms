package stringmanipulation;

public class StringManipulation {

    
    public static void main(String[] args) {
        String n1="MySupperStrig";
        System.out.println("Length: "+n1.length());
        System.out.println("Char index "+n1.charAt(0));
        /*System.out.println("Comparison "+ n1.compareTo("Andrea"));
        String n2="Andrea";
        System.out.println(n2.length());*/
        String n3="Judgement  ";
        System.out.println("Suffex: "+n3.endsWith("a"));
        System.out.println("Equals: "+ n3.equals("udgement"));
        System.out.println("Index of: "+ n3.indexOf("u"));
        System.out.println("UpperCase: "+n3.toUpperCase());
        System.out.println("LowerCase:" +n3.toLowerCase());
        System.out.println(n3);
        System.out.println("Trim: "+n3.trim());
        System.out.println("Shorter: "+ n3.substring(0, 4));
    }
    
}
