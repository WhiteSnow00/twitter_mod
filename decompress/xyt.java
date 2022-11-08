import android.widget.AdapterView;
import android.widget.Adapter;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import android.view.WindowId;
import java.util.Iterator;
import java.util.WeakHashMap;
import android.widget.ListView;
import android.util.SparseArray;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.view.InflateException;
import java.util.StringTokenizer;
import android.view.animation.AnimationUtils;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class xyt implements Cloneable
{
    public static final int[] d1;
    public static final xyt$a e1;
    public static ThreadLocal<at0<Animator, b>> f1;
    public String C0;
    public long D0;
    public long E0;
    public TimeInterpolator F0;
    public ArrayList<Integer> G0;
    public ArrayList<View> H0;
    public ArrayList<String> I0;
    public ArrayList<Class<?>> J0;
    public ArrayList<Integer> K0;
    public ArrayList<View> L0;
    public ArrayList<Class<?>> M0;
    public ArrayList<String> N0;
    public wzt O0;
    public wzt P0;
    public tzt Q0;
    public int[] R0;
    public ArrayList<vzt> S0;
    public ArrayList<vzt> T0;
    public ArrayList<Animator> U0;
    public int V0;
    public boolean W0;
    public boolean X0;
    public ArrayList<e> Y0;
    public ArrayList<Animator> Z0;
    public n5r a1;
    public d b1;
    public qzj c1;
    
    static {
        d1 = new int[] { 2, 1, 3, 4 };
        e1 = new xyt$a();
        xyt.f1 = new ThreadLocal<at0<Animator, b>>();
    }
    
    public xyt() {
        this.C0 = this.getClass().getName();
        this.D0 = -1L;
        this.E0 = -1L;
        this.F0 = null;
        this.G0 = new ArrayList<Integer>();
        this.H0 = new ArrayList<View>();
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new wzt();
        this.P0 = new wzt();
        this.Q0 = null;
        this.R0 = xyt.d1;
        this.U0 = new ArrayList<Animator>();
        this.V0 = 0;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = null;
        this.Z0 = new ArrayList<Animator>();
        this.c1 = (qzj)xyt.e1;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public xyt(final Context context, final AttributeSet set) {
        this.C0 = this.getClass().getName();
        this.D0 = -1L;
        this.E0 = -1L;
        this.F0 = null;
        this.G0 = new ArrayList<Integer>();
        this.H0 = new ArrayList<View>();
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new wzt();
        this.P0 = new wzt();
        this.Q0 = null;
        this.R0 = xyt.d1;
        this.U0 = new ArrayList<Animator>();
        this.V0 = 0;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = null;
        this.Z0 = new ArrayList<Animator>();
        this.c1 = (qzj)xyt.e1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, xkr.b);
        final XmlResourceParser xmlResourceParser = (XmlResourceParser)set;
        final long n = elv.h(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "duration", 1, -1);
        if (n >= 0L) {
            this.J(n);
        }
        final long n2 = elv.h(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "startDelay", 2, -1);
        if (n2 > 0L) {
            this.O(n2);
        }
        final int i = elv.i(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "interpolator", 0);
        if (i > 0) {
            this.L((TimeInterpolator)AnimationUtils.loadInterpolator(context, i));
        }
        final String j = elv.j(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "matchOrder", 3);
        if (j != null) {
            final StringTokenizer stringTokenizer = new StringTokenizer(j, ",");
            int[] array = new int[stringTokenizer.countTokens()];
            int n3 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                final String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    array[n3] = 3;
                }
                else if ("instance".equalsIgnoreCase(trim)) {
                    array[n3] = 1;
                }
                else if ("name".equalsIgnoreCase(trim)) {
                    array[n3] = 2;
                }
                else if ("itemId".equalsIgnoreCase(trim)) {
                    array[n3] = 4;
                }
                else {
                    if (!trim.isEmpty()) {
                        throw new InflateException(zi.y("Unknown match type in matchOrder: '", trim, "'"));
                    }
                    final int[] array2 = new int[array.length - 1];
                    System.arraycopy(array, 0, array2, 0, n3);
                    --n3;
                    array = array2;
                }
                ++n3;
            }
            if (array.length == 0) {
                this.R0 = xyt.d1;
            }
            else {
                int k = 0;
            Label_0451:
                while (k < array.length) {
                    final int n4 = array[k];
                    if (n4 >= 1 && n4 <= 4) {
                        final int n5 = array[k];
                        int l = 0;
                        while (true) {
                            while (l < k) {
                                if (array[l] == n5) {
                                    final boolean b = true;
                                    if (!b) {
                                        ++k;
                                        continue Label_0451;
                                    }
                                    throw new IllegalArgumentException("matches contains a duplicate value");
                                }
                                else {
                                    ++l;
                                }
                            }
                            final boolean b = false;
                            continue;
                        }
                    }
                    throw new IllegalArgumentException("matches contains invalid value");
                }
                this.R0 = array.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public static boolean D(final vzt vzt, final vzt vzt2, final String s) {
        final Object value = vzt.a.get(s);
        final Object value2 = vzt2.a.get(s);
        final boolean b = true;
        boolean b2;
        if (value == null && value2 == null) {
            b2 = false;
        }
        else {
            b2 = b;
            if (value != null) {
                if (value2 == null) {
                    b2 = b;
                }
                else {
                    b2 = (true ^ value.equals(value2));
                }
            }
        }
        return b2;
    }
    
    public static void g(final wzt wzt, View view, final vzt vzt) {
        ((l7q)wzt.C0).put((Object)view, (Object)vzt);
        final int id = view.getId();
        if (id >= 0) {
            if (((SparseArray)wzt.E0).indexOfKey(id) >= 0) {
                ((SparseArray)wzt.E0).put(id, (Object)null);
            }
            else {
                ((SparseArray)wzt.E0).put(id, (Object)view);
            }
        }
        final WeakHashMap a = p5x.a;
        final String k = p5x$i.k(view);
        if (k != null) {
            if (((l7q)wzt.D0).containsKey((Object)k)) {
                ((l7q)wzt.D0).put((Object)k, (Object)null);
            }
            else {
                ((l7q)wzt.D0).put((Object)k, (Object)view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (((Adapter)listView.getAdapter()).hasStableIds()) {
                final long itemIdAtPosition = ((AdapterView)listView).getItemIdAtPosition(((AdapterView)listView).getPositionForView(view));
                final ocg ocg = (ocg)wzt.F0;
                if (ocg.C0) {
                    ocg.f();
                }
                if (dcs.e(ocg.D0, ocg.F0, itemIdAtPosition) >= 0) {
                    view = (View)((ocg)wzt.F0).g(itemIdAtPosition, (Object)null);
                    if (view != null) {
                        p5x$d.r(view, false);
                        ((ocg)wzt.F0).j(itemIdAtPosition, (Object)null);
                    }
                }
                else {
                    p5x$d.r(view, true);
                    ((ocg)wzt.F0).j(itemIdAtPosition, (Object)view);
                }
            }
        }
    }
    
    public static at0<Animator, b> y() {
        at0 at0;
        if ((at0 = xyt.f1.get()) == null) {
            at0 = new at0();
            xyt.f1.set((at0<Animator, b>)at0);
        }
        return (at0<Animator, b>)at0;
    }
    
    public final vzt A(final View view, final boolean b) {
        final tzt q0 = this.Q0;
        if (q0 != null) {
            return ((xyt)q0).A(view, b);
        }
        wzt wzt;
        if (b) {
            wzt = this.O0;
        }
        else {
            wzt = this.P0;
        }
        return (vzt)((l7q)wzt.C0).getOrDefault((Object)view, (Object)null);
    }
    
    public boolean B(final vzt vzt, final vzt vzt2) {
        boolean b2;
        final boolean b = b2 = false;
        if (vzt != null) {
            b2 = b;
            if (vzt2 != null) {
                final String[] z = this.z();
                if (z != null) {
                    final int length = z.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (D(vzt, vzt2, z[n])) {
                            break;
                        }
                        ++n;
                    }
                }
                else {
                    final Iterator iterator = vzt.a.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!D(vzt, vzt2, (String)iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean C(final View view) {
        final int id = view.getId();
        final ArrayList<Integer> k0 = this.K0;
        if (k0 != null && k0.contains(id)) {
            return false;
        }
        final ArrayList<View> l0 = this.L0;
        if (l0 != null && l0.contains(view)) {
            return false;
        }
        final ArrayList<Class<?>> m0 = this.M0;
        if (m0 != null) {
            for (int size = m0.size(), i = 0; i < size; ++i) {
                if (this.M0.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.N0 != null) {
            final WeakHashMap a = p5x.a;
            if (p5x$i.k(view) != null && this.N0.contains(p5x$i.k(view))) {
                return false;
            }
        }
        if (this.G0.size() == 0 && this.H0.size() == 0) {
            final ArrayList<Class<?>> j0 = this.J0;
            if (j0 == null || j0.isEmpty()) {
                final ArrayList<String> i2 = this.I0;
                if (i2 == null || i2.isEmpty()) {
                    return true;
                }
            }
        }
        if (!this.G0.contains(id) && !this.H0.contains(view)) {
            final ArrayList<String> i3 = this.I0;
            if (i3 != null) {
                final WeakHashMap a2 = p5x.a;
                if (i3.contains(p5x$i.k(view))) {
                    return true;
                }
            }
            if (this.J0 != null) {
                for (int n = 0; n < this.J0.size(); ++n) {
                    if (this.J0.get(n).isInstance(view)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public void E(final View view) {
        if (!this.X0) {
            final at0<Animator, b> y = y();
            int e0 = ((l7q)y).E0;
            final xbx a = rbx.a;
            final WindowId windowId = view.getWindowId();
            --e0;
            int n;
            while (true) {
                n = 0;
                final boolean b = false;
                if (e0 < 0) {
                    break;
                }
                final b b2 = (b)((l7q)y).m(e0);
                if (b2.a != null) {
                    final qox d = b2.d;
                    int n2 = b ? 1 : 0;
                    if (d instanceof pox) {
                        n2 = (b ? 1 : 0);
                        if (((pox)d).a.equals((Object)windowId)) {
                            n2 = 1;
                        }
                    }
                    if (n2 != 0) {
                        ((Animator)((l7q)y).i(e0)).pause();
                    }
                }
                --e0;
            }
            final ArrayList<e> y2 = this.Y0;
            if (y2 != null && y2.size() > 0) {
                final ArrayList list = (ArrayList)this.Y0.clone();
                for (int size = list.size(), i = n; i < size; ++i) {
                    ((e)list.get(i)).a();
                }
            }
            this.W0 = true;
        }
    }
    
    public xyt F(final e e) {
        final ArrayList<e> y0 = this.Y0;
        if (y0 == null) {
            return this;
        }
        y0.remove(e);
        if (this.Y0.size() == 0) {
            this.Y0 = null;
        }
        return this;
    }
    
    public xyt G(final View view) {
        this.H0.remove(view);
        return this;
    }
    
    public void H(final View view) {
        if (this.W0) {
            if (!this.X0) {
                final at0<Animator, b> y = y();
                int i = ((l7q)y).E0;
                final xbx a = rbx.a;
                final WindowId windowId = view.getWindowId();
                --i;
                while (i >= 0) {
                    final b b = (b)((l7q)y).m(i);
                    if (b.a != null) {
                        final qox d = b.d;
                        if (d instanceof pox && ((pox)d).a.equals((Object)windowId)) {
                            ((Animator)((l7q)y).i(i)).resume();
                        }
                    }
                    --i;
                }
                final ArrayList<e> y2 = this.Y0;
                if (y2 != null && y2.size() > 0) {
                    final ArrayList list = (ArrayList)this.Y0.clone();
                    for (int size = list.size(), j = 0; j < size; ++j) {
                        ((e)list.get(j)).c();
                    }
                }
            }
            this.W0 = false;
        }
    }
    
    public void I() {
        this.P();
        final at0<Animator, b> y = y();
        for (final Animator animator : this.Z0) {
            if (((l7q)y).containsKey((Object)animator)) {
                this.P();
                if (animator == null) {
                    continue;
                }
                animator.addListener((Animator$AnimatorListener)new uyt(this, y));
                final long e0 = this.E0;
                if (e0 >= 0L) {
                    animator.setDuration(e0);
                }
                final long d0 = this.D0;
                if (d0 >= 0L) {
                    animator.setStartDelay(animator.getStartDelay() + d0);
                }
                final TimeInterpolator f0 = this.F0;
                if (f0 != null) {
                    animator.setInterpolator(f0);
                }
                animator.addListener((Animator$AnimatorListener)new vyt(this));
                animator.start();
            }
        }
        this.Z0.clear();
        this.q();
    }
    
    public xyt J(final long e0) {
        this.E0 = e0;
        return this;
    }
    
    public void K(final d b1) {
        this.b1 = b1;
    }
    
    public xyt L(final TimeInterpolator f0) {
        this.F0 = f0;
        return this;
    }
    
    public void M(final qzj c1) {
        if (c1 == null) {
            this.c1 = (qzj)xyt.e1;
        }
        else {
            this.c1 = c1;
        }
    }
    
    public void N(final n5r a1) {
        this.a1 = a1;
    }
    
    public xyt O(final long d0) {
        this.D0 = d0;
        return this;
    }
    
    public final void P() {
        if (this.V0 == 0) {
            final ArrayList<e> y0 = this.Y0;
            if (y0 != null && y0.size() > 0) {
                final ArrayList list = (ArrayList)this.Y0.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((e)list.get(i)).e();
                }
            }
            this.X0 = false;
        }
        ++this.V0;
    }
    
    public String Q(String s) {
        final StringBuilder g = w48.g(s);
        g.append(this.getClass().getSimpleName());
        g.append("@");
        g.append(Integer.toHexString(this.hashCode()));
        g.append(": ");
        String s2;
        s = (s2 = g.toString());
        if (this.E0 != -1L) {
            s2 = b8b.r(p88.j(s, "dur("), this.E0, ") ");
        }
        s = s2;
        if (this.D0 != -1L) {
            s = b8b.r(p88.j(s2, "dly("), this.D0, ") ");
        }
        String string = s;
        if (this.F0 != null) {
            final StringBuilder j = p88.j(s, "interp(");
            j.append(this.F0);
            j.append(") ");
            string = j.toString();
        }
        if (this.G0.size() <= 0) {
            s = string;
            if (this.H0.size() <= 0) {
                return s;
            }
        }
        String s3 = l7k.c(string, "tgts(");
        final int size = this.G0.size();
        final int n = 0;
        s = s3;
        if (size > 0) {
            int n2 = 0;
            while (true) {
                s = s3;
                if (n2 >= this.G0.size()) {
                    break;
                }
                s = s3;
                if (n2 > 0) {
                    s = l7k.c(s3, ", ");
                }
                final StringBuilder g2 = w48.g(s);
                g2.append(this.G0.get(n2));
                s3 = g2.toString();
                ++n2;
            }
        }
        String s4 = s;
        if (this.H0.size() > 0) {
            int n3 = n;
            while (true) {
                s4 = s;
                if (n3 >= this.H0.size()) {
                    break;
                }
                String c = s;
                if (n3 > 0) {
                    c = l7k.c(s, ", ");
                }
                final StringBuilder g3 = w48.g(c);
                g3.append(this.H0.get(n3));
                s = g3.toString();
                ++n3;
            }
        }
        s = l7k.c(s4, ")");
        return s;
    }
    
    public xyt a(final e e) {
        if (this.Y0 == null) {
            this.Y0 = new ArrayList<e>();
        }
        this.Y0.add(e);
        return this;
    }
    
    public xyt c(final int n) {
        if (n != 0) {
            this.G0.add(n);
        }
        return this;
    }
    
    public xyt d(final View view) {
        this.H0.add(view);
        return this;
    }
    
    public xyt e(final Class<?> clazz) {
        if (this.J0 == null) {
            this.J0 = new ArrayList<Class<?>>();
        }
        this.J0.add(clazz);
        return this;
    }
    
    public xyt f(final String s) {
        if (this.I0 == null) {
            this.I0 = new ArrayList<String>();
        }
        this.I0.add(s);
        return this;
    }
    
    public abstract void h(final vzt p0);
    
    public final void i(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        final int id = view.getId();
        final ArrayList<Integer> k0 = this.K0;
        if (k0 != null && k0.contains(id)) {
            return;
        }
        final ArrayList<View> l0 = this.L0;
        if (l0 != null && l0.contains(view)) {
            return;
        }
        final ArrayList<Class<?>> m0 = this.M0;
        final int n = 0;
        if (m0 != null) {
            for (int size = m0.size(), i = 0; i < size; ++i) {
                if (this.M0.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            final vzt vzt = new vzt(view);
            if (b) {
                this.k(vzt);
            }
            else {
                this.h(vzt);
            }
            vzt.c.add(this);
            this.j(vzt);
            if (b) {
                g(this.O0, view, vzt);
            }
            else {
                g(this.P0, view, vzt);
            }
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int j = n; j < viewGroup.getChildCount(); ++j) {
                this.i(viewGroup.getChildAt(j), b);
            }
        }
    }
    
    public void j(final vzt vzt) {
        if (this.a1 != null && !vzt.a.isEmpty()) {
            this.a1.t();
            final String[] d0 = ydx.D0;
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < 2) {
                    if (!vzt.a.containsKey(d0[i])) {
                        final int n2 = n;
                        if (n2 == 0) {
                            this.a1.j(vzt);
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final int n2 = 1;
                continue;
            }
        }
    }
    
    public abstract void k(final vzt p0);
    
    public final void l(final ViewGroup viewGroup, final boolean b) {
        this.m(b);
        if (this.G0.size() > 0 || this.H0.size() > 0) {
            final ArrayList<String> i0 = this.I0;
            if (i0 == null || i0.isEmpty()) {
                final ArrayList<Class<?>> j0 = this.J0;
                if (j0 == null || j0.isEmpty()) {
                    final int n = 0;
                    int n2 = 0;
                    int k;
                    while (true) {
                        k = n;
                        if (n2 >= this.G0.size()) {
                            break;
                        }
                        final View viewById = ((View)viewGroup).findViewById((int)this.G0.get(n2));
                        if (viewById != null) {
                            final vzt vzt = new vzt(viewById);
                            if (b) {
                                this.k(vzt);
                            }
                            else {
                                this.h(vzt);
                            }
                            vzt.c.add(this);
                            this.j(vzt);
                            if (b) {
                                g(this.O0, viewById, vzt);
                            }
                            else {
                                g(this.P0, viewById, vzt);
                            }
                        }
                        ++n2;
                    }
                    while (k < this.H0.size()) {
                        final View view = this.H0.get(k);
                        final vzt vzt2 = new vzt(view);
                        if (b) {
                            this.k(vzt2);
                        }
                        else {
                            this.h(vzt2);
                        }
                        vzt2.c.add(this);
                        this.j(vzt2);
                        if (b) {
                            g(this.O0, view, vzt2);
                        }
                        else {
                            g(this.P0, view, vzt2);
                        }
                        ++k;
                    }
                    return;
                }
            }
        }
        this.i((View)viewGroup, b);
    }
    
    public final void m(final boolean b) {
        if (b) {
            ((l7q)this.O0.C0).clear();
            ((SparseArray)this.O0.E0).clear();
            ((ocg)this.O0.F0).c();
        }
        else {
            ((l7q)this.P0.C0).clear();
            ((SparseArray)this.P0.E0).clear();
            ((ocg)this.P0.F0).c();
        }
    }
    
    public xyt n() {
        try {
            final xyt xyt = (xyt)super.clone();
            xyt.Z0 = new ArrayList<Animator>();
            xyt.O0 = new wzt();
            xyt.P0 = new wzt();
            xyt.S0 = null;
            xyt.T0 = null;
            return xyt;
        }
        catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
    
    public Animator o(final ViewGroup viewGroup, final vzt vzt, final vzt vzt2) {
        return null;
    }
    
    public void p(final ViewGroup viewGroup, final wzt wzt, final wzt wzt2, final ArrayList<vzt> list, final ArrayList<vzt> list2) {
        final at0<Animator, b> y = y();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        final int size = list.size();
        long n = Long.MAX_VALUE;
        long min;
        int n6;
        for (int i = 0; i < size; i = n6 + 1, n = min) {
            final vzt vzt = list.get(i);
            final vzt vzt2 = list2.get(i);
            vzt vzt3;
            if ((vzt3 = vzt) != null) {
                vzt3 = vzt;
                if (!vzt.c.contains(this)) {
                    vzt3 = null;
                }
            }
            vzt vzt4;
            if ((vzt4 = vzt2) != null) {
                vzt4 = vzt2;
                if (!vzt2.c.contains(this)) {
                    vzt4 = null;
                }
            }
            if ((vzt3 != null || vzt4 != null) && (vzt3 == null || vzt4 == null || this.B(vzt3, vzt4))) {
                Animator o = this.o(viewGroup, vzt3, vzt4);
                if (o != null) {
                    vzt vzt8;
                    Animator animator;
                    View view;
                    if (vzt4 != null) {
                        final View b = vzt4.b;
                        final String[] z = this.z();
                        vzt vzt7 = null;
                        Label_0413: {
                            int n5;
                            if (z != null && z.length > 0) {
                                final vzt vzt5 = new vzt(b);
                                final vzt vzt6 = (vzt)((l7q)wzt2.C0).getOrDefault((Object)b, (Object)null);
                                int n2 = i;
                                if (vzt6 != null) {
                                    int n3 = 0;
                                    while (true) {
                                        n2 = i;
                                        if (n3 >= z.length) {
                                            break;
                                        }
                                        vzt5.a.put(z[n3], vzt6.a.get(z[n3]));
                                        ++n3;
                                    }
                                }
                                i = n2;
                                final int e0 = ((l7q)y).E0;
                                int n4 = 0;
                                while (true) {
                                    vzt7 = vzt5;
                                    n5 = i;
                                    if (n4 >= e0) {
                                        break;
                                    }
                                    final b b2 = (b)((l7q)y).getOrDefault((Object)((l7q)y).i(n4), (Object)null);
                                    if (b2.c != null && b2.a == b && b2.b.equals(this.C0) && b2.c.equals((Object)vzt5)) {
                                        vzt7 = vzt5;
                                        o = null;
                                        break Label_0413;
                                    }
                                    ++n4;
                                }
                            }
                            else {
                                vzt7 = null;
                                n5 = i;
                            }
                            i = n5;
                        }
                        vzt8 = vzt7;
                        animator = o;
                        view = b;
                    }
                    else {
                        final View b3 = vzt3.b;
                        vzt8 = null;
                        animator = o;
                        view = b3;
                    }
                    min = n;
                    n6 = i;
                    if (animator != null) {
                        final n5r a1 = this.a1;
                        min = n;
                        if (a1 != null) {
                            final long u = a1.u(viewGroup, this, vzt3, vzt4);
                            sparseIntArray.put(this.Z0.size(), (int)u);
                            min = Math.min(u, n);
                        }
                        final String c0 = this.C0;
                        final xbx a2 = rbx.a;
                        ((l7q)y).put((Object)animator, (Object)new b(view, c0, this, (qox)new pox((View)viewGroup), vzt8));
                        this.Z0.add(animator);
                        n6 = i;
                    }
                    continue;
                }
            }
            min = n;
            n6 = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int j = 0; j < sparseIntArray.size(); ++j) {
                final Animator animator2 = this.Z0.get(sparseIntArray.keyAt(j));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(j) - n));
            }
        }
    }
    
    public final void q() {
        final int v0 = this.V0 - 1;
        this.V0 = v0;
        if (v0 == 0) {
            final ArrayList<e> y0 = this.Y0;
            if (y0 != null && y0.size() > 0) {
                final ArrayList list = (ArrayList)this.Y0.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((e)list.get(i)).d(this);
                }
            }
            for (int j = 0; j < ((ocg)this.O0.F0).l(); ++j) {
                final View view = (View)((ocg)this.O0.F0).m(j);
                if (view != null) {
                    final WeakHashMap a = p5x.a;
                    p5x$d.r(view, false);
                }
            }
            for (int k = 0; k < ((ocg)this.P0.F0).l(); ++k) {
                final View view2 = (View)((ocg)this.P0.F0).m(k);
                if (view2 != null) {
                    final WeakHashMap a2 = p5x.a;
                    p5x$d.r(view2, false);
                }
            }
            this.X0 = true;
        }
    }
    
    public xyt r(final int n) {
        ArrayList<Integer> k0 = this.K0;
        if (n > 0) {
            k0 = c.a(k0, n);
        }
        this.K0 = k0;
        return this;
    }
    
    public xyt s(final View view) {
        ArrayList<View> l0 = this.L0;
        if (view != null) {
            l0 = c.a(l0, view);
        }
        this.L0 = l0;
        return this;
    }
    
    public xyt t(final Class<?> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        xyt.M0:Ljava/util/ArrayList;
        //     5: aload_1        
        //     6: invokestatic    xyt$c.a:(Ljava/util/ArrayList;Ljava/lang/Object;)Ljava/util/ArrayList;
        //     9: putfield        xyt.M0:Ljava/util/ArrayList;
        //    12: aload_0        
        //    13: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Z)Lxyt;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final String toString() {
        return this.Q("");
    }
    
    public xyt u(final String s) {
        this.N0 = c.a(this.N0, s);
        return this;
    }
    
    public void v(final ViewGroup viewGroup) {
        final at0<Animator, b> y = y();
        int i = ((l7q)y).E0;
        if (viewGroup != null) {
            if (i != 0) {
                final xbx a = rbx.a;
                final WindowId windowId = ((View)viewGroup).getWindowId();
                final at0 at0 = new at0((l7q)y);
                ((l7q)y).clear();
                --i;
                while (i >= 0) {
                    final b b = (b)((l7q)at0).m(i);
                    if (b.a != null) {
                        final qox d = b.d;
                        if (d instanceof pox && ((pox)d).a.equals((Object)windowId)) {
                            ((Animator)((l7q)at0).i(i)).end();
                        }
                    }
                    --i;
                }
            }
        }
    }
    
    public final Rect w() {
        final d b1 = this.b1;
        if (b1 == null) {
            return null;
        }
        return b1.a();
    }
    
    public final vzt x(final View view, final boolean b) {
        final tzt q0 = this.Q0;
        if (q0 != null) {
            return ((xyt)q0).x(view, b);
        }
        ArrayList<vzt> list;
        if (b) {
            list = this.S0;
        }
        else {
            list = this.T0;
        }
        final vzt vzt = null;
        if (list == null) {
            return null;
        }
        final int size = list.size();
        final int n = -1;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            final vzt vzt2 = list.get(n2);
            if (vzt2 == null) {
                return null;
            }
            if (vzt2.b == view) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        vzt vzt3 = vzt;
        if (n3 >= 0) {
            ArrayList<vzt> list2;
            if (b) {
                list2 = this.T0;
            }
            else {
                list2 = this.S0;
            }
            vzt3 = list2.get(n3);
        }
        return vzt3;
    }
    
    public String[] z() {
        return null;
    }
    
    public static final class b
    {
        public View a;
        public String b;
        public vzt c;
        public qox d;
        public xyt e;
        
        public b(final View a, final String b, final xyt e, final qox d, final vzt c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    public static final class c
    {
        public static <T> ArrayList<T> a(final ArrayList<T> list, final T t) {
            ArrayList<T> list2 = list;
            if (list == null) {
                list2 = new ArrayList<T>();
            }
            if (!list2.contains(t)) {
                list2.add(t);
            }
            return list2;
        }
    }
    
    public abstract static class d
    {
        public abstract Rect a();
    }
    
    public interface e
    {
        void a();
        
        void b();
        
        void c();
        
        void d(final xyt p0);
        
        void e();
    }
}
