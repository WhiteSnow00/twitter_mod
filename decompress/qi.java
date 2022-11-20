import android.content.Context;
import android.app.Dialog;
import java.util.Objects;
import java.util.List;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qi implements xv8
{
    public final Activity D0;
    public final yxi E0;
    public final mi F0;
    public final mdp G0;
    public final adw H0;
    public List<odp> I0;
    public cgv J0;
    
    public qi(final Activity d0, final mi f0, final yxi e0, final ypa<xv8, mdp> ypa, final adw h0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
        this.G0 = (mdp)ypa.a((Object)this);
        this.H0 = h0;
    }
    
    public final void a(final int n, final cgv j0, final int n2) {
        this.J0 = j0;
        final String k0 = j0.K0;
        if (this.E0.b(this.D0, new kv8(2131959123, 2131959122, 2131952374, 2131957590))) {
            Objects.requireNonNull(nri.Companion);
            if (asa.b().b("android_audio_spaces_device_follow_copy_enabled", false)) {
                this.I0 = this.b(n2);
                this.G0.a(((Context)this.D0).getString(2131957624), ((Context)this.D0).getString(2131957622), (List)this.I0, n);
            }
            else {
                this.I0 = this.b(n2);
                this.G0.a(((Context)this.D0).getString(2131957625), ikr.l(k0), (List)this.I0, n);
            }
        }
    }
    
    public final List<odp> b(final int n) {
        final rif h = rif.H();
        final String[] stringArray = ((Context)this.D0).getResources().getStringArray(2130903042);
        final String[] stringArray2 = ((Context)this.D0).getResources().getStringArray(2130903043);
        final String[] stringArray3 = ((Context)this.D0).getResources().getStringArray(2130903045);
        final String[] stringArray4 = ((Context)this.D0).getResources().getStringArray(2130903040);
        final int[] intArray = ((Context)this.D0).getResources().getIntArray(2130903041);
        for (int i = 0; i < stringArray.length; ++i) {
            final nri$a companion = nri.Companion;
            Objects.requireNonNull(companion);
            if (asa.b().b("android_audio_spaces_device_follow_option_enabled", false) || intArray[i] != 3) {
                if (intArray[i] == 4) {
                    if (!asa.b().b("super_follow_exclusive_tweet_notifications_enabled", false)) {
                        continue;
                    }
                    if (!chw.p0(n)) {
                        continue;
                    }
                }
                final odp$a odp$a = new odp$a();
                Objects.requireNonNull(companion);
                if (!asa.b().b("android_audio_spaces_device_follow_copy_enabled", false)) {
                    odp$a.a = stringArray2[i];
                    odp$a.b = stringArray3[i];
                }
                else {
                    odp$a.a = stringArray[i];
                }
                odp$a.d = stringArray4[i];
                odp$a.e = intArray[i];
                h.p((Object)((n4j)odp$a).e());
            }
        }
        return (List)((n4j)h).e();
    }
    
    public final void c(final String s) {
        final af4 af4 = new af4(vba.g("settings", "notifications", "", "account_notifications", s));
        ((u0p)af4).C = this.J0.e();
        final int a = c5j.a;
        cbw.b((elm)af4);
    }
    
    public final void k0(final Dialog dialog, int e, final int n) {
        e = this.I0.get(n).e;
        this.F0.b(e);
        this.F0.a((Context)this.D0, this.H0);
        if (e == 1) {
            this.c("device_follow");
        }
        else if (e == 2) {
            this.c("live_follow");
        }
        else if (e == 3) {
            this.c("spaces_follow");
        }
        else if (e == 4) {
            this.c("exclusive_tweet_follow");
        }
        else {
            this.c("disable");
        }
    }
}
