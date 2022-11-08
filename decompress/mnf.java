import java.util.Iterator;
import java.util.Collection;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnf<T>
{
    public final ki4 a;
    public final occ b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public boolean g;
    
    public mnf(final CopyOnWriteArraySet<c<T>> d, final Looper looper, final ki4 a, final b<T> c) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = new ArrayDeque<Runnable>();
        this.f = new ArrayDeque<Runnable>();
        this.b = a.b(looper, (Handler$Callback)new knf(this));
    }
    
    public final void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a()) {
            final occ b = this.b;
            b.g(b.b(0));
        }
        final boolean empty = this.e.isEmpty();
        this.e.addAll((Collection<?>)this.f);
        this.f.clear();
        if (empty ^ true) {
            return;
        }
        while (!this.e.isEmpty()) {
            this.e.peekFirst().run();
            this.e.removeFirst();
        }
    }
    
    public final void b(final int n, final a<T> a) {
        this.f.add(new lnf(new CopyOnWriteArraySet(this.d), n, a, 0));
    }
    
    public final void c() {
        for (final c c : this.d) {
            final b<T> c2 = this.c;
            c.d = true;
            if (c.c) {
                c2.a((T)c.a, c.b.b());
            }
        }
        this.d.clear();
        this.g = true;
    }
    
    public final void d(final T t) {
        for (final c c : this.d) {
            if (c.a.equals(t)) {
                final b<T> c2 = this.c;
                c.d = true;
                if (c.c) {
                    c2.a((T)c.a, c.b.b());
                }
                this.d.remove(c);
            }
        }
    }
    
    public final void e(final int n, final a<T> a) {
        this.b(n, a);
        this.a();
    }
    
    public interface a<T>
    {
        void invoke(final T p0);
    }
    
    public interface b<T>
    {
        void a(final T p0, final r2b p1);
    }
    
    public static final class c<T>
    {
        public final T a;
        public r2b$a b;
        public boolean c;
        public boolean d;
        
        public c(final T a) {
            this.a = a;
            this.b = new r2b$a();
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o != null && c.class == o.getClass() && this.a.equals(((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
