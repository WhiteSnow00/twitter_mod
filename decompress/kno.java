import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kno extends z0c
{
    public kno(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final und und, final m9p m9p) {
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)resources, "resources");
        e0e.f((Object)cbs, "requestRepositoryFactory");
        e0e.f((Object)mxe, "navManagerLazy");
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
        e0e.f((Object)und, "fragment");
        e0e.f((Object)m9p, "searchSuggestionCache");
        super(intent, k9x, resources, cbs, (mxe)mxe, nn, dob, cbf, cbg, layoutInflater, (fda)fda, userIdentifier, mcv, (mxe)mxe2, a7g, o9p, ibm, (fci)fci, c8p, und, m9p);
    }
    
    public final wkf$a W4(final Intent intent, final mcv mcv) {
        e0e.f((Object)intent, "startIntent");
        e0e.f((Object)mcv, "options");
        final nno nno = new nno();
        final x0c a = x0c.a(intent);
        final a1c$b a1c$b = new a1c$b();
        ((a1c$a)a1c$b).z(false);
        ((a1c$a)a1c$b).y(false);
        ((bts$a)a1c$b).v(a.a.c.e);
        ((a1c$a)a1c$b).B(a.a);
        ((Fragment)nno).N1(((am1)((z4j)a1c$b).e()).a);
        return new wkf$a((und)nno);
    }
}
