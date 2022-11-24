import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import java.util.Iterator;
import androidx.constraintlayout.widget.b$a$a;
import java.util.Map;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.AnticipateInterpolator;
import java.util.Collection;
import java.util.ArrayList;
import android.view.View;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import androidx.constraintlayout.widget.b$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tcx
{
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public lqe f;
    public b$a g;
    public int h;
    public int i;
    public int j;
    public String k;
    public int l;
    public String m;
    public int n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    
    public tcx(final Context o, final XmlPullParser xmlPullParser) {
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.h = -1;
        this.i = -1;
        this.l = 0;
        this.m = null;
        this.n = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.o = o;
        try {
            for (int i = xmlPullParser.getEventType(); i != 1; i = xmlPullParser.next()) {
                if (i != 2) {
                    if (i == 3) {
                        if ("ViewTransition".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                else {
                    final String name = xmlPullParser.getName();
                    int n = 0;
                    Label_0264: {
                        switch (name.hashCode()) {
                            case 1791837707: {
                                if (name.equals("CustomAttribute")) {
                                    n = 3;
                                    break Label_0264;
                                }
                                break;
                            }
                            case 366511058: {
                                if (name.equals("CustomMethod")) {
                                    n = 4;
                                    break Label_0264;
                                }
                                break;
                            }
                            case 61998586: {
                                if (name.equals("ViewTransition")) {
                                    n = 0;
                                    break Label_0264;
                                }
                                break;
                            }
                            case -1239391468: {
                                if (name.equals("KeyFrameSet")) {
                                    n = 1;
                                    break Label_0264;
                                }
                                break;
                            }
                            case -1962203927: {
                                if (name.equals("ConstraintOverride")) {
                                    n = 2;
                                    break Label_0264;
                                }
                                break;
                            }
                        }
                        n = -1;
                    }
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                if (n != 3 && n != 4) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(ob8.a());
                                    sb.append(" unknown tag ");
                                    sb.append(name);
                                    Log.e("ViewTransition", sb.toString());
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(".xml:");
                                    sb2.append(xmlPullParser.getLineNumber());
                                    Log.e("ViewTransition", sb2.toString());
                                }
                                else {
                                    lj6.d(o, xmlPullParser, this.g.g);
                                }
                            }
                            else {
                                this.g = androidx.constraintlayout.widget.b.d(o, xmlPullParser);
                            }
                        }
                        else {
                            this.f = new lqe(o, xmlPullParser);
                        }
                    }
                    else {
                        this.d(o, xmlPullParser);
                    }
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public final void a(final ucx ucx, final trh trh, int i, final b b, final View... array) {
        if (this.c) {
            return;
        }
        final int e = this.e;
        if (e == 2) {
            final View view = array[0];
            final mrh mrh = new mrh(view);
            final urh f = mrh.f;
            f.H0 = 0.0f;
            f.I0 = 0.0f;
            mrh.H = true;
            f.g(view.getX(), view.getY(), (float)view.getWidth(), (float)view.getHeight());
            mrh.g.g(view.getX(), view.getY(), (float)view.getWidth(), (float)view.getHeight());
            mrh.h.i(view);
            mrh.i.i(view);
            final ArrayList list = this.f.a.get(-1);
            if (list != null) {
                mrh.w.addAll(list);
            }
            mrh.f(((View)trh).getWidth(), ((View)trh).getHeight(), System.nanoTime());
            final int h = this.h;
            final int j = this.i;
            i = this.b;
            final Context context = ((View)trh).getContext();
            final int l = this.l;
            Object loadInterpolator;
            if (l != -2) {
                if (l != -1) {
                    if (l != 0) {
                        if (l != 1) {
                            if (l != 2) {
                                if (l != 4) {
                                    if (l != 5) {
                                        if (l != 6) {
                                            loadInterpolator = null;
                                        }
                                        else {
                                            loadInterpolator = new AnticipateInterpolator();
                                        }
                                    }
                                    else {
                                        loadInterpolator = new OvershootInterpolator();
                                    }
                                }
                                else {
                                    loadInterpolator = new BounceInterpolator();
                                }
                            }
                            else {
                                loadInterpolator = new DecelerateInterpolator();
                            }
                        }
                        else {
                            loadInterpolator = new AccelerateInterpolator();
                        }
                    }
                    else {
                        loadInterpolator = new AccelerateDecelerateInterpolator();
                    }
                }
                else {
                    loadInterpolator = new scx(mq9.c(this.m));
                }
            }
            else {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            }
            new a(ucx, mrh, h, j, i, (Interpolator)loadInterpolator, this.p, this.q);
            return;
        }
        if (e == 1) {
            final int[] constraintSetIds = trh.getConstraintSetIds();
            for (int k = 0; k < constraintSetIds.length; ++k) {
                final int n = constraintSetIds[k];
                if (n != i) {
                    final b g = trh.G(n);
                    for (int length = array.length, n2 = 0; n2 < length; ++n2) {
                        final b$a n3 = g.n(array[n2].getId());
                        final b$a g2 = this.g;
                        if (g2 != null) {
                            final b$a$a h2 = g2.h;
                            if (h2 != null) {
                                h2.e(n3);
                            }
                            n3.g.putAll(this.g.g);
                        }
                    }
                }
            }
        }
        final b b2 = new b();
        b2.h(b);
        for (int length2 = array.length, n4 = 0; n4 < length2; ++n4) {
            final b$a n5 = b2.n(array[n4].getId());
            final b$a g3 = this.g;
            if (g3 != null) {
                final b$a$a h3 = g3.h;
                if (h3 != null) {
                    h3.e(n5);
                }
                n5.g.putAll(this.g.g);
            }
        }
        trh.R(i, b2);
        trh.R(2131432601, b);
        trh.M(2131432601);
        final xrh$b transition = new xrh$b(trh.X0, i);
        int length3;
        View view2;
        int h4;
        int m;
        String m2;
        int n6;
        int id;
        lqe f2;
        ArrayList list2;
        lqe lqe;
        Iterator iterator;
        zpe b3;
        for (length3 = array.length, i = 0; i < length3; ++i) {
            view2 = array[i];
            h4 = this.h;
            if (h4 != -1) {
                transition.h = Math.max(h4, 8);
            }
            transition.p = this.d;
            m = this.l;
            m2 = this.m;
            n6 = this.n;
            transition.e = m;
            transition.f = m2;
            transition.g = n6;
            id = view2.getId();
            f2 = this.f;
            if (f2 != null) {
                list2 = f2.a.get(-1);
                lqe = new lqe();
                iterator = list2.iterator();
                while (iterator.hasNext()) {
                    b3 = ((zpe)iterator.next()).b();
                    b3.b = id;
                    lqe.b(b3);
                }
                transition.k.add(lqe);
            }
        }
        trh.setTransition(transition);
        final rcx y1 = new rcx((Object)this, (Object)array, 0);
        trh.A(1.0f);
        trh.Y1 = (Runnable)y1;
    }
    
    public final boolean b(final View view) {
        final int r = this.r;
        final boolean b = false;
        final boolean b2 = r == -1 || view.getTag(r) != null;
        final int s = this.s;
        final boolean b3 = s == -1 || view.getTag(s) == null;
        boolean b4 = b;
        if (b2) {
            b4 = b;
            if (b3) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public final boolean c(final View view) {
        if (view == null) {
            return false;
        }
        if (this.j == -1 && this.k == null) {
            return false;
        }
        if (!this.b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k == null) {
            return false;
        }
        if (view.getLayoutParams() instanceof ConstraintLayout$a) {
            final String y = ((ConstraintLayout$a)view.getLayoutParams()).Y;
            if (y != null && y.matches(this.k)) {
                return true;
            }
        }
        return false;
    }
    
    public final void d(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dnl.f1);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            }
            else if (index == 8) {
                if (trh.i2) {
                    if ((this.j = obtainStyledAttributes.getResourceId(index, this.j)) == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                }
                else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                }
                else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            }
            else if (index == 9) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            }
            else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            }
            else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            }
            else if (index == 4) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            }
            else if (index == 13) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            }
            else if (index == 14) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            }
            else if (index == 7) {
                final int type = obtainStyledAttributes.peekValue(index).type;
                if (type == 1) {
                    if ((this.n = obtainStyledAttributes.getResourceId(index, -1)) != -1) {
                        this.l = -2;
                    }
                }
                else if (type == 3) {
                    final String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                    else {
                        this.l = -1;
                    }
                }
                else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            }
            else if (index == 11) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            }
            else if (index == 3) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            }
            else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            }
            else if (index == 5) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            }
            else if (index == 2) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            }
            else if (index == 1) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("ViewTransition(");
        f.append(ob8.c(this.o, this.a));
        f.append(")");
        return f.toString();
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public mrh c;
        public int d;
        public bqe e;
        public ucx f;
        public Interpolator g;
        public boolean h;
        public float i;
        public float j;
        public long k;
        public Rect l;
        public boolean m;
        
        public a(ucx f, final mrh c, final int n, final int d, final int n2, final Interpolator g, final int a, final int b) {
            this.e = new bqe(0, null);
            this.h = false;
            this.l = new Rect();
            this.m = false;
            this.f = f;
            this.c = c;
            this.d = d;
            this.k = System.nanoTime();
            f = this.f;
            if (f.e == null) {
                f.e = new ArrayList();
            }
            f.e.add(this);
            this.g = g;
            this.a = a;
            this.b = b;
            if (n2 == 3) {
                this.m = true;
            }
            float j;
            if (n == 0) {
                j = Float.MAX_VALUE;
            }
            else {
                j = 1.0f / n;
            }
            this.j = j;
            this.a();
        }
        
        public final void a() {
            if (this.h) {
                final long nanoTime = System.nanoTime();
                final long k = this.k;
                this.k = nanoTime;
                final float i = this.i - (float)((nanoTime - k) * 1.0E-6) * this.j;
                this.i = i;
                if (i < 0.0f) {
                    this.i = 0.0f;
                }
                final Interpolator g = this.g;
                float n;
                if (g == null) {
                    n = this.i;
                }
                else {
                    n = ((TimeInterpolator)g).getInterpolation(this.i);
                }
                final mrh c = this.c;
                final boolean c2 = c.c(c.b, n, nanoTime, this.e);
                if (this.i <= 0.0f) {
                    final int a = this.a;
                    if (a != -1) {
                        this.c.b.setTag(a, (Object)System.nanoTime());
                    }
                    final int b = this.b;
                    if (b != -1) {
                        this.c.b.setTag(b, (Object)null);
                    }
                    this.f.f.add(this);
                }
                if (this.i > 0.0f || c2) {
                    this.f.a();
                }
            }
            else {
                final long nanoTime2 = System.nanoTime();
                final long j = this.k;
                this.k = nanoTime2;
                final float l = (float)((nanoTime2 - j) * 1.0E-6) * this.j + this.i;
                this.i = l;
                if (l >= 1.0f) {
                    this.i = 1.0f;
                }
                final Interpolator g2 = this.g;
                float n2;
                if (g2 == null) {
                    n2 = this.i;
                }
                else {
                    n2 = ((TimeInterpolator)g2).getInterpolation(this.i);
                }
                final mrh c3 = this.c;
                final boolean c4 = c3.c(c3.b, n2, nanoTime2, this.e);
                if (this.i >= 1.0f) {
                    final int a2 = this.a;
                    if (a2 != -1) {
                        this.c.b.setTag(a2, (Object)System.nanoTime());
                    }
                    final int b2 = this.b;
                    if (b2 != -1) {
                        this.c.b.setTag(b2, (Object)null);
                    }
                    if (!this.m) {
                        this.f.f.add(this);
                    }
                }
                if (this.i < 1.0f || c4) {
                    this.f.a();
                }
            }
        }
        
        public final void b() {
            this.h = true;
            final int d = this.d;
            if (d != -1) {
                float j;
                if (d == 0) {
                    j = Float.MAX_VALUE;
                }
                else {
                    j = 1.0f / d;
                }
                this.j = j;
            }
            this.f.a();
            this.k = System.nanoTime();
        }
    }
}
