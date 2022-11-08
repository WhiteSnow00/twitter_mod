// 
// Decompiled by Procyon v0.6.0
// 

public final class g1t
{
    public static final g1t.g1t$a c;
    public final String a;
    public final String b;
    
    static {
        c = new g1t.g1t$a();
    }
    
    public g1t(final String a, final String b) {
        zzd.f((Object)a, "timelineKey");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g1t)) {
            return false;
        }
        final g1t g1t = (g1t)o;
        return zzd.a((Object)this.a, (Object)g1t.a) && zzd.a((Object)this.b, (Object)g1t.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return yqh.k("TimelineQuery(timelineKey=", this.a, ", timelineContext=", this.b, ")");
    }
}
