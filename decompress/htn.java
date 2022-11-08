import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import tv.periscope.android.api.PsUser;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htn
{
    public static final a Companion;
    public static final xnj i;
    public final u3k a;
    public final UserIdentifier b;
    public final ocw c;
    public final qvo d;
    public final qfv e;
    public final q3k f;
    public boolean g;
    public final dcq<Object, Object> h;
    
    static {
        Companion = new a();
        final xnj$a companion = xnj.Companion;
        final r63$a companion2 = r63.Companion;
        i = companion.b(new r63[] { companion2.b("efbbbf"), companion2.b("feff"), companion2.b("fffe"), companion2.b("0000ffff"), companion2.b("ffff0000") });
    }
    
    public htn(final u3k a, final UserIdentifier b, final ocw c, final qvo d, final qfv e) {
        zzd.f((Object)a, "periscopeAuthenticator");
        zzd.f((Object)b, "userIdentifier");
        zzd.f((Object)c, "userInfo");
        zzd.f((Object)d, "ioScheduler");
        zzd.f((Object)e, "userManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new q3k(b, (String)null);
        this.h = new gtn(this);
    }
    
    public final b5j<snj<PsUser>> a() {
        final b5j doOnError = this.a.a(this.c, this.f, r3k.D0).doOnNext((fk6)new zgw((rtb)new htn$b(this), 17)).doOnError((fk6)new hlx((rtb)new htn$c(this), 18));
        zzd.e((Object)doOnError, "private fun forceAuthent\u2026asAuthenticated = false }");
        return (b5j<snj<PsUser>>)doOnError;
    }
    
    public final n9q<u3k$b> b() {
        if (!this.g && zzd.a((Object)((gew)this.e).b(), (Object)this.b)) {
            this.a();
        }
        return (n9q<u3k$b>)((b5j)this.a.i).filter((ptk)new vj4((rtb)htn$d.C0, 17)).map((qtb)new i4i((rtb)htn$e.C0, 26)).doOnNext((fk6)new aqi((rtb)new htn$f(this), 20)).take(1L).singleOrError().y(this.d);
    }
    
    public final <T> dcq<T, T> c() {
        final gtn h = this.h;
        zzd.d((Object)h, "null cannot be cast to non-null type io.reactivex.SingleTransformer<T of com.twitter.rooms.repositories.impl.RoomPeriscopeAuthenticator.withTokenRefresh, T of com.twitter.rooms.repositories.impl.RoomPeriscopeAuthenticator.withTokenRefresh>");
        return (dcq<T, T>)h;
    }
    
    public static final class a
    {
        public final Charset a(final mr2 mr2, Charset charset) throws IOException {
            final int w3 = mr2.w3(htn.i);
            if (w3 != -1) {
                if (w3 != 0) {
                    if (w3 != 1) {
                        if (w3 != 2) {
                            Charset charset2;
                            if (w3 != 3) {
                                if (w3 != 4) {
                                    throw new AssertionError();
                                }
                                final zt3 a = zt3.a;
                                charset = zt3.c;
                                if ((charset2 = charset) == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    zzd.e((Object)charset2, "forName(\"UTF-32LE\")");
                                    zt3.c = charset2;
                                }
                            }
                            else {
                                final zt3 a2 = zt3.a;
                                charset = zt3.d;
                                if ((charset2 = charset) == null) {
                                    charset2 = Charset.forName("UTF-32BE");
                                    zzd.e((Object)charset2, "forName(\"UTF-32BE\")");
                                    zt3.d = charset2;
                                }
                            }
                            charset = charset2;
                        }
                        else {
                            charset = StandardCharsets.UTF_16LE;
                            zzd.e((Object)charset, "UTF_16LE");
                        }
                    }
                    else {
                        charset = StandardCharsets.UTF_16BE;
                        zzd.e((Object)charset, "UTF_16BE");
                    }
                }
                else {
                    charset = StandardCharsets.UTF_8;
                    zzd.e((Object)charset, "UTF_8");
                }
            }
            return charset;
        }
    }
}
