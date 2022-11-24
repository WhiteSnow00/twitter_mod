import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diq implements zqg
{
    public static final diq a;
    
    static {
        a = new diq();
    }
    
    @Override
    public final int a(final b0e b0e, final List list, final int n) {
        return go9.e((zqg)this, b0e, list, n);
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
        e0e.f((Object)crg, "$this$Layout");
        e0e.f((Object)list, "measurables");
        final int size = list.size();
        final int n2 = 0;
        if (size != 1) {
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
        }
        final khk w = ((wqg)rr4.C1((List)list)).W(n);
        final int i0 = ((drg)w).i0((fx)hx.a);
        final int i2 = ((drg)w).i0((fx)hx.b);
        if (i0 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        int n3 = n2;
        if (i2 != Integer.MIN_VALUE) {
            n3 = 1;
        }
        if (n3 != 0) {
            float n4;
            if (i0 == i2) {
                final float a = aiq.a;
                n4 = aiq.h;
            }
            else {
                final float a2 = aiq.a;
                n4 = aiq.i;
            }
            final int max = Math.max(((rp8)crg).S(n4), w.G0);
            return brg.c(crg, vj6.h(n), max, (Map)null, (stb)new stb<khk$a, vzv>(max, w) {
                public final int F0;
                public final khk G0;
                
                public final Object invoke(final Object o) {
                    final khk$a khk$a = (khk$a)o;
                    e0e.f((Object)khk$a, "$this$layout");
                    final int f0 = this.F0;
                    final khk g0 = this.G0;
                    khk$a.h(khk$a, g0, 0, (f0 - g0.G0) / 2, 0.0f, 4, (Object)null);
                    return vzv.a;
                }
            }, 4, (Object)null);
        }
        throw new IllegalArgumentException("No baselines for text".toString());
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
