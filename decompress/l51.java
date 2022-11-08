import android.app.Activity;
import android.webkit.WebViewClient;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l51 extends kgv
{
    public l51(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final yv6 yv6, final pca<bo> pca2, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, yv6, (pca)pca2, a8p);
        new Intent();
        final k51 k51 = new k51(intent, (pn)null);
        if (!d5c.h(k51.a())) {
            ((Activity)gob).getWindow().setFlags(8192, 8192);
        }
        this.a5(k51.a());
    }
    
    public final WebViewClient Y4() {
        return (WebViewClient)new l51.l51$a(this);
    }
}
