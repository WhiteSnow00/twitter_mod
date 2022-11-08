import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gb6
{
    public static final a Companion;
    public final ee5 a;
    public final jh5 b;
    public final qw8 c;
    public UserIdentifier d;
    public boolean e;
    
    static {
        Companion = new a();
    }
    
    public gb6(final ee5 a, final jh5 b, final qw8 c, final hfv hfv) {
        zzd.f((Object)a, "repository");
        zzd.f((Object)b, "communitiesUtils");
        zzd.f((Object)c, "dialogOpener");
        this.a = a;
        this.b = b;
        this.c = c;
        final UserIdentifier f = hfv.f();
        zzd.e((Object)f, "user.userIdentifier");
        this.d = f;
        this.e = zzd.a((Object)hfv.z1, (Object)Boolean.TRUE);
    }
    
    public final boolean a() {
        return this.b.b();
    }
    
    public final boolean b(final g9i g9i) {
        final boolean b = false;
        if (g9i == null) {
            return false;
        }
        boolean b2 = b;
        if (this.d()) {
            b2 = b;
            if (g9i instanceof g9i.a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean c(final g9i g9i) {
        return this.b(g9i) || this.g(g9i);
    }
    
    public final boolean d() {
        return this.a() || this.e(this.d);
    }
    
    public final boolean e(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        final boolean e = this.e;
        final boolean b = true;
        final boolean b2 = e && dta.a(userIdentifier).b("super_follow_exclusive_tweet_creation_api_enabled", false);
        boolean b3 = b;
        if (!this.f(userIdentifier)) {
            b3 = (b2 && b);
        }
        return b3;
    }
    
    public final boolean f(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        return s5u.Companion.b(userIdentifier);
    }
    
    public final boolean g(final g9i g9i) {
        boolean b2;
        final boolean b = b2 = false;
        if (g9i != null) {
            b2 = b;
            if (this.d()) {
                b2 = b;
                if (g9i instanceof g9i.f) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final List<String> h(final g9i g9i, final ea9 ea9) {
        zzd.f((Object)g9i, "narrowcastType");
        List<String> list;
        if (g9i instanceof g9i.a) {
            list = gb6.Companion.a((g9i.a)g9i, ea9);
        }
        else {
            list = gb6.Companion.b(ea9);
        }
        return list;
    }
    
    public static final class a
    {
        public final List<String> a(final g9i.a a, final ea9 ea9) {
            zzd.f((Object)a, "narrowcastType");
            final List p2 = or4.p2((Collection)this.b(ea9));
            ((ArrayList<String>)p2).add(l7k.c("8.31.", a.c));
            return p2;
        }
        
        public final List<String> b(final ea9 ea9) {
            final List m = ea9.m;
            if (m == null) {
                return (List<String>)v2a.C0;
            }
            final List p = or4.p2((Collection)m);
            final ArrayList list = new ArrayList();
            for (final Object next : (ArrayList)p) {
                final String s = (String)next;
                zzd.e((Object)s, "it");
                if (!ckr.n1(s, "8.31.", false)) {
                    list.add(next);
                }
            }
            return list;
        }
    }
}
