// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import androidx.appcompat.widget.Toolbar;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import java.lang.ref.WeakReference;

public abstract class g
{
    public static int F0 = -100;
    public static final bt0<WeakReference<g>> G0;
    public static final Object H0;
    
    static {
        G0 = new bt0(0);
        H0 = new Object();
    }
    
    public static void r(final g g) {
        synchronized (g.H0) {
            final bt0<WeakReference<g>> g2 = g.G0;
            Objects.requireNonNull((bt0)g2);
            final bt0.a a = new bt0.a(g2);
            while (a.hasNext()) {
                final g g3 = ((zkd<WeakReference<g>>)a).next().get();
                if (g3 == g || g3 == null) {
                    a.remove();
                }
            }
        }
    }
    
    public abstract void c(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract boolean d();
    
    public Context e(final Context context) {
        return context;
    }
    
    public abstract <T extends View> T f(final int p0);
    
    public int g() {
        return -100;
    }
    
    public abstract MenuInflater h();
    
    public abstract a i();
    
    public abstract void j();
    
    public abstract void k();
    
    public abstract void l(final Configuration p0);
    
    public abstract void m();
    
    public abstract void n();
    
    public abstract void o();
    
    public abstract void p();
    
    public abstract void q();
    
    public abstract boolean s(final int p0);
    
    public abstract void t(final int p0);
    
    public abstract void u(final View p0);
    
    public abstract void v(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void w(final Toolbar p0);
    
    public void x(final int n) {
    }
    
    public abstract void y(final CharSequence p0);
    
    public abstract al z(final al$a p0);
}
