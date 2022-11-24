import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eh8 implements q0f
{
    public final l9r<q0f> a;
    
    public eh8(final l9r<? extends q0f> a) {
        this.a = (l9r<q0f>)a;
    }
    
    public final int a() {
        return ((q0f)this.a.getValue()).a();
    }
    
    public final Object b(final int n) {
        return ((q0f)this.a.getValue()).b(n);
    }
    
    public final void e(final int n, d86 h, final int n2) {
        h = h.h(1633511187);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (h.d(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (h.P((Object)this)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        if ((n5 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            ((q0f)this.a.getValue()).e(n, h, n5 & 0xE);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(this, n, n2) {
                public final eh8 F0;
                public final int G0;
                public final int H0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    this.F0.e(this.G0, d86, this.H0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
    
    public final Map<Object, Integer> f() {
        return ((q0f)this.a.getValue()).f();
    }
    
    public final Object g(final int n) {
        return ((q0f)this.a.getValue()).g(n);
    }
}
