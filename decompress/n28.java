import androidx.fragment.app.Fragment;
import androidx.preference.TwoStatePreference;
import androidx.preference.d;
import com.twitter.util.user.UserIdentifier;
import androidx.preference.Preference;
import android.os.Bundle;
import com.twitter.settings.widget.LinkableSwitchPreferenceCompat;
import androidx.preference.Preference$d;

// 
// Decompiled by Procyon v0.6.0
// 

public class n28 extends ynd implements Preference$d
{
    public LinkableSwitchPreferenceCompat X1;
    public LinkableSwitchPreferenceCompat Y1;
    public LinkableSwitchPreferenceCompat Z1;
    public LinkableSwitchPreferenceCompat a2;
    public boolean b2;
    public t9j<hiw> c2;
    public t9j<a49> d2;
    
    public n28() {
        this.b2 = false;
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213786);
        final Preference d0 = ((d)this).d0((CharSequence)"dm_nsfw_filter");
        final int a = w4j.a;
        final LinkableSwitchPreferenceCompat y1 = (LinkableSwitchPreferenceCompat)d0;
        this.Y1 = y1;
        ((Preference)y1).G0 = (Preference$d)this;
        final LinkableSwitchPreferenceCompat x1 = (LinkableSwitchPreferenceCompat)((d)this).d0((CharSequence)"allow_dms_from");
        this.X1 = x1;
        ((Preference)x1).G0 = (Preference$d)this;
        final LinkableSwitchPreferenceCompat z1 = (LinkableSwitchPreferenceCompat)((d)this).d0((CharSequence)"dm_read_receipts");
        this.Z1 = z1;
        ((Preference)z1).G0 = (Preference$d)this;
        final LinkableSwitchPreferenceCompat a2 = (LinkableSwitchPreferenceCompat)((d)this).d0((CharSequence)"dm_quality_filter");
        this.a2 = a2;
        ((Preference)a2).G0 = (Preference$d)this;
    }
    
    public final void c2() {
        super.c2();
        final giw a = ncw.d().A();
        ((TwoStatePreference)this.X1).Y(a.a());
        final LinkableSwitchPreferenceCompat z1 = this.Z1;
        if (z1 != null) {
            ((TwoStatePreference)z1).Y(a.c());
        }
        final LinkableSwitchPreferenceCompat a2 = this.a2;
        if (a2 != null) {
            ((TwoStatePreference)a2).Y(a.b());
            ((Preference)this.a2).U(a.a());
        }
        final LinkableSwitchPreferenceCompat y1 = this.Y1;
        if (y1 != null) {
            ((Preference)y1).U(poa.g0());
            ((TwoStatePreference)this.Y1).Y(a.z);
        }
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        this.b2 = ((Fragment)this).I0.getBoolean("coming_from_global_settings");
        this.c2 = (t9j<hiw>)((y5f)p88.b((mec)this, (Class)y5f.class)).c5().a((Class)hiw.class);
        this.d2 = (t9j<a49>)((y5f)p88.b((mec)this, (Class)y5f.class)).c5().a((Class)a49.class);
    }
    
    public final boolean r0(final Preference preference, Object o) {
        final String n0 = preference.N0;
        if (n0 == null) {
            return false;
        }
        final ocw d = ncw.d();
        final um7 v2 = u28.a(((vo1)this).S1).v2();
        int n2 = -1;
        switch (n0) {
            case "allow_dms_from": {
                n2 = 3;
                break;
            }
            case "dm_quality_filter": {
                n2 = 2;
                break;
            }
            case "dm_read_receipts": {
                n2 = 1;
                break;
            }
            case "dm_nsfw_filter": {
                n2 = 0;
                break;
            }
            default:
                break;
        }
        String m0 = "global_settings_menu";
        String s = "enable";
        if (n2 == 0) {
            final boolean booleanValue = (boolean)o;
            d.m((byt)new l28(booleanValue, 0));
            this.d2.d((kmm)new a49(((vo1)this).S1, booleanValue));
            final UserIdentifier s2 = ((vo1)this).S1;
            if (!booleanValue) {
                s = "disable";
            }
            o = new zf4(s2);
            ((d0p)o).q(new String[] { "settings:privacy::dm_nsfw_filter_setting", s });
            saw.b((okm)o);
            u28.a(((vo1)this).S1).t3().dismiss();
            v2.f();
            return true;
        }
        if (n2 == 1) {
            final boolean equals = Boolean.TRUE.equals(o);
            wau.d(((vo1)this).S1).i().f("dm_read_receipts", equals).e();
            d.m((byt)new nzk(equals, 1));
            final t9j<hiw> c2 = this.c2;
            final liw v3 = liw.v(((Fragment)this).J1(), d);
            String s3;
            if (equals) {
                s3 = "all_enabled";
            }
            else {
                s3 = "all_disabled";
            }
            v3.p("dm_receipt_setting", s3);
            c2.d((kmm)((h4j)v3).e());
            final UserIdentifier s4 = ((vo1)this).S1;
            if (!equals) {
                s = "disable";
            }
            o = new zf4(s4);
            ((d0p)o).q(new String[] { "settings:privacy::read_receipts_setting", s });
            if (!this.b2) {
                m0 = "dm_tab";
            }
            ((zf4)o).M0 = m0;
            saw.b((okm)o);
            return true;
        }
        if (n2 == 2) {
            final boolean equals2 = Boolean.TRUE.equals(o);
            d.m((byt)new m28(equals2));
            final t9j<hiw> c3 = this.c2;
            final liw v4 = liw.v(((Fragment)this).J1(), d);
            String s5;
            if (equals2) {
                s5 = "enabled";
            }
            else {
                s5 = "disabled";
            }
            v4.p("dm_quality_filter", s5);
            c3.d((kmm)((h4j)v4).e());
            final UserIdentifier s6 = ((vo1)this).S1;
            if (!equals2) {
                s = "disable";
            }
            o = new zf4(s6);
            ((d0p)o).q(new String[] { "settings:privacy::dm_quality_filter_setting", s });
            if (!this.b2) {
                m0 = "dm_tab";
            }
            ((zf4)o).M0 = m0;
            saw.b((okm)o);
            v2.f();
            return true;
        }
        if (n2 != 3) {
            return false;
        }
        final boolean equals3 = Boolean.TRUE.equals(o);
        d.m((byt)new ozk(equals3, 1));
        final t9j<hiw> c4 = this.c2;
        final liw v5 = liw.v(((Fragment)this).J1(), d);
        String s7;
        if (equals3) {
            s7 = "all";
        }
        else {
            s7 = "following";
        }
        v5.p("allow_dms_from", s7);
        c4.d((kmm)((h4j)v5).e());
        final UserIdentifier s8 = ((vo1)this).S1;
        if (!equals3) {
            s = "disable";
        }
        o = new zf4(s8);
        ((d0p)o).q(new String[] { "settings:privacy::receive_dms_from_anyone", s });
        if (!this.b2) {
            m0 = "dm_tab";
        }
        ((zf4)o).M0 = m0;
        saw.b((okm)o);
        final LinkableSwitchPreferenceCompat a2 = this.a2;
        if (a2 != null) {
            ((Preference)a2).U(equals3);
        }
        v2.f();
        return true;
    }
}
