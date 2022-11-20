import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class prw
{
    public final String a;
    public final oxm<?> b;
    public final long c;
    public final List<irw> d;
    public final String e;
    
    public prw(final String a, final oxm<?> b, final long c, final List<irw> d, final String e) {
        czd.f((Object)a, "title");
        czd.f((Object)b, "description");
        czd.f((Object)e, "doneButtonText");
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
        if (!(o instanceof prw)) {
            return false;
        }
        final prw prw = (prw)o;
        return czd.a((Object)this.a, (Object)prw.a) && czd.a((Object)this.b, (Object)prw.b) && this.c == prw.c && czd.a((Object)this.d, (Object)prw.d) && czd.a((Object)this.e, (Object)prw.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        return this.e.hashCode() + sde.d((List)this.d, ((hashCode2 + hashCode * 31) * 31 + (int)(c ^ c >>> 32)) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final oxm<?> b = this.b;
        final long c = this.c;
        final List<irw> d = this.d;
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
        return ta0.z(sb, ", doneButtonText=", e, ")");
    }
}
