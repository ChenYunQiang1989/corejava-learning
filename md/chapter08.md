# 泛型程序设计
## 为什么要使用泛型程序设计
1. 类型参数使程序具有更好的可读性和安全性
## 定义简单泛型类
```Java
public class Pair<T> {
    private T first;
    private T second;

    public void setFirst(T newValue) {
        first = newValue;
    }
}
```
## 泛型方法
```Java
public static <T> getMiddle(T... a) {
    return a[a.length/2];
}
```
## 类型变量的限定
```Java
public static <T extends Comparable & Serializable> T min(T[] a){
    //...
}
```
## 泛型代码和虚拟机
* 类型擦除
> 泛型在虚拟机中类型被擦除为Object
* 翻译泛型表达式
> 如果泛型方法返回擦除类型,编译器自动插入强制转换
* 翻译泛型方法
```Java
public static <T extends Comparable> T min(T[]a)
// 擦除后
public static Comparable min(Comparable[] a)
```
* 调用遗留代码
## 约束性与局限性
* 不能用基本类型实例化类型参数
* 运行时类型查询只适用于原始类型
* 不能创建参数化类型的数组
* Varargs警告
* 不能实例化类型变量
* 不能构造泛型数组
* 泛型类的静态上下文中类型变量无效
* 不能抛出或捕获泛型类的实例
* 可以消除对受查异常的检查
* 注意擦除后的冲突
## 泛型类的继承规则
> Pair<S> 和Pair<T>没有关系
## 通配符类型
* 通配符概念
* 通配符的超类型限定
* 无限定通配符
* 通配符捕获
> swap swapHelper
## 反射和泛型
* 泛型Class
* 使用Class<T>参数进行类型匹配
* 虚拟机中的泛型类型信息