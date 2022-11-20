import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fg1 extends vbv
{
    public fg1(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final Bundle bundle, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        final long longExtra = intent.getLongExtra("bc_account_id", 0L);
        final boolean booleanExtra = intent.getBooleanExtra("show_welcome", false);
        if (bundle == null) {
            final jg1 jg1 = new jg1();
            final vl1$b vl1$b = new vl1$b(intent.getExtras());
            if (longExtra > 0L) {
                ((vl1$a)vl1$b).o("show_welcome", booleanExtra);
                ((vl1$a)vl1$b).r("bc_account_id", longExtra);
            }
            ((Fragment)jg1).N1(((vl1)((n4j)vl1$b).e()).a);
            final a a = new a(((u9)this).I4());
            a.e(2131429268, (Fragment)jg1, (String)null, 1);
            a.c();
        }
    }
}
