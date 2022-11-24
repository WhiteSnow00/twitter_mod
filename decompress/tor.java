// 
// Decompiled by Procyon v0.6.0
// 

public final class tor
{
    public static final a Companion;
    public final Long a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Boolean k;
    public final Boolean l;
    public final String m;
    public final String n;
    public final Boolean o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    
    static {
        Companion = new a();
    }
    
    public tor() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151);
    }
    
    public tor(final Long a, final Integer b, final Integer c, final Integer d, final Boolean e, final String f, final String g, final String h, final String i, final Integer j, final Boolean k, final Boolean l, final String m, final String n, final Boolean o, final String p21, final String q, final String r, final String s, final String t, final String u) {
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
        this.p = p21;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    public tor(Long n, Integer n2, Integer n3, Integer n4, Boolean b, String s, String s2, String s3, String s4, Integer n5, Boolean b2, Boolean b3, String s5, String s6, Boolean b4, String s7, String s8, String s9, String s10, String s11, String s12, final int n6) {
        if ((n6 & 0x1) != 0x0) {
            n = null;
        }
        if ((n6 & 0x2) != 0x0) {
            n2 = null;
        }
        if ((n6 & 0x4) != 0x0) {
            n3 = null;
        }
        if ((n6 & 0x8) != 0x0) {
            n4 = null;
        }
        if ((n6 & 0x10) != 0x0) {
            b = null;
        }
        if ((n6 & 0x20) != 0x0) {
            s = null;
        }
        if ((n6 & 0x40) != 0x0) {
            s2 = null;
        }
        if ((n6 & 0x80) != 0x0) {
            s3 = null;
        }
        if ((n6 & 0x100) != 0x0) {
            s4 = null;
        }
        if ((n6 & 0x200) != 0x0) {
            n5 = null;
        }
        if ((n6 & 0x400) != 0x0) {
            b2 = null;
        }
        if ((n6 & 0x800) != 0x0) {
            b3 = null;
        }
        if ((n6 & 0x1000) != 0x0) {
            s5 = null;
        }
        if ((n6 & 0x2000) != 0x0) {
            s6 = null;
        }
        if ((n6 & 0x4000) != 0x0) {
            b4 = null;
        }
        if ((n6 & 0x8000) != 0x0) {
            s7 = null;
        }
        if ((n6 & 0x10000) != 0x0) {
            s8 = null;
        }
        if ((n6 & 0x20000) != 0x0) {
            s9 = null;
        }
        if ((n6 & 0x40000) != 0x0) {
            s10 = null;
        }
        if ((n6 & 0x80000) != 0x0) {
            s11 = null;
        }
        if ((n6 & 0x100000) != 0x0) {
            s12 = null;
        }
        this(n, n2, n3, n4, b, s, s2, s3, s4, n5, b2, b3, s5, s6, b4, s7, s8, s9, s10, s11, s12);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tor)) {
            return false;
        }
        final tor tor = (tor)o;
        return e0e.a((Object)this.a, (Object)tor.a) && e0e.a((Object)this.b, (Object)tor.b) && e0e.a((Object)this.c, (Object)tor.c) && e0e.a((Object)this.d, (Object)tor.d) && e0e.a((Object)this.e, (Object)tor.e) && e0e.a((Object)this.f, (Object)tor.f) && e0e.a((Object)this.g, (Object)tor.g) && e0e.a((Object)this.h, (Object)tor.h) && e0e.a((Object)this.i, (Object)tor.i) && e0e.a((Object)this.j, (Object)tor.j) && e0e.a((Object)this.k, (Object)tor.k) && e0e.a((Object)this.l, (Object)tor.l) && e0e.a((Object)this.m, (Object)tor.m) && e0e.a((Object)this.n, (Object)tor.n) && e0e.a((Object)this.o, (Object)tor.o) && e0e.a((Object)this.p, (Object)tor.p) && e0e.a((Object)this.q, (Object)tor.q) && e0e.a((Object)this.r, (Object)tor.r) && e0e.a((Object)this.s, (Object)tor.s) && e0e.a((Object)this.t, (Object)tor.t) && e0e.a((Object)this.u, (Object)tor.u);
    }
    
    @Override
    public final int hashCode() {
        final Long a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final Integer j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final Boolean k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final Boolean l = this.l;
        int hashCode13;
        if (l == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = l.hashCode();
        }
        final String m = this.m;
        int hashCode14;
        if (m == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = m.hashCode();
        }
        final String n = this.n;
        int hashCode15;
        if (n == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = n.hashCode();
        }
        final Boolean o = this.o;
        int hashCode16;
        if (o == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = o.hashCode();
        }
        final String p = this.p;
        int hashCode17;
        if (p == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = p.hashCode();
        }
        final String q = this.q;
        int hashCode18;
        if (q == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = q.hashCode();
        }
        final String r = this.r;
        int hashCode19;
        if (r == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = r.hashCode();
        }
        final String s = this.s;
        int hashCode20;
        if (s == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = s.hashCode();
        }
        final String t = this.t;
        int hashCode21;
        if (t == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = t.hashCode();
        }
        final String u = this.u;
        if (u != null) {
            hashCode = u.hashCode();
        }
        return (((((((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Long a = this.a;
        final Integer b = this.b;
        final Integer c = this.c;
        final Integer d = this.d;
        final Boolean e = this.e;
        final String f = this.f;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        final Integer j = this.j;
        final Boolean k = this.k;
        final Boolean l = this.l;
        final String m = this.m;
        final String n = this.n;
        final Boolean o = this.o;
        final String p = this.p;
        final String q = this.q;
        final String r = this.r;
        final String s = this.s;
        final String t = this.t;
        final String u = this.u;
        final StringBuilder sb = new StringBuilder();
        sb.append("SubscriptionScribeDetails(draftId=");
        sb.append(a);
        sb.append(", undoTweetPeriod=");
        sb.append(b);
        sb.append(", undoCount=");
        sb.append(c);
        sb.append(", numberOfTweets=");
        sb.append(d);
        sb.append(", isReply=");
        sb.append(e);
        sb.append(", referringPage=");
        sb.append(f);
        sb.append(", carouselItemTitle=");
        jba.s(sb, g, ", subscriptionErrorMessage=", h, ", endReason=");
        sb.append(i);
        sb.append(", sessionDurationInSeconds=");
        sb.append(j);
        sb.append(", subscriptionEnabled=");
        sb.append(k);
        sb.append(", userHasTwitterBlueClaim=");
        sb.append(l);
        sb.append(", appIconId=");
        jba.s(sb, m, ", updateReason=", n, ", success=");
        sb.append(o);
        sb.append(", productFeatureId=");
        sb.append(p);
        sb.append(", productFeatureSettingsElement=");
        jba.s(sb, q, ", productFeatureSettingsValue=", r, ", surface=");
        jba.s(sb, s, ", surfaces=", t, ", errorMessage=");
        return m51.y(sb, u, ")");
    }
    
    public static final class a
    {
    }
}
