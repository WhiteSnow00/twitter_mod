import java.util.ArrayList;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oju implements bpl
{
    public final ipl<a70> a;
    public final ipl<n40> b;
    public final ipl<h20> c;
    
    public oju(final ipl<a70> a, final ipl<n40> b, final ipl<h20> c) {
        zzd.f((Object)a, "pushLayoutTextViewBinder");
        zzd.f((Object)b, "pushLayoutImageViewBinder");
        zzd.f((Object)c, "pushLayoutCardViewBinder");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final b5j<RemoteViews> a(final n5s<?, ?> n5s) {
        final i70 i70 = (i70)n5s;
        final RemoteViews remoteViews = new RemoteViews(l61.a, 2131625018);
        final ArrayList list = new ArrayList();
        final a70 a70 = (a70)i70.g(i70.Z0);
        if (a70 != null) {
            list.add(this.a.a(2131432280, remoteViews, (Object)a70));
        }
        final a70 a71 = (a70)i70.g(i70.a1);
        if (a71 != null) {
            list.add(this.a.a(2131432365, remoteViews, (Object)a71));
        }
        final n40 n40 = (n40)i70.g(i70.b1);
        if (n40 != null) {
            list.add(this.b.a(2131430742, remoteViews, (Object)n40));
        }
        final h20 h20 = (h20)i70.g(i70.c1);
        if (h20 != null) {
            list.add(this.c.a(2131432264, remoteViews, (Object)h20));
        }
        final n40 n41 = (n40)i70.g(i70.d1);
        if (n41 != null) {
            list.add(this.b.a(2131432311, remoteViews, (Object)n41));
        }
        final a70 a72 = (a70)i70.g(i70.f1);
        if (a72 != null) {
            list.add(this.a.a(2131432310, remoteViews, (Object)a72));
        }
        final a70 a73 = (a70)i70.g(i70.e1);
        if (a73 != null) {
            list.add(this.a.a(2131432316, remoteViews, (Object)a73));
        }
        final a70 a74 = (a70)i70.g(i70.g1);
        if (a74 != null) {
            list.add(this.a.a(2131432309, remoteViews, (Object)a74));
        }
        final a70 a75 = (a70)i70.g(i70.h1);
        if (a75 != null) {
            list.add(this.a.a(2131432364, remoteViews, (Object)a75));
        }
        final a70 a76 = (a70)i70.g(i70.i1);
        if (a76 != null) {
            list.add(this.a.a(2131432361, remoteViews, (Object)a76));
        }
        final n40 n42 = (n40)i70.g(i70.j1);
        if (n42 != null) {
            list.add(this.b.a(2131432295, remoteViews, (Object)n42));
        }
        final b5j doOnError = b5j.combineLatest((Iterable)list, (qtb)new uii((rtb)new oju$a(remoteViews), 4)).doOnNext((fk6)new oc6((rtb)new oju$b(this), 24)).doOnError((fk6)new xja((rtb)new oju$c(this), 27));
        zzd.e((Object)doOnError, "override fun createView(\u2026eate_view_error\") }\n    }");
        return (b5j<RemoteViews>)doOnError;
    }
}
