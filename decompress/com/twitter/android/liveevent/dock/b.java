// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.dock;

import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;

public final class b
{
    public final ayw a;
    public final z59 b;
    public final o69 c;
    public final a d;
    public final szf e;
    public final cyw f;
    
    public b(final ayw a, final z59 b, final o69 c, final a d, final szf e, final cyw f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final vxw a(final qzf qzf, final LiveEventConfiguration liveEventConfiguration, final wvf wvf, final a59 a59, final u4 u4) {
        final gyw gyw = null;
        Object b1;
        if (u4 != null) {
            b1 = u4.b.b1;
        }
        else {
            b1 = null;
        }
        long d0;
        if (b1 instanceof oof) {
            d0 = ((oof)b1).D0;
        }
        else {
            d0 = 0L;
        }
        gyw gyw2;
        if (u4 == null) {
            gyw2 = gyw;
        }
        else {
            gyw2 = new gyw(u4.b.l1, u4.c());
        }
        Objects.requireNonNull(gyw.Companion);
        final gyw c = gyw.c;
        gyw gyw3 = gyw2;
        if (gyw2 == null) {
            gyw3 = c;
        }
        final szf e = this.e;
        final tzf tzf = new tzf(gyw3, this.f.b, liveEventConfiguration);
        Objects.requireNonNull(e);
        ((vyo<vyo>)((qav)wvf).a).c("dock");
        final vxw c2 = qzf.c(d0, wvf, liveEventConfiguration, (cyw)tzf);
        ((z59)this.a.a.a.get()).a((x59)new gr((y49)c2, a59));
        return c2;
    }
    
    public final vxw b(final String s) {
        return this.a.a(s);
    }
    
    public final boolean c() {
        final hlv b = dta.b();
        boolean b2 = false;
        if (b.b("live_event_docking_enabled", false)) {
            b2 = b2;
            if (this.c.E0.a()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean d(final String s) {
        final boolean e = pjr.e((CharSequence)s);
        final boolean b = false;
        if (e) {
            return false;
        }
        final vxw b2 = this.b(s);
        boolean b3 = b;
        if (b2 != null) {
            b3 = b;
            if (!b2.a.k) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final gyw e(final String s) {
        return this.f(s, null);
    }
    
    public final gyw f(final String s, final a59 a59) {
        vxw b;
        if (this.d(s)) {
            b = this.b(s);
        }
        else {
            b = null;
        }
        gyw gyw;
        if (b == null) {
            Objects.requireNonNull(gyw.Companion);
            gyw = gyw.c;
        }
        else {
            gyw = b.j();
        }
        this.a.d(s, a59);
        return gyw;
    }
    
    public static final class a
    {
        public final xau a;
        
        public a(final xau a) {
            this.a = a;
        }
    }
}
