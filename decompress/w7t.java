import android.content.Context;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class w7t
{
    public final c5w a;
    public final mbi<?> b;
    
    public w7t(final c5w a, final mbi<?> b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final q7t q7t) {
        this.b(q7t, null);
    }
    
    public final void b(final q7t q7t, final nca nca) {
        final boolean b = q7t instanceof y6w;
        final boolean b2 = false;
        final boolean b3 = false;
        if (b) {
            final int a = w4j.a;
            final y6w y6w = (y6w)q7t;
            int n = b3 ? 1 : 0;
            if (dta.b().b("android_graphql_timeline_navigation_enabled", false)) {
                final z7c a2 = y6w.c.a;
                n = (b3 ? 1 : 0);
                if (a2 != null) {
                    n = (b3 ? 1 : 0);
                    if (pjr.g((CharSequence)a2.a)) {
                        n = (b3 ? 1 : 0);
                        if (!zzd.a((Object)y6w.c.a.a, (Object)"no-timeline-id")) {
                            n = 1;
                        }
                    }
                }
            }
            if (n != 0) {
                final mbi<?> b4 = this.b;
                final f8c.a a3 = new f8c.a();
                a3.a = "timeline_by_id_query";
                a3.b = new e8c(new String[] { "timeline_response", "timeline" });
                ((sjg)a3.c).w((Object)"id", (Object)y6w.c.a.a);
                final f8c f8c = (f8c)a3.e();
                final z6c.a a4 = new z6c.a();
                a4.t(f8c);
                a4.q(y6w.c.e);
                a4.w(y6w.c.f);
                final String c = y6w.c.c;
                if (c != null) {
                    a4.x(c);
                }
                final String d = y6w.c.d;
                if (d != null) {
                    a4.a.putExtra("arg_subtitle", d);
                }
                b4.d((zm)a4.e());
            }
            else {
                this.b.d((zm)new v0c(y6w));
            }
            return;
        }
        if (q7t instanceof zdf) {
            final zdf zdf = (zdf)q7t;
            final fov c2 = zdf.c;
            int n2 = b2 ? 1 : 0;
            if (c2 != null) {
                n2 = (b2 ? 1 : 0);
                if (!c2.b.a.isEmpty()) {
                    n2 = 1;
                }
            }
            if (n2 != 0) {
                if (nca == null) {
                    this.a.a(zdf);
                }
                else {
                    final c5w a5 = this.a;
                    Objects.requireNonNull(a5);
                    a5.c.d((Context)a5.a, c5w.a.a(c5w.Companion, zdf), a5.b, nca);
                }
            }
            else {
                final String b5 = zdf.b;
                if (nca == null) {
                    this.a.c(b5);
                }
                else {
                    final c5w a6 = this.a;
                    Objects.requireNonNull(a6);
                    zzd.f((Object)b5, "sourceUrl");
                    a6.c.d((Context)a6.a, b5, a6.b, nca);
                }
            }
        }
    }
}
