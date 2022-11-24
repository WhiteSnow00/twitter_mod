import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fki implements ccx
{
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final xor g;
    public final boolean h;
    public final String i;
    public final String j;
    public final boolean k;
    public final qgv l;
    public final jji m;
    public final sfv n;
    
    public fki(final boolean a, final String b, final String c, final String d, final String e, final String f, final xor g, final boolean h, final String i, final String j, final boolean k, final qgv l, final jji m, final sfv n) {
        e0e.f((Object)d, "revueTosUrl");
        e0e.f((Object)e, "revuePrivacyPolicyUrl");
        e0e.f((Object)f, "email");
        e0e.f((Object)g, "subscriptionState");
        e0e.f((Object)i, "revueProfileUrl");
        e0e.f((Object)j, "accountId");
        e0e.f((Object)l, "currentProfileOwner");
        e0e.f((Object)m, "newsletterSource");
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
    }
    
    public static fki l(final fki fki, xor g, boolean h, boolean k, final int n) {
        final boolean b = (n & 0x1) != 0x0 && fki.a;
        String b2;
        if ((n & 0x2) != 0x0) {
            b2 = fki.b;
        }
        else {
            b2 = null;
        }
        String c;
        if ((n & 0x4) != 0x0) {
            c = fki.c;
        }
        else {
            c = null;
        }
        String d;
        if ((n & 0x8) != 0x0) {
            d = fki.d;
        }
        else {
            d = null;
        }
        String e;
        if ((n & 0x10) != 0x0) {
            e = fki.e;
        }
        else {
            e = null;
        }
        String f;
        if ((n & 0x20) != 0x0) {
            f = fki.f;
        }
        else {
            f = null;
        }
        if ((n & 0x40) != 0x0) {
            g = fki.g;
        }
        if ((n & 0x80) != 0x0) {
            h = fki.h;
        }
        String i;
        if ((n & 0x100) != 0x0) {
            i = fki.i;
        }
        else {
            i = null;
        }
        String j;
        if ((n & 0x200) != 0x0) {
            j = fki.j;
        }
        else {
            j = null;
        }
        if ((n & 0x400) != 0x0) {
            k = fki.k;
        }
        qgv l;
        if ((n & 0x800) != 0x0) {
            l = fki.l;
        }
        else {
            l = null;
        }
        jji m;
        if ((n & 0x1000) != 0x0) {
            m = fki.m;
        }
        else {
            m = null;
        }
        sfv n2;
        if ((n & 0x2000) != 0x0) {
            n2 = fki.n;
        }
        else {
            n2 = null;
        }
        Objects.requireNonNull(fki);
        e0e.f((Object)d, "revueTosUrl");
        e0e.f((Object)e, "revuePrivacyPolicyUrl");
        e0e.f((Object)f, "email");
        e0e.f((Object)g, "subscriptionState");
        e0e.f((Object)i, "revueProfileUrl");
        e0e.f((Object)j, "accountId");
        e0e.f((Object)l, "currentProfileOwner");
        e0e.f((Object)m, "newsletterSource");
        return new fki(b, b2, c, d, e, f, g, h, i, j, k, l, m, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fki)) {
            return false;
        }
        final fki fki = (fki)o;
        return this.a == fki.a && e0e.a((Object)this.b, (Object)fki.b) && e0e.a((Object)this.c, (Object)fki.c) && e0e.a((Object)this.d, (Object)fki.d) && e0e.a((Object)this.e, (Object)fki.e) && e0e.a((Object)this.f, (Object)fki.f) && e0e.a((Object)this.g, (Object)fki.g) && this.h == fki.h && e0e.a((Object)this.i, (Object)fki.i) && e0e.a((Object)this.j, (Object)fki.j) && this.k == fki.k && e0e.a((Object)this.l, (Object)fki.l) && this.m == fki.m && e0e.a((Object)this.n, (Object)fki.n);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final String b = this.b;
        final int n3 = 0;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final int d = brg.d(this.f, brg.d(this.e, brg.d(this.d, ((n2 * 31 + hashCode) * 31 + hashCode2) * 31, 31), 31), 31);
        final int hashCode3 = this.g.hashCode();
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final int d2 = brg.d(this.j, brg.d(this.i, ((hashCode3 + d) * 31 + h) * 31, 31), 31);
        int k = this.k ? 1 : 0;
        if (k != 0) {
            k = n;
        }
        final int b2 = bj.b(this.l, (d2 + k) * 31, 31);
        final int hashCode4 = this.m.hashCode();
        final sfv n4 = this.n;
        int hashCode5;
        if (n4 == null) {
            hashCode5 = n3;
        }
        else {
            hashCode5 = n4.hashCode();
        }
        return (hashCode4 + b2) * 31 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final xor g = this.g;
        final boolean h = this.h;
        final String i = this.i;
        final String j = this.j;
        final boolean k = this.k;
        final qgv l = this.l;
        final jji m = this.m;
        final sfv n = this.n;
        final StringBuilder b2 = va.B("NewsletterSubscribeSheetViewState(subscribed=", a, ", title=", b, ", sampleIssueUrl=");
        jba.s(b2, c, ", revueTosUrl=", d, ", revuePrivacyPolicyUrl=");
        jba.s(b2, e, ", email=", f, ", subscriptionState=");
        b2.append(g);
        b2.append(", loading=");
        b2.append(h);
        b2.append(", revueProfileUrl=");
        jba.s(b2, i, ", accountId=", j, ", hasError=");
        b2.append(k);
        b2.append(", currentProfileOwner=");
        b2.append(l);
        b2.append(", newsletterSource=");
        b2.append(m);
        b2.append(", twitterScribeAssociation=");
        b2.append(n);
        b2.append(")");
        return b2.toString();
    }
}
