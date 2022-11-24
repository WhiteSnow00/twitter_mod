import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddx implements ihj
{
    public final gdx$a F0;
    public final gdx$b G0;
    
    public ddx(final gdx$a f0, final gdx$b g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final fqx a(final View view, final fqx fqx) {
        final gdx$a f0 = this.F0;
        final gdx$b g0 = this.G0;
        int a = g0.a;
        final int b = g0.b;
        final int c = g0.c;
        final l92 l92 = (l92)f0;
        Objects.requireNonNull(l92);
        final lsd d = fqx.d(7);
        final lsd d2 = fqx.d(32);
        l92.b.v = d.b;
        final boolean d3 = gdx.d(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        final BottomSheetBehavior b2 = l92.b;
        if (b2.n) {
            b2.u = fqx.f();
            paddingBottom = l92.b.u + c;
        }
        final BottomSheetBehavior b3 = l92.b;
        if (b3.o) {
            int n;
            if (d3) {
                n = b;
            }
            else {
                n = a;
            }
            paddingLeft = n + d.a;
        }
        if (b3.p) {
            if (!d3) {
                a = b;
            }
            paddingRight = a + d.c;
        }
        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final BottomSheetBehavior b4 = l92.b;
        final boolean r = b4.r;
        final int n2 = 1;
        boolean b5 = false;
        Label_0270: {
            if (r) {
                final int leftMargin = layoutParams.leftMargin;
                final int a2 = d.a;
                if (leftMargin != a2) {
                    layoutParams.leftMargin = a2;
                    b5 = true;
                    break Label_0270;
                }
            }
            b5 = false;
        }
        int n3 = b5 ? 1 : 0;
        if (b4.s) {
            final int rightMargin = layoutParams.rightMargin;
            final int c2 = d.c;
            n3 = (b5 ? 1 : 0);
            if (rightMargin != c2) {
                layoutParams.rightMargin = c2;
                n3 = 1;
            }
        }
        if (b4.t) {
            final int topMargin = layoutParams.topMargin;
            final int b6 = d.b;
            if (topMargin != b6) {
                layoutParams.topMargin = b6;
                n3 = n2;
            }
        }
        if (n3 != 0) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        final boolean a3 = l92.a;
        if (a3) {
            l92.b.l = d2.d;
        }
        final BottomSheetBehavior b7 = l92.b;
        if (b7.n || a3) {
            b7.O();
        }
        return fqx;
    }
}
