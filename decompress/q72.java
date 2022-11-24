// 
// Decompiled by Procyon v0.6.0
// 

public final class q72 implements ipp
{
    public final s72 a;
    
    public q72(final s72 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && q72.class == o.getClass() && o5j.a((Object)this.a, (Object)((q72)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
}
