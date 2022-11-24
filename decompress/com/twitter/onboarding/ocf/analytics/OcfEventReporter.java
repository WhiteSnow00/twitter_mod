// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.analytics;

import java.util.Iterator;
import java.util.List;
import android.content.res.Resources;

@a91
public class OcfEventReporter
{
    public boolean a;
    public final Resources b;
    public final scs c;
    public final sbw d;
    public final rbq<h0p, btm<kni, zbv>> e;
    
    public OcfEventReporter(final Resources b, final duo duo, final scs c, final sbw d, final rbq<h0p, btm<kni, zbv>> e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        duo.b(this);
    }
    
    public final void a(final List<g0p> list, final ia3 ia3) {
        if (list != null) {
            for (final g0p g0p : list) {
                if (g0p.a == ia3) {
                    if (flr.g((CharSequence)g0p.b)) {
                        final rbq<h0p, btm<kni, zbv>> e = this.e;
                        final String b = g0p.b;
                        final g5s a = nq1.a;
                        e.S(new h0p(b, Long.valueOf(System.currentTimeMillis()))).c((bdq)new zp1());
                    }
                    if (g0p.c == null) {
                        continue;
                    }
                    final tej c = g0p.c;
                    String a2 = c.a;
                    if (a2 == null) {
                        a2 = "";
                    }
                    String b2 = c.b;
                    if (b2 == null) {
                        b2 = "";
                    }
                    String c2 = c.c;
                    if (c2 == null) {
                        c2 = "";
                    }
                    String d = c.d;
                    if (d == null) {
                        d = "";
                    }
                    String e2 = c.e;
                    if (e2 == null) {
                        e2 = "";
                    }
                    this.b(new fg4(new dda(a2, b2, c2, d, e2)), null);
                }
            }
        }
    }
    
    public final void b(final fg4 fg4, String s) {
        final scs c = this.c;
        final ufv ufv = new ufv();
        ufv.k = c.a.a;
        ufv.b = c.h.a;
        if (flr.g((CharSequence)s)) {
            ufv.v = s;
        }
        ((o1p)fg4).i((d1p)ufv);
        if (this.b.getConfiguration().orientation == 2) {
            s = "2";
        }
        else {
            s = "1";
        }
        ((o1p)fg4).G = s;
        final int a = o5j.a;
        this.d.c((tlm)fg4);
    }
    
    public final void c() {
        if (!this.a) {
            this.a = true;
            this.b(new fg4(zba.a), null);
            this.a(this.c.h.b.g, ia3.I0);
        }
    }
    
    public final void d() {
        this.b(new fg4(zba.c), null);
    }
}
