import androidx.appcompat.view.menu.ActionMenuItemView;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jh1
{
    public static void a(final ch1 ch1, final View view) {
        if (Build$VERSION.SDK_INT >= 29 && j6x.p(view)) {
            j6x.z(view, (vf)new gh1(view.getAccessibilityDelegate(), ch1));
        }
        else {
            j6x.z(view, (vf)new hh1(ch1));
        }
    }
    
    public static void b(final ch1 foreground, final View view, final FrameLayout frameLayout) {
        final Rect bounds = new Rect();
        view.getDrawingRect(bounds);
        ((Drawable)foreground).setBounds(bounds);
        foreground.k(view, frameLayout);
        if (foreground.d() != null) {
            foreground.d().setForeground((Drawable)foreground);
        }
        else {
            view.getOverlay().add((Drawable)foreground);
        }
    }
    
    public static void c(final ch1 ch1, final View view) {
        if (ch1 == null) {
            return;
        }
        if (ch1.d() != null) {
            ch1.d().setForeground((Drawable)null);
        }
        else {
            view.getOverlay().remove((Drawable)ch1);
        }
    }
    
    public static void d(final ch1 ch1, final Toolbar toolbar) {
        if (ch1 == null) {
            return;
        }
        final ActionMenuItemView a = qit.a(toolbar, 2131427436);
        if (a != null) {
            ch1.i(0);
            ch1.j(0);
            c(ch1, (View)a);
            if (Build$VERSION.SDK_INT >= 29 && j6x.p((View)a)) {
                j6x.z((View)a, (vf)new ih1(((View)a).getAccessibilityDelegate()));
            }
            else {
                j6x.z((View)a, (vf)null);
            }
        }
        else {
            Log.w("BadgeUtils", "Trying to remove badge from a null menuItemView: 2131427436");
        }
    }
}
