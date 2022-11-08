import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lso extends i1v<mev>
{
    public final Context i1;
    public final long j1;
    public final n5p k1;
    
    public lso(final Context i1, final UserIdentifier userIdentifier, final long j1) {
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = n5p.p0(userIdentifier);
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        final StringBuilder g = w48.g("/1.1/saved_searches/destroy/");
        g.append(this.j1);
        g.append(".json");
        ((qrc.a)rbv).m(g.toString());
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<mev, pav> g0() {
        return (wsc<mev, pav>)new f9g.e((Class<Object>)mev.class, (Class<Object>)pav.class);
    }
    
    @Override
    public final void n0(final tsc<mev, pav> tsc) {
        final hn6 z = this.Z(this.i1);
        final n5p k1 = this.k1;
        final long j1 = this.j1;
        final tyr h2 = ((tk1)k1).H2();
        h2.H0();
        try {
            final int v = h2.V("search_queries", "query_id=?", (Object[])new String[] { String.valueOf(j1) });
            h2.A();
            h2.B();
            if (v > 0) {
                z.a(new Uri[] { o9p$a.a });
            }
            z.b();
        }
        finally {
            h2.B();
        }
    }
}
