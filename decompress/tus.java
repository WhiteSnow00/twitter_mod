// 
// Decompiled by Procyon v0.6.0
// 

public final class tus implements oax
{
    public final hfv a;
    public final zyl b;
    
    public tus(final hfv a, final zyl b) {
        zzd.f((Object)b, "reactionType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tus)) {
            return false;
        }
        final tus tus = (tus)o;
        return zzd.a((Object)this.a, (Object)tus.a) && this.b == tus.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final hfv a = this.a;
        final zyl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelineEntryViewState(user=");
        sb.append(a);
        sb.append(", reactionType=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
