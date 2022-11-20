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

public final class zf7 extends vbv
{
    public zf7(final Intent intent, final tj7 tj7, final r8x r8x, final Resources resources, final Context context, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final t8p t8p) {
        czd.f((Object)tj7, "dMConversationIntentArgs");
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)resources, "resources");
        czd.f((Object)context, "applicationContext");
        czd.f((Object)kas, "requestRepositoryFactory");
        czd.f((Object)pwe, "navManagerLazy");
        czd.f((Object)jn, "activityFinisher");
        czd.f((Object)hag, "loginController");
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)userIdentifier, "currentUser");
        czd.f((Object)xbv, "twitterFragmentActivityOptions");
        czd.f((Object)pwe2, "fabPresenter");
        czd.f((Object)f6g, "locationProducer");
        czd.f((Object)v8p, "searchSuggestionController");
        czd.f((Object)vam, "registrableHeadsetPlugReceiver");
        czd.f((Object)obi, "navigator");
        czd.f((Object)t8p, "searchSuggestionCache");
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        final qo7 o = tj7.o();
        if (o != null) {
            final DMAvatar dmAvatar = (DMAvatar)((u9)this).C4(2131427735);
            final int m = pcx.j(context).m();
            final int o2 = ImageActivity.o1;
            final int n = zyz.n(context.getResources().getDimension(2131167437) * 2.0f);
            if (dmAvatar != null) {
                dmAvatar.setSize(m - n);
            }
            if (dmAvatar != null) {
                dmAvatar.setConversation(o);
            }
        }
    }
}
