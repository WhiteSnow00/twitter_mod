// 
// Decompiled by Procyon v0.6.0
// 

public final class wjw
{
    public final String a;
    public final boolean b;
    
    public wjw(final String a, final boolean b) {
        zzd.f((Object)a, "moduleId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wjw)) {
            return false;
        }
        final wjw wjw = (wjw)o;
        return zzd.a((Object)this.a, (Object)wjw.a) && this.b == wjw.b;
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
        return eta.g("UserUpdateModuleVisibilityParams(moduleId=", this.a, ", enabledForDisplay=", this.b, ")");
    }
}
