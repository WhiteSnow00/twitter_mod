// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import java.util.WeakHashMap;
import com.google.android.material.snackbar.e;
import android.view.View;

public final class a implements bh
{
    public final /* synthetic */ SwipeDismissBehavior C0;
    
    public a(final SwipeDismissBehavior c0) {
        this.C0 = c0;
    }
    
    public final boolean p(final View view) {
        final boolean t = this.C0.t(view);
        final boolean b = false;
        if (t) {
            final WeakHashMap a = p5x.a;
            final boolean b2 = p5x$e.d(view) == 1;
            final int d = this.C0.d;
            int n = 0;
            Label_0076: {
                if (d != 0 || !b2) {
                    n = (b ? 1 : 0);
                    if (d != 1) {
                        break Label_0076;
                    }
                    n = (b ? 1 : 0);
                    if (b2) {
                        break Label_0076;
                    }
                }
                n = 1;
            }
            int width = view.getWidth();
            if (n != 0) {
                width = -width;
            }
            p5x.r(view, width);
            view.setAlpha(0.0f);
            final SwipeDismissBehavior.SwipeDismissBehavior$b b3 = this.C0.b;
            if (b3 != null) {
                ((e)b3).a(view);
            }
            return true;
        }
        return false;
    }
}
