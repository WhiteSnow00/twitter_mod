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

public final class d3u extends z0c
{
    public final jo6<TrendsPrefContentViewArgs, TrendsPrefContentViewResult> a1;
    public final dh3 b1;
    
    public d3u(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final und und, final m9p m9p) {
        super(intent, k9x, resources, cbs, (mxe)mxe, nn, dob, cbf, cbg, layoutInflater, (fda)fda, userIdentifier, mcv, (mxe)mxe2, a7g, o9p, ibm, (fci)fci, c8p, und, m9p);
        this.b1 = new dh3(new fg4(UserIdentifier.getCurrent()));
        new Handler(Looper.getMainLooper()).post((Runnable)new q20((Object)this, 6));
        final jo6<TrendsPrefContentViewArgs, TrendsPrefContentViewResult> a = fci.a(TrendsPrefContentViewResult.class);
        this.a1 = a;
        f.i(a.c(), (fa3)new wgk((Object)this, 5));
    }
    
    public static String Z4(final Resources resources, final ojw ojw) {
        String s;
        if (!ojw.L && flr.g((CharSequence)ojw.b)) {
            s = resources.getString(2131954829, new Object[] { ojw.b });
        }
        else {
            s = resources.getString(2131958974);
        }
        return s;
    }
    
    public final boolean N2(final zai zai, final Menu menu) {
        super.N2(zai, menu);
        final qdw d = pdw.d();
        final boolean b = d.g() && yds.b();
        if (d.p() && !b) {
            zai.z(2131689547, menu);
        }
        return true;
    }
    
    public final wkf$a W4(final Intent intent, final mcv mcv) {
        final d1c d1c = new d1c();
        final x0c a = x0c.a(intent);
        final a1c$b a1c$b = new a1c$b();
        ((bts$a)a1c$b).v(a.a.c.e);
        ((a1c$a)a1c$b).B(a.a);
        ((a1c$a)a1c$b).y(false);
        ((Fragment)d1c).N1(((am1)((z4j)a1c$b).e()).a);
        return new wkf$a((und)d1c);
    }
    
    public final boolean n(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432242) {
            if (uac.b()) {
                ((kcv)this).T0.d((cn)new ema());
            }
            else {
                this.a1.d((Object)TrendsPrefContentViewArgs.INSTANCE);
            }
            this.b1.k();
            return true;
        }
        return super.n(menuItem);
    }
}
