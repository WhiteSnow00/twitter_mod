import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpq implements zqg
{
    public static final dpq a;
    
    static {
        a = new dpq();
    }
    
    @Override
    public final int a(final b0e b0e, final List list, final int n) {
        return go9.e((zqg)this, b0e, list, n);
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
        e0e.f((Object)crg, "$this$measure");
        e0e.f((Object)list, "measurables");
        int h;
        if (vj6.f(n)) {
            h = vj6.h(n);
        }
        else {
            h = 0;
        }
        int g;
        if (vj6.e(n)) {
            g = vj6.g(n);
        }
        else {
            g = 0;
        }
        return brg.c(crg, h, g, (Map)null, (stb)dpq$a.F0, 4, (Object)null);
    }
    
    @Override
    public final int c(final b0e b0e, final List list, final int n) {
        return go9.g((zqg)this, b0e, list, n);
    }
    
    @Override
    public final int d(final b0e b0e, final List list, final int n) {
        return go9.c((zqg)this, b0e, list, n);
    }
    
    @Override
    public final int e(final b0e b0e, final List list, final int n) {
        return go9.f((zqg)this, b0e, list, n);
    }
}
