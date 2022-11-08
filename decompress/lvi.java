import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvi
{
    public static final b Companion;
    public static final alp<lvi> e;
    public final kvi a;
    public final kvi b;
    public final kvi c;
    public final List<uqi> d;
    
    static {
        Companion = new b();
        lvi.e = lvi.lvi$c.c;
    }
    
    public lvi(final lvi.lvi$a lvi$a) {
        zzd.f((Object)lvi$a, "builder");
        final kvi a = lvi$a.a;
        if (a != null) {
            final kvi b = lvi$a.b;
            final kvi c = lvi$a.c;
            final List d = lvi$a.d;
            zzd.f((Object)d, "contextUsers");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        zzd.m("recipient");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lvi)) {
            return false;
        }
        final lvi lvi = (lvi)o;
        return zzd.a((Object)this.a, (Object)lvi.a) && zzd.a((Object)this.b, (Object)lvi.b) && zzd.a((Object)this.c, (Object)lvi.c) && zzd.a((Object)this.d, (Object)lvi.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final kvi b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final kvi c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return this.d.hashCode() + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final kvi a = this.a;
        final kvi b = this.b;
        final kvi c = this.c;
        final List<uqi> d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationUsers(recipient=");
        sb.append(a);
        sb.append(", sender=");
        sb.append(b);
        sb.append(", originalSender=");
        sb.append(c);
        sb.append(", contextUsers=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
