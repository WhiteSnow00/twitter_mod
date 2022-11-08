import android.app.Dialog;
import androidx.fragment.app.Fragment;
import androidx.preference.TwoStatePreference;
import androidx.preference.d;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import androidx.preference.Preference;
import com.twitter.settings.widget.LinkableSwitchPreferenceCompat;
import android.os.Bundle;
import kotlin.Metadata;
import androidx.preference.Preference$d;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Lpfj;", "Lynd;", "Landroidx/preference/Preference$d;", "<init>", "()V", "a", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class pfj extends ynd implements Preference$d
{
    public static final a Companion;
    public final u3s X1;
    public final u3s Y1;
    
    static {
        Companion = new a();
    }
    
    public pfj() {
        this.X1 = (u3s)rp2.z0((otb)new pfj$b(this));
        this.Y1 = (u3s)rp2.z0((otb)new pfj$c(this));
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213802);
        final giw a = ncw.d().A();
        zzd.e((Object)a, "getCurrent().userSettings");
        this.h2(a);
        ((Preference)this.f2()).G0 = (Preference$d)this;
        ((TwoStatePreference)this.g2()).Y(a.D);
        ((Preference)this.g2()).G0 = (Preference$d)this;
    }
    
    public final LinkableSwitchPreferenceCompat f2() {
        return (LinkableSwitchPreferenceCompat)this.X1.getValue();
    }
    
    public final LinkableSwitchPreferenceCompat g2() {
        return (LinkableSwitchPreferenceCompat)this.Y1.getValue();
    }
    
    public final void h2(final giw giw) {
        final hlv b = dta.b();
        boolean b2 = false;
        if (b.b("ucpd_enabled", false)) {
            ((Preference)this.f2()).U(false);
        }
        else {
            final LinkableSwitchPreferenceCompat f2 = this.f2();
            final a companion = pfj.Companion;
            if (!companion.a(giw) || giw.h) {
                b2 = true;
            }
            f2.M(b2);
            ((TwoStatePreference)this.f2()).Y(giw.h);
            final LinkableSwitchPreferenceCompat f3 = this.f2();
            int n;
            if (companion.a(giw)) {
                n = 2131957977;
            }
            else {
                n = 2131957976;
            }
            ((Preference)f3).Q(n);
        }
    }
    
    public final boolean r0(final Preference preference, final Object o) {
        zzd.f((Object)preference, "preference");
        final ocw d = ncw.d();
        zzd.e((Object)d, "getCurrent()");
        final boolean a = zzd.a(o, (Object)Boolean.TRUE);
        final boolean a2 = zzd.a((Object)preference, (Object)this.f2());
        boolean b = false;
        if (a2) {
            final a companion = pfj.Companion;
            final giw a3 = d.A();
            zzd.e((Object)a3, "userInfo.userSettings");
            if (companion.a(a3)) {
                if (!a) {
                    final Context j1 = ((Fragment)this).J1();
                    final qmg qmg = new qmg(j1, 0);
                    qmg.m(2131957785);
                    ((Dialog)qmg.p(2131957789, (DialogInterface$OnClickListener)new ofj(d, j1, this)).n(2131957788, (DialogInterface$OnClickListener)null).create()).show();
                }
                else {
                    ij1.h("User wont be able to enable use cookie if the device is in EU");
                    b = true;
                }
                return b;
            }
            final liw v = liw.v(((Fragment)this).J1(), d);
            v.q("use_cookie_personalization", a);
            psc.c().f((ksc)((h4j)v).e());
            companion.b("cookies_personalization", a);
            return true;
        }
        else {
            if (zzd.a((Object)preference, (Object)this.g2())) {
                final liw v2 = liw.v(((Fragment)this).J1(), d);
                v2.q("allow_logged_out_device_personalization", a);
                psc.c().f((ksc)((h4j)v2).e());
                pfj.Companion.b("logged_out_personalization", a);
                return true;
            }
            return false;
        }
    }
    
    public static final class a
    {
        public final boolean a(final giw giw) {
            boolean b;
            if (!giw.G) {
                bl0.a().t();
                b = false;
            }
            else {
                b = true;
            }
            return b;
        }
        
        public final void b(final String s, final boolean b) {
            final zf4 zf4 = new zf4(UserIdentifier.Companion.c());
            final nca$a companion = nca.Companion;
            String s2;
            if (b) {
                s2 = "opt_in";
            }
            else {
                s2 = "opt_out";
            }
            zf4.T = companion.e("settings_personalization", "", "toggle", s, s2).toString();
            final int a = w4j.a;
            saw.b((okm)zf4);
        }
    }
}
