import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nq implements mq
{
    public final Context a;
    public final iq b;
    
    public nq(final Context a, final iq b) {
        this.a = a;
        this.b = b;
    }
    
    public final lq get() {
        final Context a = this.a;
        lq lq;
        try {
            cj1.e();
            final yv$a a2 = yv.a(a);
            lq = new lq(a2.a, a2.b);
        }
        catch (final Exception ex) {
            lq = null;
        }
        final iq b = this.b;
        np.a();
        if (b.a(lq)) {
            return null;
        }
        return lq;
    }
}
