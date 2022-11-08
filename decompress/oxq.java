// 
// Decompiled by Procyon v0.6.0
// 

public final class oxq implements oax
{
    public final String a;
    public final String b;
    
    public oxq(final String a, final String b) {
        zzd.f((Object)a, "title");
        zzd.f((Object)b, "subtitle");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof oxq)) {
            return false;
        }
        final oxq oxq = (oxq)o;
        return zzd.a((Object)this.a, (Object)oxq.a) && zzd.a((Object)this.b, (Object)oxq.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return yqh.k("SpacesTabSectionHeaderViewState(title=", this.a, ", subtitle=", this.b, ")");
    }
}
