# 集合
## Java集合框架
* 将集合的接口和实现分离
* Collection接口
* 迭代器
* 泛型使用方法
* 集合框架中的接口
```Java
Iterable
    Collection
        List
        Queue
            Deque
        Set
            SortedSet
                NavigableSet

Map
    SortedMap
        NavigableMap

Iterator
    ListIterator
RandomAccess
``` 
## 具体的集合
```Java
AbstractCollection
    AbstractList
        AbstractSequentialList
            LinkedList
        ArrayList
    AbstractSet
        HashSet
            LinkedHashSet
        EnumSet
        TreeSet
    AbstractQueue
        PriorityQueue
        ArrayQueue

AbstractMap
    HashMap
        LinkedHashMap
    TreeMap
    EnumMap
    WeakHashMap
    IdentityHashMap
```
## 映射
* 基本映射操作
* 更新映射项
* 映射视图:keySet,values,entrySet
* 弱散列映射
* 链接散列集与映射
* 枚举集与映射
* 标识散列映射
## 视图与包装器
* 轻量级集合包装器
> Arrays.asList,Collections.nCopies,singleton
* 子范围:subList,subSet,headSet,tailSet,subMap, headMap, tailMap
* 不可修改视图:unmodifiableCollectionList/Set/SortedSet/NagigableSet/Map/SortedMap/NavigableMap
* 同步视图:synchronizedMap
* 受查视图:checkedList
* 关于可选操作的说明
## 算法
* 排序与混排
> Collections.sort,Collections.shuffle
* 二分查找
> Collections.binarySearch
* 简单算法
> replaceAll, min, max copy, fill, swap, reverse, rotate, removeIf...
* 批操作
> removeAll, retainAll, addAll
* 集合与数组的转换
> toArray
* 编写自己的算法
> 方法的参数尽量使用接口而非具体的集合
## 遗留的集合
* HashTable
* 枚举Enumeration
* Vector
* Properties
* Stack
* BitSet