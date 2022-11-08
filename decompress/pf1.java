import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pf1
{
    public final int a;
    public final int b;
    public final int c;
    
    public pf1(final int n, final int n2, final int n3) {
        this.a = Math.max(n, 0);
        this.b = Math.max(n2, 0);
        this.c = Math.max(n3, 0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof pf1)) {
            return false;
        }
        final pf1 pf1 = (pf1)o;
        if (this.a != pf1.a || this.b != pf1.b || this.c != pf1.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
