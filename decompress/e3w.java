// 
// Decompiled by Procyon v0.6.0
// 

public final class e3w extends lma
{
    public final boolean a;
    
    public e3w(final boolean a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e3w && this.a == ((e3w)o).a);
    }
    
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    public final String toString() {
        return mb0.x("UpdatePersonalizePref(enabled=", this.a, ")");
    }
}
