import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.app.Dialog;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.profiles.EditProfileAvatarContentViewArgs;
import com.twitter.navigation.media.ProfilePhotoEditImageSuccess;
import com.twitter.navigation.media.EditImageActivityResult;
import com.twitter.permissions.PermissionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ls9 extends vbv implements pv8
{
    public static final String[] g1;
    public jgl X0;
    public efv Y0;
    public final dn6<x6k, PermissionContentViewResult> Z0;
    public final dn6<x6k, PermissionContentViewResult> a1;
    public final dn6<ua3, ynj<jw9>> b1;
    public final dn6<nr9, EditImageActivityResult> c1;
    public final dn6<jcl, ProfilePhotoEditImageSuccess> d1;
    public final qft e1;
    public final EditProfileAvatarContentViewArgs f1;
    
    static {
        g1 = uxg.c;
    }
    
    public ls9(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final adw adw, final xba<bo> xba2, final xbm xbm, final qft e1, final EditProfileAvatarContentViewArgs f1, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = new jgl((Context)cnb, adw.getUser(), true);
        final efv y0 = new efv();
        ((lzo)y0).c("edit_profile");
        this.Y0 = y0;
        this.e1 = e1;
        this.f1 = f1;
        final qv8 qv8 = new qv8(((u9)this).I4(), "change_avatar");
        qv8.F0 = (pv8)this;
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(resources.getStringArray(2130903051)));
        final boolean a = ge3.a;
        if (!((Context)cnb).getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            list.remove(0);
        }
        if (!rp9.l0()) {
            list.remove(2);
        }
        if (list.size() > 1) {
            final Bundle a2 = nh.A("twitter:id", 1);
            a2.putCharSequenceArray("items", (CharSequence[])list.toArray(new String[0]));
            final int a3 = c5j.a;
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final jjl jjl = new jjl();
            ((Fragment)jjl).N1(a2);
            qv8.a((wk1)jjl);
        }
        else {
            this.Y4(userIdentifier, af4.E(this.Y0, "change_avatar_dialog", "choose_photo", "click"));
            this.X4();
        }
        final dn6 g = super.R0.g((Class)PermissionContentViewResult.class, ssm.a((Class)PermissionContentViewResult.class), "GalleryPermissions");
        this.Z0 = (dn6<x6k, PermissionContentViewResult>)g;
        f.i(g.a(), (n93)new dn((Object)this, 15));
        final obi r0 = super.R0;
        final int a4 = c5j.a;
        final dn6 h = r0.h((Class)ynj.class, (tsm)fu8.D0);
        this.b1 = (dn6<ua3, ynj<jw9>>)h;
        f.i(h.a(), (n93)new csf((Object)this, 14));
        final dn6 g2 = super.R0.g((Class)PermissionContentViewResult.class, ssm.a((Class)PermissionContentViewResult.class), "AvatarCameraPermissions");
        this.a1 = (dn6<x6k, PermissionContentViewResult>)g2;
        f.i(g2.a(), (n93)new hg1((Object)this, 12));
        final dn6 h2 = super.R0.h((Class)EditImageActivityResult.class, ssm.a((Class)EditImageActivityResult.class));
        this.c1 = (dn6<nr9, EditImageActivityResult>)h2;
        f.i(h2.a(), (n93)new ejl((Object)this, 10));
        final dn6 h3 = super.R0.h((Class)ProfilePhotoEditImageSuccess.class, ssm.a((Class)ProfilePhotoEditImageSuccess.class));
        this.d1 = (dn6<jcl, ProfilePhotoEditImageSuccess>)h3;
        f.i(h3.a(), (n93)new n3(jn, 12));
        ro.a(xba2, 2, (n93<bo>)new p3((Object)this, (Object)xbm, 2));
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
    }
    
    public final void W4(final jvg jvg) {
        ew9 ew9 = null;
        if (jvg != null) {
            final vzg i0 = vzg.I0;
            final nw6 g0 = jw9.G0;
            ew9 = (ew9)jw9.k(jvg, jvg.g(), i0, (String)null);
        }
        if (jvg != null) {
            final String h4 = ((u9)this).H4(2131955934);
            if (this.f1.getUploadAfterCrop()) {
                final jcl.a a = new jcl.a();
                ((xi1.a)a).p(((u9)this).K0);
                a.t(ew9);
                a.x("profile");
                a.r(1.0f);
                a.u(2);
                a.w();
                a.s(h4);
                a.q(true);
                this.d1.d((Object)((n4j)a).e());
            }
            else {
                final nr9$b nr9$b = new nr9$b();
                ((xi1.a)nr9$b).p(((u9)this).K0);
                ((nr9$a)nr9$b).t(ew9);
                ((nr9$a)nr9$b).x("profile");
                ((nr9$a)nr9$b).r(1.0f);
                ((nr9$a)nr9$b).u(2);
                ((nr9$a)nr9$b).w();
                ((nr9$a)nr9$b).s(h4);
                ((nr9$a)nr9$b).q(true);
                this.c1.d((Object)((n4j)nr9$b).e());
            }
        }
        else {
            this.e1.c(2131955901, 0);
            ((u9)this).D4();
        }
    }
    
    public final void X4() {
        final cnb e0 = ((u9)this).E0;
        final String[] u2 = iwb.u2;
        if (mwb.a((Context)e0)) {
            nzg.c((Activity)((u9)this).E0, 2);
        }
        else {
            this.Z0.d((Object)((n4j)x6k.a(((u9)this).M0.getString(2131954188), (Context)((u9)this).E0, iwb.u2)).e());
        }
    }
    
    public final void Y4(final UserIdentifier userIdentifier, final String... array) {
        ngl.x(userIdentifier, this.X0, array);
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    this.Y4(((u9)this).K0, af4.E(this.Y0, "change_avatar_dialog", "choose_nft", "click"));
                    ((Activity)((u9)this).E0).setResult(-1, new Intent("twitter.intent.action.NFT"));
                    ((Activity)((u9)this).E0).finish();
                }
            }
            else {
                this.Y4(((u9)this).K0, af4.E(this.Y0, "change_avatar_dialog", "choose_photo", "click"));
                this.X4();
            }
        }
        else {
            final efv y0 = this.Y0;
            final String d = ((lzo)y0).d;
            String s = "";
            String s2;
            if ((s2 = d) == null) {
                s2 = "";
            }
            final String e = ((lzo)y0).e;
            if (e != null) {
                s = e;
            }
            final x6k$a a = x6k.a(((u9)this).H4(2131955936), (Context)((u9)this).E0, ls9.g1);
            a.s(aba.c(s2, s, "change_avatar_dialog", "take_photo"));
            final x6k x6k = (x6k)((n4j)a).e();
            this.Y4(((u9)this).K0, af4.E(this.Y0, "change_avatar_dialog", "take_photo", "click"));
            this.a1.d((Object)x6k);
        }
    }
    
    public final void q0(final Dialog dialog, final int n, final Bundle bundle) {
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        ((u9)this).D4();
    }
}
