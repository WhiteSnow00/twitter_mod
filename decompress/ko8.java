// 
// Decompiled by Procyon v0.6.0
// 

public final class ko8
{
    public int a;
    
    public ko8() {
        this.a = 0;
    }
    
    public ko8(final int n, final int n2, final rf8 rf8) {
        this.a = 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ko8 && this.a == ((ko8)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return x70.C(fu8.j("DeltaCounter(count="), this.a, ')');
    }
}
