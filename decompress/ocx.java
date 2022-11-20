import android.graphics.PorterDuff$Mode;
import java.util.WeakHashMap;
import android.view.ViewGroup;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocx
{
    public static float a(final Context context, final int n) {
        return TypedValue.applyDimension(1, (float)n, context.getResources().getDisplayMetrics());
    }
    
    public static ViewGroup b(final View view) {
        if (view == null) {
            return null;
        }
        final View rootView = view.getRootView();
        final ViewGroup viewGroup = (ViewGroup)rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView != view && rootView instanceof ViewGroup) {
            return (ViewGroup)rootView;
        }
        return null;
    }
    
    public static iax c(final View view) {
        final ViewGroup b = b(view);
        Object o;
        if (b == null) {
            o = null;
        }
        else {
            o = new yng((View)b);
        }
        return (iax)o;
    }
    
    public static boolean d(final View view) {
        final WeakHashMap a = j6x.a;
        final int d = j6x$e.d(view);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        return b;
    }
    
    public static PorterDuff$Mode e(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    public interface a
    {
    }
    
    public static final class b
    {
        public int a;
        public int b;
        public int c;
        
        public b(final int a, final int n, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
