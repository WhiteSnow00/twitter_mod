import java.util.Objects;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acl extends pue implements kub<String, vzv, Boolean, bbq<awj<? extends noj<btm<z9w, zbv>>, ? extends String>>>
{
    public final ProfileModuleContainerViewModel F0;
    
    public acl(final ProfileModuleContainerViewModel f0) {
        this.F0 = f0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final String a = (String)o;
        final vzv vzv = (vzv)o2;
        final Boolean b = (Boolean)o3;
        e0e.f((Object)a, "profileId");
        e0e.f((Object)vzv, "<anonymous parameter 1>");
        e0e.f((Object)b, "shouldShowData");
        final c5l$a companion = c5l.Companion;
        final boolean a2 = e0e.a((Object)a, (Object)this.F0.U0);
        Objects.requireNonNull(companion);
        final rmv b2 = ita.b();
        boolean b3 = false;
        if (!b2.b("professionals_launch_holdback_profile_suppression_enabled", false) || a2) {
            b3 = ita.b().b("android_profile_modules_fetch_enabled", false);
        }
        bbq bbq;
        if (b3 && b) {
            final ocl t0 = this.F0.T0;
            Objects.requireNonNull(t0);
            t0.a = a;
            this.F0.T0.a(ocl.c);
            bbq = ((tnm<String, Object, osc>)this.F0.R0).S(a).w((rtb)new nav((stb)new zbl(a), 25));
        }
        else {
            final noj b4 = noj.b;
            final int a3 = o5j.a;
            bbq = bbq.v((Object)new awj((Object)b4, (Object)a));
        }
        return bbq;
    }
}
