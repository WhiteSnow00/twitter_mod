// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor;

import android.app.Dialog;
import com.twitter.navigation.media.EditImageActivityResult;
import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

public class a extends kcv implements b$d, dx8
{
    public final b Z0;
    
    public a(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final ps9 ps9, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final ex9 r2 = (ex9)swj.b(((aj1)ps9).mIntent, "EditImageActivityArgs_editable_image", (nmp)ex9.U0);
        b z0;
        if ((z0 = (b)this.I4().H("image_edit")) == null) {
            int intExtra;
            if (((aj1)ps9).mIntent.getIntExtra("EditImageActivityArgs_editor_type", 0) > 0) {
                intExtra = ((aj1)ps9).mIntent.getIntExtra("EditImageActivityArgs_editor_type", 0);
            }
            else {
                intExtra = 1;
            }
            final b$c b$c = new b$c();
            ((am1.a<am1, am1.a>)b$c.a).u(((aj1)ps9).getOwner());
            ((am1.a<am1, am1.a>)b$c.a).t("scribe_section", ((aj1)ps9).mIntent.getStringExtra("EditImageActivityArgs_scribe_section"));
            ((am1.a<am1, am1.a>)b$c.a).q("initial_type", intExtra);
            ((am1.a)b$c.a).a.putFloat("force_crop_ratio", ((aj1)ps9).mIntent.getFloatExtra("EditImageActivityArgs_force_crop_ratio", 0.0f));
            final int a = o5j.a;
            ((am1.a<am1, am1.a>)b$c.a).o("lock_to_initial", ((aj1)ps9).mIntent.getBooleanExtra("EditImageActivityArgs_lock_editor", false));
            ((am1.a<am1, am1.a>)b$c.a).o("is_circle_crop_region", ((aj1)ps9).mIntent.getBooleanExtra("EditImageActivityArgs_circle_crop_region", false));
            ((am1.a<am1, am1.a>)b$c.a).o("show_grid", ((aj1)ps9).mIntent.getBooleanExtra("EditImageActivityArgs_show_grid", false));
            final String stringExtra = ((aj1)ps9).mIntent.getStringExtra("EditImageActivityArgs_done_button_text");
            if (stringExtra != null) {
                ((am1.a<am1, am1.a>)b$c.a).t("done_button_text", stringExtra);
            }
            final String stringExtra2 = ((aj1)ps9).mIntent.getStringExtra("EditImageActivityArgs_header_text");
            if (stringExtra2 != null) {
                ((am1.a<am1, am1.a>)b$c.a).t("header_text", stringExtra2);
            }
            final String stringExtra3 = ((aj1)ps9).mIntent.getStringExtra("EditImageActivityArgs_subheader_text");
            if (stringExtra3 != null) {
                ((am1.a<am1, am1.a>)b$c.a).t("subheader_text", stringExtra3);
            }
            ((am1.a<am1, am1.a>)b$c.a).o("disable_zoom", ((aj1)ps9).mIntent.getBooleanExtra("EditImageActivityArgs_disable_zoom", false));
            z0 = (b)((z4j)b$c).e();
            final androidx.fragment.app.a a2 = new androidx.fragment.app.a(this.I4());
            a2.e(2131429268, (Fragment)z0, "image_edit", 1);
            a2.c();
        }
        this.Z0 = z0;
        if ((z0.r2 = r2) != null) {
            if (((Fragment)z0).m1 != null) {
                z0.j2((jx9)r2);
            }
        }
        z0.w2 = (b$d)this;
    }
    
    public void I3(final boolean b) {
        if (b) {
            final wjl$b wjl$b = new wjl$b(0);
            ((am1.a)wjl$b).a.putBoolean("cancelable", true);
            final int a = o5j.a;
            ((wjl$a)wjl$b).A(2131953717);
            ((wjl$a)wjl$b).H(2131953718);
            ((wjl$a)wjl$b).F(2131953135);
            ((wjl$a)wjl$b).C(2131952374);
            final bl1 w = ((cl1$a)wjl$b).w();
            w.W1 = this;
            w.l2(this.I4());
        }
        else {
            super.H0.cancel();
        }
    }
    
    public void X2(final ex9 ex9, final String s) {
        super.H0.c((ho6)new EditImageActivityResult(ex9, s));
    }
    
    @Override
    public final boolean k() {
        final b z0 = this.Z0;
        final c t2 = z0.t2;
        if (t2 != null && t2.b()) {
            if (z0.H2) {
                z0.i2();
            }
            else {
                z0.l2(true);
            }
        }
        else {
            final c t3 = z0.t2;
            if (t3 != null && t3.c()) {
                z0.m2(true);
            }
            else {
                if (z0.w2 != null) {
                    z0.i2();
                }
                z0.n2.setVisibility(0);
            }
        }
        return true;
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n == 0 && n2 == -1) {
            super.H0.cancel();
        }
    }
    
    @Override
    public final boolean p4() {
        return false;
    }
}
