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

public abstract class nzt implements Cloneable
{
    public static final int[] e1;
    public static final nzt$a f1;
    public static ThreadLocal<ts0<Animator, b>> g1;
    public String D0;
    public long E0;
    public long F0;
    public TimeInterpolator G0;
    public ArrayList<Integer> H0;
    public ArrayList<View> I0;
    public ArrayList<String> J0;
    public ArrayList<Class<?>> K0;
    public ArrayList<Integer> L0;
    public ArrayList<View> M0;
    public ArrayList<Class<?>> N0;
    public ArrayList<String> O0;
    public m0u P0;
    public m0u Q0;
    public j0u R0;
    public int[] S0;
    public ArrayList<l0u> T0;
    public ArrayList<l0u> U0;
    public ArrayList<Animator> V0;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public ArrayList<e> Z0;
    public ArrayList<Animator> a1;
    public h6r b1;
    public d c1;
    public uzj d1;
    
    static {
        e1 = new int[] { 2, 1, 3, 4 };
        f1 = new nzt$a();
        nzt.g1 = new ThreadLocal<ts0<Animator, b>>();
    }
    
    public nzt() {
        this.D0 = this.getClass().getName();
        this.E0 = -1L;
        this.F0 = -1L;
        this.G0 = null;
        this.H0 = new ArrayList<Integer>();
        this.I0 = new ArrayList<View>();
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.P0 = new m0u();
        this.Q0 = new m0u();
        this.R0 = null;
        this.S0 = nzt.e1;
        this.V0 = new ArrayList<Animator>();
        this.W0 = 0;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = null;
        this.a1 = new ArrayList<Animator>();
        this.d1 = (uzj)nzt.f1;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public nzt(final Context context, final AttributeSet set) {
        this.D0 = this.getClass().getName();
        this.E0 = -1L;
        this.F0 = -1L;
        this.G0 = null;
        this.H0 = new ArrayList<Integer>();
        this.I0 = new ArrayList<View>();
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.P0 = new m0u();
        this.Q0 = new m0u();
        this.R0 = null;
        this.S0 = nzt.e1;
        this.V0 = new ArrayList<Animator>();
        this.W0 = 0;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = null;
        this.a1 = new ArrayList<Animator>();
        this.d1 = (uzj)nzt.f1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, qlr.b);
        final XmlResourceParser xmlResourceParser = (XmlResourceParser)set;
        final long n = cmv.h(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "duration", 1, -1);
        if (n >= 0L) {
            this.J(n);
        }
        final long n2 = cmv.h(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "startDelay", 2, -1);
        if (n2 > 0L) {
            this.O(n2);
        }
        final int i = cmv.i(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "interpolator", 0);
        if (i > 0) {
            this.L((TimeInterpolator)AnimationUtils.loadInterpolator(context, i));
        }
        final String j = cmv.j(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "matchOrder", 3);
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
                        throw new InflateException(da8.j("Unknown match type in matchOrder: '", trim, "'"));
                    }
                    final int[] array2 = new int[array.length - 1];
                    System.arraycopy(array, 0, array2, 0, n3);
                    --n3;
                    array = array2;
                }
                ++n3;
            }
            if (array.length == 0) {
                this.S0 = nzt.e1;
            }
            else {
                int k = 0;
            Label_0446:
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
                                        continue Label_0446;
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
                this.S0 = array.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public static boolean D(final l0u l0u, final l0u l0u2, final String s) {
        final Object value = l0u.a.get(s);
        final Object value2 = l0u2.a.get(s);
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
    
    public static void g(final m0u m0u, View view, final l0u l0u) {
        ((d8q<View, l0u>)m0u.D0).put(view, l0u);
        final int id = view.getId();
        if (id >= 0) {
            if (((SparseArray)m0u.F0).indexOfKey(id) >= 0) {
                ((SparseArray)m0u.F0).put(id, (Object)null);
            }
            else {
                ((SparseArray)m0u.F0).put(id, (Object)view);
            }
        }
        final WeakHashMap a = j6x.a;
        final String k = j6x$i.k(view);
        if (k != null) {
            if (((d8q)m0u.E0).containsKey(k)) {
                ((d8q<String, Object>)m0u.E0).put(k, null);
            }
            else {
                ((d8q<String, View>)m0u.E0).put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (((Adapter)listView.getAdapter()).hasStableIds()) {
                final long itemIdAtPosition = ((AdapterView)listView).getItemIdAtPosition(((AdapterView)listView).getPositionForView(view));
                final ecg ecg = (ecg)m0u.G0;
                if (ecg.D0) {
                    ecg.f();
                }
                if (eli.g(ecg.E0, ecg.G0, itemIdAtPosition) >= 0) {
                    view = (View)((ecg)m0u.G0).g(itemIdAtPosition, (Object)null);
                    if (view != null) {
                        j6x$d.r(view, false);
                        ((ecg)m0u.G0).j(itemIdAtPosition, (Object)null);
                    }
                }
                else {
                    j6x$d.r(view, true);
                    ((ecg)m0u.G0).j(itemIdAtPosition, (Object)view);
                }
            }
        }
    }
    
    public static ts0<Animator, b> y() {
        ts0 ts0;
        if ((ts0 = nzt.g1.get()) == null) {
            ts0 = new ts0();
            nzt.g1.set((ts0<Animator, b>)ts0);
        }
        return (ts0<Animator, b>)ts0;
    }
    
    public final l0u A(final View view, final boolean b) {
        final j0u r0 = this.R0;
        if (r0 != null) {
            return ((nzt)r0).A(view, b);
        }
        m0u m0u;
        if (b) {
            m0u = this.P0;
        }
        else {
            m0u = this.Q0;
        }
        return ((d8q<K, l0u>)m0u.D0).getOrDefault(view, null);
    }
    
    public boolean B(final l0u l0u, final l0u l0u2) {
        boolean b2;
        final boolean b = b2 = false;
        if (l0u != null) {
            b2 = b;
            if (l0u2 != null) {
                final String[] z = this.z();
                if (z != null) {
                    final int length = z.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (D(l0u, l0u2, z[n])) {
                            break;
                        }
                        ++n;
                    }
                }
                else {
                    final Iterator iterator = l0u.a.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!D(l0u, l0u2, (String)iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean C(final View view) {
        final int id = view.getId();
        final ArrayList<Integer> l0 = this.L0;
        if (l0 != null && l0.contains(id)) {
            return false;
        }
        final ArrayList<View> m0 = this.M0;
        if (m0 != null && m0.contains(view)) {
            return false;
        }
        final ArrayList<Class<?>> n0 = this.N0;
        if (n0 != null) {
            for (int size = n0.size(), i = 0; i < size; ++i) {
                if (this.N0.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.O0 != null) {
            final WeakHashMap a = j6x.a;
            if (j6x$i.k(view) != null && this.O0.contains(j6x$i.k(view))) {
                return false;
            }
        }
        if (this.H0.size() == 0 && this.I0.size() == 0) {
            final ArrayList<Class<?>> k0 = this.K0;
            if (k0 == null || k0.isEmpty()) {
                final ArrayList<String> j0 = this.J0;
                if (j0 == null || j0.isEmpty()) {
                    return true;
                }
            }
        }
        if (!this.H0.contains(id) && !this.I0.contains(view)) {
            final ArrayList<String> j2 = this.J0;
            if (j2 != null) {
                final WeakHashMap a2 = j6x.a;
                if (j2.contains(j6x$i.k(view))) {
                    return true;
                }
            }
            if (this.K0 != null) {
                for (int n2 = 0; n2 < this.K0.size(); ++n2) {
                    if (this.K0.get(n2).isInstance(view)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public void E(final View view) {
        if (!this.Y0) {
            final ts0<Animator, b> y = y();
            int f0 = ((d8q)y).F0;
            final tcx a = ncx.a;
            final WindowId windowId = view.getWindowId();
            --f0;
            int n;
            while (true) {
                n = 0;
                final boolean b = false;
                if (f0 < 0) {
                    break;
                }
                final b b2 = ((d8q<Animator, b>)y).m(f0);
                if (b2.a != null) {
                    final jpx d = b2.d;
                    int n2 = b ? 1 : 0;
                    if (d instanceof ipx) {
                        n2 = (b ? 1 : 0);
                        if (((ipx)d).a.equals((Object)windowId)) {
                            n2 = 1;
                        }
                    }
                    if (n2 != 0) {
                        ((d8q<Animator, b>)y).i(f0).pause();
                    }
                }
                --f0;
            }
            final ArrayList<e> z0 = this.Z0;
            if (z0 != null && z0.size() > 0) {
                final ArrayList list = (ArrayList)this.Z0.clone();
                for (int size = list.size(), i = n; i < size; ++i) {
                    ((e)list.get(i)).a();
                }
            }
            this.X0 = true;
        }
    }
    
    public nzt F(final e e) {
        final ArrayList<e> z0 = this.Z0;
        if (z0 == null) {
            return this;
        }
        z0.remove(e);
        if (this.Z0.size() == 0) {
            this.Z0 = null;
        }
        return this;
    }
    
    public nzt G(final View view) {
        this.I0.remove(view);
        return this;
    }
    
    public void H(final View view) {
        if (this.X0) {
            if (!this.Y0) {
                final ts0<Animator, b> y = y();
                int i = ((d8q)y).F0;
                final tcx a = ncx.a;
                final WindowId windowId = view.getWindowId();
                --i;
                while (i >= 0) {
                    final b b = ((d8q<Animator, b>)y).m(i);
                    if (b.a != null) {
                        final jpx d = b.d;
                        if (d instanceof ipx && ((ipx)d).a.equals((Object)windowId)) {
                            ((d8q<Animator, b>)y).i(i).resume();
                        }
                    }
                    --i;
                }
                final ArrayList<e> z0 = this.Z0;
                if (z0 != null && z0.size() > 0) {
                    final ArrayList list = (ArrayList)this.Z0.clone();
                    for (int size = list.size(), j = 0; j < size; ++j) {
                        ((e)list.get(j)).c();
                    }
                }
            }
            this.X0 = false;
        }
    }
    
    public void I() {
        this.P();
        final ts0<Animator, b> y = y();
        for (final Animator animator : this.a1) {
            if (((d8q)y).containsKey(animator)) {
                this.P();
                if (animator == null) {
                    continue;
                }
                animator.addListener((Animator$AnimatorListener)new kzt(this, y));
                final long f0 = this.F0;
                if (f0 >= 0L) {
                    animator.setDuration(f0);
                }
                final long e0 = this.E0;
                if (e0 >= 0L) {
                    animator.setStartDelay(animator.getStartDelay() + e0);
                }
                final TimeInterpolator g0 = this.G0;
                if (g0 != null) {
                    animator.setInterpolator(g0);
                }
                animator.addListener((Animator$AnimatorListener)new lzt(this));
                animator.start();
            }
        }
        this.a1.clear();
        this.q();
    }
    
    public nzt J(final long f0) {
        this.F0 = f0;
        return this;
    }
    
    public void K(final d c1) {
        this.c1 = c1;
    }
    
    public nzt L(final TimeInterpolator g0) {
        this.G0 = g0;
        return this;
    }
    
    public void M(final uzj d1) {
        if (d1 == null) {
            this.d1 = (uzj)nzt.f1;
        }
        else {
            this.d1 = d1;
        }
    }
    
    public void N(final h6r b1) {
        this.b1 = b1;
    }
    
    public nzt O(final long e0) {
        this.E0 = e0;
        return this;
    }
    
    public final void P() {
        if (this.W0 == 0) {
            final ArrayList<e> z0 = this.Z0;
            if (z0 != null && z0.size() > 0) {
                final ArrayList list = (ArrayList)this.Z0.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((e)list.get(i)).e();
                }
            }
            this.Y0 = false;
        }
        ++this.W0;
    }
    
    public String Q(String s) {
        final StringBuilder j = fu8.j(s);
        j.append(this.getClass().getSimpleName());
        j.append("@");
        j.append(Integer.toHexString(this.hashCode()));
        j.append(": ");
        final String s2 = s = j.toString();
        if (this.F0 != -1L) {
            s = hmg.i(kgi.b(s2, "dur("), this.F0, ") ");
        }
        String i = s;
        if (this.E0 != -1L) {
            i = hmg.i(kgi.b(s, "dly("), this.E0, ") ");
        }
        s = i;
        if (this.G0 != null) {
            final StringBuilder b = kgi.b(i, "interp(");
            b.append(this.G0);
            b.append(") ");
            s = b.toString();
        }
        if (this.H0.size() <= 0) {
            final String h = s;
            if (this.I0.size() <= 0) {
                return h;
            }
        }
        String s3 = hmg.h(s, "tgts(");
        final int size = this.H0.size();
        final int n = 0;
        s = s3;
        if (size > 0) {
            int n2 = 0;
            while (true) {
                s = s3;
                if (n2 >= this.H0.size()) {
                    break;
                }
                s = s3;
                if (n2 > 0) {
                    s = hmg.h(s3, ", ");
                }
                final StringBuilder k = fu8.j(s);
                k.append(this.H0.get(n2));
                s3 = k.toString();
                ++n2;
            }
        }
        String s4 = s;
        if (this.I0.size() > 0) {
            int n3 = n;
            while (true) {
                s4 = s;
                if (n3 >= this.I0.size()) {
                    break;
                }
                String h2 = s;
                if (n3 > 0) {
                    h2 = hmg.h(s, ", ");
                }
                final StringBuilder l = fu8.j(h2);
                l.append(this.I0.get(n3));
                s = l.toString();
                ++n3;
            }
        }
        return hmg.h(s4, ")");
    }
    
    public nzt a(final e e) {
        if (this.Z0 == null) {
            this.Z0 = new ArrayList<e>();
        }
        this.Z0.add(e);
        return this;
    }
    
    public nzt c(final int n) {
        if (n != 0) {
            this.H0.add(n);
        }
        return this;
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.n();
    }
    
    public nzt d(final View view) {
        this.I0.add(view);
        return this;
    }
    
    public nzt e(final Class<?> clazz) {
        if (this.K0 == null) {
            this.K0 = new ArrayList<Class<?>>();
        }
        this.K0.add(clazz);
        return this;
    }
    
    public nzt f(final String s) {
        if (this.J0 == null) {
            this.J0 = new ArrayList<String>();
        }
        this.J0.add(s);
        return this;
    }
    
    public abstract void h(final l0u p0);
    
    public final void i(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        final int id = view.getId();
        final ArrayList<Integer> l0 = this.L0;
        if (l0 != null && l0.contains(id)) {
            return;
        }
        final ArrayList<View> m0 = this.M0;
        if (m0 != null && m0.contains(view)) {
            return;
        }
        final ArrayList<Class<?>> n0 = this.N0;
        final int n2 = 0;
        if (n0 != null) {
            for (int size = n0.size(), i = 0; i < size; ++i) {
                if (this.N0.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            final l0u l0u = new l0u(view);
            if (b) {
                this.k(l0u);
            }
            else {
                this.h(l0u);
            }
            l0u.c.add(this);
            this.j(l0u);
            if (b) {
                g(this.P0, view, l0u);
            }
            else {
                g(this.Q0, view, l0u);
            }
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int j = n2; j < viewGroup.getChildCount(); ++j) {
                this.i(viewGroup.getChildAt(j), b);
            }
        }
    }
    
    public void j(final l0u l0u) {
        if (this.b1 != null && !l0u.a.isEmpty()) {
            this.b1.r();
            final String[] e0 = sex.E0;
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < 2) {
                    if (!l0u.a.containsKey(e0[i])) {
                        final int n2 = n;
                        if (n2 == 0) {
                            this.b1.j(l0u);
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
    
    public abstract void k(final l0u p0);
    
    public final void l(final ViewGroup viewGroup, final boolean b) {
        this.m(b);
        if (this.H0.size() > 0 || this.I0.size() > 0) {
            final ArrayList<String> j0 = this.J0;
            if (j0 == null || j0.isEmpty()) {
                final ArrayList<Class<?>> k0 = this.K0;
                if (k0 == null || k0.isEmpty()) {
                    final int n = 0;
                    int n2 = 0;
                    int i;
                    while (true) {
                        i = n;
                        if (n2 >= this.H0.size()) {
                            break;
                        }
                        final View viewById = ((View)viewGroup).findViewById((int)this.H0.get(n2));
                        if (viewById != null) {
                            final l0u l0u = new l0u(viewById);
                            if (b) {
                                this.k(l0u);
                            }
                            else {
                                this.h(l0u);
                            }
                            l0u.c.add(this);
                            this.j(l0u);
                            if (b) {
                                g(this.P0, viewById, l0u);
                            }
                            else {
                                g(this.Q0, viewById, l0u);
                            }
                        }
                        ++n2;
                    }
                    while (i < this.I0.size()) {
                        final View view = this.I0.get(i);
                        final l0u l0u2 = new l0u(view);
                        if (b) {
                            this.k(l0u2);
                        }
                        else {
                            this.h(l0u2);
                        }
                        l0u2.c.add(this);
                        this.j(l0u2);
                        if (b) {
                            g(this.P0, view, l0u2);
                        }
                        else {
                            g(this.Q0, view, l0u2);
                        }
                        ++i;
                    }
                    return;
                }
            }
        }
        this.i((View)viewGroup, b);
    }
    
    public final void m(final boolean b) {
        if (b) {
            ((d8q)this.P0.D0).clear();
            ((SparseArray)this.P0.F0).clear();
            ((ecg)this.P0.G0).c();
        }
        else {
            ((d8q)this.Q0.D0).clear();
            ((SparseArray)this.Q0.F0).clear();
            ((ecg)this.Q0.G0).c();
        }
    }
    
    public nzt n() {
        try {
            final nzt nzt = (nzt)super.clone();
            nzt.a1 = new ArrayList<Animator>();
            nzt.P0 = new m0u();
            nzt.Q0 = new m0u();
            nzt.T0 = null;
            nzt.U0 = null;
            return nzt;
        }
        catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
    
    public Animator o(final ViewGroup viewGroup, final l0u l0u, final l0u l0u2) {
        return null;
    }
    
    public void p(final ViewGroup viewGroup, final m0u m0u, final m0u m0u2, final ArrayList<l0u> list, final ArrayList<l0u> list2) {
        final ts0<Animator, b> y = y();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        final int size = list.size();
        long n = Long.MAX_VALUE;
        long min;
        int n6;
        for (int i = 0; i < size; i = n6 + 1, n = min) {
            final l0u l0u = list.get(i);
            final l0u l0u2 = list2.get(i);
            l0u l0u3;
            if ((l0u3 = l0u) != null) {
                l0u3 = l0u;
                if (!l0u.c.contains(this)) {
                    l0u3 = null;
                }
            }
            l0u l0u4;
            if ((l0u4 = l0u2) != null) {
                l0u4 = l0u2;
                if (!l0u2.c.contains(this)) {
                    l0u4 = null;
                }
            }
            if ((l0u3 != null || l0u4 != null) && (l0u3 == null || l0u4 == null || this.B(l0u3, l0u4))) {
                Animator o = this.o(viewGroup, l0u3, l0u4);
                if (o != null) {
                    l0u l0u8;
                    Animator animator2;
                    View b3;
                    if (l0u4 != null) {
                        final View b = l0u4.b;
                        final String[] z = this.z();
                        l0u l0u7 = null;
                        Label_0413: {
                            int n5;
                            if (z != null && z.length > 0) {
                                final l0u l0u5 = new l0u(b);
                                final l0u l0u6 = ((d8q<K, l0u>)m0u2.D0).getOrDefault(b, null);
                                int n2 = i;
                                if (l0u6 != null) {
                                    int n3 = 0;
                                    while (true) {
                                        n2 = i;
                                        if (n3 >= z.length) {
                                            break;
                                        }
                                        l0u5.a.put(z[n3], l0u6.a.get(z[n3]));
                                        ++n3;
                                    }
                                }
                                i = n2;
                                final int f0 = ((d8q)y).F0;
                                int n4 = 0;
                                while (true) {
                                    l0u7 = l0u5;
                                    n5 = i;
                                    if (n4 >= f0) {
                                        break;
                                    }
                                    final b b2 = ((d8q<Animator, b>)y).getOrDefault(((d8q<Animator, b>)y).i(n4), null);
                                    if (b2.c != null && b2.a == b && b2.b.equals(this.D0) && b2.c.equals((Object)l0u5)) {
                                        l0u7 = l0u5;
                                        o = null;
                                        break Label_0413;
                                    }
                                    ++n4;
                                }
                            }
                            else {
                                l0u7 = null;
                                n5 = i;
                            }
                            i = n5;
                        }
                        final Animator animator = o;
                        l0u8 = l0u7;
                        animator2 = animator;
                        b3 = b;
                    }
                    else {
                        b3 = l0u3.b;
                        final l0u l0u9 = null;
                        animator2 = o;
                        l0u8 = l0u9;
                    }
                    min = n;
                    n6 = i;
                    if (animator2 != null) {
                        final h6r b4 = this.b1;
                        min = n;
                        if (b4 != null) {
                            final long s = b4.s(viewGroup, this, l0u3, l0u4);
                            sparseIntArray.put(this.a1.size(), (int)s);
                            min = Math.min(s, n);
                        }
                        final String d0 = this.D0;
                        final tcx a = ncx.a;
                        ((d8q<Animator, b>)y).put(animator2, new b(b3, d0, this, (jpx)new ipx((View)viewGroup), l0u8));
                        this.a1.add(animator2);
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
                final Animator animator3 = this.a1.get(sparseIntArray.keyAt(j));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(j) - n));
            }
        }
    }
    
    public final void q() {
        final int w0 = this.W0 - 1;
        this.W0 = w0;
        if (w0 == 0) {
            final ArrayList<e> z0 = this.Z0;
            if (z0 != null && z0.size() > 0) {
                final ArrayList list = (ArrayList)this.Z0.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((e)list.get(i)).d(this);
                }
            }
            for (int j = 0; j < ((ecg)this.P0.G0).l(); ++j) {
                final View view = (View)((ecg)this.P0.G0).m(j);
                if (view != null) {
                    final WeakHashMap a = j6x.a;
                    j6x$d.r(view, false);
                }
            }
            for (int k = 0; k < ((ecg)this.Q0.G0).l(); ++k) {
                final View view2 = (View)((ecg)this.Q0.G0).m(k);
                if (view2 != null) {
                    final WeakHashMap a2 = j6x.a;
                    j6x$d.r(view2, false);
                }
            }
            this.Y0 = true;
        }
    }
    
    public nzt r(final int n) {
        ArrayList<Integer> l0 = this.L0;
        if (n > 0) {
            l0 = c.a(l0, n);
        }
        this.L0 = l0;
        return this;
    }
    
    public nzt s(final View view) {
        ArrayList<View> m0 = this.M0;
        if (view != null) {
            m0 = c.a(m0, view);
        }
        this.M0 = m0;
        return this;
    }
    
    public nzt t(final Class<?> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        nzt.N0:Ljava/util/ArrayList;
        //     5: aload_1        
        //     6: invokestatic    nzt$c.a:(Ljava/util/ArrayList;Ljava/lang/Object;)Ljava/util/ArrayList;
        //     9: putfield        nzt.N0:Ljava/util/ArrayList;
        //    12: aload_0        
        //    13: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Z)Lnzt;
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
    
    public nzt u(final String s) {
        this.O0 = c.a(this.O0, s);
        return this;
    }
    
    public void v(final ViewGroup viewGroup) {
        final ts0<Animator, b> y = y();
        int i = ((d8q)y).F0;
        if (viewGroup != null) {
            if (i != 0) {
                final tcx a = ncx.a;
                final WindowId windowId = ((View)viewGroup).getWindowId();
                final ts0 ts0 = new ts0((d8q)y);
                ((d8q)y).clear();
                --i;
                while (i >= 0) {
                    final b b = (b)((d8q)ts0).m(i);
                    if (b.a != null) {
                        final jpx d = b.d;
                        if (d instanceof ipx && ((ipx)d).a.equals((Object)windowId)) {
                            ((Animator)((d8q)ts0).i(i)).end();
                        }
                    }
                    --i;
                }
            }
        }
    }
    
    public final Rect w() {
        final d c1 = this.c1;
        if (c1 == null) {
            return null;
        }
        return c1.a();
    }
    
    public final l0u x(final View view, final boolean b) {
        final j0u r0 = this.R0;
        if (r0 != null) {
            return ((nzt)r0).x(view, b);
        }
        ArrayList<l0u> list;
        if (b) {
            list = this.T0;
        }
        else {
            list = this.U0;
        }
        final l0u l0u = null;
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
            final l0u l0u2 = list.get(n2);
            if (l0u2 == null) {
                return null;
            }
            if (l0u2.b == view) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        l0u l0u3 = l0u;
        if (n3 >= 0) {
            ArrayList<l0u> list2;
            if (b) {
                list2 = this.U0;
            }
            else {
                list2 = this.T0;
            }
            l0u3 = list2.get(n3);
        }
        return l0u3;
    }
    
    public String[] z() {
        return null;
    }
    
    public static final class b
    {
        public View a;
        public String b;
        public l0u c;
        public jpx d;
        public nzt e;
        
        public b(final View a, final String b, final nzt e, final jpx d, final l0u c) {
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
        
        void d(final nzt p0);
        
        void e();
    }
}
