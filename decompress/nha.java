import com.google.android.exoplayer2.w$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nha implements unf$a, ouk, m5$a
{
    public final int F0;
    public final int G0;
    
    public nha(final int g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void h(final w$c w$c) {
        switch (this.F0) {
            default: {
                final int g0 = this.G0;
                e0e.f((Object)w$c, "it");
                w$c.O0(g0);
                return;
            }
            case 2: {
                final int g2 = this.G0;
                e0e.f((Object)w$c, "it");
                w$c.A(g2);
            }
        }
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).O0(this.G0);
    }
    
    public final boolean test(Object b) {
        final int g0 = this.G0;
        b = ((z2j)b).b;
        vmw.g(b);
        return ((Integer)b).equals(g0);
    }
}
