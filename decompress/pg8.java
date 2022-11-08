import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pg8 implements j0f
{
    public final q7r<j0f> a;
    
    public pg8(final q7r<? extends j0f> a) {
        this.a = (q7r<j0f>)a;
    }
    
    @Override
    public final int a() {
        return ((j0f)this.a.getValue()).a();
    }
    
    @Override
    public final Object b(final int n) {
        return ((j0f)this.a.getValue()).b(n);
    }
    
    @Override
    public final void e(final int n, final m76 m76, final int n2) {
        final m76 h = m76.h(1633511187);
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
            final ea6$b a = ea6.a;
            ((j0f)this.a.getValue()).e(n, h, n5 & 0xE);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final /* synthetic */ pg8 C0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    this.C0.e(n, m76, n2 | 0x1);
                    return oyv.a;
                }
            });
        }
    }
    
    @Override
    public final Map<Object, Integer> f() {
        return ((j0f)this.a.getValue()).f();
    }
    
    @Override
    public final Object g(final int n) {
        return ((j0f)this.a.getValue()).g(n);
    }
}
