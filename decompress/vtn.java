import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import tv.periscope.android.api.PsUser;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vtn
{
    public static final a Companion;
    public static final doj i;
    public final w3k a;
    public final UserIdentifier b;
    public final adw c;
    public final gwo d;
    public final mgv e;
    public final s3k f;
    public boolean g;
    public final ucq<Object, Object> h;
    
    static {
        Companion = new a();
        final doj$a companion = doj.Companion;
        final i63$a companion2 = i63.Companion;
        i = companion.b(new i63[] { companion2.b("efbbbf"), companion2.b("feff"), companion2.b("fffe"), companion2.b("0000ffff"), companion2.b("ffff0000") });
    }
    
    public vtn(final w3k a, final UserIdentifier b, final adw c, final gwo d, final mgv e) {
        czd.f((Object)a, "periscopeAuthenticator");
        czd.f((Object)b, "userIdentifier");
        czd.f((Object)c, "userInfo");
        czd.f((Object)d, "ioScheduler");
        czd.f((Object)e, "userManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new s3k(b, (String)null);
        this.h = new utn(this);
    }
    
    public final h5j<ynj<PsUser>> a() {
        final h5j doOnError = this.a.a(this.c, this.f, t3k.E0).doOnNext((lj6)new ewi((qsb)new vtn$b(this), 26)).doOnError((lj6)new qpl((qsb)new vtn$c(this), 20));
        czd.e((Object)doOnError, "private fun forceAuthent\u2026asAuthenticated = false }");
        return (h5j<ynj<PsUser>>)doOnError;
    }
    
    public final eaq<w3k.b> b() {
        if (!this.g && czd.a((Object)((uew)this.e).b(), (Object)this.b)) {
            this.a();
        }
        return (eaq<w3k.b>)((h5j)this.a.i).filter((ytk)new qo((qsb)vtn$d.D0, 19)).map((psb)new lql((qsb)vtn$e.D0, 20)).doOnNext((lj6)new fwi((qsb)new vtn$f(this), 19)).take(1L).singleOrError().y(this.d);
    }
    
    public final <T> ucq<T, T> c() {
        final utn h = this.h;
        czd.d((Object)h, "null cannot be cast to non-null type io.reactivex.SingleTransformer<T of com.twitter.rooms.repositories.impl.RoomPeriscopeAuthenticator.withTokenRefresh, T of com.twitter.rooms.repositories.impl.RoomPeriscopeAuthenticator.withTokenRefresh>");
        return (ucq<T, T>)h;
    }
    
    public static final class a
    {
        public final Charset a(final dr2 dr2, Charset charset) throws IOException {
            final int v3 = dr2.v3(vtn.i);
            if (v3 != -1) {
                if (v3 != 0) {
                    if (v3 != 1) {
                        if (v3 != 2) {
                            Charset charset2;
                            if (v3 != 3) {
                                if (v3 != 4) {
                                    throw new AssertionError();
                                }
                                final ht3 a = ht3.a;
                                charset = ht3.c;
                                if ((charset2 = charset) == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    czd.e((Object)charset2, "forName(\"UTF-32LE\")");
                                    ht3.c = charset2;
                                }
                            }
                            else {
                                final ht3 a2 = ht3.a;
                                charset = ht3.d;
                                if ((charset2 = charset) == null) {
                                    charset2 = Charset.forName("UTF-32BE");
                                    czd.e((Object)charset2, "forName(\"UTF-32BE\")");
                                    ht3.d = charset2;
                                }
                            }
                            charset = charset2;
                        }
                        else {
                            charset = StandardCharsets.UTF_16LE;
                            czd.e((Object)charset, "UTF_16LE");
                        }
                    }
                    else {
                        charset = StandardCharsets.UTF_16BE;
                        czd.e((Object)charset, "UTF_16BE");
                    }
                }
                else {
                    charset = StandardCharsets.UTF_8;
                    czd.e((Object)charset, "UTF_8");
                }
            }
            return charset;
        }
    }
}
