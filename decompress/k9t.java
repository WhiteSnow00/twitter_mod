// 
// Decompiled by Procyon v0.6.0
// 

public final class k9t
{
    public final boolean a;
    
    public k9t(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof k9t && this.a == ((k9t)o).a);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        return ib0.C("TimelineVerticalModuleMetadata(suppressDividers=", this.a, ")");
    }
}
