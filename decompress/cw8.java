import android.os.BaseBundle;
import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import android.content.DialogInterface;
import android.os.Looper;
import androidx.fragment.app.Fragment$b;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.os.Handler;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public class cw8 extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    public cw8$a A1;
    public cw8$b B1;
    public cw8$c C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public boolean I1;
    public xbj<lbf> J1;
    public Dialog K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public Handler z1;
    
    public cw8() {
        this.A1 = new cw8$a(this);
        this.B1 = new cw8$b(this);
        this.C1 = new cw8$c(this);
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = true;
        this.G1 = true;
        this.H1 = -1;
        this.J1 = new cw8$d(this);
        this.O1 = false;
    }
    
    public void A1(final Bundle bundle) {
        final Dialog k1 = this.K1;
        if (k1 != null) {
            final Bundle onSaveInstanceState = k1.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        final int d1 = this.D1;
        if (d1 != 0) {
            ((BaseBundle)bundle).putInt("android:style", d1);
        }
        final int e1 = this.E1;
        if (e1 != 0) {
            ((BaseBundle)bundle).putInt("android:theme", e1);
        }
        final boolean f1 = this.F1;
        if (!f1) {
            bundle.putBoolean("android:cancelable", f1);
        }
        final boolean g1 = this.G1;
        if (!g1) {
            bundle.putBoolean("android:showsDialog", g1);
        }
        final int h1 = this.H1;
        if (h1 != -1) {
            ((BaseBundle)bundle).putInt("android:backStackId", h1);
        }
    }
    
    public void B1() {
        super.h1 = true;
        final Dialog k1 = this.K1;
        if (k1 != null) {
            this.L1 = false;
            k1.show();
            final View decorView = this.K1.getWindow().getDecorView();
            rp2.J0(decorView, (lbf)this);
            decorView.setTag(2131432601, (Object)this);
            kbx.b(decorView, (yso)this);
        }
    }
    
    public void C1() {
        super.h1 = true;
        final Dialog k1 = this.K1;
        if (k1 != null) {
            k1.hide();
        }
    }
    
    public void E1(Bundle bundle) {
        super.h1 = true;
        if (this.K1 != null && bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.K1.onRestoreInstanceState(bundle);
            }
        }
    }
    
    public final void F1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.F1(layoutInflater, viewGroup, bundle);
        if (super.j1 == null && this.K1 != null && bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.K1.onRestoreInstanceState(bundle2);
            }
        }
    }
    
    public final fb I0() {
        return (fb)new cw8$e(this, (fb)new Fragment$b((Fragment)this));
    }
    
    public final void Y1() {
        this.Z1(true, false);
    }
    
    public final void Z1(final boolean b, final boolean b2) {
        if (this.M1) {
            return;
        }
        this.M1 = true;
        this.N1 = false;
        final Dialog k1 = this.K1;
        if (k1 != null) {
            k1.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.K1.dismiss();
            if (!b2) {
                if (Looper.myLooper() == this.z1.getLooper()) {
                    this.onDismiss((DialogInterface)this.K1);
                }
                else {
                    this.z1.post((Runnable)this.A1);
                }
            }
        }
        this.L1 = true;
        if (this.H1 >= 0) {
            final p r0 = this.R0();
            final int h1 = this.H1;
            if (h1 < 0) {
                throw new IllegalArgumentException(yk.y("Bad id: ", h1));
            }
            r0.y((p.m)r0.new n(h1), b);
            this.H1 = -1;
        }
        else {
            final a a = new a(this.R0());
            a.o = true;
            a.n(this);
            if (b) {
                a.j();
            }
            else {
                a.c();
            }
        }
    }
    
    public Dialog a2(final Bundle bundle) {
        if (p.P(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return (Dialog)new q16(this.J1(), this.E1);
    }
    
    public final Dialog b2() {
        final Dialog k1 = this.K1;
        if (k1 != null) {
            return k1;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void c2(final int e1) {
        if (p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(0);
            sb.append(", ");
            sb.append(e1);
            Log.d("FragmentManager", sb.toString());
        }
        this.D1 = 0;
        if (e1 != 0) {
            this.E1 = e1;
        }
    }
    
    public void d2(final Dialog dialog, final int n) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return;
            }
            final Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
    
    public void dismiss() {
        this.Z1(false, false);
    }
    
    public void e2(final p p2, final String s) {
        this.M1 = false;
        this.N1 = true;
        final a a = new a(p2);
        a.o = true;
        a.e(0, this, s, 1);
        a.c();
    }
    
    @Deprecated
    public void g1(final Bundle bundle) {
        super.h1 = true;
    }
    
    public void j1(final Context context) {
        super.h1 = true;
        final lob v0 = super.V0;
        Activity d0;
        if (v0 == null) {
            d0 = null;
        }
        else {
            d0 = v0.D0;
        }
        if (d0 != null) {
            super.h1 = false;
            this.i1(d0);
        }
        super.t1.f((xbj)this.J1);
        if (!this.N1) {
            this.M1 = false;
        }
    }
    
    public void k1(final Bundle bundle) {
        super.k1(bundle);
        this.z1 = new Handler();
        this.G1 = (super.Z0 == 0);
        if (bundle != null) {
            this.D1 = ((BaseBundle)bundle).getInt("android:style", 0);
            this.E1 = ((BaseBundle)bundle).getInt("android:theme", 0);
            this.F1 = bundle.getBoolean("android:cancelable", true);
            this.G1 = bundle.getBoolean("android:showsDialog", this.G1);
            this.H1 = ((BaseBundle)bundle).getInt("android:backStackId", -1);
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        if (!this.L1) {
            if (p.P(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            this.Z1(true, true);
        }
    }
    
    public void q1() {
        super.h1 = true;
        final Dialog k1 = this.K1;
        if (k1 != null) {
            this.L1 = true;
            k1.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.K1.dismiss();
            if (!this.M1) {
                this.onDismiss((DialogInterface)this.K1);
            }
            this.K1 = null;
            this.O1 = false;
        }
    }
    
    public void r1() {
        super.h1 = true;
        if (!this.N1 && !this.M1) {
            this.M1 = true;
        }
        super.t1.j((xbj)this.J1);
    }
    
    public final LayoutInflater s1(final Bundle bundle) {
        final LayoutInflater s1 = super.s1(bundle);
        final boolean g1 = this.G1;
        if (g1 && !this.I1) {
            if (g1) {
                if (!this.O1) {
                    try {
                        this.I1 = true;
                        final Dialog a2 = this.a2(bundle);
                        this.K1 = a2;
                        if (this.G1) {
                            this.d2(a2, this.D1);
                            final Context n0 = this.N0();
                            if (n0 instanceof Activity) {
                                this.K1.setOwnerActivity((Activity)n0);
                            }
                            this.K1.setCancelable(this.F1);
                            this.K1.setOnCancelListener((DialogInterface$OnCancelListener)this.B1);
                            this.K1.setOnDismissListener((DialogInterface$OnDismissListener)this.C1);
                            this.O1 = true;
                        }
                        else {
                            this.K1 = null;
                        }
                    }
                    finally {
                        this.I1 = false;
                    }
                }
            }
            if (p.P(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
                Log.d("FragmentManager", sb.toString());
            }
            final Dialog k1 = this.K1;
            LayoutInflater cloneInContext = s1;
            if (k1 != null) {
                cloneInContext = s1.cloneInContext(k1.getContext());
            }
            return cloneInContext;
        }
        if (p.P(2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("getting layout inflater for DialogFragment ");
            sb2.append(this);
            final String string = sb2.toString();
            if (!this.G1) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("mShowsDialog = false: ");
                sb3.append(string);
                Log.d("FragmentManager", sb3.toString());
            }
            else {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("mCreatingDialog = true: ");
                sb4.append(string);
                Log.d("FragmentManager", sb4.toString());
            }
        }
        return s1;
    }
    
    public final void x0(final boolean b) {
        this.F1 = b;
        final Dialog k1 = this.K1;
        if (k1 != null) {
            k1.setCancelable(b);
        }
    }
}
