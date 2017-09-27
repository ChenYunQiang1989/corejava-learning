# 接口,lambda表达式和内部类

## 接口
* 定义
* 接口特性
> 1. 可以包含常量(public static final)
> 2. 方法自动为public
* 接口与抽象类
* 静态方法
> Java SE 8中允许给接口增加静态方法
* 默认方法
```Java
public interface Comparable<T>
{
    default int compareTo(T other){return 0;}
}
```
* 解决默认方法冲突
* 接口与回调
* Comparator接口
* 对象克隆:Cloneable接口
> 浅拷贝与深拷贝
> clone方法(protect public)
## lambda表达式
* lambda表达式是一个可传递的代码块,可以在以后执行一次或多次
* lambda表达式语法
```Java
(String first, String second) -> first.length()-second.length()
```
```Java
(String first, String second) -> 
{
    if(first.length() < second.length()) return -1;
    else if(first.length() > second.length()) return 1;
    else return 0;
}
```
```Java
() -> {for(int i=0; i<10; i++){System.out.println(i);}}
```
> 如果可以推导出lambda表达式的参数类型,则可以忽略类型
```Java
Comparator<String> comp = 
    (first, seecond) -> first.length()-second.length();
```
> 如果方法只有一个参数,且这个参数可以类型推导得出,那么小括号也可以省略

> 无需指定lambda表达式的返回类型, 其返回类型总是会由上下文推导得出
* 函数式接口
> 对于只有一个抽象方法的接口,需要这种接口的对象时,就可以提供一个lambda表达式,这种接口称为函数式接口
```Java
/*
 * 下面的代码,Arrays.sort将会接收一个Comparator<String>的某个类的实例
 * 调用compare方法将执行这个lambda表达式的体
 */
Arrays.sort(words, (first, second) -> first.length() - second.length() );
```
> 在Java中对lambda表达式所能做的也只是转换为函数式接口
* 方法引用
```Java

// Object::instanceMethod
Timer t = new Timer(1000, System.out::println);
// 等价
Timer t = new Timer(1000, event -> System.out.println(event));
// Class::staticMethod
System.out.println((x, y) -> Math::pow);
// 等价
System.out.println((x, y) -> Math.pow(x,y));
// Class::instanceMethod,这种情况下第一个参数会被用作方法(此处为compareToIgnoreCase的作用对象)
Arrays.sort(words, String::compareToIgnoreCase);
// 等价
Arrays.sort(words, (first, second) -> first.length() - second.length());
```
* 构造器引用
```Java
ArrayList<String> names = ...;
Stream<Person> stream = names.stream().map(Person::name)
List<Person> people = stream.collect(Collectors.toList());
```
* 变量作用域
> 1. lambda表达式可以捕获变量
> 2. 捕获的变量必须是最终变量
> 3. this引用创建这个表达式的方法的this
* 处理lambda表达式
> 常用函数式接口

函数式接口|参数类型|返回类型|抽象方法名|其他方法
---|---|---|---|---
Runable|无|void|run|
Supplier\<T>|无|T|get|andThen
* Comparator
## 内部类
* 为什么使用内部类
1. 内部类方法可以访问该类定义所在的作用域的数据,包括私有数据
2. 内部类可以对同一个包中的其他类隐藏起来
3. 当想要定义一个回调函数且并不想定义大量代码时,使用匿名内部类比较便捷
* 内部类语法
```Java
public TalkingClock {
    private int interval;
    private boolean beep;
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = new TimerPrinter();
        t.start();
    }

    public class TimerPrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println()
        }
    }
}
```
* 内部类的特殊语法规则
* 内部类是否有用,必要和安全
* 局部内部类
* 由外部方法访问变量
* 匿名内部类
* 静态内部类
> 内部类只是一个语法特性,Java虚拟机实际上并不区分内部类,在Java虚拟机中,它只是一个普通的类
## 代理
> 利用代理可以在运行时创建一个实现了一组给定接口的新类,这种功能只有在编译时无法确定需要实现哪个接口时才有必要使用

* 何时使用代理
* 创建代理对象
> 使用代理类的原因:
1. 路由对远程服务器的方法调用
2. 在程序运行期间,将用户接口事件与动作关联起来
3. 为调试,跟踪方法调用
* 代理类的特性
1. 代理类是在运行时创建的,但一旦被创建就和常规类一样,与虚拟机中的其他类没有区别
2. 所有代理类都扩展于超类Proxy
3. 一个代理类只有一个实例域:调用处理器InvokcationHanlder,定义在超类Proxy中
4. 为了履行代理对象的职责,所有需要的任何附件数据必须存储在调用处理器中
