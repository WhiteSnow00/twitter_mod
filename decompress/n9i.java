import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9i implements ccx
{
    public final boolean a;
    public final int b;
    public final int c;
    
    public n9i() {
        this.a = true;
        this.b = 2131955307;
        this.c = 2131955306;
    }
    
    public n9i(final boolean a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static n9i l(final n9i n9i, final int n, final int n2) {
        final boolean a = n9i.a;
        Objects.requireNonNull(n9i);
        return new n9i(a, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n9i)) {
            return false;
        }
        final n9i n9i = (n9i)o;
        return this.a == n9i.a && this.b == n9i.b && this.c == n9i.c;
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return (a * 31 + this.b) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final int b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("NarrowcastErrorBottomSheetViewState(participationLimited=");
        sb.append(a);
        sb.append(", titleId=");
        sb.append(b);
        sb.append(", descriptionId=");
        return ad.y(sb, c, ")");
    }
}
