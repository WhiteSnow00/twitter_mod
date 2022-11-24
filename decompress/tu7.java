// 
// Decompiled by Procyon v0.6.0
// 

public final class tu7
{
    public final vu7 a;
    public final String b;
    
    public tu7(final vu7 a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tu7)) {
            return false;
        }
        final tu7 tu7 = (tu7)o;
        return this.a == tu7.a && e0e.a((Object)this.b, (Object)tu7.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final vu7 a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMReactionSliceFailure(reason=");
        sb.append(a);
        sb.append(", message=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
