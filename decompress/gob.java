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

public class gob extends ComponentActivity implements hn$e, hn$f
{
    public final iob P0;
    public final f Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    
    public gob() {
        this.P0 = new iob((lob)new a());
        this.Q0 = new f((lbf)this);
        this.T0 = true;
        super.G0.b.b("android:support:lifecycle", (wso$c)new fob(this));
        this.r((hk6)new cob(this));
        super.M0.add(new dob(this));
        this.G((dhj)new eob(this));
    }
    
    public static boolean R(final p p) {
        final d$c f0 = d$c.F0;
        final Iterator<Object> iterator = p.M().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = iterator.next();
            if (fragment == null) {
                continue;
            }
            final lob v0 = fragment.V0;
            Object u0;
            if (v0 == null) {
                u0 = null;
            }
            else {
                u0 = v0.u0();
            }
            int n2 = n;
            if (u0 != null) {
                n2 = (n | (R(fragment.M0()) ? 1 : 0));
            }
            final cqb s1 = fragment.s1;
            n = n2;
            if (s1 != null) {
                s1.c();
                n = n2;
                if (s1.E0.b.b(f0)) {
                    fragment.s1.E0.k();
                    n = (true ? 1 : 0);
                }
            }
            if (!fragment.r1.b.b(f0)) {
                continue;
            }
            fragment.r1.k();
            n = (true ? 1 : 0);
        }
        return n != 0;
    }
    
    public final p Q() {
        return (p)this.P0.a.G0;
    }
    
    public void S() {
        this.Q0.f(d$b.ON_RESUME);
        final apb g0 = this.P0.a.G0;
        ((p)g0).F = false;
        ((p)g0).G = false;
        ((p)g0).M.h = false;
        ((p)g0).u(7);
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
        printWriter.print(this.R0);
        printWriter.print(" mResumed=");
        printWriter.print(this.S0);
        printWriter.print(" mStopped=");
        printWriter.print(this.T0);
        if (((Activity)this).getApplication() != null) {
            g3g.b((lbf)this).a(string, fileDescriptor, printWriter, array);
        }
        ((p)this.P0.a.G0).w(s, fileDescriptor, printWriter, array);
    }
    
    @Deprecated
    public final void j() {
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.P0.a();
        super.onActivityResult(n, n2, intent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.Q0.f(d$b.ON_CREATE);
        ((p)this.P0.a.G0).j();
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View onCreateView = ((p)this.P0.a.G0).f.onCreateView(view, s, context, set);
        if (onCreateView == null) {
            return super.onCreateView(view, s, context, set);
        }
        return onCreateView;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View onCreateView = ((p)this.P0.a.G0).f.onCreateView((View)null, s, context, set);
        if (onCreateView == null) {
            return super.onCreateView(s, context, set);
        }
        return onCreateView;
    }
    
    public void onDestroy() {
        super.onDestroy();
        ((p)this.P0.a.G0).l();
        this.Q0.f(d$b.ON_DESTROY);
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return super.onMenuItemSelected(n, menuItem) || (n == 6 && ((p)this.P0.a.G0).i(menuItem));
    }
    
    public void onPause() {
        super.onPause();
        this.S0 = false;
        ((p)this.P0.a.G0).u(5);
        this.Q0.f(d$b.ON_PAUSE);
    }
    
    public void onPostResume() {
        super.onPostResume();
        this.S();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.P0.a();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        this.P0.a();
        super.onResume();
        this.S0 = true;
        ((p)this.P0.a.G0).A(true);
    }
    
    public void onStart() {
        this.P0.a();
        super.onStart();
        this.T0 = false;
        if (!this.R0) {
            this.R0 = true;
            final apb g0 = this.P0.a.G0;
            ((p)g0).F = false;
            ((p)g0).G = false;
            ((p)g0).M.h = false;
            ((p)g0).u(4);
        }
        ((p)this.P0.a.G0).A(true);
        this.Q0.f(d$b.ON_START);
        final apb g2 = this.P0.a.G0;
        ((p)g2).F = false;
        ((p)g2).G = false;
        ((p)g2).M.h = false;
        ((p)g2).u(5);
    }
    
    public final void onStateNotSaved() {
        this.P0.a();
    }
    
    public void onStop() {
        super.onStop();
        this.T0 = true;
        while (R(this.Q())) {}
        final apb g0 = this.P0.a.G0;
        ((p)g0).G = true;
        ((p)g0).M.h = true;
        ((p)g0).u(4);
        this.Q0.f(d$b.ON_STOP);
    }
    
    public final class a extends lob<gob> implements bhj, akj, yij, bjj, b9x, rgj, po, yso, cpb, s4h
    {
        public a() {
            super(gob.this);
        }
        
        public final wso B() {
            return gob.this.G0.b;
        }
        
        public final void J(final hk6<ush> hk6) {
            gob.this.N0.add(hk6);
        }
        
        public final void M(final hk6<Integer> hk6) {
            gob.this.L0.add(hk6);
        }
        
        public final void O(final hk6<Integer> hk6) {
            gob.this.L0.remove(hk6);
        }
        
        public final OnBackPressedDispatcher V() {
            return gob.this.I0;
        }
        
        public final void X(final h5h h5h) {
            gob.this.E0.d(h5h);
        }
        
        public final void Y(final hk6<Configuration> hk6) {
            gob.this.K0.remove(hk6);
        }
        
        public final d b() {
            return (d)gob.this.Q0;
        }
        
        public final void e0(final hk6<rck> hk6) {
            gob.this.O0.remove(hk6);
        }
        
        public final void h(final h5h h5h) {
            final t4h e0 = gob.this.E0;
            e0.b.add(h5h);
            e0.a.run();
        }
        
        public final void h0() {
            Objects.requireNonNull(gob.this);
        }
        
        public final void l(final hk6<rck> hk6) {
            gob.this.O0.add(hk6);
        }
        
        public final ActivityResultRegistry m() {
            return (ActivityResultRegistry)gob.this.J0;
        }
        
        public final View q0(final int n) {
            return ((Activity)gob.this).findViewById(n);
        }
        
        public final void r(final hk6<Configuration> hk6) {
            gob.this.r((hk6)hk6);
        }
        
        public final boolean r0() {
            final Window window = ((Activity)gob.this).getWindow();
            return window != null && window.peekDecorView() != null;
        }
        
        public final x8x t() {
            return gob.this.t();
        }
        
        @Override
        public final void t0(final PrintWriter printWriter, final String[] array) {
            gob.this.dump("  ", null, printWriter, array);
        }
        
        @Override
        public final Object u0() {
            return gob.this;
        }
        
        @Override
        public final LayoutInflater v0() {
            return ((Activity)gob.this).getLayoutInflater().cloneInContext((Context)gob.this);
        }
        
        @Override
        public final void w0() {
            ((Activity)gob.this).invalidateOptionsMenu();
        }
        
        public final void y(final hk6<ush> hk6) {
            gob.this.N0.remove(hk6);
        }
    }
}
