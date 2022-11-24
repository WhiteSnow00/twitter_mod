// 
// Decompiled by Procyon v0.6.0
// 

public final class d100 extends tp0
{
    public final int a;
    public final boolean b;
    
    public d100(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a() {
        return this.b;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof tp0) {
            final tp0 tp0 = (tp0)o;
            if (this.a == tp0.b() && this.b == tp0.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (a ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(a);
        sb.append(", allowAssetPackDeletion=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
