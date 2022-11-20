import androidx.fragment.app.Fragment;
import androidx.preference.d;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import androidx.preference.Preference;
import android.os.Bundle;
import kotlin.Metadata;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Lan0;", "Lbnd;", "Landroidx/preference/Preference$e;", "<init>", "()V", "a", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class an0 extends bnd implements Preference$e
{
    private static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213768);
        final Preference c0 = ((d)this).c0((CharSequence)"pref_preferred_lang");
        c0.R((CharSequence)m5s.d().getDisplayLanguage());
        c0.I0 = (Preference$e)this;
    }
    
    public final boolean w0(final Preference preference) {
        czd.f((Object)preference, "preference");
        boolean b;
        if (czd.a((Object)preference.O0, (Object)"pref_preferred_lang")) {
            final qdj.a a = new qdj.a(((Fragment)this).J1());
            final ncs$a m = zh8.m("app_language_selector");
            m.d = "settings";
            a.d = (ncs)((n4j)m).e();
            final Intent a2 = ((qdj)a.e()).a();
            czd.e((Object)a2, "Builder(requireContext()\u2026)\n                .intent");
            ((Fragment)this).V1(a2);
            final af4 af4 = new af4(UserIdentifier.Companion.c());
            ((u0p)af4).T = vba.Companion.e("settings", "app_language", "update_language", "", "click").toString();
            final int a3 = c5j.a;
            cbw.b((elm)af4);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public static final class a
    {
    }
}
