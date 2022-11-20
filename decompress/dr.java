import java.util.AbstractCollection;
import com.google.android.exoplayer2.n;
import java.util.Collection;
import android.util.Log;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dr extends oq1
{
    public final vh1 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final edd<a> o;
    public final lh4 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public nrg u;
    
    public dr(final bwt bwt, final int[] array, final int n, final vh1 g, final long n2, final long n3, long n4, final int k, final int l, final float m, final float n5, final List<a> list, final lh4 p13) {
        super(bwt, array);
        if (n4 < n2) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            n4 = n2;
        }
        this.g = g;
        this.h = n2 * 1000L;
        this.i = n3 * 1000L;
        this.j = n4 * 1000L;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n5;
        this.o = edd.q((Collection<? extends a>)list);
        this.p = p13;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }
    
    public static void u(final List<edd.a<a>> list, final long[] array) {
        final int n = 0;
        long n2 = 0L;
        int n3 = 0;
        int i;
        while (true) {
            i = n;
            if (n3 >= array.length) {
                break;
            }
            n2 += array[n3];
            ++n3;
        }
        while (i < list.size()) {
            final edd.a a = (edd.a)list.get(i);
            if (a != null) {
                a.c((Object)new a(n2, array[i]));
            }
            ++i;
        }
    }
    
    public final int c() {
        return this.r;
    }
    
    public final void d() {
        this.u = null;
    }
    
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }
    
    public final void j(final float q) {
        this.q = q;
    }
    
    public final Object k() {
        return null;
    }
    
    public final void n(long n, final long n2, final long n3, final List<? extends nrg> list, final org[] array) {
        final long c = this.p.c();
        final int r = this.r;
        final int length = array.length;
        int i = 0;
        Label_0144: {
            long n4 = 0L;
            Label_0123: {
                if (r >= length || !array[r].next()) {
                    for (final org org : array) {
                        if (org.next()) {
                            n = org.b();
                            n4 = org.a();
                            break Label_0123;
                        }
                    }
                    n = this.w(list);
                    break Label_0144;
                }
                final org org2 = array[this.r];
                n = org2.b();
                n4 = org2.a();
            }
            n -= n4;
        }
        int s = this.s;
        if (s == 0) {
            this.s = 1;
            this.r = this.v(c, n);
            return;
        }
        int r2 = this.r;
        Label_0237: {
            if (!list.isEmpty()) {
                final n d = ((nrg)rp9.Z(list)).d;
                while (i < super.b) {
                    if (super.d[i] == d) {
                        break Label_0237;
                    }
                    ++i;
                }
            }
            i = -1;
        }
        if (i != -1) {
            s = ((nrg)rp9.Z(list)).e;
            r2 = i;
        }
        int v;
        final int n5 = v = this.v(c, n);
        Label_0414: {
            if (!this.f(r2, c)) {
                final n[] d2 = super.d;
                final n n6 = d2[r2];
                final n n7 = d2[n5];
                if (n3 == -9223372036854775807L) {
                    n = this.h;
                }
                else {
                    long n8 = n3;
                    if (n != -9223372036854775807L) {
                        n8 = n3 - n;
                    }
                    n = Math.min((long)(n8 * this.n), this.h);
                }
                final int k0 = n7.K0;
                final int k2 = n6.K0;
                if (k0 <= k2 || n2 >= n) {
                    v = n5;
                    if (k0 >= k2) {
                        break Label_0414;
                    }
                    v = n5;
                    if (n2 < this.i) {
                        break Label_0414;
                    }
                }
                v = r2;
            }
        }
        if (v != r2) {
            s = 3;
        }
        this.s = s;
        this.r = v;
    }
    
    public final int p(final long n, final List<? extends nrg> list) {
        final long c = this.p.c();
        final long t = this.t;
        final int n2 = 0;
        if (t != -9223372036854775807L && c - t < 1000L && (list.isEmpty() || rp9.Z(list).equals(this.u))) {
            return list.size();
        }
        this.t = c;
        nrg u;
        if (list.isEmpty()) {
            u = null;
        }
        else {
            u = (nrg)rp9.Z(list);
        }
        this.u = u;
        if (list.isEmpty()) {
            return 0;
        }
        final int size = list.size();
        final long y = cnw.y(list.get(size - 1).g - n, this.q);
        final long j = this.j;
        if (y < j) {
            return size;
        }
        final n n3 = super.d[this.v(c, this.w(list))];
        for (int i = n2; i < size; ++i) {
            final nrg nrg = list.get(i);
            final n d = nrg.d;
            if (cnw.y(nrg.g - n, this.q) >= j && d.K0 < n3.K0) {
                final int u2 = d.U0;
                if (u2 != -1 && u2 <= this.l) {
                    final int t2 = d.T0;
                    if (t2 != -1 && t2 <= this.k && u2 < n3.U0) {
                        return i;
                    }
                }
            }
        }
        return size;
    }
    
    public final int s() {
        return this.s;
    }
    
    public final int v(final long n, long b) {
        b = (long)(this.g.a() * this.m);
        this.g.b();
        b /= (long)this.q;
        if (!((AbstractCollection)this.o).isEmpty()) {
            int n2;
            for (n2 = 1; n2 < ((AbstractCollection)this.o).size() - 1 && ((a)this.o.get(n2)).a < b; ++n2) {}
            final a a = this.o.get(n2 - 1);
            final a a2 = this.o.get(n2);
            final long a3 = a.a;
            final float n3 = (b - a3) / (float)(a2.a - a3);
            b = a.b;
            b += (long)(n3 * (a2.b - b));
        }
        int i = 0;
        int n4 = 0;
        while (i < super.b) {
            if (n == Long.MIN_VALUE || !this.f(i, n)) {
                if (super.d[i].K0 <= b) {
                    return i;
                }
                n4 = i;
            }
            ++i;
        }
        return n4;
    }
    
    public final long w(final List<? extends nrg> list) {
        final boolean empty = list.isEmpty();
        final long n = -9223372036854775807L;
        if (empty) {
            return -9223372036854775807L;
        }
        final nrg nrg = (nrg)rp9.Z(list);
        final long g = nrg.g;
        long n2 = n;
        if (g != -9223372036854775807L) {
            final long h = nrg.h;
            n2 = n;
            if (h != -9223372036854775807L) {
                n2 = h - g;
            }
        }
        return n2;
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            if (this.a != a.a || this.b != a.b) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }
}
