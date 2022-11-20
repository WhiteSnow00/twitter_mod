import androidx.fragment.app.p;
import android.content.res.Resources;
import com.twitter.android.liveevent.landing.scribe.a;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivf extends ste implements qsb<Boolean, fzv>
{
    public final lvf D0;
    public final cgv E0;
    
    public ivf(final lvf d0, final cgv e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object ex) {
        final Boolean b = (Boolean)ex;
        czd.e((Object)b, "isBlocked");
        Label_0375: {
            if (b) {
                final xe e = this.D0.e;
                final cgv e2 = this.E0;
                czd.e((Object)e2, "user");
                Objects.requireNonNull(e);
                final u12 e3 = e.e;
                e3.b.a((orc)new t12(e3.a, e3.d, e2.D0, (uil)null, 3)).D();
                final a d = this.D0.d;
                Objects.requireNonNull(d);
                d.o(vba.g("live_event_timeline", "live_event_header", "action_sheet", "", "unblock"), (j0p)d.m((String)null));
                ex = (NullPointerException)this.D0;
                final cgv e4 = this.E0;
                czd.e((Object)e4, "user");
                lvf.a((lvf)ex, false, e4);
                break Label_0375;
            }
            final xe e5 = this.D0.e;
            final cgv e6 = this.E0;
            czd.e((Object)e6, "user");
            Objects.requireNonNull(e5);
            if ((ex = (NullPointerException)e6.K0) == null) {
                ex = (NullPointerException)"";
            }
            final u12 e7 = e5.e;
            final Resources resources = e7.a.getResources();
            final p c = e7.c;
            final gqo gqo = new gqo(resources, (String)ex);
            final int m2 = wk1.m2;
            final dga dga = new dga((Object)gqo, (Object)c, 9);
            final we we = new we(e5, e6, (String)ex);
            Objects.requireNonNull((ecq)we, "observer is null");
            try {
                ex = (NullPointerException)new paq$a((ecq)we);
                ((ecq)we).onSubscribe((t19)ex);
                try {
                    ((gcq)dga).n((ibq)ex);
                }
                finally {
                    final Throwable t;
                    g97.F(t);
                    ((paq$a)ex).a(t);
                }
                ex = (NullPointerException)this.D0.d;
                Objects.requireNonNull(ex);
                ((a)ex).o(vba.g("live_event_timeline", "live_event_header", "action_sheet", "", "block"), (j0p)((a)ex).m((String)null));
                final lvf d2 = this.D0;
                ex = (NullPointerException)this.E0;
                czd.e((Object)ex, "user");
                lvf.a(d2, true, (cgv)ex);
                return fzv.a;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
        }
        final Throwable t2;
        g97.F(t2);
        ex = new NullPointerException("subscribeActual failed");
        ex.initCause(t2);
        throw ex;
    }
}
