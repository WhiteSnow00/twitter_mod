// 
// Decompiled by Procyon v0.6.0
// 

public final class k0h
{
    public static final rlp<k0h> b;
    public final long a;
    
    static {
        k0h.b = new k0h.k0h$a();
    }
    
    public k0h(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof k0h && ((k0h)o).a == this.a;
    }
    
    @Override
    public final int hashCode() {
        return c5j.d(this.a);
    }
}
