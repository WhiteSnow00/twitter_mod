import androidx.fragment.app.a;
import com.twitter.app.common.args.ContentViewArgs;
import androidx.fragment.app.Fragment;
import com.twitter.login.api.LoginVerificationArgs;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbg extends kcv
{
    public nbg(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci fci, final c8p c8p, final Bundle bundle, final LoginVerificationArgs loginVerificationArgs, final m9p m9p) {
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)resources, "resources");
        e0e.f((Object)cbs, "requestRepositoryFactory");
        e0e.f((Object)mxe, "navManager");
        e0e.f((Object)nn, "activityFinisher");
        e0e.f((Object)cbg, "loginController");
        e0e.f((Object)layoutInflater, "layoutInflater");
        e0e.f((Object)userIdentifier, "currentUser");
        e0e.f((Object)mcv, "twitterFragmentActivityOptions");
        e0e.f((Object)mxe2, "fabPresenter");
        e0e.f((Object)a7g, "locationProducer");
        e0e.f((Object)o9p, "searchSuggestionController");
        e0e.f((Object)ibm, "registrableHeadsetPlugReceiver");
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)loginVerificationArgs, "loginVerificationArgs");
        e0e.f((Object)m9p, "searchSuggestionCache");
        super(intent, k9x, resources, cbs, (mxe<tai>)mxe, nn, dob, cbf, cbg, layoutInflater, (fda<h5h>)fda, userIdentifier, mcv, (mxe<ypa>)mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        if (bundle == null) {
            final ubg ubg = new ubg();
            iuk.M0((Fragment)ubg, (ContentViewArgs)loginVerificationArgs);
            final a a = new a(this.I4());
            a.e(2131429268, (Fragment)ubg, (String)null, 1);
            a.c();
        }
    }
    
    public nbg(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci fci, final c8p c8p, final Bundle bundle, final m9p m9p) {
        super(intent, k9x, resources, cbs, (mxe<tai>)mxe, nn, dob, cbf, cbg, layoutInflater, (fda<h5h>)fda, userIdentifier, mcv, (mxe<ypa>)mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        if (bundle == null) {
            final q3u q3u = new q3u();
            final a a = new a(this.I4());
            a.e(2131429268, (Fragment)q3u, (String)null, 1);
            a.c();
        }
    }
}
