import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lh0
{
    public final List<Integer> a;
    public final String b;
    
    public lh0(final List<Integer> a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lh0)) {
            return false;
        }
        final lh0 lh0 = (lh0)o;
        return czd.a((Object)this.a, (Object)lh0.a) && czd.a((Object)this.b, (Object)lh0.b);
    }
    
    @Override
    public final int hashCode() {
        final List<Integer> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final List<Integer> a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiTagEntity(indices=");
        sb.append(a);
        sb.append(", text=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
