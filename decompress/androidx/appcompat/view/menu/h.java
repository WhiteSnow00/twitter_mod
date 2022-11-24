// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import java.util.WeakHashMap;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View;
import android.content.Context;

public class h
{
    public final Context a;
    public final e b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public i.a i;
    public x5h j;
    public PopupWindow$OnDismissListener k;
    public final h$a l;
    
    public h(final Context a, final e b, final View f, final boolean c, final int d, final int e) {
        this.g = 8388611;
        this.l = new PopupWindow$OnDismissListener(this) {
            public final h F0;
            
            public final void onDismiss() {
                this.F0.c();
            }
        };
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final x5h a() {
        if (this.j == null) {
            final Display defaultDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
            final Point point = new Point();
            androidx.appcompat.view.menu.h.b.a(defaultDisplay, point);
            Object j;
            if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(2131165206)) {
                j = new androidx.appcompat.view.menu.b(this.a, this.f, this.d, this.e, this.c);
            }
            else {
                j = new k(this.a, this.b, this.f, this.d, this.e, this.c);
            }
            ((x5h)j).i(this.b);
            ((x5h)j).p((PopupWindow$OnDismissListener)this.l);
            ((x5h)j).k(this.f);
            ((i)j).b(this.i);
            ((x5h)j).m(this.h);
            ((x5h)j).n(this.g);
            this.j = (x5h)j;
        }
        return this.j;
    }
    
    public final boolean b() {
        final x5h j = this.j;
        return j != null && ((k6q)j).isShowing();
    }
    
    public void c() {
        this.j = null;
        final PopupWindow$OnDismissListener k = this.k;
        if (k != null) {
            k.onDismiss();
        }
    }
    
    public final void d(final i.a i) {
        this.i = i;
        final x5h j = this.j;
        if (j != null) {
            j.b(i);
        }
    }
    
    public final void e() {
        final boolean b = this.b();
        boolean b2 = false;
        Label_0034: {
            if (!b) {
                if (this.f == null) {
                    break Label_0034;
                }
                this.f(0, 0, false, false);
            }
            b2 = true;
        }
        if (b2) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    public final void f(int n, final int n2, final boolean b, final boolean b2) {
        final x5h a = this.a();
        a.q(b2);
        if (b) {
            final int g = this.g;
            final View f = this.f;
            final WeakHashMap a2 = b7x.a;
            int n3 = n;
            if ((Gravity.getAbsoluteGravity(g, b7x$e.d(f)) & 0x7) == 0x5) {
                n3 = n - this.f.getWidth();
            }
            a.o(n3);
            a.r(n2);
            n = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            a.F0 = new Rect(n3 - n, n2 - n, n3 + n, n2 + n);
        }
        ((k6q)a).show();
    }
    
    public static final class b
    {
        public static void a(final Display display, final Point point) {
            display.getRealSize(point);
        }
    }
}
