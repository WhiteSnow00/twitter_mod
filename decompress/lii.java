import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lii implements ccx
{
    public static final lii.lii$a Companion;
    public static final lii q;
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final xor e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final qgv n;
    public final jji o;
    public final sfv p;
    
    static {
        Companion = new lii.lii$a();
        final xor$a a = xor$a.a;
        final qgv r1 = qgv.R1;
        final jji i0 = jji.I0;
        e0e.e((Object)r1, "LOGGED_OUT");
        q = new lii("", "", null, "", (xor)a, true, "", false, null, "", "", "", "", r1, i0, null);
    }
    
    public lii(final String a, final String b, final Long c, final String d, final xor e, final boolean f, final String g, final boolean h, final String i, final String j, final String k, final String l, final String m, final qgv n, final jji o, final sfv p16) {
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
        this.p = p16;
    }
    
    public static lii l(final lii lii, String a, String b, Long c, String d, xor e, String g, boolean h, String i, String j, String k, String l, String m, qgv n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a = lii.a;
        }
        if ((n2 & 0x2) != 0x0) {
            b = lii.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = lii.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = lii.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = lii.e;
        }
        final boolean b2 = (n2 & 0x20) != 0x0 && lii.f;
        if ((n2 & 0x40) != 0x0) {
            g = lii.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = lii.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = lii.i;
        }
        if ((n2 & 0x200) != 0x0) {
            j = lii.j;
        }
        if ((n2 & 0x400) != 0x0) {
            k = lii.k;
        }
        if ((n2 & 0x800) != 0x0) {
            l = lii.l;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = lii.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = lii.n;
        }
        jji o;
        if ((n2 & 0x4000) != 0x0) {
            o = lii.o;
        }
        else {
            o = null;
        }
        sfv p15;
        if ((n2 & 0x8000) != 0x0) {
            p15 = lii.p;
        }
        else {
            p15 = null;
        }
        Objects.requireNonNull(lii);
        e0e.f((Object)a, "title");
        e0e.f((Object)b, "description");
        e0e.f((Object)d, "coverImageUrl");
        e0e.f((Object)e, "subscriptionStatus");
        e0e.f((Object)g, "profileUrl");
        e0e.f((Object)k, "tosUrl");
        e0e.f((Object)l, "privacyPolicyUrl");
        e0e.f((Object)m, "accountId");
        e0e.f((Object)n, "currentProfileOwner");
        e0e.f((Object)o, "newsletterSource");
        return new lii(a, b, c, d, e, b2, g, h, i, j, k, l, m, n, o, p15);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lii)) {
            return false;
        }
        final lii lii = (lii)o;
        return e0e.a((Object)this.a, (Object)lii.a) && e0e.a((Object)this.b, (Object)lii.b) && e0e.a((Object)this.c, (Object)lii.c) && e0e.a((Object)this.d, (Object)lii.d) && e0e.a((Object)this.e, (Object)lii.e) && this.f == lii.f && e0e.a((Object)this.g, (Object)lii.g) && this.h == lii.h && e0e.a((Object)this.i, (Object)lii.i) && e0e.a((Object)this.j, (Object)lii.j) && e0e.a((Object)this.k, (Object)lii.k) && e0e.a((Object)this.l, (Object)lii.l) && e0e.a((Object)this.m, (Object)lii.m) && e0e.a((Object)this.n, (Object)lii.n) && this.o == lii.o && e0e.a((Object)this.p, (Object)lii.p);
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        final Long c = this.c;
        final int n = 0;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final int d2 = brg.d(this.d, (d + hashCode) * 31, 31);
        final int hashCode2 = this.e.hashCode();
        final int f = this.f ? 1 : 0;
        final int n2 = 1;
        int n3 = f;
        if (f != 0) {
            n3 = 1;
        }
        final int d3 = brg.d(this.g, ((hashCode2 + d2) * 31 + n3) * 31, 31);
        int h = this.h ? 1 : 0;
        if (h != 0) {
            h = n2;
        }
        final String i = this.i;
        int hashCode3;
        if (i == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = i.hashCode();
        }
        final String j = this.j;
        int hashCode4;
        if (j == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = j.hashCode();
        }
        final int b = bj.b(this.n, brg.d(this.m, brg.d(this.l, brg.d(this.k, (((d3 + h) * 31 + hashCode3) * 31 + hashCode4) * 31, 31), 31), 31), 31);
        final int hashCode5 = this.o.hashCode();
        final sfv p = this.p;
        int hashCode6;
        if (p == null) {
            hashCode6 = n;
        }
        else {
            hashCode6 = p.hashCode();
        }
        return (hashCode5 + b) * 31 + hashCode6;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final Long c = this.c;
        final String d = this.d;
        final xor e = this.e;
        final boolean f = this.f;
        final String g = this.g;
        final boolean h = this.h;
        final String i = this.i;
        final String j = this.j;
        final String k = this.k;
        final String l = this.l;
        final String m = this.m;
        final qgv n = this.n;
        final jji o = this.o;
        final sfv p = this.p;
        final StringBuilder k2 = l58.k("NewsletterProfileModuleViewState(title=", a, ", description=", b, ", subscriberCount=");
        k2.append(c);
        k2.append(", coverImageUrl=");
        k2.append(d);
        k2.append(", subscriptionStatus=");
        k2.append(e);
        k2.append(", loading=");
        k2.append(f);
        k2.append(", profileUrl=");
        o6f.g(k2, g, ", showSubscription=", h, ", hintedEmail=");
        jba.s(k2, i, ", sampleIssueUrl=", j, ", tosUrl=");
        jba.s(k2, k, ", privacyPolicyUrl=", l, ", accountId=");
        k2.append(m);
        k2.append(", currentProfileOwner=");
        k2.append(n);
        k2.append(", newsletterSource=");
        k2.append(o);
        k2.append(", twitterScribeAssociation=");
        k2.append(p);
        k2.append(")");
        return k2.toString();
    }
}
