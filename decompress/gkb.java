import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.onboarding.connect.tab.PeopleDiscoveryContentViewArgs;
import android.view.MenuItem;
import android.view.Menu;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.users.timeline.FollowingTimelineContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkb extends pkf
{
    public final FollowingTimelineContentViewArgs W0;
    
    public gkb(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final FollowingTimelineContentViewArgs w0, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        this.W0 = w0;
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        super.N2(fai, menu);
        fai.z(2131689521, menu);
        return true;
    }
    
    public final pkf.a W4(final Intent intent, final cbv cbv) {
        final jkb jkb = new jkb();
        final hkb.a a = new hkb.a();
        ((BaseBundle)((zl1$a)a).a).putLong("following_timeline_owner_user_id", this.W0.getFollowingUserId());
        ((BaseBundle)((zl1$a)a).a).putString("following_timeline_owner_username", this.W0.getFollowingUsername());
        ((Fragment)jkb).N1(((zl1)((h4j)a).e()).a);
        return new pkf.a(jkb);
    }
    
    public final CharSequence Y4(final Intent intent) {
        return ((x9)this).H4(2131955909);
    }
    
    public final boolean q(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432116) {
            ((abv)this).Q0.b((ContentViewArgs)PeopleDiscoveryContentViewArgs.INSTANCE);
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { "home", "navigation_bar", "", "peopleplus_overflow_item", "click" });
            saw.b((okm)zf4);
            return true;
        }
        return super.q(menuItem);
    }
}
