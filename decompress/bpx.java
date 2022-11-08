import android.view.DisplayCutout;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.view.View$OnApplyWindowInsetsListener;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpx
{
    public final rv1<s5m> a;
    public final rv1<s5m> b;
    
    public bpx(final Activity activity) {
        this.a = (rv1<s5m>)new rv1();
        this.b = (rv1<s5m>)new rv1();
        activity.findViewById(16908290).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new apx(this));
    }
    
    public static WindowInsets a(final bpx bpx, final WindowInsets windowInsets) {
        bpx.a.onNext((Object)new s5m(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()));
        if (Build$VERSION.SDK_INT >= 28 && windowInsets.getDisplayCutout() != null) {
            final DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            bpx.b.onNext((Object)new s5m(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()));
        }
        return windowInsets;
    }
}
