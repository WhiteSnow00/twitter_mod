import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.HashMap;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enf implements gnf$b
{
    public final List<gcx> C0;
    
    public enf() {
        final ijf h = ijf.H();
        final xdx i = vil.i;
        final p1z p1z = new p1z();
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)p10.a().S3().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        final ncq g = ncq.g(displayMetrics.widthPixels, displayMetrics.heightPixels);
        h.p((Object)new vil((Map)new HashMap(), (Set)new HashSet(), (Set)new HashSet(), (xdx)((h4j)new xdx$a()).e(), new Rect(), p1z, g, new gz(mil.a(), g, 6)));
        final List c0 = (List)((h4j)h).e();
        this.C0 = c0;
    }
    
    public final void t(final gnf gnf, int i, int min, final int n, final boolean b) {
        final Iterator<gcx> iterator = this.C0.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        View child;
        Iterator<gcx> iterator2;
        gcx gcx;
        for (min = Math.min(min, ((ViewGroup)((k6m)gnf).b).getChildCount()), i = 0; i < min; ++i) {
            child = ((ViewGroup)((k6m)gnf).b).getChildAt(i);
            if (child != null) {
                iterator2 = this.C0.iterator();
                while (iterator2.hasNext()) {
                    gcx = iterator2.next();
                    if (gcx.a(child)) {
                        gcx.c(child);
                    }
                }
            }
        }
        final Iterator<gcx> iterator3 = this.C0.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().e();
        }
    }
}
