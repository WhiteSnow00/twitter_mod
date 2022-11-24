import androidx.drawerlayout.widget.DrawerLayout;
import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pi9 implements View$OnApplyWindowInsetsListener
{
    public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets b1) {
        final DrawerLayout drawerLayout = (DrawerLayout)view;
        final int systemWindowInsetTop = b1.getSystemWindowInsetTop();
        final boolean b2 = true;
        final boolean c1 = systemWindowInsetTop > 0;
        drawerLayout.b1 = b1;
        drawerLayout.c1 = c1;
        ((View)drawerLayout).setWillNotDraw(!c1 && ((View)drawerLayout).getBackground() == null && b2);
        drawerLayout.requestLayout();
        return b1.consumeSystemWindowInsets();
    }
}
