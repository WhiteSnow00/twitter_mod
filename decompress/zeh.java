// 
// Decompiled by Procyon v0.6.0
// 

public final class zeh
{
    public final String a;
    public final String b;
    
    public zeh(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zeh)) {
            return false;
        }
        final zeh zeh = (zeh)o;
        return czd.a((Object)this.a, (Object)zeh.a) && czd.a((Object)this.b, (Object)zeh.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return zh8.o("MobileAppModuleSimplifiedConfigInput(appleInputUrl=", this.a, ", googleInputUrl=", this.b, ")");
    }
}
