# Java的基本程序设计结构(一)

## 一个简单的Java应用程序
```Java
package com.chenyq.corejava.chapter03

public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not use 'Hello World!'");
    }
}
```
* Java分区大小写
* 包
* 访问修饰符:public,控制程序其他部分对这段代码的访问级别
* 关键字class
* 类名:不能使用保留字,正则匹配 ^[a-zA-Z].*[a-zA-Z0-9\-]*$
* 命名规范:骆驼命名法(CamelCase)
* 源文件名必须和公共类名字相同,以.java为扩展名
* Java虚拟机将从指定类的main方法开始执行

## 注释
* 单行注释
```Java
// This is a code comment!
```
* 多行注释
```Java
/* This is a another code comment with
multi line!*/
```

* 文档注释
```Java
package com.chenyq.corejava.chapter03;
/**
 * first sample class
 * @version 1.01
 * @author chenyq
 */
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not use 'Hello World!'");
    }
}
```

## 数据类型

* 整型

类型|存储需求|取值范围|表示
---|---|---|---
int|4字节|-2 147 483 648 - 2 147 483 647|8
short|2字节|-32 768 - 32767|
long|8字节|-9223372036854775808 - 9223372036854775807|后加L/l
byte|1字节|-128 - 127|0b0010

* 浮点型

类型|存储需求|取值范围|表示
---|---|---|--
float|4字节|大约+-3.40282347E+38F(有效位数6-7位)|后加f/F
double|8字节|大约+-1.79769313486231570E +308(有效位数15位)|后加d/D
> 浮点数默认为double型
> 浮点数计算规范:IEEE754

* char类型

>char类型一般表示单个字符(不是字节,字节用byte表示),有些Unicode字符可以用一个字符表示,有些则需要两个

>char类型表示,'A','中'

* Unicode和char类型

在Java中,char类型描述了UTF-16编码中的一个代码单元,由于UTF-16采用不同长度的编码表示所有Unicode码点,在基本多语言级别每个字符用16位表示即可,但对于辅助字符爱用一对连续的代码单元进行编码,故有些字符需要两个代码单元(两个char)才能进行表示;在编程中尽量不要使用char类型,除非必须处理UTF-16代码单元

* boolean类型

Boolean类型只有两个值:true,falase

## 变量

变量定义,合法变量名

* 变量初始化
* 常量:final关键字知识常量

## 运算符

* 算数运算符:+,-,*,/,%
> 除法:两边均为整数表示整数除法,否则为浮点数除法
* 数学函数与常量:Math.pow等方法,Math.PI,Math.E
* 数值类型转换(合法转换)
* 强制类型转换:强制类型转通过截断数据实现,可能会导致数据丢失部分
* 结合赋值和运算符
* 自增自减运算符
* 关系和boolean运算符
>或运算符:当第一个为真时不会计算第二个表达式的值
* 位运算符: & | ^ ~ >> << >>>

* 括号与运算符级别
>如果不使用括号则按照定义的优先级进行运算,运算优先级别并不好记,也没必要记,在需要确定优先级的情况下,使用括号即可;运算太复杂,括号太多都说明没有设计好运算,最好进行分解,否则难以维护!

* 枚举类型
 
>```Java
>enum Size{Small, MEDIUM, LARGE, EXTRA_LARGE};
>```
