import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.content.res.ColorStateList;
import java.lang.reflect.Method;
import android.graphics.drawable.RippleDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q0w extends RippleDrawable
{
    public static final a Companion;
    public static Method H0;
    public static boolean I0;
    public final boolean D0;
    public nq4 E0;
    public Integer F0;
    public boolean G0;
    
    static {
        Companion = new a();
    }
    
    public q0w(final boolean d0) {
        final ColorStateList value = ColorStateList.valueOf(-16777216);
        Object o;
        if (d0) {
            o = new ColorDrawable(-1);
        }
        else {
            o = null;
        }
        super(value, (Drawable)null, (Drawable)o);
        this.D0 = d0;
    }
    
    public final Rect getDirtyBounds() {
        if (!this.D0) {
            this.G0 = true;
        }
        final Rect dirtyBounds = super.getDirtyBounds();
        czd.e((Object)dirtyBounds, "super.getDirtyBounds()");
        this.G0 = false;
        return dirtyBounds;
    }
    
    public final boolean isProjected() {
        return this.G0;
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        public final void a(final RippleDrawable rippleDrawable, final int radius) {
            czd.f((Object)rippleDrawable, "ripple");
            rippleDrawable.setRadius(radius);
        }
    }
}
