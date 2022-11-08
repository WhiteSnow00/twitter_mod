// 
// Decompiled by Procyon v0.6.0
// 

public final class cgd
{
    public static final a Companion;
    public final String a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public cgd(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cgd)) {
            return false;
        }
        final cgd cgd = (cgd)o;
        return zzd.a((Object)this.a, (Object)cgd.a) && zzd.a((Object)this.b, (Object)cgd.b);
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
        return yqh.k("InAppMessageInfo(title=", this.a, ", preview=", this.b, ")");
    }
    
    public static final class a
    {
    }
}
