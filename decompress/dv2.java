// 
// Decompiled by Procyon v0.6.0
// 

public final class dv2
{
    public static final a Companion;
    public final hv2 a;
    public final ev2 b;
    
    static {
        Companion = new a();
    }
    
    public dv2(final hv2 a, final ev2 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dv2)) {
            return false;
        }
        final dv2 dv2 = (dv2)o;
        return e0e.a((Object)this.a, (Object)dv2.a) && e0e.a((Object)this.b, (Object)dv2.b);
    }
    
    @Override
    public final int hashCode() {
        final hv2 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ev2 b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final hv2 a = this.a;
        final ev2 b = this.b;
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
