import java.util.AbstractCollection;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class g4w<OBJECT, ERROR> extends kmm<OBJECT, ERROR>
{
    public sal V0;
    public final String W0;
    public dj8 X0;
    public int Y0;
    
    public g4w(final UserIdentifier userIdentifier) {
        super(userIdentifier);
        this.W0 = ((cw0)this).C0;
        ((cw0)this).f();
    }
    
    public tsc<OBJECT, ERROR> b() {
        final tsc<OBJECT, ERROR> i0 = this.i0();
        final dj8 x0 = this.X0;
        if (x0 != null) {
            final sal v0 = this.V0;
            if (v0 != null) {
                nca nca;
                if (!i0.b) {
                    nca = nca.e(x0.a, "failure");
                }
                else if (v0.i > 1) {
                    nca = nca.e(x0.a, "retry");
                }
                else {
                    nca = nca.e(x0.a, "success");
                }
                final AbstractCollection k = v0.k;
                final zf4 zf4 = new zf4(super.P0);
                zf4.T = nca.toString();
                final int a = w4j.a;
                zf4.s = 2;
                zf4.t = pjr.h((CharSequence)",", (Iterable)k);
                saw.b((okm)zf4);
            }
            Objects.requireNonNull(this.X0);
        }
        return i0;
    }
    
    public final void e0() {
        final iw0 metrics = ((cw0)this).getMetrics();
        pf8.r(metrics);
        metrics.c("uploadDuration");
    }
    
    public String f0() {
        return this.W0;
    }
    
    public abstract String g0();
    
    public final void h0() {
        final iw0 metrics = ((cw0)this).getMetrics();
        pf8.r(metrics);
        metrics.b("uploadDuration");
    }
    
    public abstract tsc<OBJECT, ERROR> i0();
    
    public final String l() {
        return this.g0();
    }
}
