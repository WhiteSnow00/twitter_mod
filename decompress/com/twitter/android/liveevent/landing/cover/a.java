// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.cover;

import java.util.List;
import java.util.Objects;
import com.twitter.util.InvalidDataException;

public final class a
{
    public final puf a;
    public b b;
    
    public a(final puf a) {
        this.b = (b)com.twitter.android.liveevent.landing.cover.a.b.q0;
        this.a = a;
    }
    
    public static a a(final mvf mvf) throws InvalidDataException {
        final cof a = mvf.a;
        final z0g f = mvf.f;
        final a a2 = new a(a, f);
        final boolean b = false;
        int n = 0;
        Label_0105: {
            if (a == null) {
                n = (b ? 1 : 0);
            }
            else {
                final vwf e = a.e;
                if (!ikr.g((CharSequence)a.b) && (f == null || !"available".equals(f.a) || f.b == null)) {
                    n = (b ? 1 : 0);
                    if (e == null) {
                        break Label_0105;
                    }
                    n = (b ? 1 : 0);
                    if (!e.b()) {
                        break Label_0105;
                    }
                }
                n = 1;
            }
        }
        if (n != 0) {
            return a2;
        }
        throw new InvalidDataException("Cover has not enough data to show");
    }
    
    public final void b(final cof cof, final bo6 bo6) {
        if (cof.g != null) {
            Objects.requireNonNull(this.a);
            if (asa.b().b("live_event_hero_ugm_attribution_enabled", false)) {
                final b b = this.b;
                final cgv g = cof.g;
                String b2 = cof.b;
                if (b2 == null) {
                    b2 = "";
                }
                b.R0(g, b2, cof.i, cof.j, cof.m);
                return;
            }
        }
        final b b3 = this.b;
        final String f = cof.f;
        String b4 = cof.b;
        if (b4 == null) {
            b4 = "";
        }
        b3.m0(f, b4, cof.i, cof.j, cof.m);
    }
    
    public static final class a
    {
        public final cof a;
        
        public a(final cof a, final z0g z0g) {
            this.a = a;
        }
    }
    
    public interface b
    {
        public static final a$b$a q0 = new a$b$a();
        
        void G0();
        
        void R0(final cgv p0, final String p1, final String p2, final String p3, final bo6 p4, final List<atf> p5);
        
        void m0(final String p0, final String p1, final String p2, final String p3, final bo6 p4, final List<atf> p5);
    }
}
