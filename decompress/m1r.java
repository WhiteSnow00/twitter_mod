import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m1r<V>
{
    public int a;
    public final SparseArray<V> b;
    public final qk6<V> c;
    
    public m1r(final qk6<V> qk6) {
        final y2r n0 = y2r.N0;
        this.b = (SparseArray<V>)new SparseArray();
        this.c = (qk6<V>)n0;
        this.a = -1;
    }
    
    public final void a(final int n, final V v) {
        final int a = this.a;
        final boolean b = false;
        if (a == -1) {
            omi.p(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            final SparseArray<V> b2 = this.b;
            final int key = b2.keyAt(b2.size() - 1);
            boolean b3 = b;
            if (n >= key) {
                b3 = true;
            }
            omi.m(b3);
            if (key == n) {
                final qk6<V> c = this.c;
                final SparseArray<V> b4 = this.b;
                c.accept(b4.valueAt(b4.size() - 1));
            }
        }
        this.b.append(n, (Object)v);
    }
    
    public final V b(final int n) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            final int a = this.a;
            if (a <= 0 || n >= this.b.keyAt(a)) {
                break;
            }
            --this.a;
        }
        while (this.a < this.b.size() - 1 && n >= this.b.keyAt(this.a + 1)) {
            ++this.a;
        }
        return (V)this.b.valueAt(this.a);
    }
    
    public final V c() {
        final SparseArray<V> b = this.b;
        return (V)b.valueAt(b.size() - 1);
    }
}
