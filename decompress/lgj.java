// 
// Decompiled by Procyon v0.6.0
// 

public final class lgj<N> implements tr0<N>
{
    public final tr0<N> a;
    public final int b;
    public int c;
    
    public lgj(final tr0<N> a, final int b) {
        e0e.f((Object)a, "applier");
        this.a = a;
        this.b = b;
    }
    
    public final N b() {
        return (N)this.a.b();
    }
    
    public final void c(final int n, final int n2, final int n3) {
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        this.a.c(n + b, n2 + b, n3);
    }
    
    public final void clear() {
        sa6.d("Clear is not valid on OffsetApplier".toString());
        throw null;
    }
    
    public final void d(final int n, final int n2) {
        final tr0<N> a = this.a;
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        a.d(n + b, n2);
    }
    
    public final void e(final int n, final N n2) {
        final tr0<N> a = this.a;
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        a.e(n + b, (Object)n2);
    }
    
    public final void f() {
    }
    
    public final void g(final int n, final N n2) {
        final tr0<N> a = this.a;
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        a.g(n + b, (Object)n2);
    }
    
    public final void h(final N n) {
        ++this.c;
        this.a.h((Object)n);
    }
    
    public final void i() {
    }
    
    public final void j() {
        final int c = this.c;
        if (c > 0) {
            this.c = c - 1;
            this.a.j();
            return;
        }
        sa6.d("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }
}
