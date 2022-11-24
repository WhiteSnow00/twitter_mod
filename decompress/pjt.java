import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjt
{
    public static void a(final View view, final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        }
        else {
            final rjt p2 = rjt.P0;
            if (p2 != null && p2.F0 == view) {
                rjt.b(null);
            }
            if (TextUtils.isEmpty(charSequence)) {
                final rjt q0 = rjt.Q0;
                if (q0 != null && q0.F0 == view) {
                    q0.a();
                }
                view.setOnLongClickListener((View$OnLongClickListener)null);
                view.setLongClickable(false);
                view.setOnHoverListener((View$OnHoverListener)null);
            }
            else {
                new rjt(view, charSequence);
            }
        }
    }
    
    public static final class a
    {
        public static void a(final View view, final CharSequence tooltipText) {
            view.setTooltipText(tooltipText);
        }
    }
}
