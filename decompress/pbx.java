import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbx implements ogj
{
    public final /* synthetic */ sbx$a C0;
    public final /* synthetic */ sbx$b D0;
    
    public pbx(final sbx$a c0, final sbx$b d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final vox a(final View view, final vox vox) {
        final sbx$a c0 = this.C0;
        final sbx$b d0 = this.D0;
        final int a = d0.a;
        int b = d0.b;
        final int c2 = d0.c;
        final g92 g92 = (g92)c0;
        Objects.requireNonNull(g92);
        final fsd d2 = vox.d(7);
        final fsd d3 = vox.d(32);
        g92.b.v = d2.b;
        final boolean d4 = sbx.d(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        final BottomSheetBehavior b2 = g92.b;
        if (b2.n) {
            b2.u = vox.f();
            paddingBottom = g92.b.u + c2;
        }
        final BottomSheetBehavior b3 = g92.b;
        if (b3.o) {
            int n;
            if (d4) {
                n = b;
            }
            else {
                n = a;
            }
            paddingLeft = n + d2.a;
        }
        if (b3.p) {
            if (d4) {
                b = a;
            }
            paddingRight = b + d2.c;
        }
        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final BottomSheetBehavior b4 = g92.b;
        final boolean r = b4.r;
        final int n2 = 1;
        boolean b5 = false;
        Label_0268: {
            if (r) {
                final int leftMargin = layoutParams.leftMargin;
                final int a2 = d2.a;
                if (leftMargin != a2) {
                    layoutParams.leftMargin = a2;
                    b5 = true;
                    break Label_0268;
                }
            }
            b5 = false;
        }
        int n3 = b5 ? 1 : 0;
        if (b4.s) {
            final int rightMargin = layoutParams.rightMargin;
            final int c3 = d2.c;
            n3 = (b5 ? 1 : 0);
            if (rightMargin != c3) {
                layoutParams.rightMargin = c3;
                n3 = 1;
            }
        }
        if (b4.t) {
            final int topMargin = layoutParams.topMargin;
            final int b6 = d2.b;
            if (topMargin != b6) {
                layoutParams.topMargin = b6;
                n3 = n2;
            }
        }
        if (n3 != 0) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        final boolean a3 = g92.a;
        if (a3) {
            g92.b.l = d3.d;
        }
        final BottomSheetBehavior b7 = g92.b;
        if (b7.n || a3) {
            b7.O();
        }
        return vox;
    }
}
