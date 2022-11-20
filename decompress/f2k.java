// 
// Decompiled by Procyon v0.6.0
// 

public final class f2k
{
    public static final rp9 a;
    
    static {
        a = new rp9();
    }
    
    public static <R extends psm> ubs<Void> a(final e2k<R> e2k) {
        final l5y l5y = new l5y();
        final zbs zbs = new zbs();
        e2k.b((e2k$a)new f5y(e2k, zbs, (a)l5y));
        return zbs.a;
    }
    
    public interface a<R extends psm, T>
    {
        T a(final R p0);
    }
}
