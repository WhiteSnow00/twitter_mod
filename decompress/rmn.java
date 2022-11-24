import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import tv.periscope.android.api.ApiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmn implements kac
{
    public final Context a;
    public final aba b;
    public to2 c;
    public final o93 d;
    public final byc e;
    public final mk2 f;
    public final vo2 g;
    public final u0d h;
    public final v0d i;
    public final ApiManager j;
    public final ra3 k;
    public final eve l;
    public final de6 m;
    public final znl<List<mac>> n;
    
    public rmn(final Context a, final aba b, final to2 c, final o93 d, final byc e, final kcm kcm, final mk2 f, final vo2 g, final u0d h, final v0d i, final yio yio, final ApiManager j, final ra3 k, final eve l) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "eventBus");
        e0e.f((Object)c, "broadcasterGuestServiceManager");
        e0e.f((Object)d, "callInParams");
        e0e.f((Object)e, "guestStatusCache");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)f, "broadcastLogger");
        e0e.f((Object)g, "guestSessionStateResolver");
        e0e.f((Object)h, "hydraUserActionStateLock");
        e0e.f((Object)i, "hydraUserInfoRepository");
        e0e.f((Object)yio, "muteUserEventDispatcher");
        e0e.f((Object)j, "apiManager");
        e0e.f((Object)k, "callerGuestServiceManager");
        e0e.f((Object)l, "lastSessionRepository");
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
        final de6 m = new de6();
        this.m = m;
        this.n = (znl<List<mac>>)new znl();
        kcm.i((sj)new m0p(((t5j)yio.a).subscribe((rk6)new b6l((stb)new wmn(this), 11)), 17));
        kcm.i((sj)new lv1(m, 6));
        kcm.i((sj)new p00((Object)this, 26));
    }
    
    public static final void b(final rmn rmn) {
        for (final String s : rmn.c.C()) {
            rmn.s(s);
            rmn.c.y(s);
        }
    }
    
    public static final void p(final rmn rmn) {
        Objects.requireNonNull(rmn);
        final z8g a = z8g$a.a;
        final mk2 f = rmn.f;
        a.a.remove((Object)((aya)f).a.a, (Object)f);
        t8g.a.compareAndSet(rmn.f, null);
        rmn.f.g();
    }
    
    public final t5j<List<mac>> a() {
        return (t5j<List<mac>>)this.n;
    }
    
    public final b39 q(final String s) {
        final ocj subscribeWith = this.c.B(s).map((rtb)new t3i((stb)new rmn$a(this), 19)).doOnNext((rk6)new ppl((stb)new rmn$b(this), 13)).subscribeWith((ocj)new ko1());
        e0e.e((Object)subscribeWith, "private fun getPollingGu\u2026t<GuestSession>>())\n    }");
        return (b39)subscribeWith;
    }
    
    public final void r() {
        final mk2 f = this.f;
        final y9q y9q = (y9q)z8g$a.a.a.put((Object)((aya)f).a.a, (Object)f);
        t8g.a.set(f);
        f.i("==================================================", false);
        final String b = lv8.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("Android OS Version: ");
        sb.append(b);
        f.i(sb.toString(), false);
        final String c = lv8.c;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Model Info: ");
        sb2.append(c);
        f.i(sb2.toString(), false);
        final String a = qnw.a(this.a);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("App Version: ");
        sb3.append(a);
        f.i(sb3.toString(), false);
        final float a2 = lv8.a(this.a);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Battery Level: ");
        sb4.append(a2);
        f.i(sb4.toString(), false);
        this.c.i((y9q)f);
    }
    
    public final void s(final String s) {
        final int ordinal = ((Enum)this.e.f(s)).ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal == 10) {
                final byc e = this.e;
                final byc$h s2 = byc$h.S0;
                final long k = v7q.k();
                final TimeUnit seconds = TimeUnit.SECONDS;
                Objects.requireNonNull(this.d);
                e.e(s, new byc$j(s2, Long.valueOf(seconds.toMillis(6L) + k), (String)null, (Long)null, Boolean.FALSE, (String)null, (String)null, 2, (lb0)null));
                this.e.a(s);
            }
        }
        else {
            this.e.e(s, new byc$j(byc$h.I0, (Long)null, (String)null, (Long)null, (Boolean)null, (String)null, (String)null, 254));
        }
    }
}
