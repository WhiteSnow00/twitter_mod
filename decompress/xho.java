// 
// Decompiled by Procyon v0.6.0
// 

public final class xho implements ccx
{
    public final boolean a;
    
    public xho() {
        this.a = false;
    }
    
    public xho(final boolean b) {
        this.a = true;
    }
    
    public xho(final boolean b, final int n, final wg8 wg8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xho && this.a == ((xho)o).a);
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
        return jba.o("RoomTopicsTaggingStubViewState(enabled=", this.a, ")");
    }
}
