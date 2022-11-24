// 
// Decompiled by Procyon v0.6.0
// 

public final class wen implements ccx
{
    public final boolean a;
    
    public wen() {
        this.a = false;
    }
    
    public wen(final boolean b) {
        this.a = true;
    }
    
    public wen(final boolean b, final int n, final wg8 wg8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wen && this.a == ((wen)o).a);
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
        return jba.o("RoomDockerReactionStubViewState(show=", this.a, ")");
    }
}
