import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uwv
{
    public static final b Companion;
    public static final nmp<uwv> l;
    public final lyv a;
    public final String b;
    public final w29 c;
    public final String d;
    public final boolean e;
    public final wxv f;
    public final Map<String, Object> g;
    public final sia h;
    public final hyv i;
    public final long j;
    public final List<zwv> k;
    
    static {
        Companion = new b();
        uwv.l = new uwv.uwv$c();
    }
    
    public uwv(final lyv a, final String b, final w29 c, final String d, final boolean e, final wxv f, final Map<String, ?> g, final sia h, final hyv i) {
        e0e.f((Object)g, "experimentSignals");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (Map<String, Object>)g;
        this.h = h;
        this.i = i;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = -1;
        }
        this.j = hashCode;
        this.k = f.a();
    }
    
    public final boolean a(final lyv... array) {
        return ft0.U0((Object[])array, (Object)this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uwv)) {
            return false;
        }
        final uwv uwv = (uwv)o;
        return this.a == uwv.a && e0e.a((Object)this.b, (Object)uwv.b) && e0e.a((Object)this.c, (Object)uwv.c) && e0e.a((Object)this.d, (Object)uwv.d) && this.e == uwv.e && e0e.a((Object)this.f, (Object)uwv.f) && e0e.a((Object)this.g, (Object)uwv.g) && e0e.a((Object)this.h, (Object)uwv.h) && e0e.a((Object)this.i, (Object)uwv.i);
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
        final int hashCode4 = this.c.hashCode();
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final int hashCode6 = this.f.hashCode();
        final int hashCode7 = this.g.hashCode();
        final sia h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final hyv i = this.i;
        if (i != null) {
            hashCode2 = i.hashCode();
        }
        return ((hashCode7 + (hashCode6 + (((hashCode4 + (hashCode * 31 + hashCode3) * 31) * 31 + hashCode5) * 31 + e) * 31) * 31) * 31 + hashCode8) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return this.f.toString();
    }
    
    public static final class b
    {
    }
}
