package te_18_12_24_Remock_Pract2;


class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = (B)new B();
		//B b = (B)new A();
		a.Method1();
		a.Method1(10);
		
		
	}		
	}
	
	class A {
		void Method1() {
			System.out.println(111);
		}
		void Method1(int i) {
			System.out.println(222);
		}
		
	}
	class B extends A{
		@Override
		void Method1() {
			System.out.println(333);
		}
		@Override
		void Method1(int i) {
			System.out.println(444);
		}
		
	}

	


