import android.app.Activity;
import java.util.Objects;
import java.util.UUID;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b4c implements qn
{
    public static final b4c.b4c$b Companion;
    public final sn C0;
    
    static {
        Companion = new b4c.b4c$b();
    }
    
    public b4c(final Application application, final ibm ibm) {
        zzd.f((Object)application, "application");
        zzd.f((Object)ibm, "releaseCompletable");
        final sn c0 = new sn(ibm);
        this.C0 = c0;
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new b4c$a(this));
    }
    
    public final qn A(final UUID uuid) {
        zzd.f((Object)uuid, "retainedKey");
        final sn c0 = this.C0;
        Objects.requireNonNull(c0);
        return pn.b((qn)c0, uuid);
    }
    
    public final raf<rn> F(final rtb<? super rn, Boolean> rtb) {
        final sn c0 = this.C0;
        Objects.requireNonNull(c0);
        return (raf<rn>)dia.a((raf)c0, (rtb)rtb);
    }
    
    public final b5j<rn> a() {
        return this.C0.a();
    }
    
    public final b5j<igj> b() {
        return (b5j<igj>)pn.d((qn)this.C0);
    }
    
    public final b5j<lgj> c() {
        return (b5j<lgj>)pn.g((qn)this.C0);
    }
    
    public final b5j<ngj> h() {
        return (b5j<ngj>)pn.i((qn)this.C0);
    }
    
    public final b5j<hgj> j() {
        return (b5j<hgj>)pn.c((qn)this.C0);
    }
    
    public final b5j<jgj> p() {
        return (b5j<jgj>)pn.e((qn)this.C0);
    }
    
    public final b5j<kgj> q() {
        return (b5j<kgj>)pn.f((qn)this.C0);
    }
    
    public final qn w(final Activity activity) {
        zzd.f((Object)activity, "activity");
        final sn c0 = this.C0;
        Objects.requireNonNull(c0);
        return pn.a((qn)c0, activity);
    }
}
