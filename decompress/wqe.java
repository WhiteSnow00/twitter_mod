import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.ViewGroup;
import android.util.SparseIntArray;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import java.lang.reflect.Method;
import java.util.HashMap;
import android.graphics.RectF;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqe extends qpe
{
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    public View k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public float p;
    public float q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public RectF v;
    public RectF w;
    public HashMap<String, Method> x;
    
    public wqe() {
        this.e = null;
        this.f = -1;
        this.g = null;
        this.h = null;
        this.i = -1;
        this.j = -1;
        this.k = null;
        this.l = 0.1f;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = Float.NaN;
        this.r = false;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = new RectF();
        this.w = new RectF();
        this.x = new HashMap<String, Method>();
        super.d = new HashMap();
    }
    
    public final void a(final HashMap<String, max> hashMap) {
    }
    
    public final qpe b() {
        final wqe wqe = new wqe();
        wqe.c((qpe)this);
        wqe.e = this.e;
        wqe.f = this.f;
        wqe.g = this.g;
        wqe.h = this.h;
        wqe.i = this.i;
        wqe.j = this.j;
        wqe.k = this.k;
        wqe.l = this.l;
        wqe.m = this.m;
        wqe.n = this.n;
        wqe.o = this.o;
        wqe.p = this.p;
        wqe.q = this.q;
        wqe.r = this.r;
        wqe.v = this.v;
        wqe.w = this.w;
        wqe.x = this.x;
        return wqe;
    }
    
    public final void d(final HashSet<String> set) {
    }
    
    public final void e(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, k3j.O0);
        final SparseIntArray a = wqe.wqe$a.a;
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            switch (wqe.wqe$a.a.get(index)) {
                default: {
                    final StringBuilder g = w48.g("unused attribute 0x");
                    g.append(Integer.toHexString(index));
                    g.append("   ");
                    g.append(wqe.wqe$a.a.get(index));
                    Log.e("KeyTrigger", g.toString());
                    break;
                }
                case 14: {
                    this.t = obtainStyledAttributes.getResourceId(index, this.t);
                    break;
                }
                case 13: {
                    this.s = obtainStyledAttributes.getResourceId(index, this.s);
                    break;
                }
                case 12: {
                    this.u = obtainStyledAttributes.getResourceId(index, this.u);
                    break;
                }
                case 11: {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    break;
                }
                case 10: {
                    this.r = obtainStyledAttributes.getBoolean(index, this.r);
                    break;
                }
                case 9: {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                    break;
                }
                case 8: {
                    final int integer = obtainStyledAttributes.getInteger(index, super.a);
                    super.a = integer;
                    this.p = (integer + 0.5f) / 100.0f;
                    break;
                }
                case 7: {
                    if (zqh.f2) {
                        if ((super.b = obtainStyledAttributes.getResourceId(index, super.b)) == -1) {
                            super.c = obtainStyledAttributes.getString(index);
                            break;
                        }
                        break;
                    }
                    else {
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            super.c = obtainStyledAttributes.getString(index);
                            break;
                        }
                        super.b = obtainStyledAttributes.getResourceId(index, super.b);
                        break;
                    }
                    break;
                }
                case 6: {
                    this.i = obtainStyledAttributes.getResourceId(index, this.i);
                    break;
                }
                case 5: {
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                }
                case 4: {
                    this.e = obtainStyledAttributes.getString(index);
                    break;
                }
                case 2: {
                    this.h = obtainStyledAttributes.getString(index);
                    break;
                }
                case 1: {
                    this.g = obtainStyledAttributes.getString(index);
                    break;
                }
            }
        }
    }
    
    public final void g(final float q, final View view) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        Label_0423: {
            int n6 = 0;
            int n7 = 0;
            Label_0411: {
                if (this.j != -1) {
                    if (this.k == null) {
                        this.k = ((View)view.getParent()).findViewById(this.j);
                    }
                    this.i(this.v, this.k, this.r);
                    this.i(this.w, view, this.r);
                    if (this.v.intersect(this.w)) {
                        if (this.m) {
                            this.m = false;
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        if (this.o) {
                            this.o = false;
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        this.n = true;
                        n3 = 0;
                        break Label_0423;
                    }
                    if (!this.m) {
                        this.m = true;
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (this.n) {
                        this.n = false;
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    this.o = true;
                }
                else {
                    Label_0239: {
                        if (this.m) {
                            final float p2 = this.p;
                            if ((this.q - p2) * (q - p2) < 0.0f) {
                                this.m = false;
                                n = 1;
                                break Label_0239;
                            }
                        }
                        else if (Math.abs(q - this.p) > this.l) {
                            this.m = true;
                        }
                        n = 0;
                    }
                    Label_0316: {
                        if (this.n) {
                            final float p3 = this.p;
                            final float n4 = q - p3;
                            if ((this.q - p3) * n4 < 0.0f && n4 < 0.0f) {
                                this.n = false;
                                n3 = 1;
                                break Label_0316;
                            }
                        }
                        else if (Math.abs(q - this.p) > this.l) {
                            this.n = true;
                        }
                        n3 = 0;
                    }
                    if (this.o) {
                        final float p4 = this.p;
                        final float n5 = q - p4;
                        n6 = n;
                        n7 = n3;
                        if ((this.q - p4) * n5 >= 0.0f) {
                            break Label_0411;
                        }
                        n6 = n;
                        n7 = n3;
                        if (n5 > 0.0f) {
                            this.o = false;
                            n2 = 1;
                            break Label_0423;
                        }
                        break Label_0411;
                    }
                    else if (Math.abs(q - this.p) > this.l) {
                        this.o = true;
                    }
                }
                n7 = n3;
                n6 = n;
            }
            final int n8 = 0;
            n3 = n7;
            n2 = n8;
            n = n6;
        }
        this.q = q;
        if (n3 != 0 || n != 0 || n2 != 0) {
            final zqh zqh = (zqh)view.getParent();
            final zqh.zqh$i n9 = zqh.n1;
            if (n9 != null) {
                n9.b();
            }
            final CopyOnWriteArrayList<zqh.zqh$i> e1 = zqh.E1;
            if (e1 != null) {
                final Iterator<zqh.zqh$i> iterator = e1.iterator();
                while (iterator.hasNext()) {
                    ((zqh$i)iterator.next()).b();
                }
            }
        }
        View viewById;
        if (this.f == -1) {
            viewById = view;
        }
        else {
            viewById = ((View)view.getParent()).findViewById(this.f);
        }
        if (n3 != 0) {
            final String g = this.g;
            if (g != null) {
                this.h(g, viewById);
            }
            if (this.s != -1) {
                ((zqh)view.getParent()).S(this.s, viewById);
            }
        }
        if (n2 != 0) {
            final String h = this.h;
            if (h != null) {
                this.h(h, viewById);
            }
            if (this.t != -1) {
                ((zqh)view.getParent()).S(this.t, viewById);
            }
        }
        if (n != 0) {
            final String e2 = this.e;
            if (e2 != null) {
                this.h(e2, viewById);
            }
            if (this.u != -1) {
                ((zqh)view.getParent()).S(this.u, viewById);
            }
        }
    }
    
    public final void h(String s, final View view) {
        if (s == null) {
            return;
        }
        if (s.startsWith(".")) {
            final boolean b = s.length() == 1;
            String lowerCase = s;
            if (!b) {
                lowerCase = s.substring(1).toLowerCase(Locale.ROOT);
            }
            for (final String s2 : super.d.keySet()) {
                s = s2.toLowerCase(Locale.ROOT);
                if (b || s.matches(lowerCase)) {
                    final zi6 zi6 = super.d.get(s2);
                    if (zi6 == null) {
                        continue;
                    }
                    final Class<? extends View> class1 = view.getClass();
                    final String b2 = zi6.b;
                    if (!zi6.a) {
                        s = l7k.c("set", b2);
                    }
                    else {
                        s = b2;
                    }
                    try {
                        switch (nb0.D(zi6.c)) {
                            default: {
                                continue;
                            }
                            case 6: {
                                class1.getMethod(s, Float.TYPE).invoke(view, zi6.e);
                                continue;
                            }
                            case 5: {
                                class1.getMethod(s, Boolean.TYPE).invoke(view, zi6.g);
                                continue;
                            }
                            case 4: {
                                class1.getMethod(s, CharSequence.class).invoke(view, zi6.f);
                                continue;
                            }
                            case 3: {
                                final Method method = class1.getMethod(s, Drawable.class);
                                final ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(zi6.h);
                                method.invoke(view, colorDrawable);
                                continue;
                            }
                            case 2: {
                                class1.getMethod(s, Integer.TYPE).invoke(view, zi6.h);
                                continue;
                            }
                            case 1: {
                                class1.getMethod(s, Float.TYPE).invoke(view, zi6.e);
                                continue;
                            }
                            case 0:
                            case 7: {
                                class1.getMethod(s, Integer.TYPE).invoke(view, zi6.d);
                                continue;
                            }
                        }
                    }
                    catch (final InvocationTargetException ex) {
                        final StringBuilder z = bd.z(" Custom Attribute \"", b2, "\" not found on ");
                        z.append(class1.getName());
                        Log.e("TransitionLayout", z.toString());
                        ex.printStackTrace();
                    }
                    catch (final IllegalAccessException ex2) {
                        final StringBuilder z2 = bd.z(" Custom Attribute \"", b2, "\" not found on ");
                        z2.append(class1.getName());
                        Log.e("TransitionLayout", z2.toString());
                        ex2.printStackTrace();
                    }
                    catch (final NoSuchMethodException ex3) {
                        Log.e("TransitionLayout", ex3.getMessage());
                        final StringBuilder sb = new StringBuilder();
                        sb.append(" Custom Attribute \"");
                        sb.append(b2);
                        sb.append("\" not found on ");
                        sb.append(class1.getName());
                        Log.e("TransitionLayout", sb.toString());
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(class1.getName());
                        sb2.append(" must have a method ");
                        sb2.append(s);
                        Log.e("TransitionLayout", sb2.toString());
                    }
                }
            }
            return;
        }
        Method method2;
        if (this.x.containsKey(s)) {
            if ((method2 = this.x.get(s)) == null) {
                return;
            }
        }
        else {
            method2 = null;
        }
        Method method3;
        if ((method3 = method2) == null) {
            try {
                method3 = view.getClass().getMethod(s, (Class<?>[])new Class[0]);
                this.x.put(s, method3);
            }
            catch (final NoSuchMethodException ex4) {
                this.x.put(s, null);
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not find method \"");
                sb3.append(s);
                sb3.append("\"on class ");
                sb3.append(view.getClass().getSimpleName());
                sb3.append(" ");
                sb3.append(za8.d(view));
                Log.e("KeyTrigger", sb3.toString());
                return;
            }
        }
        try {
            method3.invoke(view, new Object[0]);
        }
        catch (final Exception ex5) {
            final StringBuilder g = w48.g("Exception in call \"");
            g.append(this.e);
            g.append("\"on class ");
            g.append(view.getClass().getSimpleName());
            g.append(" ");
            g.append(za8.d(view));
            Log.e("KeyTrigger", g.toString());
        }
    }
    
    public final void i(final RectF rectF, final View view, final boolean b) {
        rectF.top = (float)view.getTop();
        rectF.bottom = (float)view.getBottom();
        rectF.left = (float)view.getLeft();
        rectF.right = (float)view.getRight();
        if (b) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
