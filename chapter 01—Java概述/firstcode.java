/**
 * @author yxn
 * @version 1.0
 * @creat 2023-10-29-15:40
 * @function
 */
// public类是什么名称，则其文件名就是什么
public class firstcode {
    /**
     * //这是 java 的快速入门， 演示 java 的开发步骤
     * //对代码的相关说明
     * //1. public class Hello 表示 Hello 是一个类,是一个 public 公有的类
     * //2. Hello{ } 表示一个类的开始和结束
     * //3. public static void main(String[] args) 表示一个主方法,即我们程序的入口
     * //4. main() {} 表示方法的开始和结束
     * //5. System.out.println("hello,world~"); 表示输出"hello,world~"到屏幕
     * //6. ;表示语句结束
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //练习：
        System.out.println("... is studying mathmatic");
        Dog name1 = new Dog();
        System.out.println(name1);
    }
}

// 一个源文件中只能有一个public类，但其他类不限，每个类编译后都对应一个class文件
class Dog {
    public static void main(String[] args) {
        System.out.println("hello，小狗");
    }
}

class Cat {
    public static void main(String[] args) {
        System.out.println("hello，小猫");
    }
}
