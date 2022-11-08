import com.twitter.business.professionalhome.ProfessionalHomeContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4l extends kgv
{
    public g4l(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final yv6 yv6, final pca<bo> pca2, final ProfessionalHomeContentViewArgs professionalHomeContentViewArgs, final a8p a8p) {
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)resources, "resources");
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
        zzd.f((Object)yv6, "cookieManagerWrapper");
        zzd.f((Object)pca2, "activityResultStream");
        zzd.f((Object)professionalHomeContentViewArgs, "args");
        zzd.f((Object)a8p, "searchSuggestionCache");
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, yv6, (pca)pca2, a8p);
        this.a5(professionalHomeContentViewArgs.getUrl());
    }
    
    public final boolean j() {
        boolean j;
        if (this.W4()) {
            this.g5();
            j = true;
        }
        else {
            j = super.j();
        }
        return j;
    }
}
