import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l32
{
    public static final c Companion;
    public final uew a;
    public final h32 b;
    public final fca<elm> c;
    public final qbu d;
    
    static {
        Companion = new c();
    }
    
    public l32(final uew a, final h32 b, final fca<elm> c, final qbu d, final xbm xbm) {
        czd.f((Object)a, "userManager");
        czd.f((Object)b, "blockstoreRepository");
        czd.f((Object)c, "userEventReporter");
        czd.f((Object)d, "preferences");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (asa.b().b("android_blockstore_backup_enabled", false)) {
            if (!d.e("pref_has_performed_backup_once", false)) {
                final qbu$c i = d.i();
                ((qbu$d)i).f("pref_has_performed_backup_once", true);
                i.e();
                if (a.d().size() > 0) {
                    final sy5 b2 = this.b("app_update");
                    final w19 w19 = new w19();
                    ((sy5)xbm.E0).q((oj)new l32$e(w19));
                    w19.c(b2.q((oj)new l32$f()));
                }
            }
            final sy5 flatMapCompletable = a.o().flatMapCompletable((psb)new x9v((qsb)new qsb<UserIdentifier, rz5>(this) {
                public final l32 D0;
                
                public final Object invoke(final Object o) {
                    czd.f((Object)o, "it");
                    return this.D0.b("login");
                }
            }, 12));
            czd.e((Object)flatMapCompletable, "userManager.observeLogIn\u2026kUpCompletable(\"login\") }");
            final w19 w20 = new w19();
            ((sy5)xbm.E0).q((oj)new l32$g(w20));
            w20.c(flatMapCompletable.q((oj)new l32$h()));
            final sy5 flatMapCompletable2 = a.r().flatMapCompletable((psb)new y9v((qsb)new qsb<UserIdentifier, rz5>(this) {
                public final l32 D0;
                
                public final Object invoke(final Object o) {
                    czd.f((Object)o, "it");
                    return this.D0.b("logout");
                }
            }, 11));
            czd.e((Object)flatMapCompletable2, "userManager.observeLogOu\u2026UpCompletable(\"logout\") }");
            final w19 w21 = new w19();
            ((sy5)xbm.E0).q((oj)new l32$i(w21));
            w21.c(flatMapCompletable2.q((oj)new l32$j()));
        }
    }
    
    public static final void a(final l32 l32, final String s, final String s2) {
        l32.c.b(l32.a.b(), (elm)new af4(vba.Companion.e("", "blockstore", "upload", s, s2)));
    }
    
    public final sy5 b(final String s) {
        final eaq a = this.b.a();
        final ri4 ri4 = new ri4((qsb)new qsb<mg1, fzv>(this, s) {
            public final l32 D0;
            public final String E0;
            
            public final Object invoke(final Object o) {
                final mg1 mg1 = (mg1)o;
                if (mg1 instanceof mg1$a) {
                    l32.a(this.D0, this.E0, "error");
                }
                else if (czd.a((Object)mg1, (Object)mg1$b.a)) {
                    l32.a(this.D0, this.E0, "error_insufficient_storage");
                }
                else if (czd.a((Object)mg1, (Object)mg1$c.a)) {
                    l32.a(this.D0, this.E0, "error_no_account");
                }
                else if (czd.a((Object)mg1, (Object)mg1$d.a)) {
                    l32.a(this.D0, this.E0, "error_not_supported");
                }
                else if (czd.a((Object)mg1, (Object)mg1$e.a)) {
                    l32.a(this.D0, this.E0, "success");
                }
                return fzv.a;
            }
        }, 13);
        Objects.requireNonNull(a);
        return (sy5)new iz5((lcq)new fbq((lcq)a, (lj6)ri4));
    }
    
    public static final class c
    {
    }
}
