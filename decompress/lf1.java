import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lf1
{
    public final int a;
    public final int b;
    public final int c;
    
    public lf1(final int n, final int n2, final int n3) {
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
        if (!(o instanceof lf1)) {
            return false;
        }
        final lf1 lf1 = (lf1)o;
        if (this.a != lf1.a || this.b != lf1.b || this.c != lf1.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
