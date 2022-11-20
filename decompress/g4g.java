import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4g implements fk1<g4g.g4g$a>
{
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final g4g.g4g$a g;
    public long h;
    public final int i;
    public final g4g.g4g$b j;
    public final boolean k;
    public final r89 l;
    public final String m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final rlp<g4g.g4g$a> q;
    
    public g4g(final long c, final String d, final long e, final long f, final g4g.g4g$a g) {
        czd.f((Object)d, "conversationId");
        czd.f((Object)g, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = -1L;
        final boolean b = true;
        this.i = 1;
        final g4g.g4g$b f2 = g.f;
        this.j = f2;
        final boolean k = f2 == g4g.g4g$b.F0 || f2 == g4g.g4g$b.G0;
        this.k = k;
        this.l = g.h;
        this.m = g.i;
        this.n = g.g;
        this.o = true;
        this.p = (k && this.E() && b);
        this.q = i4g.a.b;
    }
    
    public static g4g K(final g4g g4g, final g4g.g4g$a g4g$a) {
        final long c = g4g.c;
        final String d = g4g.d;
        final long e = g4g.e;
        final long f = g4g.f;
        Objects.requireNonNull(g4g);
        czd.f((Object)d, "conversationId");
        return new g4g(c, d, e, f, g4g$a);
    }
    
    public final boolean A(final fk1 fk1) {
        return go0.e((fk1)this, fk1);
    }
    
    public final boolean B(final long n) {
        return sk0.d((qr6)this, n);
    }
    
    public final String C() {
        return go0.a((fk1)this);
    }
    
    public final boolean D() {
        return false;
    }
    
    public final boolean E() {
        return this.c() || this.L();
    }
    
    public final boolean F() {
        return sk0.c((qr6)this);
    }
    
    public final long G(final qr6 qr6) {
        return Math.abs(qr6.a() - this.e);
    }
    
    public final boolean H() {
        return this.M(of7.L0);
    }
    
    public final String I(final boolean b) {
        return go0.b((fk1)this, b);
    }
    
    public final fk1 J(final boolean b) {
        return (fk1)this;
    }
    
    public final boolean L() {
        return this.n() || this.y();
    }
    
    public final boolean M(final of7 of7) {
        return go0.d((fk1)this, of7);
    }
    
    public final long a() {
        return this.e;
    }
    
    public final boolean b() {
        return ((fk1.b)this.getData()).b();
    }
    
    public final boolean c() {
        return this.M(of7.F0);
    }
    
    public final boolean d() {
        return this.M(of7.K0);
    }
    
    public final boolean e() {
        return ((fk1.b)this.getData()).e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g4g)) {
            return false;
        }
        final g4g g4g = (g4g)o;
        return this.c == g4g.c && czd.a((Object)this.d, (Object)g4g.d) && this.e == g4g.e && this.f == g4g.f && czd.a((Object)this.g, (Object)g4g.g);
    }
    
    public final ak1 f() {
        return ((fk1.b)this.getData()).f();
    }
    
    public final cfu g() {
        return ((fk1.b)this.getData()).g();
    }
    
    public final String getConversationId() {
        return this.d;
    }
    
    public final Object getData() {
        return this.g;
    }
    
    public final long getId() {
        return this.c;
    }
    
    public final int getType() {
        return this.i;
    }
    
    public final String h() {
        return ((fk1.b)this.getData()).h();
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int f = hmg.f(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f2 = this.f;
        return this.g.hashCode() + ((f + n) * 31 + (int)(f2 >>> 32 ^ f2)) * 31;
    }
    
    public final int i() {
        return ((fk1.b)this.getData()).i();
    }
    
    public final boolean isInline() {
        return sk0.b((qr6)this);
    }
    
    public final List j() {
        return ((fk1.b)this.getData()).j();
    }
    
    public final long k() {
        return ((fk1.b)this.getData()).k();
    }
    
    public final boolean l() {
        return ((fk1.b)this.getData()).l();
    }
    
    public final long m() {
        return this.f;
    }
    
    public final boolean n() {
        return this.M(of7.G0);
    }
    
    public final byte[] o() {
        return sk0.a((qr6)this);
    }
    
    public final boolean p() {
        return this.f() != null;
    }
    
    public final boolean q() {
        return this.M(of7.I0);
    }
    
    public final boolean r() {
        return ikr.g((CharSequence)((oxm)this.g()).D0);
    }
    
    public final boolean s() {
        return this.o;
    }
    
    public final long t() {
        return qr6.b;
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String d = this.d;
        final long e = this.e;
        final long f = this.f;
        final g4g.g4g$a g = this.g;
        final StringBuilder p = gw8.p("LocalMessageEntry(id=", c, ", conversationId=", d);
        e1.C(p, ", date=", e, ", senderId=");
        p.append(f);
        p.append(", data=");
        p.append(g);
        p.append(")");
        return p.toString();
    }
    
    public final boolean u() {
        return this.p;
    }
    
    public final rlp<g4g.g4g$a> v() {
        return (rlp<g4g.g4g$a>)this.q;
    }
    
    public final long w() {
        return this.h;
    }
    
    public final boolean x() {
        return this.j().isEmpty() ^ true;
    }
    
    public final boolean y() {
        return this.M(of7.H0);
    }
    
    public final boolean z() {
        return this.M(of7.M0);
    }
}
