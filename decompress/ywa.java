import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ywa implements p0e<xwa>
{
    public final fbs a;
    public final NavigationHandler b;
    
    public ywa(final fbs a, final NavigationHandler b) {
        zzd.f((Object)a, "taskContext");
        zzd.f((Object)b, "navigationHandler");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final asr asr) {
        final xwa xwa = (xwa)asr;
        final bxa bxa = (bxa)tjp.J0(tjp.G0(tjp.N0(or4.w1((Iterable)this.a.i.values()), (rtb)axa.C0), (rtb)zwa.C0));
        String a;
        if (bxa != null) {
            a = bxa.b;
        }
        else if (((cxa)((asr)xwa).b).j) {
            a = new BigInteger(100, new SecureRandom()).toString(32);
        }
        else {
            a = null;
        }
        final NavigationHandler b = this.b;
        final xrv a2 = ((asr)xwa).b.a;
        zzd.c((Object)a2);
        final bxa$a bxa$a = new bxa$a();
        bxa$a.a = a;
        b.d(new mrd(a2, (prd)((h4j)bxa$a).e()), (String)null);
    }
    
    public static final class a extends p0e$a<xwa>
    {
        public a() {
            super((Class)xwa.class);
        }
    }
    
    public static final class b extends p0e$b<xwa>
    {
        public b(final a a, final fxe<ywa> fxe) {
            zzd.f((Object)a, "matcher");
            zzd.f((Object)fxe, "handler");
            super((p0e$a)a, (fxe)fxe);
        }
    }
}
