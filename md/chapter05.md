# 继承

## 类 超类和子类
* 定义子类
* 覆盖(override)方法
> 调用超类方法
* 子类构造器
> 调用超类构造器

> 一个对象变量可以指示多种实际类型的现象被称为多台(polymorphism)
* 继承层次
* 多态
> 判断是否使用继承的关键是,子类和超类是否是is-a关系
* 理解方法调用 
> 理解静态绑定,动态绑定,方法签名(名称和参数列表)
* 阻止继承
> final类和方法
* 强制类型转换
> 强制类型转换前使用instanceof判断,如果转换不可能成功,编译无法通过

> 应该少用类型转换,如果用了,应该查看超类设计是否合理
* 抽象类
* 受保护访问(域和方法)

## Object:所有类的超类
* equals方法
> Objects.equals
> 在子类中首先调用超类的equals方法
```Java
public class Employee {
    public boolean equals(Object otherObject) {
        if(this == otherObject) return true;

        if(otherObject == null) return false;

        if(getClass() != otherObject.getClass())
            return false;

        Employee other = (Employee)otherObject;

        return Objects.equals(name, other.name)
            && salary == other.salary
            && hireDay == other.hireDay;
    }
}

public class Manager extends Employee {
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)) return false;

        Manager other = (Manager)otherObject;
        return bonus == other.bonus;
    }
}
```
* 相等测试与继承
> equals方法需满足以下特性
1. 自反性
2. 对称性
3. 传递性
4. 一致性
5. 非空引用和null应返回false
> 编写完美的equals方法
1. 显示命名参数为otherObject,稍后转换为另一个other变量
2. 检测this和otherObject是否同一个引用
```Java
if(this == otherObject) return true;
```
3. 检测otherObject是否为null
```Java
if(otherObject == null) return false;
```
4. 比较this和otherObject是否为同一个类
```Java
if(getClass() != otherObject.getClass())
    return false;
```
5. 将otherObject转换为相应的类类型变量
```Java
ClassName other = (ClassName) otherObject;
```
6. 比较所有域,使用==比较基本类型,equals比较对象域,如果所有域匹配则返回true,否则返回false
7. 如果在子类中重新定义equals,则需要在其中包含super.equals(other);

> Objects.equals

> Arrays.equals

* HashCode方法
> 如果重新定义equals方法,就必须重新定义HashCode方法,以便用户可以将对象插入到散列
表
```Java
Object.hashCode
Objects.hash
Objects.hashCode
java.lang.(Integer|Long|Short...).HashCode
Arrays.hashCode
```

* toString方法
```Java
public String toString() {
    return getClass().getName()
        + "[name="+name
        + ",salary="+salary
        + ",hireDay="+hireDay
        + "]";
}

public String toString() {
    return super.toString()
    + "[bonus="+bonus
    + "]";
}

Arrays.toString
```
## 泛型数组列表ArrayList
* 访问数组列表元素
> set get add remove
* 类型化和原始数组的兼容性

## 对象包装器与自动装箱 
> 所有基本类型都有与之对应的包装器类(final类)

> 自动装箱(list.add(3) --> list.add(Integer.valueOf(3)))

> 自动拆箱(int n = list.get(i) --> int n = list.get(i).intValue() )

> 包装器还包含有用的静态方法,如Integer.parseInt

## 参数变量可变的方法

```Java
/*定义*/
public void printf(String fmt, Object... args) {
    //args是一个Object[]数组
}

/*使用*/
printf("%s %d", "the deadline is ", 8);
```

## 枚举类
```Java
/* 定义枚举类型实际定义了一个类,有多个实例*/
public enum Size {SMALL,MEDIUM,LARGE, EXTRA_LARGE};
```

```Java
public enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"), EXTRA_LARGE("XL")

    private String abbr;
    private Size(String abbr) {this.abbr = abbr;}

    public String getAbbr(){return this.abbr;}
}
```

> toString, valueOf, ordinal, compareTo

## 反射
1. 运行时分析类的能力
2. 运行时查看对象
3. 实现通用的数组操作代码
4. 利用Method对象

* Class类
* 捕获异常
* 利用反射分析类的能力
* 在运行时使用反射分析对象
* 使用反射编写泛型数组代码
* 调用任意方法
> Class[forName,newInstance]
> Throwable
> Field
> Method
> Constructor
> Array

## 继承的设计技巧
1. 将公共操作和域放在超类
2. 不要使用受保护的域
3. 使用继承实现"is-a"关系
4. 除非所有继承的方法都有意义,否则不要使用继承
5. 在覆盖方法时,不要改变预期的行为