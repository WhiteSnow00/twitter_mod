// 
// Decompiled by Procyon v0.6.0
// 

public final class yjr implements tqd
{
    public final String b;
    
    public yjr(final String b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof yjr && c5j.a((Object)this.b, (Object)((yjr)o).b));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.b);
    }
}
