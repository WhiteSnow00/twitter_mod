// 
// Decompiled by Procyon v0.6.0
// 

public final class e43
{
    public final f43 a;
    public final bu2 b;
    public final gv2 c;
    public final d43 d;
    public final n23 e;
    
    public e43(final f43 a, final bu2 b, final gv2 c, final d43 d, final n23 e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e43)) {
            return false;
        }
        final e43 e43 = (e43)o;
        return e0e.a((Object)this.a, (Object)e43.a) && e0e.a((Object)this.b, (Object)e43.b) && e0e.a((Object)this.c, (Object)e43.c) && e0e.a((Object)this.d, (Object)e43.d) && e0e.a((Object)this.e, (Object)e43.e);
    }
    
    @Override
    public final int hashCode() {
        final f43 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final bu2 b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final gv2 c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final d43 d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final n23 e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final f43 a = this.a;
        final bu2 b = this.b;
        final gv2 c = this.c;
        final d43 d = this.d;
        final n23 e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessVenueInput(website=");
        sb.append(a);
        sb.append(", address=");
        sb.append(b);
        sb.append(", contact=");
        sb.append(c);
        sb.append(", timezone=");
        sb.append(d);
        sb.append(", openTimes=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
