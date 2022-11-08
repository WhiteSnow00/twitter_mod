// 
// Decompiled by Procyon v0.6.0
// 

public final class vt9
{
    public final String a;
    public final String b;
    
    public vt9(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vt9)) {
            return false;
        }
        final vt9 vt9 = (vt9)o;
        return zzd.a((Object)this.a, (Object)vt9.a) && zzd.a((Object)this.b, (Object)vt9.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return yqh.k("EditSpaceName(spaceId=", this.a, ", title=", this.b, ")");
    }
}
