// 
// Decompiled by Procyon v0.6.0
// 

public final class v01
{
    public final String a;
    public final z21 b;
    public final x21 c;
    
    public v01(final String a, final z21 b, final x21 c) {
        e0e.f((Object)a, "restId");
        e0e.f((Object)c, "metadata");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static v01 a(final v01 v01, final x21 x21) {
        final String a = v01.a;
        final z21 b = v01.b;
        e0e.f((Object)a, "restId");
        return new v01(a, b, x21);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v01)) {
            return false;
        }
        final v01 v01 = (v01)o;
        return e0e.a((Object)this.a, (Object)v01.a) && e0e.a((Object)this.b, (Object)v01.b) && e0e.a((Object)this.c, (Object)v01.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final z21 b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final z21 b = this.b;
        final x21 c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpace(restId=");
        sb.append(a);
        sb.append(", participants=");
        sb.append(b);
        sb.append(", metadata=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
