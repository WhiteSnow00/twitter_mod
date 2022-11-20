import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.d;
import android.content.res.Configuration;
import androidx.activity.OnBackPressedDispatcher;
import android.view.MenuItem;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build$VERSION;
import java.util.Objects;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.lifecycle.d$b;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d$c;
import androidx.fragment.app.p;
import androidx.lifecycle.f;
import androidx.activity.ComponentActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public class cnb extends ComponentActivity implements gn$e, gn$f
{
    public final enb Q0;
    public final f R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    
    public cnb() {
        this.Q0 = new enb(new a());
        this.R0 = new f((xaf)this);
        this.U0 = true;
        super.H0.b.b("android:support:lifecycle", (nto.c)new bnb(this));
        this.s((nj6)new zmb(this));
        super.N0.add(new ymb(this, 0));
        this.F((jhj)new anb(this));
    }
    
    public static boolean Q(final p p) {
        final d$c g0 = d$c.G0;
        final Iterator iterator = p.M().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = (Fragment)iterator.next();
            if (fragment == null) {
                continue;
            }
            final hnb<?> w0 = fragment.W0;
            Object u0;
            if (w0 == null) {
                u0 = null;
            }
            else {
                u0 = w0.u0();
            }
            int n2 = n;
            if (u0 != null) {
                n2 = (n | (Q(fragment.M0()) ? 1 : 0));
            }
            final yob t1 = fragment.t1;
            n = n2;
            if (t1 != null) {
                t1.c();
                n = n2;
                if (t1.F0.b.b(g0)) {
                    fragment.t1.F0.k();
                    n = (true ? 1 : 0);
                }
            }
            if (!fragment.s1.b.b(g0)) {
                continue;
            }
            fragment.s1.k();
            n = (true ? 1 : 0);
        }
        return n != 0;
    }
    
    public final p P() {
        return (p)this.Q0.a.H0;
    }
    
    public void R() {
        this.R0.f(d$b.ON_RESUME);
        final wnb h0 = this.Q0.a.H0;
        ((p)h0).F = false;
        ((p)h0).G = false;
        ((p)h0).M.h = false;
        ((p)h0).u(7);
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        int n2;
        final int n = n2 = 0;
        Label_0220: {
            if (array != null) {
                n2 = n;
                if (array.length > 0) {
                    final String s2 = array[0];
                    Objects.requireNonNull(s2);
                    int n3 = -1;
                    switch (s2) {
                        case "--autofill": {
                            n3 = 2;
                            break;
                        }
                        case "--contentcapture": {
                            n3 = 1;
                            break;
                        }
                        case "--translation": {
                            n3 = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    switch (n3) {
                        default: {
                            n2 = n;
                            break Label_0220;
                        }
                        case 2: {
                            n2 = n;
                            if (Build$VERSION.SDK_INT >= 26) {
                                break;
                            }
                            break Label_0220;
                        }
                        case 1: {
                            n2 = n;
                            if (Build$VERSION.SDK_INT >= 29) {
                                break;
                            }
                            break Label_0220;
                        }
                        case 0: {
                            n2 = n;
                            if (Build$VERSION.SDK_INT >= 31) {
                                break;
                            }
                            break Label_0220;
                        }
                    }
                    n2 = 1;
                }
            }
        }
        if ((n2 ^ 0x1) == 0x0) {
            return;
        }
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("  ");
        final String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.S0);
        printWriter.print(" mResumed=");
        printWriter.print(this.T0);
        printWriter.print(" mStopped=");
        printWriter.print(this.U0);
        if (((Activity)this).getApplication() != null) {
            r2g.b((xaf)this).a(string, fileDescriptor, printWriter, array);
        }
        ((p)this.Q0.a.H0).w(s, fileDescriptor, printWriter, array);
    }
    
    @Deprecated
    public final void g() {
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.Q0.a();
        super.onActivityResult(n, n2, intent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.R0.f(d$b.ON_CREATE);
        ((p)this.Q0.a.H0).j();
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View onCreateView = ((p)this.Q0.a.H0).f.onCreateView(view, s, context, set);
        if (onCreateView == null) {
            return super.onCreateView(view, s, context, set);
        }
        return onCreateView;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View onCreateView = ((p)this.Q0.a.H0).f.onCreateView(null, s, context, set);
        if (onCreateView == null) {
            return super.onCreateView(s, context, set);
        }
        return onCreateView;
    }
    
    public void onDestroy() {
        super.onDestroy();
        ((p)this.Q0.a.H0).l();
        this.R0.f(d$b.ON_DESTROY);
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return super.onMenuItemSelected(n, menuItem) || (n == 6 && ((p)this.Q0.a.H0).i(menuItem));
    }
    
    public void onPause() {
        super.onPause();
        this.T0 = false;
        ((p)this.Q0.a.H0).u(5);
        this.R0.f(d$b.ON_PAUSE);
    }
    
    public void onPostResume() {
        super.onPostResume();
        this.R();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.Q0.a();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        this.Q0.a();
        super.onResume();
        this.T0 = true;
        ((p)this.Q0.a.H0).A(true);
    }
    
    public void onStart() {
        this.Q0.a();
        super.onStart();
        this.U0 = false;
        if (!this.S0) {
            this.S0 = true;
            final wnb h0 = this.Q0.a.H0;
            ((p)h0).F = false;
            ((p)h0).G = false;
            ((p)h0).M.h = false;
            ((p)h0).u(4);
        }
        ((p)this.Q0.a.H0).A(true);
        this.R0.f(d$b.ON_START);
        final wnb h2 = this.Q0.a.H0;
        ((p)h2).F = false;
        ((p)h2).G = false;
        ((p)h2).M.h = false;
        ((p)h2).u(5);
    }
    
    public final void onStateNotSaved() {
        this.Q0.a();
    }
    
    public void onStop() {
        super.onStop();
        this.U0 = true;
        while (Q(this.P())) {}
        final wnb h0 = this.Q0.a.H0;
        ((p)h0).G = true;
        ((p)h0).M.h = true;
        ((p)h0).u(4);
        this.R0.f(d$b.ON_STOP);
    }
    
    public final class a extends hnb<cnb> implements hhj, gkj, ejj, hjj, w9x, xgj, po, pto, ynb, t4h
    {
        public final cnb I0;
        
        public a(final cnb i0) {
            super(this.I0 = i0);
        }
        
        public final nto A() {
            return this.I0.H0.b;
        }
        
        public final void L(final nj6<zsh> nj6) {
            this.I0.O0.add(nj6);
        }
        
        public final void N(final nj6<Integer> nj6) {
            this.I0.M0.add(nj6);
        }
        
        public final void O(final nj6<Integer> nj6) {
            this.I0.M0.remove(nj6);
        }
        
        public final OnBackPressedDispatcher U() {
            return this.I0.J0;
        }
        
        public final void X(final i5h i5h) {
            this.I0.F0.d(i5h);
        }
        
        public final void Z(final nj6<Configuration> nj6) {
            this.I0.L0.remove(nj6);
        }
        
        public final d b() {
            return (d)this.I0.R0;
        }
        
        public final void e0(final nj6<wck> nj6) {
            this.I0.P0.remove(nj6);
        }
        
        public final void h(final i5h i5h) {
            final u4h f0 = this.I0.F0;
            f0.b.add(i5h);
            f0.a.run();
        }
        
        public final void h0() {
            Objects.requireNonNull(this.I0);
        }
        
        public final void k(final nj6<wck> nj6) {
            this.I0.P0.add(nj6);
        }
        
        public final ActivityResultRegistry m() {
            return (ActivityResultRegistry)this.I0.K0;
        }
        
        public final s9x p() {
            return this.I0.p();
        }
        
        public final View q0(final int n) {
            return ((Activity)this.I0).findViewById(n);
        }
        
        public final boolean r0() {
            final Window window = ((Activity)this.I0).getWindow();
            return window != null && window.peekDecorView() != null;
        }
        
        public final void s(final nj6<Configuration> nj6) {
            this.I0.s((nj6)nj6);
        }
        
        public final void t0(final PrintWriter printWriter, final String[] array) {
            this.I0.dump("  ", null, printWriter, array);
        }
        
        public final Object u0() {
            return this.I0;
        }
        
        public final LayoutInflater v0() {
            return ((Activity)this.I0).getLayoutInflater().cloneInContext((Context)this.I0);
        }
        
        public final void w0() {
            ((Activity)this.I0).invalidateOptionsMenu();
        }
        
        public final void x(final nj6<zsh> nj6) {
            this.I0.O0.remove(nj6);
        }
    }
}
