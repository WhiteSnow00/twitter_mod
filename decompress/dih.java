// 
// Decompiled by Procyon v0.6.0
// 

public final class dih
{
    public final String a;
    public final b b;
    
    public dih(final String a, final b b) {
        e0e.f((Object)a, "url");
        e0e.f((Object)b, "contentType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dih)) {
            return false;
        }
        final dih dih = (dih)o;
        return e0e.a((Object)this.a, (Object)dih.a) && this.b == dih.b;
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
        F0;
        
        public static final b[] G0;
    }
}
