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
public final class mwi extends yzb
{
    public final chw Y0;
    
    public mwi(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final umd umd, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, umd, t8p);
        this.Y0 = new chw();
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        super.N2(hai, menu);
        final chw y0 = this.Y0;
        final adw d = zcw.d();
        Objects.requireNonNull(y0);
        final boolean b = d.g() && gds.b();
        if (d.p() && !b) {
            hai.z(2131689520, menu);
        }
        return true;
    }
    
    public final yjf.a W4(final Intent intent, final xbv xbv) {
        final c0c c0c = new c0c();
        final wzb a = wzb.a(intent);
        final zzb$b zzb$b = new zzb$b();
        ((zzb$a)zzb$b).y(true);
        ((hss$a)zzb$b).v(a.a.c.e);
        ((zzb$a)zzb$b).B(a.a);
        ((Fragment)c0c).N1(((vl1)((n4j)zzb$b).e()).a);
        return new yjf.a((umd)c0c);
    }
    
    public final boolean n(final MenuItem menuItem) {
        final chw y0 = this.Y0;
        final cnb e0 = ((u9)this).E0;
        Objects.requireNonNull(y0);
        if (menuItem.getItemId() == 2131430392) {
            ((Activity)e0).startActivity(new Intent((Context)e0, (Class)TweetSettingsActivity.class));
        }
        return super.n(menuItem);
    }
}
