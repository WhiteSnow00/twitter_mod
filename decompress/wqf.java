import java.util.concurrent.TimeUnit;
import com.twitter.app.di.app.DaggerTwApplOG$yy;
import java.util.Objects;
import com.twitter.app.di.app.DaggerTwApplOG$xy;
import com.twitter.model.liveevent.LiveEventConfiguration;
import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqf implements xzf
{
    public final b a;
    public final hp6 b;
    public final bn9 c;
    
    public wqf(final b a, final hp6 b, final bn9 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        return true;
    }
    
    public final ufv b(final LiveEventConfiguration liveEventConfiguration) {
        return ih2.a(this.getId(), liveEventConfiguration.eventId);
    }
    
    public final ezw c(final long n, final cwf e, final LiveEventConfiguration f, final lzw g) {
        final DaggerTwApplOG$xy daggerTwApplOG$xy = (DaggerTwApplOG$xy)((duf)cgw.a().c((Class)duf.class)).P5();
        Objects.requireNonNull(daggerTwApplOG$xy);
        final Long value = n;
        Objects.requireNonNull(value);
        daggerTwApplOG$xy.h = value;
        daggerTwApplOG$xy.d = (xzf)this;
        Objects.requireNonNull(f);
        daggerTwApplOG$xy.f = f;
        Objects.requireNonNull(e);
        daggerTwApplOG$xy.e = e;
        daggerTwApplOG$xy.g = g;
        daggerTwApplOG$xy.c = (h1)this.g(n);
        return ((DaggerTwApplOG$yy)daggerTwApplOG$xy.a()).h();
    }
    
    public final cyw$a d(final boolean b) {
        final cyw$a cyw$a = new cyw$a();
        cyw$a.c = (ulk)r1n.N0;
        Object d;
        if (this.a.m0() / (float)this.a.u() > 1.0f) {
            if (b) {
                d = tkr.M0;
            }
            else {
                d = tkr.L0;
            }
        }
        else if (b) {
            d = tkr.K0;
        }
        else {
            d = tkr.J0;
        }
        cyw$a.d = (j7x)d;
        cyw$a.a = (h1)this.e();
        cyw$a.k = this.c;
        return cyw$a;
    }
    
    public final je8 e() {
        return this.g(0L);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && wqf.class == o.getClass()) {
            final wqf wqf = (wqf)o;
            if (!this.a.equals(wqf.a) || !o5j.a((Object)this.b, (Object)wqf.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final float f() {
        float n;
        if (this.a.F()) {
            n = Float.MAX_VALUE;
        }
        else {
            final b a = this.a;
            final TimeUnit seconds = TimeUnit.SECONDS;
            n = (float)a.l();
        }
        return n;
    }
    
    public final je8 g(final long d) {
        final rh2$b rh2$b = new rh2$b();
        rh2$b.c = this.a;
        rh2$b.a = this.b;
        rh2$b.d = d;
        rh2$b.b = false;
        return (je8)((z4j)rh2$b).e();
    }
    
    public final String getId() {
        return this.a.w();
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.b) + this.a.hashCode() * 31;
    }
}
