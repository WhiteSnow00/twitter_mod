import android.os.Bundle;
import java.util.Objects;
import android.widget.TextView;
import android.view.View;
import java.util.regex.Pattern;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zng implements c4y, n9x, wqy, b00, oyg, jmb
{
    public Object C0 = view.getOverlay();
    
    public zng(final int n) {
        if (n == 4) {
            this.C0 = new SparseArray();
            return;
        }
        if (n != 12) {
            this.C0 = new cbs();
            return;
        }
        this.C0 = Pattern.compile("[\\p{Punct}&&[^#@]]");
    }
    
    public final boolean b() {
        return ((n1y)this.C0).j();
    }
    
    public final iz5 c() {
        return (iz5)sz5.C0;
    }
    
    public final void close() {
    }
    
    public final int d(final String s) {
        if (s != null && ((Pattern)this.C0).matcher(s).find()) {
            return 2;
        }
        return 0;
    }
    
    public final void e(final TextView textView, final yds yds) {
        if (textView != null) {
            final int n = 0;
            int visibility;
            if (yds instanceof j3a) {
                visibility = 8;
            }
            else if (yds instanceof jjr) {
                final int a = w4j.a;
                textView.setText(((jjr)yds).b);
                visibility = n;
            }
            else if (yds instanceof ojr) {
                final int a2 = w4j.a;
                textView.setText((CharSequence)((ojr)yds).b);
                visibility = n;
            }
            else if (yds instanceof zwm) {
                final int a3 = w4j.a;
                final zwm zwm = (zwm)yds;
                final de6 de6 = (de6)this.C0;
                final xwm b = zwm.b;
                Objects.requireNonNull(de6);
                kxm$a.a(textView, b, (kxm)de6);
                visibility = n;
            }
            else {
                visibility = n;
                if (yds instanceof wzq) {
                    final int a4 = w4j.a;
                    textView.setText((CharSequence)r60.a(((wzq)yds).b));
                    visibility = n;
                }
            }
            ((View)textView).setVisibility(visibility);
        }
    }
    
    public final void f(final Bundle bundle) {
        ((qz)this.C0).b("clx", "_ae", bundle);
    }
    
    public final float g(final int n, final int n2) {
        return ((now[])this.C0)[n].d(n2);
    }
    
    public final now h(final int n) {
        return ((now[])this.C0)[n];
    }
    
    public final void i(final int n, final int n2, final float n3) {
        ((Float[])((now[])this.C0)[n].b)[n2] = n3;
    }
    
    public final boolean isDone() {
        return true;
    }
    
    public final void j() {
        if (((cbs)this.C0).g()) {
            return;
        }
        throw new IllegalStateException("Cannot cancel a completed task.");
    }
    
    public final void k(final Exception e) {
        final cbs cbs = (cbs)this.C0;
        synchronized (cbs.a) {
            final boolean b = cbs.b;
            boolean b2 = false;
            if (b) {
                monitorexit(cbs.a);
            }
            else {
                cbs.b = true;
                cbs.e = e;
                cbs.a.notifyAll();
                cbs.f();
                monitorexit(cbs.a);
                b2 = true;
            }
            if (b2) {
                return;
            }
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
    
    public final void l(final Object o) {
        if (((cbs)this.C0).h(o)) {
            return;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }
    
    public final kvg next() {
        return (kvg)this.C0;
    }
}
