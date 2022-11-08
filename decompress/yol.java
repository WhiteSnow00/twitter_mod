import java.util.ArrayList;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yol implements ipl<n40>
{
    public final ipl<m40> a;
    public final ipl<k40> b;
    public final ipl<t70> c;
    
    public yol(final ipl<m40> a, final ipl<k40> b, final ipl<t70> c) {
        zzd.f((Object)a, "pushLayoutImageUriViewBinder");
        zzd.f((Object)b, "pushLayoutImageRgbViewBinder");
        zzd.f((Object)c, "pushLayoutVisibilityViewBinder");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final b5j<pmi> b(final int n, final RemoteViews remoteViews, final n40 n2) {
        final ArrayList list = new ArrayList();
        final h40 h40 = (h40)n2.i(n40.H0);
        if (h40 != null) {
            final Object c0 = h40.C0;
            b5j b5j;
            if (c0 instanceof m40) {
                zzd.d(c0, "null cannot be cast to non-null type com.twitter.strato.columns.notifications_client.push_layout.AndroidImageUri");
                final m40 m40 = (m40)c0;
                final b5j a = this.a.a(n, remoteViews, (Object)m40);
                final n40 n3 = m40.g(m40.P0);
                if (n3 != null) {
                    b5j = a.onErrorResumeNext((naj)this.b(n, remoteViews, n3).doOnNext((fk6)new xol((rtb)new yol$a(this), 0)).doOnError((fk6)new yhc((rtb)new yol$b(this), 3)));
                }
                else {
                    b5j = null;
                }
                if (b5j == null) {
                    b5j = a;
                }
            }
            else if (c0 instanceof k40) {
                zzd.d(c0, "null cannot be cast to non-null type com.twitter.strato.columns.notifications_client.push_layout.AndroidImageRgb");
                b5j = this.b.a(n, remoteViews, (Object)c0);
            }
            else {
                b5j = b5j.just((Object)pmi.a);
                zzd.e((Object)b5j, "just(NoValue)");
            }
            list.add(b5j);
        }
        final t70 t70 = (t70)n2.i(n40.I0);
        if (t70 != null) {
            list.add(this.c.a(n, remoteViews, (Object)t70));
        }
        final b5j doOnError = b5j.combineLatest((Iterable)list, (qtb)new wpl((rtb)yol$c.C0, 3)).doOnNext((fk6)new nol((rtb)new yol$d(this), 1)).doOnError((fk6)new oc6((rtb)new yol$e(this), 26));
        zzd.e((Object)doOnError, "override fun bind(viewId\u2026w\", \"bind_error\") }\n    }");
        return (b5j<pmi>)doOnError;
    }
}
