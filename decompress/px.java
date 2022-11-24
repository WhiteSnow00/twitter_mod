// 
// Decompiled by Procyon v0.6.0
// 

public final class px extends qql
{
    public final boolean a;
    
    public px() {
        this.a = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof px && this.a == ((px)o).a);
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
        return jba.o("AllArg(all=", this.a, ")");
    }
}
