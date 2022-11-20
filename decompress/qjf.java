// 
// Decompiled by Procyon v0.6.0
// 

public final class qjf implements mjf
{
    public final int a;
    
    public qjf(final int a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qjf && this.a == ((qjf)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return ze.G("ListFetchTypeDescriptor(fetchType=", this.a, ")");
    }
}
