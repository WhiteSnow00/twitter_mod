// 
// Decompiled by Procyon v0.6.0
// 

public final class zgy<E> extends yey<E>
{
    public static final yey<Object> H0;
    public final transient Object[] F0;
    public final transient int G0;
    
    static {
        zgy.H0 = new zgy(new Object[0], 0);
    }
    
    public zgy(final Object[] f0, final int g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int e(final Object[] array) {
        System.arraycopy(this.F0, 0, array, 0, this.G0);
        return this.G0 + 0;
    }
    
    public final E get(final int n) {
        g63.g0(n, this.G0);
        return (E)this.F0[n];
    }
    
    public final Object[] i() {
        return this.F0;
    }
    
    public final int j() {
        return 0;
    }
    
    public final int l() {
        return this.G0;
    }
    
    public final int size() {
        return this.G0;
    }
}
