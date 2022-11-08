// 
// Decompiled by Procyon v0.6.0
// 

public final class ocl implements yxp
{
    public final hfv a;
    
    public ocl(final hfv a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && ocl.class == o.getClass() && this.a.a(((ocl)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
