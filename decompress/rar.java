// 
// Decompiled by Procyon v0.6.0
// 

public final class rar<T> implements m8r<T>
{
    public final T D0;
    
    public rar(final T d0) {
        this.D0 = d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rar && czd.a((Object)this.D0, (Object)((rar)o).D0));
    }
    
    public final T getValue() {
        return this.D0;
    }
    
    @Override
    public final int hashCode() {
        final T d0 = this.D0;
        int hashCode;
        if (d0 == null) {
            hashCode = 0;
        }
        else {
            hashCode = d0.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return x68.k(fu8.j("StaticValueHolder(value="), (Object)this.D0, ')');
    }
}
