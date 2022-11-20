// 
// Decompiled by Procyon v0.6.0
// 

public final class bdk
{
    public final boolean a;
    
    public bdk(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof bdk && this.a == ((bdk)o).a);
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
        return ib0.C("PinOrUnpinReplyApiRequestResponse(success=", this.a, ")");
    }
}
