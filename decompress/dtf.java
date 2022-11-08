import java.util.regex.Pattern;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtf implements jpd
{
    public final gtf b;
    public final qpd c;
    public final xwf d;
    public final ftf e;
    public final xuu f;
    public final qvo g;
    public final kn h;
    public final rd6 i;
    public String j;
    public qof k;
    
    public dtf(final cwf cwf, final gtf b, final qpd c, final xwf d, final ftf e, final xuu f, final mtf mtf, final kn h, final qvo g, final ibm ibm) {
        final rd6 i = new rd6();
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        c.R1((jpd)this);
        i.a(((b5j)((ggm)cwf).C0).distinctUntilChanged().subscribe((fk6)new k0p((Object)this, 5)));
        i.a(((b5j)((ggm)mtf).C0).subscribe((fk6)new j0p((Object)this, 6)));
        ibm.i((rj)new aq1((Object)this, 2));
    }
    
    public final void A() {
        this.h.cancel();
    }
    
    public final void b(final ea9 ea9) {
        if (this.j != null) {
            final qof k = this.k;
            if (k != null) {
                final onu n = ea9.n;
                String b;
                if (n != null) {
                    b = n.b;
                }
                else {
                    b = null;
                }
                boolean b2 = false;
                Label_0113: {
                    if (k != null) {
                        for (final esj esj : this.d.b(k)) {
                            if (b != null) {
                                final String n2 = esj.n;
                                final Pattern a = pjr.a;
                                if (zzd.a((Object)b, (Object)n2)) {
                                    break Label_0113;
                                }
                                continue;
                            }
                        }
                        b2 = true;
                    }
                }
                if (b2) {
                    this.i.a(this.f.e(ea9.a).filter((ptk)asx.N0).map((qtb)qut.E0).filter((ptk)cc3.S0).observeOn(this.g).filter((ptk)new fj4((Object)this, 10)).subscribe((fk6)new ocs((Object)this, 9)));
                }
            }
        }
    }
    
    public final void m() {
        this.h.cancel();
    }
}
