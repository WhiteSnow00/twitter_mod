import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yv4
{
    public static final b Companion;
    public static final rlp<yv4> s;
    public final Long a;
    public final Long b;
    public final Boolean c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Integer k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    
    static {
        Companion = new b();
        yv4.s = yv4.yv4$a.b;
    }
    
    public yv4() {
        this(null, null, null, null, null, null, null, null, null, null, 262143);
    }
    
    public yv4(final Long a, final Long b, final Boolean c, final Integer d, final String e, final String f, final Boolean g, final String h, final String i, final Integer j, final Integer k, final String l, final String m, final String n, final String o, final String p18, final String q, final String r) {
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
        this.q = q;
        this.r = r;
    }
    
    public yv4(Long n, Long n2, Boolean b, Integer n3, String s, String s2, String s3, String s4, String s5, String s6, final int n4) {
        if ((n4 & 0x1) != 0x0) {
            n = null;
        }
        if ((n4 & 0x2) != 0x0) {
            n2 = null;
        }
        if ((n4 & 0x4) != 0x0) {
            b = null;
        }
        if ((n4 & 0x8) != 0x0) {
            n3 = null;
        }
        if ((n4 & 0x10) != 0x0) {
            s = null;
        }
        if ((n4 & 0x20) != 0x0) {
            s2 = null;
        }
        if ((n4 & 0x4000) != 0x0) {
            s3 = null;
        }
        if ((0x8000 & n4) != 0x0) {
            s4 = null;
        }
        if ((0x10000 & n4) != 0x0) {
            s5 = null;
        }
        if ((n4 & 0x20000) != 0x0) {
            s6 = null;
        }
        this(n, n2, b, n3, s, s2, null, null, null, null, null, null, null, null, s3, s4, s5, s6);
    }
    
    public static yv4 a(final yv4 yv4, Long b, Boolean c, Integer d, String e, Boolean g, String m, String n, String o, final int n2) {
        String r = null;
        Long a;
        if ((n2 & 0x1) != 0x0) {
            a = yv4.a;
        }
        else {
            a = null;
        }
        if ((n2 & 0x2) != 0x0) {
            b = yv4.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = yv4.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = yv4.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = yv4.e;
        }
        String f;
        if ((n2 & 0x20) != 0x0) {
            f = yv4.f;
        }
        else {
            f = null;
        }
        if ((n2 & 0x40) != 0x0) {
            g = yv4.g;
        }
        String h;
        if ((n2 & 0x80) != 0x0) {
            h = yv4.h;
        }
        else {
            h = null;
        }
        String i;
        if ((n2 & 0x100) != 0x0) {
            i = yv4.i;
        }
        else {
            i = null;
        }
        Integer j;
        if ((n2 & 0x200) != 0x0) {
            j = yv4.j;
        }
        else {
            j = null;
        }
        Integer k;
        if ((n2 & 0x400) != 0x0) {
            k = yv4.k;
        }
        else {
            k = null;
        }
        String l;
        if ((n2 & 0x800) != 0x0) {
            l = yv4.l;
        }
        else {
            l = null;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = yv4.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = yv4.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = yv4.o;
        }
        String p10;
        if ((0x8000 & n2) != 0x0) {
            p10 = yv4.p;
        }
        else {
            p10 = null;
        }
        String q;
        if ((0x10000 & n2) != 0x0) {
            q = yv4.q;
        }
        else {
            q = null;
        }
        if ((n2 & 0x20000) != 0x0) {
            r = yv4.r;
        }
        Objects.requireNonNull(yv4);
        return new yv4(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p10, q, r);
    }
    
    public static final rlp<yv4> b() {
        Objects.requireNonNull(yv4.Companion);
        return (rlp<yv4>)yv4.s;
    }
    
    public final boolean c() {
        final Long a = this.a;
        final boolean b = false;
        final List s = s9i.s(a, this.b, this.d, this.e, this.c, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        boolean b2;
        if (s.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator iterator = s.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (iterator.next() == null);
            b2 = true;
        }
        return b2;
    }
    
    public final void d(final afe afe) throws IOException {
        afe.i("commerce_details");
        afe.q0();
        final Long a = this.a;
        if (a != null) {
            afe.V("profile_id", a.longValue());
        }
        final Long b = this.b;
        if (b != null) {
            afe.V("merchant_id", b.longValue());
        }
        final Integer d = this.d;
        if (d != null) {
            afe.T("product_index", d.intValue());
        }
        final String e = this.e;
        if (e != null) {
            afe.t0("product_key", e);
        }
        final Boolean c = this.c;
        if (c != null) {
            afe.e("is_viewer_follows_user", (boolean)c);
        }
        final String f = this.f;
        if (f != null) {
            afe.t0("drop_id", f);
        }
        final Boolean g = this.g;
        if (g != null) {
            afe.e("has_dropped", (boolean)g);
        }
        final String h = this.h;
        if (h != null) {
            afe.t0("product_details_context", h);
        }
        final String i = this.i;
        if (i != null) {
            afe.t0("drop_hashtag", i);
        }
        final Integer j = this.j;
        if (j != null) {
            afe.T("seconds_until_drop", j.intValue());
        }
        final Integer k = this.k;
        if (k != null) {
            afe.T("sheet_height_index", k.intValue());
        }
        final String l = this.l;
        if (l != null) {
            afe.t0("web_view_context", l);
        }
        final String m = this.m;
        if (m != null) {
            afe.t0("error_code", m);
        }
        final String n = this.n;
        if (n != null) {
            afe.t0("error_type", n);
        }
        final String o = this.o;
        if (o != null) {
            afe.t0("shop_v2_id", o);
        }
        final String p = this.p;
        if (p != null) {
            afe.t0("shop_context", p);
        }
        final String q = this.q;
        if (q != null) {
            afe.t0("context", q);
        }
        final String r = this.r;
        if (r != null) {
            afe.t0("card_style", r);
        }
        afe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yv4)) {
            return false;
        }
        final yv4 yv4 = (yv4)o;
        return czd.a((Object)this.a, (Object)yv4.a) && czd.a((Object)this.b, (Object)yv4.b) && czd.a((Object)this.c, (Object)yv4.c) && czd.a((Object)this.d, (Object)yv4.d) && czd.a((Object)this.e, (Object)yv4.e) && czd.a((Object)this.f, (Object)yv4.f) && czd.a((Object)this.g, (Object)yv4.g) && czd.a((Object)this.h, (Object)yv4.h) && czd.a((Object)this.i, (Object)yv4.i) && czd.a((Object)this.j, (Object)yv4.j) && czd.a((Object)this.k, (Object)yv4.k) && czd.a((Object)this.l, (Object)yv4.l) && czd.a((Object)this.m, (Object)yv4.m) && czd.a((Object)this.n, (Object)yv4.n) && czd.a((Object)this.o, (Object)yv4.o) && czd.a((Object)this.p, (Object)yv4.p) && czd.a((Object)this.q, (Object)yv4.q) && czd.a((Object)this.r, (Object)yv4.r);
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
        final Long b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
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
        final String e = this.e;
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
        final Boolean g = this.g;
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
        final Integer k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final String l = this.l;
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
        final String o = this.o;
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
        if (r != null) {
            hashCode = r.hashCode();
        }
        return ((((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Long a = this.a;
        final Long b = this.b;
        final Boolean c = this.c;
        final Integer d = this.d;
        final String e = this.e;
        final String f = this.f;
        final Boolean g = this.g;
        final String h = this.h;
        final String i = this.i;
        final Integer j = this.j;
        final Integer k = this.k;
        final String l = this.l;
        final String m = this.m;
        final String n = this.n;
        final String o = this.o;
        final String p = this.p;
        final String q = this.q;
        final String r = this.r;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommerceScribeDetails(profileId=");
        sb.append(a);
        sb.append(", merchantId=");
        sb.append(b);
        sb.append(", isViewerFollowsUser=");
        sb.append(c);
        sb.append(", productIndex=");
        sb.append(d);
        sb.append(", productKey=");
        nb0.z(sb, e, ", dropId=", f, ", hasDropped=");
        sb.append(g);
        sb.append(", productDetailsContext=");
        sb.append(h);
        sb.append(", dropHashtag=");
        sb.append(i);
        sb.append(", secondsUntilDrop=");
        sb.append(j);
        sb.append(", sheetHeightIndex=");
        sb.append(k);
        sb.append(", webViewContext=");
        sb.append(l);
        sb.append(", errorCode=");
        nb0.z(sb, m, ", errorType=", n, ", shopId=");
        nb0.z(sb, o, ", shopContext=", p, ", context=");
        return mb0.C(sb, q, ", cardStyle=", r, ")");
    }
    
    public static final class b
    {
    }
}
