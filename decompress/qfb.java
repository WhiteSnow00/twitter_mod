// 
// Decompiled by Procyon v0.6.0
// 

public final class qfb
{
    public static final alp<qfb> e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        qfb.e = new qfb.qfb$b();
    }
    
    public qfb(final qfb.qfb$a qfb$a) {
        this.a = qfb$a.a;
        this.b = qfb$a.b;
        this.c = qfb$a.c;
        this.d = qfb$a.d;
    }
    
    public final abm a(final ncq ncq) {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int a2 = ncq.a;
        final int b2 = ncq.b;
        abm f;
        if (a2 > 0 && b2 > 0) {
            int n;
            if ((n = c) < 0) {
                n = 0;
            }
            int n2;
            if ((n2 = d) < 0) {
                n2 = 0;
            }
            final int min = Math.min(a2, b2);
            final int n3 = min / 2;
            final int min2 = Math.min(Math.max(n / 2 + (a - n3), 0), a2 - min);
            final int min3 = Math.min(Math.max(n2 / 2 + (b - n3), 0), b2 - min);
            f = new abm((float)min2, (float)min3, (float)(min2 + min), (float)(min3 + min));
        }
        else {
            f = abm.f;
        }
        return abm.c(f.h(), ncq);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qfb.class == o.getClass()) {
            final qfb qfb = (qfb)o;
            if (!w4j.a((Object)this.a, (Object)qfb.a) || !w4j.a((Object)this.b, (Object)qfb.b) || !w4j.a((Object)this.c, (Object)qfb.c) || !w4j.a((Object)this.d, (Object)qfb.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("FocusRect{x=");
        g.append(this.a);
        g.append(", y=");
        g.append(this.b);
        g.append(", width=");
        g.append(this.c);
        g.append(", height=");
        return y70.y(g, this.d, '}');
    }
}
