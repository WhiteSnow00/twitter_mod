// 
// Decompiled by Procyon v0.6.0
// 

public final class bws implements ccx
{
    public final qgv a;
    public final yzl b;
    
    public bws(final qgv a, final yzl b) {
        e0e.f((Object)b, "reactionType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bws)) {
            return false;
        }
        final bws bws = (bws)o;
        return e0e.a((Object)this.a, (Object)bws.a) && this.b == bws.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final qgv a = this.a;
        final yzl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelineEntryViewState(user=");
        sb.append(a);
        sb.append(", reactionType=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
