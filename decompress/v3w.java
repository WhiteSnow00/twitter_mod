import java.util.Iterator;
import android.content.Context;
import android.app.Activity;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v3w implements p0e<u3w>
{
    public final NavigationHandler a;
    public final fbs b;
    public final OcfEventReporter c;
    public final Activity d;
    public final ocw e;
    public final aav f;
    
    public v3w(final NavigationHandler a, final fbs b, final OcfEventReporter c, final Activity d, final ocw e, final aav f) {
        zzd.f((Object)a, "navigationHandler");
        zzd.f((Object)b, "taskContext");
        zzd.f((Object)c, "ocfEventReporter");
        zzd.f((Object)d, "hostingActivity");
        zzd.f((Object)e, "userInfo");
        zzd.f((Object)f, "twitterDatabaseHelper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final asr asr) {
        final u3w u3w = (u3w)asr;
        final v1k.a a = new v1k.a();
        for (final vzg vzg : ((w3w)u3w.b).j) {
            final int b = vzg.b;
            if (b == 1) {
                final mrd mrd = this.b.d.get(vzg.a.b);
                Object b2;
                if (mrd != null) {
                    b2 = mrd.b;
                }
                else {
                    b2 = null;
                }
                ccp ccp;
                if (b2 instanceof ccp) {
                    ccp = (ccp)b2;
                }
                else {
                    ccp = null;
                }
                Object a2 = null;
                Label_0143: {
                    if (ccp != null) {
                        final rw9 b3 = ccp.b;
                        if (b3 != null) {
                            a2 = ((ww9)b3).C0;
                            break Label_0143;
                        }
                    }
                    a2 = null;
                }
                if (a2 == null) {
                    continue;
                }
                a.a = (kvg)a2;
                final OcfEventReporter c = this.c;
                final zf4 zf4 = new zf4();
                zf4.T = nca.Companion.e("onboarding", "select_avatar", "", "upload", "start").toString();
                final int a3 = w4j.a;
                c.b(zf4, (String)null);
            }
            else {
                if (b != 2) {
                    continue;
                }
                final mrd mrd2 = this.b.d.get(vzg.a.b);
                Object b4;
                if (mrd2 != null) {
                    b4 = mrd2.b;
                }
                else {
                    b4 = null;
                }
                jcp jcp;
                if (b4 instanceof jcp) {
                    jcp = (jcp)b4;
                }
                else {
                    jcp = null;
                }
                Object b6 = null;
                Label_0291: {
                    if (jcp != null) {
                        final rw9 b5 = jcp.b;
                        if (b5 != null) {
                            b6 = ((ww9)b5).C0;
                            break Label_0291;
                        }
                    }
                    b6 = null;
                }
                if (b6 == null) {
                    continue;
                }
                a.b = (kvg)b6;
                final OcfEventReporter c2 = this.c;
                final zf4 zf5 = new zf4();
                zf5.T = nca.Companion.e("onboarding", "select_banner", "", "upload", "start").toString();
                final int a4 = w4j.a;
                c2.b(zf5, (String)null);
            }
        }
        qfl.b((Context)this.d, this.e, (v1k)a.e(), null, "setup_profile", this.f);
        final NavigationHandler a5 = this.a;
        final xrv a6 = ((lsr)u3w.b).a;
        zzd.c((Object)a6);
        a5.e(a6);
    }
    
    public static final class a extends p0e$a<u3w>
    {
        public a() {
            super((Class)u3w.class);
        }
    }
    
    public static final class b extends p0e$b<u3w>
    {
        public b(final a a, final fxe<v3w> fxe) {
            zzd.f((Object)a, "matcher");
            zzd.f((Object)fxe, "handler");
            super((p0e$a)a, (fxe)fxe);
        }
    }
}
