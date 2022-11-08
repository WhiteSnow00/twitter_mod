import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.twitter.notifications.settings.implementation.TweetSettingsActivity;
import android.view.MenuItem;
import java.util.Objects;
import android.view.Menu;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class jwi extends x0c
{
    public final zvj X0;
    
    public jwi(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final rnd rnd, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, rnd, a8p);
        this.X0 = new zvj(15);
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        super.N2(fai, menu);
        final zvj x0 = this.X0;
        final ocw d = ncw.d();
        Objects.requireNonNull(x0);
        final boolean b = d.g() && lcs.b();
        if (d.p() && !b) {
            fai.z(2131689520, menu);
        }
        return true;
    }
    
    public final pkf.a W4(final Intent intent, final cbv cbv) {
        final b1c b1c = new b1c();
        final v0c a = v0c.a(intent);
        final y0c$b y0c$b = new y0c$b();
        ((y0c$a)y0c$b).y(true);
        ((qrs$a)y0c$b).v(a.a.c.e);
        ((y0c$a)y0c$b).B(a.a);
        ((Fragment)b1c).N1(((zl1)((h4j)y0c$b).e()).a);
        return new pkf.a((rnd)b1c);
    }
    
    public final boolean q(final MenuItem menuItem) {
        final zvj x0 = this.X0;
        final gob d0 = ((x9)this).D0;
        Objects.requireNonNull(x0);
        if (menuItem.getItemId() == 2131430390) {
            ((Activity)d0).startActivity(new Intent((Context)d0, (Class)TweetSettingsActivity.class));
        }
        return super.q(menuItem);
    }
}
