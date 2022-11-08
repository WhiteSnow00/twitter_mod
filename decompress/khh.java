// 
// Decompiled by Procyon v0.6.0
// 

public final class khh
{
    public final String a;
    public final b b;
    
    public khh(final String a, final b b) {
        zzd.f((Object)a, "url");
        zzd.f((Object)b, "contentType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof khh)) {
            return false;
        }
        final khh khh = (khh)o;
        return zzd.a((Object)this.a, (Object)khh.a) && this.b == khh.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final b b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ModelAsset(url=");
        sb.append(a);
        sb.append(", contentType=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public enum b
    {
        C0;
    }
}
