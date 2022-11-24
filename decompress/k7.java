// 
// Decompiled by Procyon v0.6.0
// 

public final class k7
{
    public final dv2 a;
    public final s23 b;
    public final c43 c;
    public final w6w d;
    public final gu2 e;
    public final r6c f;
    
    public k7(final dv2 a, final s23 b, final c43 c, final w6w d, final gu2 e, final r6c f) {
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
        if (!(o instanceof k7)) {
            return false;
        }
        final k7 k7 = (k7)o;
        return e0e.a((Object)this.a, (Object)k7.a) && e0e.a((Object)this.b, (Object)k7.b) && e0e.a((Object)this.c, (Object)k7.c) && e0e.a((Object)this.d, (Object)k7.d) && e0e.a((Object)this.e, (Object)k7.e) && e0e.a((Object)this.f, (Object)k7.f);
    }
    
    @Override
    public final int hashCode() {
        final dv2 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final s23 b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final c43 c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final w6w d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final gu2 e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final r6c f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final dv2 a = this.a;
        final s23 b = this.b;
        final c43 c = this.c;
        final w6w d = this.d;
        final gu2 e = this.e;
        final r6c f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("AboutModuleData(businessContact=");
        sb.append(a);
        sb.append(", businessOpenTimes=");
        sb.append(b);
        sb.append(", businessTimezone=");
        sb.append(c);
        sb.append(", businessWebsite=");
        sb.append(d);
        sb.append(", businessAddress=");
        sb.append(e);
        sb.append(", googleVerificationData=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
