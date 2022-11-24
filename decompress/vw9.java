// 
// Decompiled by Procyon v0.6.0
// 

public final class vw9 implements ccx
{
    public final boolean a;
    
    public vw9(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vw9 && this.a == ((vw9)o).a);
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
        return jba.o("EditVerifiedPhoneStatusViewState(optedIn=", this.a, ")");
    }
}
