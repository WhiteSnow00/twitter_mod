// 
// Decompiled by Procyon v0.6.0
// 

public final class nfn implements ccx
{
    public final boolean a;
    
    public nfn() {
        this(false, 1, null);
    }
    
    public nfn(final boolean a) {
        this.a = a;
    }
    
    public nfn(final boolean b, final int n, final wg8 wg8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof nfn && this.a == ((nfn)o).a);
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
        return jba.o("RoomDockerStubViewState(show=", this.a, ")");
    }
}
