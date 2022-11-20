import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.util.List;
import android.os.SystemClock;
import android.os.Bundle;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z8y extends jsy
{
    public final n8z a;
    public final bgz b;
    
    public z8y(final n8z a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
        this.b = a.w();
    }
    
    public final long c() {
        return this.a.B().n0();
    }
    
    public final String h() {
        return this.b.H();
    }
    
    public final String j() {
        final sgz f0 = ((pbz)this.b).D0.y().F0;
        String b;
        if (f0 != null) {
            b = f0.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final String k() {
        final sgz f0 = ((pbz)this.b).D0.y().F0;
        String a;
        if (f0 != null) {
            a = f0.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final String m() {
        return this.b.H();
    }
    
    public final void n(final String s, final String s2, final Bundle bundle) {
        this.b.m(s, s2, bundle);
    }
    
    public final void o(final String s) {
        final ksy o = this.a.o();
        Objects.requireNonNull(this.a.Q0);
        o.h(s, SystemClock.elapsedRealtime());
    }
    
    public final void p(final String s) {
        final ksy o = this.a.o();
        Objects.requireNonNull(this.a.Q0);
        o.i(s, SystemClock.elapsedRealtime());
    }
    
    public final int q(final String s) {
        final bgz b = this.b;
        Objects.requireNonNull(b);
        eli.n(s);
        Objects.requireNonNull(((pbz)b).D0);
        return 25;
    }
    
    public final List r(final String s, final String s2) {
        final bgz b = this.b;
        ArrayList t;
        if (((pbz)b).D0.a().s()) {
            ((pbz)b).D0.b().I0.a("Cannot get conditional user properties from analytics worker thread");
            t = new ArrayList(0);
        }
        else {
            Objects.requireNonNull(((pbz)b).D0);
            if (nza.Y1()) {
                ((pbz)b).D0.b().I0.a("Cannot get conditional user properties from main thread");
                t = new ArrayList(0);
            }
            else {
                final AtomicReference atomicReference = new AtomicReference();
                ((pbz)b).D0.a().n(atomicReference, 5000L, "get conditional user properties", new rez(b, atomicReference, s, s2));
                final List list = atomicReference.get();
                if (list == null) {
                    ((pbz)b).D0.b().I0.b("Timed out waiting for get conditional user properties", (Object)null);
                    t = new ArrayList();
                }
                else {
                    t = lpz.t((List)list);
                }
            }
        }
        return t;
    }
    
    public final Map s(final String s, final String s2, final boolean b) {
        final bgz b2 = this.b;
        Object o;
        if (((pbz)b2).D0.a().s()) {
            ((pbz)b2).D0.b().I0.a("Cannot get user properties from analytics worker thread");
            o = Collections.emptyMap();
        }
        else {
            Objects.requireNonNull(((pbz)b2).D0);
            if (nza.Y1()) {
                ((pbz)b2).D0.b().I0.a("Cannot get user properties from main thread");
                o = Collections.emptyMap();
            }
            else {
                final AtomicReference atomicReference = new AtomicReference();
                ((pbz)b2).D0.a().n(atomicReference, 5000L, "get user properties", (Runnable)new vez(b2, atomicReference, s, s2, b));
                final List list = atomicReference.get();
                if (list == null) {
                    ((pbz)b2).D0.b().I0.b("Timed out waiting for handle get user properties, includeInternal", (Object)b);
                    o = Collections.emptyMap();
                }
                else {
                    o = new ts0(list.size());
                    for (final yoz yoz : list) {
                        final Object r = yoz.r();
                        if (r != null) {
                            ((d8q<String, Object>)o).put(yoz.E0, r);
                        }
                    }
                }
            }
        }
        return (Map)o;
    }
    
    public final void t(final Bundle bundle) {
        final bgz b = this.b;
        Objects.requireNonNull(((pbz)b).D0.Q0);
        b.v(bundle, System.currentTimeMillis());
    }
    
    public final void u(final String s, final String s2, final Bundle bundle) {
        this.a.w().k(s, s2, bundle);
    }
}
