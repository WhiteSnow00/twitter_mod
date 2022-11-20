import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzo extends ste implements qsb<View, Boolean>
{
    public static final fzo D0;
    
    static {
        D0 = new fzo();
    }
    
    public fzo() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        final int visibility = view.getVisibility();
        final boolean b = false;
        final boolean b2 = visibility == 0;
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (oyo.Companion.a(view) == null) {
                b3 = true;
            }
        }
        return b3;
    }
}
