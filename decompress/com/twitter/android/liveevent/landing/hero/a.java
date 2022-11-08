// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero;

import java.util.Iterator;
import com.twitter.util.InvalidDataException;
import java.util.List;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.Objects;
import com.twitter.android.liveevent.dock.b;

public final class a implements hsf.a, tuf$a, d.a
{
    public final om c;
    public final hsf d;
    public final tuf e;
    public final com.twitter.android.liveevent.dock.b f;
    public final com.twitter.android.liveevent.landing.scribe.a g;
    public final m29 h;
    public mna<dm3> i;
    public b j;
    public snj<dm3> k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    public a(final om c, final hsf d, final tuf e, final com.twitter.android.liveevent.dock.b f, final com.twitter.android.liveevent.landing.scribe.a g, final sso sso, final jvf jvf) {
        final m29 h = new m29();
        this.h = h;
        final int a = lna.a;
        final int a2 = w4j.a;
        this.i = (mna<dm3>)kna.C0;
        this.j = b.r0;
        this.k = (snj<dm3>)snj.b;
        this.l = false;
        this.m = false;
        this.n = false;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        Objects.requireNonNull(e);
        e.E0 = (tuf$a)this;
        Objects.requireNonNull(this.d = d);
        d.C0 = (hsf.a)this;
        sso.a((vro)new jt2() {
            public final void a(final Bundle bundle) {
                if (a.this.k.f()) {
                    bundle.putByteArray("current_carousel", tkp.e((Object)a.this.k.c(), (alp)dm3.k));
                }
            }
            
            public final String getId() {
                return a.this.getClass().getCanonicalName();
            }
            
            public final void v(final Parcelable parcelable) {
                a.this.k = (snj<dm3>)snj.b((Object)tkp.a(((Bundle)parcelable).getByteArray("current_carousel"), (alp)dm3.k));
            }
        });
        h.c(((b5j)((ggm)jvf).C0).distinctUntilChanged().subscribe((fk6)new i0p((Object)this, 8), (fk6)kf2.E0));
    }
    
    public final void a(final String s) {
        if (this.i.O1((otk)new akc(s, 0)).s2(1)) {
            this.f(this.i.t3(), s);
        }
        else {
            e9a.d((Throwable)new InvalidDataException("Carousel entry not found after trying to auto advance"));
        }
        final com.twitter.android.liveevent.landing.scribe.a g = this.g;
        Objects.requireNonNull(g);
        g.o(nca.g("live_event_timeline", "", "", "", "tile_auto_click"), (szo)g.m(g.i));
    }
    
    @Override
    public final void b(final String s) {
        if (this.i.O1((otk)new akc(s, 0)).s2(1)) {
            this.f(this.i.t3(), s);
        }
        else {
            e9a.d((Throwable)new InvalidDataException("Carousel entry not found after tapping on it"));
        }
        final com.twitter.android.liveevent.landing.scribe.a g = this.g;
        Objects.requireNonNull(g);
        g.o(nca.g("live_event_timeline", "", "", "", "tile_click"), (szo)g.m(g.i));
    }
    
    public final qaa c(final mna<dm3> mna, final dm3 dm3, final boolean b) {
        return new qaa(dm3, (Iterable)mna, this.l, this.m, b, this.n);
    }
    
    public final void d(final qaa qaa) {
        final dm3 a = qaa.a;
        final int j = a.j;
        boolean b = true;
        if (j != 0 && j != 1 && j != 2 && j != 3 && j != 5) {
            final om c = this.c;
            final snj b2 = snj.b;
            final int a2 = w4j.a;
            c.a((Object)b2);
            this.k = (snj<dm3>)b2;
            this.j.E0();
        }
        else {
            final snj k = new snj((Object)a);
            this.k = (snj<dm3>)k;
            this.c.a((Object)k);
            if (this.j.d1(a) ^ true) {
                this.j.Z((dm3)this.k.c());
            }
        }
        if (qaa.c) {
            if (!qaa.f) {
                if (!qaa.d) {
                    if (!qaa.e) {
                        b = false;
                    }
                }
            }
        }
        if (b) {
            this.j.U(qaa.a);
        }
    }
    
    public final void e(final mna<dm3> mna, final String s, final boolean b) {
        if (mna.isEmpty()) {
            final om c = this.c;
            final snj b2 = snj.b;
            final int a = w4j.a;
            c.a((Object)b2);
            this.k = (snj<dm3>)b2;
            this.j.E0();
            return;
        }
        final nmp x = nmp.x();
        final Iterator<dm3> iterator = ((Iterable<dm3>)this.i).iterator();
        while (iterator.hasNext()) {
            final String s2 = asy.S((dm3)iterator.next());
            if (s2 != null && this.f.d(s2)) {
                x.o((Object)s2);
            }
        }
        final com.twitter.android.liveevent.dock.b f = this.f;
        final Iterator<Object> iterator2 = ((Iterable<Object>)c6e.j((Iterable)f.a.b()).l1((otk)new b9g((Object)((h4j)x).e(), 1)).v2((kub)uzf.b)).iterator();
        while (iterator2.hasNext()) {
            f.b.a((x59)new q09((String)iterator2.next(), (a59)gra.c));
        }
        if (b) {
            final dm3 dm3 = (dm3)mna.O1((otk)new zxw((Object)this, 2)).first();
            if (dm3 != null) {
                this.d(this.c(mna, dm3, true));
                return;
            }
        }
        final dm3 dm4 = null;
        dm3 dm6 = null;
        Label_0324: {
            if (s != null) {
                for (final dm3 dm5 : this.i) {
                    if (s.equals(dm5.a)) {
                        dm6 = dm5;
                        break Label_0324;
                    }
                }
            }
            dm6 = null;
        }
        if (dm6 != null) {
            this.d(this.c(mna, dm6, false));
            return;
        }
        final Iterator<dm3> iterator4 = ((Iterable<dm3>)this.i).iterator();
        dm3 dm7;
        do {
            dm7 = dm4;
            if (!iterator4.hasNext()) {
                break;
            }
            dm7 = iterator4.next();
        } while (!dm7.i);
        if (dm7 != null) {
            this.d(this.c(mna, dm7, false));
        }
        else {
            final dm3 dm8 = (dm3)mna.first();
            pf8.r(dm8);
            this.d(this.c(mna, dm8, false));
        }
    }
    
    public final void f(final List<dm3> list, final String s) {
        final boolean b = this.i.isEmpty() && list != null && !list.isEmpty();
        Object c0 = list;
        if (list == null) {
            c0 = v2a.C0;
        }
        this.e(this.i = (mna<dm3>)c6e.j((Iterable)c0), s, b);
    }
    
    public interface b
    {
        public static final a$b$a r0 = new b() {
            @Override
            public final void E0() {
            }
            
            @Override
            public final void U(final dm3 dm3) {
            }
            
            @Override
            public final void Z(final dm3 dm3) {
            }
            
            @Override
            public final boolean d1(final dm3 dm3) {
                return false;
            }
        };
        
        void E0();
        
        void U(final dm3 p0);
        
        void Z(final dm3 p0);
        
        boolean d1(final dm3 p0);
    }
}
