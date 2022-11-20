import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w0f implements t0f, tze
{
    public final zf8 a;
    public final m8r<v0f> b;
    
    public w0f(final m8r<v0f> b) {
        this.b = b;
        this.a = new zf8((m8r)b);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final Object b(final int n) {
        return this.a.b(n);
    }
    
    public final rye d() {
        return ((v0f)this.b.getValue()).b;
    }
    
    public final void e(final int n, final x66 x66, final int n2) {
        x66.x(1610124706);
        final n96$b a = n96.a;
        this.a.e(n, x66, n2 & 0xE);
        x66.O();
    }
    
    public final Map<Object, Integer> f() {
        return this.a.f();
    }
    
    public final Object g(final int n) {
        return this.a.g(n);
    }
    
    public final List<Integer> h() {
        return ((v0f)this.b.getValue()).a;
    }
}
