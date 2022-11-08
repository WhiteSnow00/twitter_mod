import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w3l
{
    public static final void a(final View view) {
        if (Build$VERSION.SDK_INT >= 28) {
            view.setAccessibilityHeading(true);
        }
        else {
            p5x.A(view, true);
        }
    }
}
