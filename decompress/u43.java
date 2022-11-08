// 
// Decompiled by Procyon v0.6.0
// 

public final class u43 implements oax
{
    public final ecj a;
    public final xdj b;
    public final xdj c;
    
    public u43(final ecj a, final xdj b, final xdj c) {
        zzd.f((Object)a, "button");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u43)) {
            return false;
        }
        final u43 u43 = (u43)o;
        return zzd.a((Object)this.a, (Object)u43.a) && zzd.a((Object)this.b, (Object)u43.b) && zzd.a((Object)this.c, (Object)u43.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final xdj c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final ecj a = this.a;
        final xdj b = this.b;
        final xdj c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ButtonItemComponentViewState(button=");
        sb.append(a);
        sb.append(", primaryText=");
        sb.append(b);
        sb.append(", secondaryText=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
