// 
// Decompiled by Procyon v0.6.0
// 

public final class uvk
{
    public final String a;
    public final Long b;
    
    public uvk(final String a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uvk)) {
            return false;
        }
        final uvk uvk = (uvk)o;
        return e0e.a((Object)this.a, (Object)uvk.a) && e0e.a((Object)this.b, (Object)uvk.b);
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
        final StringBuilder f = ehk.f("Preference(key=");
        f.append(this.a);
        f.append(", value=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
