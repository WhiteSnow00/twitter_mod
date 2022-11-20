import android.webkit.WebView;
import com.twitter.revenue.api.AdsInfoWebViewContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dv extends hhv
{
    public dv(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final cv6 cv6, final xba<bo> xba2, final AdsInfoWebViewContentViewArgs adsInfoWebViewContentViewArgs, final t8p t8p, final jkq jkq) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, cv6, (xba)xba2, t8p, jkq);
        this.a5(adsInfoWebViewContentViewArgs.getUri().toString());
    }
    
    public final void b5(final WebView webView, final String s) {
        final String title = webView.getTitle();
        if (ikr.g((CharSequence)title)) {
            ((u9)this).F4().setTitle((CharSequence)title);
        }
    }
    
    public final boolean j() {
        if (this.W4()) {
            this.g5();
            return true;
        }
        return super.j();
    }
    
    public final void m0() {
        if (this.W4()) {
            this.g5();
        }
        else {
            super.m0();
        }
    }
}
