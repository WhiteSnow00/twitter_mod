import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class skb implements qkb$b
{
    public final aik a;
    public final nik b;
    public final hnv c;
    public final wkb d;
    public final zhk e;
    public final stb<fnv, Object> f;
    
    public skb(final aik a, final nik b) {
        final hnv a2 = tkb.a;
        final wkb d = new wkb(tkb.b);
        final zhk e = new zhk(0);
        e0e.f((Object)a2, "typefaceRequestCache");
        this.a = a;
        this.b = b;
        this.c = a2;
        this.d = d;
        this.e = e;
        this.f = new rkb(this);
    }
    
    public final l9r<Object> a(qkb b, qlb d, int a, int c) {
        e0e.f((Object)d, "fontWeight");
        b = this.b.b(b);
        d = this.b.d(d);
        a = this.b.a(a);
        c = this.b.c(c);
        this.a.b();
        return this.b(new fnv(b, d, a, c, (Object)null));
    }
    
    public final l9r<Object> b(final fnv fnv) {
        final hnv c = this.c;
        final skb$a skb$a = new skb$a(this, fnv);
        Objects.requireNonNull(c);
        synchronized (c.a) {
            final inv inv = (inv)c.b.a((Object)fnv);
            if (inv != null) {
                if (inv.b()) {
                    monitorexit(c.a);
                    final Object o = inv;
                    return (l9r<Object>)o;
                }
                final inv inv2 = (inv)c.b.c((Object)fnv);
            }
            monitorexit(c.a);
            try {
                final inv inv3 = (inv)skb$a.invoke((Object)new gnv(c, fnv));
                final tpz a = c.a;
                synchronized (c.a) {
                    if (c.b.a((Object)fnv) == null && inv3.b()) {
                        c.b.b((Object)fnv, (Object)inv3);
                    }
                    monitorexit(c.a);
                    final Object o = inv3;
                    return (l9r<Object>)o;
                }
            }
            catch (final Exception ex) {
                throw new IllegalStateException("Could not load font", ex);
            }
        }
    }
}
