import java.util.Iterator;
import tv.periscope.android.event.AppEvent;
import com.twitter.periscope.auth.PeriscopeException;
import tv.periscope.android.api.PsUser;
import java.util.HashSet;
import android.content.SharedPreferences;
import tv.periscope.android.api.ApiManager;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w3k
{
    public final Context a;
    public final trc b;
    public final v2c c;
    public final z5k d;
    public final ypa<UserIdentifier, d51> e;
    public final Set<a> f;
    public final wc6 g;
    public final mv1<ynj<adw>> h;
    public final mv1<ynj<b>> i;
    public final pwe<? extends ApiManager> j;
    public final l9w k;
    public final xmp l;
    public final hf2 m;
    public final SharedPreferences n;
    public adw o;
    
    public w3k(final Context a, final z5k d, final trc b, final pwe<? extends ApiManager> j, final l9w k, final xmp l, final hf2 m, final SharedPreferences n) {
        final v2c c = fli.C();
        final c2x i = c2x.k;
        this.f = new HashSet();
        this.g = new wc6();
        this.h = (mv1<ynj<adw>>)new mv1();
        this.i = (mv1<ynj<b>>)new mv1();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = (ypa<UserIdentifier, d51>)i;
        this.d = d;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public static boolean c(final ziw ziw) {
        final fmv b = asa.b();
        final boolean b2 = false;
        if (!b.b("connect_to_periscope_deprecated", false) && !b.b("android_audio_room_creation_enabled", false) && !b.b("android_audio_room_fleets_consumption_enabled", false)) {
            boolean b3 = b2;
            if (ziw.j ^ true) {
                b3 = b2;
                if (ziw.C) {
                    b3 = true;
                }
            }
            return b3;
        }
        return true;
    }
    
    public final h5j<ynj<PsUser>> a(final adw adw, final s3k s3k, final t3k t3k) {
        this.e(adw);
        final boolean n = adw.n();
        final int n2 = 1;
        int n3;
        if (n && c(adw.A()) && adw.o() != zjw.G0) {
            n3 = 2;
        }
        else {
            n3 = 1;
        }
        final int e = ib0.E(n3);
        if (e == 0) {
            s3k.a(1);
            this.d(adw, null);
            final ynj b = ynj.b;
            final int a = c5j.a;
            return (h5j<ynj<PsUser>>)h5j.just((Object)b);
        }
        if (e != 1) {
            cj1.h("Invalid AuthState");
            return (h5j<ynj<PsUser>>)h5j.empty();
        }
        s3k.a(2);
        final wmp d = this.l.d();
        int n4;
        if (d == null) {
            n4 = 0;
        }
        else {
            n4 = n2;
            if (t3k.D0) {
                n4 = ((true ^ d.a()) ? 1 : 0);
            }
        }
        if (n4 != 0 && this.k.n() != null) {
            this.d(adw, null);
            return (h5j<ynj<PsUser>>)h5j.just((Object)new ynj((Object)this.k.q()));
        }
        final iw0 iw0 = new iw0();
        final d51 d2 = (d51)this.e.a((Object)adw.k());
        this.g.a((t19)((h5j)d2.j1).subscribeWith((ccj)new u3k(this, t3k, adw, iw0)));
        this.b.f((orc)d2);
        return (h5j<ynj<PsUser>>)iw0;
    }
    
    public final void b() {
        ((ApiManager)this.j.get()).logout(new AppEvent(1, (Object)null), false);
        this.l.a();
        this.k.a();
        this.n.edit().clear().apply();
    }
    
    public final void d(final adw adw, final PeriscopeException ex) {
        if (adw == null) {
            final mv1<ynj<adw>> h = this.h;
            final ynj b = ynj.b;
            final int a = c5j.a;
            h.onNext((Object)b);
            this.i.onNext((Object)b);
        }
        else {
            this.h.onNext((Object)new ynj((Object)adw));
            this.i.onNext((Object)new ynj((Object)new b(adw, ex)));
        }
    }
    
    public final void e(final adw o) {
        final wmp$a e0 = wmp$a.E0;
        if (this.o == o) {
            return;
        }
        this.g.e();
        this.d(null, null);
        this.b();
        this.o = o;
        final String string = this.d.a.getString(z5k.c(o.k()), (String)null);
        PsUser psUser = null;
        Label_0096: {
            if (string != null) {
                try {
                    psUser = (PsUser)klp.a(oi1.a(string), (rlp)cnl.b);
                    break Label_0096;
                }
                catch (final Exception ex) {
                    m8a.h((Throwable)ex);
                }
            }
            psUser = null;
        }
        if (psUser != null) {
            this.k.g(psUser);
        }
        final String string2 = this.d.a.getString(z5k.a(o.k()), (String)null);
        if (okr.b((CharSequence)string2)) {
            final String string3 = this.d.a.getString(z5k.b(o.k()), (String)null);
            int q;
            if (string3 == null) {
                q = 0;
            }
            else {
                try {
                    q = hee.q(string3);
                }
                catch (final IllegalArgumentException ex2) {
                    h6r.F("Session", "Illegal value for CookieType", (Throwable)ex2);
                    q = 1;
                }
            }
            wmp wmp;
            if (3 == q) {
                wmp = new wmp(string2, e0, 3);
            }
            else {
                wmp = new wmp(string2, e0, 2);
            }
            this.l.c(wmp);
        }
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).d(o);
        }
    }
    
    public interface a
    {
        void d(final adw p0);
    }
    
    public static final class b
    {
        public final adw a;
        public final ynj<PeriscopeException> b;
        
        public b(final adw a, final PeriscopeException ex) {
            this.a = a;
            if (ex == null) {
                final ynj b = ynj.b;
                final int a2 = c5j.a;
                this.b = (ynj<PeriscopeException>)b;
            }
            else {
                this.b = (ynj<PeriscopeException>)new ynj((Object)ex);
            }
        }
    }
}
