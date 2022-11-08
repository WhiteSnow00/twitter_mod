// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Map;

public abstract class LiveData<T>
{
    public static final Object k;
    public final Object a;
    public soo<xbj<? super T>, c> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final LiveData$a j;
    
    static {
        k = new Object();
    }
    
    public LiveData() {
        this.a = new Object();
        this.b = (soo<xbj<? super T>, c>)new soo();
        this.c = 0;
        final Object k = LiveData.k;
        this.f = k;
        this.j = new Runnable() {
            @Override
            public final void run() {
                synchronized (LiveData.this.a) {
                    final Object f = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                    monitorexit(LiveData.this.a);
                    LiveData.this.k(f);
                }
            }
        };
        this.e = k;
        this.g = -1;
    }
    
    public static void a(final String s) {
        if (bs0.N().O()) {
            return;
        }
        throw new IllegalStateException(zi.y("Cannot invoke ", s, " on a background thread"));
    }
    
    public final void b(final c c) {
        if (!c.D0) {
            return;
        }
        if (!c.f()) {
            c.b(false);
            return;
        }
        final int e0 = c.E0;
        final int g = this.g;
        if (e0 >= g) {
            return;
        }
        c.E0 = g;
        c.C0.a(this.e);
    }
    
    public final void c(c c) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            c c2 = null;
            Label_0082: {
                if (c != null) {
                    this.b(c);
                    c2 = null;
                }
                else {
                    final soo.d g = this.b.g();
                    do {
                        c2 = c;
                        if (!g.hasNext()) {
                            break Label_0082;
                        }
                        this.b((c)((Map.Entry)g.next()).getValue());
                    } while (!this.i);
                    c2 = c;
                }
            }
            c = c2;
        } while (this.i);
        this.h = false;
    }
    
    public final boolean d() {
        return this.c > 0;
    }
    
    public final void e(final lbf lbf, final xbj<? super T> xbj) {
        a("observe");
        if (lbf.b().b() == d$c.C0) {
            return;
        }
        final LiveData.LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData.LiveData$LifecycleBoundObserver(this, lbf, (xbj)xbj);
        final c c = (c)this.b.j((Object)xbj, (Object)liveData$LifecycleBoundObserver);
        if (c != null && !c.e(lbf)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        lbf.b().a((kbf)liveData$LifecycleBoundObserver);
    }
    
    public final void f(final xbj<? super T> xbj) {
        a("observeForever");
        final LiveData.LiveData$b liveData$b = new LiveData.LiveData$b(this, (xbj)xbj);
        final c c = (c)this.b.j((Object)xbj, (Object)liveData$b);
        if (c instanceof LiveData.LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        ((c)liveData$b).b(true);
    }
    
    public void g() {
    }
    
    public void h() {
    }
    
    public void i(final T f) {
        synchronized (this.a) {
            final boolean b = this.f == LiveData.k;
            this.f = f;
            monitorexit(this.a);
            if (!b) {
                return;
            }
            bs0.N().P((Runnable)this.j);
        }
    }
    
    public void j(final xbj<? super T> xbj) {
        a("removeObserver");
        final c c = (c)this.b.l((Object)xbj);
        if (c == null) {
            return;
        }
        c.c();
        c.b(false);
    }
    
    public void k(final T e) {
        a("setValue");
        ++this.g;
        this.e = e;
        this.c(null);
    }
    
    public abstract class c
    {
        public final xbj<? super T> C0;
        public boolean D0;
        public int E0;
        
        public c(final xbj<? super T> c0) {
            this.E0 = -1;
            this.C0 = c0;
        }
        
        public final void b(final boolean d0) {
            if (d0 == this.D0) {
                return;
            }
            this.D0 = d0;
            final LiveData f0 = LiveData.this;
            int n;
            if (d0) {
                n = 1;
            }
            else {
                n = -1;
            }
            int c = f0.c;
            f0.c = n + c;
            Label_0140: {
                if (f0.d) {
                    break Label_0140;
                }
                f0.d = true;
                try {
                    while (true) {
                        final int c2 = f0.c;
                        if (c == c2) {
                            break;
                        }
                        final boolean b = c == 0 && c2 > 0;
                        final boolean b2 = c > 0 && c2 == 0;
                        if (b) {
                            f0.g();
                        }
                        else if (b2) {
                            f0.h();
                        }
                        c = c2;
                    }
                    f0.d = false;
                    if (this.D0) {
                        LiveData.this.c(this);
                    }
                }
                finally {
                    f0.d = false;
                }
            }
        }
        
        public void c() {
        }
        
        public boolean e(final lbf lbf) {
            return false;
        }
        
        public abstract boolean f();
    }
}
