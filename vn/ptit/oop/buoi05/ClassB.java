package vn.ptit.oop.buoi05;

/** Lớp con ClassB kế thừa ClassA */
class ClassB extends ClassA {
    static { System.out.println("2. Static block ClassB"); }
    { System.out.println("6. Instance block ClassB"); }
    public ClassB() {
        super();
        System.out.println("7. Constructor ClassB");
    }
}
