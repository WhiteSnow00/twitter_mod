import com.twitter.profiles.ImageActivity;
import com.twitter.dm.ui.DMAvatar;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tg7 extends abv
{
    public tg7(final Intent intent, final kk7 kk7, final z7x z7x, final Resources resources, final Context context, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final a8p a8p) {
        zzd.f((Object)kk7, "dMConversationIntentArgs");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)resources, "resources");
        zzd.f((Object)context, "applicationContext");
        zzd.f((Object)p9s, "requestRepositoryFactory");
        zzd.f((Object)fxe, "navManagerLazy");
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
        zzd.f((Object)a8p, "searchSuggestionCache");
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        final jp7 o = kk7.o();
        if (o != null) {
            final DMAvatar dmAvatar = (DMAvatar)((x9)this).C4(2131427735);
            final int m = tbx.j(context).m();
            final int n1 = ImageActivity.n1;
            final int p22 = q0b.p(context.getResources().getDimension(2131167437) * 2.0f);
            if (dmAvatar != null) {
                dmAvatar.setSize(m - p22);
            }
            if (dmAvatar != null) {
                dmAvatar.setConversation(o);
            }
        }
    }
}
