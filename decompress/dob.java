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

public class dob extends ComponentActivity implements kn$e, kn$f
{
    public final fob S0;
    public final f T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    
    public dob() {
        this.S0 = new fob((iob)new a());
        this.T0 = new f((tbf)this);
        this.W0 = true;
        super.J0.b.b("android:support:lifecycle", (huo$c)new cob(this));
        this.s((tk6)new znb(this));
        super.P0.add(new aob(this));
        this.F((xhj)new bob(this));
    }
    
    public static boolean Q(final p p) {
        final d$c i0 = d$c.I0;
        final Iterator iterator = p.M().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = (Fragment)iterator.next();
            if (fragment == null) {
                continue;
            }
            final iob y0 = fragment.Y0;
            Object u0;
            if (y0 == null) {
                u0 = null;
            }
            else {
                u0 = y0.u0();
            }
            int n2 = n;
            if (u0 != null) {
                n2 = (n | (Q(fragment.M0()) ? 1 : 0));
            }
            final zpb v1 = fragment.v1;
            n = n2;
            if (v1 != null) {
                v1.c();
                n = n2;
                if (v1.H0.b.b(i0)) {
                    fragment.v1.H0.k();
                    n = (true ? 1 : 0);
                }
            }
            if (!fragment.u1.b.b(i0)) {
                continue;
            }
            fragment.u1.k();
            n = (true ? 1 : 0);
        }
        return n != 0;
    }
    
    public final p P() {
        return (p)this.S0.a.J0;
    }
    
    public void R() {
        this.T0.f(d$b.ON_RESUME);
        final xob j0 = this.S0.a.J0;
        ((p)j0).F = false;
        ((p)j0).G = false;
        ((p)j0).M.h = false;
        ((p)j0).u(7);
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
        printWriter.print(this.U0);
        printWriter.print(" mResumed=");
        printWriter.print(this.V0);
        printWriter.print(" mStopped=");
        printWriter.print(this.W0);
        if (((Activity)this).getApplication() != null) {
            o3g.b((tbf)this).a(string, fileDescriptor, printWriter, array);
        }
        ((p)this.S0.a.J0).w(s, fileDescriptor, printWriter, array);
    }
    
    @Deprecated
    public final void g() {
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.S0.a();
        super.onActivityResult(n, n2, intent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.T0.f(d$b.ON_CREATE);
        ((p)this.S0.a.J0).j();
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View onCreateView = ((p)this.S0.a.J0).f.onCreateView(view, s, context, set);
        if (onCreateView == null) {
            return super.onCreateView(view, s, context, set);
        }
        return onCreateView;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View onCreateView = ((p)this.S0.a.J0).f.onCreateView((View)null, s, context, set);
        if (onCreateView == null) {
            return super.onCreateView(s, context, set);
        }
        return onCreateView;
    }
    
    public void onDestroy() {
        super.onDestroy();
        ((p)this.S0.a.J0).l();
        this.T0.f(d$b.ON_DESTROY);
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return super.onMenuItemSelected(n, menuItem) || (n == 6 && ((p)this.S0.a.J0).i(menuItem));
    }
    
    public void onPause() {
        super.onPause();
        this.V0 = false;
        ((p)this.S0.a.J0).u(5);
        this.T0.f(d$b.ON_PAUSE);
    }
    
    public void onPostResume() {
        super.onPostResume();
        this.R();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.S0.a();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        this.S0.a();
        super.onResume();
        this.V0 = true;
        ((p)this.S0.a.J0).A(true);
    }
    
    public void onStart() {
        this.S0.a();
        super.onStart();
        this.W0 = false;
        if (!this.U0) {
            this.U0 = true;
            final xob j0 = this.S0.a.J0;
            ((p)j0).F = false;
            ((p)j0).G = false;
            ((p)j0).M.h = false;
            ((p)j0).u(4);
        }
        ((p)this.S0.a.J0).A(true);
        this.T0.f(d$b.ON_START);
        final xob j2 = this.S0.a.J0;
        ((p)j2).F = false;
        ((p)j2).G = false;
        ((p)j2).M.h = false;
        ((p)j2).u(5);
    }
    
    public final void onStateNotSaved() {
        this.S0.a();
    }
    
    public void onStop() {
        super.onStop();
        this.W0 = true;
        while (Q(this.P())) {}
        final xob j0 = this.S0.a.J0;
        ((p)j0).G = true;
        ((p)j0).M.h = true;
        ((p)j0).u(4);
        this.T0.f(d$b.ON_STOP);
    }
    
    public final class a extends iob<dob> implements vhj, ukj, sjj, vjj, pax, lhj, uo, juo, zob, k5h
    {
        public final dob K0;
        
        public a(final dob k0) {
            super(this.K0 = k0);
        }
        
        public final huo A() {
            return this.K0.J0.b;
        }
        
        public final void L(final tk6<oth> tk6) {
            this.K0.Q0.add(tk6);
        }
        
        public final void N(final tk6<Integer> tk6) {
            this.K0.O0.add(tk6);
        }
        
        public final void O(final tk6<Integer> tk6) {
            this.K0.O0.remove(tk6);
        }
        
        public final OnBackPressedDispatcher U() {
            return this.K0.L0;
        }
        
        public final void X(final z5h z5h) {
            this.K0.H0.d(z5h);
        }
        
        public final void Z(final tk6<Configuration> tk6) {
            this.K0.N0.remove(tk6);
        }
        
        public final d b() {
            return (d)this.K0.T0;
        }
        
        public final void e0(final tk6<ldk> tk6) {
            this.K0.R0.remove(tk6);
        }
        
        public final void h(final z5h z5h) {
            final l5h h0 = this.K0.H0;
            h0.b.add(z5h);
            h0.a.run();
        }
        
        public final void h0() {
            Objects.requireNonNull(this.K0);
        }
        
        public final void k(final tk6<ldk> tk6) {
            this.K0.R0.add(tk6);
        }
        
        public final ActivityResultRegistry p() {
            return (ActivityResultRegistry)this.K0.M0;
        }
        
        public final View q0(final int n) {
            return ((Activity)this.K0).findViewById(n);
        }
        
        public final boolean r0() {
            final Window window = ((Activity)this.K0).getWindow();
            return window != null && window.peekDecorView() != null;
        }
        
        public final void s(final tk6<Configuration> tk6) {
            this.K0.s((tk6)tk6);
        }
        
        public final lax t() {
            return this.K0.t();
        }
        
        public final void t0(final PrintWriter printWriter, final String[] array) {
            this.K0.dump("  ", null, printWriter, array);
        }
        
        public final Object u0() {
            return this.K0;
        }
        
        public final LayoutInflater v0() {
            return ((Activity)this.K0).getLayoutInflater().cloneInContext((Context)this.K0);
        }
        
        public final void w0() {
            ((Activity)this.K0).invalidateOptionsMenu();
        }
        
        public final void x(final tk6<oth> tk6) {
            this.K0.Q0.remove(tk6);
        }
    }
}
