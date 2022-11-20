// 
// Decompiled by Procyon v0.6.0
// 

public final class hvs implements jbx
{
    public final cgv a;
    public final ozl b;
    
    public hvs(final cgv a, final ozl b) {
        czd.f((Object)b, "reactionType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hvs)) {
            return false;
        }
        final hvs hvs = (hvs)o;
        return czd.a((Object)this.a, (Object)hvs.a) && this.b == hvs.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final cgv a = this.a;
        final ozl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelineEntryViewState(user=");
        sb.append(a);
        sb.append(", reactionType=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
