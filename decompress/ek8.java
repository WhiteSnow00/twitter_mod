import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.util.Collections;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ek8 implements n8p
{
    public final Activity a;
    public final a6p b;
    public final f7p c;
    public final n5p d;
    public final mbi<?> e;
    
    public ek8(final Activity a, final a6p b, final f7p c, final n5p d, final mbi<?> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final String s, final int n, final jev jev, final String s2, final long n2, final String s3, final Map<String, String> map) {
        final t4p$a t4p$a = new t4p$a(s);
        ((dj1.a)t4p$a).a.setAction("com.twitter.android.action.SEARCH");
        ((dj1.a)t4p$a).a.putExtra("user_query", s);
        t4p$a.r(s);
        t4p$a.s(s2);
        ((dj1.a)t4p$a).a.putExtra("profileID", n2);
        yvj.c(((dj1.a)t4p$a).a, "source_association", (Object)jev, (alp)jev.i);
        ((dj1.a)t4p$a).a.putExtra("configurationName", s3);
        t4p$a.q((Map)map);
        if (n != -1) {
            t4p$a.t(n);
        }
        this.b.a((t4p)((h4j)t4p$a).e());
    }
    
    @Override
    public final void b(final l8p l8p, final int n, final int n2, final String s, final jev jev) {
        final t4p d = this.d(l8p, n, -1, s, jev, null, null, Collections.emptyMap());
        this.e(l8p, d, this.c.p(jev, l8p.b, l8p, n, n2, d.g));
    }
    
    @Override
    public final void c(final l8p l8p, final int n, final int n2, final String s, final jev jev, final String s2, final Map<String, String> map) {
        final t4p d = this.d(l8p, n, n2, s, jev, "typeahead_click", s2, map);
        this.e(l8p, d, this.c.p(jev, l8p.b, l8p, n, -1, d.g));
    }
    
    public final t4p d(final l8p l8p, int ordinal, final int n, String lowerCase, final jev jev, final String s, final String s2, final Map<String, String> map) {
        final t4p$a t4p$a = new t4p$a(l8p.c);
        ((dj1.a)t4p$a).a.setAction(l8p.d);
        t4p$a.r(l8p.e);
        ((dj1.a)t4p$a).a.putExtra("user_query", lowerCase);
        t4p$a.s(s);
        ((dj1.a)t4p$a).a.putExtra("search_suggestion_position", ordinal);
        yvj.c(((dj1.a)t4p$a).a, "source_association", (Object)jev, (alp)jev.i);
        ((dj1.a)t4p$a).a.putExtra("configurationName", s2);
        t4p$a.q((Map)map);
        final ciw g = l8p.g;
        if (g != null) {
            final long a = g.a;
            if (a > 0L) {
                ((dj1.a)t4p$a).a.putExtra("search_suggestion_id", a);
            }
        }
        if (l8p instanceof diw) {
            final ukv k = ((diw)l8p).k;
            if (k != null) {
                lowerCase = k.a().name().toLowerCase(t4s.d());
                ((dj1.a)t4p$a).a.putExtra("resultContextType", lowerCase);
            }
        }
        ordinal = ((Enum)l8p.a).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    t4p$a.s("save_search");
                }
            }
            else {
                t4p$a.t(2);
            }
        }
        else {
            t4p$a.r((String)null);
        }
        if (n != -1) {
            t4p$a.t(n);
        }
        return (t4p)((h4j)t4p$a).e();
    }
    
    public final void e(final l8p l8p, final t4p t4p, final nca nca) {
        final int g = t4p.g;
        if (g != 1 && g != 2 && g != 3 && g != 6) {
            switch (g) {
                case 14: {
                    pf8.r(l8p.h);
                    final dqt h = l8p.h;
                    if (h != null) {
                        final mev$a mev$a = new mev$a();
                        final String a = h.a;
                        mev$a.a = a;
                        mev$a.b = a;
                        mev$a.g = Long.parseLong(h.b);
                        mev$a.n = h;
                        iz5.k((rj)new isf((Object)this, (Object)((h4j)mev$a).e(), 9)).t(yvo.c()).p();
                    }
                    final String b = l8p.h.b;
                    pf8.q(b);
                    final kyv$a kyv$a = new kyv$a();
                    ((pq1$a)kyv$a).q(b);
                    ((rq1$a)kyv$a).r(nca);
                    this.e.d((zm)((h4j)kyv$a).e());
                    return;
                }
                case 13: {
                    final String o = ((sq3)l8p).k.o;
                    if (pjr.g((CharSequence)o)) {
                        c7f.a().c((Context)this.a, o, null, UserIdentifier.getCurrent(), null);
                    }
                    return;
                }
                case 12: {
                    final wca wca = (wca)l8p;
                    if (pjr.g((CharSequence)wca.k.o)) {
                        c7f.a().c((Context)this.a, wca.k.o, null, UserIdentifier.getCurrent(), null);
                        return;
                    }
                    break;
                }
            }
            if (!l8p.a(l8p)) {
                this.b.a(t4p);
            }
        }
        else {
            this.c.n(t4p);
            final ciw g2 = l8p.g;
            if (g2 != null) {
                final mev$a mev$a2 = new mev$a();
                mev$a2.a = g2.c;
                mev$a2.b = g2.b;
                mev$a2.g = g2.a;
                mev$a2.m = g2;
                iz5.k((rj)new ej7((Object)this, (Object)((h4j)mev$a2).e(), 5)).t(yvo.c()).p();
            }
            final mbi<?> e = this.e;
            final c7l$a c7l$a = new c7l$a();
            c7l$a.c = t4p.a;
            c7l$a.a = t4p.e;
            e.d((zm)((h4j)c7l$a).e());
        }
    }
}
