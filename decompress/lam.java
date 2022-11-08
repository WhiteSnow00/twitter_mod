import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lam<E> extends aed<E>
{
    public static final aed<Object> G0;
    public final transient Object[] E0;
    public final transient int F0;
    
    static {
        lam.G0 = new lam(new Object[0], 0);
    }
    
    public lam(final Object[] e0, final int f0) {
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final int g(final Object[] array, final int n) {
        System.arraycopy(this.E0, 0, array, n, this.F0);
        return n + this.F0;
    }
    
    public final E get(final int n) {
        j78.e(n, this.F0);
        final Object o = this.E0[n];
        Objects.requireNonNull(o);
        return (E)o;
    }
    
    public final Object[] i() {
        return this.E0;
    }
    
    public final int j() {
        return this.F0;
    }
    
    public final int l() {
        return 0;
    }
    
    public final boolean m() {
        return false;
    }
    
    public final int size() {
        return this.F0;
    }
}
