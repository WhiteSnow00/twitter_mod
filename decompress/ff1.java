import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ff1 extends gf1
{
    public final Set<String> a;
    
    public ff1(final Set<String> a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ff1 && czd.a((Object)this.a, (Object)((ff1)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("BPossibleTypes(possibleTypes=");
        j.append(this.a);
        j.append(')');
        return j.toString();
    }
}
