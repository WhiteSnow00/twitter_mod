// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import android.app.Activity;
import android.widget.TextView;
import android.view.ViewGroup;
import android.app.Dialog;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.Collection;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.ui.widget.TwitterEditText;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.content.Context;
import com.twitter.dm.ui.DMAvatar;
import com.twitter.util.user.UserIdentifier;

@a91
public class GroupInfoEditContentViewProvider extends abv implements mw8
{
    public static final sn4 q1;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public ww9 Z0;
    public String a1;
    public String b1;
    public final jp7 c1;
    public yqg d1;
    public final bft e1;
    public final UserIdentifier f1;
    public final DMAvatar g1;
    public final t9j<h2w> h1;
    public final t9j<xdm> i1;
    public final t9j<p2w> j1;
    public final um7 k1;
    public final cu6 l1;
    public final qm7 m1;
    public final giw n1;
    public final v2e o1;
    public final Context p1;
    
    static {
        q1 = new sn4(50);
    }
    
    public GroupInfoEditContentViewProvider(final Context p31, final Intent intent, final z7x z7x, final ibm ibm, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final bft e1, final um7 k1, final cu6 l1, final qm7 m1, final giw n1, final v2e o1, final pca<bo> pca2, final sso sso, final Bundle bundle, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        this.W0 = true;
        final UserIdentifier current = UserIdentifier.getCurrent();
        this.f1 = current;
        this.p1 = p31;
        this.e1 = e1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = o1;
        sso.b((Object)this);
        f.i(pca2.v0(), (u93)new ril((Object)this, 7));
        if (bundle == null) {
            final zf4 zf4 = new zf4(current);
            zf4.q(new String[] { "messages:conversation_settings::edit_group_info:impression" });
            saw.b((okm)zf4);
        }
        final jp7 o2 = new kk7(intent.getExtras()).o();
        pf8.r(o2);
        this.c1 = o2;
        final boolean g = pjr.g((CharSequence)o2.b);
        if (bundle == null) {
            String s;
            if (!g) {
                s = "";
            }
            else {
                final long id = userIdentifier.getId();
                if (pjr.g((CharSequence)o2.b)) {
                    s = o2.b;
                }
                else {
                    s = o48.c(o2.h, Long.valueOf(id), p31, Boolean.valueOf(o2.g));
                }
            }
            this.b1 = s;
            this.a1 = s;
        }
        final View c4 = ((x9)this).C4(2131428729);
        final int a = w4j.a;
        final DMAvatar g2 = (DMAvatar)c4;
        this.g1 = g2;
        if (this.Y0) {
            ((ViewGroup)g2).removeAllViews();
            g2.g(o2.h, o2.g, g2.c(o2));
        }
        else {
            final ww9 z0 = this.Z0;
            if (z0 != null) {
                g2.f(z0.C0, o2, this.a1);
            }
            else {
                g2.i(o2, this.a1);
            }
        }
        final TwitterEditText twitterEditText = (TwitterEditText)((x9)this).C4(2131428879);
        ((TextView)twitterEditText).setHint(2131953264);
        if (g) {
            ((TextView)twitterEditText).setText((CharSequence)this.a1);
        }
        ((TextView)twitterEditText).addTextChangedListener((TextWatcher)new GroupInfoEditContentViewProvider$a(this));
        final mmb mmb = new mmb();
        mmb.b(twitterEditText, (jmb)GroupInfoEditContentViewProvider.q1, 2131953250);
        mmb.e = (mmb$g)new l71((Object)this, 22);
        ((x9)this).C4(2131427739).setOnClickListener((View$OnClickListener)new ry((Object)this, 12));
        this.d1 = new yqg(p31, (on)new yqx((Object)gob, 14), "dm_group_avatar_composition", l1h.M0, userIdentifier, z7x, ibm, 1);
        final Fragment h = ((x9)this).I4().H("GroupAvatarDialog_Actions");
        if (h instanceof wil) {
            ((cl1)h).T1 = this.W4();
        }
        final t9j a2 = p9s.a((Class)h2w.class);
        this.h1 = (t9j<h2w>)a2;
        f.j(a2.a(), (u93)new dgk((Object)this, 9), (raa)ibm);
        final t9j a3 = p9s.a((Class)xdm.class);
        this.i1 = (t9j<xdm>)a3;
        f.j(a3.a(), (u93)new jp3((Object)this, 10), (raa)ibm);
        final t9j a4 = p9s.a((Class)p2w.class);
        this.j1 = (t9j<p2w>)a4;
        f.j(a4.a(), (u93)new en((Object)this, 9), (raa)ibm);
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        super.N2(fai, menu);
        fai.z(2131689488, menu);
        return true;
    }
    
    public final mw8 W4() {
        final GroupInfoEditContentViewProvider$b groupInfoEditContentViewProvider$b = new GroupInfoEditContentViewProvider$b(this);
        final boolean y4 = this.Y4();
        final int m2 = u8c.m2;
        Integer value = null;
        Integer value2;
        if (y4) {
            value2 = 0;
        }
        else {
            value2 = null;
        }
        if (y4) {
            value = 3;
        }
        final int[] g = hr4.G((Collection)ijf.w((Object)value2, (Object[])new Integer[] { 1, 2, value }));
        pf8.r(g);
        return (mw8)new u8c$a(g, (u8c$b)groupInfoEditContentViewProvider$b);
    }
    
    public final boolean X4() {
        return this.X0 || this.Y0 || this.Z0 != null;
    }
    
    public final boolean Y4() {
        if (!this.Y0) {
            final jp7 c1 = this.c1;
            pf8.r(c1);
            if (c1.d != null || this.Z0 != null) {
                return true;
            }
        }
        return false;
    }
    
    public final void Z4() {
        final fai g4 = ((x9)this).G4();
        pf8.r(g4);
        final MenuItem item = g4.findItem(2131430026);
        if (item != null) {
            final boolean x0 = this.X0;
            final boolean b = false;
            boolean enabled = false;
            Label_0082: {
                if (!x0) {
                    final boolean b2 = this.Y0 || this.Z0 != null;
                    enabled = b;
                    if (!b2) {
                        break Label_0082;
                    }
                }
                enabled = b;
                if (this.W0) {
                    enabled = true;
                }
            }
            item.setEnabled(enabled);
        }
        else {
            ((x9)this).F4().h().subscribe((wbj)new jo1<Iterable<gai>>() {
                public final void onNext(final Object o) {
                    for (final gai gai : (Iterable)o) {
                        final GroupInfoEditContentViewProvider d0 = GroupInfoEditContentViewProvider.this;
                        if (gai == d0) {
                            final sn4 q1 = GroupInfoEditContentViewProvider.q1;
                            d0.Z4();
                            ((u29)this).dispose();
                        }
                    }
                }
            });
        }
    }
    
    public final int d2(final fai fai) {
        this.Z4();
        return 2;
    }
    
    public final boolean j() {
        if (this.X4()) {
            final xil$b xil$b = new xil$b(2);
            ((xil$a)xil$b).H(2131953210);
            ((xil$a)xil$b).A(2131951733);
            ((xil$a)xil$b).F(2131953135);
            ((xil$a)xil$b).C(2131952375);
            final cl1 w = ((dl1$a)xil$b).w();
            w.T1 = this;
            final int a = w4j.a;
            w.l2(((x9)this).I4());
            return true;
        }
        return super.j();
    }
    
    public final void l0(final Dialog dialog, final int n, final int n2) {
        if (n == 2 && n2 == -1) {
            ((Activity)((x9)this).D0).setResult(0);
            ((x9)this).D4();
        }
    }
    
    public final boolean q(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131430026) {
            ij1.c(this.X4(), "Save button should not be enabled when no changes present.");
            if (this.X0) {
                final t9j<h2w> h1 = this.h1;
                final Context p = this.p1;
                final UserIdentifier f1 = this.f1;
                final String a = this.c1.a;
                final String a2 = this.a1;
                pf8.r(a2);
                h1.d((kmm)new h2w(p, f1, a, a2, this.k1, this.l1, this.m1, this.n1, this.o1));
            }
            if (this.Y0) {
                this.i1.d((kmm)new xdm(this.p1, this.f1, this.c1.a, this.k1, this.l1, this.m1, this.n1, this.o1));
            }
            else if (this.Z0 != null) {
                this.j1.d((kmm)new p2w(this.p1, this.f1, this.c1.a, this.Z0, this.k1, this.l1, this.m1, this.n1, this.o1));
            }
            final zf4 zf4 = new zf4(this.f1);
            zf4.q(new String[] { "messages:conversation_settings:::save" });
            saw.b((okm)zf4);
            ((Activity)((x9)this).D0).setResult(-1, new Intent().putExtra("is_updated", this.X4()));
            ((x9)this).D4();
            return true;
        }
        return super.q(menuItem);
    }
}
