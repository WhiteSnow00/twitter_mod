// 
// Decompiled by Procyon v0.6.0
// 

public final class i0h
{
    public static final alp<i0h> b;
    public final long a;
    
    static {
        i0h.b = new i0h.i0h$a();
    }
    
    public i0h(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof i0h && ((i0h)o).a == this.a;
    }
    
    @Override
    public final int hashCode() {
        return w4j.d(this.a);
    }
}
