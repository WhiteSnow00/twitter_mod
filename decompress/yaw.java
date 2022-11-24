// 
// Decompiled by Procyon v0.6.0
// 

public final class yaw
{
    public final vef a;
    public final boolean b;
    
    public yaw(final vef a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yaw)) {
            return false;
        }
        final yaw yaw = (yaw)o;
        return e0e.a((Object)this.a, (Object)yaw.a) && this.b == yaw.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final vef a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserCreateLinkModuleParams(config=");
        sb.append(a);
        sb.append(", visibleOnCreation=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
