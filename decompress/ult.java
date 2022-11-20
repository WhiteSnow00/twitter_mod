// 
// Decompiled by Procyon v0.6.0
// 

public final class ult
{
    public final String a;
    public final String b;
    public final fr8 c;
    
    public ult(final String a, final String b, final fr8 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ult)) {
            return false;
        }
        final ult ult = (ult)o;
        return czd.a((Object)this.a, (Object)ult.a) && czd.a((Object)this.b, (Object)ult.b) && czd.a((Object)this.c, (Object)ult.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final fr8 c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final fr8 c = this.c;
        final StringBuilder q = tqf.q("TopicDetailComponentItem(title=", a, ", subtitle=", b, ", destination=");
        q.append(c);
        q.append(")");
        return q.toString();
    }
}
