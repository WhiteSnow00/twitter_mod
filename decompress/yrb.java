import java.util.concurrent.locks.Lock;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrb implements f2y, wqy
{
    public Object C0 = c0;
    
    public yrb(final int n) {
        if (n == 2) {
            this.C0 = new HashMap();
            return;
        }
        if (n != 5) {
            this.C0 = new ArrayList();
            return;
        }
    }
    
    public final void b() {
        ((ArrayList)this.C0).clear();
    }
    
    public final void c(final Bundle i) {
        ((m0y)this.C0).m.lock();
        try {
            final m0y m0y = (m0y)this.C0;
            final Bundle j = m0y.i;
            if (j == null) {
                m0y.i = i;
            }
            else if (i != null) {
                j.putAll(i);
            }
            final Object c0 = this.C0;
            ((m0y)c0).j = ph6.G0;
            m0y.o((m0y)c0);
        }
        finally {
            ((m0y)this.C0).m.unlock();
        }
    }
    
    public final int d() {
        return ((ArrayList)this.C0).size();
    }
    
    public final void e(final ph6 j) {
        ((m0y)this.C0).m.lock();
        try {
            final Object c0 = this.C0;
            ((m0y)c0).j = j;
            m0y.o((m0y)c0);
        }
        finally {
            ((m0y)this.C0).m.unlock();
        }
    }
    
    public final boolean f() {
        return ((ArrayList)this.C0).isEmpty() ^ true;
    }
    
    public final void g(final int n) {
        ((m0y)this.C0).m.lock();
        try {
            final m0y m0y = (m0y)this.C0;
            while (true) {
                Label_0091: {
                    if (m0y.l) {
                        break Label_0091;
                    }
                    final ph6 k = m0y.k;
                    if (k == null) {
                        break Label_0091;
                    }
                    if (!k.s()) {
                        break Label_0091;
                    }
                    final Object c0 = this.C0;
                    ((m0y)c0).l = true;
                    ((m0y)c0).e.x(n);
                    final Lock lock = ((m0y)this.C0).m;
                    lock.unlock();
                    return;
                }
                final Object c2 = this.C0;
                ((m0y)c2).l = false;
                final m0y m0y2 = (m0y)c2;
                m0y2.b.g(n);
                m0y2.k = null;
                m0y2.j = null;
                final Lock lock = ((m0y)this.C0).m;
                continue;
            }
        }
        finally {
            ((m0y)this.C0).m.unlock();
        }
    }
    
    public final Object h() {
        return ((ArrayList)this.C0).remove(this.d() - 1);
    }
    
    public final boolean i(final Object o) {
        return ((ArrayList)this.C0).add(o);
    }
}
