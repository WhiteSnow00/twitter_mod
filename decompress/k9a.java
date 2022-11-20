// 
// Decompiled by Procyon v0.6.0
// 

public final class k9a implements jbx
{
    public final u8a a;
    public final boolean b;
    
    public k9a(final u8a a) {
        czd.f((Object)a, "timelineItem");
        this.a = a;
        this.b = false;
    }
    
    public k9a(final u8a a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k9a)) {
            return false;
        }
        final k9a k9a = (k9a)o;
        return czd.a((Object)this.a, (Object)k9a.a) && this.b == k9a.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final u8a a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ErrorViewState(timelineItem=");
        sb.append(a);
        sb.append(", enabled=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
