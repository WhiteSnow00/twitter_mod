// 
// Decompiled by Procyon v0.6.0
// 

public final class d3h implements zwv
{
    public final wtg b;
    public final mmt c;
    public final ls8 d;
    public final mba e;
    
    public d3h(final wtg b, final mmt c, final ls8 d) {
        final mba u0 = mba.U0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = u0;
    }
    
    public final ls8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d3h)) {
            return false;
        }
        final d3h d3h = (d3h)o;
        return e0e.a((Object)this.b, (Object)d3h.b) && e0e.a((Object)this.c, (Object)d3h.c) && e0e.a((Object)this.d, (Object)d3h.d) && this.e == d3h.e;
    }
    
    public final mba getName() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final mmt c = this.c;
        int hashCode2 = 0;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final ls8 d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return this.e.hashCode() + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final wtg b = this.b;
        final mmt c = this.c;
        final ls8 d = this.d;
        final mba e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaWithDetailsHorizontalComponent(mediaEntity=");
        sb.append(b);
        sb.append(", topicDetailItem=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", name=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
