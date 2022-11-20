// 
// Decompiled by Procyon v0.6.0
// 

public final class dvk
{
    public final String a;
    public final Long b;
    
    public dvk(final String a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dvk)) {
            return false;
        }
        final dvk dvk = (dvk)o;
        return czd.a((Object)this.a, (Object)dvk.a) && czd.a((Object)this.b, (Object)dvk.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Long b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Preference(key=");
        j.append(this.a);
        j.append(", value=");
        j.append(this.b);
        j.append(')');
        return j.toString();
    }
}
