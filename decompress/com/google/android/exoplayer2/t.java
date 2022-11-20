// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.a;
import com.google.android.exoplayer2.source.f;
import com.google.android.exoplayer2.source.g;
import android.os.Handler$Callback;
import com.google.android.exoplayer2.source.i;
import java.util.Iterator;
import java.util.Collection;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.c$a$a;
import java.util.Objects;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
import android.os.Handler;
import java.util.Set;
import java.util.HashMap;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.source.j;
import java.util.Map;
import com.google.android.exoplayer2.source.h;
import java.util.IdentityHashMap;
import java.util.List;

public final class t
{
    public final onk a;
    public final List<t.t$c> b;
    public final IdentityHashMap<h, t.t$c> c;
    public final Map<Object, t.t$c> d;
    public final d e;
    public final j.a f;
    public final c$a g;
    public final HashMap<t.t$c, b> h;
    public final Set<t.t$c> i;
    public c6q j;
    public boolean k;
    public pyt l;
    
    public t(final d e, final qz qz, final Handler handler, final onk a) {
        this.a = a;
        this.e = e;
        this.j = (c6q)new c6q$a(new Random());
        this.c = new IdentityHashMap<h, t.t$c>();
        this.d = new HashMap();
        this.b = new ArrayList();
        final j.a f = new j.a();
        this.f = f;
        final c$a g = new c$a();
        this.g = g;
        this.h = new HashMap<t.t$c, b>();
        this.i = new HashSet();
        Objects.requireNonNull(qz);
        f.c.add(new j.a.a(handler, (j)qz));
        g.c.add(new c$a$a(handler, (c)qz));
    }
    
    public final e0 a(final int n, final List<t.t$c> list, final c6q j) {
        if (!list.isEmpty()) {
            this.j = j;
            for (int i = n; i < list.size() + n; ++i) {
                final t.t$c t$c = list.get(i - n);
                if (i > 0) {
                    final t.t$c t$c2 = this.b.get(i - 1);
                    t$c.d = t$c2.a.o.q() + t$c2.d;
                    t$c.e = false;
                    t$c.c.clear();
                }
                else {
                    t$c.d = 0;
                    t$c.e = false;
                    t$c.c.clear();
                }
                this.b(i, t$c.a.o.q());
                this.b.add(i, t$c);
                this.d.put(t$c.b, t$c);
                if (this.k) {
                    this.g(t$c);
                    if (this.c.isEmpty()) {
                        this.i.add(t$c);
                    }
                    else {
                        final b b = this.h.get(t$c);
                        if (b != null) {
                            b.a.i(b.b);
                        }
                    }
                }
            }
        }
        return this.c();
    }
    
    public final void b(int i, final int n) {
        while (i < this.b.size()) {
            final t.t$c t$c = this.b.get(i);
            t$c.d += n;
            ++i;
        }
    }
    
    public final e0 c() {
        if (this.b.isEmpty()) {
            return (e0)e0.D0;
        }
        int i = 0;
        int d = 0;
        while (i < this.b.size()) {
            final t.t$c t$c = this.b.get(i);
            t$c.d = d;
            d += t$c.a.o.q();
            ++i;
        }
        return (e0)new nok((Collection)this.b, this.j);
    }
    
    public final void d() {
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            final t.t$c t$c = (t.t$c)iterator.next();
            if (t$c.c.isEmpty()) {
                final b b = this.h.get(t$c);
                if (b != null) {
                    b.a.i(b.b);
                }
                iterator.remove();
            }
        }
    }
    
    public final int e() {
        return this.b.size();
    }
    
    public final void f(final t.t$c t$c) {
        if (t$c.e && t$c.c.isEmpty()) {
            final b b = this.h.remove(t$c);
            Objects.requireNonNull(b);
            b.a.b(b.b);
            b.a.d((j)b.c);
            b.a.k((c)b.c);
            this.i.remove(t$c);
        }
    }
    
    public final void g(final t.t$c t$c) {
        final g a = t$c.a;
        final e0h e0h = new e0h(this);
        final t$a t$a = new t$a(this, t$c);
        this.h.put(t$c, new b((i)a, (i.c)e0h, t$a));
        ((a)a).c(new Handler(cnw.t(), (Handler$Callback)null), (j)t$a);
        ((a)a).j(new Handler(cnw.t(), (Handler$Callback)null), (c)t$a);
        ((a)a).n((i.c)e0h, this.l, this.a);
    }
    
    public final void h(final h h) {
        final t.t$c t$c = this.c.remove(h);
        Objects.requireNonNull(t$c);
        t$c.a.g(h);
        t$c.c.remove(((f)h).D0);
        if (!this.c.isEmpty()) {
            this.d();
        }
        this.f(t$c);
    }
    
    public final void i(final int n, int i) {
        --i;
        while (i >= n) {
            final t.t$c t$c = this.b.remove(i);
            this.d.remove(t$c.b);
            this.b(i, -t$c.a.o.q());
            t$c.e = true;
            if (this.k) {
                this.f(t$c);
            }
            --i;
        }
    }
    
    public static final class b
    {
        public final i a;
        public final i.c b;
        public final t$a c;
        
        public b(final i a, final i.c b, final t$a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface d
    {
    }
}
