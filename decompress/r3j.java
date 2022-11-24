// 
// Decompiled by Procyon v0.6.0
// 

public final class r3j
{
    public final String a;
    
    public r3j(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && r3j.class == o.getClass() && this.a.equals(((r3j)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
