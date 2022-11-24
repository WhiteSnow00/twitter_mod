import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cye extends pue implements hub<rp8, vj6, List<Integer>>
{
    public final osj F0;
    public final v8c G0;
    public final gs0$d H0;
    
    public cye(final osj f0, final v8c g0, final gs0$d h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final rp8 rp8 = (rp8)o;
        final long a = ((vj6)o2).a;
        e0e.f((Object)rp8, "$this$null");
        final int h = vj6.h(a);
        final int n = 1;
        if (h != Integer.MAX_VALUE) {
            final osj f0 = this.F0;
            final cwe f2 = cwe.F0;
            final List l2 = rr4.l2((Collection)this.G0.a(rp8, vj6.h(a) - rp8.S(zzz.x(this.F0, f2) + zzz.y(f0, f2)), rp8.S(this.H0.a())));
            final ArrayList list = (ArrayList)l2;
            for (int size = list.size(), i = n; i < size; ++i) {
                list.set(i, ((Number)list.get(i - 1)).intValue() + ((Number)list.get(i)).intValue());
            }
            return l2;
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
