import androidx.fragment.app.Fragment;
import androidx.preference.d;
import android.content.res.Resources;
import java.util.Objects;
import androidx.preference.Preference;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.os.Bundle;
import androidx.preference.ListPreference;
import com.twitter.settings.widget.LinkableSwitchPreferenceCompat;
import kotlin.Metadata;
import androidx.preference.Preference$d;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lpy0;", "Lynd;", "Landroidx/preference/Preference$d;", "<init>", "()V", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class py0 extends ynd implements Preference$d
{
    public uzk X1;
    public hu6 Y1;
    public LinkableSwitchPreferenceCompat Z1;
    public ListPreference a2;
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213769);
        this.X1 = new uzk((Context)((Fragment)this).L0(), ((vo1)this).S1, ncw.d(), new q3k(((vo1)this).S1, (String)null), psc.c());
        this.Y1 = new hu6(((vo1)this).S1, ((Fragment)this).U0());
        final LinkableSwitchPreferenceCompat z1 = (LinkableSwitchPreferenceCompat)((d)this).d0((CharSequence)"protected");
        this.Z1 = z1;
        if (z1 != null) {
            ((Preference)z1).G0 = (Preference$d)this;
        }
        final ListPreference a2 = (ListPreference)((d)this).d0((CharSequence)"allow_media_tagging");
        this.a2 = a2;
        if (a2 != null) {
            ((Preference)a2).G0 = (Preference$d)this;
        }
    }
    
    public final void e2() {
        jhd.b((t2e)this).i((rj)new bzo(ncw.b(UserIdentifier.Companion.c()).l().subscribeOn(yvo.c()).observeOn(h6q.L()).subscribe((fk6)new sna((rtb)new py0$a(this), 17)), 4));
    }
    
    public final boolean r0(final Preference preference, Object o) {
        if (o == null) {
            return false;
        }
        final uzk x1 = this.X1;
        if (x1 == null) {
            zzd.m("privacyAndSafetyHelper");
            throw null;
        }
        String n0;
        if (preference != null) {
            n0 = preference.N0;
        }
        else {
            n0 = null;
        }
        final hu6 y1 = this.Y1;
        if (y1 != null) {
            if (n0 != null) {
                if (x1.a != null) {
                    int n2 = 0;
                    Label_0338: {
                        switch (n0) {
                            case "allow_dms_from": {
                                n2 = 9;
                                break Label_0338;
                            }
                            case "periscope_auth": {
                                n2 = 8;
                                break Label_0338;
                            }
                            case "discoverable_by_email": {
                                n2 = 7;
                                break Label_0338;
                            }
                            case "nsfw_user": {
                                n2 = 6;
                                break Label_0338;
                            }
                            case "dm_read_receipts": {
                                n2 = 5;
                                break Label_0338;
                            }
                            case "protected": {
                                n2 = 4;
                                break Label_0338;
                            }
                            case "discoverable_by_mobile_phone": {
                                n2 = 3;
                                break Label_0338;
                            }
                            case "pref_audiospaces_share_listening_data": {
                                n2 = 2;
                                break Label_0338;
                            }
                            case "display_sensitive_media": {
                                n2 = 1;
                                break Label_0338;
                            }
                            case "allow_media_tagging": {
                                n2 = 0;
                                break Label_0338;
                            }
                            default:
                                break;
                        }
                        n2 = -1;
                    }
                    String s = "enable";
                    switch (n2) {
                        default: {
                            return false;
                        }
                        case 9: {
                            final boolean equals = Boolean.TRUE.equals(o);
                            x1.d.m((byt)new pzk(equals, 0));
                            final psc e = x1.e;
                            final liw a = x1.a(x1.a);
                            String s2;
                            if (equals) {
                                s2 = "all";
                            }
                            else {
                                s2 = "following";
                            }
                            a.p("allow_dms_from", s2);
                            e.f((ksc)((h4j)a).e());
                            break;
                        }
                        case 8: {
                            ij1.b(!dta.b().b("connect_to_periscope_deprecated", false) && (x1.d.A().j ^ true));
                            final Boolean true = Boolean.TRUE;
                            final boolean equals2 = true.equals(o);
                            x1.d.m((byt)new ozk(equals2, 0));
                            final psc e2 = x1.e;
                            final liw a2 = x1.a(x1.a);
                            a2.q("allow_authenticated_periscope_requests", equals2);
                            e2.f((ksc)((h4j)a2).e());
                            final q3k b = x1.b;
                            final boolean equals3 = true.equals(o);
                            Objects.requireNonNull(b);
                            o = new zf4(b.b);
                            if (!equals3) {
                                s = "disable";
                            }
                            ((d0p)o).T = nca.g("settings", "privacy", "toggle", "connect_to_periscope", s).toString();
                            final int a3 = w4j.a;
                            saw.b((okm)o);
                            break;
                        }
                        case 7: {
                            final boolean equals4 = Boolean.TRUE.equals(o);
                            x1.d.m((byt)new oz8(equals4, 1));
                            final psc e3 = x1.e;
                            final liw a4 = x1.a(x1.a);
                            a4.q("discoverable_by_email", equals4);
                            e3.f((ksc)((h4j)a4).e());
                            break;
                        }
                        case 6: {
                            final Boolean b2 = (Boolean)o;
                            x1.d.m((byt)new qzk(o));
                            final psc e4 = x1.e;
                            final liw a5 = x1.a(x1.a);
                            final boolean booleanValue = b2;
                            a5.q("include_nsfw_user_flag", true);
                            a5.q("include_nsfw_admin_flag", true);
                            a5.q("nsfw_user", booleanValue);
                            e4.f((ksc)((h4j)a5).e());
                            if (b2) {
                                saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "mark_media_sensitive", "enable")));
                                break;
                            }
                            saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "mark_media_sensitive", "disable")));
                            break;
                        }
                        case 5: {
                            final boolean equals5 = Boolean.TRUE.equals(o);
                            wau.d(x1.c).i().f("dm_read_receipts", equals5).e();
                            x1.d.m((byt)new tzk(equals5));
                            final psc e5 = x1.e;
                            final liw a6 = x1.a(x1.a);
                            String s3;
                            if (equals5) {
                                s3 = "all_enabled";
                            }
                            else {
                                s3 = "all_disabled";
                            }
                            a6.p("dm_receipt_setting", s3);
                            e5.f((ksc)((h4j)a6).e());
                            if (!equals5) {
                                s = "disable";
                            }
                            saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "read_receipts_setting", s)));
                            break;
                        }
                        case 4: {
                            final Boolean b3 = (Boolean)o;
                            x1.d.m((byt)new rzk(o));
                            final psc e6 = x1.e;
                            final liw a7 = x1.a(x1.a);
                            a7.q("protected", (boolean)b3);
                            e6.f((ksc)((h4j)a7).e());
                            if (b3) {
                                saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "protected", "enable")));
                                break;
                            }
                            saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "protected", "disable")));
                            break;
                        }
                        case 3: {
                            final boolean equals6 = Boolean.TRUE.equals(o);
                            x1.d.m((byt)new mzk(equals6, 0));
                            final psc e7 = x1.e;
                            final liw a8 = x1.a(x1.a);
                            a8.q("discoverable_by_mobile_phone", equals6);
                            e7.f((ksc)((h4j)a8).e());
                            break;
                        }
                        case 2: {
                            final boolean equals7 = Boolean.TRUE.equals(o);
                            x1.d.m((byt)new nzk(equals7, 0));
                            x1.e.f((ksc)new oiw(x1.c, equals7));
                            break;
                        }
                        case 1: {
                            final Boolean b4 = (Boolean)o;
                            x1.d.m((byt)new lzk(o, 0));
                            final psc e8 = x1.e;
                            final liw a9 = x1.a(x1.a);
                            a9.q("display_sensitive_media", (boolean)b4);
                            e8.f((ksc)((h4j)a9).e());
                            if (b4) {
                                saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "display_sensitive_media", "enable")));
                                break;
                            }
                            saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("settings", "privacy", "", "display_sensitive_media", "disable")));
                            break;
                        }
                        case 0: {
                            final String s4 = (String)o;
                            x1.d.m((byt)new szk((Object)s4));
                            final psc e9 = x1.e;
                            final liw a10 = x1.a(x1.a);
                            a10.p("allow_media_tagging", s4);
                            a10.r((hiw.a)a10.h);
                            e9.f((ksc)((h4j)a10).e());
                            if (s4.equals(((Resources)y1.b).getString(2131954998))) {
                                saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("privacy_settings", "who_can_tag_me", "", "from_anyone", "select")));
                                break;
                            }
                            if (s4.equals(((Resources)y1.b).getString(2131954999))) {
                                saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("privacy_settings", "who_can_tag_me", "", "from_people_you_follow", "select")));
                                break;
                            }
                            if (s4.equals(((Resources)y1.b).getString(2131955000))) {
                                saw.b((okm)new zf4((UserIdentifier)y1.a, nca.g("privacy_settings", "who_can_tag_me", "", "", "deselect")));
                                break;
                            }
                            break;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        zzd.m("privacyAndSafetyScribeReporter");
        throw null;
    }
}
