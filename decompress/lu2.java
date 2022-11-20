// 
// Decompiled by Procyon v0.6.0
// 

public final class lu2
{
    public static final a Companion;
    public final pu2 a;
    public final mu2 b;
    
    static {
        Companion = new a();
    }
    
    public lu2(final pu2 a, final mu2 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lu2)) {
            return false;
        }
        final lu2 lu2 = (lu2)o;
        return czd.a((Object)this.a, (Object)lu2.a) && czd.a((Object)this.b, (Object)lu2.b);
    }
    
    @Override
    public final int hashCode() {
        final pu2 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final mu2 b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final pu2 a = this.a;
        final mu2 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessContact(businessContactPhone=");
        sb.append(a);
        sb.append(", businessContactEmail=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
