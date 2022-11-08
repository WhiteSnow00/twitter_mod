import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8s extends gue implements rtb<qgk$a, oyv>
{
    public final /* synthetic */ List<qgk> C0;
    public final /* synthetic */ flr D0;
    public final /* synthetic */ gub<m76, Integer, oyv> E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ long G0;
    public final /* synthetic */ int H0;
    public final /* synthetic */ jub<List<z7s>, m76, Integer, oyv> I0;
    public final /* synthetic */ List<z7s> J0;
    public final /* synthetic */ int K0;
    public final /* synthetic */ int L0;
    
    public g8s(final List<? extends qgk> c0, final flr d0, final gub<? super m76, ? super Integer, oyv> e0, final int f0, final long g0, final int h0, final jub<? super List<z7s>, ? super m76, ? super Integer, oyv> i0, final List<z7s> j0, final int k0, final int l0) {
        this.C0 = (List<qgk>)c0;
        this.D0 = d0;
        this.E0 = (gub<m76, Integer, oyv>)e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (jub<List<z7s>, m76, Integer, oyv>)i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qgk$a qgk$a = (qgk$a)o;
        zzd.f((Object)qgk$a, "$this$layout");
        final List<qgk> c0 = this.C0;
        final int f0 = this.F0;
        final Iterator<Object> iterator = c0.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final qgk next = iterator.next();
            if (n < 0) {
                tdy.V0();
                throw null;
            }
            qgk$a.g((qgk)next, n * f0, 0, 0.0f);
            ++n;
        }
        final List d0 = this.D0.d0((Object)i8s.D0, (gub)this.E0);
        final long g0 = this.G0;
        final int h0 = this.H0;
        final Iterator iterator2 = d0.iterator();
        while (iterator2.hasNext()) {
            final qgk w = ((dqg)iterator2.next()).W(jj6.a(g0, 0, 0, 0, 0, 11));
            qgk$a.g(w, 0, h0 - w.D0, 0.0f);
        }
        final List d2 = this.D0.d0((Object)i8s.E0, (gub)m8y.k(-1341594997, true, new f8s((jub)this.I0, (List)this.J0, this.K0)));
        final int l0 = this.L0;
        final int h2 = this.H0;
        final Iterator iterator3 = d2.iterator();
        while (iterator3.hasNext()) {
            qgk$a.g(((dqg)iterator3.next()).W(jj6.Companion.c(l0, h2)), 0, 0, 0.0f);
        }
        return oyv.a;
    }
}
