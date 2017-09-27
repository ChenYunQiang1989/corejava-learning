# 并发
## 线程
> Thread Runnable
## 中断线程
* interrupt
>1. 调用该方法,线程的中断状态将被设置为true
>2. 被中断的线程调用isInterrupted判断是否被请求中断
>3. 如果被请求的线程被阻塞,将会抛出InterruptedException,而且线程的中断状态将会被清除
* interrupted
> 静态方法,调用该方法将检测当前线程是否被中断,并清除中断状态
* isInterrupted
> 实例方法
* InterruptedException
## 线程状态
1. NEW
2. Runnable
3. Blocked
4. Waiting
5. Timed waiting
6. Terminated
> 状态之间的转换图
## 线程属性
1. 优先级
2. 守护线程
3. 未捕获异常处理
## 同步
1. 竞争条件
2. 锁对象
> synchronized ReentrantLock
3. 条件对象
> Condition await SignalAll
4. synchronized关键字
5. 同步阻塞
6. 监视器概念
7. volatile域
8. final变量
9. 原子性
10. 死锁
11. 线程局部变量
12. 锁测试与超时
13. 读写锁
14. 为什么弃用stop和suspend
## 阻塞队列
>　BlockingQueue ArrayBlockingQueue LinkedBlockingQueue DelayQueue Delayed PriorityBlockingQueue BlockingDeque TransferQueue
## 线程安全的集合
1. 高效的映射, 集合队列
> ConcurrentHashMap ConcurrentSkipListMap ConcurrentLinkedQueue
2. 映射条目的原子更新
* replace
* putIfAbsent increment
* compute computeIfAbsent merge computeIfPresent
3. 对并发散列映射的批操作
* 搜索: searchKeys searchValues search searchEntries
* 规约: reduceKyes reduceValues reduce reduceEntries
* forEach: 
4. 并发集视图
* ConcurrentHashMap.newKeySet
* map.keySet(1L)
5. 写数组拷贝
* CopyOnWriteArrayList
* CopyOnWriteArraySet
6. 并行数组算法
> Arrays类提供了大量并行化操作
7. 较早的线程安全集合
## Callable与Future
* Callable
* Future
* FutureTask
## 执行器
> Executor
1. 线程池
* newCachedThreadPool
* newFixedThreadPool
* newSingleTreadExecutor
* ExecutorService
2. 预定执行
* ScheduledExecutorService
* newScheduledThreadPool
* newSingleThreadScheduledExecutor
3. 控制任务组
* shutdownNow
* invokeAny
* invokeAll
* ExecutorCompletionService
4. Fork-join框架
5. 可完成Future
* CompletableFuture
## 同步器
1. 信号量Semaphore
2. 倒计时门栓 CountDownLatch
3. 障栅 CyclicBarrier
4. 交换器 Exchanger
5. 同步队列 SynchronousQueue
## 线程与Swing