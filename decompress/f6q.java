// 
// Decompiled by Procyon v0.6.0
// 

public final class f6q implements ipp, l94
{
    public final cph a;
    public final boolean b;
    
    public f6q(final cph a) {
        e0e.f((Object)a, "showMore");
        this.a = a;
        this.b = false;
    }
    
    public f6q(final cph a, final boolean b) {
        e0e.f((Object)a, "showMore");
        this.a = a;
        this.b = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f6q)) {
            return false;
        }
        final f6q f6q = (f6q)o;
        return e0e.a((Object)this.a, (Object)f6q.a) && this.b == f6q.b;
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
        final cph a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ShowMoreDisplayItem(showMore=");
        sb.append(a);
        sb.append(", shouldUnderline=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
