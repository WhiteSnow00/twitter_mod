// 
// Decompiled by Procyon v0.6.0
// 

public final class xin implements ccx
{
    public final boolean a;
    
    public xin() {
        this.a = false;
    }
    
    public xin(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xin && this.a == ((xin)o).a);
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
        return jba.o("RoomEntrypointViewState(isEnabled=", this.a, ")");
    }
}
