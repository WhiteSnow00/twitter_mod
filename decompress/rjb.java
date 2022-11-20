import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rjb implements pjb$b
{
    public final lhk a;
    public final yhk b;
    public final vmv c;
    public final vjb d;
    public final v4j e;
    public final qsb<tmv, Object> f;
    
    public rjb(final lhk a, final yhk b) {
        final vmv a2 = sjb.a;
        final vjb d = new vjb(sjb.b);
        final v4j e = new v4j(1);
        czd.f((Object)a2, "typefaceRequestCache");
        this.a = a;
        this.b = b;
        this.c = a2;
        this.d = d;
        this.e = e;
        this.f = new qjb(this);
    }
    
    public final m8r<Object> a(pjb b, pkb d, int a, int c) {
        czd.f((Object)d, "fontWeight");
        b = this.b.b(b);
        d = this.b.d(d);
        a = this.b.a(a);
        c = this.b.c(c);
        this.a.b();
        return this.b(new tmv(b, d, a, c, (Object)null));
    }
    
    public final m8r<Object> b(final tmv tmv) {
        final vmv c = this.c;
        final rjb$a rjb$a = new rjb$a(this, tmv);
        Objects.requireNonNull(c);
        synchronized (c.a) {
            final wmv wmv = (wmv)c.b.a((Object)tmv);
            if (wmv != null) {
                if (wmv.b()) {
                    monitorexit(c.a);
                    final Object o = wmv;
                    return (m8r<Object>)o;
                }
                final wmv wmv2 = (wmv)c.b.c((Object)tmv);
            }
            monitorexit(c.a);
            try {
                final wmv wmv3 = (wmv)rjb$a.invoke((Object)new umv(c, tmv));
                final ii8 a = c.a;
                synchronized (c.a) {
                    if (c.b.a((Object)tmv) == null && wmv3.b()) {
                        c.b.b((Object)tmv, (Object)wmv3);
                    }
                    monitorexit(c.a);
                    final Object o = wmv3;
                    return (m8r<Object>)o;
                }
            }
            catch (final Exception ex) {
                throw new IllegalStateException("Could not load font", ex);
            }
        }
    }
}
