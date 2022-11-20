import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efp implements mfs
{
    public final cfp a;
    public final boolean b;
    
    public efp(final cfp a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final kep h = this.a.h();
        if (h == null) {
            return;
        }
        kep$a kep$a;
        if (this.b) {
            kep$a = h.a;
        }
        else {
            kep$a = h.b;
        }
        final aep f = this.a.f(kep$a);
        if (f == null) {
            return;
        }
        final eve c = f.c();
        if (c == null) {
            return;
        }
        final long a = wep.a(f.b(h, this.b));
        final cfp a2 = this.a;
        a2.p.setValue((Object)new wfj(a2.k().v(c, a)));
        final cfp a3 = this.a;
        zac zac;
        if (this.b) {
            zac = zac.E0;
        }
        else {
            zac = zac.F0;
        }
        cfp.c(a3, zac);
    }
    
    public final void b() {
        this.a.n();
        cfp.c(this.a, null);
        cfp.a(this.a, null);
    }
    
    public final void c(long n) {
        this.a.i();
        final kep h = this.a.h();
        czd.c((Object)h);
        final aep aep = this.a.a.c.get(h.a.c);
        final aep aep2 = this.a.a.c.get(h.b.c);
        final boolean b = this.b;
        final eve eve = null;
        eve eve2 = null;
        if (b) {
            if (aep != null) {
                eve2 = aep.c();
            }
            czd.c((Object)eve2);
        }
        else {
            eve2 = eve;
            if (aep2 != null) {
                eve2 = aep2.c();
            }
            czd.c((Object)eve2);
        }
        if (this.b) {
            czd.c((Object)aep);
            n = aep.b(h, true);
        }
        else {
            czd.c((Object)aep2);
            n = aep2.b(h, false);
        }
        n = wep.a(n);
        final cfp a = this.a;
        n = a.k().v(eve2, n);
        a.k.setValue((Object)new wfj(n));
        final cfp a2 = this.a;
        Objects.requireNonNull(wfj.Companion);
        cfp.b(a2, wfj.b);
    }
    
    public final void d() {
        cfp.c(this.a, null);
        cfp.a(this.a, null);
    }
    
    public final void e(long h) {
        final cfp a = this.a;
        cfp.b(a, wfj.h(((wfj)a.l.getValue()).a, h));
        h = wfj.h(((wfj)this.a.k.getValue()).a, ((wfj)this.a.l.getValue()).a);
        final cfp a2 = this.a;
        final wfj wfj = new wfj(h);
        final wfj wfj2 = new wfj(((wfj)this.a.k.getValue()).a);
        final boolean b = this.b;
        Objects.requireNonNull(mep.Companion);
        if (a2.q(wfj, wfj2, b, (mep)mep$a.f)) {
            this.a.k.setValue((Object)new wfj(h));
            final cfp a3 = this.a;
            Objects.requireNonNull(wfj.Companion);
            cfp.b(a3, wfj.b);
        }
    }
    
    public final void onCancel() {
        this.a.n();
        cfp.c(this.a, null);
        cfp.a(this.a, null);
    }
}
