import java.lang.ref.WeakReference;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import java.util.HashSet;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbx
{
    public final zqh a;
    public ArrayList<gbx> b;
    public HashSet<View> c;
    public String d;
    public ArrayList<gbx$a> e;
    public ArrayList<gbx$a> f;
    
    public hbx(final zqh a) {
        this.b = new ArrayList<gbx>();
        this.d = "ViewTransitionController";
        this.f = new ArrayList<gbx$a>();
        this.a = a;
    }
    
    public final void a() {
        ((View)this.a).invalidate();
    }
    
    public final void b(final gbx gbx, final boolean b) {
        final mxp sharedValues = ConstraintLayout.getSharedValues();
        final int u = gbx.u;
        final Object object = new Object() {};
        HashSet set;
        if ((set = sharedValues.a.get(u)) == null) {
            set = new HashSet();
            sharedValues.a.put(u, set);
        }
        set.add(new WeakReference(object));
    }
}
