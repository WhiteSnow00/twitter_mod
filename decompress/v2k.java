// 
// Decompiled by Procyon v0.6.0
// 

public final class v2k
{
    public static final p4j a;
    
    static {
        a = new p4j();
    }
    
    public static <R extends etm> mcs<Void> a(final u2k<R> u2k) {
        final f6y f6y = new f6y();
        final rcs rcs = new rcs();
        u2k.b((u2k$a)new z5y(u2k, rcs, (a)f6y));
        return (mcs<Void>)rcs.a;
    }
    
    public interface a<R extends etm, T>
    {
        T a(final R p0);
    }
}
