// 
// Decompiled by Procyon v0.6.0
// 

public final class dl implements ipp
{
    public final el a;
    
    public dl(final el a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && dl.class == o.getClass() && o5j.a((Object)this.a, (Object)((dl)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
}
