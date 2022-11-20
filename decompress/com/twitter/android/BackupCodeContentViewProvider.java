// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import android.os.BaseBundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.DialogInterface;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$InstantiationException;
import android.os.Bundle;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.permissions.PermissionContentViewResult;
import android.app.ProgressDialog;

@v81
public class BackupCodeContentViewProvider extends ucv<String> implements xv8, uv8
{
    public static final String[] l1;
    public boolean c1;
    public String d1;
    public ProgressDialog e1;
    public final w19 f1;
    public final b g1;
    public final z9j<kg1> h1;
    public final z9j<kg1> i1;
    public final dn6<x6k, PermissionContentViewResult> j1;
    public final jn k1;
    
    static {
        l1 = uxg.a;
    }
    
    public BackupCodeContentViewProvider(final tcv tcv, final jto jto, final kas kas, final obi<?> obi, final jn k1, final jkb jkb) {
        super(tcv);
        this.f1 = new w19();
        if (tcv.q == null) {
            final af4 af4 = new af4();
            ((u0p)af4).q(new String[] { "backup_code::::impression" });
            cbw.b((elm)af4);
        }
        if (tcv.q == null && ((sl1)super.E0).Z1().b("show_welcome")) {
            this.h1();
        }
        jto.b((Object)this);
        this.k1 = k1;
        final Context q0 = this.q0();
        final b g1 = new b(q0, new a(q0), (ny5<Object>)new eu4((Object)this, 5), jkb);
        this.g1 = g1;
        super.Y0.S1((my5)g1);
        if (!TextUtils.isEmpty((CharSequence)this.d1)) {
            this.g1(this.d1);
        }
        else {
            this.f1("");
        }
        final z9j<kg1> b = kas.b(kg1.class, "Create");
        this.h1 = b;
        f.j((h5j)b.a(), (n93)new hg1((Object)this, 0), (z9a)super.P0);
        final z9j<kg1> b2 = kas.b(kg1.class, "Get");
        this.i1 = b2;
        f.j((h5j)b2.a(), (n93)new ejl((Object)this, 1), (z9a)super.P0);
        final dn6 h = obi.h((Class)PermissionContentViewResult.class, ssm.a((Class)PermissionContentViewResult.class));
        this.j1 = (dn6<x6k, PermissionContentViewResult>)h;
        f.i(h.c().filter((ytk)i71.K0), (n93)new gg1((Object)this, 0));
    }
    
    public final void L0() {
        this.f1.a();
        super.L0();
    }
    
    public final void M0() {
        super.M0();
        if (ikr.e((CharSequence)this.d1) && !this.c1) {
            this.i1.d(new kg1(super.G0, true));
            this.c1 = true;
        }
    }
    
    public final void d1(final String s, final boolean b) {
        if (ikr.e((CharSequence)s)) {
            m1f.e().a((CharSequence)this.z0().getString(2131954870), 1);
            if (this.D0()) {
                this.k1.a();
            }
            return;
        }
        this.f1(s);
        if (b) {
            this.h1();
        }
    }
    
    public final void e1() {
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "backup_code::take_screenshot::failure" });
        cbw.b((elm)af4);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 2);
        ((BaseBundle)bundle).putInt("title", 2131959308);
        final int a = c5j.a;
        ((BaseBundle)bundle).putInt("message", 2131959309);
        final int a2 = c5j.a;
        ((BaseBundle)bundle).putInt("positive_button", 17039370);
        final int a3 = c5j.a;
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final jjl h = go0.h(bundle);
            final int a4 = c5j.a;
            ((wk1)h).l2(this.w0());
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
    
    public final void f1(final String d1) {
        if (!d1.equals(this.d1)) {
            this.g1(d1);
            this.d1 = d1;
        }
    }
    
    public final void g1(final String s) {
        Object j;
        if (ikr.g((CharSequence)s)) {
            j = new ckf((Iterable)rif.v((Object)s));
        }
        else {
            j = n3e.j();
        }
        this.Z0((n3e)j);
    }
    
    public final void h1() {
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "backup_code::take_screenshot::impression" });
        cbw.b((elm)af4);
        final kjl$b kjl$b = new kjl$b(1);
        ((kjl$a)kjl$b).H(2131954863);
        ((kjl$a)kjl$b).A(2131954882);
        ((kjl$a)kjl$b).F(17039379);
        ((kjl$a)kjl$b).C(17039369);
        final wk1 w = ((xk1$a)kjl$b).w();
        w.R1 = (uv8)this;
        final int a = c5j.a;
        w.k2((Fragment)super.E0);
        w.l2(this.w0());
    }
    
    public final void i1() {
        final View rootView = this.c().getView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        final Bitmap e = b12.e(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);
        if (this.D0() && e != null) {
            (this.e1 = new ProgressDialog(this.q0())).setProgressStyle(0);
            this.e1.setMessage((CharSequence)this.z0().getString(2131957388));
            this.e1.setIndeterminate(true);
            ((Dialog)this.e1).setCancelable(false);
            ((Dialog)this.e1).show();
            this.f1.c(asg.a().W3().b(new awg(m1h.H0)).a((qsb)new ig1((Object)e, 0)).G((lj6)new kds((Object)this, 2), (lj6)new jds((Object)this, 2)));
            return;
        }
        this.e1();
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n == 1) {
            if (n2 == -1) {
                final af4 af4 = new af4();
                ((u0p)af4).q(new String[] { "backup_code::take_screenshot:ok:click" });
                cbw.b((elm)af4);
                final g7k d = g7k.d();
                final Context q0 = this.q0();
                final String[] l1 = BackupCodeContentViewProvider.l1;
                if (d.a(q0, l1)) {
                    this.i1();
                }
                else {
                    final x6k$a a = x6k.a(this.z0().getString(2131957381), this.q0(), l1);
                    a.s(aba.c("backup_code", "", "take_screenshot", ""));
                    this.j1.d((Object)((n4j)a).e());
                }
            }
            else {
                final af4 af5 = new af4();
                ((u0p)af5).q(new String[] { "backup_code::take_screenshot:cancel:click" });
                cbw.b((elm)af5);
            }
        }
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        gdv$b.a = "backup_code";
        gdv$b.c = 2131624088;
        return gdv$b;
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "backup_code::take_screenshot:cancel:click" });
        cbw.b((elm)af4);
    }
    
    public static final class a extends y2e<String>
    {
        public a(final Context context) {
            super(context);
        }
        
        public final void a(final View view, final Context context, final Object o) {
            final String s = (String)o;
            final TextView textView = (TextView)view.findViewById(2131427760);
            final String[] l1 = BackupCodeContentViewProvider.l1;
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
    
    public static final class b extends fhc<String, a>
    {
        public final y8q J0;
        public final y8q K0;
        public final jkb L0;
        
        public b(final Context context, final a a, final ny5<Object> ny5, final jkb l0) {
            super((my5)a, 3, (ny5)ny5);
            this.J0 = new y8q(context.getString(2131952889));
            this.K0 = new y8q(context.getString(2131954197));
            this.L0 = l0;
        }
        
        public final Object d() {
            return this.K0;
        }
        
        public final View e(final ViewGroup viewGroup) {
            return aaq.a(viewGroup, this.K0, this.L0.c);
        }
        
        public final Object g() {
            return this.J0;
        }
        
        public final View h(final ViewGroup viewGroup) {
            return aaq.a(viewGroup, this.J0, this.L0.c);
        }
    }
}
