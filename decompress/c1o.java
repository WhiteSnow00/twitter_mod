// 
// Decompiled by Procyon v0.6.0
// 

public final class c1o implements ccx
{
    public final boolean a;
    
    public c1o() {
        this.a = false;
    }
    
    public c1o(final boolean a) {
        this.a = a;
    }
    
    public c1o(final boolean b, final int n, final wg8 wg8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c1o && this.a == ((c1o)o).a);
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
        return jba.o("RoomReplayDockStubViewState(shouldInflateViewStub=", this.a, ")");
    }
}
