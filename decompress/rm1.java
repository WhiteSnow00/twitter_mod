import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rm1<K, A>
{
    public final List<a> a;
    public boolean b;
    public final c<K> c;
    public float d;
    public ydg e;
    public A f;
    public float g;
    public float h;
    
    public rm1(final List<? extends dre<K>> list) {
        this.a = new ArrayList(1);
        this.b = false;
        this.d = 0.0f;
        this.f = null;
        this.g = -1.0f;
        this.h = -1.0f;
        Object c;
        if (list.isEmpty()) {
            c = new b();
        }
        else if (list.size() != 0) {
            c = new e((List<? extends dre<Object>>)list);
        }
        else {
            c = new d((List<? extends dre<Object>>)list);
        }
        this.c = (c<K>)c;
    }
    
    public final void a(final a a) {
        this.a.add(a);
    }
    
    public final dre<K> b() {
        final dre<K> b = this.c.b();
        uli.m();
        return b;
    }
    
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }
    
    public final float d() {
        final dre<K> b = this.b();
        if (b.c()) {
            return 0.0f;
        }
        return ((TimeInterpolator)b.d).getInterpolation(this.e());
    }
    
    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        final dre<K> b = this.b();
        if (b.c()) {
            return 0.0f;
        }
        return (this.d - b.b()) / (b.a() - b.b());
    }
    
    public A f() {
        final float e = this.e();
        if (this.e == null && this.c.a(e)) {
            return this.f;
        }
        final dre<K> b = this.b();
        final Interpolator e2 = b.e;
        A f;
        if (e2 != null && b.f != null) {
            f = this.h(b, e, ((TimeInterpolator)e2).getInterpolation(e), ((TimeInterpolator)b.f).getInterpolation(e));
        }
        else {
            f = this.g(b, this.d());
        }
        return this.f = f;
    }
    
    public abstract A g(final dre<K> p0, final float p1);
    
    public A h(final dre<K> dre, final float n, final float n2, final float n3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
    
    public void i() {
        for (int i = 0; i < this.a.size(); ++i) {
            ((a)this.a.get(i)).a();
        }
    }
    
    public void j(final float n) {
        if (this.c.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = this.c.d();
        }
        final float g = this.g;
        float d;
        if (n < g) {
            if (g == -1.0f) {
                this.g = this.c.d();
            }
            d = this.g;
        }
        else {
            d = n;
            if (n > this.c()) {
                d = this.c();
            }
        }
        if (d == this.d) {
            return;
        }
        this.d = d;
        if (this.c.c(d)) {
            this.i();
        }
    }
    
    public final void k(final ydg e) {
        final ydg e2 = this.e;
        if (e2 != null) {
            e2.b = null;
        }
        if ((this.e = e) != null) {
            e.b = this;
        }
    }
    
    public interface a
    {
        void a();
    }
    
    public static final class b<T> implements c<T>
    {
        @Override
        public final boolean a(final float n) {
            throw new IllegalStateException("not implemented");
        }
        
        @Override
        public final dre<T> b() {
            throw new IllegalStateException("not implemented");
        }
        
        @Override
        public final boolean c(final float n) {
            return false;
        }
        
        @Override
        public final float d() {
            return 0.0f;
        }
        
        @Override
        public final float e() {
            return 1.0f;
        }
        
        @Override
        public final boolean isEmpty() {
            return true;
        }
    }
    
    public interface c<T>
    {
        boolean a(final float p0);
        
        dre<T> b();
        
        boolean c(final float p0);
        
        float d();
        
        float e();
        
        boolean isEmpty();
    }
    
    public static final class d<T> implements c<T>
    {
        public final List<? extends dre<T>> a;
        public dre<T> b;
        public dre<T> c;
        public float d;
        
        public d(final List<? extends dre<T>> a) {
            this.c = null;
            this.d = -1.0f;
            this.a = a;
            this.b = this.f(0.0f);
        }
        
        @Override
        public final boolean a(final float d) {
            final dre<T> c = this.c;
            final dre<T> b = this.b;
            if (c == b && this.d == d) {
                return true;
            }
            this.c = b;
            this.d = d;
            return false;
        }
        
        @Override
        public final dre<T> b() {
            return this.b;
        }
        
        @Override
        public final boolean c(final float n) {
            final dre<T> b = this.b;
            if (n >= b.b() && n < b.a()) {
                return this.b.c() ^ true;
            }
            this.b = this.f(n);
            return true;
        }
        
        @Override
        public final float d() {
            return ((dre)this.a.get(0)).b();
        }
        
        @Override
        public final float e() {
            final List<? extends dre<T>> a = this.a;
            return ((dre)a.get(a.size() - 1)).a();
        }
        
        public final dre<T> f(final float n) {
            final List<? extends dre<T>> a = this.a;
            final dre dre = a.get(a.size() - 1);
            if (n >= dre.b()) {
                return dre;
            }
            int n2 = this.a.size() - 2;
            while (true) {
                final boolean b = false;
                if (n2 < 1) {
                    return (dre)this.a.get(0);
                }
                final dre dre2 = (dre)this.a.get(n2);
                if (this.b != dre2) {
                    int n3 = b ? 1 : 0;
                    if (n >= dre2.b()) {
                        n3 = (b ? 1 : 0);
                        if (n < dre2.a()) {
                            n3 = 1;
                        }
                    }
                    if (n3 != 0) {
                        return dre2;
                    }
                }
                --n2;
            }
        }
        
        @Override
        public final boolean isEmpty() {
            return false;
        }
    }
    
    public static final class e<T> implements c<T>
    {
        public final dre<T> a;
        public float b;
        
        public e(final List<? extends dre<T>> list) {
            this.b = -1.0f;
            this.a = (dre)list.get(0);
        }
        
        @Override
        public final boolean a(final float b) {
            if (this.b == b) {
                return true;
            }
            this.b = b;
            return false;
        }
        
        @Override
        public final dre<T> b() {
            return this.a;
        }
        
        @Override
        public final boolean c(final float n) {
            return this.a.c() ^ true;
        }
        
        @Override
        public final float d() {
            return this.a.b();
        }
        
        @Override
        public final float e() {
            return this.a.a();
        }
        
        @Override
        public final boolean isEmpty() {
            return false;
        }
    }
}
