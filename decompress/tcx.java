import com.twitter.model.json.core.JsonViewer;
import java.util.Collection;
import android.content.ContentUris;
import android.net.Uri;
import android.content.Context;
import com.twitter.api.model.json.core.JsonViewerQuery;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tcx extends i1v<JsonViewerQuery>
{
    public hfv i1;
    public final Context j1;
    public final aav k1;
    
    public tcx(final tcx.tcx$a tcx$a) {
        super(tcx$a.b, 0);
        this.j1 = tcx$a.a;
        this.k1 = aav.d2(tcx$a.b);
    }
    
    @Override
    public final qrc f0() {
        final zf4 zf4 = new zf4(super.P0);
        zf4.q(new String[] { null, null, "users_show", "request", "send" });
        xca.a().b(super.P0, (okm)zf4);
        final o7c o7c = new o7c();
        o7c.r("viewer_user_query");
        return (qrc)o7c.e();
    }
    
    @Override
    public final wsc<JsonViewerQuery, pav> g0() {
        return (wsc<JsonViewerQuery, pav>)d8c.Companion.b((Class)JsonViewerQuery.class, new String[0]);
    }
    
    @Override
    public final void n0(final tsc<JsonViewerQuery, pav> tsc) {
        final Object g = tsc.g;
        Object o = null;
        Label_0100: {
            if (g != null) {
                final JsonViewer a = ((JsonViewerQuery)g).a;
                if (a != null) {
                    final hfv e = ffa.e(a.a);
                    if (e != null) {
                        final hfv$b hfv$b = new hfv$b(e);
                        ((hfv$a)hfv$b).b0 = a.b;
                        final int a2 = w4j.a;
                        ((hfv$a)hfv$b).e0 = a.c;
                        final JsonViewerQuery jsonViewerQuery = (JsonViewerQuery)tsc.g;
                        ((hfv$a)hfv$b).f0 = jsonViewerQuery.b;
                        ((hfv$a)hfv$b).h0 = jsonViewerQuery.c;
                        o = hfv$b;
                        break Label_0100;
                    }
                }
            }
            o = null;
        }
        pf8.r(o);
        final zf4 zf4 = new zf4(super.P0);
        zf4.q(new String[] { null, null, "users_show", "request", "success" });
        xca.a().b(super.P0, (okm)zf4);
        final t3s a3 = mq1.a;
        ((hfv$a)o).C = System.currentTimeMillis();
        final int a4 = w4j.a;
        if (!((hfv$b)o).l()) {
            final z8a z8a = new z8a();
            z8a.b = new IllegalStateException("Failed Viewer request.");
            e9a.c(z8a);
        }
        else {
            final hfv i1 = (hfv)((h4j)o).e();
            final hn6 z = this.Z(this.j1);
            z.a(new Uri[] { ContentUris.withAppendedId(gfv$q.b, i1.C0) });
            this.k1.V3((Collection)ijf.v((Object)i1), -1L, -1, -1L, (String)null, (String)null, 2, z);
            z.b();
            if (i1.D1 != fjw.F0) {
                final j2c j2c = new j2c(this.j1, super.P0, this.k1);
                j2c.i1 = i1;
                if (((ksc)j2c).R().b) {
                    ((hfv$a)o).r = j2c.j1;
                }
            }
            this.i1 = (hfv)((h4j)o).e();
        }
    }
}
