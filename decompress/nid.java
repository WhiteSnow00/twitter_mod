import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nid
{
    public static final b Companion;
    public static final alp<List<nid>> f;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        Companion = new b();
        nid.f = new xq4$a((alp)nid.nid$c.c);
    }
    
    public nid(final long a, final String b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public nid(final nid.nid$a nid$a) {
        zzd.f((Object)nid$a, "builder");
        final long a = nid$a.a;
        final String b = nid$a.b;
        final String c = nid$a.c;
        final String d = nid$a.d;
        final String e = nid$a.e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static nid a(final nid nid, final long n) {
        final String b = nid.b;
        final String c = nid.c;
        final String d = nid.d;
        final String e = nid.e;
        Objects.requireNonNull(nid);
        return new nid(n, b, c, d, e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nid)) {
            return false;
        }
        final nid nid = (nid)o;
        return this.a == nid.a && zzd.a((Object)this.b, (Object)nid.b) && zzd.a((Object)this.c, (Object)nid.c) && zzd.a((Object)this.d, (Object)nid.d) && zzd.a((Object)this.e, (Object)nid.e);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((n * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final StringBuilder h = w48.h("InboxItem(notificationId=", a, ", text=", b);
        mag.m(h, ", sourceName=", c, ", aggregationData=", d);
        return xa0.B(h, ", group=", e, ")");
    }
    
    public static final class b
    {
    }
}
