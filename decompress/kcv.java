// 
// Decompiled by Procyon v0.6.0
// 

public final class kcv
{
    public final w2a a;
    public final int b;
    public final boolean c;
    
    public kcv(final w2a a, final int b, final boolean c) {
        zzd.f((Object)a, "emptyConfig");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kcv)) {
            return false;
        }
        final kcv kcv = (kcv)o;
        return zzd.a((Object)this.a, (Object)kcv.a) && this.b == kcv.b && this.c == kcv.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + b) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final w2a a = this.a;
        final int b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("TwitterListPresentationConfiguration(emptyConfig=");
        sb.append(a);
        sb.append(", listInflatedId=");
        sb.append(b);
        sb.append(", swipeToRefreshEnabled=");
        return bd.y(sb, c, ")");
    }
}
