import android.content.Context;
import android.app.Dialog;
import java.util.Objects;
import java.util.List;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ri implements dx8
{
    public final Activity F0;
    public final myi G0;
    public final ni H0;
    public final jep I0;
    public final qdw J0;
    public List<lep> K0;
    public qgv L0;
    
    public ri(final Activity f0, final ni h0, final myi g0, final gra<dx8, jep> gra, final qdw j0) {
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = g0;
        this.I0 = (jep)gra.a((Object)this);
        this.J0 = j0;
    }
    
    public final void a(final int n, final qgv l0, final int n2) {
        this.L0 = l0;
        final String m0 = l0.M0;
        if (this.G0.b(this.F0, new qw8(2131959123, 2131959122, 2131952374, 2131957590))) {
            Objects.requireNonNull(dsi.Companion);
            if (ita.b().b("android_audio_spaces_device_follow_copy_enabled", false)) {
                this.K0 = this.b(n2);
                this.I0.a(((Context)this.F0).getString(2131957624), ((Context)this.F0).getString(2131957622), (List)this.K0, n);
            }
            else {
                this.K0 = this.b(n2);
                this.I0.a(((Context)this.F0).getString(2131957625), flr.l(m0), (List)this.K0, n);
            }
        }
    }
    
    public final List<lep> b(final int n) {
        final ojf h = ojf.H();
        final String[] stringArray = ((Context)this.F0).getResources().getStringArray(2130903042);
        final String[] stringArray2 = ((Context)this.F0).getResources().getStringArray(2130903043);
        final String[] stringArray3 = ((Context)this.F0).getResources().getStringArray(2130903045);
        final String[] stringArray4 = ((Context)this.F0).getResources().getStringArray(2130903040);
        final int[] intArray = ((Context)this.F0).getResources().getIntArray(2130903041);
        for (int i = 0; i < stringArray.length; ++i) {
            final dsi.a companion = dsi.Companion;
            Objects.requireNonNull(companion);
            if (ita.b().b("android_audio_spaces_device_follow_option_enabled", false) || intArray[i] != 3) {
                if (intArray[i] == 4) {
                    if (!ita.b().b("super_follow_exclusive_tweet_notifications_enabled", false)) {
                        continue;
                    }
                    if (!fbx.S(n)) {
                        continue;
                    }
                }
                final lep$a lep$a = new lep$a();
                Objects.requireNonNull(companion);
                if (!ita.b().b("android_audio_spaces_device_follow_copy_enabled", false)) {
                    lep$a.a = stringArray2[i];
                    lep$a.b = stringArray3[i];
                }
                else {
                    lep$a.a = stringArray[i];
                }
                lep$a.d = stringArray4[i];
                lep$a.e = intArray[i];
                h.p((Object)((z4j)lep$a).e());
            }
        }
        return (List)((z4j)h).e();
    }
    
    public final void c(final String s) {
        final fg4 fg4 = new fg4(dda.g("settings", "notifications", "", "account_notifications", s));
        ((o1p)fg4).C = this.L0.e();
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    @Override
    public final void k0(final Dialog dialog, int e, final int n) {
        e = this.K0.get(n).e;
        this.H0.b(e);
        this.H0.a((Context)this.F0, this.J0);
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
