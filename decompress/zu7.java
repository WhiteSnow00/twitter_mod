// 
// Decompiled by Procyon v0.6.0
// 

public final class zu7
{
    public final String a;
    public final su7 b;
    public final tu7 c;
    
    public zu7(final String a, final su7 b, final tu7 c) {
        e0e.f((Object)a, "__typename");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zu7)) {
            return false;
        }
        final zu7 zu7 = (zu7)o;
        return e0e.a((Object)this.a, (Object)zu7.a) && e0e.a((Object)this.b, (Object)zu7.b) && e0e.a((Object)this.c, (Object)zu7.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final su7 b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final tu7 c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final su7 b = this.b;
        final tu7 c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMReactionSliceResult(__typename=");
        sb.append(a);
        sb.append(", dMReactionSlice=");
        sb.append(b);
        sb.append(", dMReactionSliceFailure=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
