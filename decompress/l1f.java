import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l1f implements i1f, j0f
{
    public final /* synthetic */ pg8 a;
    public final /* synthetic */ q7r<k1f> b;
    
    public l1f(final q7r<k1f> b) {
        this.b = b;
        this.a = new pg8(b);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final Object b(final int n) {
        return this.a.b(n);
    }
    
    public final hze d() {
        return ((k1f)this.b.getValue()).b;
    }
    
    public final void e(final int n, final m76 m76, final int n2) {
        m76.x(1610124706);
        final ea6$b a = ea6.a;
        this.a.e(n, m76, n2 & 0xE);
        m76.O();
    }
    
    public final Map<Object, Integer> f() {
        return this.a.f();
    }
    
    public final Object g(final int n) {
        return this.a.g(n);
    }
    
    public final List<Integer> h() {
        return ((k1f)this.b.getValue()).a;
    }
}
