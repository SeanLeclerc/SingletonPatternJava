package Delegation;

	interface I {
	    void f();
	    void g();
	}

	class A implements I {
	    public void f() { System.out.println("A: fait f()"); }
	    public void g() { System.out.println("A: fait g()"); }
	}

	class B implements I {
	    public void f() { System.out.println("B: fait f()"); }
	    public void g() { System.out.println("B: fait g()"); }
	}

	class C implements I {
	    // delegation
	    I i = new A();

	    public void f() { i.f(); }
	    public void g() { i.g(); }

	    // attribut normales
	    void toA() { i = new A(); }
	    void toB() { i = new B(); }
	}


	public class Delegation {
	    public static void main(String[] args) {
	        C c = new C();
	        c.f();     // output: A: fait f()
	        c.g();     // output: A: fait g()
	        c.toB();
	        c.f();     // output: B: fait f()
	        c.g();     // output: B: fait g()
	    }
	}
