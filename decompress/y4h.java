import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y4h
{
    public static void a(final MenuItem menuItem, final CharSequence contentDescription) {
        if (menuItem instanceof kzr) {
            ((kzr)menuItem).setContentDescription(contentDescription);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            a.h(menuItem, contentDescription);
        }
    }
    
    public static final class a
    {
        public static int a(final MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }
        
        public static CharSequence b(final MenuItem menuItem) {
            return menuItem.getContentDescription();
        }
        
        public static ColorStateList c(final MenuItem menuItem) {
            return menuItem.getIconTintList();
        }
        
        public static PorterDuff$Mode d(final MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }
        
        public static int e(final MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }
        
        public static CharSequence f(final MenuItem menuItem) {
            return menuItem.getTooltipText();
        }
        
        public static MenuItem g(final MenuItem menuItem, final char c, final int n) {
            return menuItem.setAlphabeticShortcut(c, n);
        }
        
        public static MenuItem h(final MenuItem menuItem, final CharSequence contentDescription) {
            return menuItem.setContentDescription(contentDescription);
        }
        
        public static MenuItem i(final MenuItem menuItem, final ColorStateList iconTintList) {
            return menuItem.setIconTintList(iconTintList);
        }
        
        public static MenuItem j(final MenuItem menuItem, final PorterDuff$Mode iconTintMode) {
            return menuItem.setIconTintMode(iconTintMode);
        }
        
        public static MenuItem k(final MenuItem menuItem, final char c, final int n) {
            return menuItem.setNumericShortcut(c, n);
        }
        
        public static MenuItem l(final MenuItem menuItem, final char c, final char c2, final int n, final int n2) {
            return menuItem.setShortcut(c, c2, n, n2);
        }
        
        public static MenuItem m(final MenuItem menuItem, final CharSequence tooltipText) {
            return menuItem.setTooltipText(tooltipText);
        }
    }
}
