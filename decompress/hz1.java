import android.view.MenuItem;
import android.view.Menu;
import androidx.fragment.app.p;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hz1 extends rks
{
    public hz1(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final p p23, final epb epb, final un9 un9, final a8p a8p) {
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)resources, "resources");
        zzd.f((Object)p9s, "requestRepositoryFactory");
        zzd.f((Object)fxe, "navManager");
        zzd.f((Object)kn, "activityFinisher");
        zzd.f((Object)sag, "loginController");
        zzd.f((Object)layoutInflater, "layoutInflater");
        zzd.f((Object)userIdentifier, "currentUser");
        zzd.f((Object)cbv, "twitterFragmentActivityOptions");
        zzd.f((Object)fxe2, "fabPresenter");
        zzd.f((Object)q6g, "locationProducer");
        zzd.f((Object)c8p, "searchSuggestionController");
        zzd.f((Object)gam, "registrableHeadsetPlugReceiver");
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)epb, "fragmentProvider");
        zzd.f((Object)un9, "fragmentArgs");
        zzd.f((Object)a8p, "searchSuggestionCache");
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, p23, epb, un9, a8p);
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        zzd.f((Object)fai, "navComponent");
        zzd.f((Object)menu, "menu");
        super.N2(fai, menu);
        fai.z(2131689473, menu);
        return true;
    }
    
    public final boolean q(final MenuItem menuItem) {
        zzd.f((Object)menuItem, "item");
        boolean q;
        if (menuItem.getItemId() == 2131432118) {
            final UserIdentifier k = ncw.d().k();
            zzd.e((Object)k, "getCurrent().userIdentifier");
            final n9q b = psc.c().b((ksc)new e7c(k));
            final ug ug = new ug((rtb)new fz1(this), 15);
            final e9a b2 = e9a.b();
            zzd.e((Object)b2, "get()");
            b.G((fk6)ug, (fk6)new rj4((rtb)new gz1(b2), 12));
            q = true;
        }
        else {
            q = super.q(menuItem);
        }
        return q;
    }
}
