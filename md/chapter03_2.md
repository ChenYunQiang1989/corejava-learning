# Java的基本程序设计结构(二)

## 字符串

* 子串:subtring
* 拼接:
```Java
String fullName = "Li" + "Lei";
String name = String.join(" ", "Han", "Mei", "Mei");
```
* 不可变字符串
> 字符串是不可变对象, 如果需要组装大量数据成为一个字符串,最好用StringBuilder.
* 检测字符串是否相等
```Java
    System.out.println(fullName.equals(name));
```
* 空串("")与Null串(null)
* 码点与代码单元
* String API
* 阅读联机(脱机文档)
* 构建字符串
```Java
    StringBuilder sql = new StringBuilder();
    sql.append("select * from t_user ");
    sql.append("where name = 'lilei' or ");
    sql.append("name = 'hanmeimei' ");
    System.out.println(sql.toString());
```


## 输入输出
* 读取输入
```Java
    Scanner scanner = new Scanner(System.in);
```
> 系统标准输入:System.in
> Console
> Scanner
* 格式化输出
> 系统标准输出:System.out
```Java
    System.out.printf("Can you still remember %s and %s through %d years ?", fullName, name, 15);
```
> 更多的格式化方法参数可以直接翻看文档,不需要死记硬背,知道可以格式化什么数据,可以添加参数控制格式化结果就可以了.
* 文件输入与输出

## 控制流程
* 块作用域
* 条件语句 if else
* 循环 while for
* 多重选择switch

## 大数值
* BigInteger
* BigDecimal

## 数组
* for each
* 初始化及匿名数组
```Java
    int[] scores = {100, 98, 89};
    scores = new int[] {98, 67, 99};
```
* 数组拷贝:Arrays.copyOf
* 命令行参数
* 数组排序:Arrays.sort
* 多维数组
* 不规则数组