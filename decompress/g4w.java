// 
// Decompiled by Procyon v0.6.0
// 

public final class g4w extends tma
{
    public final boolean a;
    
    public g4w(final boolean a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g4w && this.a == ((g4w)o).a);
    }
    
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    public final String toString() {
        return jba.o("UpdatePersonalizePref(enabled=", this.a, ")");
    }
}
