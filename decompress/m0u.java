import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m0u extends kuh
{
    public final kuh l;
    public final rtb<Object, oyv> m;
    public final rtb<Object, oyv> n;
    public final boolean o;
    public final boolean p;
    
    public m0u(final kuh l, final rtb<Object, oyv> m, final rtb<Object, oyv> n, final boolean o, final boolean p5) {
        Objects.requireNonNull(dhq.Companion);
        final dhq g0 = dhq.G0;
        rtb rtb;
        if (l == null || (rtb = l.e) == null) {
            rtb = fhq.i.get().e;
        }
        final rtb<Object, oyv> k = fhq.k(m, (rtb<Object, oyv>)rtb, o);
        rtb rtb2;
        if (l == null || (rtb2 = l.f) == null) {
            rtb2 = fhq.i.get().f;
        }
        super(0, g0, (rtb)k, fhq.b(n, rtb2));
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p5;
    }
    
    public final kuh B() {
        kuh l;
        if ((l = this.l) == null) {
            final z4c value = fhq.i.get();
            zzd.e((Object)value, "currentGlobalSnapshot.get()");
            l = value;
        }
        return l;
    }
    
    public final void c() {
        ((ahq)this).c = true;
        if (this.p) {
            final kuh l = this.l;
            if (l != null) {
                l.c();
            }
        }
    }
    
    public final int d() {
        return ((ahq)this.B()).d();
    }
    
    public final dhq e() {
        return ((ahq)this.B()).e();
    }
    
    public final boolean g() {
        return this.B().g();
    }
    
    public final void j(final ahq ahq) {
        zzd.f((Object)ahq, "snapshot");
        xhq.a();
        throw null;
    }
    
    public final void k(final ahq ahq) {
        zzd.f((Object)ahq, "snapshot");
        xhq.a();
        throw null;
    }
    
    public final void l() {
        this.B().l();
    }
    
    public final void m(final j8r j8r) {
        zzd.f((Object)j8r, "state");
        this.B().m(j8r);
    }
    
    public final void q(final int n) {
        xhq.a();
        throw null;
    }
    
    public final void r(final dhq dhq) {
        zzd.f((Object)dhq, "value");
        xhq.a();
        throw null;
    }
    
    public final ahq s(final rtb<Object, oyv> rtb) {
        final rtb<Object, oyv> k = fhq.k(rtb, (rtb<Object, oyv>)super.e, true);
        ahq ahq;
        if (!this.o) {
            ahq = fhq.g(this.B().s((rtb)null), k, true);
        }
        else {
            ahq = this.B().s((rtb)k);
        }
        return ahq;
    }
    
    public final bhq u() {
        return this.B().u();
    }
    
    public final Set<j8r> v() {
        return this.B().v();
    }
    
    public final void y(final Set<j8r> set) {
        xhq.a();
        throw null;
    }
    
    public final kuh z(final rtb<Object, oyv> rtb, final rtb<Object, oyv> rtb2) {
        final rtb<Object, oyv> k = fhq.k(rtb, (rtb<Object, oyv>)super.e, true);
        final rtb b = fhq.b(rtb2, super.f);
        kuh z;
        if (!this.o) {
            z = new m0u(this.B().z((rtb)null, b), k, (rtb<Object, oyv>)b, false, true);
        }
        else {
            z = this.B().z((rtb)k, b);
        }
        return z;
    }
}
