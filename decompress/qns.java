import java.util.Deque;
import android.content.Context;
import java.util.Iterator;
import android.view.MenuItem;
import androidx.fragment.app.p;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qns implements pns
{
    public boolean F0;
    public final Object G0;
    public final Object H0;
    
    public qns(final Object g0, final Object h0) {
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public qns(final Executor h0) {
        this.F0 = false;
        Objects.requireNonNull(h0);
        this.H0 = h0;
        this.G0 = new ArrayDeque();
    }
    
    public final void a() {
        if (!this.F0) {
            if (!((p)this.G0).H) {
                final ods ods = (ods)this.H0;
                final MenuItem item = ((zai)ods.d.get()).findItem(2131428831);
                final boolean h = ods.b.H;
                int n2;
                final int n = n2 = 0;
                Label_0165: {
                    if (!h) {
                        n2 = n;
                        if (ods.c.c()) {
                            final Iterator iterator = ods.e.q().iterator();
                            while (true) {
                                while (iterator.hasNext()) {
                                    if (((qdw)iterator.next()).g()) {
                                        final boolean b = true;
                                        n2 = n;
                                        if (!b) {
                                            break Label_0165;
                                        }
                                        n2 = n;
                                        if (item == null) {
                                            break Label_0165;
                                        }
                                        n2 = n;
                                        if (item.isVisible()) {
                                            n2 = 1;
                                        }
                                        break Label_0165;
                                    }
                                }
                                final boolean b = false;
                                continue;
                            }
                        }
                    }
                }
                if (n2 != 0) {
                    final ods ods2 = (ods)this.H0;
                    ods2.c.b();
                    final Context a = ods2.a;
                    final int n3 = njt.N1;
                    final njt$b njt$b = new njt$b(a, 2131428831);
                    njt$b.c = 2132017890;
                    njt$b.b(2131958698);
                    njt$b.a(1);
                    njt$b.c(ods2.b, "teams_access_accounts_tooltip");
                }
            }
        }
    }
    
    @Override
    public final void f(final Runnable runnable) {
        synchronized (this) {
            ((Deque)this.G0).remove(runnable);
        }
    }
    
    @Override
    public final void x(final Runnable runnable) {
        synchronized (this) {
            if (this.F0) {
                ((Deque)this.G0).add(runnable);
            }
            else {
                ((Executor)this.H0).execute(runnable);
            }
        }
    }
}
