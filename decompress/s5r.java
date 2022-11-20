import java.util.concurrent.ConcurrentMap;
import android.os.Bundle;
import tv.periscope.android.api.service.payman.PaymanService;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5r implements v2y, gry, hlb, g2d
{
    public final int D0;
    public Object E0;
    
    public s5r(final int d0) {
        this.D0 = d0;
        if (d0 == 1) {
            this.E0 = new HashMap();
            return;
        }
        if (d0 == 4) {
            return;
        }
        if (d0 == 10) {
            this.E0 = new ArrayList();
            return;
        }
        if (d0 == 12) {
            this.E0 = Pattern.compile("[\\p{Punct}&&[^#@]]");
            return;
        }
        if (d0 != 14) {
            this.E0 = new ArrayList();
            return;
        }
        this.E0 = new ConcurrentHashMap();
    }
    
    public s5r(final c1y e0) {
        this.D0 = 3;
        this.E0 = e0;
    }
    
    public s5r(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public s5r(final PaymanService e0) {
        this.D0 = 15;
        czd.f((Object)e0, "paymanService");
        this.E0 = e0;
    }
    
    public s5r(final xe4 e0) {
        this.D0 = 8;
        czd.f((Object)e0, "clientEventConfigurationProvider");
        this.E0 = e0;
    }
    
    public final int U(final String s) {
        if (s != null && ((Pattern)this.E0).matcher(s).find()) {
            return 2;
        }
        return 0;
    }
    
    public final /* bridge */ Object a() {
        return uuz.a(((xyz)this.E0).b());
    }
    
    public final void b(final Bundle i) {
        ((c1y)this.E0).m.lock();
        try {
            final c1y c1y = (c1y)this.E0;
            final Bundle j = c1y.i;
            if (j == null) {
                c1y.i = i;
            }
            else if (i != null) {
                j.putAll(i);
            }
            final Object e0 = this.E0;
            ((c1y)e0).j = vg6.H0;
            c1y.p((c1y)e0);
        }
        finally {
            ((c1y)this.E0).m.unlock();
        }
    }
    
    public final u9g c(final String s) {
        qsr qsr;
        if ((qsr = (qsr)((ConcurrentMap)this.E0).get(s)) == null) {
            qsr = new qsr(s);
            final qsr qsr2 = ((ConcurrentMap)this.E0).putIfAbsent(s, qsr);
            if (qsr2 != null) {
                qsr = qsr2;
            }
        }
        return (u9g)qsr;
    }
    
    public final void d(final vg6 j) {
        ((c1y)this.E0).m.lock();
        try {
            final Object e0 = this.E0;
            ((c1y)e0).j = j;
            c1y.p((c1y)e0);
        }
        finally {
            ((c1y)this.E0).m.unlock();
        }
    }
    
    public final void e(final int n, final boolean b) {
        ((c1y)this.E0).m.lock();
        Label_0146: {
            try {
                final c1y c1y = (c1y)this.E0;
                if (!c1y.l) {
                    final vg6 k = c1y.k;
                    if (k != null) {
                        if (k.s()) {
                            final Object e0 = this.E0;
                            ((c1y)e0).l = true;
                            ((c1y)e0).e.x(n);
                            ((c1y)this.E0).m.unlock();
                            return;
                        }
                    }
                }
            }
            finally {
                break Label_0146;
            }
            final Object e2 = this.E0;
            ((c1y)e2).l = false;
            final c1y c1y2 = (c1y)e2;
            c1y2.b.e(n, b);
            c1y2.k = null;
            c1y2.j = null;
            ((c1y)this.E0).m.unlock();
            return;
        }
        ((c1y)this.E0).m.unlock();
    }
    
    public final void f() {
        switch (this.D0) {
            default: {
                ((ConcurrentMap)this.E0).clear();
                return;
            }
            case 0: {
                ((ArrayList)this.E0).clear();
            }
        }
    }
    
    public final int g() {
        return ((ArrayList)this.E0).size();
    }
    
    public final n6 h() {
        return ((o4)this.E0).b1;
    }
    
    public final boolean i() {
        return ((ArrayList)this.E0).isEmpty() ^ true;
    }
    
    public final Object j() {
        return ((ArrayList)this.E0).remove(this.g() - 1);
    }
    
    public final boolean k(final Object o) {
        return ((ArrayList)this.E0).add(o);
    }
    
    public final ve4 l(final String s) {
        final mn3 c = mn3.c;
        czd.f((Object)s, "<this>");
        Object o;
        try {
            o = j8a.o(oi1.a(s), (spa)c);
        }
        catch (final Exception ex) {
            m8a.d((Throwable)ex);
            o = null;
        }
        return (ve4)o;
    }
}
