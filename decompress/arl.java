import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arl implements zql
{
    public final xau a;
    public final brl b;
    public final m1b c;
    public final k84 d;
    
    public arl(final xau a, final brl b, final m1b c, final k84 d, final lue lue, final ibm ibm) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final j29 subscribe = lue.a().subscribe((fk6)new kce(this, 10));
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new hu1(subscribe, 9));
    }
    
    public static void a(final String s) {
        e9a.d((Throwable)new IllegalStateException(l7k.c("[FCMMigration] ", s)));
    }
    
    public final n9q<String> b() {
        final String k = this.k();
        if (pjr.e((CharSequence)k)) {
            a("Cached token is null or empty");
            return (n9q<String>)new y9q((pbq)new ekc(this, 3));
        }
        return (n9q<String>)n9q.v((Object)k);
    }
    
    public final void c(String s) {
        final String j = this.a.j("regId", "");
        if (!s.equals(j) && !pjr.e((CharSequence)s)) {
            this.a.i().b("regId", s).e();
            this.d.a(s);
        }
        final brl b = this.b;
        final boolean b2 = s.equals(j) ^ true;
        Objects.requireNonNull(b);
        final uaa c = b.c;
        if (b2) {
            s = "changed";
        }
        else {
            s = "matches";
        }
        brl.a(new zf4(nca.d((taa)c, "token", s)));
        if (b2) {
            final ata a = b.a;
            for (final UserIdentifier userIdentifier : a.a.d()) {
                final zf4 zf4 = new zf4(userIdentifier);
                zf4.q(new String[] { "notification", null, "gcm_registration", "token", "changed" });
                zf4.i((szo)new zsa());
                a.b(userIdentifier, (okm)zf4);
            }
        }
    }
    
    public final String k() {
        final String j = this.a.j("regId", "");
        if (pjr.e((CharSequence)j)) {
            a("Cached token is null or empty");
            xw0.c((rj)new p00(this, 18));
        }
        return j;
    }
}
