// 
// Decompiled by Procyon v0.6.0
// 

public final class cda implements ada
{
    public final String f;
    public final String g;
    
    public cda(final String f, final String g) {
        zzd.f((Object)f, "page");
        zzd.f((Object)g, "section");
        this.f = f;
        this.g = g;
    }
    
    public final String b() {
        return this.f;
    }
    
    @Override
    public final String d() {
        return this.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cda)) {
            return false;
        }
        final cda cda = (cda)o;
        return zzd.a((Object)this.f, (Object)cda.f) && zzd.a((Object)this.g, (Object)cda.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return yqh.k("EventSectionPrefixImpl(page=", this.f, ", section=", this.g, ")");
    }
}
