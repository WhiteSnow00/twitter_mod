import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjj
{
    public static final a Companion;
    public final suh<vve> a;
    
    static {
        Companion = new a();
    }
    
    public kjj() {
        this.a = (suh<vve>)new suh((Object[])new vve[16]);
    }
    
    public final void a(final vve vve) {
        final bwe f1 = vve.f1;
        if (f1.b == 5 && !f1.d) {
            if (!f1.c) {
                if (vve.V0) {
                    okh$c okh$c = vve.e1.e;
                    if ((okh$c.F0 & 0x100) != 0x0) {
                        while (okh$c != null) {
                            if ((okh$c.E0 & 0x100) != 0x0 && okh$c instanceof x3c) {
                                final x3c x3c = (x3c)okh$c;
                                x3c.j((eve)wd.x((yl8)x3c, 256));
                            }
                            if ((okh$c.F0 & 0x100) == 0x0) {
                                break;
                            }
                            okh$c = okh$c.H0;
                        }
                    }
                }
            }
        }
        int n = 0;
        vve.n1 = false;
        final suh<vve> z = vve.z();
        final int f2 = z.F0;
        if (f2 > 0) {
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                this.a((vve)d0[n]);
            } while (++n < f2);
        }
    }
    
    public final void b(final vve vve) {
        czd.f((Object)vve, "node");
        this.a.b((Object)vve);
        vve.n1 = true;
    }
    
    public static final class a
    {
        public static final class a implements Comparator<vve>
        {
            public static final a D0;
            
            static {
                D0 = new a();
            }
            
            @Override
            public final int compare(final Object o, final Object o2) {
                final vve vve = (vve)o;
                final vve vve2 = (vve)o2;
                czd.f((Object)vve, "a");
                czd.f((Object)vve2, "b");
                int n = czd.h(vve2.L0, vve.L0);
                if (n == 0) {
                    n = czd.h(vve.hashCode(), vve2.hashCode());
                }
                return n;
            }
        }
    }
}
