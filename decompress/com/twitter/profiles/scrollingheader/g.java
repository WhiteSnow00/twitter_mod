// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.scrollingheader;

import android.view.View;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.content.res.Resources;

public final class g implements f
{
    public final k4p a;
    public final f$a b;
    public final f$b c;
    public final a d;
    public final Resources e;
    
    public g(final Resources e, final f$b c, final f$a b, final k4p a, final a d) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        this.a.a();
        this.d();
    }
    
    public final void b(final Bitmap bitmap, final boolean b) {
        final k4p a = this.a;
        a.a();
        try {
            final Rect a2 = a.a;
            final int top = a2.top;
            Bitmap bitmap3;
            final Bitmap bitmap2 = bitmap3 = null;
            if (top >= 0) {
                bitmap3 = bitmap2;
                if (a2.left >= 0 && (bitmap3 = b12.f(bitmap, a2, (Matrix)null, false, true)) == bitmap) {
                    bitmap3 = b12.e(bitmap);
                }
            }
            if (bitmap3 != null) {
                a.d = new LayerDrawable(new Drawable[] { (Drawable)new BitmapDrawable(a.c, bitmap3), a.b });
            }
            if (b) {
                bitmap.recycle();
            }
            this.d();
        }
        finally {
            if (b) {
                bitmap.recycle();
            }
        }
    }
    
    public final boolean c() {
        final c c = (c)this.c;
        float n;
        if (c.H1) {
            n = 1.0f;
        }
        else {
            n = Math.abs(c.y1) / (float)(c.C1 - c.f1);
        }
        return n >= 1.0f;
    }
    
    public final void d() {
        if (this.c()) {
            int n;
            if (this.b.U() != 0) {
                n = this.b.U();
            }
            else {
                n = this.e.getColor(2131099706);
            }
            this.d.a(n, true);
        }
        else {
            this.d.a(0, false);
        }
        if (this.c()) {
            final k4p a = this.a;
            final int y4 = ((c)this.b).Y4();
            LayerDrawable d;
            if ((d = a.d) == null) {
                d = new LayerDrawable(new Drawable[] { (Drawable)new ColorDrawable(y4), a.b });
            }
            final c c = (c)this.c;
            if (((u9)c).K4() != null) {
                ((View)((u9)c).K4()).setBackgroundDrawable((Drawable)d);
            }
        }
        else {
            final k4p a2 = this.a;
            Object b;
            if (a2.d == null) {
                b = new ColorDrawable(0);
            }
            else {
                b = a2.b;
            }
            final c c2 = (c)this.c;
            if (((u9)c2).K4() != null) {
                ((View)((u9)c2).K4()).setBackgroundDrawable((Drawable)b);
            }
        }
    }
}
