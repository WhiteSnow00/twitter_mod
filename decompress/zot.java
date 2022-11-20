import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zot extends hub implements qsb<View, gnt>
{
    public static final zot D0;
    
    static {
        D0 = new zot();
    }
    
    public zot() {
        super(1, (Class)gnt.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return new gnt(view);
    }
}
