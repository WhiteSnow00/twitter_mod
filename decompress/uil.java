import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uil
{
    public static final zr2<uil, uil.uil$a> n;
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final Set<String> j;
    public final pq k;
    public final ad4 l;
    public final Map<String, String> m;
    
    static {
        uil.n = new uil.uil$b();
        final uil uil = (uil)((n4j)new uil.uil$a()).e();
    }
    
    public uil(final uil.uil$a uil$a) {
        this.a = uil$a.a;
        this.b = uil$a.b;
        this.c = uil$a.c;
        this.d = uil$a.d;
        this.f = uil$a.f;
        this.g = uil$a.g;
        this.h = uil$a.h;
        this.i = uil$a.i;
        this.e = uil$a.e;
        this.j = qdd.g(uil$a.j);
        this.m = (Map)((n4j)uil$a.k).e();
        this.k = uil$a.l;
        this.l = uil$a.m;
    }
    
    public final int a() {
        return c5j.f((Object)this.a);
    }
    
    public final String b() {
        return this.m.get("wysta_position");
    }
    
    public final String c() {
        return this.m.get("wysta_text");
    }
    
    public final boolean d() {
        return "Earned".equalsIgnoreCase(this.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && uil.class == o.getClass()) {
            final uil uil = (uil)o;
            if (!c5j.a((Object)this.a, (Object)uil.a) || !c5j.a((Object)this.b, (Object)uil.b) || !c5j.a((Object)this.c, (Object)uil.c) || !c5j.a((Object)this.d, (Object)uil.d) || !c5j.a((Object)this.f, (Object)uil.f) || !c5j.a((Object)this.g, (Object)uil.g) || !c5j.a((Object)this.h, (Object)uil.h) || !c5j.a((Object)this.i, (Object)uil.i) || !c5j.a((Object)this.e, (Object)uil.e) || !c5j.a((Object)this.j, (Object)uil.j) || !c5j.a((Object)this.m, (Object)uil.m) || !c5j.a((Object)this.k, (Object)uil.k) || !c5j.a((Object)this.l, (Object)uil.l)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.p((Object)this.a, new Object[] { this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.e, this.j, this.m, this.k, this.l });
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("impressionId: ");
        j.append(this.a);
        j.append(", disclosureType: ");
        j.append(this.b);
        j.append(", promotedTrendId: ");
        j.append(this.c);
        j.append(", socialContext: ");
        j.append(this.d);
        j.append(", advertiserName: ");
        j.append(this.f);
        j.append(", advertiserId: ");
        j.append(this.e);
        j.append(", advertiserUsername: ");
        j.append(this.g);
        j.append(", isPAcInTimeline: ");
        j.append(this.h);
        j.append(", isSuppressMediaForward: ");
        j.append(this.i);
        j.append(", experimentValues: ");
        j.append(this.m);
        j.append(", adMetadataContainer: ");
        j.append(this.k);
        j.append(", clickTrackingInfo: ");
        j.append(this.l);
        return j.toString();
    }
}
