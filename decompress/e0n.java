import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class e0n implements jld
{
    public final boolean a;
    public final float b;
    public final l9r<sr4> c;
    
    public e0n(final boolean a, final float b, final l9r c, final wg8 wg8) {
        this.a = a;
        this.b = b;
        this.c = (l9r<sr4>)c;
    }
    
    @Override
    public final kld a(final hvd hvd, final d86 d86) {
        e0e.f((Object)hvd, "interactionSource");
        d86.x(988743187);
        final p0n p0n = (p0n)d86.m((df6)q0n.a);
        d86.x(-1524341038);
        final long a = ((sr4)this.c.getValue()).a;
        Objects.requireNonNull(sr4.Companion);
        long n;
        if (a != sr4.g) {
            n = ((sr4)this.c.getValue()).a;
        }
        else {
            n = p0n.b(d86);
        }
        d86.O();
        final n0n b = this.b(hvd, this.a, this.b, zzz.h0((Object)new sr4(n), d86), zzz.h0((Object)p0n.a(d86), d86), d86);
        shw.i((Object)b, (Object)hvd, (hub)new d0n(hvd, b, null), d86);
        d86.O();
        return (kld)b;
    }
    
    public abstract n0n b(final hvd p0, final boolean p1, final float p2, final l9r<sr4> p3, final l9r<f0n> p4, final d86 p5, final int p6);
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0n)) {
            return false;
        }
        final boolean a = this.a;
        final e0n e0n = (e0n)o;
        return a == e0n.a && s99.b(this.b, e0n.b) && e0e.a((Object)this.c, (Object)e0n.c);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.a) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return this.c.hashCode() + dn.g(this.b, n * 31, 31);
    }
}
