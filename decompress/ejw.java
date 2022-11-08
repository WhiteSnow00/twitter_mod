import android.webkit.WebView;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejw extends kgv
{
    public ejw(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final yv6 yv6, final pca<bo> pca2, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, yv6, (pca)pca2, a8p);
        this.a5(intent.getData().toString());
    }
    
    public final void b5(final WebView webView, final String s) {
        final String title = webView.getTitle();
        if (pjr.g((CharSequence)title)) {
            ((x9)this).F4().setTitle((CharSequence)title);
        }
    }
    
    public final boolean j() {
        if (this.W4()) {
            this.g5();
            return true;
        }
        return super.j();
    }
    
    public final void n0() {
        if (this.W4()) {
            this.g5();
        }
        else {
            super.n0();
        }
    }
}
