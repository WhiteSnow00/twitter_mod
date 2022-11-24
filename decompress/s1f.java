import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s1f implements p1f, q0f
{
    public final eh8 a;
    public final l9r<r1f> b;
    
    public s1f(final l9r<r1f> b) {
        this.b = b;
        this.a = new eh8((l9r<? extends q0f>)b);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final Object b(final int n) {
        return this.a.b(n);
    }
    
    public final oze d() {
        return ((r1f)this.b.getValue()).b;
    }
    
    public final void e(final int n, final d86 d86, final int n2) {
        d86.x(1610124706);
        final sa6$b a = sa6.a;
        this.a.e(n, d86, n2 & 0xE);
        d86.O();
    }
    
    public final Map<Object, Integer> f() {
        return this.a.f();
    }
    
    public final Object g(final int n) {
        return this.a.g(n);
    }
    
    public final List<Integer> h() {
        return ((r1f)this.b.getValue()).a;
    }
}
