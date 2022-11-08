// 
// Decompiled by Procyon v0.6.0
// 

public final class aki implements oax
{
    public final boolean a;
    
    public aki() {
        this.a = false;
    }
    
    public aki(final boolean a) {
        this.a = a;
    }
    
    public aki(final boolean b, final int n, final hg8 hg8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aki && this.a == ((aki)o).a);
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
        return mb0.x("NoAccessPreviewStubViewState(show=", this.a, ")");
    }
}
