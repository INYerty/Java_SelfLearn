package textBook_Code._StringBuffer.Gouzao;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(2);
        System.out.println(sb.capacity()); // 2
        sb.append("abcd"); // 超过了 2
        System.out.println(sb.capacity()); // 输出 6 (2*2+2=6   存在扩容机制)
        System.out.println("-------------------");

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.append("asdfasdfasdf");
        System.out.println(sb2.capacity());//初始容量是16
        sb2.append("asdf");
        System.out.println(sb2.capacity());
        sb2.append("asdfasdfasdfasdfasdfasdf");//每次追加的时候，都会检查容量是否够用，如果大于16，就会扩容
        System.out.println(sb2.capacity());//老的capacity*2+2
    }
}

//其中 minimumCapacity = 当前已有长度 + 这次要追加的长度。
//也就是说：
//如果 old*2+2 已经够用了 → 就用它。
//如果 old*2+2 不够 → 直接取 minimumCapacity。

//StringBuffer sb2 = new StringBuffer();
//System.out.println(sb2.capacity()); // 16
//sb2.append("asdfasdfasdf"); // +12，总长=12，还 ≤16
//System.out.println(sb2.capacity()); // 16
//sb2.append("asdf"); // +4，总长=16，刚好等于容量
//System.out.println(sb2.capacity()); // 16
//sb2.append("asdfasdfasdfasdfasdfasdf"); // +24，总长=40
//System.out.println(sb2.capacity());
//2. 触发扩容时的计算
//此时：
//旧容量 oldCapacity = 16
//需要的最小容量 minimumCapacity = 40