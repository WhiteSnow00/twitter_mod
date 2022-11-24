import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lye implements jye, q0f
{
    public final eh8 a;
    public final l9r<jye> b;
    
    public lye(final l9r<? extends jye> b) {
        this.b = (l9r<jye>)b;
        this.a = new eh8((l9r<? extends q0f>)b);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final Object b(final int n) {
        return this.a.b(n);
    }
    
    @Override
    public final boolean c() {
        return ((jye)this.b.getValue()).c();
    }
    
    public final void e(final int n, final d86 d86, final int n2) {
        d86.x(125380152);
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
    
    @Override
    public final long i(final int n) {
        return ((jye)this.b.getValue()).i(n);
    }
    
    @Override
    public final ize j() {
        return ((jye)this.b.getValue()).j();
    }
}
