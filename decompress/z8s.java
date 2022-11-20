import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z8s extends ste implements qsb<wgk$a, fzv>
{
    public final List<wgk> D0;
    public final ylr E0;
    public final ftb<x66, Integer, fzv> F0;
    public final int G0;
    public final long H0;
    public final int I0;
    public final itb<List<s8s>, x66, Integer, fzv> J0;
    public final List<s8s> K0;
    public final int L0;
    public final int M0;
    
    public z8s(final List<? extends wgk> d0, final ylr e0, final ftb<? super x66, ? super Integer, fzv> f0, final int g0, final long h0, final int i0, final itb<? super List<s8s>, ? super x66, ? super Integer, fzv> j0, final List<s8s> k0, final int l0, final int m0) {
        this.D0 = (List<wgk>)d0;
        this.E0 = e0;
        this.F0 = (ftb<x66, Integer, fzv>)f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (itb<List<s8s>, x66, Integer, fzv>)j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wgk$a wgk$a = (wgk$a)o;
        czd.f((Object)wgk$a, "$this$layout");
        final List<wgk> d0 = this.D0;
        final int g0 = this.G0;
        final Iterator<Object> iterator = d0.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final wgk next = iterator.next();
            if (n < 0) {
                s9i.E();
                throw null;
            }
            wgk$a.g((wgk)next, n * g0, 0, 0.0f);
            ++n;
        }
        final List<cqg> d2 = this.E0.d0(b9s.E0, this.F0);
        final long h0 = this.H0;
        final int i0 = this.I0;
        final Iterator<Object> iterator2 = d2.iterator();
        while (iterator2.hasNext()) {
            final wgk w = iterator2.next().W(pi6.a(h0, 0, 0, 0, 0, 11));
            wgk$a.g(w, 0, i0 - w.E0, 0.0f);
        }
        final List<cqg> d3 = this.E0.d0(b9s.F0, (ftb<? super x66, ? super Integer, fzv>)io7.h(-1341594997, true, (Object)new y8s((itb)this.J0, (List)this.K0, this.L0)));
        final int m0 = this.M0;
        final int i2 = this.I0;
        final Iterator<Object> iterator3 = d3.iterator();
        while (iterator3.hasNext()) {
            wgk$a.g(iterator3.next().W(pi6.Companion.c(m0, i2)), 0, 0, 0.0f);
        }
        return fzv.a;
    }
}
