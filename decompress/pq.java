import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pq implements oq
{
    public final Context a;
    public final kq b;
    
    public pq(final Context a, final kq b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final nq get() {
        final Context a = this.a;
        nq nq;
        try {
            fj1.e();
            final yv$a a2 = yv.a(a);
            nq = new nq(a2.a, a2.b);
        }
        catch (final Exception ex) {
            nq = null;
        }
        final kq b = this.b;
        pp.a();
        if (b.a(nq)) {
            return null;
        }
        return nq;
    }
}
