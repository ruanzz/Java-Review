package com.ruanzz.core.jvm;

/**
 * 测试引用计数  新生代内存从25723K经过Full GC之后变为528K，说明对象被回收了，从而验证了JVM用的不是引用计数法来判断对象存活
 *
 * VM args: -verbose:gc -XX:+PrintGCDetails
 *
 * GC Detail Result:
 *
 * [GC (System.gc()) [PSYoungGen: 25723K->528K(76288K)] 25723K->536K(251392K), 0.0014015 secs]
 * [Times: user=0.00 sys=0.00, real=0.00 secs] [Full GC (System.gc()) [PSYoungGen: 528K->0K(76288K)]
 * [ParOldGen: 8K->425K(175104K)] 536K->425K(251392K), [Metaspace: 3281K->3281K(1056768K)],
 * 0.0061585 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] Heap PSYoungGen      total 76288K,
 * used 655K [0x000000076ab00000, 0x0000000770000000, 0x00000007c0000000) eden space 65536K, 1% used
 * [0x000000076ab00000,0x000000076aba3ee8,0x000000076eb00000) from space 10752K, 0% used
 * [0x000000076eb00000,0x000000076eb00000,0x000000076f580000) to   space 10752K, 0% used
 * [0x000000076f580000,0x000000076f580000,0x0000000770000000) ParOldGen       total 175104K, used
 * 425K [0x00000006c0000000, 0x00000006cab00000, 0x000000076ab00000) object space 175104K, 0% used
 * [0x00000006c0000000,0x00000006c006a4e0,0x00000006cab00000) Metaspace       used 3288K, capacity
 * 4496K, committed 4864K, reserved 1056768K class space    used 363K, capacity 388K, committed
 * 512K, reserved 1048576K
 *
 *
 * JVM默认使用的是对象的可达性分析算法，已GCROOT对象出发，能到达对象就说明对象是被引用的，不能被回收，避免了垃圾对象之间互相引用的情况 作为GCROOT的对象： - 虚拟机栈 -
 * 方法区中类属性引用的对象 - 方法区中常量所引用的对象 - 本地方法栈中引用的对象
 *
 * @author ZhenZhuo.Ruan
 */
public class RefrentCountTest {

  private Object instance;

  public RefrentCountTest() {
    byte[] m = new byte[10 * 1024 * 1024];
  }

  public static void main(String[] args) {

    RefrentCountTest obj1 = new RefrentCountTest();
    RefrentCountTest obj2 = new RefrentCountTest();

    obj1.instance = obj2;
    obj2.instance = obj1;

    obj1 = null;
    obj2 = null;

    System.gc();
  }
}
