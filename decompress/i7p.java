import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.search.navigation.args.SearchFieldContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i7p extends kcv
{
    public final z9p Z0;
    public final SearchFieldContentViewArgs a1;
    
    public i7p(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final z9p z0, final SearchFieldContentViewArgs a1, final m9p m9p) {
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
        e0e.f((Object)z0, "searchSuggestionListener");
        e0e.f((Object)a1, "args");
        e0e.f((Object)m9p, "searchSuggestionCache");
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = z0;
        this.a1 = a1;
        this.R4(layoutInflater.inflate(2131624003, (ViewGroup)null));
    }
    
    public final int d2(final zai zai) {
        e0e.f((Object)zai, "navComponent");
        final o9p v0 = super.V0;
        e0e.e((Object)v0, "searchSuggestionController");
        final p9p$a p9p$a = new p9p$a(v0.l());
        final boolean b = true;
        p9p$a.a = true;
        p9p$a.f = "search";
        p9p$a.g = this.a1.getScribeSection();
        p9p$a.j = this.a1.getShowRecents();
        p9p$a.i = this.a1.getShowTypeahead();
        p9p$a.l = this.a1.getQuerySource();
        p9p$a.m = this.a1.getProfileId();
        p9p$a.n = this.a1.getConfigurationName();
        p9p$a.o = this.a1.getConfigurationOptions();
        if (this.a1.getSearchHint() != null) {
            p9p$a.e = this.a1.getSearchHint();
        }
        final String searchFilter = this.a1.getSearchFilter();
        int n = b ? 1 : 0;
        if (searchFilter != null) {
            if (searchFilter.length() == 0) {
                n = (b ? 1 : 0);
            }
            else {
                n = 0;
            }
        }
        if (n == 0) {
            p9p$a.k = this.a1.getSearchFilter();
        }
        v0.j((p9p)((z4j)p9p$a).e());
        v0.i(this.Z0);
        v0.f();
        return 2;
    }
    
    @Override
    public final boolean k() {
        this.D4();
        return true;
    }
}
