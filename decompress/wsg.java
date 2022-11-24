// 
// Decompiled by Procyon v0.6.0
// 

public final class wsg implements zwv
{
    public final wtg b;
    public final l43 c;
    public final ls8 d;
    public final mba e;
    public final int f;
    
    public wsg(final wtg b, final l43 c, final ls8 d, final mba e, final int f, final wg8 wg8) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public wsg(final wtg b, final ls8 d, final mba e, final int f) {
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ls8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wsg)) {
            return false;
        }
        final wsg wsg = (wsg)o;
        return e0e.a((Object)this.b, (Object)wsg.b) && e0e.a((Object)this.c, (Object)wsg.c) && e0e.a((Object)this.d, (Object)wsg.d) && this.e == wsg.e && this.f == wsg.f;
    }
    
    public final mba getName() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final wtg b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final l43 c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final ls8 d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return (this.e.hashCode() + ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31) * 31 + this.f;
    }
    
    @Override
    public final String toString() {
        final wtg b = this.b;
        final l43 c = this.c;
        final ls8 d = this.d;
        final mba e = this.e;
        final int f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaComponent(mediaEntity=");
        sb.append(b);
        sb.append(", button=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", name=");
        sb.append(e);
        sb.append(", defaultDrawable=");
        return ad.y(sb, f, ")");
    }
}
