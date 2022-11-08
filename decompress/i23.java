import java.util.List;
import com.twitter.profilemodules.model.business.OpenCloseTimeNext;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i23
{
    public final omj a;
    public final Boolean b;
    public final OpenCloseTimeNext c;
    public final OpenCloseTimeNext d;
    public final List<e23> e;
    
    public i23(final omj a, final Boolean b, final OpenCloseTimeNext c, final OpenCloseTimeNext d, final List<e23> e) {
        zzd.f((Object)e, "regular");
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
        if (!(o instanceof i23)) {
            return false;
        }
        final i23 i23 = (i23)o;
        return this.a == i23.a && zzd.a((Object)this.b, (Object)i23.b) && zzd.a((Object)this.c, (Object)i23.c) && zzd.a((Object)this.d, (Object)i23.d) && zzd.a((Object)this.e, (Object)i23.e);
    }
    
    @Override
    public final int hashCode() {
        final omj a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final OpenCloseTimeNext c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final OpenCloseTimeNext d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return this.e.hashCode() + (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final omj a = this.a;
        final Boolean b = this.b;
        final OpenCloseTimeNext c = this.c;
        final OpenCloseTimeNext d = this.d;
        final List<e23> e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessOpenTimesResponse(openTimesType=");
        sb.append(a);
        sb.append(", isOpen=");
        sb.append(b);
        sb.append(", opens=");
        sb.append(c);
        sb.append(", closes=");
        sb.append(d);
        sb.append(", regular=");
        return gp.A(sb, (List)e, ")");
    }
}
