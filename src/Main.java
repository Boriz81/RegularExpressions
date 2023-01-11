public class Main {
    public static void main(String[] args) {
        // Regular expressions


        String regex = "[Java][7-9]";
        String regex2 = "abc?";
        String regex3 = "abc{0,1}";

        /*System.out.println("j7".matches(regex));
        System.out.println("Java8".matches(regex));
        System.out.println("J9".matches(regex));
        System.out.println("v8".matches(regex));

        System.out.println("abc".matches(regex2));
        System.out.println("abc".matches(regex3));

        // Квантификатор +
        String regexPlus = "ca+b";

        System.out.println("cab".matches(regexPlus));
        System.out.println("caaaaaab".matches(regexPlus));
        System.out.println("cb".matches(regexPlus));

        String regexMul = "ca*b";
        System.out.println("cab".matches(regexMul));
        System.out.println("caaaaaab".matches(regexMul));
        System.out.println("cb".matches(regexMul));

        // определяем число повторений
        String regexRep = "[Java]{4}";
        System.out.println("Java".matches(regexRep));
        System.out.println("avaJ".matches(regexRep));
        System.out.println("aJva".matches(regexRep));

        String regexRep2 = "1{2,3}";
        System.out.println("11".matches(regexRep2));
        System.out.println("111".matches(regexRep2));
        System.out.println("1".matches(regexRep2));

        String regexRep3 = "ab{4,}";
        System.out.println("abb".matches(regexRep3));
        System.out.println("abbbb".matches(regexRep3));
        System.out.println("abbbbbbbbb".matches(regexRep3));*/

        String regex4 = "ab+a";
        System.out.println("aa".matches(regex4));
        System.out.println("aba".matches(regex4));
        System.out.println("abbba".matches(regex4));
        System.out.println("abbbba".matches(regex4));
        System.out.println(" ");
        String regex5 = "ab*a";
        System.out.println("aa".matches(regex5));
        System.out.println("aba".matches(regex5));
        System.out.println("abbba".matches(regex5));
        System.out.println("abbbba".matches(regex5));
        System.out.println(" ");
        String regex6 = "ab{0,3}a";
        System.out.println("aa".matches(regex6));
        System.out.println("aba".matches(regex6));
        System.out.println("abbba".matches(regex6));
        System.out.println("abbbba".matches(regex6));
        System.out.println(" ");
        String regex7 = "ab{3,}a";
        System.out.println("aa".matches(regex7));
        System.out.println("aba".matches(regex7));
        System.out.println("abbba".matches(regex7));
        System.out.println("abbbba".matches(regex7));
    }
}