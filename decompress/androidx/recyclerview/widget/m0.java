// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

public final class m0
{
    public final d8q<RecyclerView$c0, a> a;
    public final ecg<RecyclerView$c0> b;
    
    public m0() {
        this.a = new d8q<RecyclerView$c0, a>();
        this.b = (ecg<RecyclerView$c0>)new ecg();
    }
    
    public final void a(final RecyclerView$c0 recyclerView$c0) {
        a a;
        if ((a = this.a.getOrDefault(recyclerView$c0, null)) == null) {
            a = m0.a.a();
            this.a.put(recyclerView$c0, a);
        }
        a.a |= 0x1;
    }
    
    public final void b(final RecyclerView$c0 recyclerView$c0, final RecyclerView$j$c c) {
        a a;
        if ((a = this.a.getOrDefault(recyclerView$c0, null)) == null) {
            a = m0.a.a();
            this.a.put(recyclerView$c0, a);
        }
        a.c = c;
        a.a |= 0x8;
    }
    
    public final void c(final RecyclerView$c0 recyclerView$c0, final RecyclerView$j$c b) {
        a a;
        if ((a = this.a.getOrDefault(recyclerView$c0, null)) == null) {
            a = m0.a.a();
            this.a.put(recyclerView$c0, a);
        }
        a.b = b;
        a.a |= 0x4;
    }
    
    public final RecyclerView$j$c d(final RecyclerView$c0 recyclerView$c0, final int n) {
        final int f = this.a.f(recyclerView$c0);
        if (f < 0) {
            return null;
        }
        final a a = this.a.m(f);
        if (a != null) {
            final int a2 = a.a;
            if ((a2 & n) != 0x0) {
                final int a3 = ~n & a2;
                a.a = a3;
                RecyclerView$j$c recyclerView$j$c;
                if (n == 4) {
                    recyclerView$j$c = a.b;
                }
                else {
                    if (n != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    recyclerView$j$c = a.c;
                }
                if ((a3 & 0xC) == 0x0) {
                    this.a.j(f);
                    m0.a.b(a);
                }
                return recyclerView$j$c;
            }
        }
        return null;
    }
    
    public final void e(final RecyclerView$c0 recyclerView$c0) {
        final a a = this.a.getOrDefault(recyclerView$c0, null);
        if (a == null) {
            return;
        }
        a.a &= 0xFFFFFFFE;
    }
    
    public final void f(final RecyclerView$c0 recyclerView$c0) {
        int i = this.b.l() - 1;
        while (i >= 0) {
            if (recyclerView$c0 == this.b.m(i)) {
                final ecg<RecyclerView$c0> b = this.b;
                final Object[] f0 = b.F0;
                final Object o = f0[i];
                final Object h0 = ecg.H0;
                if (o != h0) {
                    f0[i] = h0;
                    b.D0 = true;
                    break;
                }
                break;
            }
            else {
                --i;
            }
        }
        final a a = this.a.remove(recyclerView$c0);
        if (a != null) {
            m0.a.b(a);
        }
    }
    
    public static final class a
    {
        public static crk<a> d;
        public int a;
        public RecyclerView$j$c b;
        public RecyclerView$j$c c;
        
        static {
            a.d = new erk(20);
        }
        
        public static a a() {
            a a;
            if ((a = m0.a.d.a()) == null) {
                a = new a();
            }
            return a;
        }
        
        public static void b(final a a) {
            a.a = 0;
            a.b = null;
            a.c = null;
            m0.a.d.b(a);
        }
    }
}
