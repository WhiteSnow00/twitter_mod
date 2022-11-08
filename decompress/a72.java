import android.app.Activity;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a72
{
    public final gob a;
    public final mbi<?> b;
    public final egd c;
    public final cl0 d;
    public final xau e;
    public final pba<z42> f;
    
    public a72(final gob a, final mbi<?> b, final egd c, final cl0 d, final xau e, final pba<z42> f) {
        zzd.f((Object)b, "navigator");
        zzd.f((Object)c, "inAppMessageManager");
        zzd.f((Object)d, "appConfig");
        zzd.f((Object)e, "preferences");
        zzd.f((Object)f, "bookmarkEventDispatcher");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final nfd$c a() {
        this.d.t();
        return (nfd$c)nfd$c$b.b;
    }
    
    public final void b(final z42 z42) {
        final d5s$a d5s$a = new d5s$a();
        this.a();
        d5s$a.e = (nfd$c)nfd$c$b.b;
        if (z42 instanceof z42.b) {
            d5s$a.s(2131952239);
            d5s$a.q(32);
            d5s$a.r("bookmark_added");
            d5s$a.o(2131951864, (View$OnClickListener)new o0p((Object)z42, (Object)this, 5));
        }
        else if (z42 instanceof z42.d) {
            d5s$a.s(2131959160);
            d5s$a.q(41);
            d5s$a.r("already_bookmarked");
            d5s$a.o(2131951864, (View$OnClickListener)new mhp((Object)this, (Object)z42, 8));
        }
        else if (z42 instanceof z42.g) {
            d5s$a.s(2131959188);
            d5s$a.q(41);
            d5s$a.r("bookmark_removed");
        }
        else if (z42 instanceof z42.c) {
            final fba.e a = fba.e.a;
            final nca b = fba.e.b;
            lux.j(b);
            final String string = ((Context)this.a).getString(2131957387, new Object[] { ((z42.c)z42).a });
            zzd.e((Object)string, "activity.getString(R.string.saved_to, event.name)");
            d5s$a.t(string);
            d5s$a.e = (nfd$c)nfd$c$c.b;
            d5s$a.q(32);
            d5s$a.r(b.d);
        }
        else if (z42 instanceof z42.h) {
            final fba.e a2 = fba.e.a;
            final nca c = fba.e.c;
            lux.j(c);
            final String string2 = ((Context)this.a).getString(2131957001, new Object[] { ((z42.h)z42).a });
            zzd.e((Object)string2, "activity.getString(R.str\u2026removed_from, event.name)");
            d5s$a.t(string2);
            d5s$a.e = (nfd$c)nfd$c$c.b;
            d5s$a.q(41);
            d5s$a.r(c.d);
        }
        else if (z42 instanceof z42.f) {
            final fba a3 = fba.a;
            final nca d = fba.d;
            lux.j(d);
            d5s$a.t(((z42.f)z42).a);
            d5s$a.q(31);
            d5s$a.r(d.d);
        }
        final b5j ofType = this.c.a((zfd)((h4j)d5s$a).e()).a().ofType((Class)bgd$b.class);
        zzd.b((Object)ofType, "ofType(R::class.java)");
        final m29 m29;
        m29.c(ofType.doOnComplete((rj)new rj() {
            public final /* synthetic */ m29 C0 = m29 = new m29();
            
            public final void run() {
                this.C0.a();
            }
        }).subscribe((fk6)new fk6((rtb)new rtb<bgd$b, oyv>() {
            public final /* synthetic */ a72 D0;
            
            public final Object invoke(final Object o) {
                final bgd$b bgd$b = (bgd$b)o;
                final z42 c0 = z42;
                if ((c0 instanceof z42.c && ((z42.c)c0).c) || (c0 instanceof z42.h && ((z42.h)c0).c)) {
                    ((Activity)this.D0.a).finish();
                }
                return oyv.a;
            }
        })));
        this.f.e((Object)z42);
    }
}
