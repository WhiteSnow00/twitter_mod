import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xw4
{
    public static final b Companion;
    public static final alp<xw4> s;
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
        xw4.s = xw4.xw4$a.b;
    }
    
    public xw4() {
        this(null, null, null, null, null, null, null, null, null, null, 262143);
    }
    
    public xw4(final Long a, final Long b, final Boolean c, final Integer d, final String e, final String f, final Boolean g, final String h, final String i, final Integer j, final Integer k, final String l, final String m, final String n, final String o, final String p18, final String q, final String r) {
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
    
    public static xw4 a(final xw4 xw4, Long b, Boolean c, Integer d, String e, Boolean g, String m, String n, String o, final int n2) {
        String r = null;
        Long a;
        if ((n2 & 0x1) != 0x0) {
            a = xw4.a;
        }
        else {
            a = null;
        }
        if ((n2 & 0x2) != 0x0) {
            b = xw4.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = xw4.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = xw4.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = xw4.e;
        }
        String f;
        if ((n2 & 0x20) != 0x0) {
            f = xw4.f;
        }
        else {
            f = null;
        }
        if ((n2 & 0x40) != 0x0) {
            g = xw4.g;
        }
        String h;
        if ((n2 & 0x80) != 0x0) {
            h = xw4.h;
        }
        else {
            h = null;
        }
        String i;
        if ((n2 & 0x100) != 0x0) {
            i = xw4.i;
        }
        else {
            i = null;
        }
        Integer j;
        if ((n2 & 0x200) != 0x0) {
            j = xw4.j;
        }
        else {
            j = null;
        }
        Integer k;
        if ((n2 & 0x400) != 0x0) {
            k = xw4.k;
        }
        else {
            k = null;
        }
        String l;
        if ((n2 & 0x800) != 0x0) {
            l = xw4.l;
        }
        else {
            l = null;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = xw4.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = xw4.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = xw4.o;
        }
        String p10;
        if ((0x8000 & n2) != 0x0) {
            p10 = xw4.p;
        }
        else {
            p10 = null;
        }
        String q;
        if ((0x10000 & n2) != 0x0) {
            q = xw4.q;
        }
        else {
            q = null;
        }
        if ((n2 & 0x20000) != 0x0) {
            r = xw4.r;
        }
        Objects.requireNonNull(xw4);
        return new xw4(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p10, q, r);
    }
    
    public static final alp<xw4> b() {
        Objects.requireNonNull(xw4.Companion);
        return (alp<xw4>)xw4.s;
    }
    
    public final boolean c() {
        final Long a = this.a;
        final boolean b = false;
        final List v0 = tdy.v0(new Object[] { a, this.b, this.d, this.e, this.c, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r });
        boolean b2;
        if (v0.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator iterator = v0.iterator();
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
    
    public final void d(final tfe tfe) throws IOException {
        tfe.i("commerce_details");
        tfe.r0();
        final Long a = this.a;
        if (a != null) {
            tfe.W("profile_id", a.longValue());
        }
        final Long b = this.b;
        if (b != null) {
            tfe.W("merchant_id", b.longValue());
        }
        final Integer d = this.d;
        if (d != null) {
            tfe.T("product_index", d.intValue());
        }
        final String e = this.e;
        if (e != null) {
            tfe.u0("product_key", e);
        }
        final Boolean c = this.c;
        if (c != null) {
            tfe.e("is_viewer_follows_user", c);
        }
        final String f = this.f;
        if (f != null) {
            tfe.u0("drop_id", f);
        }
        final Boolean g = this.g;
        if (g != null) {
            tfe.e("has_dropped", g);
        }
        final String h = this.h;
        if (h != null) {
            tfe.u0("product_details_context", h);
        }
        final String i = this.i;
        if (i != null) {
            tfe.u0("drop_hashtag", i);
        }
        final Integer j = this.j;
        if (j != null) {
            tfe.T("seconds_until_drop", j.intValue());
        }
        final Integer k = this.k;
        if (k != null) {
            tfe.T("sheet_height_index", k.intValue());
        }
        final String l = this.l;
        if (l != null) {
            tfe.u0("web_view_context", l);
        }
        final String m = this.m;
        if (m != null) {
            tfe.u0("error_code", m);
        }
        final String n = this.n;
        if (n != null) {
            tfe.u0("error_type", n);
        }
        final String o = this.o;
        if (o != null) {
            tfe.u0("shop_v2_id", o);
        }
        final String p = this.p;
        if (p != null) {
            tfe.u0("shop_context", p);
        }
        final String q = this.q;
        if (q != null) {
            tfe.u0("context", q);
        }
        final String r = this.r;
        if (r != null) {
            tfe.u0("card_style", r);
        }
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xw4)) {
            return false;
        }
        final xw4 xw4 = (xw4)o;
        return zzd.a((Object)this.a, (Object)xw4.a) && zzd.a((Object)this.b, (Object)xw4.b) && zzd.a((Object)this.c, (Object)xw4.c) && zzd.a((Object)this.d, (Object)xw4.d) && zzd.a((Object)this.e, (Object)xw4.e) && zzd.a((Object)this.f, (Object)xw4.f) && zzd.a((Object)this.g, (Object)xw4.g) && zzd.a((Object)this.h, (Object)xw4.h) && zzd.a((Object)this.i, (Object)xw4.i) && zzd.a((Object)this.j, (Object)xw4.j) && zzd.a((Object)this.k, (Object)xw4.k) && zzd.a((Object)this.l, (Object)xw4.l) && zzd.a((Object)this.m, (Object)xw4.m) && zzd.a((Object)this.n, (Object)xw4.n) && zzd.a((Object)this.o, (Object)xw4.o) && zzd.a((Object)this.p, (Object)xw4.p) && zzd.a((Object)this.q, (Object)xw4.q) && zzd.a((Object)this.r, (Object)xw4.r);
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
        mag.m(sb, e, ", dropId=", f, ", hasDropped=");
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
        mag.m(sb, m, ", errorType=", n, ", shopId=");
        mag.m(sb, o, ", shopContext=", p, ", context=");
        return hi.J(sb, q, ", cardStyle=", r, ")");
    }
    
    public static final class b
    {
    }
}
