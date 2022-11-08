import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvi
{
    public static final a Companion;
    public final List<String> a;
    public final long b;
    public final int c;
    
    static {
        Companion = new a();
    }
    
    public fvi(final List<String> a, final long b, final int c) {
        zzd.f((Object)a, "targetIds");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fvi)) {
            return false;
        }
        final fvi fvi = (fvi)o;
        return zzd.a((Object)this.a, (Object)fvi.a) && this.b == fvi.b && this.c == fvi.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode * 31 + (int)(b ^ b >>> 32)) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final List<String> a = this.a;
        final long b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationSmartActionDetails(targetIds=");
        sb.append(a);
        sb.append(", timeStamp=");
        sb.append(b);
        sb.append(", maxSlots=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
