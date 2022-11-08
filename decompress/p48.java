import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p48 extends abv
{
    public final so7 W0;
    
    public p48(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final pca<bo> pca2, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        final so7 so7 = (so7)((x9)this).I4().H("viewParticipantsFragment");
        so7 w0;
        if (so7 == null) {
            final Bundle extras = intent.getExtras();
            w0 = new so7();
            ((Fragment)w0).N1(((zl1)new kl7(extras)).a);
            final a a = new a(((x9)this).I4());
            a.e(2131429268, (Fragment)w0, "viewParticipantsFragment", 1);
            a.c();
        }
        else {
            w0 = so7;
        }
        this.W0 = w0;
        ro.a((pca)pca2, 1, (u93)new lg1((Object)this, 7));
    }
}
