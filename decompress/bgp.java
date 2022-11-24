import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgp implements egs
{
    public final zfp a;
    public final boolean b;
    
    public bgp(final zfp a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final hfp h = this.a.h();
        if (h == null) {
            return;
        }
        hfp$a hfp$a;
        if (this.b) {
            hfp$a = h.a;
        }
        else {
            hfp$a = h.b;
        }
        final xep f = this.a.f(hfp$a);
        if (f == null) {
            return;
        }
        final bwe c = f.c();
        if (c == null) {
            return;
        }
        final long a = tfp.a(f.b(h, this.b));
        final zfp a2 = this.a;
        ((cjq<kgj>)a2.p).setValue(new kgj(a2.k().v(c, a)));
        final zfp a3 = this.a;
        bcc bcc;
        if (this.b) {
            bcc = bcc.G0;
        }
        else {
            bcc = bcc.H0;
        }
        zfp.c(a3, bcc);
    }
    
    public final void b(long n) {
        this.a.i();
        final hfp h = this.a.h();
        e0e.c((Object)h);
        final xep xep = this.a.a.c.get(h.a.c);
        final xep xep2 = this.a.a.c.get(h.b.c);
        final boolean b = this.b;
        final bwe bwe = null;
        bwe bwe2 = null;
        if (b) {
            if (xep != null) {
                bwe2 = xep.c();
            }
            e0e.c((Object)bwe2);
        }
        else {
            bwe2 = bwe;
            if (xep2 != null) {
                bwe2 = xep2.c();
            }
            e0e.c((Object)bwe2);
        }
        if (this.b) {
            e0e.c((Object)xep);
            n = xep.b(h, true);
        }
        else {
            e0e.c((Object)xep2);
            n = xep2.b(h, false);
        }
        n = tfp.a(n);
        final zfp a = this.a;
        n = a.k().v(bwe2, n);
        ((cjq<kgj>)a.k).setValue(new kgj(n));
        final zfp a2 = this.a;
        Objects.requireNonNull(kgj.Companion);
        zfp.b(a2, kgj.b);
    }
    
    public final void c() {
        zfp.c(this.a, null);
        zfp.a(this.a, null);
    }
    
    public final void d(long h) {
        final zfp a = this.a;
        zfp.b(a, kgj.h(((kgj)((cjq<Object>)a.l).getValue()).a, h));
        h = kgj.h(((cjq<kgj>)this.a.k).getValue().a, ((cjq<kgj>)this.a.l).getValue().a);
        final zfp a2 = this.a;
        final kgj kgj = new kgj(h);
        final kgj kgj2 = new kgj(((cjq<kgj>)this.a.k).getValue().a);
        final boolean b = this.b;
        Objects.requireNonNull(jfp.Companion);
        if (a2.q(kgj, kgj2, b, (jfp)jfp.a.f)) {
            ((cjq<kgj>)this.a.k).setValue(new kgj(h));
            final zfp a3 = this.a;
            Objects.requireNonNull(kgj.Companion);
            zfp.b(a3, kgj.b);
        }
    }
    
    public final void j() {
        this.a.n();
        zfp.c(this.a, null);
        zfp.a(this.a, null);
    }
    
    public final void onCancel() {
        this.a.n();
        zfp.c(this.a, null);
        zfp.a(this.a, null);
    }
}
