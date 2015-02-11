class MinTest {
    public static void main (String args[]) {
        Mus m = new Mus(1000, false);
        p("Hello world");
    }

    static void p(Object... args) { if (args.length == 0) p(""); for (Object o : args) System.out.println(o); }
}
