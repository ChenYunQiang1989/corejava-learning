# 异常,断言和日志
## 处理错误
* 如果出现错误造成操作未完成,程序应该:
1. 返回一种安全状态,并能够让用户执行一些其他命令
2. 允许用户保存所有结果,并以妥善方式终止程序
* 可能出现的错误种类:
1. 用户输入错误
2. 设备错误
3. 物理限制
4. 代码错误
* 异常分类:所有异常都继承与Throwable类的一个实例

1. Throwable
2. Error:Java运行时的异常,应用程序不应该抛出该错误
3. Exception:关注点
4. IOException:由IO错误等导致的异常 
> 试图在文件尾部后面读取数据,试图打开一个不存在的文件,试图根据指定字符串查找Class对象,而这个字符串表示的类并不存在
5. RuntimeException:由程序错误导致的异常
>  错误类型转换, 数组访问越界, 访问Null指针 

> 如果出现RuntimeException那么一定是你的问题
* 声明受查异常
1. 调用一个抛出受查异常的方法
2. 程序运行时发现错误,并利用throw语句抛出一个受查异常
3. 程序出现错误
4. Java虚拟机和运行时库出现的内部错误
> 不需要声明Java的内部错误,即Error对象及继承,以及RuntimeException及继承

> Error不可控,RuntimeException应该避免

> 如果在子类中覆盖超类的方法,则子类的受查异常不应该比超类更通用

* 如何抛出异常
* 创建异常类

## 捕获异常
* 捕获异常 try catch
* 捕获多个异常
* 再次抛出异常与异常链
```Java
try {
    //...
}
catch(SQLException e) {
    Throwable se = new ServletException("database error");
    se.initCause(e);
    throw se;
}
```
* finally子句
> 在finally子句中释放资源
* 带资源的finally子语句
```Java
try(Scanner in = new Scanner(new FileInputStream("/usr/share/dic/words"), "UTF-8"); 
    PrinterWriter out = new PrintWriter("out.txt"))
{
    while(in.hasNext())
        out.println(in.next().toUppperCase())    ;
}
```
> 资源支持Closeable接口,close的异常将在getSuppressed获取
* 分析堆栈轨迹元素
## 使用异常机制的技巧
1. 异常处理不能代替简单的测试
2. 不要过分的细化异常
3. 利用异常的层次结构
4. 不要压制异常
5. 在检测错误时,"苛刻"要比放任更好
6. 不要羞于传递异常
## 使用断言
* 断言的概念
> assert 条件;
```Java
    assert x>0;
    assert x>0:x;
```
* 启用禁用断言
* 使用断言完成参数检查
> 断言只使用于开发和测试中
* 为文档假设使用断言
## 记录日志
> 应用开发建议使用log4j,slf4j等
1. 记录器: Logger log = Logger.getLogger(this.class);
2. 日志管理器配置
3. 本地化
4. 处理器
5. 过滤器
6. 格式化器
## 调试技巧