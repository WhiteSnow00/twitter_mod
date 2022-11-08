import android.app.Activity;
import android.net.Uri$Builder;
import android.net.Uri;
import com.twitter.navigation.web.AuthenticatedWebViewContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o51 extends kgv
{
    public final long e1;
    public final String f1;
    
    public o51(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final yv6 yv6, final pca<bo> pca2, final AuthenticatedWebViewContentViewArgs authenticatedWebViewContentViewArgs, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, yv6, (pca)pca2, a8p);
        if (!d5c.h(authenticatedWebViewContentViewArgs.getUrl())) {
            ((Activity)gob).getWindow().setFlags(8192, 8192);
        }
        this.e1 = authenticatedWebViewContentViewArgs.getTweetId();
        this.f1 = authenticatedWebViewContentViewArgs.getImpressionId();
        this.a5(authenticatedWebViewContentViewArgs.getUrl());
    }
    
    public final void a5(final String s) {
        final Uri parse = Uri.parse(s);
        final Uri$Builder buildUpon = parse.buildUpon();
        if (pjr.e((CharSequence)parse.getQueryParameter("referringTweetId"))) {
            buildUpon.appendQueryParameter("referringTweetId", Long.toString(this.e1));
        }
        if (pjr.e((CharSequence)parse.getQueryParameter("impressionId"))) {
            final String f1 = this.f1;
            if (f1 != null) {
                buildUpon.appendQueryParameter("impressionId", f1);
            }
        }
        super.a5(buildUpon.toString());
    }
}
