import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uor
{
    public static final g Companion;
    public static final String[] h;
    public static final List<Integer> i;
    public static final Set<String> j;
    public final rpr a;
    public final fmv b;
    public final qbu c;
    public final xk0 d;
    public final m8a e;
    public final jpr f;
    public final wc6 g;
    
    static {
        Companion = new g();
        h = new String[] { "allow_undo_tweet", "allow_undo_replies", "undo_tweet_timer" };
        i = s9i.s(5, 10, 20, 30, 60);
        j = rp9.I0("subscriptions", "subscription_welcome_shown");
    }
    
    public uor(final rpr a, final fmv b, final uew uew, final qbu c, final xbm xbm, final xk0 d, final m8a e, final jpr f) {
        czd.f((Object)a, "subscriptionsRepository");
        czd.f((Object)b, "featureSwitches");
        czd.f((Object)uew, "userManager");
        czd.f((Object)c, "userPreferences");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)d, "appConfig");
        czd.f((Object)e, "errorReporter");
        czd.f((Object)f, "subscriptionsProductFeaturePersistence");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final wc6 g = new wc6();
        this.g = g;
        xbm.i((oj)new tzo((Object)this, 16));
        g.a(uew.c().filter((ytk)new vt1((qsb)uor$a.D0, 19)).flatMapSingle((psb)new hpn((qsb)new uor$b(this), 25)).subscribe((lj6)new ayi((qsb)uor$c.D0, 23), (lj6)new irl((qsb)new uor$d(this), 22)));
        g.a(uew.r().subscribe((lj6)new gwi((qsb)new uor$e(this), 27), (lj6)new bxi((qsb)new uor$f(this), 28)));
    }
    
    public final void a() {
        final qbu$c i = this.c.i();
        final Iterator<Object> iterator = uor.j.iterator();
        while (iterator.hasNext()) {
            ((qbu$d)i).a((String)iterator.next());
        }
        i.e();
    }
    
    public final boolean b() {
        return this.e("subscriptions_feature_1011", "client_feature_switch/subscriptions_feature_1011/true");
    }
    
    public final boolean c() {
        return this.e("subscriptions_feature_1006", "client_feature_switch/subscriptions_feature_1006/true");
    }
    
    public final boolean d() {
        return this.e("subscriptions_feature_1002", "client_feature_switch/subscriptions_feature_1002/true");
    }
    
    public final boolean e(final String s, final String s2) {
        final boolean contains = this.c.h("subscriptions", (Set)p2a.D0).contains(s2);
        boolean b2;
        final boolean b = b2 = false;
        if (contains) {
            if (!this.b.b("subscriptions_enabled", false)) {
                b2 = b;
                if (!uor.Companion.d()) {
                    return b2;
                }
            }
            b2 = b;
            if (this.b.b(s, false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean f() {
        final boolean e = this.e("subscriptions_feature_labs_1002", "client_feature_switch/subscriptions_feature_labs_1002/true");
        boolean b = false;
        if (e || asa.b().b("subscriptions_long_video_upload_override", false)) {
            b = true;
        }
        return b;
    }
    
    public final boolean g() {
        return this.e("subscriptions_feature_1005", "client_feature_switch/subscriptions_feature_1005/true");
    }
    
    public final eaq<Boolean> h() {
        final boolean c = uor.Companion.c();
        eaq eaq;
        if (!this.b.b("subscriptions_claims_fetch_enabled", false)) {
            eaq = eaq.v((Object)Boolean.FALSE);
        }
        else {
            eaq = this.a.b().w((psb)new byn((qsb)new xor(this), 20));
        }
        return (eaq<Boolean>)new yaq((lcq)new kbq((lcq)eaq, (psb)new abr((qsb)new uor$h((Object)this), 13)), (lj6)new qsq((qsb)new uor$i(this, c), 12));
    }
    
    public final boolean i() {
        return this.b.b("subscriptions_sign_up_force_billing_path", false);
    }
    
    public final boolean j() {
        return qbu.Companion.b(UserIdentifier.Companion.c()).h("subscriptions", (Set)p2a.D0).contains("feature/twitter_blue");
    }
    
    public static final class g
    {
        public static boolean i(final g g, qbu b, final l99 l99, final int n) {
            if ((n & 0x1) != 0x0) {
                b = qbu.Companion.b(UserIdentifier.Companion.c());
            }
            return g.h(b, l99, false);
        }
        
        public final int a() {
            return qbu.Companion.b(UserIdentifier.Companion.c()).g("undo_tweet_timer", 20);
        }
        
        public final boolean b() {
            final fmv b = asa.b();
            boolean b2 = false;
            if (b.b("subscriptions_enabled", false)) {
                b2 = b2;
                if (asa.b().b("subscriptions_feature_labs_1005", false)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        public final boolean c() {
            return qbu.Companion.b(UserIdentifier.Companion.c()).h("subscriptions", (Set)p2a.D0).contains("feature/twitter_blue");
        }
        
        public final boolean d() {
            final fmv b = asa.b();
            boolean b2 = false;
            if (b.b("subscriptions_gating_bypass", false)) {
                b2 = b2;
                if (this.c()) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        public final boolean e() {
            return asa.b().b("subscriptions_experience_settings_revamp_enabled", false);
        }
        
        public final boolean f(final qbu qbu) {
            czd.f((Object)qbu, "userPreferences");
            final boolean contains = qbu.h("subscriptions", (Set)p2a.D0).contains("client_feature_switch/subscriptions_feature_1003/true");
            boolean b2;
            final boolean b = b2 = false;
            if (contains) {
                if (!asa.b().b("subscriptions_enabled", false)) {
                    b2 = b;
                    if (!this.d()) {
                        return b2;
                    }
                }
                b2 = b;
                if (asa.b().b("subscriptions_feature_1003", false)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        public final boolean g(final qbu qbu, final l99 l99) {
            czd.f((Object)l99, "draftTweet");
            return i(this, qbu, l99, 4);
        }
        
        public final boolean h(final qbu qbu, final l99 l99, final boolean b) {
            czd.f((Object)qbu, "userPreferences");
            czd.f((Object)l99, "draftTweet");
            final boolean b2 = l99.b();
            boolean b4;
            final boolean b3 = b4 = false;
            if (!b2) {
                if (l99.f != 0L || !this.f(qbu) || !qbu.e("allow_undo_tweet", true)) {
                    b4 = b3;
                    if (l99.f <= 0L) {
                        return b4;
                    }
                    final boolean b5 = this.f(qbu) && qbu.e("allow_undo_replies", true);
                    b4 = b3;
                    if (!b5) {
                        return b4;
                    }
                    if (l99.q == l99$a.G0) {
                        b4 = b3;
                        if (b) {
                            return b4;
                        }
                    }
                }
                b4 = true;
            }
            return b4;
        }
    }
}
