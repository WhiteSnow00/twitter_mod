import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class z7k<K, V, T> extends v7k<K, V, T>
{
    public final x7k<K, V> F0;
    public K G0;
    public boolean H0;
    public int I0;
    
    public z7k(final x7k<K, V> f0, final s2u<K, V, T>[] array) {
        zzd.f((Object)f0, "builder");
        super(f0.E0, (s2u[])array);
        this.F0 = f0;
        this.I0 = f0.G0;
    }
    
    public final void e(int h, final p2u<?, ?> p2u, final K k, final int n) {
        final int n2 = n * 5;
        if (n2 > 30) {
            final s2u s2u = super.C0[n];
            final Object[] d = p2u.d;
            s2u.e(d, d.length, 0);
            while (true) {
                final s2u s2u2 = super.C0[n];
                if (zzd.a(s2u2.C0[s2u2.E0], (Object)k)) {
                    break;
                }
                final s2u s2u3 = super.C0[n];
                s2u3.E0 += 2;
            }
            super.D0 = n;
            return;
        }
        final int n3 = 1 << (h >> n2 & 0x1F);
        if (p2u.j(n3)) {
            h = p2u.h(n3);
            super.C0[n].e(p2u.d, p2u.g() * 2, h);
            super.D0 = n;
            return;
        }
        final int v = p2u.v(n3);
        final p2u u = p2u.u(v);
        super.C0[n].e(p2u.d, p2u.g() * 2, v);
        this.e(h, (p2u<?, ?>)u, k, n + 1);
    }
    
    public final T next() {
        if (this.F0.G0 == this.I0) {
            this.G0 = (K)this.a();
            this.H0 = true;
            return (T)super.next();
        }
        throw new ConcurrentModificationException();
    }
    
    public final void remove() {
        if (this.H0) {
            if (super.E0) {
                final Object a = this.a();
                fjv.c((Object)this.F0).remove(this.G0);
                int hashCode;
                if (a != null) {
                    hashCode = a.hashCode();
                }
                else {
                    hashCode = 0;
                }
                this.e(hashCode, (p2u<?, ?>)this.F0.E0, (K)a, 0);
            }
            else {
                fjv.c((Object)this.F0).remove(this.G0);
            }
            this.G0 = null;
            this.H0 = false;
            this.I0 = this.F0.G0;
            return;
        }
        throw new IllegalStateException();
    }
}
