// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import android.os.BaseBundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.permissions.PermissionContentViewResult;
import android.app.ProgressDialog;

@a91
public class BackupCodeContentViewProvider extends acv<String> implements mw8, jw8
{
    public static final String[] k1;
    public boolean b1;
    public String c1;
    public ProgressDialog d1;
    public final m29 e1;
    public final b f1;
    public final t9j<og1> g1;
    public final t9j<og1> h1;
    public final xn6<p6k, PermissionContentViewResult> i1;
    public final kn j1;
    
    static {
        k1 = uxg.a;
    }
    
    public BackupCodeContentViewProvider(final ybv ybv, final sso sso, final p9s p9s, final mbi<?> mbi, final kn j1, final llb llb) {
        super(ybv);
        this.e1 = new m29();
        if (ybv.q == null) {
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { "backup_code::::impression" });
            saw.b((okm)zf4);
        }
        if (ybv.q == null && ((wl1)super.D0).Z1().b("show_welcome")) {
            this.h1();
        }
        sso.b((Object)this);
        this.j1 = j1;
        final Context r0 = this.r0();
        final b f1 = new b(r0, new a(r0), (dz5<Object>)new cg8((Object)this, 5), llb);
        this.f1 = f1;
        super.X0.S1(f1);
        if (!TextUtils.isEmpty((CharSequence)this.c1)) {
            this.g1(this.c1);
        }
        else {
            this.f1("");
        }
        final t9j b = p9s.b((Class)og1.class, "Create");
        this.g1 = (t9j<og1>)b;
        f.j(b.a(), (u93)new lg1((Object)this, 0), (raa)super.O0);
        final t9j b2 = p9s.b((Class)og1.class, "Get");
        this.h1 = (t9j<og1>)b2;
        f.j(b2.a(), (u93)new ril((Object)this, 1), (raa)super.O0);
        final xn6<zm, PermissionContentViewResult> h = mbi.h(PermissionContentViewResult.class, asm.a((Class)PermissionContentViewResult.class));
        this.i1 = (xn6<p6k, PermissionContentViewResult>)h;
        f.i(h.c().filter((ptk)p71.J0), (u93)new kg1((Object)this, 0));
    }
    
    @Override
    public final void L0() {
        this.e1.a();
        super.L0();
    }
    
    @Override
    public final void M0() {
        super.M0();
        if (pjr.e((CharSequence)this.c1) && !this.b1) {
            this.h1.d((kmm)new og1(super.F0, true));
            this.b1 = true;
        }
    }
    
    public final void d1(final String s, final boolean b) {
        if (pjr.e((CharSequence)s)) {
            p88.f().e((CharSequence)this.z0().getString(2131954870), 1);
            if (this.D0()) {
                this.j1.a();
            }
            return;
        }
        this.f1(s);
        if (b) {
            this.h1();
        }
    }
    
    public final void e1() {
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "backup_code::take_screenshot::failure" });
        saw.b((okm)zf4);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 2);
        ((BaseBundle)bundle).putInt("title", 2131959306);
        final int a = w4j.a;
        ((BaseBundle)bundle).putInt("message", 2131959307);
        final int a2 = w4j.a;
        ((BaseBundle)bundle).putInt("positive_button", 17039370);
        final int a3 = w4j.a;
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final wil i = yqh.i(bundle);
            final int a4 = w4j.a;
            ((cl1)i).l2(this.w0());
            return;
        }
        throw new Fragment.InstantiationException("Missing fragment id", null);
    }
    
    public final void f1(final String c1) {
        if (!c1.equals(this.c1)) {
            this.g1(c1);
            this.c1 = c1;
        }
    }
    
    public final void g1(final String s) {
        Object j;
        if (pjr.g((CharSequence)s)) {
            j = new skf((Iterable)ijf.v((Object)s));
        }
        else {
            j = i4e.j();
        }
        this.Z0((i4e<String>)j);
    }
    
    public final void h1() {
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "backup_code::take_screenshot::impression" });
        saw.b((okm)zf4);
        final xil$b xil$b = new xil$b(1);
        ((xil$a)xil$b).H(2131954863);
        ((xil$a)xil$b).A(2131954882);
        ((xil$a)xil$b).F(17039379);
        ((xil$a)xil$b).C(17039369);
        final cl1 w = ((dl1$a)xil$b).w();
        w.Q1 = (jw8)this;
        final int a = w4j.a;
        w.k2((Fragment)super.D0);
        w.l2(this.w0());
    }
    
    public final void i1() {
        final View rootView = this.c().getView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        final Bitmap e = h12.e(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);
        if (this.D0() && e != null) {
            (this.d1 = new ProgressDialog(this.r0())).setProgressStyle(0);
            this.d1.setMessage((CharSequence)this.z0().getString(2131957388));
            this.d1.setIndeterminate(true);
            ((Dialog)this.d1).setCancelable(false);
            ((Dialog)this.d1).show();
            this.e1.c(asg.a().W3().b(new awg(l1h.G0)).a((rtb)new mg1((Object)e, 0)).G((fk6)new pcs((Object)this, 2), (fk6)new ocs((Object)this, 2)));
            return;
        }
        this.e1();
    }
    
    public final void k(final DialogInterface dialogInterface, final int n) {
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "backup_code::take_screenshot:cancel:click" });
        saw.b((okm)zf4);
    }
    
    @Override
    public final void l0(final Dialog dialog, final int n, final int n2) {
        if (n == 1) {
            if (n2 == -1) {
                final zf4 zf4 = new zf4();
                zf4.q(new String[] { "backup_code::take_screenshot:ok:click" });
                saw.b((okm)zf4);
                final y6k d = y6k.d();
                final Context r0 = this.r0();
                final String[] k1 = BackupCodeContentViewProvider.k1;
                if (d.a(r0, k1)) {
                    this.i1();
                }
                else {
                    final p6k$a a = p6k.a(this.z0().getString(2131957381), this.r0(), k1);
                    a.s(rba.c("backup_code", "", "take_screenshot", ""));
                    this.i1.d((p6k)((h4j)a).e());
                }
            }
            else {
                final zf4 zf5 = new zf4();
                zf5.q(new String[] { "backup_code::take_screenshot:cancel:click" });
                saw.b((okm)zf5);
            }
        }
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "backup_code";
        lcv$b.c = 2131624088;
        return lcv$b;
    }
    
    public static final class a extends t3e<String>
    {
        public a(final Context context) {
            super(context);
        }
        
        public final void a(final View view, final Context context, final Object o) {
            final String s = (String)o;
            final TextView textView = (TextView)view.findViewById(2131427760);
            final String[] k1 = BackupCodeContentViewProvider.k1;
            String string;
            if (s != null && s.length() == 12) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, 4));
                sb.append(" ");
                sb.append(s.substring(4, 8));
                sb.append(" ");
                sb.append(s.substring(8));
                string = sb.toString();
            }
            else {
                string = "";
            }
            textView.setText((CharSequence)string);
        }
        
        public final View f(final Context context, final int n, final ViewGroup viewGroup) {
            return LayoutInflater.from(context).inflate(2131624089, (ViewGroup)null);
        }
    }
    
    public static final class b extends gic<String, a>
    {
        public final h8q I0;
        public final h8q J0;
        public final llb K0;
        
        public b(final Context context, final a a, final dz5<Object> dz5, final llb k0) {
            super((cz5)a, 3, (dz5)dz5);
            this.I0 = new h8q(context.getString(2131952889));
            this.J0 = new h8q(context.getString(2131954197));
            this.K0 = k0;
        }
        
        public final Object d() {
            return this.J0;
        }
        
        public final View e(final ViewGroup viewGroup) {
            return j9q.a(viewGroup, this.J0, this.K0.c);
        }
        
        public final Object g() {
            return this.I0;
        }
        
        public final View h(final ViewGroup viewGroup) {
            return j9q.a(viewGroup, this.I0, this.K0.c);
        }
    }
}
