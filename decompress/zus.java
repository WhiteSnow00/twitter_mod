import android.view.ViewGroup;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.tweetview.core.ui.connector.Anchor;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Rect;
import android.content.res.Resources;
import java.util.WeakHashMap;
import android.view.View;
import android.graphics.Paint$Style;
import java.util.HashMap;
import java.util.HashSet;
import androidx.fragment.app.Fragment;
import android.graphics.RectF;
import android.graphics.Paint;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zus extends j4e$a
{
    public final Set<String> a;
    public final Map<String, aw6> b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public RectF q;
    
    public zus(final p4e<vxs> p4e, final Fragment fragment) {
        final View k1 = fragment.K1();
        final WeakHashMap a = b7x.a;
        this.p = (b7x$e.d(k1) != 0);
        this.a = new HashSet();
        this.b = new HashMap();
        final Resources u0 = fragment.U0();
        final float n = (float)b1b.F(fragment.J1(), 2130970924, 2131166032);
        this.n = (float)u0.getDisplayMetrics().widthPixels;
        final float n2 = (float)u0.getDimensionPixelSize(2131167695);
        this.e = n2;
        this.f = (float)u0.getDimensionPixelSize(2131167693);
        this.g = (float)u0.getDimensionPixelSize(2131167694);
        final float e = b1b.E(fragment.J1(), 2130971041, 2131167684);
        this.l = e;
        final int n3 = (int)(e / 2.0f + n - n2 / 2.0f);
        this.d = n3;
        this.c = n3;
        this.m = (float)u0.getDimensionPixelSize(2131166419);
        this.o = (float)u0.getDimensionPixelSize(2131165529);
        this.h = (float)u0.getDimensionPixelSize(2131167607);
        final Paint i = new Paint();
        (this.i = i).setColor(b1b.B(fragment.J1(), 2130969102));
        (this.j = new Paint()).setColor(b1b.B(fragment.J1(), 2130969036));
        final Paint j = new Paint();
        (this.k = j).setAntiAlias(true);
        j.setStyle(Paint$Style.STROKE);
        j.setStrokeWidth(n2);
        j.setColor(i.getColor());
        this.q = new RectF();
        this.p(p4e);
    }
    
    public final void k(final Rect rect, final View view, final RecyclerView recyclerView, final n8x n8x) {
        final vxs a = bw6.a(n8x);
        if (a != null) {
            final String d = a.d();
            final boolean b = a instanceof isv;
            this.o(a);
            if (this.a.contains(d)) {
                float n;
                float l = n = (float)this.c;
                if (b) {
                    final pmh h = a.h;
                    float o;
                    if (h != null && h.c) {
                        o = this.o + this.m;
                    }
                    else {
                        o = this.o;
                        l = this.l;
                    }
                    n = l + o;
                }
                final boolean p4 = this.p;
                final int n2 = 0;
                int left;
                if (p4) {
                    left = 0;
                }
                else {
                    left = (int)n;
                }
                rect.left = left;
                int right = n2;
                if (p4) {
                    right = (int)n;
                }
                rect.right = right;
            }
        }
    }
    
    public final void m(final Canvas canvas, final View view, final RecyclerView recyclerView, final n8x n8x) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        final vxs a = bw6.a(n8x);
        if (a != null) {
            final String d = a.d();
            this.o(a);
            if (this.b.containsKey(d)) {
                final aw6 aw6 = this.b.get(d);
                Objects.requireNonNull(aw6);
                if (n8x instanceof p8t) {
                    aw6.i = (k10)n8x;
                }
                final aw6 aw7 = this.b.get(aw6.g);
                final int n = -1;
                int a2;
                if (aw7 != null) {
                    a2 = aw7.a;
                }
                else {
                    a2 = -1;
                }
                final RecyclerView$m layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager);
                final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
                final int l = ((RecyclerView$m)linearLayoutManager).L();
                final int r1 = linearLayoutManager.r1();
                final boolean b = a2 >= r1 && a2 <= l + r1;
                if (aw6.e) {
                    float n2 = 0.0f;
                    float n4 = 0.0f;
                    float n7 = 0.0f;
                    int n10 = 0;
                    Label_0423: {
                        float n3;
                        float n5;
                        if (aw6.d) {
                            n2 = this.m / 2.0f;
                            if (this.p) {
                                n3 = this.n - this.c - this.o - n2;
                            }
                            else {
                                n3 = this.c + this.o + n2;
                            }
                            n4 = view.getTop() + this.h + n2;
                            if (this.p) {
                                n5 = this.n - this.c - this.o;
                            }
                            else {
                                n5 = this.o + this.c;
                            }
                        }
                        else {
                            final float n6 = this.l / 2.0f;
                            if (this.p) {
                                n7 = this.n - this.o - n6;
                            }
                            else {
                                n7 = this.o + n6;
                            }
                            final float n8 = (float)view.getTop();
                            final float o = this.o;
                            final float n9 = n8 + n6 + o;
                            n3 = n7;
                            n4 = n9;
                            n5 = o;
                            n2 = n6;
                            if (this.p) {
                                n10 = (int)(this.n - o);
                                n4 = n9;
                                n2 = n6;
                                break Label_0423;
                            }
                        }
                        n10 = (int)n5;
                        n7 = n3;
                    }
                    canvas.drawCircle(n7, n4, n2, this.i);
                    final RectF rectF = new RectF();
                    this.q = rectF;
                    rectF.left = (float)n10;
                    rectF.top = (float)(int)(n4 - n2);
                    rectF.bottom = (float)(int)(n4 + n2);
                    aw6.j = rectF;
                    if (aw7 != null) {
                        if (aw6.c) {
                            this.q(canvas, view, aw6, aw7, b);
                        }
                        else {
                            this.s(canvas, view, aw6, aw7, b);
                        }
                    }
                    this.n(canvas, view, aw6, aw7);
                }
                else {
                    final k10 i = aw6.i;
                    Objects.requireNonNull(i);
                    final RectF q = new RectF();
                    this.q = q;
                    final Anchor i2 = i.I0;
                    int left;
                    if (i2 != null && ((View)i2).isAttachedToWindow()) {
                        final Rect l2 = i.L0;
                        l2.left = 0;
                        ((ViewGroup)recyclerView).offsetDescendantRectToMyCoords((View)i.I0, l2);
                        left = i.L0.left;
                    }
                    else {
                        left = -1;
                    }
                    q.left = (float)left;
                    final Anchor j0 = i.J0;
                    int bottom;
                    if (j0 != null && ((View)j0).isAttachedToWindow()) {
                        final Rect l3 = i.L0;
                        l3.bottom = 0;
                        ((ViewGroup)recyclerView).offsetDescendantRectToMyCoords((View)i.J0, l3);
                        bottom = i.L0.bottom;
                    }
                    else {
                        bottom = -1;
                    }
                    q.top = (float)bottom;
                    final Anchor k0 = i.K0;
                    int top = n;
                    if (k0 != null) {
                        if (!((View)k0).isAttachedToWindow()) {
                            top = n;
                        }
                        else {
                            final Rect l4 = i.L0;
                            l4.top = 0;
                            ((ViewGroup)recyclerView).offsetDescendantRectToMyCoords((View)i.K0, l4);
                            top = i.L0.top;
                        }
                    }
                    q.bottom = (float)top;
                    aw6.j = this.q;
                    if (aw7 != null) {
                        if (aw6.c) {
                            this.q(canvas, view, aw6, aw7, b);
                        }
                        else {
                            this.s(canvas, view, aw6, aw7, b);
                        }
                    }
                    this.n(canvas, view, aw6, aw7);
                }
            }
        }
    }
    
    public final void n(final Canvas canvas, final View view, final aw6 aw6, aw6 aw7) {
        if (aw7 != null && aw6.d) {
            while (aw7 != null && aw7.d) {
                aw7 = this.b.get(aw7.g);
            }
            if (aw7 != null) {
                for (final String s : aw7.k) {
                    if (this.b.containsKey(s) && ((aw6)this.b.get(s)).a > aw6.a) {
                        this.t(canvas, view, null);
                        break;
                    }
                }
            }
        }
        if (aw6.k.size() >= 1 && this.b.get(aw6.k.get(0)) != null) {
            this.t(canvas, view, aw6);
        }
        if (aw6.b) {
            final float n = (float)view.getBottom();
            if (pk7.k()) {
                final float e = pk7.e(view.getResources());
                final float n2 = pk7.f(view.getResources()) + e;
                canvas.drawRect(0.0f, n - n2, this.n, n, this.j);
                canvas.drawRect(0.0f, n - (n2 + e) / 2.0f, this.n, n - (n2 - e) / 2.0f, this.i);
            }
            else {
                canvas.drawRect(0.0f, n - 2.0f, this.n, n, this.i);
            }
        }
    }
    
    public final void o(final vxs vxs) {
        final aw6 aw6 = this.b.get(vxs.d());
        final boolean e = vxs instanceof isv;
        if (aw6 != null) {
            aw6.e = e;
            if (this.a.contains(vxs.d()) && !e && !aw6.d) {
                this.a.remove(vxs.d());
            }
            else if (!this.a.contains(vxs.d()) && e) {
                this.a.add(vxs.d());
            }
        }
    }
    
    public final void p(final p4e<vxs> p4e) {
        if (!(p4e instanceof fld)) {
            return;
        }
        final fld fld = (fld)p4e;
        final int size = p4e.getSize();
        final evs l0 = fld.L0;
        Map<K, ? extends E> c;
        if (l0 == null) {
            c = null;
        }
        else {
            c = l0.M0.c;
        }
        for (final int intValue : new ArrayList(c.values())) {
            final aw6 b = bw6.b(fld.r(intValue));
            if (b != null && b.g == null) {
                b.a = intValue;
                if (++intValue >= size) {
                    continue;
                }
                this.b.put(b.h, b);
                if (b.e) {
                    this.a.add(b.h);
                }
                aw6 b2 = bw6.b(fld.r(intValue));
                aw6 aw6 = null;
                while (b2 != null) {
                    final String g = b2.g;
                    if (g == null || this.b.get(g) == null) {
                        break;
                    }
                    final aw6 aw7 = this.b.get(b2.g);
                    Objects.requireNonNull(aw7);
                    aw7.k.add(b2.h);
                    if (b2.c && aw6 != null && aw6.c) {
                        aw6.f = true;
                    }
                    b2.a = intValue;
                    this.b.put(b2.h, b2);
                    if (b2.d || b2.e) {
                        this.a.add(b2.h);
                    }
                    if (intValue >= ((zzt)fld).getSize()) {
                        break;
                    }
                    if (b2.b) {
                        break;
                    }
                    ++intValue;
                    final aw6 b3 = bw6.b(fld.r(intValue));
                    aw6 = b2;
                    b2 = b3;
                }
                sbw.b((tlm)new fg4(dda.g("home", "timeline", "", "convo_unit", "impression")));
            }
        }
    }
    
    public final void q(final Canvas canvas, final View view, final aw6 aw6, final aw6 aw7, final boolean b) {
        final RectF j = aw7.j;
        final RectF i = aw6.j;
        Objects.requireNonNull(i);
        final float n = this.e / 2.0f;
        final boolean b2 = b && j != null;
        float n2;
        if (!b2) {
            n2 = (float)view.getTop();
        }
        else {
            n2 = j.bottom + this.f;
        }
        float n3;
        if (aw7.d) {
            n3 = this.m;
        }
        else {
            n3 = this.l;
        }
        float n4 = n3;
        if (b2) {
            n4 = n3;
            if (!fbx.G()) {
                n4 = j.bottom - j.top;
            }
        }
        float n5;
        if (b2) {
            n5 = n2;
        }
        else {
            n5 = view.getTop() - this.g;
        }
        final float bottom = i.bottom;
        final float top = i.top;
        final boolean p5 = this.p;
        float n6;
        if (p5) {
            if (b2) {
                n6 = j.left - n4 / 2.0f - n;
            }
            else {
                n6 = this.n - this.d - this.e;
            }
        }
        else if (b2) {
            n6 = n4 / 2.0f + j.left - n;
        }
        else {
            n6 = (float)this.d;
        }
        final float n7 = n6 + this.e;
        final float n8 = n6 + n;
        final float n9 = (bottom - top) / 2.0f + top;
        float n11;
        float n12;
        if (p5) {
            final float left = i.left;
            final float n10 = left - n8 + left + this.f;
            n11 = n9 - (n8 - n10);
            this.q = new RectF(n10, n11, n8, n9);
            n12 = 0.0f;
        }
        else {
            final float left2 = i.left;
            final float n13 = left2 - n8 + left2 - this.f;
            n11 = n9 - (n13 - n8);
            this.q = new RectF(n8, n11, n13, n9);
            n12 = 90.0f;
        }
        final float n14 = (n9 - n11) / 2.0f;
        if (b && aw6.f) {
            this.r(canvas, n6, n11, n7, view.getBottom() + this.g);
        }
        this.r(canvas, n6, n5, n7, n14 + n11 + n);
        canvas.drawArc(this.q, n12, 90.0f, false, this.k);
    }
    
    public final void r(final Canvas canvas, final float n, final float n2, final float n3, final float n4) {
        final float g = this.g;
        canvas.drawRoundRect(n, n2, n3, n4, g, g, this.i);
    }
    
    public final void s(final Canvas canvas, final View view, final aw6 aw6, final aw6 aw7, final boolean b) {
        final RectF j = aw7.j;
        final RectF i = aw6.j;
        Objects.requireNonNull(i);
        float n;
        if (aw6.d) {
            n = this.m;
        }
        else {
            n = this.l;
        }
        if (!fbx.G()) {
            n = i.bottom - i.top;
        }
        float n2;
        if (this.p) {
            n2 = i.left - n / 2.0f - this.e / 2.0f;
        }
        else {
            n2 = n / 2.0f + i.left - this.e / 2.0f;
        }
        final float e = this.e;
        final float top = i.top;
        final float f = this.f;
        float n3;
        if (b && j != null) {
            n3 = j.bottom + f;
        }
        else {
            n3 = view.getTop() - this.g;
        }
        this.r(canvas, n2, n3, n2 + e, top - f);
    }
    
    public final void t(final Canvas canvas, final View view, final aw6 aw6) {
        if (aw6 == null) {
            final boolean p3 = this.p;
            float n;
            if (p3) {
                n = this.n - this.d;
            }
            else {
                n = (float)this.d;
            }
            float n2;
            if (p3) {
                n2 = this.n - this.d - this.e;
            }
            else {
                n2 = this.d + this.e;
            }
            this.r(canvas, n, (float)view.getTop(), n2, (float)view.getBottom());
        }
        else {
            final RectF j = aw6.j;
            Objects.requireNonNull(j);
            final float bottom = j.bottom;
            final float n3 = bottom - j.top;
            float n4;
            if (this.p) {
                n4 = j.left - n3 / 2.0f - this.e / 2.0f;
            }
            else {
                n4 = n3 / 2.0f + j.left - this.e / 2.0f;
            }
            this.r(canvas, n4, bottom + this.f, n4 + this.e, view.getBottom() + this.g);
        }
    }
}
