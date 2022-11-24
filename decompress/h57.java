import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h57 implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final rfu g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final List<syl> k;
    public final String l;
    public final ek1 m;
    public final long n;
    public final long o;
    public final kk1 p;
    public final List<hk1> q;
    public final String r;
    
    public h57(final long a, final String b, final long c, final long d, final boolean e, final boolean f, final rfu g, final long h, final boolean i, final boolean j, final List<syl> k, final String l, final ek1 m, final long n, final long o, final kk1 p18, final List<? extends hk1> q, final String r) {
        e0e.f((Object)b, "conversationId");
        e0e.f((Object)k, "reactions");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = (List<hk1>)q;
        this.r = r;
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h57)) {
            return false;
        }
        final h57 h57 = (h57)o;
        return this.a == h57.a && e0e.a((Object)this.b, (Object)h57.b) && this.c == h57.c && this.d == h57.d && this.e == h57.e && this.f == h57.f && e0e.a((Object)this.g, (Object)h57.g) && this.h == h57.h && this.i == h57.i && this.j == h57.j && e0e.a((Object)this.k, (Object)h57.k) && e0e.a((Object)this.l, (Object)h57.l) && e0e.a((Object)this.m, (Object)h57.m) && this.n == h57.n && this.o == h57.o && e0e.a((Object)this.p, (Object)h57.p) && e0e.a((Object)this.q, (Object)h57.q) && e0e.a((Object)this.r, (Object)h57.r);
    }
    
    public final String getConversationId() {
        return this.b;
    }
    
    public final long getId() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int d = brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final long c = this.c;
        final int n = (int)(c ^ c >>> 32);
        final long d2 = this.d;
        final int n2 = (int)(d2 ^ d2 >>> 32);
        final int e = this.e ? 1 : 0;
        int n3 = 1;
        int n4 = e;
        if (e != 0) {
            n4 = 1;
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final int hashCode = this.g.hashCode();
        final long h = this.h;
        final int n5 = (int)(h ^ h >>> 32);
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        final int j = this.j ? 1 : 0;
        if (j == 0) {
            n3 = j;
        }
        final int o = go9.o((List)this.k, ((((hashCode + ((((d + n) * 31 + n2) * 31 + n4) * 31 + f) * 31) * 31 + n5) * 31 + i) * 31 + n3) * 31, 31);
        final String l = this.l;
        final int n6 = 0;
        int hashCode2;
        if (l == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = l.hashCode();
        }
        final ek1 m = this.m;
        int hashCode3;
        if (m == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = m.hashCode();
        }
        final long n7 = this.n;
        final int n8 = (int)(n7 ^ n7 >>> 32);
        final long o2 = this.o;
        final int n9 = (int)(o2 >>> 32 ^ o2);
        final kk1 p = this.p;
        int hashCode4;
        if (p == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = p.hashCode();
        }
        final int o3 = go9.o((List)this.q, (((((o + hashCode2) * 31 + hashCode3) * 31 + n8) * 31 + n9) * 31 + hashCode4) * 31, 31);
        final String r = this.r;
        int hashCode5;
        if (r == null) {
            hashCode5 = n6;
        }
        else {
            hashCode5 = r.hashCode();
        }
        return o3 + hashCode5;
    }
    
    public final long m() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final long d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final rfu g = this.g;
        final long h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final List<syl> k = this.k;
        final String l = this.l;
        final ek1 m = this.m;
        final long n = this.n;
        final long o = this.o;
        final kk1 p = this.p;
        final List<hk1> q = this.q;
        final String r = this.r;
        final StringBuilder b2 = snp.b("CreateMessageEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", senderId=");
        to0.E(b2, d, ", affectsSort=", e);
        b2.append(", isPartial=");
        b2.append(f);
        b2.append(", rawContent=");
        b2.append(g);
        po.E(b2, ", messageId=", h, ", isSpam=");
        l58.l(b2, i, ", isAbuse=", j, ", reactions=");
        b2.append(k);
        b2.append(", requestId=");
        b2.append(l);
        b2.append(", attachment=");
        b2.append(m);
        b2.append(", agentProfileId=");
        b2.append(n);
        po.E(b2, ", broadcastId=", o, ", quickReplyConfig=");
        b2.append(p);
        b2.append(", ctas=");
        b2.append(q);
        b2.append(", senderDeviceId=");
        return m51.y(b2, r, ")");
    }
}
