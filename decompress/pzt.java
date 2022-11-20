// 
// Decompiled by Procyon v0.6.0
// 

public final class pzt
{
    public final ozt a;
    public final ozt b;
    
    public pzt() {
        this(null, 3);
    }
    
    public pzt(ozt ozt, final int n) {
        if ((n & 0x2) != 0x0) {
            ozt = null;
        }
        this(null, ozt);
    }
    
    public pzt(final ozt a, final ozt b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pzt)) {
            return false;
        }
        final pzt pzt = (pzt)o;
        return czd.a((Object)this.a, (Object)pzt.a) && czd.a((Object)this.b, (Object)pzt.b);
    }
    
    @Override
    public final int hashCode() {
        final ozt a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ozt b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final ozt a = this.a;
        final ozt b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TransitionAnimationConfiguration(openConfiguration=");
        sb.append(a);
        sb.append(", closeConfiguration=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
