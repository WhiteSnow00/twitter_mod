import androidx.fragment.app.Fragment;
import android.view.MenuItem;
import android.view.Menu;
import android.os.Handler;
import android.os.Looper;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.navigation.settings.TrendsPrefContentViewResult;
import com.twitter.navigation.settings.TrendsPrefContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l2u extends yzb
{
    public final dn6<TrendsPrefContentViewArgs, TrendsPrefContentViewResult> Y0;
    public final dg3 Z0;
    
    public l2u(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final umd umd, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, umd, t8p);
        this.Z0 = new dg3((Object)new af4(UserIdentifier.getCurrent()));
        new Handler(Looper.getMainLooper()).post((Runnable)new q20((Object)this, 6));
        final dn6 a = obi.a((Class)TrendsPrefContentViewResult.class);
        this.Y0 = (dn6<TrendsPrefContentViewArgs, TrendsPrefContentViewResult>)a;
        f.i(a.c(), (n93)new jgk((Object)this, 5));
    }
    
    public static String Z4(final Resources resources, final ziw ziw) {
        String s;
        if (!ziw.L && ikr.g((CharSequence)ziw.b)) {
            s = resources.getString(2131954829, new Object[] { ziw.b });
        }
        else {
            s = resources.getString(2131958974);
        }
        return s;
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        super.N2(hai, menu);
        final adw d = zcw.d();
        final boolean b = d.g() && gds.b();
        if (d.p() && !b) {
            hai.z(2131689547, menu);
        }
        return true;
    }
    
    public final yjf.a W4(final Intent intent, final xbv xbv) {
        final c0c c0c = new c0c();
        final wzb a = wzb.a(intent);
        final zzb$b zzb$b = new zzb$b();
        ((hss$a)zzb$b).v(a.a.c.e);
        ((zzb$a)zzb$b).B(a.a);
        ((zzb$a)zzb$b).y(false);
        ((Fragment)c0c).N1(((vl1)((n4j)zzb$b).e()).a);
        return new yjf.a((umd)c0c);
    }
    
    public final boolean n(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432241) {
            if (s9c.b()) {
                ((vbv)this).R0.d((ym)new yka());
            }
            else {
                this.Y0.d((Object)TrendsPrefContentViewArgs.INSTANCE);
            }
            this.Z0.n();
            return true;
        }
        return super.n(menuItem);
    }
}
