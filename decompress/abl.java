import java.util.Objects;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abl extends gue implements jub<String, oyv, Boolean, n9q<gvj<? extends snj<vrm<b9w, pav>>, ? extends String>>>
{
    public final /* synthetic */ ProfileModuleContainerViewModel C0;
    
    public abl(final ProfileModuleContainerViewModel c0) {
        this.C0 = c0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final String a = (String)o;
        final oyv oyv = (oyv)o2;
        final Boolean b = (Boolean)o3;
        zzd.f((Object)a, "profileId");
        zzd.f((Object)oyv, "<anonymous parameter 1>");
        zzd.f((Object)b, "shouldShowData");
        final e4l.a companion = e4l.Companion;
        final boolean a2 = zzd.a((Object)a, (Object)this.C0.R0);
        Objects.requireNonNull(companion);
        final hlv b2 = dta.b();
        boolean b3 = false;
        if (!b2.b("professionals_launch_holdback_profile_suppression_enabled", false) || a2) {
            b3 = dta.b().b("android_profile_modules_fetch_enabled", false);
        }
        n9q n9q;
        if (b3 && b) {
            final obl q0 = this.C0.Q0;
            Objects.requireNonNull(q0);
            q0.a = a;
            this.C0.Q0.a(obl.c);
            n9q = ((omm)this.C0.O0).S((Object)a).w((qtb)new nma((rtb)new zal(a), 25));
        }
        else {
            final snj b4 = snj.b;
            final int a3 = w4j.a;
            n9q = n9q.v((Object)new gvj((Object)b4, (Object)a));
        }
        return n9q;
    }
}
