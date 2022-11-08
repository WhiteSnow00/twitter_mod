import android.os.BaseBundle;
import androidx.preference.d;
import com.twitter.android.TotpGeneratorActivity;
import com.twitter.android.TemporaryAppPasswordActivity;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.login.api.LoginVerificationArgs;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import java.util.Iterator;
import java.util.HashMap;
import androidx.preference.PreferenceGroup;
import android.net.Uri;
import android.app.Dialog;
import androidx.preference.PreferenceScreen;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.BackupCodeActivity;
import android.content.DialogInterface;
import androidx.preference.TwoStatePreference;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import java.util.List;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import androidx.preference.Preference$e;
import androidx.preference.Preference$d;

// 
// Decompiled by Procyon v0.6.0
// 

public class sgv extends ynd implements Preference$d, Preference$e, a
{
    public UserIdentifier X1;
    public Map<wgv, List<Long>> Y1;
    public rgv Z1;
    public y2a a2;
    public pgv b2;
    public boolean c2;
    public boolean d2;
    public Preference e2;
    public Preference f2;
    public Preference g2;
    public Preference h2;
    public Preference i2;
    public Preference j2;
    public Preference k2;
    public Preference l2;
    public CheckBoxPreference m2;
    public TwoStatePreference n2;
    public TwoStatePreference o2;
    public TwoStatePreference p2;
    public ngv q2;
    public ahv r2;
    public t9j<a5a> s2;
    public t9j<tuv> t2;
    public t9j<c74> u2;
    public t9j<ygv> v2;
    public t9j<tgv> w2;
    public t9j<zgv> x2;
    
    public sgv() {
        this.X1 = UserIdentifier.UNDEFINED;
    }
    
    public static boolean l2() {
        return dta.b().b("account_2fa3_enabled", false);
    }
    
    public static boolean m2() {
        return dta.b().b("u2f_security_key_auth_management_enabled", false);
    }
    
    public static void r2(final String s, int a, final int[] array, final UserIdentifier userIdentifier) {
        int n;
        if (array != null && array.length != 0) {
            n = array[0];
        }
        else {
            n = 0;
        }
        if (n == 88) {
            final zf4 zf4 = new zf4(userIdentifier);
            zf4.q(new String[] { zi.y("settings:login_verification:", s, "::rate_limit") });
            saw.b((okm)zf4);
        }
        final zf4 zf5 = new zf4();
        zf5.q(new String[] { zi.y("settings:login_verification:", s, "::failure") });
        zf5.c = String.valueOf(a);
        a = w4j.a;
        zf5.t = String.valueOf(n);
        saw.b((okm)zf5);
    }
    
    public final void A(final DialogInterface dialogInterface, final String s) {
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1021955215: {
                if (!s.equals("no_push_dialog")) {
                    break;
                }
                n = 6;
                break;
            }
            case 388398611: {
                if (!s.equals("disabled_login_verification_dialog")) {
                    break;
                }
                n = 5;
                break;
            }
            case -127537606: {
                if (!s.equals("eligibility_dialog")) {
                    break;
                }
                n = 4;
                break;
            }
            case -674045193: {
                if (!s.equals("no_phone_dialog")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1771195752: {
                if (!s.equals("enabled_login_verification_dialog")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1818800284: {
                if (!s.equals("no_verified_email_dialog")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1880800299: {
                if (!s.equals("another_device_enrolled_dialog")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            case 6: {
                ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)BackupCodeActivity.class).putExtra("show_welcome", true).putExtra("bc_account_id", ((vo1)this).S1.getId()));
                break;
            }
            case 5: {
                final zf4 zf4 = new zf4(((vo1)this).S1);
                zf4.q(new String[] { "settings:login_verification:unenroll:cancel:click" });
                saw.b((okm)zf4);
                break;
            }
            case 2: {
                final zf4 zf5 = new zf4(((vo1)this).S1);
                zf5.q(new String[] { "settings:login_verification:enroll:cancel:click" });
                saw.b((okm)zf5);
                break;
            }
            case 0:
            case 1:
            case 3:
            case 4: {
                ((Activity)((Fragment)this).L0()).finish();
                break;
            }
        }
    }
    
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        bundle.putBoolean("enrolling", this.c2);
    }
    
    public final void D1(final View view, final Bundle bundle) {
        super.D1(view, bundle);
        final y2a.d d = new y2a.d();
        d.b();
        final w2a$a w2a$a = new w2a$a();
        final jx6 a = yds.a;
        w2a$a.c = (yds)new jjr(2131957695);
        w2a$a.e = 1;
        w2a$a.b = (yds)new jjr(2131957588);
        final y2a.e c = new y2a.e((w2a)((h4j)w2a$a).e());
        c.a = (y2a.c)new lo((Object)this, 15);
        d.c = c;
        (this.a2 = new y2a(((Fragment)this).N0(), new c5w((Activity)((Fragment)this).L0(), ((vo1)this).S1), d, view)).b(false);
        final p9s c2 = ((y5f)((go1)this.o()).B((Class)y5f.class)).c5();
        this.s2 = (t9j<a5a>)c2.a((Class)a5a.class);
        final t9j a2 = c2.a((Class)tuv.class);
        this.t2 = (t9j<tuv>)a2;
        f.j(a2.a(), (u93)new en((Object)this, 15), (raa)jhd.b((t2e)this));
        final t9j a3 = c2.a((Class)c74.class);
        this.u2 = (t9j<c74>)a3;
        f.j(a3.a(), (u93)new fpa(this, 9), (raa)jhd.b((t2e)this));
        final t9j a4 = c2.a((Class)ygv.class);
        this.v2 = (t9j<ygv>)a4;
        f.j(a4.a(), (u93)new ngc((Object)this, 13), (raa)jhd.b((t2e)this));
        final t9j a5 = c2.a((Class)tgv.class);
        this.w2 = (t9j<tgv>)a5;
        f.j(a5.a(), (u93)new lg1((Object)this, 14), (raa)jhd.b((t2e)this));
        final t9j a6 = c2.a((Class)zgv.class);
        this.x2 = (t9j<zgv>)a6;
        f.j(a6.a(), (u93)new ril((Object)this, 14), (raa)jhd.b((t2e)this));
    }
    
    public final void P(final String s) {
        if (s.equals("no_phone_dialog")) {
            ((Activity)((Fragment)this).L0()).finish();
        }
    }
    
    public final void c2() {
        super.c2();
        if (UserIdentifier.getCurrent().isLoggedOutUser()) {
            this.v0().h().d((zm)vfg.a(fgg.E0));
            return;
        }
        final zf4 zf4 = new zf4(((vo1)this).S1);
        zf4.q(new String[] { "settings:login_verification:::impression" });
        saw.b((okm)zf4);
        if (xcs.a().i()) {
            this.f2(this.c2 ^ true);
        }
        else if (l2()) {
            if (this.b2 == null) {
                final y2a a2 = this.a2;
                if (a2 != null) {
                    a2.b(true);
                }
            }
        }
        else {
            final PreferenceScreen g = ((d)this).z1.g;
            final String j = wau.e(((vo1)this).S1, "login_verification").j("lv_totp_secret", "");
            if (((d)this).d0((CharSequence)"two_factor_auth_in_app_totp_code_generator") == null && dta.b().b("login_verification_totp_generator_enabled", false) && pjr.g((CharSequence)j)) {
                ((PreferenceGroup)g).Y(this.k2);
            }
        }
    }
    
    public final void f2(final boolean b) {
        if (b) {
            this.t2(2131959264);
        }
        if (l2() && !this.d2) {
            this.w2.d((kmm)new tgv(((vo1)this).S1));
        }
        else {
            this.u2.d((kmm)new c74(this.X1, nbg.a(((vo1)this).S1)));
        }
    }
    
    public final void g2() {
        this.c2 = true;
        this.v2.d((kmm)new ygv(this.X1, "two_factor", ((Fragment)this).W0(2131959272)));
    }
    
    public final void h2(final String s) {
        final zf4 zf4 = new zf4(((vo1)this).S1);
        zf4.q(new String[] { s });
        saw.b((okm)zf4);
        final tnl a = tnl.a(((vo1)this).S1);
        if (!xpa.b().a()) {
            this.g2();
        }
        else if (!a.b()) {
            a.c(true);
            this.g2();
        }
        else {
            this.g2();
        }
    }
    
    public final void i2() {
        final PreferenceScreen g = ((d)this).z1.g;
        ((PreferenceGroup)g).d0((Preference)this.m2);
        ((PreferenceGroup)g).d0(this.h2);
        ((PreferenceGroup)g).d0(this.e2);
        ((PreferenceGroup)g).d0(this.g2);
    }
    
    public final void j(Dialog k1, final String s, final int n) {
        int n2 = 0;
        Label_0401: {
            switch (s) {
                case "totp_unenrollment_method_dialog": {
                    n2 = 13;
                    break Label_0401;
                }
                case "u2f_enrollment_ineligible_dialog": {
                    n2 = 12;
                    break Label_0401;
                }
                case "no_push_dialog": {
                    n2 = 11;
                    break Label_0401;
                }
                case "disable_2fa_dialog": {
                    n2 = 10;
                    break Label_0401;
                }
                case "disabled_login_verification_dialog": {
                    n2 = 9;
                    break Label_0401;
                }
                case "eligibility_dialog": {
                    n2 = 8;
                    break Label_0401;
                }
                case "u2f_unenrollment_method_dialog": {
                    n2 = 7;
                    break Label_0401;
                }
                case "no_phone_dialog": {
                    n2 = 6;
                    break Label_0401;
                }
                case "u2f_enrollment_add_key_dialog": {
                    n2 = 5;
                    break Label_0401;
                }
                case "sms_unenrollment_method_dialog": {
                    n2 = 4;
                    break Label_0401;
                }
                case "enabled_login_verification_dialog": {
                    n2 = 3;
                    break Label_0401;
                }
                case "no_verified_email_dialog": {
                    n2 = 2;
                    break Label_0401;
                }
                case "another_device_enrolled_dialog": {
                    n2 = 1;
                    break Label_0401;
                }
                case "u2f_enrollment_manage_key_dialog": {
                    n2 = 0;
                    break Label_0401;
                }
                default:
                    break;
            }
            n2 = -1;
        }
        switch (n2) {
            case 13: {
                if (n == -1) {
                    this.v2(wgv.E0);
                    break;
                }
                break;
            }
            case 12: {
                if (n == -3) {
                    this.v0().h().d((zm)new dmx(Uri.parse(((Fragment)this).W0(2131959267))));
                    break;
                }
                break;
            }
            case 11: {
                if (n == -3) {
                    ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)BackupCodeActivity.class).putExtra("show_welcome", true).putExtra("bc_account_id", ((vo1)this).S1.getId()));
                    break;
                }
                break;
            }
            case 10: {
                if (n == -1) {
                    this.u2("settings:login_verification:enroll:ok:click");
                    break;
                }
                break;
            }
            case 9: {
                if (n == -1) {
                    this.u2("settings:login_verification:unenroll:ok:click");
                    break;
                }
                if (n == -2) {
                    final zf4 zf4 = new zf4(((vo1)this).S1);
                    zf4.q(new String[] { "settings:login_verification:unenroll:cancel:click" });
                    saw.b((okm)zf4);
                    break;
                }
                break;
            }
            case 8: {
                if (n == -3) {
                    ((Activity)((Fragment)this).L0()).finish();
                    break;
                }
                break;
            }
            case 7: {
                if (n == -1) {
                    this.v2(wgv.F0);
                    break;
                }
                break;
            }
            case 6: {
                if (n == -1) {
                    final ldj$a ldj$a = new ldj$a((Context)((Fragment)this).L0());
                    final sbs$a sbs$a = new sbs$a();
                    sbs$a.p("add_phone");
                    ldj$a.d = (sbs)((h4j)sbs$a).e();
                    ((Fragment)this).V1(((ldj)((h4j)ldj$a).e()).a());
                    break;
                }
                if (n == -2) {
                    ((Activity)((Fragment)this).L0()).finish();
                    break;
                }
                break;
            }
            case 5: {
                if (n == -1) {
                    this.n2();
                    break;
                }
                break;
            }
            case 4: {
                if (n == -1) {
                    this.v2(wgv.D0);
                    break;
                }
                break;
            }
            case 3: {
                if (n == -1) {
                    this.h2("settings:login_verification:enroll:ok:click");
                    break;
                }
                if (n == -2) {
                    final zf4 zf5 = new zf4(((vo1)this).S1);
                    zf5.q(new String[] { "settings:login_verification:enroll:cancel:click" });
                    saw.b((okm)zf5);
                    break;
                }
                break;
            }
            case 2: {
                if (n == -3) {
                    this.v0().h().d((zm)new dmx(Uri.parse(((Fragment)this).W0(2131959388))));
                    break;
                }
                break;
            }
            case 1: {
                if (n == -1) {
                    this.h2("settings:login_verification:switch:ok:click");
                    break;
                }
                if (n == -2) {
                    ((Activity)((Fragment)this).L0()).finish();
                    break;
                }
                break;
            }
            case 0: {
                if (n == -1) {
                    this.n2();
                    break;
                }
                break;
            }
        }
        final wil wil = (wil)this.Z1.a().H(s);
        if (wil != null) {
            k1 = ((cw8)wil).K1;
            if (k1 != null) {
                k1.hide();
            }
        }
    }
    
    public final void j2() {
        this.i2();
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_additional_methods_category");
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_in_app_totp_code_generator");
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        final rgv z1 = new rgv(((Fragment)this).L0(), (a)this);
        this.Z1 = z1;
        this.q2 = new ngv(z1);
        if (dta.b().b("ocf_2fa_unenrollment_enabled", false)) {
            this.r2 = (ahv)new bhv((Activity)((Fragment)this).H1());
        }
        else {
            this.r2 = (ahv)this.q2;
        }
        this.X1 = yvj.i(((Activity)((Fragment)this).L0()).getIntent(), "SecuritySettingsActivity_account_id");
        if (bundle != null) {
            this.c2 = bundle.getBoolean("enrolling", false);
        }
        else {
            this.c2 = false;
        }
        ((d)this).Y1(2132213829);
        final CheckBoxPreference m2 = (CheckBoxPreference)((d)this).d0((CharSequence)"two_factor_auth");
        this.m2 = m2;
        ((Preference)m2).G0 = (Preference$d)this;
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth");
        final Preference d0 = ((d)this).d0((CharSequence)"login_verification_generate_code");
        this.e2 = d0;
        d0.H0 = (Preference$e)this;
        final Preference d2 = ((d)this).d0((CharSequence)"login_verification_check_requests");
        this.h2 = d2;
        d2.H0 = (Preference$e)this;
        this.o2 = (TwoStatePreference)((d)this).d0((CharSequence)"two_factor_auth_sms_switch");
        this.n2 = (TwoStatePreference)((d)this).d0((CharSequence)"two_factor_auth_mobile_security_app_switch");
        this.p2 = (TwoStatePreference)((d)this).d0((CharSequence)"two_factor_auth_u2f_security_key_switch");
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_sms_checkbox");
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_mobile_security_app_checkbox");
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_u2f_security_key_checkbox");
        ((Preference)this.o2).G0 = (Preference$d)this;
        ((Preference)this.n2).G0 = (Preference$d)this;
        ((Preference)this.p2).G0 = (Preference$d)this;
        this.f2 = ((d)this).d0((CharSequence)"two_factor_auth_temporary_app_password");
        this.g2 = ((d)this).d0((CharSequence)"temporary_app_password");
        if (!dta.b().b("2fa_temporary_password_enabled", false)) {
            final PreferenceScreen g = ((d)this).z1.g;
            rez.F((PreferenceGroup)g, "two_factor_auth_temporary_app_password");
            rez.F((PreferenceGroup)g, "temporary_app_password");
        }
        this.f2.H0 = (Preference$e)this;
        this.g2.H0 = (Preference$e)this;
        this.i2 = ((d)this).d0((CharSequence)"two_factor_auth_verification_methods_category");
        this.j2 = ((d)this).d0((CharSequence)"two_factor_auth_additional_methods_category");
        final Preference d3 = ((d)this).d0((CharSequence)"two_factor_auth_in_app_totp_code_generator");
        this.k2 = d3;
        d3.H0 = (Preference$e)this;
        ((d)this).d0((CharSequence)"two_factor_auth_backup_code").H0 = (Preference$e)this;
        final Preference d4 = ((d)this).d0((CharSequence)"two_factor_auth_manage_u2f_keys");
        this.l2 = d4;
        d4.H0 = (Preference$e)this;
        if (dta.b().b("u2f_security_key_auth_enabled", false)) {
            ((Preference)this.p2).R((CharSequence)((vo1)this).I1.getString(2131959292));
        }
        else {
            ((Preference)this.p2).R((CharSequence)((vo1)this).I1.getString(2131959291));
        }
        final pgv b = nbg.b(((vo1)this).S1);
        this.b2 = b;
        if (b != null && l2()) {
            this.p2(this.b2);
        }
        else {
            this.j2();
        }
        this.d2 = false;
    }
    
    public final void k2() {
        final rgv z1 = this.Z1;
        final xgl e0 = z1.E0;
        if (e0 != null && ((Fragment)e0).L0() != null) {
            ((cw8)z1.E0).Z1(false, false);
            z1.E0 = null;
        }
    }
    
    public final void n2() {
        final pb7 e = pb7.e();
        if (e.k()) {
            e.j((Activity)((Fragment)this).L0(), "https://mobile.twitter.com/settings/account/login_verification/security_keys", null, true, true, "u2f_enrollment");
        }
        else {
            ((Fragment)this).V1(new Intent("android.intent.action.VIEW", Uri.parse("https://mobile.twitter.com/settings/account/login_verification/security_keys")));
        }
    }
    
    public final void p2(final pgv pgv) {
        this.i2();
        this.q2();
        if (pgv.a) {
            final PreferenceScreen g = ((d)this).z1.g;
            if (((d)this).d0((CharSequence)"two_factor_auth_verification_methods_category") == null) {
                ((PreferenceGroup)g).Y(this.i2);
            }
            if (((d)this).d0((CharSequence)"two_factor_auth_additional_methods_category") == null) {
                ((PreferenceGroup)g).Y(this.j2);
            }
            final Map a = tth.a(0);
            final List<ogv> c = pgv.c;
            if (c != null) {
                for (final ogv ogv : c) {
                    final int ordinal = ((Enum)ogv.b).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 5) {
                                this.p2.Y(true);
                                if (m2()) {
                                    this.l2.U(true);
                                }
                            }
                        }
                        else {
                            final List c2 = ogv.c;
                            final PreferenceScreen g2 = ((d)this).z1.g;
                            boolean contains;
                            boolean contains2;
                            if (c2 != null) {
                                contains = c2.contains(ugv.E0);
                                contains2 = c2.contains(ugv.D0);
                            }
                            else {
                                contains = false;
                                contains2 = false;
                            }
                            final boolean b = c2 == null || c2.isEmpty() || !contains2;
                            this.n2.Y(contains2 || contains);
                            if (b) {
                                if (((d)this).d0((CharSequence)"two_factor_auth_in_app_totp_code_generator") == null) {
                                    ((PreferenceGroup)g2).Y(this.k2);
                                }
                            }
                            else {
                                rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_in_app_totp_code_generator");
                            }
                        }
                    }
                    else {
                        this.o2.Y(true);
                        wau.e(((vo1)this).S1, "login_verification").i().f("two_factor_auth_sms_enabled", true).e();
                    }
                    final wgv b2 = ogv.b;
                    final HashMap hashMap = (HashMap)a;
                    if (hashMap.containsKey(b2)) {
                        final List list = hashMap.get(ogv.b);
                        list.add(ogv.a);
                        hashMap.put(ogv.b, list);
                    }
                    else {
                        hashMap.put(ogv.b, rth.c((Object[])new Long[] { ogv.a }));
                    }
                }
            }
            this.Y1 = (tth$a)a;
        }
        else {
            this.j2();
        }
    }
    
    public final void q2() {
        this.n2.Y(false);
        this.o2.Y(false);
        this.p2.Y(false);
        this.l2.U(false);
        rez.F((PreferenceGroup)((d)this).z1.g, "two_factor_auth_in_app_totp_code_generator");
        this.Y1 = (tth$a)tth.a(0);
    }
    
    public final boolean r0(final Preference preference, Object o) {
        final String n0 = preference.N0;
        if (!xcs.a().i()) {
            final rgv z1 = this.Z1;
            Objects.requireNonNull(z1);
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("twitter:id", 17);
            ((BaseBundle)bundle).putInt("title", 2131959271);
            final int a = w4j.a;
            ((BaseBundle)bundle).putInt("message", 2131959270);
            ((BaseBundle)bundle).putInt("positive_button", 17039370);
            if (((BaseBundle)bundle).containsKey("twitter:id")) {
                final wil i = yqh.i(bundle);
                ((cl1)i).T1 = (mw8)z1;
                ((cl1)i).Q1 = (jw8)z1;
                ((cl1)i).S1 = (lw8)z1;
                ((cl1)i).e2(z1.a(), "no_network_dialog");
                return false;
            }
            throw new Fragment.InstantiationException("Missing fragment id", null);
        }
        else {
            Objects.requireNonNull(n0);
            int n2 = -1;
            switch (n0) {
                case "two_factor_auth_sms_checkbox": {
                    n2 = 6;
                    break;
                }
                case "two_factor_auth": {
                    n2 = 5;
                    break;
                }
                case "two_factor_auth_mobile_security_app_switch": {
                    n2 = 4;
                    break;
                }
                case "two_factor_auth_u2f_security_key_switch": {
                    n2 = 3;
                    break;
                }
                case "two_factor_auth_u2f_security_key_checkbox": {
                    n2 = 2;
                    break;
                }
                case "two_factor_auth_sms_switch": {
                    n2 = 1;
                    break;
                }
                case "two_factor_auth_mobile_security_app_checkbox": {
                    n2 = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n2) {
                default: {
                    return true;
                }
                case 5: {
                    if (!(boolean)o) {
                        final zf4 zf4 = new zf4(((vo1)this).S1);
                        zf4.q(new String[] { "settings:login_verification:::deselect" });
                        saw.b((okm)zf4);
                        final zf4 zf5 = new zf4(((vo1)this).S1);
                        zf5.q(new String[] { "settings:login_verification:unenroll::impression" });
                        saw.b((okm)zf5);
                        final rgv z2 = this.Z1;
                        Objects.requireNonNull(z2);
                        o = new xil$b(6);
                        ((xil$a)o).H(2131953132);
                        ((xil$a)o).A(2131953131);
                        ((xil$a)o).F(2131959652);
                        ((xil$a)o).C(2131955430);
                        final wil wil = (wil)((dl1$a)o).w();
                        ((cl1)wil).T1 = (mw8)z2;
                        final int a2 = w4j.a;
                        ((cl1)wil).Q1 = (jw8)z2;
                        ((cl1)wil).S1 = (lw8)z2;
                        ((cl1)wil).e2(z2.a(), "disabled_login_verification_dialog");
                    }
                    return false;
                }
                case 2:
                case 3: {
                    if (o) {
                        if (m2()) {
                            if (dta.b().b("ocf_2fa_enrollment_native_security_key_flow_enabled", false)) {
                                o = new ldj$a((Context)((Fragment)this).H1());
                                final sbs$a sbs$a = new sbs$a();
                                sbs$a.p("two-factor-security-key-enrollment");
                                ((ldj$a)o).d = (sbs)((h4j)sbs$a).e();
                                ((Fragment)this).V1(((ldj)((h4j)o).e()).a());
                            }
                            else {
                                final rgv z3 = this.Z1;
                                Objects.requireNonNull(z3);
                                o = new xil$b(18);
                                ((xil$a)o).H(2131959274);
                                ((xil$a)o).A(2131959273);
                                ((xil$a)o).C(2131952375);
                                ((xil$a)o).F(2131955564);
                                final wil wil2 = (wil)((dl1$a)o).w();
                                ((cl1)wil2).T1 = (mw8)z3;
                                final int a3 = w4j.a;
                                ((cl1)wil2).Q1 = (jw8)z3;
                                ((cl1)wil2).S1 = (lw8)z3;
                                ((cl1)wil2).e2(z3.a(), "u2f_enrollment_add_key_dialog");
                            }
                        }
                        else {
                            final rgv z4 = this.Z1;
                            Objects.requireNonNull(z4);
                            o = new xil$b(14);
                            ((xil$a)o).H(2131959276);
                            ((xil$a)o).A(2131959275);
                            ((xil$a)o).E(2131954538);
                            ((xil$a)o).F(2131954239);
                            final wil wil3 = (wil)((dl1$a)o).w();
                            ((cl1)wil3).T1 = (mw8)z4;
                            final int a4 = w4j.a;
                            ((cl1)wil3).Q1 = (jw8)z4;
                            ((cl1)wil3).S1 = (lw8)z4;
                            ((cl1)wil3).e2(z4.a(), "u2f_enrollment_ineligible_dialog");
                        }
                    }
                    else {
                        this.r2.a(wgv.F0);
                    }
                    return false;
                }
                case 1:
                case 6: {
                    if (o) {
                        if (dta.b().b("ocf_2fa_enrollment_enabled", false)) {
                            o = new ldj$a((Context)((Fragment)this).H1());
                            final sbs$a sbs$a2 = new sbs$a();
                            sbs$a2.p("two-factor-sms-enrollment");
                            ((ldj$a)o).d = (sbs)((h4j)sbs$a2).e();
                            ((Fragment)this).V1(((ldj)((h4j)o).e()).a());
                        }
                        else {
                            this.v2.d((kmm)new ygv(((vo1)this).S1, "two_factor_auth_sms", ((Fragment)this).W0(2131959272)));
                        }
                    }
                    else {
                        this.r2.a(wgv.D0);
                    }
                    return false;
                }
                case 0:
                case 4: {
                    if (o) {
                        if (dta.b().b("ocf_2fa_enrollment_enabled", false)) {
                            o = new ldj$a((Context)((Fragment)this).H1());
                            final sbs$a sbs$a3 = new sbs$a();
                            sbs$a3.p("two-factor-auth-app-enrollment");
                            ((ldj$a)o).d = (sbs)((h4j)sbs$a3).e();
                            ((Fragment)this).V1(((ldj)((h4j)o).e()).a());
                        }
                        else {
                            this.v2.d((kmm)new ygv(((vo1)this).S1, "two_factor_auth_totp", ((Fragment)this).W0(2131959272)));
                        }
                    }
                    else {
                        this.r2.a(wgv.E0);
                    }
                    return false;
                }
            }
        }
    }
    
    public final void t2(final int n) {
        final rgv z1 = this.Z1;
        if (z1.E0 == null) {
            (z1.E0 = xgl.n2(n)).e2(z1.a(), "progress_dialog");
        }
    }
    
    public final void u2(String a) {
        final zf4 zf4 = new zf4(((vo1)this).S1);
        zf4.q(new String[] { a });
        saw.b((okm)zf4);
        this.t2(2131954879);
        final UserIdentifier x1 = this.X1;
        if (nbg.c(((vo1)this).S1)) {
            a = nbg.a(((vo1)this).S1);
        }
        else {
            a = null;
        }
        final tuv tuv = new tuv(x1, a);
        if (this.d2) {
            tuv.j1 = 1;
        }
        this.t2.d((kmm)tuv);
    }
    
    public final void v2(final wgv wgv) {
        final tth$a y1 = this.Y1;
        List list;
        if (y1 != null) {
            list = ((HashMap<K, List>)y1).get(wgv);
        }
        else {
            list = null;
        }
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.x2.d((kmm)new zgv(((vo1)this).S1, (long)iterator.next(), wgv));
            }
            return;
        }
        throw new IllegalStateException("Trying to unenroll in a two factor auth method which has no method id.");
    }
    
    public final boolean w0(final Preference preference) {
        final String n0 = preference.N0;
        if ("login_verification_generate_code".equals(n0) || "two_factor_auth_backup_code".equals(n0)) {
            ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)BackupCodeActivity.class).putExtra("bc_account_id", ((vo1)this).S1.getId()));
            return true;
        }
        if ("login_verification_check_requests".equals(n0)) {
            this.v0().h().b((ContentViewArgs)new LoginVerificationArgs(this.X1));
            return true;
        }
        if ("temporary_app_password".equals(n0) || "two_factor_auth_temporary_app_password".equals(n0)) {
            ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)TemporaryAppPasswordActivity.class).putExtra("account_id", ((vo1)this).S1.getId()));
            return true;
        }
        if ("two_factor_auth_in_app_totp_code_generator".equals(n0)) {
            ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)TotpGeneratorActivity.class).putExtra("TotpGeneratorActivity_account_id", ((vo1)this).S1.getId()));
            return true;
        }
        if ("two_factor_auth_manage_u2f_keys".equals(n0) && m2()) {
            final rgv z1 = this.Z1;
            Objects.requireNonNull(z1);
            final xil$b xil$b = new xil$b(19);
            ((xil$a)xil$b).H(2131959278);
            ((xil$a)xil$b).A(2131959277);
            ((xil$a)xil$b).C(2131952375);
            ((xil$a)xil$b).F(2131955564);
            final wil wil = (wil)((dl1$a)xil$b).w();
            ((cl1)wil).T1 = (mw8)z1;
            final int a = w4j.a;
            ((cl1)wil).Q1 = (jw8)z1;
            ((cl1)wil).S1 = (lw8)z1;
            ((cl1)wil).e2(z1.a(), "u2f_enrollment_manage_key_dialog");
            return true;
        }
        return false;
    }
}
