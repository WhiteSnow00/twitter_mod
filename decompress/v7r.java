// 
// Decompiled by Procyon v0.6.0
// 

public final class v7r implements jna
{
    public final jna a;
    public final long b;
    
    public v7r(final jna a, final long b) {
        this.a = a;
        omy.g(a.getPosition() >= b);
        this.b = b;
    }
    
    public final int b(final byte[] array, final int n, final int n2) {
        return this.a.b(array, n, n2);
    }
    
    public final boolean c(final byte[] array, final int n, final int n2, final boolean b) {
        return this.a.c(array, n, n2, b);
    }
    
    public final void e() {
        this.a.e();
    }
    
    public final boolean f(final byte[] array, final int n, final int n2, final boolean b) {
        return this.a.f(array, 0, n2, b);
    }
    
    public final long getLength() {
        return this.a.getLength() - this.b;
    }
    
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }
    
    public final long h() {
        return this.a.h() - this.b;
    }
    
    public final void i(final int n) {
        this.a.i(n);
    }
    
    public final int j(final byte[] array, final int n, final int n2) {
        return this.a.j(array, n, n2);
    }
    
    public final void k(final int n) {
        this.a.k(n);
    }
    
    public final boolean l(final int n, final boolean b) {
        return this.a.l(n, true);
    }
    
    public final void n(final byte[] array, final int n, final int n2) {
        this.a.n(array, n, n2);
    }
    
    public final int o() {
        return this.a.o();
    }
    
    public final void readFully(final byte[] array, final int n, final int n2) {
        this.a.readFully(array, n, n2);
    }
}
