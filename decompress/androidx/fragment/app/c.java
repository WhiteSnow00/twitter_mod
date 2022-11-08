// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.transition.Transition;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import android.animation.Animator;
import android.content.Context;
import java.util.WeakHashMap;
import java.util.Iterator;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.animation.Animator$AnimatorListener;
import java.util.Map;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.Objects;
import java.util.Collection;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup;

public final class c extends v
{
    public c(final ViewGroup viewGroup) {
        super(viewGroup);
    }
    
    @Override
    public final void b(final List<v.b> list, final boolean b) {
        final ArrayList list2 = (ArrayList)list;
        final Iterator iterator = list2.iterator();
        v.b b2 = null;
        v.b b3 = null;
        while (iterator.hasNext()) {
            final v.b b4 = (v.b)iterator.next();
            final int c = mag.c(b4.c.j1);
            final int d = nb0.D(b4.a);
            if (d != 0) {
                if (d != 1) {
                    if (d != 2 && d != 3) {
                        continue;
                    }
                }
                else {
                    if (c != 2) {
                        b3 = b4;
                        continue;
                    }
                    continue;
                }
            }
            if (c == 2 && b2 == null) {
                b2 = b4;
            }
        }
        final boolean p2 = p.P(2);
        final String s = "FragmentManager";
        if (p2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(b2);
            sb.append(" to ");
            sb.append(b3);
            Log.v("FragmentManager", sb.toString());
        }
        final ArrayList<b> list3 = new ArrayList<b>();
        final ArrayList<d> list4 = new ArrayList<d>();
        final ArrayList list5 = new ArrayList(list);
        final Fragment c2 = list2.get(list2.size() - 1).c;
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            final Fragment.d m1 = ((v.b)iterator2.next()).c.m1;
            final Fragment.d m2 = c2.m1;
            m1.b = m2.b;
            m1.c = m2.c;
            m1.d = m2.d;
            m1.e = m2.e;
        }
        for (final v.b b5 : list2) {
            final jg3 jg3 = new jg3();
            b5.e();
            b5.e.add(jg3);
            list3.add(new b(b5, jg3, b));
            final jg3 jg4 = new jg3();
            b5.e();
            b5.e.add(jg4);
            list4.add(new d(b5, jg4, b, b ? (b5 == b2) : (b5 == b3)));
            b5.a(new Runnable() {
                @Override
                public final void run() {
                    if (list5.contains(b5)) {
                        list5.remove(b5);
                        final c e0 = c.this;
                        final v.b d0 = b5;
                        Objects.requireNonNull(e0);
                        mag.a(d0.a, d0.c.j1);
                    }
                }
            });
        }
        final HashMap<v.b, Boolean> hashMap = new HashMap<v.b, Boolean>();
        final Iterator<d> iterator4 = list4.iterator();
        ypb ypb = null;
        while (iterator4.hasNext()) {
            final d d2 = iterator4.next();
            if (((c)d2).b()) {
                continue;
            }
            final ypb c3 = d2.c(d2.c);
            ypb c4 = d2.c(d2.e);
            if (c3 != null && c4 != null && c3 != c4) {
                final StringBuilder g = w48.g("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                g.append(((c)d2).a.c);
                g.append(" returned Transition ");
                g.append(d2.c);
                g.append(" which uses a different Transition  type than its shared element transition ");
                g.append(d2.e);
                throw new IllegalArgumentException(g.toString());
            }
            if (c3 != null) {
                c4 = c3;
            }
            if (ypb == null) {
                ypb = c4;
            }
            else {
                if (c4 == null) {
                    continue;
                }
                if (ypb == c4) {
                    continue;
                }
                final StringBuilder g2 = w48.g("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                g2.append(((c)d2).a.c);
                g2.append(" returned Transition ");
                g2.append(d2.c);
                g2.append(" which uses a different Transition  type than other Fragments.");
                throw new IllegalArgumentException(g2.toString());
            }
        }
        String s2 = null;
        HashMap<v.b, Boolean> hashMap2 = null;
        v.b b14 = null;
        ArrayList list13 = null;
        Label_3166: {
            if (ypb == null) {
                for (final d d3 : list4) {
                    hashMap.put(((c)d3).a, Boolean.FALSE);
                    ((c)d3).a();
                }
                s2 = "FragmentManager";
                hashMap2 = hashMap;
            }
            else {
                final View view = new View(((View)super.a).getContext());
                final Rect rect = new Rect();
                final ArrayList list6 = new ArrayList();
                final ArrayList list7 = new ArrayList();
                at0 at0 = new at0();
                final Iterator<d> iterator6 = list4.iterator();
                boolean b6 = false;
                v.b b7 = b2;
                final Object o = null;
                View view2 = null;
                v.b b8 = b3;
                String s3 = s;
                Object o2 = o;
                while (iterator6.hasNext()) {
                    final Object e = iterator6.next().e;
                    Object o3;
                    String s7;
                    if (e != null && b7 != null && b8 != null) {
                        final Object r = ypb.r(ypb.f(e));
                        final Fragment.d m3 = b8.c.m1;
                        ArrayList<String> g3;
                        if (m3 == null || (g3 = m3.g) == null) {
                            g3 = new ArrayList<String>();
                        }
                        final Fragment.d m4 = b7.c.m1;
                        ArrayList<String> g4;
                        if (m4 == null || (g4 = m4.g) == null) {
                            g4 = new ArrayList<String>();
                        }
                        final Fragment.d m5 = b7.c.m1;
                        ArrayList<String> h;
                        if (m5 == null || (h = m5.h) == null) {
                            h = new ArrayList<String>();
                        }
                        for (int i = 0; i < h.size(); ++i) {
                            final int index = g3.indexOf(h.get(i));
                            if (index != -1) {
                                g3.set(index, g4.get(i));
                            }
                        }
                        final Fragment.d m6 = b8.c.m1;
                        ArrayList<String> h2;
                        if (m6 == null || (h2 = m6.h) == null) {
                            h2 = new ArrayList<String>();
                        }
                        if (!b) {
                            final Fragment.d m7 = b7.c.m1;
                            Objects.requireNonNull(b8.c);
                        }
                        else {
                            Objects.requireNonNull(b7.c);
                            final Fragment.d m8 = b8.c.m1;
                        }
                        for (int size = g3.size(), j = 0; j < size; ++j) {
                            ((l7q)at0).put((Object)g3.get(j), (Object)h2.get(j));
                        }
                        if (p.P(2)) {
                            Log.v(s3, ">>> entering view names <<<");
                            for (final String s4 : h2) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Name: ");
                                sb2.append(s4);
                                Log.v(s3, sb2.toString());
                            }
                            Log.v(s3, ">>> exiting view names <<<");
                            for (final String s5 : g3) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Name: ");
                                sb3.append(s5);
                                Log.v(s3, sb3.toString());
                            }
                        }
                        final at0 at2 = new at0();
                        this.k((Map<String, View>)at2, b7.c.j1);
                        at2.o((Collection)g3);
                        at0.o((Collection)at2.keySet());
                        final at0 at3 = new at0();
                        this.k((Map<String, View>)at3, b8.c.j1);
                        at3.o((Collection)h2);
                        at3.o(at0.values());
                        final upb a = tpb.a;
                        for (int k = ((l7q)at0).E0 - 1; k >= 0; --k) {
                            if (!((l7q)at3).containsKey((Object)((l7q)at0).m(k))) {
                                ((l7q)at0).j(k);
                            }
                        }
                        final String s6 = s3;
                        this.l((at0<String, View>)at2, at0.keySet());
                        this.l((at0<String, View>)at3, at0.values());
                        if (((l7q)at0).isEmpty()) {
                            list6.clear();
                            list7.clear();
                            o3 = null;
                            s7 = s6;
                        }
                        else {
                            final Fragment c5 = b8.c;
                            final Fragment c6 = b7.c;
                            final upb a2 = tpb.a;
                            if (b) {
                                Objects.requireNonNull(c6);
                            }
                            else {
                                Objects.requireNonNull(c5);
                            }
                            clj.a((View)super.a, (Runnable)new h(b3, b2, b, at3));
                            list6.addAll(at2.values());
                            View view3;
                            if (!g3.isEmpty()) {
                                view3 = (View)((l7q)at2).getOrDefault((Object)g3.get(0), (Object)null);
                                ypb.n(r, view3);
                            }
                            else {
                                view3 = view2;
                            }
                            final Object o4 = r;
                            list7.addAll(at3.values());
                            if (!h2.isEmpty()) {
                                final View view4 = (View)((l7q)at3).getOrDefault((Object)h2.get(0), (Object)null);
                                if (view4 != null) {
                                    clj.a((View)super.a, (Runnable)new i(ypb, view4, rect));
                                    b6 = true;
                                }
                            }
                            ypb.p(o4, view, (ArrayList)list6);
                            ypb.l(o4, (Object)null, (ArrayList)null, o4, list7);
                            final Boolean true = Boolean.TRUE;
                            final HashMap<v.b, Boolean> hashMap3 = hashMap;
                            hashMap3.put(b2, true);
                            hashMap3.put(b3, true);
                            final View view5 = view3;
                            b7 = b2;
                            b8 = b3;
                            o3 = o4;
                            view2 = view5;
                            s7 = s6;
                        }
                    }
                    else {
                        final String s8 = s3;
                        o3 = o2;
                        s7 = s8;
                    }
                    final at0 at4 = at0;
                    final Object o5 = o3;
                    s3 = s7;
                    o2 = o5;
                    at0 = at4;
                }
                final String s9 = s3;
                final l7q l7q = (l7q)at0;
                HashMap<v.b, Boolean> hashMap4 = hashMap;
                final ArrayList list8 = new ArrayList();
                final Iterator<d> iterator9 = list4.iterator();
                final Object o6 = null;
                Object l = null;
                View view6 = view2;
                Object o7 = o6;
                v.b b9 = b8;
                final l7q l7q2 = l7q;
                while (iterator9.hasNext()) {
                    final d d4 = iterator9.next();
                    if (((c)d4).b()) {
                        hashMap4.put(((c)d4).a, Boolean.FALSE);
                        ((c)d4).a();
                    }
                    else {
                        final Object f;
                        final Object o8 = f = ypb.f(d4.c);
                        final v.b a3 = ((c)d4).a;
                        final boolean b10 = o2 != null && (a3 == b7 || a3 == b9);
                        HashMap<v.b, Boolean> hashMap5;
                        Object j2;
                        if (f == null) {
                            if (!b10) {
                                hashMap4.put(a3, Boolean.FALSE);
                                ((c)d4).a();
                            }
                            final Object o9 = o7;
                            hashMap5 = hashMap4;
                            j2 = o9;
                        }
                        else {
                            final ArrayList list9 = new ArrayList();
                            this.j(list9, a3.c.j1);
                            if (b10) {
                                if (a3 == b7) {
                                    list9.removeAll(list6);
                                }
                                else {
                                    list9.removeAll(list7);
                                }
                            }
                            if (list9.isEmpty()) {
                                ypb.a(f, view);
                            }
                            else {
                                ypb.b(f, (ArrayList)list9);
                                ypb.l(f, f, (ArrayList)list9, (Object)null, (ArrayList)null);
                                final v.b b11 = a3;
                                if (b11.a == 3) {
                                    list5.remove(b11);
                                    final ArrayList list10 = new ArrayList(list9);
                                    list10.remove(b11.c.j1);
                                    ypb.k(f, b11.c.j1, list10);
                                    clj.a((View)super.a, (Runnable)new j(list9));
                                }
                            }
                            final Object o10 = o7;
                            if (a3.a == 2) {
                                list8.addAll(list9);
                                if (b6) {
                                    ypb.m(o8, rect);
                                }
                            }
                            else {
                                ypb.n(o8, view6);
                            }
                            final Boolean true2 = Boolean.TRUE;
                            hashMap5 = hashMap4;
                            hashMap5.put(a3, true2);
                            if (d4.d) {
                                j2 = ypb.j(o10, o8);
                            }
                            else {
                                j2 = o10;
                                l = ypb.j(l, o8);
                            }
                        }
                        final View view7 = view6;
                        final HashMap<v.b, Boolean> hashMap6 = hashMap5;
                        b7 = b2;
                        b9 = b3;
                        o7 = j2;
                        hashMap4 = hashMap6;
                        view6 = view7;
                    }
                }
                hashMap2 = hashMap4;
                final Object i2 = ypb.i(o7, l, o2);
                if (i2 == null) {
                    s2 = s9;
                }
                else {
                    final Iterator<d> iterator10 = list4.iterator();
                    s2 = s9;
                    while (iterator10.hasNext()) {
                        final d d5 = iterator10.next();
                        if (((c)d5).b()) {
                            continue;
                        }
                        final Object c7 = d5.c;
                        final v.b a4 = ((c)d5).a;
                        final boolean b12 = o2 != null && (a4 == b2 || a4 == b3);
                        if (c7 == null && !b12) {
                            continue;
                        }
                        final ViewGroup a5 = super.a;
                        final WeakHashMap a6 = p5x.a;
                        if (!p5x$g.c((View)a5)) {
                            if (p.P(2)) {
                                final StringBuilder g5 = w48.g("SpecialEffectsController: Container ");
                                g5.append(super.a);
                                g5.append(" has not been laid out. Completing operation ");
                                g5.append(a4);
                                Log.v(s2, g5.toString());
                            }
                            ((c)d5).a();
                        }
                        else {
                            final Fragment c8 = ((c)d5).a.c;
                            ypb.o(i2, (Runnable)new k(d5, a4));
                        }
                    }
                    final ViewGroup a7 = super.a;
                    final WeakHashMap a8 = p5x.a;
                    if (p5x$g.c((View)a7)) {
                        tpb.a(list8, 4);
                        final ArrayList list11 = new ArrayList();
                        for (int size2 = list7.size(), n = 0; n < size2; ++n) {
                            final View view8 = list7.get(n);
                            final WeakHashMap a9 = p5x.a;
                            list11.add(p5x$i.k(view8));
                            p5x$i.v(view8, (String)null);
                        }
                        if (p.P(2)) {
                            Log.v(s2, ">>>>> Beginning transition <<<<<");
                            Log.v(s2, ">>>>> SharedElementFirstOutViews <<<<<");
                            final Iterator iterator11 = list6.iterator();
                            v.b b13;
                            while (true) {
                                final boolean hasNext = iterator11.hasNext();
                                b13 = b3;
                                if (!hasNext) {
                                    break;
                                }
                                final View view9 = (View)iterator11.next();
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("View: ");
                                sb4.append(view9);
                                sb4.append(" Name: ");
                                sb4.append(p5x$i.k(view9));
                                Log.v(s2, sb4.toString());
                                b3 = b13;
                            }
                            Log.v(s2, ">>>>> SharedElementLastInViews <<<<<");
                            final Iterator iterator12 = list7.iterator();
                            while (true) {
                                b3 = b13;
                                if (!iterator12.hasNext()) {
                                    break;
                                }
                                final View view10 = (View)iterator12.next();
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("View: ");
                                sb5.append(view10);
                                sb5.append(" Name: ");
                                sb5.append(p5x$i.k(view10));
                                Log.v(s2, sb5.toString());
                            }
                        }
                        ypb.c(super.a, i2);
                        final ViewGroup a10 = super.a;
                        final int size3 = list7.size();
                        final ArrayList list12 = new ArrayList();
                        for (int n2 = 0; n2 < size3; ++n2) {
                            final View view11 = (View)list6.get(n2);
                            final WeakHashMap a11 = p5x.a;
                            final String k2 = p5x$i.k(view11);
                            list12.add(k2);
                            if (k2 != null) {
                                p5x$i.v(view11, (String)null);
                                final String s10 = (String)l7q2.getOrDefault((Object)k2, (Object)null);
                                int n3 = 0;
                                while (true) {
                                    final String s11 = s2 = s2;
                                    if (n3 >= size3) {
                                        break;
                                    }
                                    if (s10.equals(list11.get(n3))) {
                                        p5x$i.v((View)list7.get(n3), k2);
                                        s2 = s11;
                                        break;
                                    }
                                    ++n3;
                                    s2 = s11;
                                }
                            }
                        }
                        b14 = b2;
                        list13 = list5;
                        clj.a((View)a10, (Runnable)new xpb(size3, list7, list11, list6, list12));
                        tpb.a(list8, 0);
                        ypb.q(o2, (ArrayList)list6, list7);
                        break Label_3166;
                    }
                }
            }
            b14 = b2;
            list13 = list5;
        }
        final boolean containsValue = hashMap2.containsValue(Boolean.TRUE);
        final ViewGroup a12 = super.a;
        final Context context = ((View)a12).getContext();
        final ArrayList<b> list14 = new ArrayList<b>();
        final Iterator<b> iterator13 = list3.iterator();
        boolean b15 = false;
        while (iterator13.hasNext()) {
            final b b16 = iterator13.next();
            if (((c)b16).b()) {
                ((c)b16).a();
            }
            else {
                final m.a c9 = b16.c(context);
                if (c9 == null) {
                    ((c)b16).a();
                }
                else {
                    final Animator b17 = c9.b;
                    if (b17 == null) {
                        list14.add(b16);
                    }
                    else {
                        final v.b a13 = ((c)b16).a;
                        final Fragment c10 = a13.c;
                        if (Boolean.TRUE.equals(hashMap2.get(a13))) {
                            if (p.P(2)) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("Ignoring Animator set on ");
                                sb6.append(c10);
                                sb6.append(" as this Fragment was involved in a Transition.");
                                Log.v(s2, sb6.toString());
                            }
                            ((c)b16).a();
                        }
                        else {
                            final boolean b18 = a13.a == 3;
                            if (b18) {
                                list13.remove(a13);
                            }
                            final View j3 = c10.j1;
                            a12.startViewTransition(j3);
                            b17.addListener((Animator$AnimatorListener)new androidx.fragment.app.d(a12, j3, b18, a13, b16));
                            b17.setTarget((Object)j3);
                            b17.start();
                            if (p.P(2)) {
                                final StringBuilder sb7 = new StringBuilder();
                                sb7.append("Animator from operation ");
                                sb7.append(a13);
                                sb7.append(" has started.");
                                Log.v(s2, sb7.toString());
                            }
                            ((c)b16).b.b((jg3.b)new e(b17, a13));
                            b15 = true;
                        }
                    }
                }
            }
        }
        for (final b b19 : list14) {
            final v.b a14 = ((c)b19).a;
            final Fragment c11 = a14.c;
            if (containsValue) {
                if (p.P(2)) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append("Ignoring Animation set on ");
                    sb8.append(c11);
                    sb8.append(" as Animations cannot run alongside Transitions.");
                    Log.v(s2, sb8.toString());
                }
                ((c)b19).a();
            }
            else if (b15) {
                if (p.P(2)) {
                    final StringBuilder sb9 = new StringBuilder();
                    sb9.append("Ignoring Animation set on ");
                    sb9.append(c11);
                    sb9.append(" as Animations cannot run alongside Animators.");
                    Log.v(s2, sb9.toString());
                }
                ((c)b19).a();
            }
            else {
                final View j4 = c11.j1;
                final m.a c12 = b19.c(context);
                Objects.requireNonNull(c12);
                final Animation a15 = c12.a;
                Objects.requireNonNull(a15);
                if (a14.a != 1) {
                    j4.startAnimation(a15);
                    ((c)b19).a();
                }
                else {
                    a12.startViewTransition(j4);
                    final m.b b20 = new m.b(a15, a12, j4);
                    ((Animation)b20).setAnimationListener((Animation$AnimationListener)new f(a14, a12, j4, b19));
                    j4.startAnimation((Animation)b20);
                    if (p.P(2)) {
                        final StringBuilder sb10 = new StringBuilder();
                        sb10.append("Animation from operation ");
                        sb10.append(a14);
                        sb10.append(" has started.");
                        Log.v(s2, sb10.toString());
                    }
                }
                ((c)b19).b.b((jg3.b)new g(j4, a12, b19, a14));
            }
        }
        for (final v.b b21 : list13) {
            mag.a(b21.a, b21.c.j1);
        }
        list13.clear();
        if (p.P(2)) {
            final StringBuilder sb11 = new StringBuilder();
            sb11.append("Completed executing operations from ");
            sb11.append(b14);
            sb11.append(" to ");
            sb11.append(b3);
            Log.v(s2, sb11.toString());
        }
    }
    
    public final void j(final ArrayList<View> list, View child) {
        if (child instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)child;
            if (x6x.b(viewGroup)) {
                if (!list.contains(child)) {
                    list.add((View)viewGroup);
                }
            }
            else {
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    child = viewGroup.getChildAt(i);
                    if (child.getVisibility() == 0) {
                        this.j(list, child);
                    }
                }
            }
        }
        else if (!list.contains(child)) {
            list.add(child);
        }
    }
    
    public final void k(final Map<String, View> map, View child) {
        final WeakHashMap a = p5x.a;
        final String k = p5x$i.k(child);
        if (k != null) {
            map.put(k, child);
        }
        if (child instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)child;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    this.k(map, child);
                }
            }
        }
    }
    
    public final void l(final at0<String, View> at0, final Collection<String> collection) {
        final Iterator<Map.Entry<Object, Object>> iterator = ((at0.a)at0.entrySet()).iterator();
        while (true) {
            final at0.d d = (at0.d)iterator;
            if (!d.hasNext()) {
                break;
            }
            d.next();
            final View view = ((Map.Entry<K, View>)d).getValue();
            final WeakHashMap a = p5x.a;
            if (collection.contains(p5x$i.k(view))) {
                continue;
            }
            d.remove();
        }
    }
    
    public static final class b extends c
    {
        public boolean c;
        public boolean d;
        public m.a e;
        
        public b(final v.b b, final jg3 jg3, final boolean c) {
            super(b, jg3);
            this.d = false;
            this.c = c;
        }
        
        public final m.a c(final Context context) {
            if (this.d) {
                return this.e;
            }
            final v.b a = super.a;
            final Fragment c = a.c;
            final int a2 = a.a;
            final boolean b = false;
            final boolean b2 = a2 == 2;
            final boolean c2 = this.c;
            final Fragment.d m1 = c.m1;
            int f;
            if (m1 == null) {
                f = 0;
            }
            else {
                f = m1.f;
            }
            int n;
            if (c2) {
                if (b2) {
                    n = c.S0();
                }
                else {
                    n = c.T0();
                }
            }
            else if (b2) {
                n = c.O0();
            }
            else {
                n = c.P0();
            }
            c.M1(0, 0, 0, 0);
            final ViewGroup i1 = c.i1;
            final m.a a3 = null;
            if (i1 != null && ((View)i1).getTag(2131432625) != null) {
                ((View)c.i1).setTag(2131432625, (Object)null);
            }
            final ViewGroup i2 = c.i1;
            Object e = null;
            Label_0498: {
                if (i2 != null && i2.getLayoutTransition() != null) {
                    e = a3;
                }
                else {
                    int n2;
                    if ((n2 = n) == 0) {
                        n2 = n;
                        if (f != 0) {
                            if (f != 4097) {
                                if (f != 8194) {
                                    if (f != 8197) {
                                        if (f != 4099) {
                                            if (f != 4100) {
                                                n2 = -1;
                                            }
                                            else if (b2) {
                                                n2 = m.a(context, 16842936);
                                            }
                                            else {
                                                n2 = m.a(context, 16842937);
                                            }
                                        }
                                        else if (b2) {
                                            n2 = 2130837527;
                                        }
                                        else {
                                            n2 = 2130837528;
                                        }
                                    }
                                    else if (b2) {
                                        n2 = m.a(context, 16842938);
                                    }
                                    else {
                                        n2 = m.a(context, 16842939);
                                    }
                                }
                                else if (b2) {
                                    n2 = 2130837525;
                                }
                                else {
                                    n2 = 2130837526;
                                }
                            }
                            else if (b2) {
                                n2 = 2130837529;
                            }
                            else {
                                n2 = 2130837530;
                            }
                        }
                    }
                    e = a3;
                    if (n2 != 0) {
                        final boolean equals = "anim".equals(context.getResources().getResourceTypeName(n2));
                        int n3 = b ? 1 : 0;
                        if (equals) {
                            try {
                                final Animation loadAnimation = AnimationUtils.loadAnimation(context, n2);
                                if (loadAnimation != null) {
                                    e = new m.a(loadAnimation);
                                    break Label_0498;
                                }
                                n3 = 1;
                            }
                            catch (final RuntimeException ex) {
                                n3 = (b ? 1 : 0);
                            }
                            catch (final Resources$NotFoundException ex2) {
                                throw ex2;
                            }
                        }
                        e = a3;
                        if (n3 == 0) {
                            try {
                                final Animator loadAnimator = AnimatorInflater.loadAnimator(context, n2);
                                e = a3;
                                if (loadAnimator != null) {
                                    e = new m.a(loadAnimator);
                                }
                            }
                            catch (final RuntimeException ex3) {
                                if (equals) {
                                    throw ex3;
                                }
                                final Animation loadAnimation2 = AnimationUtils.loadAnimation(context, n2);
                                e = a3;
                                if (loadAnimation2 != null) {
                                    e = new m.a(loadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
            this.e = (m.a)e;
            this.d = true;
            return (m.a)e;
        }
    }
    
    public static class c
    {
        public final v.b a;
        public final jg3 b;
        
        public c(final v.b a, final jg3 b) {
            this.a = a;
            this.b = b;
        }
        
        public final void a() {
            final v.b a = this.a;
            if (a.e.remove(this.b) && a.e.isEmpty()) {
                a.c();
            }
        }
        
        public final boolean b() {
            final int c = mag.c(this.a.c.j1);
            final int a = this.a.a;
            return c == a || (c != 2 && a != 2);
        }
    }
    
    public static final class d extends c
    {
        public final Object c;
        public final boolean d;
        public final Object e;
        
        public d(final v.b b, final jg3 jg3, final boolean b2, final boolean b3) {
            super(b, jg3);
            final int a = b.a;
            final Object o = null;
            if (a == 2) {
                Object j = null;
                Label_0070: {
                    if (b2) {
                        final Fragment.d m1 = b.c.m1;
                        if (m1 != null) {
                            if ((j = m1.j) != Fragment.y1) {
                                break Label_0070;
                            }
                        }
                    }
                    else {
                        final Fragment.d m2 = b.c.m1;
                    }
                    j = null;
                }
                this.c = j;
                if (b2) {
                    final Fragment.d m3 = b.c.m1;
                }
                else {
                    final Fragment.d m4 = b.c.m1;
                }
                this.d = true;
            }
            else {
                Object i = null;
                Label_0155: {
                    if (b2) {
                        final Fragment.d m5 = b.c.m1;
                        if (m5 != null) {
                            if ((i = m5.i) != Fragment.y1) {
                                break Label_0155;
                            }
                        }
                    }
                    else {
                        final Fragment.d m6 = b.c.m1;
                    }
                    i = null;
                }
                this.c = i;
                this.d = true;
            }
            if (b3) {
                if (b2) {
                    final Fragment.d m7 = b.c.m1;
                    Object k;
                    if (m7 == null) {
                        k = o;
                    }
                    else {
                        k = m7.k;
                        if (k == Fragment.y1) {
                            k = o;
                        }
                    }
                    this.e = k;
                }
                else {
                    final Fragment.d m8 = b.c.m1;
                    this.e = null;
                }
            }
            else {
                this.e = null;
            }
        }
        
        public final ypb c(final Object o) {
            if (o == null) {
                return null;
            }
            final upb a = tpb.a;
            if (o instanceof Transition) {
                return (ypb)a;
            }
            final ypb b = tpb.b;
            if (b != null && b.e(o)) {
                return b;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(o);
            sb.append(" for fragment ");
            sb.append(super.a.c);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
