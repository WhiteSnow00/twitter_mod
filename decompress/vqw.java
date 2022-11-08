import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vqw
{
    public final String a;
    public final xwm<?> b;
    public final long c;
    public final List<oqw> d;
    public final String e;
    
    public vqw(final String a, final xwm<?> b, final long c, final List<oqw> d, final String e) {
        zzd.f((Object)a, "title");
        zzd.f((Object)b, "description");
        zzd.f((Object)e, "doneButtonText");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vqw)) {
            return false;
        }
        final vqw vqw = (vqw)o;
        return zzd.a((Object)this.a, (Object)vqw.a) && zzd.a((Object)this.b, (Object)vqw.b) && this.c == vqw.c && zzd.a((Object)this.d, (Object)vqw.d) && zzd.a((Object)this.e, (Object)vqw.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        return this.e.hashCode() + hy8.m((List)this.d, ((hashCode2 + hashCode * 31) * 31 + (int)(c ^ c >>> 32)) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final xwm<?> b = this.b;
        final long c = this.c;
        final List<oqw> d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("VerificationPolicyViolationsModel(title=");
        sb.append(a);
        sb.append(", description=");
        sb.append(b);
        sb.append(", timestamp=");
        sb.append(c);
        sb.append(", violations=");
        sb.append(d);
        return xa0.B(sb, ", doneButtonText=", e, ")");
    }
}
