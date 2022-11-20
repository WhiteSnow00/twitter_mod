import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.Objects;
import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ick implements uaq<String, how>
{
    public final Resources D0;
    public final l4g E0;
    public final uaq<pbk$a, msm<obk, kbv>> F0;
    public pbk$a$a G0;
    public String H0;
    
    public ick(final Context context, final l4g e0, final uaq<pbk$a, msm<obk, kbv>> f0, final xbm xbm) {
        this.G0 = new pbk$a$a();
        this.D0 = context.getResources();
        this.E0 = e0;
        this.F0 = f0;
        xbm.i((oj)new ii4((Object)this, 21));
    }
    
    public final sog E(final qsb qsb) {
        return gw8.c((uaq)this, qsb);
    }
    
    public final /* bridge */ eaq R(final Object o) {
        return this.a((String)o);
    }
    
    public final eaq<how> a(final String s) {
        final l4g e0 = this.E0;
        final String h0 = this.H0;
        Objects.requireNonNull(e0);
        return (eaq<how>)eaq.t((Callable)new ivg((Object)e0, (Object)s, (Object)h0, 1)).I(owo.a()).y(gmw.H()).p((psb)new o78((Object)this, (Object)s, 1));
    }
    
    public final void close() {
        h1e.a((Closeable)this.F0);
    }
    
    public final sog m1(final r8x r8x) {
        return gw8.d((uaq)this, r8x);
    }
    
    public final uaq n(final p4s p4s) {
        return gw8.l((uaq)this, p4s);
    }
    
    public final uaq o(final qsb qsb) {
        return gw8.h((uaq)this, qsb);
    }
    
    public final l6j x0(final l6j l6j, final vw0 vw0) {
        return gw8.i((uaq)this, l6j, vw0);
    }
}
