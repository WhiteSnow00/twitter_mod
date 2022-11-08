import android.app.Activity;
import android.app.Dialog;
import java.util.Map;
import android.content.Context;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oh extends abv
{
    public oh(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        ((x9)this).R4(new View((Context)gob));
        final String h4 = ((x9)this).H4(2131951804);
        final xwm a = new xwm(h4, (Map)null);
        final xwm c = new xwm(((x9)this).H4(2131951805), (Map)null);
        final wsb$a wsb$a = new wsb$a();
        wsb$a.a = a;
        wsb$a.c = c;
        wsb$a.b = ((x9)this).H4(2131954239);
        wsb$a.g = false;
        final fw8 fw8 = new fw8(((x9)this).I4(), h4);
        fw8.E0 = (ew8)new ew8.a() {
            @Override
            public final void l0(final Dialog dialog, final int n, final int n2) {
                if (UserIdentifier.getCurrent().isLoggedOutUser()) {
                    g19.a((Activity)((x9)oh.this).D0);
                }
                else {
                    kn.a();
                }
            }
        };
        final ssb$a ssb$a = new ssb$a(1);
        ((clp$a)ssb$a).z((Object)((h4j)wsb$a).e());
        fw8.a(((dl1$a)ssb$a).w());
    }
}
