import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmz
{
    public long a;
    public long b;
    public final hmz c;
    public final nmz d;
    
    public jmz(final nmz d) {
        this.d = d;
        this.c = new hmz(this, (wbz)((pbz)d).D0);
        Objects.requireNonNull(((pbz)d).D0.Q0);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }
    
    public final boolean a(final boolean b, final boolean b2, final long n) {
        ((axy)this.d).g();
        ((x1z)this.d).h();
        guz.c();
        if (((pbz)this.d).D0.J0.t(null, uzy.f0)) {
            if (((pbz)this.d).D0.h()) {
                final f4z q0 = ((pbz)this.d).D0.u().Q0;
                Objects.requireNonNull(((pbz)this.d).D0.Q0);
                q0.b(System.currentTimeMillis());
            }
        }
        else {
            final f4z q2 = ((pbz)this.d).D0.u().Q0;
            Objects.requireNonNull(((pbz)this.d).D0.Q0);
            q2.b(System.currentTimeMillis());
        }
        long n2 = n - this.a;
        if (!b && n2 < 1000L) {
            ((pbz)this.d).D0.b().Q0.b("Screen exposed for less than 1000 ms. Event not sent. time", (Object)n2);
            return false;
        }
        if (!b2) {
            n2 = n - this.b;
            this.b = n;
        }
        ((pbz)this.d).D0.b().Q0.b("Recording user engagement, ms", (Object)n2);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_et", n2);
        lpz.x(((pbz)this.d).D0.y().n(((pbz)this.d).D0.J0.v() ^ true), bundle, true);
        if (!b2) {
            ((pbz)this.d).D0.w().o("auto", "_e", bundle);
        }
        this.a = n;
        ((uey)this.c).a();
        ((uey)this.c).c(3600000L);
        return true;
    }
}
