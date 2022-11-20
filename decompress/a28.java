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

public class a28 extends bnd implements Preference$d
{
    public static final int f2 = 0;
    public LinkableSwitchPreferenceCompat Y1;
    public LinkableSwitchPreferenceCompat Z1;
    public LinkableSwitchPreferenceCompat a2;
    public LinkableSwitchPreferenceCompat b2;
    public boolean c2;
    public z9j<ajw> d2;
    public z9j<j39> e2;
    
    public a28() {
        this.c2 = false;
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213786);
        final Preference c0 = ((d)this).c0((CharSequence)"dm_nsfw_filter");
        final int a = c5j.a;
        final LinkableSwitchPreferenceCompat z1 = (LinkableSwitchPreferenceCompat)c0;
        this.Z1 = z1;
        ((Preference)z1).H0 = (Preference$d)this;
        final LinkableSwitchPreferenceCompat y1 = (LinkableSwitchPreferenceCompat)((d)this).c0((CharSequence)"allow_dms_from");
        this.Y1 = y1;
        ((Preference)y1).H0 = (Preference$d)this;
        final LinkableSwitchPreferenceCompat a2 = (LinkableSwitchPreferenceCompat)((d)this).c0((CharSequence)"dm_read_receipts");
        this.a2 = a2;
        ((Preference)a2).H0 = (Preference$d)this;
        final LinkableSwitchPreferenceCompat b2 = (LinkableSwitchPreferenceCompat)((d)this).c0((CharSequence)"dm_quality_filter");
        this.b2 = b2;
        ((Preference)b2).H0 = (Preference$d)this;
    }
    
    public final void c2() {
        super.c2();
        final ziw a = zcw.d().A();
        ((TwoStatePreference)this.Y1).Y(a.a());
        final LinkableSwitchPreferenceCompat a2 = this.a2;
        if (a2 != null) {
            ((TwoStatePreference)a2).Y(a.c());
        }
        final LinkableSwitchPreferenceCompat b2 = this.b2;
        if (b2 != null) {
            ((TwoStatePreference)b2).Y(a.b());
            ((Preference)this.b2).U(a.a());
        }
        final LinkableSwitchPreferenceCompat z1 = this.Z1;
        if (z1 != null) {
            ((Preference)z1).U(xli.h0());
            ((TwoStatePreference)this.Z1).Y(a.z);
        }
    }
    
    @Override
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        this.c2 = ((Fragment)this).J0.getBoolean("coming_from_global_settings");
        this.d2 = ((i5f)nh.b((mdc)this, (Class)i5f.class)).c5().a(ajw.class);
        this.e2 = ((i5f)nh.b((mdc)this, (Class)i5f.class)).c5().a(j39.class);
    }
    
    public final boolean q0(final Preference preference, Object o) {
        final String o2 = preference.O0;
        if (o2 == null) {
            return false;
        }
        final adw d = zcw.d();
        final bm7 v2 = h28.a(super.T1).v2();
        int n = -1;
        switch (o2) {
            case "allow_dms_from": {
                n = 3;
                break;
            }
            case "dm_quality_filter": {
                n = 2;
                break;
            }
            case "dm_read_receipts": {
                n = 1;
                break;
            }
            case "dm_nsfw_filter": {
                n = 0;
                break;
            }
            default:
                break;
        }
        String m0 = "global_settings_menu";
        String s = "enable";
        if (n == 0) {
            final boolean booleanValue = (boolean)o;
            d.m((ryt<ziw$a, ziw$a>)new z18(booleanValue));
            this.e2.d(new j39(super.T1, booleanValue));
            final UserIdentifier t1 = super.T1;
            if (!booleanValue) {
                s = "disable";
            }
            o = new af4(t1);
            ((u0p)o).q(new String[] { "settings:privacy::dm_nsfw_filter_setting", s });
            cbw.b((elm)o);
            h28.a(super.T1).t3().dismiss();
            v2.f();
            return true;
        }
        if (n == 1) {
            final boolean equals = Boolean.TRUE.equals(o);
            pbu.d(super.T1).i().f("dm_read_receipts", equals).e();
            d.m((ryt<ziw$a, ziw$a>)new wzk(equals, 1));
            final z9j<ajw> d2 = this.d2;
            final ejw v3 = ejw.v(((Fragment)this).J1(), d);
            String s2;
            if (equals) {
                s2 = "all_enabled";
            }
            else {
                s2 = "all_disabled";
            }
            v3.p("dm_receipt_setting", s2);
            d2.d((ajw)((n4j)v3).e());
            final UserIdentifier t2 = super.T1;
            if (!equals) {
                s = "disable";
            }
            o = new af4(t2);
            ((u0p)o).q(new String[] { "settings:privacy::read_receipts_setting", s });
            if (!this.c2) {
                m0 = "dm_tab";
            }
            ((af4)o).M0 = m0;
            cbw.b((elm)o);
            return true;
        }
        if (n == 2) {
            final boolean equals2 = Boolean.TRUE.equals(o);
            d.m((ryt<ziw$a, ziw$a>)new y18(equals2));
            final z9j<ajw> d3 = this.d2;
            final ejw v4 = ejw.v(((Fragment)this).J1(), d);
            String s3;
            if (equals2) {
                s3 = "enabled";
            }
            else {
                s3 = "disabled";
            }
            v4.p("dm_quality_filter", s3);
            d3.d((ajw)((n4j)v4).e());
            final UserIdentifier t3 = super.T1;
            if (!equals2) {
                s = "disable";
            }
            o = new af4(t3);
            ((u0p)o).q(new String[] { "settings:privacy::dm_quality_filter_setting", s });
            if (!this.c2) {
                m0 = "dm_tab";
            }
            ((af4)o).M0 = m0;
            cbw.b((elm)o);
            v2.f();
            return true;
        }
        if (n != 3) {
            return false;
        }
        final boolean equals3 = Boolean.TRUE.equals(o);
        d.m((ryt<ziw$a, ziw$a>)new yzk(equals3, 1));
        final z9j<ajw> d4 = this.d2;
        final ejw v5 = ejw.v(((Fragment)this).J1(), d);
        String s4;
        if (equals3) {
            s4 = "all";
        }
        else {
            s4 = "following";
        }
        v5.p("allow_dms_from", s4);
        d4.d((ajw)((n4j)v5).e());
        final UserIdentifier t4 = super.T1;
        if (!equals3) {
            s = "disable";
        }
        o = new af4(t4);
        ((u0p)o).q(new String[] { "settings:privacy::receive_dms_from_anyone", s });
        if (!this.c2) {
            m0 = "dm_tab";
        }
        ((af4)o).M0 = m0;
        cbw.b((elm)o);
        final LinkableSwitchPreferenceCompat b2 = this.b2;
        if (b2 != null) {
            ((Preference)b2).U(equals3);
        }
        v2.f();
        return true;
    }
}
