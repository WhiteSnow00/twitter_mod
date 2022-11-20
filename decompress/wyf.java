import android.view.View$OnClickListener;
import com.twitter.android.liveevent.di.dock.LiveEventVodDockObjectGraph;
import com.twitter.app.di.app.DaggerTwApplOG$iz;
import java.util.Objects;
import com.twitter.app.di.app.DaggerTwApplOG$hz;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wyf implements bzf
{
    public final bo6 a;
    public final vbu b;
    public final lo1 c;
    public final zl9 d;
    public final boolean e;
    
    public wyf(final bo6 a, final String s, final uil uil, final zl9 d) {
        final syf b = new syf(a, s, uil);
        this.a = a;
        this.b = (vbu)b;
        final boolean e = ((vbu)b).getType() == 3;
        this.e = e;
        Object c;
        if (e) {
            c = ffz.Q0;
        }
        else {
            c = ffz.P0;
        }
        this.c = (lo1)c;
        this.d = d;
    }
    
    public final boolean a() {
        return this.e ^ true;
    }
    
    public final gfv b(final LiveEventConfiguration liveEventConfiguration) {
        final String eventId = liveEventConfiguration.eventId;
        final gfv gfv = new gfv();
        zxf.a(gfv, eventId);
        return gfv;
    }
    
    public final oyw c(final long n, final hvf e, final LiveEventConfiguration f, final vyw g) {
        final LiveEventVodDockObjectGraph.a g2 = ((itf)mfw.a().c((Class)itf.class)).G4();
        final bo6 a = this.a;
        final DaggerTwApplOG$hz daggerTwApplOG$hz = (DaggerTwApplOG$hz)g2;
        Objects.requireNonNull(daggerTwApplOG$hz);
        Objects.requireNonNull(a);
        daggerTwApplOG$hz.h = a;
        daggerTwApplOG$hz.d = (bzf)this;
        Objects.requireNonNull(e);
        daggerTwApplOG$hz.e = e;
        Objects.requireNonNull(f);
        daggerTwApplOG$hz.f = f;
        daggerTwApplOG$hz.g = g;
        final vbu b = this.b;
        Objects.requireNonNull(b);
        daggerTwApplOG$hz.c = (i1)b;
        return ((DaggerTwApplOG$iz)daggerTwApplOG$hz.a()).h();
    }
    
    public final mxw$a d(final boolean b) {
        final mxw$a mxw$a = new mxw$a();
        mxw$a.c = (flk)this.c;
        final boolean b2 = this.b.U1() > 1.0f;
        Object d;
        if (this.e) {
            if (b2) {
                if (b) {
                    d = c9y.S0;
                }
                else {
                    d = c9y.R0;
                }
            }
            else if (b) {
                d = c9y.Q0;
            }
            else {
                d = c9y.P0;
            }
        }
        else if (b2) {
            if (b) {
                d = c9y.O0;
            }
            else {
                d = c9y.N0;
            }
        }
        else if (b) {
            d = c9y.M0;
        }
        else {
            d = c9y.L0;
        }
        mxw$a.d = (r6x)d;
        mxw$a.a = (i1)this.b;
        mxw$a.k = this.d;
        return mxw$a;
    }
    
    public final gd8 e() {
        return (gd8)this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && wyf.class == o.getClass() && this.a.equals((Object)((wyf)o).a));
    }
    
    public final float f() {
        final dtg h = wug.h(this.a.f());
        if (h != null && wug.v(h)) {
            final i2h v0 = h.V0;
            if (v0 != null) {
                return v0.b;
            }
        }
        return 0.0f;
    }
    
    public final mxw g(final hvf b, final View$OnClickListener e) {
        final xl3 s0 = ffz.S0;
        final mxw$a mxw$a = new mxw$a();
        final vbu b2 = this.b;
        mxw$a.a = (i1)b2;
        mxw$a.c = (flk)s0;
        mxw$a.b = (mba)b;
        mxw$a.e = e;
        Object d;
        if (b2.U1() > 1.0f) {
            if (this.e) {
                d = c9y.W0;
            }
            else {
                d = c9y.Y0;
            }
        }
        else if (this.e) {
            d = c9y.V0;
        }
        else {
            d = c9y.X0;
        }
        mxw$a.d = (r6x)d;
        mxw$a.k = this.d;
        return (mxw)((n4j)mxw$a).e();
    }
    
    public final String getId() {
        return this.a.X0();
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
