import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lro
{
    public static final b Companion;
    public final kyr<z67> a;
    public final Activity b;
    public final pca<bo> c;
    public final oro d;
    
    static {
        Companion = new b();
    }
    
    public lro(final kyr<z67> a, final Activity b, final pca<bo> c, final oro d, final cjk cjk, final a77 a2) {
        zzd.f((Object)a, "credentialSavingClient");
        zzd.f((Object)b, "activity");
        zzd.f((Object)c, "activityResultObservable");
        zzd.f((Object)d, "eventReporter");
        zzd.f((Object)cjk, "playServicesUtil");
        zzd.f((Object)a2, "credential");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        ro.b((pca)c, 326547282, (rtb)new lro$a(this));
        final String a3 = a2.a();
        final String c2 = a2.c();
        a2.clear();
        if (a3 != null && c2 != null && cjk.a()) {
            ((z67)a.get()).c(new sro(new u5q(a3, c2), (String)null)).a((tgj)new fcn((Object)this, 24)).d((eij)new grx((Object)this, 8)).g((ujj)new qo((rtb)new mro(this), 21));
        }
    }
    
    public static final class b
    {
    }
}
