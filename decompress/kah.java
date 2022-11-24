// 
// Decompiled by Procyon v0.6.0
// 

public final class kah
{
    public final Boolean a;
    public final Boolean b;
    public final mr6 c;
    
    public kah() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
    
    public kah(final Boolean a, final Boolean b, final mr6 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kah)) {
            return false;
        }
        final kah kah = (kah)o;
        return e0e.a((Object)this.a, (Object)kah.a) && e0e.a((Object)this.b, (Object)kah.b) && e0e.a((Object)this.c, (Object)kah.c);
    }
    
    @Override
    public final int hashCode() {
        final Boolean a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final mr6 c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Boolean a = this.a;
        final Boolean b = this.b;
        final mr6 c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("MetadataUpdates(isMuted=");
        sb.append(a);
        sb.append(", isNsfw=");
        sb.append(b);
        sb.append(", conversationContext=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
