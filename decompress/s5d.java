import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.twitter.media.ui.image.d;
import android.content.Context;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.twitter.media.ui.image.b$b;
import com.twitter.navigation.profile.BaseImageActivityArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.permissions.PermissionContentViewResult;
import android.net.Uri;
import java.io.File;
import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.twitter.media.ui.image.MediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public class s5d extends vbv
{
    public static final String[] l1;
    public MediaImageView X0;
    public ProgressBar Y0;
    public Bitmap Z0;
    public File a1;
    public Uri b1;
    public Uri c1;
    public String d1;
    public String e1;
    public final long f1;
    public final boolean g1;
    public final w19 h1;
    public final dn6<x6k, PermissionContentViewResult> i1;
    public final qft j1;
    public final m6f k1;
    
    static {
        l1 = uxg.b;
    }
    
    public s5d(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final BaseImageActivityArgs baseImageActivityArgs, final qft j1, final m6f k1, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.h1 = new w19();
        this.b1 = baseImageActivityArgs.getMediaUri();
        if (baseImageActivityArgs.getExternalUri() != null) {
            this.c1 = baseImageActivityArgs.getExternalUri();
        }
        else {
            this.c1 = this.b1;
        }
        this.f1 = baseImageActivityArgs.getOwnerId();
        this.d1 = baseImageActivityArgs.getDescription();
        this.e1 = baseImageActivityArgs.getImageUrl();
        this.g1 = baseImageActivityArgs.getUseCircularImage();
        this.j1 = j1;
        this.k1 = k1;
        final int backgroundColor = baseImageActivityArgs.getBackgroundColor();
        if (backgroundColor != 0) {
            f.g(r8x.k(), (n93)new r5d(this, backgroundColor));
        }
        final int actionLabelResId = baseImageActivityArgs.getActionLabelResId();
        this.Y0 = (ProgressBar)((u9)this).C4(2131429846);
        ((d)(this.X0 = (MediaImageView)((u9)this).C4(2131429285))).setOnImageLoadedListener((b$b)new q2((Object)this, 9));
        ((d)this.X0).p(x7d.g(this.b1.toString()));
        if (actionLabelResId != -1) {
            ((u9)this).C4(2131429058).setVisibility(0);
            final Button button = (Button)((u9)this).C4(2131429059);
            ((TextView)button).setText(actionLabelResId);
            ((View)button).setVisibility(0);
            ((View)button).setOnClickListener((View$OnClickListener)new fpf(this, 22));
        }
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "tweet::photo::impression" });
        cbw.b((elm)af4);
        final dn6 h = super.R0.h((Class)PermissionContentViewResult.class, ssm.a((Class)PermissionContentViewResult.class));
        this.i1 = (dn6<x6k, PermissionContentViewResult>)h;
        f.i(h.c().filter((ytk)f71.a1), (n93)new doa((Object)this, 18));
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        super.N2(hai, menu);
        hai.z(2131689497, menu);
        return true;
    }
    
    public final void N4() {
        this.h1.a();
    }
    
    public final void W4() {
        ((Activity)((u9)this).E0).showDialog(1);
        this.h1.c(asg.a().W3().b(new awg(m1h.H0, this.b1.getLastPathSegment(), this.d1, 8)).a((qsb)new xy8((Object)this, 3)).w((psb)bm3.Z0).G((lj6)new m9s((Object)this, 15), (lj6)new d7f((Object)this, 18)));
    }
    
    public final int d2(final hai hai) {
        final Intent chooser = Intent.createChooser(new Intent("android.intent.action.SEND").setFlags(268435456).setType("text/plain").putExtra("android.intent.extra.TEXT", this.e1), (CharSequence)null);
        final Bitmap z0 = this.Z0;
        final boolean b = true;
        final boolean enabled = z0 != null;
        final MenuItem item = hai.findItem(2131431392);
        jee.l((Object)item);
        item.setIntent(chooser).setEnabled(enabled);
        final MenuItem item2 = hai.findItem(2131431175);
        jee.l((Object)item2);
        item2.setEnabled(enabled && this.a1 == null && b);
        return 2;
    }
    
    public final boolean n(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (itemId == 2131431175) {
            if (this.Z0 != null) {
                final g7k d = g7k.d();
                final cnb e0 = ((u9)this).E0;
                final String[] l1 = s5d.l1;
                if (d.a((Context)e0, l1)) {
                    this.W4();
                }
                else {
                    int n;
                    if (this.f1 == 0L) {
                        n = 2131957380;
                    }
                    else {
                        n = 2131957385;
                    }
                    final x6k$a a = x6k.a(((u9)this).H4(n), (Context)((u9)this).E0, l1);
                    a.s(aba.c("tweet", "", "photo", ""));
                    this.i1.d((Object)((n4j)a).e());
                }
            }
        }
        else {
            if (itemId != 2131430455) {
                return super.n(menuItem);
            }
            this.k1.e((Context)((u9)this).E0, this.c1.toString());
        }
        return true;
    }
}
