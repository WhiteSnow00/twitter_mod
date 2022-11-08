import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lia extends sdx
{
    public static final DecelerateInterpolator j1;
    public static final AccelerateInterpolator k1;
    public int[] i1;
    
    static {
        j1 = new DecelerateInterpolator();
        k1 = new AccelerateInterpolator();
    }
    
    public lia(final Context context, final AttributeSet set) {
        super(context, set);
        this.i1 = new int[2];
        super.a1 = (n5r)new bb4();
    }
    
    private void R(final vzt vzt) {
        final View b = vzt.b;
        b.getLocationOnScreen(this.i1);
        final int[] i1 = this.i1;
        final int n = i1[0];
        final int n2 = i1[1];
        vzt.a.put("android:explode:screenBounds", new Rect(n, n2, b.getWidth() + n, b.getHeight() + n2));
    }
    
    @Override
    public final Animator T(final ViewGroup viewGroup, final View view, final vzt vzt, final vzt vzt2) {
        if (vzt2 == null) {
            return null;
        }
        final Rect rect = vzt2.a.get("android:explode:screenBounds");
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        this.W((View)viewGroup, rect, this.i1);
        final int[] i1 = this.i1;
        return d0u.a(view, vzt2, rect.left, rect.top, translationX + i1[0], translationY + i1[1], translationX, translationY, (TimeInterpolator)lia.j1, (xyt)this);
    }
    
    @Override
    public final Animator U(final ViewGroup viewGroup, final View view, final vzt vzt) {
        if (vzt == null) {
            return null;
        }
        final Rect rect = vzt.a.get("android:explode:screenBounds");
        final int left = rect.left;
        final int top = rect.top;
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        final int[] array = (int[])vzt.b.getTag(2131432218);
        float n;
        float n2;
        if (array != null) {
            n = array[0] - rect.left + translationX;
            n2 = array[1] - rect.top + translationY;
            rect.offsetTo(array[0], array[1]);
        }
        else {
            n = translationX;
            n2 = translationY;
        }
        this.W((View)viewGroup, rect, this.i1);
        final int[] i1 = this.i1;
        return d0u.a(view, vzt, left, top, translationX, translationY, n + i1[0], n2 + i1[1], (TimeInterpolator)lia.k1, (xyt)this);
    }
    
    public final void W(final View view, final Rect rect, final int[] array) {
        view.getLocationOnScreen(this.i1);
        final int[] i1 = this.i1;
        final int n = i1[0];
        final int n2 = i1[1];
        final Rect w = this.w();
        int centerX;
        int centerY;
        if (w == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2 + n);
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2 + n2);
        }
        else {
            centerX = w.centerX();
            centerY = w.centerY();
        }
        final int centerX2 = rect.centerX();
        final int centerY2 = rect.centerY();
        final float n3 = (float)(centerX2 - centerX);
        final float n4 = (float)(centerY2 - centerY);
        float n5 = n3;
        float n6 = n4;
        if (n3 == 0.0f) {
            n5 = n3;
            n6 = n4;
            if (n4 == 0.0f) {
                final float n7 = (float)(Math.random() * 2.0);
                final float n8 = (float)(Math.random() * 2.0);
                n5 = n7 - 1.0f;
                n6 = n8 - 1.0f;
            }
        }
        final float n9 = (float)Math.sqrt(n6 * n6 + n5 * n5);
        final float n10 = n5 / n9;
        final float n11 = n6 / n9;
        final int n12 = centerX - n;
        final int n13 = centerY - n2;
        final int max = Math.max(n12, view.getWidth() - n12);
        final int max2 = Math.max(n13, view.getHeight() - n13);
        final float n14 = (float)max;
        final float n15 = (float)max2;
        final float n16 = (float)Math.sqrt(n15 * n15 + n14 * n14);
        array[0] = Math.round(n10 * n16);
        array[1] = Math.round(n16 * n11);
    }
    
    @Override
    public final void h(final vzt vzt) {
        this.R(vzt);
        this.R(vzt);
    }
    
    @Override
    public final void k(final vzt vzt) {
        this.R(vzt);
        this.R(vzt);
    }
}
