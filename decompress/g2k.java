import androidx.fragment.app.Fragment;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g2k extends yjf
{
    public g2k(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final t8p t8p) {
        super(intent, r8x, resources, kas, pwe, jn, cnb, faf, hag, layoutInflater, xba, userIdentifier, xbv, pwe2, f6g, v8p, vam, obi, i7p, t8p);
    }
    
    public static String Z4(final Intent intent, final String s) {
        final Uri data = intent.getData();
        if (data != null) {
            return data.getQueryParameter(s);
        }
        return null;
    }
    
    @Override
    public final a W4(final Intent intent, final xbv xbv) {
        final r2k r2k = new r2k();
        final q2k.a a = new q2k.a();
        final StringBuilder j = fu8.j("connect-tab-");
        j.append(Z4(intent, "template_name"));
        j.append("-");
        j.append(Z4(intent, "module_id"));
        j.append("-");
        j.append(Z4(intent, "user_id"));
        a.v(j.toString());
        ((Fragment)r2k).N1(((vl1)((n4j)a).e()).a);
        return new a((umd)r2k);
    }
    
    @Override
    public final CharSequence X4(final Intent intent) {
        String z4;
        if (((u9)this).L0.getBooleanExtra("is_internal", false)) {
            z4 = Z4(intent, "subtitle");
        }
        else {
            z4 = null;
        }
        return z4;
    }
    
    @Override
    public final CharSequence Y4(final Intent intent) {
        final String z4 = Z4(intent, "title");
        if (((u9)this).L0.getBooleanExtra("is_internal", false) && !ikr.e((CharSequence)z4)) {
            return z4;
        }
        return ((u9)this).H4(2131955664);
    }
}
