import java.util.HashSet;
import java.util.Iterator;
import android.content.Context;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezs extends gzm
{
    public final Set<String> E0;
    public final List<szo> F0;
    public final dw0 G0;
    public final Context H0;
    public final ada I0;
    public final daq<String, vrm<pmi, pav>> J0;
    
    public ezs(final gew gew, final dw0 g0, final Context context, final ada i0, final z7x z7x, final daq<String, vrm<pmi, pav>> j0) {
        super(gew);
        this.E0 = (iuh$a)iuh.a(0);
        this.F0 = (rth$a)rth.a(0);
        this.G0 = g0;
        this.H0 = context.getApplicationContext();
        this.I0 = i0;
        this.J0 = j0;
        f.i((b5j)z7x.g(), (u93)new dzs((Object)this, (Object)gew, 0));
    }
    
    public final boolean i(final Object o) {
        final String s = (String)o;
        final boolean i = super.i((Object)s);
        if (i) {
            ((HashSet<String>)this.E0).add(s);
        }
        return i;
    }
    
    public final void o(final epv epv, final int f, final String s) {
        if (!((nws)epv).c().t) {
            final String d = ((nws)epv).d();
            final boolean i = super.i((Object)d);
            if (i) {
                ((HashSet<String>)this.E0).add(d);
            }
            if (i) {
                final qzo j = ((nws)epv).j;
                final lev lev = new lev();
                lev.R0 = j;
                lev.f = f;
                ((List<lev>)this.F0).add(lev);
                final zf4 zf4 = new zf4();
                final String b = ((tca)this.I0).b();
                final String d2 = this.I0.d();
                String f2;
                if (j != null) {
                    f2 = j.f;
                }
                else {
                    f2 = null;
                }
                zf4.q(new String[] { b, d2, f2, s, "impression" });
                zf4.i((szo)lev);
                saw.b((okm)zf4);
                Object o;
                if ((o = epv.k.c) == null) {
                    o = v2a.C0;
                }
                final Iterator iterator = ((List)o).iterator();
                while (iterator.hasNext()) {
                    this.J0.S((Object)((lnv)iterator.next()).a).c((nbq)new yp1());
                }
            }
        }
    }
    
    public final void p(final String s, final qzo r0, final int f, final String q, final int n) {
        final String s2 = "";
        String f2 = null;
        Label_0026: {
            if (r0 != null) {
                f2 = r0.f;
                if (f2 != null) {
                    break Label_0026;
                }
            }
            f2 = "";
        }
        String s3 = s2;
        if (r0 != null) {
            final String g = r0.g;
            s3 = s2;
            if (g != null) {
                s3 = g;
            }
        }
        final nca g2 = nca.g(((tca)this.I0).b(), this.I0.d(), f2, s3, s);
        final lev lev = new lev();
        lev.R0 = r0;
        lev.c = 29;
        lev.f = f;
        lev.v = String.valueOf(n);
        final zf4 zf4 = new zf4();
        zf4.T = g2.toString();
        final int a = w4j.a;
        zf4.q = q;
        zf4.i((szo)lev);
        zf4.c = zys.a(f, n, q);
        saw.b((okm)zf4);
    }
}
