import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qz5
{
    public static final qz5$a a;
    public static final qz5.qz5$b b;
    public static final qz5.qz5$b c;
    
    static {
        a = new qz5$a();
        b = new qz5.qz5$b(-1);
        c = new qz5.qz5$b(1);
    }
    
    public abstract qz5 a(final int p0, final int p1);
    
    public abstract qz5 b(final long p0, final long p1);
    
    public abstract <T> qz5 c(final T p0, final T p1, final Comparator<T> p2);
    
    public abstract qz5 d(final boolean p0, final boolean p1);
    
    public abstract qz5 e(final boolean p0, final boolean p1);
    
    public abstract int f();
}
