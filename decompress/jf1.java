import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jf1 extends kf1
{
    public final Set<String> a;
    
    public jf1(final Set<String> a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof jf1 && zzd.a((Object)this.a, (Object)((jf1)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("BPossibleTypes(possibleTypes=");
        g.append(this.a);
        g.append(')');
        return g.toString();
    }
}
