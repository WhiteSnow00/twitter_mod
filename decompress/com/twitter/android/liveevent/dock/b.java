// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.dock;

import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;

public final class b
{
    public final tyw a;
    public final h59 b;
    public final w59 c;
    public final a d;
    public final dzf e;
    public final vyw f;
    
    public b(final tyw a, final h59 b, final w59 c, final a d, final dzf e, final vyw f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final oyw a(final bzf bzf, final LiveEventConfiguration liveEventConfiguration, final hvf hvf, final i49 i49, final w4 w4) {
        final zyw zyw = null;
        Object c1;
        if (w4 != null) {
            c1 = w4.b.c1;
        }
        else {
            c1 = null;
        }
        long e0;
        if (c1 instanceof aof) {
            e0 = ((aof)c1).E0;
        }
        else {
            e0 = 0L;
        }
        zyw zyw2;
        if (w4 == null) {
            zyw2 = zyw;
        }
        else {
            zyw2 = new zyw(w4.b.m1, w4.c());
        }
        Objects.requireNonNull(zyw.Companion);
        final zyw c2 = zyw.c;
        zyw zyw3 = zyw2;
        if (zyw2 == null) {
            zyw3 = c2;
        }
        final dzf e2 = this.e;
        final ezf ezf = new ezf(zyw3, this.f.b, liveEventConfiguration);
        Objects.requireNonNull(e2);
        ((lzo)((lbv)hvf).a).c("dock");
        final oyw c3 = bzf.c(e0, hvf, liveEventConfiguration, (vyw)ezf);
        ((h59)this.a.a.a.get()).a((f59)new gr((g49)c3, i49));
        return c3;
    }
    
    public final oyw b(final String s) {
        return this.a.a(s);
    }
    
    public final boolean c() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (b.b("live_event_docking_enabled", false)) {
            b2 = b2;
            if (this.c.F0.a()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean d(final String s) {
        final boolean e = ikr.e((CharSequence)s);
        final boolean b = false;
        if (e) {
            return false;
        }
        final oyw b2 = this.b(s);
        boolean b3 = b;
        if (b2 != null) {
            b3 = b;
            if (!b2.a.k) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final zyw e(final String s) {
        return this.f(s, null);
    }
    
    public final zyw f(final String s, final i49 i49) {
        oyw b;
        if (this.d(s)) {
            b = this.b(s);
        }
        else {
            b = null;
        }
        zyw zyw;
        if (b == null) {
            Objects.requireNonNull(zyw.Companion);
            zyw = zyw.c;
        }
        else {
            zyw = b.j();
        }
        this.a.d(s, i49);
        return zyw;
    }
    
    public static final class a
    {
        public final qbu a;
        
        public a(final qbu a) {
            this.a = a;
        }
    }
}
