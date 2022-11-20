import androidx.fragment.app.Fragment;
import com.twitter.media.ui.image.d;
import android.view.ViewGroup;
import android.content.DialogInterface;
import android.app.Dialog;
import java.util.Objects;
import android.os.ResultReceiver;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.app.Activity;
import android.widget.ImageView;
import android.content.Context;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.navigation.media.EditImageActivityResult;
import java.util.ArrayList;
import android.widget.EditText;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.profiles.HeaderImageView;
import com.twitter.profiles.HeaderImageView$a;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dl1 extends vbv implements xv8, uv8, f4g$a, HeaderImageView$a
{
    public static final String[] u1;
    public efv X0;
    public jgl Y0;
    public ew9 Z0;
    public ew9 a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public cgv e1;
    public HeaderImageView f1;
    public UserImageView g1;
    public EditText h1;
    public String i1;
    public final ArrayList<CharSequence> j1;
    public boolean k1;
    public boolean l1;
    public f4g m1;
    public jhl n1;
    public jvg o1;
    public dn6<nr9, EditImageActivityResult> p1;
    public dn6<x6k, PermissionContentViewResult> q1;
    public dn6<ua3, ynj<jw9>> r1;
    public xbm s1;
    public um6 t1;
    
    static {
        u1 = uxg.c;
    }
    
    public dl1(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xba<bo> xba2, final Bundle bundle, final jto jto, final f4g m1, final xbm s1, final um6 t1, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        final ArrayList j1 = new ArrayList(3);
        this.j1 = j1;
        this.l1 = false;
        jto.a((mso)new dl1$a(this));
        final efv x0 = new efv();
        ((lzo)x0).c("edit_profile");
        this.X0 = x0;
        final ks9 ks9 = (ks9)this;
        final UserImageView g1 = new UserImageView((Context)((u9)ks9).E0);
        ((View)g1).setId(2131427742);
        ngl.b(((u9)ks9).M0, g1);
        g1.setRoundedOverlayDrawableId(2131099706);
        (ks9.D1 = new ImageView((Context)((u9)ks9).E0)).setImageDrawable(fd9.c(krm.a((Activity)((u9)ks9).E0).j(2131231908), ((u9)ks9).M0.getColor(2131100891)));
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(((u9)ks9).M0.getDimensionPixelOffset(2131166888), ((u9)ks9).M0.getDimensionPixelOffset(2131166888));
        layoutParams.gravity = 17;
        ((View)ks9.D1).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        ((ViewGroup)g1).addView((View)ks9.D1);
        this.g1 = g1;
        this.h1 = (EditText)((u9)this).C4(2131428860);
        this.e1 = zcw.d().getUser();
        this.f1 = (HeaderImageView)((u9)this).C4(2131429415);
        this.m1 = m1;
        this.s1 = s1;
        this.t1 = t1;
        if (m1.b.b()) {
            this.m1.a = (f4g$a)this;
        }
        this.Y0 = new jgl((Context)cnb, this.e1, true);
        if (this.f1 != null) {
            final ul1 ul1 = (ul1)cnb;
            final Set l1 = ul1.i1.get("bitmaps");
            final HeaderImageView f1 = this.f1;
            final int e = ngl.e(this.e1, (Context)cnb);
            f1.setHeaderLoadedListener((HeaderImageView$a)this);
            ((d)f1).setDefaultDrawable((Drawable)new ColorDrawable(e));
            if (l1 != null) {
                f1.l1 = l1;
            }
            this.f1.setProfileUser(this.Y0);
            ul1.v("bitmaps", this.f1.getSavedBitmaps());
        }
        final boolean a = ge3.a;
        this.d1 = ((Context)cnb).getPackageManager().hasSystemFeature("android.hardware.camera.any");
        final String string = resources.getString(2131953751);
        if (this.d1) {
            j1.add(string);
        }
        j1.add(resources.getString(2131953741));
        if (bundle != null) {
            final byte[] byteArray = bundle.getByteArray("pending_avatar_media");
            final ew9$a s2 = ew9.S0;
            this.a1 = (ew9)klp.a(byteArray, (rlp)s2);
            this.c1 = bundle.getBoolean("initial_header");
            final ew9 a2 = this.a1;
            if (a2 != null) {
                final UserImageView g2 = this.g1;
                if (g2 != null) {
                    g2.setCropRectangle(a2.M0);
                    this.g1.L(((jw9)this.a1).m().toString());
                }
            }
            this.Z0 = (ew9)klp.a(bundle.getByteArray("pending_header_media"), (rlp)s2);
            this.l1 = bundle.getBoolean("has_updated_header");
            this.b1 = bundle.getBoolean("remove_header");
            this.k1 = bundle.getBoolean("remove_header_enabled");
            if (this.b1) {
                final HeaderImageView f2 = this.f1;
                if (f2 != null) {
                    ((d)f2).p((x7d$a)null);
                }
            }
            this.e5();
            this.Y4();
        }
        else {
            this.g5(this.e1.f(), af4.E(this.X0, "", "", "impression"));
            final UserIdentifier f3 = this.e1.f();
            final efv x2 = this.X0;
            String s3;
            if (this.d1) {
                s3 = "available";
            }
            else {
                s3 = "unavailable";
            }
            this.g5(f3, af4.E(x2, "", "camera", s3));
            this.c1 = (this.Y0.c() != null);
            final f4g m2 = this.m1;
            final cgv e2 = this.e1;
            if (!m2.d(e2)) {
                final UserIdentifier f4 = e2.f();
                final WeakReference weakReference = new WeakReference((T)cnb);
                rw0.m((Callable)new b7g((Object)weakReference, (Object)f4, 3), (ecq)new d4g(weakReference, (f4g$a)this));
            }
            else {
                this.a5(null);
            }
        }
        final dn6 h = super.R0.h((Class)EditImageActivityResult.class, ssm.a((Class)EditImageActivityResult.class));
        this.p1 = (dn6<nr9, EditImageActivityResult>)h;
        f.i(h.a(), (n93)new bl1(this, 0));
        final obi r0 = super.R0;
        final int a3 = c5j.a;
        final dn6 h2 = r0.h((Class)ynj.class, (tsm)c71.h1);
        this.r1 = (dn6<ua3, ynj<jw9>>)h2;
        f.i(h2.c().filter((ytk)i71.O0), (n93)new gg1((Object)this, 13));
        final dn6 h3 = super.R0.h((Class)PermissionContentViewResult.class, (tsm)b9l.F0);
        this.q1 = (dn6<x6k, PermissionContentViewResult>)h3;
        f.i(h3.c(), (n93)new jgk((Object)this, 14));
        ro.a(xba2, 2, (n93<bo>)new aj0((Object)this, (Object)s1, 1));
        ro.a(xba2, 4, (n93<bo>)new dn((Object)this, 13));
        f.i(r8x.k().skip(1L), (n93)new doa((Object)this, 9));
        f.i(r8x.o(), (n93)new cl1(this, 1));
    }
    
    public final boolean W4() {
        final EditText h1 = this.h1;
        String string;
        if (h1 != null) {
            string = h1.getText().toString();
        }
        else {
            string = null;
        }
        if (this.i1 != null || !ikr.g((CharSequence)string)) {
            final String i1 = this.i1;
            if (i1 == null || i1.equals(string)) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean X4() {
        return this.c5() || this.b5();
    }
    
    public final void Y4() {
        if (!this.b1 && (this.Y0.c() != null || this.Z0 != null)) {
            this.h5();
        }
        if (this.a1 == null) {
            this.g1.H(this.e1);
        }
    }
    
    public final void Z4(final jvg jvg) {
        ew9 z0 = null;
        if (jvg != null) {
            final vzg i0 = vzg.I0;
            final nw6 g0 = jw9.G0;
            z0 = (ew9)jw9.k(jvg, jvg.g(), i0, (String)null);
        }
        this.Z0 = z0;
        if (jvg != null) {
            final nr9$b nr9$b = new nr9$b();
            ((xi1.a<?, ?>)nr9$b).p(((u9)this).K0);
            ((nr9$a)nr9$b).t(this.Z0);
            ((nr9$a)nr9$b).x("profile");
            ((nr9$a)nr9$b).r(3.0f);
            ((nr9$a)nr9$b).u(2);
            ((nr9$a)nr9$b).w();
            ((nr9$a)nr9$b).q(false);
            this.p1.d((Object)((n4j)nr9$b).e());
        }
        else {
            m1f.e().c(2131955911, 0);
        }
    }
    
    public final void a5(final jvg jvg) {
        ew9 z0 = null;
        if (jvg != null) {
            final vzg i0 = vzg.I0;
            final nw6 g0 = jw9.G0;
            z0 = (ew9)jw9.k(jvg, jvg.g(), i0, (String)null);
        }
        this.Z0 = z0;
        this.Y4();
    }
    
    public final void b4(final String s, final Bitmap bitmap) {
        if (bitmap == null) {
            final HeaderImageView f1 = this.f1;
            if (f1 != null) {
                ((d)f1).setDefaultDrawable((Drawable)new ColorDrawable(ngl.e(this.e1, (Context)((u9)this).E0)));
            }
        }
    }
    
    public abstract boolean b5();
    
    public final boolean c5() {
        return (this.b1 && this.c1) || this.a1 != null || ((!this.c1 || this.l1) && this.Z0 != null);
    }
    
    public final void d5() {
        final ew9 z0 = this.Z0;
        this.k1 = (z0 != null);
        final HeaderImageView f1 = this.f1;
        if (f1 != null) {
            x7d$a a;
            if (z0 != null) {
                a = nyg.a((Context)((u9)this).E0, (jw9)z0);
            }
            else {
                a = null;
            }
            ((d)f1).p(a);
        }
    }
    
    public final void e5() {
        final String string = ((u9)this).M0.getString(2131953749);
        if (this.k1) {
            if (!this.j1.contains(string)) {
                this.j1.add(string);
            }
        }
        else {
            this.j1.remove(string);
        }
    }
    
    public final void f5() {
        final View currentFocus = ((Activity)((u9)this).E0).getCurrentFocus();
        final boolean b = false;
        jvg d0 = null;
        if (currentFocus != null) {
            pcx.w((Context)((u9)this).E0, currentFocus, false, (ResultReceiver)null);
        }
        if (this.n1 == null) {
            ((Fragment)(this.n1 = jhl.n2(2131955977))).S1();
            this.n1.p2(((u9)this).I4(), (String)null);
        }
        final ew9 a1 = this.a1;
        int n = b ? 1 : 0;
        if (a1 != null) {
            n = (b ? 1 : 0);
            if (!a1.M0.f()) {
                f.j(myg.c((Context)((u9)this).E0, (jw9)this.a1).P(), (n93)new cl1(this, 0), (z9a)this.s1);
                n = 1;
            }
        }
        if (n != 0) {
            this.a1 = null;
        }
        final ew9 a2 = this.a1;
        if (a2 != null) {
            d0 = ((jw9)a2).D0;
        }
        this.o1 = d0;
        final f4g m1 = this.m1;
        final cnb e0 = ((u9)this).E0;
        final cgv e2 = this.e1;
        final ew9 z0 = this.Z0;
        Objects.requireNonNull(m1);
        final UserIdentifier f = e2.f();
        m1.a = (f4g$a)this;
        m1.b.c(rw0.m((Callable)new kk6((Object)new WeakReference(e0), (Object)z0, (Object)f, 1), (ecq)new e4g(m1)));
    }
    
    public final void g5(final UserIdentifier userIdentifier, final String... array) {
        ngl.x(userIdentifier, this.Y0, array);
    }
    
    public final void h5() {
        final HeaderImageView f1 = this.f1;
        if (f1 != null) {
            if (this.Z0 != null) {
                this.d5();
            }
            else {
                ((d)f1).p(hhc.a(this.Y0));
            }
        }
        this.k1 = (this.Y0.c() != null || this.Z0 != null);
    }
    
    public final void i5() {
        final kjl$b kjl$b = new kjl$b(2);
        ((kjl$a)kjl$b).H(2131953732);
        ((kjl$a)kjl$b).A(2131951733);
        ((kjl$a)kjl$b).F(2131953135);
        ((kjl$a)kjl$b).C(2131952374);
        final wk1 w = ((xk1$a)kjl$b).w();
        w.U1 = (xv8)this;
        final int a = c5j.a;
        w.l2(((u9)this).I4());
    }
    
    public final boolean j() {
        if (this.X4()) {
            this.i5();
            return true;
        }
        return super.j();
    }
    
    public abstract boolean j5();
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n != 1) {
            if (n == 2) {
                if (n2 == -1) {
                    final ew9 z0 = this.Z0;
                    if (z0 != null) {
                        ((jw9)z0).n();
                    }
                    final ew9 a1 = this.a1;
                    if (a1 != null) {
                        ((jw9)a1).n();
                    }
                    ((Activity)((u9)this).E0).setResult(0);
                    this.g5(((u9)this).K0, af4.E(this.X0, "", "", "cancel"));
                    ((u9)this).D4();
                }
            }
        }
        else {
            final Resources m0 = ((u9)this).M0;
            final CharSequence charSequence = this.j1.get(n2);
            if (ikr.c(charSequence, (CharSequence)m0.getString(2131953751))) {
                this.g5(((u9)this).K0, af4.E(this.X0, "change_header_dialog", "take_photo", "click"));
                this.b1 = false;
                final x6k$a a2 = x6k.a(((u9)this).H4(2131954286), (Context)((u9)this).E0, dl1.u1);
                a2.s(aba.b(this.X0.f(), "change_header_dialog", "take_photo"));
                this.q1.d((Object)((n4j)a2).e());
            }
            else if (ikr.c(charSequence, (CharSequence)m0.getString(2131953741))) {
                this.g5(((u9)this).K0, af4.E(this.X0, "change_header_dialog", "choose_photo", "click"));
                this.b1 = false;
                nzg.c((Activity)((u9)this).E0, 2);
            }
            else if (ikr.c(charSequence, (CharSequence)m0.getString(2131953749))) {
                this.Z0 = null;
                this.g5(((u9)this).K0, af4.E(this.X0, "change_header_dialog", "remove", "click"));
                this.b1 = true;
                this.k1 = false;
                ((d)this.f1).p((x7d$a)null);
            }
        }
    }
    
    public final void m0() {
        if (this.X4()) {
            this.i5();
        }
        else {
            ((Activity)((u9)this).E0).setResult(0);
            super.m0();
        }
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
    }
}
