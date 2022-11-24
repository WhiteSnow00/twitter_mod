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

public final class ig1 extends kcv
{
    public ig1(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final Bundle bundle, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final long longExtra = intent.getLongExtra("bc_account_id", 0L);
        final boolean booleanExtra = intent.getBooleanExtra("show_welcome", false);
        if (bundle == null) {
            final mg1 mg1 = new mg1();
            final am1$b am1$b = new am1$b(intent.getExtras());
            if (longExtra > 0L) {
                ((am1.a)am1$b).o("show_welcome", booleanExtra);
                ((am1.a)am1$b).r("bc_account_id", longExtra);
            }
            ((Fragment)mg1).N1(((am1)((z4j)am1$b).e()).a);
            final a a = new a(this.I4());
            a.e(2131429268, (Fragment)mg1, (String)null, 1);
            a.c();
        }
    }
}
