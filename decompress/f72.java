import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f72
{
    public final dob a;
    public final fci<?> b;
    public final igd c;
    public final xk0 d;
    public final gcu e;
    public final fca<d52> f;
    
    public f72(final dob a, final fci<?> b, final igd c, final xk0 d, final gcu e, final fca<d52> f) {
        e0e.f((Object)b, "navigator");
        e0e.f((Object)c, "inAppMessageManager");
        e0e.f((Object)d, "appConfig");
        e0e.f((Object)e, "preferences");
        e0e.f((Object)f, "bookmarkEventDispatcher");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final rfd$c a() {
        this.d.t();
        return (rfd$c)rfd$c$b.b;
    }
    
    public final void b(final d52 d52) {
        final q6s$a q6s$a = new q6s$a();
        this.a();
        q6s$a.e = (rfd$c)rfd$c$b.b;
        if (d52 instanceof d52$b) {
            q6s$a.s(2131952238);
            q6s$a.q(32);
            q6s$a.r("bookmark_added");
            q6s$a.o(2131951864, (View$OnClickListener)new v8w((Object)d52, (Object)this, 6));
        }
        else if (d52 instanceof d52$d) {
            q6s$a.s(2131959162);
            q6s$a.q(41);
            q6s$a.r("already_bookmarked");
            q6s$a.o(2131951864, (View$OnClickListener)new npa((Object)this, (Object)d52, 4));
        }
        else if (d52 instanceof d52$g) {
            q6s$a.s(2131959190);
            q6s$a.q(41);
            q6s$a.r("bookmark_removed");
        }
        else if (d52 instanceof d52$c) {
            final vba$e a = vba$e.a;
            final dda b = vba$e.b;
            cmi.g(b);
            final String string = ((Context)this.a).getString(2131957387, new Object[] { ((d52$c)d52).a });
            e0e.e((Object)string, "activity.getString(R.string.saved_to, event.name)");
            q6s$a.t(string);
            q6s$a.e = (rfd$c)rfd$c$c.b;
            q6s$a.q(32);
            q6s$a.r(b.d);
        }
        else if (d52 instanceof d52$h) {
            final vba$e a2 = vba$e.a;
            final dda c = vba$e.c;
            cmi.g(c);
            final String string2 = ((Context)this.a).getString(2131957001, new Object[] { ((d52$h)d52).a });
            e0e.e((Object)string2, "activity.getString(R.str\u2026removed_from, event.name)");
            q6s$a.t(string2);
            q6s$a.e = (rfd$c)rfd$c$c.b;
            q6s$a.q(41);
            q6s$a.r(c.d);
        }
        else if (d52 instanceof d52$f) {
            final vba a3 = vba.a;
            final dda d53 = vba.d;
            cmi.g(d53);
            q6s$a.t(((d52$f)d52).a);
            q6s$a.q(31);
            q6s$a.r(d53.d);
        }
        final t5j ofType = this.c.a((dgd)((z4j)q6s$a).e()).a().ofType((Class)fgd$b.class);
        e0e.b((Object)ofType, "ofType(R::class.java)");
        final e39 e39;
        e39.c(ofType.doOnComplete((sj)new f72$a(e39 = new e39())).subscribe((rk6)new f$r((stb)new f72$b(d52, this))));
        this.f.e((Object)d52);
    }
}
