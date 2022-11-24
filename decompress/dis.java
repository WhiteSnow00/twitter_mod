import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dis implements egs
{
    public final eis a;
    public final boolean b;
    
    public dis(final eis a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final eis a = this.a;
        bcc bcc;
        if (this.b) {
            bcc = bcc.G0;
        }
        else {
            bcc = bcc.H0;
        }
        eis.b(a, bcc);
        final eis a2 = this.a;
        ((cjq<kgj>)a2.p).setValue(new kgj(tfp.a(a2.j(this.b))));
    }
    
    public final void b(final long n) {
        final eis a = this.a;
        a.l = tfp.a(a.j(this.b));
        final eis a2 = this.a;
        ((cjq<kgj>)a2.p).setValue(new kgj(a2.l));
        final eis a3 = this.a;
        Objects.requireNonNull(kgj.Companion);
        a3.n = kgj.b;
        final eis a4 = this.a;
        bcc bcc;
        if (this.b) {
            bcc = bcc.G0;
        }
        else {
            bcc = bcc.H0;
        }
        eis.b(a4, bcc);
        final pis d = this.a.d;
        if (d != null) {
            d.k = false;
        }
    }
    
    public final void c() {
        eis.b(this.a, (bcc)null);
        eis.a(this.a, (kgj)null);
    }
    
    public final void d(long b) {
        final eis a = this.a;
        a.n = kgj.h(a.n, b);
        final pis d = this.a.d;
        if (d != null) {
            final rjs c = d.c();
            if (c != null) {
                final qjs a2 = c.a;
                if (a2 != null) {
                    final eis a3 = this.a;
                    final boolean b2 = this.b;
                    ((cjq<kgj>)a3.p).setValue(new kgj(kgj.h(a3.l, a3.n)));
                    int n;
                    if (b2) {
                        final kgj i = a3.i();
                        e0e.c((Object)i);
                        n = a2.l(i.a);
                    }
                    else {
                        final ngj b3 = a3.b;
                        b = a3.k().b;
                        final zjs.a companion = zjs.Companion;
                        n = b3.b((int)(b >> 32));
                    }
                    int n2;
                    if (b2) {
                        n2 = a3.b.b(zjs.d(a3.k().b));
                    }
                    else {
                        final kgj j = a3.i();
                        e0e.c((Object)j);
                        n2 = a2.l(j.a);
                    }
                    final sis k = a3.k();
                    Objects.requireNonNull(jfp.Companion);
                    eis.c(a3, k, n, n2, b2, (jfp)jfp.a.c);
                }
            }
        }
        final pis d2 = this.a.d;
        if (d2 != null) {
            d2.k = false;
        }
    }
    
    public final void j() {
        eis.b(this.a, (bcc)null);
        eis.a(this.a, (kgj)null);
        final eis a = this.a;
        final pis d = a.d;
        if (d != null) {
            d.k = true;
        }
        final nks h = a.h;
        int c;
        if (h != null) {
            c = h.c();
        }
        else {
            c = 0;
        }
        if (c == 2) {
            this.a.o();
        }
    }
    
    public final void onCancel() {
    }
}
