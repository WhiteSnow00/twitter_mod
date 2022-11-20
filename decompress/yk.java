// 
// Decompiled by Procyon v0.6.0
// 

public final class yk implements lop
{
    public final zk a;
    
    public yk(final zk a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && yk.class == o.getClass() && c5j.a((Object)this.a, (Object)((yk)o).a));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.a);
    }
}
