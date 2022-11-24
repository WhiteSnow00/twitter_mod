import java.util.ArrayList;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cic implements cql
{
    public final jql<b70> a;
    public final jql<k40> b;
    public final jql<h40> c;
    
    public cic(final jql<b70> a, final jql<k40> b, final jql<h40> c) {
        e0e.f((Object)a, "pushLayoutTextViewBinder");
        e0e.f((Object)b, "pushLayoutImageViewBinder");
        e0e.f((Object)c, "pushLayoutImageRgbViewBinder");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final t5j<RemoteViews> a(final a7s<?, ?> a7s) {
        final d40 d40 = (d40)a7s;
        final RemoteViews remoteViews = new RemoteViews(m61.a, 2131625002);
        final ArrayList list = new ArrayList();
        final b70 b70 = (b70)d40.g(d40.i1);
        if (b70 != null) {
            list.add(this.a.a(2131432077, remoteViews, (Object)b70));
        }
        final b70 b71 = (b70)d40.g(d40.j1);
        if (b71 != null) {
            list.add(this.a.a(2131429725, remoteViews, (Object)b71));
        }
        final b70 b72 = (b70)d40.g(d40.k1);
        if (b72 != null) {
            list.add(this.a.a(2131428987, remoteViews, (Object)b72));
        }
        final b70 b73 = (b70)d40.g(d40.l1);
        if (b73 != null) {
            list.add(this.a.a(2131428986, remoteViews, (Object)b73));
        }
        final b70 b74 = (b70)d40.g(d40.m1);
        if (b74 != null) {
            list.add(this.a.a(2131431922, remoteViews, (Object)b74));
        }
        final b70 b75 = (b70)d40.g(d40.o1);
        if (b75 != null) {
            list.add(this.a.a(2131431923, remoteViews, (Object)b75));
        }
        final b70 b76 = (b70)d40.g(d40.n1);
        if (b76 != null) {
            list.add(this.a.a(2131431927, remoteViews, (Object)b76));
        }
        final b70 b77 = (b70)d40.g(d40.p1);
        if (b77 != null) {
            list.add(this.a.a(2131431928, remoteViews, (Object)b77));
        }
        final k40 k40 = (k40)d40.g(d40.q1);
        if (k40 != null) {
            list.add(this.b.a(2131431919, remoteViews, (Object)k40));
        }
        final k40 k41 = (k40)d40.g(d40.r1);
        if (k41 != null) {
            list.add(this.b.a(2131431924, remoteViews, (Object)k41));
        }
        final h40 h40 = (h40)d40.g(d40.s1);
        if (h40 != null) {
            list.add(this.c.a(2131431920, remoteViews, (Object)h40));
        }
        final h40 h41 = (h40)d40.g(d40.t1);
        if (h41 != null) {
            list.add(this.c.a(2131431925, remoteViews, (Object)h41));
        }
        final b70 b78 = (b70)d40.g(d40.u1);
        if (b78 != null) {
            list.add(this.a.a(2131428981, remoteViews, (Object)b78));
        }
        final b70 b79 = (b70)d40.g(d40.v1);
        if (b79 != null) {
            list.add(this.a.a(2131432038, remoteViews, (Object)b79));
        }
        final t5j doOnError = t5j.combineLatest((Iterable)list, (rtb)new x0i((stb)new cic$a(remoteViews), 1)).doOnNext((rk6)new ima((stb)new cic$b(this), 25)).doOnError((rk6)new zc6((stb)new cic$c(this), 21));
        e0e.e((Object)doOnError, "override fun createView(\u2026eate_view_error\") }\n    }");
        return (t5j<RemoteViews>)doOnError;
    }
}
