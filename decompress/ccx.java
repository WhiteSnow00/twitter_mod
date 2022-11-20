import java.lang.ref.WeakReference;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import java.util.HashSet;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccx
{
    public final erh a;
    public ArrayList<bcx> b;
    public HashSet<View> c;
    public String d;
    public ArrayList<bcx$a> e;
    public ArrayList<bcx$a> f;
    
    public ccx(final erh a) {
        this.b = new ArrayList<bcx>();
        this.d = "ViewTransitionController";
        this.f = new ArrayList<bcx$a>();
        this.a = a;
    }
    
    public final void a() {
        ((View)this.a).invalidate();
    }
    
    public final void b(final bcx bcx, final boolean b) {
        final dyp sharedValues = ConstraintLayout.getSharedValues();
        final int u = bcx.u;
        final Object object = new Object() {};
        HashSet set;
        if ((set = sharedValues.a.get(u)) == null) {
            set = new HashSet();
            sharedValues.a.put(u, set);
        }
        set.add(new WeakReference(object));
    }
}
