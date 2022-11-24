// 
// Decompiled by Procyon v0.6.0
// 

public final class y9w
{
    public final String a;
    public final tbl b;
    
    public y9w(final String a, final tbl b) {
        e0e.f((Object)a, "moduleId");
        e0e.f((Object)b, "profileModule");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y9w)) {
            return false;
        }
        final y9w y9w = (y9w)o;
        return e0e.a((Object)this.a, (Object)y9w.a) && e0e.a((Object)this.b, (Object)y9w.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final tbl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserBusinessModuleResponseV1(moduleId=");
        sb.append(a);
        sb.append(", profileModule=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
