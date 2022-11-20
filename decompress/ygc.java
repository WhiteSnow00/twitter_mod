import java.util.Objects;
import java.util.ArrayList;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ygc implements ppl
{
    public final xpl<c70> a;
    public final xpl<l40> b;
    public final xpl<i40> c;
    
    public ygc(final xpl<c70> a, final xpl<l40> b, final xpl<i40> c) {
        czd.f((Object)a, "pushLayoutTextViewBinder");
        czd.f((Object)b, "pushLayoutImageViewBinder");
        czd.f((Object)c, "pushLayoutImageRgbViewBinder");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final h5j<RemoteViews> a(final g6s<?, ?> g6s) {
        final d40 d40 = (d40)g6s;
        final RemoteViews remoteViews = new RemoteViews(f61.a, 2131625001);
        final ArrayList list = new ArrayList();
        final c70 c70 = (c70)d40.g(d40.S0);
        if (c70 != null) {
            list.add(this.a.a(2131432076, remoteViews, c70));
        }
        final c70 c71 = (c70)d40.g(d40.T0);
        if (c71 != null) {
            list.add(this.a.a(2131428987, remoteViews, c71));
        }
        final l40 l40 = (l40)d40.g(d40.U0);
        if (l40 != null) {
            list.add(this.b.a(2131431918, remoteViews, l40));
        }
        final l40 l41 = (l40)d40.g(d40.V0);
        if (l41 != null) {
            list.add(this.b.a(2131431923, remoteViews, l41));
        }
        final i40 i40 = (i40)d40.g(d40.W0);
        if (i40 != null) {
            list.add(this.c.a(2131431919, remoteViews, i40));
        }
        final i40 i41 = (i40)d40.g(d40.X0);
        if (i41 != null) {
            list.add(this.c.a(2131431924, remoteViews, i41));
        }
        final c70 c72 = (c70)d40.g(d40.Y0);
        if (c72 != null) {
            list.add(this.a.a(2131432037, remoteViews, c72));
        }
        final h5j doOnError = h5j.combineLatest((Iterable)list, (psb)new s4i((qsb)new qsb<Object[], RemoteViews>(remoteViews) {
            public final RemoteViews D0;
            
            public final Object invoke(final Object o) {
                czd.f((Object)o, "it");
                return this.D0;
            }
        }, 6)).doOnNext((lj6)new s05((qsb)new qsb<RemoteViews, fzv>(this) {
            public final ygc D0;
            
            public final Object invoke(final Object o) {
                final RemoteViews remoteViews = (RemoteViews)o;
                Objects.requireNonNull(this.D0);
                oqf.d("head_to_head_collapsed", "create_view");
                return fzv.a;
            }
        }, 26)).doOnError((lj6)new gwi((qsb)new qsb<Throwable, fzv>(this) {
            public final ygc D0;
            
            public final Object invoke(final Object o) {
                final Throwable t = (Throwable)o;
                Objects.requireNonNull(this.D0);
                oqf.d("head_to_head_collapsed", "create_view_error");
                return fzv.a;
            }
        }, 2));
        czd.e((Object)doOnError, "override fun createView(\u2026eate_view_error\") }\n    }");
        return (h5j<RemoteViews>)doOnError;
    }
}
