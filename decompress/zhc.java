import java.util.ArrayList;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhc implements bpl
{
    public final ipl<a70> a;
    public final ipl<n40> b;
    public final ipl<k40> c;
    
    public zhc(final ipl<a70> a, final ipl<n40> b, final ipl<k40> c) {
        zzd.f((Object)a, "pushLayoutTextViewBinder");
        zzd.f((Object)b, "pushLayoutImageViewBinder");
        zzd.f((Object)c, "pushLayoutImageRgbViewBinder");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final b5j<RemoteViews> a(final n5s<?, ?> n5s) {
        final f40 f40 = (f40)n5s;
        final RemoteViews remoteViews = new RemoteViews(l61.a, 2131624999);
        final ArrayList list = new ArrayList();
        final a70 a70 = (a70)f40.g(f40.R0);
        if (a70 != null) {
            list.add(this.a.a(2131432073, remoteViews, (Object)a70));
        }
        final a70 a71 = (a70)f40.g(f40.S0);
        if (a71 != null) {
            list.add(this.a.a(2131428987, remoteViews, (Object)a71));
        }
        final n40 n40 = (n40)f40.g(f40.T0);
        if (n40 != null) {
            list.add(this.b.a(2131431915, remoteViews, (Object)n40));
        }
        final n40 n41 = (n40)f40.g(f40.U0);
        if (n41 != null) {
            list.add(this.b.a(2131431920, remoteViews, (Object)n41));
        }
        final k40 k40 = (k40)f40.g(f40.V0);
        if (k40 != null) {
            list.add(this.c.a(2131431916, remoteViews, (Object)k40));
        }
        final k40 k41 = (k40)f40.g(f40.W0);
        if (k41 != null) {
            list.add(this.c.a(2131431921, remoteViews, (Object)k41));
        }
        final a70 a72 = (a70)f40.g(f40.X0);
        if (a72 != null) {
            list.add(this.a.a(2131432034, remoteViews, (Object)a72));
        }
        final b5j doOnError = b5j.combineLatest((Iterable)list, (qtb)new ros((rtb)new zhc$b(remoteViews), 28)).doOnNext((fk6)new yhc((rtb)new zhc$c(this), 0)).doOnError((fk6)new cwt((rtb)new zhc$a(this), 5));
        zzd.e((Object)doOnError, "override fun createView(\u2026eate_view_error\") }\n    }");
        return (b5j<RemoteViews>)doOnError;
    }
}
