import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rqa extends a
{
    public final void b(final TabLayout tabLayout, View view, final View view2, float n, final Drawable drawable) {
        final float n2 = fcmpg(n, 0.5f);
        if (n2 >= 0) {
            view = view2;
        }
        final RectF a = com.google.android.material.tabs.a.a(tabLayout, view);
        if (n2 < 0) {
            n = gc0.a(1.0f, 0.0f, 0.0f, 0.5f, n);
        }
        else {
            n = gc0.a(0.0f, 1.0f, 0.5f, 1.0f, n);
        }
        drawable.setBounds((int)a.left, drawable.getBounds().top, (int)a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int)(n * 255.0f));
    }
}
