import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ok5 implements tvv
{
    public final String b;
    public final String c;
    public final int d;
    public final List<hfv> e;
    public final wr8 f;
    public final waa g;
    
    public ok5(final String b, final String c, final int d, final List e, final wr8 f) {
        final waa s0 = waa.S0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = s0;
    }
    
    public final wr8 a() {
        return this.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ok5)) {
            return false;
        }
        final ok5 ok5 = (ok5)o;
        return zzd.a((Object)this.b, (Object)ok5.b) && zzd.a((Object)this.c, (Object)ok5.c) && this.d == ok5.d && zzd.a((Object)this.e, (Object)ok5.e) && zzd.a((Object)this.f, (Object)ok5.f) && this.g == ok5.g;
    }
    
    public final waa getName() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final int m = hy8.m((List)this.e, (l7k.a(this.c, this.b.hashCode() * 31, 31) + this.d) * 31, 31);
        final wr8 f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return this.g.hashCode() + (m + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final int d = this.d;
        final List<hfv> e = this.e;
        final wr8 f = this.f;
        final waa g = this.g;
        final StringBuilder y = mb0.y("CommunityDetailsComponent(communityName=", b, ", communityTheme=", c, ", memberCount=");
        y.append(d);
        y.append(", membersFacepileUsers=");
        y.append(e);
        y.append(", destination=");
        y.append(f);
        y.append(", name=");
        y.append(g);
        y.append(")");
        return y.toString();
    }
}
