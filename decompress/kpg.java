import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpg implements mpg
{
    public final zmp F0;
    public final mpg G0;
    
    public kpg(final zmp f0, final mpg g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final mpg Q2(final j5s j5s, final boolean b) {
        return lf.e((mpg)this, j5s, b);
    }
    
    public final epg W1(final Object o) {
        final zmp f0 = this.F0;
        final mpg g0 = this.G0;
        e0e.f((Object)f0, "$queryFilter");
        e0e.f((Object)g0, "this$0");
        final anp a = f0.a;
        final ymp b = f0.b;
        final boolean c = f0.c;
        final dva dva = (dva)o;
        Objects.requireNonNull(a);
        final boolean b2 = b.d || c;
        Label_0154: {
            if (b2) {
                final dnp g2 = a.G0;
                final UserIdentifier a2 = b.a;
                synchronized (g2) {
                    final dnp$a a3 = g2.a(a2);
                    if (a3.a()) {
                        a3.b = true;
                        monitorexit(g2);
                    }
                    else {
                        monitorexit(g2);
                    }
                    yua.e((yta)gdi.a);
                    break Label_0154;
                }
            }
            yua.e((yta)rei.a);
        }
        Object o2;
        if (b2) {
            o2 = g0.W1(o);
        }
        else {
            o2 = rpg.F0;
        }
        return (epg)o2;
    }
    
    public final void close() {
    }
    
    public final mpg o(final j5s j5s) {
        return lf.d((mpg)this, j5s);
    }
    
    public final mpg p(final stb stb) {
        return lf.c((mpg)this, stb);
    }
}
