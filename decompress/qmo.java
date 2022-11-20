import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmo extends yzb
{
    public qmo(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final umd umd, final t8p t8p) {
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)resources, "resources");
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
        czd.f((Object)umd, "fragment");
        czd.f((Object)t8p, "searchSuggestionCache");
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, umd, t8p);
    }
    
    public final yjf.a W4(final Intent intent, final xbv xbv) {
        czd.f((Object)intent, "startIntent");
        czd.f((Object)xbv, "options");
        final tmo tmo = new tmo();
        final wzb a = wzb.a(intent);
        final zzb$b zzb$b = new zzb$b();
        ((zzb$a)zzb$b).z(false);
        ((zzb$a)zzb$b).y(false);
        ((hss$a)zzb$b).v(a.a.c.e);
        ((zzb$a)zzb$b).B(a.a);
        ((Fragment)tmo).N1(((vl1)((n4j)zzb$b).e()).a);
        return new yjf.a(tmo);
    }
}
