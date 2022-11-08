import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r32
{
    public static final c Companion;
    public final gew a;
    public final n32 b;
    public final xca<okm> c;
    public final xau d;
    
    static {
        Companion = new c();
    }
    
    public r32(final gew a, final n32 b, final xca<okm> c, final xau d, final ibm ibm) {
        zzd.f((Object)a, "userManager");
        zzd.f((Object)b, "blockstoreRepository");
        zzd.f((Object)c, "userEventReporter");
        zzd.f((Object)d, "preferences");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (dta.b().b("android_blockstore_backup_enabled", false)) {
            if (!d.e("pref_has_performed_backup_once", false)) {
                final xau$c i = d.i();
                ((xau$d)i).f("pref_has_performed_backup_once", true);
                i.e();
                if (a.d().size() > 0) {
                    final iz5 b2 = this.b("app_update");
                    final m29 m29 = new m29();
                    ((iz5)ibm.D0).q((rj)new r32$e(m29));
                    m29.c(b2.q((rj)new r32$f()));
                }
            }
            final iz5 flatMapCompletable = a.o().flatMapCompletable((qtb)new d9v((rtb)new r32$a(this), 8));
            zzd.e((Object)flatMapCompletable, "userManager.observeLogIn\u2026kUpCompletable(\"login\") }");
            final m29 m30 = new m29();
            ((iz5)ibm.D0).q((rj)new r32$g(m30));
            m30.c(flatMapCompletable.q((rj)new r32$h()));
            final iz5 flatMapCompletable2 = a.r().flatMapCompletable((qtb)new di((rtb)new r32$b(this), 13));
            zzd.e((Object)flatMapCompletable2, "userManager.observeLogOu\u2026UpCompletable(\"logout\") }");
            final m29 m31 = new m29();
            ((iz5)ibm.D0).q((rj)new r32$i(m31));
            m31.c(flatMapCompletable2.q((rj)new r32$j()));
        }
    }
    
    public static final void a(final r32 r32, final String s, final String s2) {
        r32.c.b(r32.a.b(), (okm)new zf4(nca.Companion.e("", "blockstore", "upload", s, s2)));
    }
    
    public final iz5 b(final String s) {
        final n9q<qg1> a = this.b.a();
        final iaa iaa = new iaa((rtb)new r32$d(this, s), 10);
        Objects.requireNonNull((n9q)a);
        return (iz5)new yz5((ubq)new oaq((ubq)a, (fk6)iaa));
    }
    
    public static final class c
    {
    }
}
