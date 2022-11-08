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

public final class j8y extends xry
{
    public final y7z a;
    public final nfz b;
    
    public j8y(final y7z a) {
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
        final egz e0 = ((abz)this.b).C0.y().E0;
        String b;
        if (e0 != null) {
            b = e0.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final String k() {
        final egz e0 = ((abz)this.b).C0.y().E0;
        String a;
        if (e0 != null) {
            a = e0.a;
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
        final yry o = this.a.o();
        Objects.requireNonNull(this.a.P0);
        o.h(s, SystemClock.elapsedRealtime());
    }
    
    public final void p(final String s) {
        final yry o = this.a.o();
        Objects.requireNonNull(this.a.P0);
        o.i(s, SystemClock.elapsedRealtime());
    }
    
    public final int q(final String s) {
        final nfz b = this.b;
        Objects.requireNonNull(b);
        xd.q(s);
        Objects.requireNonNull(((abz)b).C0);
        return 25;
    }
    
    public final List r(final String s, final String s2) {
        final nfz b = this.b;
        ArrayList t;
        if (((abz)b).C0.a().s()) {
            ((abz)b).C0.b().H0.a("Cannot get conditional user properties from analytics worker thread");
            t = new ArrayList(0);
        }
        else {
            Objects.requireNonNull(((abz)b).C0);
            if (jth.f()) {
                ((abz)b).C0.b().H0.a("Cannot get conditional user properties from main thread");
                t = new ArrayList(0);
            }
            else {
                final AtomicReference atomicReference = new AtomicReference();
                ((abz)b).C0.a().n(atomicReference, 5000L, "get conditional user properties", (Runnable)new dez(b, atomicReference, s, s2));
                final List list = atomicReference.get();
                if (list == null) {
                    ((abz)b).C0.b().H0.b("Timed out waiting for get conditional user properties", (Object)null);
                    t = new ArrayList();
                }
                else {
                    t = xoz.t((List)list);
                }
            }
        }
        return t;
    }
    
    public final Map s(final String s, final String s2, final boolean b) {
        final nfz b2 = this.b;
        Object o;
        if (((abz)b2).C0.a().s()) {
            ((abz)b2).C0.b().H0.a("Cannot get user properties from analytics worker thread");
            o = Collections.emptyMap();
        }
        else {
            Objects.requireNonNull(((abz)b2).C0);
            if (jth.f()) {
                ((abz)b2).C0.b().H0.a("Cannot get user properties from main thread");
                o = Collections.emptyMap();
            }
            else {
                final AtomicReference atomicReference = new AtomicReference();
                ((abz)b2).C0.a().n(atomicReference, 5000L, "get user properties", (Runnable)new hez(b2, atomicReference, s, s2, b));
                final List list = atomicReference.get();
                if (list == null) {
                    ((abz)b2).C0.b().H0.b("Timed out waiting for handle get user properties, includeInternal", (Object)b);
                    o = Collections.emptyMap();
                }
                else {
                    o = new at0(list.size());
                    for (final koz koz : list) {
                        final Object r = koz.r();
                        if (r != null) {
                            ((l7q)o).put((Object)koz.D0, r);
                        }
                    }
                }
            }
        }
        return (Map)o;
    }
    
    public final void t(final Bundle bundle) {
        final nfz b = this.b;
        Objects.requireNonNull(((abz)b).C0.P0);
        b.v(bundle, System.currentTimeMillis());
    }
    
    public final void u(final String s, final String s2, final Bundle bundle) {
        this.a.w().k(s, s2, bundle);
    }
}
