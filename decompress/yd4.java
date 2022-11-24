// 
// Decompiled by Procyon v0.6.0
// 

public final class yd4
{
    public final int a;
    public final n1p b;
    public final boolean c;
    public final gjl d;
    public final String e;
    public final yp2 f;
    
    public yd4(final int a, final n1p b, final boolean c, final gjl d, final String e, final yp2 f) {
        mqb.n(a, "clickDestination");
        e0e.f((Object)e, "clickSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yd4)) {
            return false;
        }
        final yd4 yd4 = (yd4)o;
        return this.a == yd4.a && e0e.a((Object)this.b, (Object)yd4.b) && this.c == yd4.c && e0e.a((Object)this.d, (Object)yd4.d) && e0e.a((Object)this.e, (Object)yd4.e) && e0e.a((Object)this.f, (Object)yd4.f);
    }
    
    @Override
    public final int hashCode() {
        final int g = lb0.G(this.a);
        final n1p b = this.b;
        final int n = 0;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final gjl d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final int d2 = brg.d(this.e, (((g * 31 + hashCode) * 31 + c) * 31 + hashCode2) * 31, 31);
        final yp2 f = this.f;
        int hashCode3;
        if (f == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = f.hashCode();
        }
        return d2 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final n1p b = this.b;
        final boolean c = this.c;
        final gjl d = this.d;
        final String e = this.e;
        final yp2 f = this.f;
        final StringBuilder f2 = ehk.f("ClickEventPayload(clickDestination=");
        f2.append(go0.H(a));
        f2.append(", scribeItemsProvider=");
        f2.append(b);
        f2.append(", isPromoted=");
        f2.append(c);
        f2.append(", promotedContent=");
        f2.append(d);
        f2.append(", clickSource=");
        f2.append(e);
        f2.append(", browserDataSource=");
        f2.append(f);
        f2.append(")");
        return f2.toString();
    }
}
