import android.os.BaseBundle;
import android.app.Dialog;
import androidx.fragment.app.Fragment$InstantiationException;
import android.os.Bundle;
import android.content.DialogInterface;
import java.util.Iterator;
import androidx.fragment.app.p;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiv implements dx8, ax8, cx8
{
    public static final Map<Integer, String> I0;
    public final dob F0;
    public final aiv.aiv$a G0;
    public vhl H0;
    
    static {
        final kkg t = kkg.t();
        t.w((Object)1, (Object)"eligibility_dialog");
        t.w((Object)2, (Object)"no_phone_dialog");
        t.w((Object)3, (Object)"no_verified_email_dialog");
        t.w((Object)4, (Object)"another_device_enrolled_dialog");
        t.w((Object)5, (Object)"enabled_login_verification_dialog");
        t.w((Object)6, (Object)"disabled_login_verification_dialog");
        t.w((Object)7, (Object)"login_initialization_failure_dialog");
        t.w((Object)8, (Object)"no_push_dialog");
        t.w((Object)9, (Object)"sms_unenrollment_method_dialog");
        t.w((Object)10, (Object)"totp_unenrollment_method_dialog");
        t.w((Object)11, (Object)"sms_unenrollment_ineligible_dialog");
        t.w((Object)12, (Object)"disable_2fa_dialog");
        t.w((Object)13, (Object)"u2f_unenrollment_method_dialog");
        t.w((Object)14, (Object)"u2f_enrollment_ineligible_dialog");
        t.w((Object)18, (Object)"u2f_enrollment_add_key_dialog");
        t.w((Object)19, (Object)"u2f_enrollment_manage_key_dialog");
        t.w((Object)15, (Object)"re_enter_password_dialog");
        t.w((Object)16, (Object)"suspended_account_dialog");
        t.w((Object)17, (Object)"no_network_dialog");
        t.w((Object)20, (Object)"single_security_key_dialog");
        I0 = (Map)((z4j)t).e();
    }
    
    public aiv(final dob f0, final aiv.aiv$a g0) {
        this.F0 = f0;
        this.G0 = g0;
        final p p2 = f0.P();
        final Iterator<String> iterator = aiv.I0.values().iterator();
        while (iterator.hasNext()) {
            final bl1 bl1 = (bl1)p2.H((String)iterator.next());
            if (bl1 != null) {
                bl1.W1 = this;
                final int a = o5j.a;
                bl1.T1 = (ax8)this;
                bl1.V1 = (cx8)this;
            }
        }
        this.H0 = (vhl)p2.H("progress_dialog");
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
        final String s = aiv.I0.get(n);
        if (s != null) {
            this.G0.O(s);
        }
    }
    
    public final p a() {
        return this.F0.P();
    }
    
    public final void b() {
        final wjl$b wjl$b = new wjl$b(4);
        ((wjl$a)wjl$b).H(2131954866);
        ((wjl$a)wjl$b).A(2131954862);
        ((wjl$a)wjl$b).F(2131958670);
        ((wjl$a)wjl$b).C(2131952374);
        final vjl vjl = (vjl)((cl1$a)wjl$b).w();
        ((bl1)vjl).W1 = this;
        final int a = o5j.a;
        ((bl1)vjl).T1 = (ax8)this;
        ((bl1)vjl).V1 = (cx8)this;
        ((bl1)vjl).e2(this.a(), "another_device_enrolled_dialog");
    }
    
    public final void c() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 1);
        ((BaseBundle)bundle).putInt("title", 2131959289);
        final int a = o5j.a;
        ((BaseBundle)bundle).putInt("message", 2131959271);
        ((BaseBundle)bundle).putInt("positive_button", 17039370);
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final vjl d = qa3.d(bundle);
            ((bl1)d).W1 = this;
            ((bl1)d).T1 = (ax8)this;
            ((bl1)d).V1 = (cx8)this;
            ((bl1)d).e2(this.a(), "eligibility_dialog");
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
    
    public final void d() {
        final wjl$b wjl$b = new wjl$b(2);
        ((wjl$a)wjl$b).H(2131954866);
        ((wjl$a)wjl$b).A(2131954854);
        ((wjl$a)wjl$b).F(2131951867);
        ((wjl$a)wjl$b).C(2131952374);
        final vjl vjl = (vjl)((cl1$a)wjl$b).w();
        ((bl1)vjl).W1 = this;
        final int a = o5j.a;
        ((bl1)vjl).T1 = (ax8)this;
        ((bl1)vjl).V1 = (cx8)this;
        ((bl1)vjl).e2(this.a(), "no_phone_dialog");
    }
    
    public final void e() {
        final wjl$b wjl$b = new wjl$b(3);
        ((wjl$a)wjl$b).H(2131959287);
        ((wjl$a)wjl$b).A(2131959286);
        ((wjl$a)wjl$b).F(2131955542);
        ((wjl$a)wjl$b).E(2131954538);
        final vjl vjl = (vjl)((cl1$a)wjl$b).w();
        ((bl1)vjl).W1 = this;
        final int a = o5j.a;
        ((bl1)vjl).T1 = (ax8)this;
        ((bl1)vjl).V1 = (cx8)this;
        ((bl1)vjl).e2(this.a(), "no_verified_email_dialog");
    }
    
    public final void f() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 16);
        ((BaseBundle)bundle).putInt("title", 2131959289);
        final int a = o5j.a;
        ((BaseBundle)bundle).putInt("message", 2131959288);
        ((BaseBundle)bundle).putInt("positive_button", 2131955542);
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final vjl d = qa3.d(bundle);
            ((bl1)d).W1 = this;
            ((bl1)d).T1 = (ax8)this;
            ((bl1)d).V1 = (cx8)this;
            ((bl1)d).e2(this.a(), "suspended_account_dialog");
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
    
    public final void g(int a, final String s) {
        final wjl$b wjl$b = new wjl$b(a);
        ((wjl$a)wjl$b).H(2131959296);
        ((wjl$a)wjl$b).A(2131959297);
        ((wjl$a)wjl$b).F(2131959298);
        ((wjl$a)wjl$b).C(2131952374);
        final vjl vjl = (vjl)((cl1$a)wjl$b).w();
        ((bl1)vjl).W1 = this;
        a = o5j.a;
        ((bl1)vjl).T1 = (ax8)this;
        ((bl1)vjl).V1 = (cx8)this;
        ((bl1)vjl).e2(this.a(), s);
    }
    
    @Override
    public final void k0(final Dialog dialog, final int n, final int n2) {
        final String s = aiv.I0.get(n);
        if (s != null) {
            this.G0.h(dialog, s, n2);
        }
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        final String s = aiv.I0.get(n);
        if (s != null) {
            this.G0.x(dialogInterface, s);
        }
    }
}
