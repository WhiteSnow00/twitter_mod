import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asl implements zrl
{
    public final gcu a;
    public final bsl b;
    public final k1b c;
    public final s84 d;
    
    public asl(final gcu a, final bsl b, final k1b c, final s84 d, final uue uue, final kcm kcm) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final b39 subscribe = uue.a().subscribe((rk6)new iug((Object)this, 10));
        Objects.requireNonNull(subscribe);
        kcm.i((sj)new d41(subscribe, 6));
    }
    
    public static void a(final String s) {
        r9a.d((Throwable)new IllegalStateException(mqb.l("[FCMMigration] ", s)));
    }
    
    public final bbq<String> b() {
        final String l = this.l();
        if (flr.e((CharSequence)l)) {
            a("Cached token is null or empty");
            return (bbq<String>)new mbq((ddq)new f8f(this, 9));
        }
        return (bbq<String>)bbq.v((Object)l);
    }
    
    public final void c(String s) {
        final String j = this.a.j("regId", "");
        if (!s.equals(j) && !flr.e((CharSequence)s)) {
            this.a.i().b("regId", s).e();
            this.d.a(s);
        }
        final bsl b = this.b;
        final boolean b2 = s.equals(j) ^ true;
        Objects.requireNonNull(b);
        final kba c = b.c;
        if (b2) {
            s = "changed";
        }
        else {
            s = "matches";
        }
        bsl.a(new fg4(dda.d((iba)c, "token", s)));
        if (b2) {
            final fta a = b.a;
            for (final UserIdentifier userIdentifier : a.a.d()) {
                final fg4 fg4 = new fg4(userIdentifier);
                ((o1p)fg4).q(new String[] { "notification", null, "gcm_registration", "token", "changed" });
                ((o1p)fg4).i((d1p)new eta());
                a.b(userIdentifier, (tlm)fg4);
            }
        }
    }
    
    public final String l() {
        final String j = this.a.j("regId", "");
        if (flr.e((CharSequence)j)) {
            a("Cached token is null or empty");
            xw0.c((sj)new n0p((Object)this, 20));
        }
        return j;
    }
}
