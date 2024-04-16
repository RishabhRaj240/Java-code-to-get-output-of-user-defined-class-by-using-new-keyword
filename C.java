class C {
    void m1() {
      System.out.println("m1");      
    }

    void m2() {
      System.out.println("m2");      
    }

    public static void main(String[] args) {
      System.out.println("main");
         A a1 = new A();
         a1.m1();
         a1.m2();      
    }
}