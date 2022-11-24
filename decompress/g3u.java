import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g3u implements osc$a<m3u>
{
    public final h3u$a F0;
    public final h3u G0;
    
    public g3u(final h3u g0, final h3u$a f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final void a(final aw0 aw0) {
    }
    
    public final void b(final aw0 aw0) {
        final m3u m3u = (m3u)aw0;
        if (((osc)m3u).T().b) {
            fcu.e(this.G0.c, "trend_loc_prefs").i().b("lang", m3u.l1).b("country", m3u.m1).e();
            ((zgq)this.F0).b((List)m3u.n1);
        }
        else {
            final h3u$a f0 = this.F0;
            final ged$b g0 = ged.G0;
            final int a = o5j.a;
            ((zgq)f0).b((List)g0);
            ehk.c().c(2131959053, 1);
        }
    }
    
    public final void c(final aw0 aw0, final boolean b) {
    }
}
