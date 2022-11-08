import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class my5
{
    public final List<jy5> a;
    public final String b;
    
    public my5(final List<jy5> a, final String b) {
        zzd.f((Object)a, "results");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof my5)) {
            return false;
        }
        final my5 my5 = (my5)o;
        return zzd.a((Object)this.a, (Object)my5.a) && zzd.a((Object)this.b, (Object)my5.b);
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
        final List<jy5> a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUserSearchResponse(results=");
        sb.append(a);
        sb.append(", bottomCursor=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
