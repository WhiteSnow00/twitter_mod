import com.twitter.ui.user.BaseUserView;
import android.os.BaseBundle;
import android.app.Dialog;
import android.app.Activity;
import android.content.res.Resources;
import java.util.concurrent.Callable;
import com.twitter.ui.user.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.text.format.DateUtils;
import java.util.Date;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import androidx.fragment.app.Fragment$InstantiationException;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.twitter.login.api.LoginVerificationArgs;
import android.content.Context;
import android.app.ProgressDialog;
import android.text.style.StyleSpan;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbg extends idv<rbg$a>
{
    public static final rbg$a o1;
    public static final rbg$a p1;
    public static final List<rbg$a> q1;
    public static final zkf<rbg$a> r1;
    public final fci<?> e1;
    public qgv f1;
    public StyleSpan[] g1;
    public ProgressDialog h1;
    public b i1;
    public final laj<q2c> j1;
    public final laj<mf> k1;
    public final laj<qbm> l1;
    public final Context m1;
    public final de6 n1;
    
    static {
        r1 = new zkf((Iterable)(q1 = ojf.w((Object)(o1 = new rbg$a((ybg)null)), (Object[])new rbg$a[] { p1 = new rbg$a((ybg)null) })));
    }
    
    public rbg(final hdv hdv, final fci<?> e1, final Context m1, final LoginVerificationArgs loginVerificationArgs, final cbs cbs) {
        super(hdv);
        final de6 n1 = new de6();
        this.n1 = n1;
        this.e1 = e1;
        final UserIdentifier accountId = loginVerificationArgs.getAccountId();
        qdw qdw;
        if (accountId.isRegularUser()) {
            qdw = pdw.b(accountId);
        }
        else {
            qdw = pdw.d();
        }
        this.f1 = qdw.getUser();
        this.m1 = m1;
        this.g1 = new StyleSpan[] { new StyleSpan(1), new StyleSpan(1), new StyleSpan(1) };
        final b i1 = new b(m1, rbg.q1);
        this.i1 = i1;
        super.a1.S1((sz5)i1);
        final kcm r0 = super.R0;
        Objects.requireNonNull(n1);
        r0.i((sj)new fwt(n1, 1));
        final laj a = cbs.a((Class)q2c.class);
        this.j1 = (laj<q2c>)a;
        f.j(a.a(), (fa3)new lpa(this, 2), (gba)super.R0);
        final laj a2 = cbs.a((Class)mf.class);
        this.k1 = (laj<mf>)a2;
        f.j(a2.a(), (fa3)new pgc(this, 2), (gba)super.R0);
        final laj a3 = cbs.a((Class)qbm.class);
        this.l1 = (laj<qbm>)a3;
        f.j(a3.a(), (fa3)new kg1((Object)this, 2), (gba)super.R0);
    }
    
    public static int e1(final int[] array) {
        int n = 0;
        if (array != null) {
            if (array.length == 0) {
                n = n;
            }
            else {
                n = array[0];
            }
        }
        return n;
    }
    
    public static void i1(final int n) {
        ehk.c().c(n, 1);
    }
    
    public final void M0() {
        super.M0();
        this.d1();
    }
    
    public final void N0() {
        super.N0();
        final fg4 fg4 = new fg4(this.f1.f());
        ((o1p)fg4).q(new String[] { "login_verification::::impression" });
        if (this.D0() && ((Activity)super.F0).getCallingActivity() != null && ((Activity)super.F0).getCallingActivity().getPackageName() != null && ((Activity)super.F0).getCallingActivity().getPackageName().contains(".twitter.")) {
            ((o1p)fg4).B = "settings";
            final int a = o5j.a;
        }
        else {
            ((o1p)fg4).B = "push";
            final int a2 = o5j.a;
        }
        sbw.b((tlm)fg4);
    }
    
    public final void T0() {
        this.d1();
    }
    
    public final void d1() {
        this.j1.d((pnm)new q2c(this.f1.f(), this.f1.f()));
        final fg4 fg4 = new fg4(this.f1.f());
        ((o1p)fg4).q(new String[] { "login_verification::::get_newer" });
        sbw.b((tlm)fg4);
    }
    
    public final void f1() {
        final ProgressDialog h1 = this.h1;
        if (h1 != null) {
            ((Dialog)h1).dismiss();
        }
    }
    
    public final void g1(final String s) {
        final p4e e = this.i1.e();
        if (e != null) {
            this.i1.G0.d((p4e)new zkf((Iterable)k6e.e((Iterable)e, (nuk)new qbg((Object)s, 0))));
        }
        if (this.i1.getCount() == 1) {
            this.i1.G0.d((p4e)rbg.r1);
        }
    }
    
    public final void h1(final int[] array) {
        switch (e1(array)) {
            default: {
                this.j1();
                break;
            }
            case 236: {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putInt("twitter:id", 1);
                ((BaseBundle)bundle).putInt("title", 2131954871);
                final int a = o5j.a;
                ((BaseBundle)bundle).putInt("message", 2131954870);
                final int a2 = o5j.a;
                ((BaseBundle)bundle).putInt("neutral_button", 17039370);
                final int a3 = o5j.a;
                if (((BaseBundle)bundle).containsKey("twitter:id")) {
                    final vjl d = qa3.d(bundle);
                    final int a4 = o5j.a;
                    ((bl1)d).l2(this.w0());
                    break;
                }
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            case 235:
            case 237: {
                i1(2131954874);
                break;
            }
        }
    }
    
    public final void j1() {
        i1(2131959271);
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "login_verification";
        final k3a$d b = udv$b.b;
        final i3a$a i3a$a = new i3a$a();
        final tx6 a = lfs.a;
        i3a$a.a = (lfs)new zkr(2131954883);
        b.c = new k3a$e((i3a)((z4j)i3a$a).e());
        final k3a$d b2 = udv$b.b;
        b2.a = 2131624404;
        b2.b = 2131624406;
        return udv$b;
    }
    
    public final class b extends z3e<rbg$a>
    {
        public static final int J0 = 0;
        public final rbg I0;
        
        public b(final rbg i0, final Context context, final List<rbg$a> list) {
            this.I0 = i0;
            super(context);
            super.G0.d((p4e)new zkf((Iterable)list));
        }
        
        public final void a(final View view, final Context context, final Object o) {
            final rbg$a rbg$a = (rbg$a)o;
            final TextView textView = (TextView)view.findViewById(2131429889);
            final ImageButton imageButton = (ImageButton)view.findViewById(2131427447);
            final ImageButton imageButton2 = (ImageButton)view.findViewById(2131427450);
            if (!rbg$a.equals(rbg.o1)) {
                if (rbg$a.equals(rbg.p1)) {
                    textView.setText((CharSequence)this.I0.z0().getString(2131954883));
                    ((View)imageButton).setVisibility(4);
                    ((View)imageButton2).setVisibility(4);
                }
                else {
                    final ybg a = rbg$a.a;
                    if (a != null) {
                        final long time = new Date().getTime();
                        String s;
                        if (flr.e((CharSequence)a.H0)) {
                            s = this.I0.z0().getString(2131954881);
                        }
                        else {
                            s = a.H0;
                        }
                        String s2;
                        if (flr.e((CharSequence)a.I0)) {
                            s2 = this.I0.z0().getString(2131954880);
                        }
                        else {
                            s2 = a.I0;
                        }
                        if (Math.abs(a.J0 - time) >= 20000L && a.J0 <= time) {
                            final rbg i0 = this.I0;
                            textView.setText((CharSequence)eg8.a0(i0.g1, i0.z0().getString(2131954852, new Object[] { s, s2, DateUtils.getRelativeTimeSpanString(a.J0, new Date().getTime(), 0L) }), String.valueOf('\"')));
                        }
                        else {
                            final rbg i2 = this.I0;
                            textView.setText((CharSequence)eg8.a0(i2.g1, i2.z0().getString(2131954853, new Object[] { s, s2 }), String.valueOf('\"')));
                        }
                        ((View)imageButton).setOnClickListener((View$OnClickListener)new ty((Object)this, (Object)a, 1));
                        ((View)imageButton2).setOnClickListener((View$OnClickListener)new sbg((Object)this, (Object)a, 0));
                        ((View)imageButton).setVisibility(0);
                        ((View)imageButton2).setVisibility(0);
                    }
                }
            }
        }
        
        public final int d(final Object o) {
            return (o.equals(rbg.o1) ^ true) ? 1 : 0;
        }
        
        public final View f(final Context context, final int n, final ViewGroup viewGroup) {
            if (n == 0) {
                final rbg i0 = this.I0;
                Objects.requireNonNull(i0);
                final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131623970, viewGroup, false);
                ((ImageView)inflate.findViewById(2131428221)).setVisibility(4);
                final UserView userView = (UserView)inflate;
                userView.setUser(i0.f1);
                ((BaseUserView)userView).setVerified(false);
                ((BaseUserView)userView).setProtected(false);
                return inflate;
            }
            return LayoutInflater.from(context).inflate(2131624770, viewGroup, false);
        }
        
        public final void g(final ica ica, final String s, final String b) {
            final fg4 fg4 = new fg4(this.I0.f1.f());
            ((o1p)fg4).T = dda.Companion.c(ica, s).toString();
            final int a = o5j.a;
            final ufv ufv = new ufv();
            ufv.b = b;
            ((o1p)fg4).i((d1p)ufv);
            sbw.b((tlm)fg4);
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            return tqb.L((sz5)this, n, view, viewGroup, this.I0.m1);
        }
        
        public final int getViewTypeCount() {
            return 2;
        }
        
        public final void h(final ybg ybg, final boolean b) {
            String s;
            if (b) {
                s = "accept";
            }
            else {
                s = "reject";
            }
            final ica c = hca.c("login_verification", "", "request", s);
            this.g(c, "click", ybg.F0);
            final rbg i0 = this.I0;
            final Resources z0 = i0.z0();
            int n;
            if (b) {
                n = 2131954855;
            }
            else {
                n = 2131954872;
            }
            final String string = z0.getString(n);
            if (i0.D0()) {
                (i0.h1 = new ProgressDialog(i0.q0())).setProgressStyle(0);
                i0.h1.setMessage((CharSequence)string);
                i0.h1.setIndeterminate(true);
                ((Dialog)i0.h1).setCancelable(false);
                ((Dialog)i0.h1).show();
            }
            this.I0.n1.a(xw0.l((Callable)new tbg((Object)ybg, 0), (bdq)new rbg$b$a(this, b, c, ybg)));
        }
    }
}
