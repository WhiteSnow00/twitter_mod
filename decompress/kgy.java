// 
// Decompiled by Procyon v0.6.0
// 

public final class kgy<E> extends jey<E>
{
    public static final jey<Object> G0;
    public final transient Object[] E0;
    public final transient int F0;
    
    static {
        kgy.G0 = new kgy(new Object[0], 0);
    }
    
    public kgy(final Object[] e0, final int f0) {
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final int e(final Object[] array) {
        System.arraycopy(this.E0, 0, array, 0, this.F0);
        return this.F0 + 0;
    }
    
    public final E get(final int n) {
        tdy.b1(n, this.F0);
        return (E)this.E0[n];
    }
    
    public final Object[] i() {
        return this.E0;
    }
    
    public final int j() {
        return 0;
    }
    
    public final int l() {
        return this.F0;
    }
    
    public final int size() {
        return this.F0;
    }
}
