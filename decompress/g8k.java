import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class g8k<K, V, T> extends c8k<K, V, T>
{
    public final e8k<K, V> G0;
    public K H0;
    public boolean I0;
    public int J0;
    
    public g8k(final e8k<K, V> g0, final h3u<K, V, T>[] array) {
        czd.f((Object)g0, "builder");
        super(g0.F0, (h3u[])array);
        this.G0 = g0;
        this.J0 = g0.H0;
    }
    
    public final void e(int h, final e3u<?, ?> e3u, final K k, final int n) {
        final int n2 = n * 5;
        if (n2 > 30) {
            final h3u h3u = super.D0[n];
            final Object[] d = e3u.d;
            h3u.e(d, d.length, 0);
            while (true) {
                final h3u h3u2 = super.D0[n];
                if (czd.a(h3u2.D0[h3u2.F0], (Object)k)) {
                    break;
                }
                final h3u h3u3 = super.D0[n];
                h3u3.F0 += 2;
            }
            super.E0 = n;
            return;
        }
        final int n3 = 1 << (h >> n2 & 0x1F);
        if (e3u.j(n3)) {
            h = e3u.h(n3);
            super.D0[n].e(e3u.d, e3u.g() * 2, h);
            super.E0 = n;
            return;
        }
        final int v = e3u.v(n3);
        final e3u u = e3u.u(v);
        super.D0[n].e(e3u.d, e3u.g() * 2, v);
        this.e(h, (e3u<?, ?>)u, k, n + 1);
    }
    
    public final T next() {
        if (this.G0.H0 == this.J0) {
            this.H0 = (K)this.a();
            this.I0 = true;
            return (T)super.next();
        }
        throw new ConcurrentModificationException();
    }
    
    public final void remove() {
        if (this.I0) {
            if (super.F0) {
                final Object a = this.a();
                ckv.c((Object)this.G0).remove(this.H0);
                int hashCode;
                if (a != null) {
                    hashCode = a.hashCode();
                }
                else {
                    hashCode = 0;
                }
                this.e(hashCode, (e3u<?, ?>)this.G0.F0, (K)a, 0);
            }
            else {
                ckv.c((Object)this.G0).remove(this.H0);
            }
            this.H0 = null;
            this.I0 = false;
            this.J0 = this.G0.H0;
            return;
        }
        throw new IllegalStateException();
    }
}
