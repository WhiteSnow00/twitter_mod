import com.twitter.util.user.UserIdentifier;
import android.widget.RemoteViews;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ool implements ipl<m40>
{
    public final fsi a;
    public final ibm b;
    public final Context c;
    
    public ool(final fsi a, final ibm b, final Context c) {
        zzd.f((Object)a, "notificationImageRequestFactory");
        zzd.f((Object)b, "releaseCompletable");
        zzd.f((Object)c, "context");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final b5j a(final int n, final RemoteViews remoteViews, final Object o) {
        final m40 m40 = (m40)o;
        final pmi a = pmi.a;
        final rv1 e = rv1.e((Object)a);
        final String s = m40.g(m40.M0);
        if (s != null) {
            final Boolean b = m40.g(m40.N0);
            final boolean b2 = b != null && b;
            final l40 l40 = m40.g(m40.O0);
            int n2;
            if (l40 == null) {
                n2 = -1;
            }
            else {
                n2 = ool.ool$a.a[((Enum)l40).ordinal()];
            }
            final int n3 = 2131166747;
            int n4;
            if (n2 != 1) {
                if (n2 != 2) {
                    n4 = n3;
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                n4 = n3;
                            }
                            else {
                                n4 = 2131166749;
                            }
                        }
                        else {
                            n4 = 2131166748;
                        }
                    }
                }
                else {
                    n4 = 2131166746;
                }
            }
            else {
                n4 = 2131166750;
            }
            final fsi a2 = this.a;
            final ncq$a companion = ncq.Companion;
            final int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(n4);
            final log h = ((log)((ara)a2).a((Object)n, (Object)s, (Object)companion.b(dimensionPixelSize, dimensionPixelSize), (Object)b2, (Object)UserIdentifier.Companion.c())).h((fk6)new cwt((rtb)new pol(this), 7));
            final nol nol = new nol((rtb)new qol(this, e), 0);
            final jvb$o d = jvb.d;
            final jvb$n c = jvb.c;
            f.a(((log)new ppg((qpg)h, (fk6)d, (fk6)d, (fk6)nol, (rj)c)).p((fk6)new oc6((rtb)new rol(remoteViews, n, e), 25), (fk6)new xja((rtb)sol.C0, 28), (rj)c), (raa)this.b);
        }
        b5j doOnError;
        if (m40.g(m40.P0) != null) {
            doOnError = ((b5j)e).doOnNext((fk6)new za6((rtb)new tol(this), 29)).doOnError((fk6)new aqi((rtb)new uol(this), 5));
        }
        else {
            doOnError = null;
        }
        b5j onErrorReturnItem = doOnError;
        if (doOnError == null) {
            onErrorReturnItem = ((b5j)e).doOnNext((fk6)new ab6((rtb)new vol(this), 27)).doOnError((fk6)new d7e((rtb)new wol(this), 27)).onErrorReturnItem((Object)a);
            zzd.e((Object)onErrorReturnItem, "override fun bind(viewId\u2026ReturnItem(NoValue)\n    }");
        }
        return onErrorReturnItem;
    }
}
