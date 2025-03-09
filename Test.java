// class Test {
//     static int x = 5;

//     Test() {
//         x += 10;
//     }

//     public static void main(String[] args) {
//         Test t1 = new Test();
//         Test t2 = new Test();
//         System.out.println(Test.x);
//     }
// }
// class Parent {
//     Parent() {
//         System.out.println("Parent Constructor");
//     }
// }

// class Child extends Parent {
//     Child() {
//         System.out.println("Child Constructor");
//     }

//     public static void main(String[] args) {
//         new Child();
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         int a = 5, b = 7;
//         System.out.println(a & b);
//         System.out.println(a | b);
//         System.out.println(a ^ b);
//     }
// }
// public class ShiftExample {
//     public static void main(String[] args) {
//         int x = 16;
//         System.out.println(x >> 2);
//         System.out.println(x << 1);
//     }
// }
// public class ArrayTest {
//     public static void changeArray(int arr[]) {
//         arr[1] = 50;
//     }

//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30};
//         changeArray(arr);
//         System.out.println(arr[1]);  
//     }
// }
// class A {
//     A() {
//         System.out.println("A's Constructor");
//     }
// }

// class B extends A {
//     B() {
//         System.out.println("B's Constructor");
//     }
// }

// class C extends B {
//     C() {
//         System.out.println("C's Constructor");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         C obj = new C();
//     }
// }
// public class Test {
//     public static void modify(int arr[]) {
//         arr[0] = arr[0] + arr[arr.length - 1];
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40};
//         modify(arr);
//         System.out.println(arr[0]);
//     }
// }
public class Test {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println(a ^ b ^ a);
    }
}
