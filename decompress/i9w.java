// 
// Decompiled by Procyon v0.6.0
// 

public final class i9w
{
    public final String a;
    public final gbl b;
    
    public i9w(final String a, final gbl b) {
        czd.f((Object)a, "moduleId");
        czd.f((Object)b, "profileModule");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i9w)) {
            return false;
        }
        final i9w i9w = (i9w)o;
        return czd.a((Object)this.a, (Object)i9w.a) && czd.a((Object)this.b, (Object)i9w.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final gbl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserBusinessModuleResponseV1(moduleId=");
        sb.append(a);
        sb.append(", profileModule=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
