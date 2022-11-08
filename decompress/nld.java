import androidx.fragment.app.Fragment;
import androidx.preference.TwoStatePreference;
import androidx.preference.d;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import androidx.preference.Preference;
import com.twitter.settings.widget.LinkableSwitchPreferenceCompat;
import android.os.Bundle;
import kotlin.Metadata;
import androidx.preference.Preference$d;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Lnld;", "Lynd;", "Landroidx/preference/Preference$d;", "<init>", "()V", "a", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class nld extends ynd implements Preference$d
{
    public static final nld.nld$a Companion;
    public final u3s X1;
    
    static {
        Companion = new nld.nld$a();
    }
    
    public nld() {
        this.X1 = (u3s)rp2.z0((otb)new nld$b(this));
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213791);
        final giw a = ncw.d().A();
        zzd.e((Object)a, "getCurrent().userSettings");
        ((TwoStatePreference)this.f2()).Y(a.D);
        ((Preference)this.f2()).G0 = (Preference$d)this;
    }
    
    public final LinkableSwitchPreferenceCompat f2() {
        return (LinkableSwitchPreferenceCompat)this.X1.getValue();
    }
    
    public final boolean r0(final Preference preference, final Object o) {
        zzd.f((Object)preference, "preference");
        final ocw d = ncw.d();
        zzd.e((Object)d, "getCurrent()");
        final boolean a = zzd.a(o, (Object)Boolean.TRUE);
        if (zzd.a((Object)preference, (Object)this.f2())) {
            final liw v = liw.v(((Fragment)this).J1(), d);
            v.q("allow_logged_out_device_personalization", a);
            psc.c().f((ksc)((h4j)v).e());
            Objects.requireNonNull(nld.Companion);
            final zf4 zf4 = new zf4(UserIdentifier.Companion.c());
            final nca$a companion = nca.Companion;
            String s;
            if (a) {
                s = "opt_in";
            }
            else {
                s = "opt_out";
            }
            zf4.T = companion.e("settings_personalization", "", "toggle", "logged_out_personalization", s).toString();
            final int a2 = w4j.a;
            saw.b((okm)zf4);
            return true;
        }
        return false;
    }
}
