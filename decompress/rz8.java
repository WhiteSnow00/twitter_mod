import androidx.preference.TwoStatePreference;
import androidx.fragment.app.Fragment;
import androidx.preference.d;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.RemoveContactsActivityArgs;
import com.twitter.util.user.UserIdentifier;
import androidx.preference.Preference;
import com.twitter.settings.widget.LinkableSwitchPreferenceCompat;
import androidx.preference.SwitchPreference;
import android.os.Bundle;
import kotlin.Metadata;
import androidx.preference.Preference$d;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007" }, d2 = { "Lrz8;", "Lynd;", "Landroidx/preference/Preference$e;", "Landroidx/preference/Preference$d;", "<init>", "()V", "a", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class rz8 extends ynd implements Preference$e, Preference$d
{
    public static final rz8.rz8$a Companion;
    public final u3s X1;
    public final u3s Y1;
    public final u3s Z1;
    public final u3s a2;
    public final u3s b2;
    public final u3s c2;
    public jo<String> d2;
    
    static {
        Companion = new rz8.rz8$a();
    }
    
    public rz8() {
        this.X1 = (u3s)rp2.z0((otb)new rz8$c(this));
        this.Y1 = (u3s)rp2.z0((otb)new rz8$f(this));
        this.Z1 = (u3s)rp2.z0((otb)new rz8$d(this));
        this.a2 = (u3s)rp2.z0((otb)new rz8$g(this));
        this.b2 = (u3s)rp2.z0((otb)new rz8$b(this));
        this.c2 = (u3s)rp2.z0((otb)new rz8$e(this));
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213779);
        ((Preference)this.f2()).G0 = (Preference$d)this;
        ((Preference)this.i2()).G0 = (Preference$d)this;
        ((Preference)this.g2()).G0 = (Preference$d)this;
        this.j2().T((CharSequence)ajy.o(((Fragment)this).U0().getString(2131956981), -65536));
        this.j2().H0 = (Preference$e)this;
    }
    
    public final void c2() {
        super.c2();
        ((TwoStatePreference)this.g2()).Y(this.h2().d());
        ((TwoStatePreference)this.f2()).Y(ncw.b(((vo1)this).S1).A().i);
        final psc c = psc.c();
        zzd.e((Object)c, "get()");
        ((Preference)this.f2()).R((CharSequence)((Fragment)this).W0(2131957751));
        final k0a k0a = new k0a(((vo1)this).S1);
        ((kmm)k0a).U((cw0$b)new tz8(this));
        c.f((ksc)k0a);
        final eck a = eck.a(((vo1)this).S1);
        zzd.e((Object)a, "forAccount(owner)");
        ((TwoStatePreference)this.i2()).Y(ncw.b(((vo1)this).S1).A().n);
        ((Preference)this.i2()).R((CharSequence)((Fragment)this).W0(2131957894));
        if (!a.b() && !a.b) {
            ((Preference)this.i2()).R((CharSequence)((Fragment)this).W0(2131957734));
        }
        else {
            rbk.Companion.a().a((rbk.a)new on3((Object)this, 18));
        }
    }
    
    public final SwitchPreference f2() {
        return (SwitchPreference)this.X1.getValue();
    }
    
    public final LinkableSwitchPreferenceCompat g2() {
        return (LinkableSwitchPreferenceCompat)this.Z1.getValue();
    }
    
    public final x1g h2() {
        return (x1g)this.c2.getValue();
    }
    
    public final SwitchPreference i2() {
        return (SwitchPreference)this.Y1.getValue();
    }
    
    public final Preference j2() {
        return (Preference)this.a2.getValue();
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        this.d2 = (bob)((Fragment)this).G1((fo)new ho(), (eo)new fcn((Object)this, 8));
    }
    
    public final void k2() {
        ((uz8)this.b2.getValue()).b();
        final boolean c = this.h2().c();
        this.h2().e(2);
        if (c) {
            final al6 a = al6.Companion.a();
            final UserIdentifier s1 = ((vo1)this).S1;
            zzd.e((Object)s1, "owner");
            a.c(s1, (rtb)new sz8(this));
        }
    }
    
    public final boolean r0(final Preference preference, final Object o) {
        zzd.f((Object)preference, "preference");
        final boolean a = zzd.a(o, (Object)Boolean.TRUE);
        final ocw b = ncw.b(((vo1)this).S1);
        zzd.e((Object)b, "get(owner)");
        final String n0 = preference.N0;
        boolean b2 = true;
        if (n0 != null) {
            final int hashCode = n0.hashCode();
            if (hashCode != -1836600111) {
                if (hashCode != 1169312176) {
                    if (hashCode == 1179335554) {
                        if (n0.equals("discoverable_by_phone")) {
                            final liw v = liw.v(((Fragment)this).J1(), b);
                            v.q("discoverable_by_mobile_phone", a);
                            psc.c().f((ksc)((h4j)v).e());
                            return b2;
                        }
                    }
                }
                else if (n0.equals("discoverable_by_email")) {
                    final liw v2 = liw.v(((Fragment)this).J1(), b);
                    v2.q("discoverable_by_email", a);
                    psc.c().f((ksc)((h4j)v2).e());
                    return b2;
                }
            }
            else if (n0.equals("upload_contacts")) {
                if (!a) {
                    this.h2().e(1);
                    ((uz8)this.b2.getValue()).a();
                    return b2;
                }
                final y6k d = y6k.d();
                zzd.e((Object)d, "getInstance()");
                if (d.a(((Fragment)this).J1(), new String[] { "android.permission.READ_CONTACTS" })) {
                    ((Fragment)this).J1();
                    this.k2();
                    return b2;
                }
                final bob d2 = this.d2;
                if (d2 != null) {
                    d2.a((Object)"android.permission.READ_CONTACTS");
                    return false;
                }
                zzd.m("permissionContract");
                throw null;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final boolean w0(final Preference preference) {
        zzd.f((Object)preference, "preference");
        if (zzd.a((Object)preference, (Object)this.j2())) {
            this.v0().h().b((ContentViewArgs)new RemoveContactsActivityArgs());
            return true;
        }
        return false;
    }
}
