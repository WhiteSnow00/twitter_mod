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

public final class mt9 extends kcv implements vw8
{
    public static final String[] i1;
    public vgl Z0;
    public sfv a1;
    public final jo6<k7k, PermissionContentViewResult> b1;
    public final jo6<k7k, PermissionContentViewResult> c1;
    public final jo6<pb3, noj<jx9>> d1;
    public final jo6<ps9, EditImageActivityResult> e1;
    public final jo6<wcl, ProfilePhotoEditImageSuccess> f1;
    public final igt g1;
    public final EditProfileAvatarContentViewArgs h1;
    
    static {
        i1 = myg.c;
    }
    
    public mt9(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final qdw qdw, final fda<fo> fda2, final kcm kcm, final igt g1, final EditProfileAvatarContentViewArgs h1, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = new vgl((Context)dob, qdw.getUser(), true);
        final sfv a1 = new sfv();
        ((f0p)a1).c("edit_profile");
        this.a1 = a1;
        this.g1 = g1;
        this.h1 = h1;
        final ww8 ww8 = new ww8(this.I4(), "change_avatar");
        ww8.H0 = this;
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(resources.getStringArray(2130903051)));
        final boolean a2 = hf3.a;
        if (!((Context)dob).getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            list.remove(0);
        }
        if (!fbx.O()) {
            list.remove(2);
        }
        if (list.size() > 1) {
            final Bundle t = m58.t("twitter:id", 1);
            t.putCharSequenceArray("items", (CharSequence[])list.toArray(new String[0]));
            final int a3 = o5j.a;
            if (!((BaseBundle)t).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final vjl vjl = new vjl();
            ((Fragment)vjl).N1(t);
            ww8.a((bl1)vjl);
        }
        else {
            this.Y4(userIdentifier, fg4.E(this.a1, "change_avatar_dialog", "choose_photo", "click"));
            this.X4();
        }
        final jo6<k7k, PermissionContentViewResult> g2 = super.T0.g(PermissionContentViewResult.class, htm.a((Class<RES>)PermissionContentViewResult.class), "GalleryPermissions");
        this.b1 = g2;
        f.i(g2.a(), (fa3)new h3((Object)this, 16));
        final fci<?> t2 = super.T0;
        final int a4 = o5j.a;
        final jo6<cn, noj<jx9>> h2 = t2.h((Class<noj<jx9>>)noj.class, (itm<noj<jx9>>)qd.G0);
        this.d1 = (jo6<pb3, noj<jx9>>)h2;
        f.i(h2.a(), (fa3)new es2((Object)this, 14));
        final jo6<k7k, PermissionContentViewResult> g3 = super.T0.g(PermissionContentViewResult.class, htm.a((Class<RES>)PermissionContentViewResult.class), "AvatarCameraPermissions");
        this.c1 = g3;
        f.i(g3.a(), (fa3)new wgk((Object)this, 12));
        final jo6<ps9, EditImageActivityResult> h3 = super.T0.h(EditImageActivityResult.class, htm.a((Class<RES>)EditImageActivityResult.class));
        this.e1 = h3;
        f.i(h3.a(), (fa3)new rp3((Object)this, 11));
        final jo6<wcl, ProfilePhotoEditImageSuccess> h4 = super.T0.h(ProfilePhotoEditImageSuccess.class, htm.a((Class<RES>)ProfilePhotoEditImageSuccess.class));
        this.f1 = h4;
        f.i(h4.a(), (fa3)new in((Object)nn, 11));
        vo.a((fda)fda2, 2, (fa3)new inu((Object)this, (Object)kcm, 3));
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
    }
    
    public final void W4(final dwg dwg) {
        ex9 ex9 = null;
        if (dwg != null) {
            final n0h k0 = n0h.K0;
            final tx6 i0 = jx9.I0;
            ex9 = (ex9)jx9.k(dwg, dwg.g(), k0, (String)null);
        }
        if (dwg != null) {
            final String h4 = this.H4(2131955934);
            if (this.h1.getUploadAfterCrop()) {
                final wcl$a wcl$a = new wcl$a();
                ((aj1.a)wcl$a).p(super.M0);
                ((ps9$a)wcl$a).t(ex9);
                ((ps9$a)wcl$a).x("profile");
                ((ps9$a)wcl$a).r(1.0f);
                ((ps9$a)wcl$a).u(2);
                ((ps9$a)wcl$a).w();
                ((ps9$a)wcl$a).s(h4);
                ((ps9$a)wcl$a).q(true);
                this.f1.d((Object)((z4j)wcl$a).e());
            }
            else {
                final ps9$b ps9$b = new ps9$b();
                ((aj1.a)ps9$b).p(super.M0);
                ((ps9$a)ps9$b).t(ex9);
                ((ps9$a)ps9$b).x("profile");
                ((ps9$a)ps9$b).r(1.0f);
                ((ps9$a)ps9$b).u(2);
                ((ps9$a)ps9$b).w();
                ((ps9$a)ps9$b).s(h4);
                ((ps9$a)ps9$b).q(true);
                this.e1.d((Object)((z4j)ps9$b).e());
            }
        }
        else {
            this.g1.c(2131955901, 0);
            this.D4();
        }
    }
    
    public final void X4() {
        final dob g0 = super.G0;
        final String[] w2 = jxb.w2;
        if (nxb.a((Context)g0)) {
            f0h.c((Activity)super.G0, 2);
        }
        else {
            this.b1.d((Object)k7k.a(super.O0.getString(2131954188), (Context)super.G0, jxb.w2).e());
        }
    }
    
    public final void Y4(final UserIdentifier userIdentifier, final String... array) {
        zgl.x(userIdentifier, this.Z0, array);
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    this.Y4(super.M0, fg4.E(this.a1, "change_avatar_dialog", "choose_nft", "click"));
                    ((Activity)super.G0).setResult(-1, new Intent("twitter.intent.action.NFT"));
                    ((Activity)super.G0).finish();
                }
            }
            else {
                this.Y4(super.M0, fg4.E(this.a1, "change_avatar_dialog", "choose_photo", "click"));
                this.X4();
            }
        }
        else {
            final sfv a1 = this.a1;
            final String d = ((f0p)a1).d;
            String s = "";
            String s2;
            if ((s2 = d) == null) {
                s2 = "";
            }
            final String e = ((f0p)a1).e;
            if (e != null) {
                s = e;
            }
            final k7k.a a2 = k7k.a(this.H4(2131955936), (Context)super.G0, mt9.i1);
            a2.s(hca.c(s2, s, "change_avatar_dialog", "take_photo"));
            final k7k k7k = (k7k)a2.e();
            this.Y4(super.M0, fg4.E(this.a1, "change_avatar_dialog", "take_photo", "click"));
            this.c1.d((Object)k7k);
        }
    }
    
    public final void q0(final Dialog dialog, final int n, final Bundle bundle) {
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        this.D4();
    }
}
