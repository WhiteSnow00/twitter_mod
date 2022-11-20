// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.List;
import androidx.lifecycle.d$b;
import android.view.View;
import kotlin.Metadata;
import androidx.lifecycle.e;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2", "Landroidx/lifecycle/e;", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements e
{
    public final cy6 D0;
    public final c0k E0;
    public final d5m F0;
    public final r7m<zqh> G0;
    public final View H0;
    
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(final cy6 d0, final c0k e0, final d5m f0, final r7m<zqh> g0, final View h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        final int n = a.a[((Enum)d$b).ordinal()];
        if (n != 1) {
            int i = 0;
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        return;
                    }
                    this.F0.t();
                    return;
                }
                else {
                    final c0k e0 = this.E0;
                    if (e0 == null) {
                        return;
                    }
                    final kue e2 = e0.E0;
                    synchronized (e2.a) {
                        e2.d = false;
                        return;
                    }
                }
            }
            final c0k e3 = this.E0;
            if (e3 == null) {
                return;
            }
            final kue e4 = e3.E0;
            synchronized (e4.a) {
                Object c = e4.a;
                synchronized (c) {
                    final boolean d = e4.d;
                    monitorexit(c);
                    if (d) {
                        return;
                    }
                    c = e4.b;
                    e4.b = e4.c;
                    e4.c = (List<go6<fzv>>)c;
                    e4.d = true;
                    while (i < ((List)c).size()) {
                        ((List<go6<fzv>>)c).get(i).resumeWith((Object)fzv.a);
                        ++i;
                    }
                    ((List)c).clear();
                    return;
                }
            }
        }
        as2.M(this.D0, (sx6)null, 4, (ftb)new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b((r7m)this.G0, this.F0, xaf, this, this.H0, (go6)null), 1);
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[d$b.values().length];
            a2[((Enum)d$b.ON_CREATE).ordinal()] = 1;
            a2[((Enum)d$b.ON_START).ordinal()] = 2;
            a2[((Enum)d$b.ON_STOP).ordinal()] = 3;
            a2[((Enum)d$b.ON_DESTROY).ordinal()] = 4;
            a2[((Enum)d$b.ON_PAUSE).ordinal()] = 5;
            a2[((Enum)d$b.ON_RESUME).ordinal()] = 6;
            a2[((Enum)d$b.ON_ANY).ordinal()] = 7;
            a = a2;
        }
    }
}
