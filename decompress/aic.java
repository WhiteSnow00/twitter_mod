import java.util.Objects;
import java.util.ArrayList;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aic implements bpl
{
    public final ipl<a70> a;
    public final ipl<n40> b;
    public final ipl<k40> c;
    
    public aic(final ipl<a70> a, final ipl<n40> b, final ipl<k40> c) {
        zzd.f((Object)a, "pushLayoutTextViewBinder");
        zzd.f((Object)b, "pushLayoutImageViewBinder");
        zzd.f((Object)c, "pushLayoutImageRgbViewBinder");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final b5j<RemoteViews> a(final n5s<?, ?> n5s) {
        final g40 g40 = (g40)n5s;
        final RemoteViews remoteViews = new RemoteViews(l61.a, 2131625000);
        final ArrayList list = new ArrayList();
        final a70 a70 = (a70)g40.g(g40.f1);
        if (a70 != null) {
            list.add(this.a.a(2131432073, remoteViews, (Object)a70));
        }
        final a70 a71 = (a70)g40.g(g40.g1);
        if (a71 != null) {
            list.add(this.a.a(2131429724, remoteViews, (Object)a71));
        }
        final a70 a72 = (a70)g40.g(g40.h1);
        if (a72 != null) {
            list.add(this.a.a(2131428987, remoteViews, (Object)a72));
        }
        final a70 a73 = (a70)g40.g(g40.i1);
        if (a73 != null) {
            list.add(this.a.a(2131428986, remoteViews, (Object)a73));
        }
        final a70 a74 = (a70)g40.g(g40.j1);
        if (a74 != null) {
            list.add(this.a.a(2131431918, remoteViews, (Object)a74));
        }
        final a70 a75 = (a70)g40.g(g40.l1);
        if (a75 != null) {
            list.add(this.a.a(2131431919, remoteViews, (Object)a75));
        }
        final a70 a76 = (a70)g40.g(g40.k1);
        if (a76 != null) {
            list.add(this.a.a(2131431923, remoteViews, (Object)a76));
        }
        final a70 a77 = (a70)g40.g(g40.m1);
        if (a77 != null) {
            list.add(this.a.a(2131431924, remoteViews, (Object)a77));
        }
        final n40 n40 = (n40)g40.g(g40.n1);
        if (n40 != null) {
            list.add(this.b.a(2131431915, remoteViews, (Object)n40));
        }
        final n40 n41 = (n40)g40.g(g40.o1);
        if (n41 != null) {
            list.add(this.b.a(2131431920, remoteViews, (Object)n41));
        }
        final k40 k40 = (k40)g40.g(g40.p1);
        if (k40 != null) {
            list.add(this.c.a(2131431916, remoteViews, (Object)k40));
        }
        final k40 k41 = (k40)g40.g(g40.q1);
        if (k41 != null) {
            list.add(this.c.a(2131431921, remoteViews, (Object)k41));
        }
        final a70 a78 = (a70)g40.g(g40.r1);
        if (a78 != null) {
            list.add(this.a.a(2131428981, remoteViews, (Object)a78));
        }
        final a70 a79 = (a70)g40.g(g40.s1);
        if (a79 != null) {
            list.add(this.a.a(2131432034, remoteViews, (Object)a79));
        }
        final b5j doOnError = b5j.combineLatest((Iterable)list, (qtb)new uii((rtb)new rtb<Object[], RemoteViews>() {
            public final Object invoke(final Object o) {
                zzd.f((Object)o, "it");
                return remoteViews;
            }
        }, 3)).doOnNext((fk6)new oc6((rtb)new rtb<RemoteViews, oyv>() {
            public final /* synthetic */ aic C0;
            
            public final Object invoke(final Object o) {
                final RemoteViews remoteViews = (RemoteViews)o;
                Objects.requireNonNull(this.C0);
                k1b.b("head_to_head_expanded", "create_view");
                return oyv.a;
            }
        }, 23)).doOnError((fk6)new xja((rtb)new rtb<Throwable, oyv>() {
            public final /* synthetic */ aic C0;
            
            public final Object invoke(final Object o) {
                final Throwable t = (Throwable)o;
                Objects.requireNonNull(this.C0);
                k1b.b("head_to_head_expanded", "create_view_error");
                return oyv.a;
            }
        }, 26));
        zzd.e((Object)doOnError, "override fun createView(\u2026eate_view_error\") }\n    }");
        return (b5j<RemoteViews>)doOnError;
    }
}
