import com.twitter.util.user.UserIdentifier;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r8p
{
    public static final jca c;
    public static final SparseArray<String> d;
    public final UserIdentifier a;
    public final gvr b;
    
    static {
        c = (jca)hca.c("search", "universal", "", "query");
        final SparseArray d2 = new SparseArray();
        (d = d2).put(0, (Object)"search_filter_top");
        d2.put(1, (Object)"search_filter_tweets");
        d2.put(2, (Object)"search_filter_users");
        d2.put(3, (Object)"search_filter_images");
        d2.put(5, (Object)"search_filter_videos");
        d2.put(6, (Object)"search_filter_news");
        d2.put(12, (Object)"search_filter_periscopes");
    }
    
    public r8p(final UserIdentifier a, final gvr b) {
        this.a = a;
        this.b = b;
    }
    
    public static dda g(final sfv sfv, final String s, final String s2) {
        if (sfv != null) {
            return dda.g(h(((f0p)sfv).d, "tweet"), h(((f0p)sfv).e, ""), h(((f0p)sfv).f, "search_box"), s, s2);
        }
        return dda.g("tweet", "", "search_box", s, s2);
    }
    
    public static String h(String s, final String s2) {
        if (s.isEmpty()) {
            s = s2;
        }
        return s;
    }
    
    public final fg4 a(final sfv sfv, final String s, final String s2, final String t, final String s3, final long n) {
        final fg4 f = this.f(sfv, s, s2);
        if (flr.g((CharSequence)t)) {
            ((o1p)f).t = t;
            final int a = o5j.a;
            ((o1p)f).w = s3;
        }
        else if (flr.g((CharSequence)s3)) {
            ((o1p)f).w = s3;
            final int a2 = o5j.a;
        }
        if (n != 0L) {
            ((o1p)f).C = String.valueOf(n);
            final int a3 = o5j.a;
        }
        ((o1p)f).r = this.a;
        final int a4 = o5j.a;
        return f;
    }
    
    public final fg4 b(final String s) {
        return this.e("universal", "filter_sheet", s, "navigate");
    }
    
    public final fg4 c(final String s, final String s2) {
        return this.e("universal", "filter_sheet", s, s2);
    }
    
    public final fg4 d() {
        return new fg4(this.a);
    }
    
    public final fg4 e(final String s, final String s2, final String s3, final String s4) {
        final fg4 d = this.d();
        ((o1p)d).T = dda.g("search", s, s2, s3, s4).toString();
        final int a = o5j.a;
        return d;
    }
    
    public final fg4 f(final sfv sfv, final String s, final String s2) {
        final fg4 d = this.d();
        ((o1p)d).T = g(sfv, s, s2).toString();
        final int a = o5j.a;
        return d;
    }
    
    public final void i(final String s, final String s2) {
        sbw.b((tlm)this.c(s, s2));
    }
    
    public final void j(final qv qv) {
        final fg4 c = this.c("", "apply");
        if (qv != null) {
            final f7p$a f7p$a = new f7p$a();
            f7p$a.a = qv.a;
            f7p$a.e = qv.c;
            f7p$a.f = qv.d;
            f7p$a.g = qv.e;
            ((o1p)c).x = (f7p)((z4j)f7p$a).e();
            final int a = o5j.a;
        }
        sbw.b((tlm)c);
    }
    
    public final void k(final sfv sfv, final String s, final String s2, final String s3, final String s4, final int n, final long n2, final int n3, final String s5) {
        final fg4 a = this.a(sfv, s, s2, s3, s4, 0L);
        ((o1p)a).i((d1p)eg4.m(n2, s4, n3, n, s5));
        sbw.b((tlm)a);
    }
    
    public final void l(final sfv sfv, final String s, final String s2, final String s3, final String s4, final int n, final long n2, final String s5) {
        this.k(sfv, s, s2, s3, s4, n, n2, 12, s5);
    }
    
    public final void m(final sfv sfv, final String s, final String s2, final String s3, final String s4, final long n) {
        sbw.b((tlm)this.a(sfv, s, s2, s3, s4, n));
    }
    
    public final void n(final h6p h6p) {
        final int g = h6p.g;
        final String a = h6p.a;
        if (flr.e((CharSequence)a)) {
            return;
        }
        final String d = h6p.d;
        final int i = h6p.i;
        final long j = h6p.j;
        final sfv e = h6p.e;
        final String o = h6p.o;
        final long p = h6p.p;
        switch (g) {
            case 12: {
                this.l(e, "typeahead", "event_click", d, a, i, j, o);
                break;
            }
            case 11: {
                this.l(e, "follow_search", "search", d, a, i, j, o);
                break;
            }
            case 9: {
                this.m(e, "cluster", "search", d, a, p);
                break;
            }
            case 8: {
                this.l(e, "saved_search", "search", d, a, i, j, o);
                break;
            }
            case 7: {
                this.l(e, "typeahead", "search", d, a, i, j, o);
                break;
            }
            case 6: {
                this.k(e, "typeahead", "recent_search_click", d, a, i, j, 3, o);
                break;
            }
            case 5: {
                this.m(e, "recent", "search", d, a, p);
                break;
            }
            case 4: {
                this.m(e, "", "search", d, a, p);
                break;
            }
            case 3: {
                this.m(e, "user", "click", d, a, p);
                break;
            }
            case 2: {
                this.l(e, "typeahead", "profile_click", d, a, i, j, o);
                break;
            }
            case 1: {
                this.m(e, "go_to_user", "click", d, a, p);
                break;
            }
        }
    }
    
    public final void o(final String w, final String s, final String s2) {
        final fg4 e = this.e("search", "search_subscription", s, s2);
        final ufv$a ufv$a = new ufv$a();
        ufv$a.w = w;
        ((o1p)e).i((d1p)((z4j)ufv$a).e());
        sbw.b((tlm)e);
    }
    
    public final dda p(final sfv sfv, final String a, final x9p x9p, int a2, final int g, final int n) {
        final ufv ufv = new ufv();
        ufv.k = x9p.i;
        ufv.f = a2 + 1;
        if (g != -1) {
            ufv.g = g;
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid search action ");
                sb.append(n);
                fj1.h(sb.toString());
                break;
            }
            case 14: {
                ufv.b = x9p.c;
                ufv.c = 36;
                break;
            }
            case 13: {
                ufv.a = x9p.j;
                ufv.b = x9p.c;
                ufv.c = 11;
                break;
            }
            case 12: {
                ufv.b = x9p.c;
                ufv.c = 16;
                break;
            }
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11: {
                ufv.b = x9p.c;
                ufv.c = 12;
                break;
            }
            case 2:
            case 3:
            case 6: {
                final kjw g2 = x9p.g;
                vmw.g((Object)g2);
                ufv.a = g2.a;
                ufv.c = 3;
                if (!(x9p instanceof ljw)) {
                    break;
                }
                final dmv k = ((ljw)x9p).k;
                if (k != null) {
                    ufv.v1 = k.a().name().toLowerCase(g6s.d());
                    break;
                }
                break;
            }
            case 1: {
                ufv.b = x9p.c;
                ufv.c = 3;
                break;
            }
        }
        final dda g3 = g(sfv, "typeahead", "click");
        final fg4 d = this.d();
        ((o1p)d).T = g3.toString();
        a2 = o5j.a;
        ((o1p)d).i((d1p)ufv);
        ((o1p)d).k((d1p)ufv);
        final f7p$a f7p$a = new f7p$a();
        f7p$a.a = a;
        ((o1p)d).x = (f7p)((z4j)f7p$a).e();
        sbw.b((tlm)d);
        return g3;
    }
}
