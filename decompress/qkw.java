// 
// Decompiled by Procyon v0.6.0
// 

public final class qkw
{
    public final String a;
    public final boolean b;
    
    public qkw(final String a, final boolean b) {
        czd.f((Object)a, "moduleId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qkw)) {
            return false;
        }
        final qkw qkw = (qkw)o;
        return czd.a((Object)this.a, (Object)qkw.a) && this.b == qkw.b;
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
        return neg.h("UserUpdateModuleVisibilityParams(moduleId=", this.a, ", enabledForDisplay=", this.b, ")");
    }
}
