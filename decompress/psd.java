import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.Log;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psd implements ihj
{
    public final qsd F0;
    public final dcx G0;
    
    public psd(final qsd f0, final dcx g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final fqx a(final View view, final fqx fqx) {
        final qsd f0 = this.F0;
        final dcx g0 = this.G0;
        e0e.f((Object)f0, "this$0");
        e0e.f((Object)g0, "$initialState");
        f0.f = new fqx(fqx);
        e0e.e((Object)view, "v");
        if (Log.isLoggable("Insetter", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("applyInsetsToView. View: ");
            sb.append(view);
            sb.append(". Insets: ");
            sb.append(fqx);
            sb.append(". State: ");
            sb.append(g0);
            Log.d("Insetter", sb.toString());
        }
        final a7q c = f0.a.c(f0.e);
        final s7x a = g0.a;
        final boolean b = c.b();
        boolean b2 = false;
        if (!b) {
            final int a2 = c.a;
            int paddingLeft;
            if (a2 == 0) {
                paddingLeft = view.getPaddingLeft();
            }
            else {
                final int a3 = a.a;
                final lsd d = fqx.d(a2);
                e0e.e((Object)d, "{\n        getInsets(typeMask)\n    }");
                paddingLeft = d.a + a3;
            }
            final int b3 = c.b;
            int paddingTop;
            if (b3 == 0) {
                paddingTop = view.getPaddingTop();
            }
            else {
                final int b4 = a.b;
                final lsd d2 = fqx.d(b3);
                e0e.e((Object)d2, "{\n        getInsets(typeMask)\n    }");
                paddingTop = d2.b + b4;
            }
            final int c2 = c.c;
            int paddingRight;
            if (c2 == 0) {
                paddingRight = view.getPaddingRight();
            }
            else {
                final int c3 = a.c;
                final lsd d3 = fqx.d(c2);
                e0e.e((Object)d3, "{\n        getInsets(typeMask)\n    }");
                paddingRight = d3.c + c3;
            }
            final int d4 = c.d;
            int paddingBottom;
            if (d4 == 0) {
                paddingBottom = view.getPaddingBottom();
            }
            else {
                final int d5 = a.d;
                final lsd d6 = fqx.d(d4);
                e0e.e((Object)d6, "{\n        getInsets(typeMask)\n    }");
                paddingBottom = d6.d + d5;
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        final a7q c4 = f0.b.c(f0.e);
        final s7x b5 = g0.b;
        if (!c4.b()) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
                throw new IllegalArgumentException("Margin window insets handling requested but View's LayoutParams do not extend MarginLayoutParams".toString());
            }
            final int a4 = c4.a;
            int leftMargin;
            if (a4 == 0) {
                leftMargin = ((ViewGroup$MarginLayoutParams)layoutParams).leftMargin;
            }
            else {
                final int a5 = b5.a;
                final lsd d7 = fqx.d(a4);
                e0e.e((Object)d7, "{\n        getInsets(typeMask)\n    }");
                leftMargin = d7.a + a5;
            }
            final int b6 = c4.b;
            int topMargin;
            if (b6 == 0) {
                topMargin = ((ViewGroup$MarginLayoutParams)layoutParams).topMargin;
            }
            else {
                final int b7 = b5.b;
                final lsd d8 = fqx.d(b6);
                e0e.e((Object)d8, "{\n        getInsets(typeMask)\n    }");
                topMargin = d8.b + b7;
            }
            final int c5 = c4.c;
            int rightMargin;
            if (c5 == 0) {
                rightMargin = ((ViewGroup$MarginLayoutParams)layoutParams).rightMargin;
            }
            else {
                final int c6 = b5.c;
                final lsd d9 = fqx.d(c5);
                e0e.e((Object)d9, "{\n        getInsets(typeMask)\n    }");
                rightMargin = d9.c + c6;
            }
            final int d10 = c4.d;
            int bottomMargin;
            if (d10 == 0) {
                bottomMargin = ((ViewGroup$MarginLayoutParams)layoutParams).bottomMargin;
            }
            else {
                final int d11 = b5.d;
                final lsd d12 = fqx.d(d10);
                e0e.e((Object)d12, "{\n        getInsets(typeMask)\n    }");
                bottomMargin = d12.d + d11;
            }
            e0e.e((Object)layoutParams, "lp");
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            if (leftMargin != viewGroup$MarginLayoutParams.leftMargin || topMargin != viewGroup$MarginLayoutParams.topMargin || rightMargin != viewGroup$MarginLayoutParams.rightMargin || bottomMargin != viewGroup$MarginLayoutParams.bottomMargin) {
                viewGroup$MarginLayoutParams.setMargins(leftMargin, topMargin, rightMargin, bottomMargin);
                b2 = true;
            }
            if (b2) {
                view.setLayoutParams(layoutParams);
                if (Build$VERSION.SDK_INT < 26) {
                    view.getParent().requestLayout();
                }
            }
        }
        return fqx;
    }
}
