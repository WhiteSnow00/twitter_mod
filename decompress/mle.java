// 
// Decompiled by Procyon v0.6.0
// 

public final class mle
{
    public static final mle b;
    public final int a;
    
    static {
        b = new mle(-1);
    }
    
    public mle(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mle && this.a == ((mle)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
