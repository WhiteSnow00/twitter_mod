import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import android.text.style.StyleSpan;
import java.util.Locale;
import android.text.SpannableString;
import kotlin.NoWhenBranchMatchedException;
import android.view.KeyEvent;
import android.graphics.Paint;
import android.os.Build$VERSION;
import android.text.style.MetricAffectingSpan;
import android.text.Spanned;
import android.graphics.Rect;
import android.text.TextPaint;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqe implements btl, c0z
{
    public static final v4s F0;
    public static final kqe G0;
    public static final int[] H0;
    public static final kqe I0;
    
    static {
        F0 = new v4s("RESUME_TOKEN");
        G0 = new kqe();
        H0 = new int[] { 2130969630, 2130970454, 2130970457, 2130970458, 2130970461 };
        I0 = new kqe();
    }
    
    public kqe() {
    }
    
    public kqe(final Activity activity, final j0u j0u) {
        e0e.f((Object)activity, "activity");
        if (j0u != null) {
            final i0u value = j0u.get();
            if (value != null) {
                final h0u a = value.a;
                if (a != null) {
                    activity.overridePendingTransition(a.a, a.b);
                }
            }
        }
    }
    
    public static final l9r A(final wld wld, final float n, final float n2, final vld vld, final d86 d86, final int n3) {
        e0e.f((Object)wld, "<this>");
        d86.x(469472752);
        final sa6$b a = sa6.a;
        final miv a2 = cqw.a;
        final l9r b = B(wld, n, n2, (liv)cqw.a, vld, d86);
        d86.O();
        return b;
    }
    
    public static final l9r B(final wld wld, final Object o, final Object o2, final liv liv, final vld vld, final d86 d86) {
        e0e.f((Object)wld, "<this>");
        e0e.f((Object)liv, "typeConverter");
        d86.x(-1695411770);
        final sa6$b a = sa6.a;
        d86.x(-492369756);
        final Object y = d86.y();
        Objects.requireNonNull(d86.Companion);
        Object o3 = y;
        if (y == d86$a.b) {
            o3 = new wld.a(o, o2, liv, (ac0<Object>)vld);
            d86.p(o3);
        }
        d86.O();
        final wld.a a2 = (wld.a)o3;
        shw.n((ptb)new xld(o, a2, o2, vld), d86);
        shw.b((Object)a2, (stb)new zld(wld, a2), d86);
        d86.O();
        return (l9r)a2;
    }
    
    public static final float C(final ec8 ec8, final float n) {
        e0e.f((Object)ec8, "<this>");
        final miv a = cqw.a;
        return ((ic0)ec8.a((liv)cqw.a).d((lc0)new ic0(0.0f), (lc0)new ic0(n))).a;
    }
    
    public static final dc4 D(Class componentType) {
        int n = 0;
        while (componentType.isArray()) {
            ++n;
            componentType = componentType.getComponentType();
            e0e.e((Object)componentType, "currentClass.componentType");
        }
        if (!componentType.isPrimitive()) {
            bc4 a = v8m.a((Class)componentType);
            final n9e a2 = n9e.a;
            final vnb b = a.b();
            e0e.e((Object)b, "javaClassId.asSingleFqName()");
            final bc4 g = a2.g(b);
            if (g != null) {
                a = g;
            }
            return new dc4(a, n);
        }
        if (e0e.a((Object)componentType, (Object)Void.TYPE)) {
            return new dc4(bc4.l(f7r$a.e.i()), n);
        }
        final vzk g2 = gne.e(componentType.getName()).g();
        e0e.e((Object)g2, "get(currentClass.name).primitiveType");
        if (n > 0) {
            return new dc4(bc4.l((vnb)g2.I0.getValue()), n - 1);
        }
        return new dc4(bc4.l((vnb)g2.H0.getValue()), n);
    }
    
    public static final lc0 E(final lc0 lc0) {
        e0e.f((Object)lc0, "<this>");
        final lc0 a0 = a0(lc0);
        for (int b = a0.b(), i = 0; i < b; ++i) {
            a0.e(i, lc0.a(i));
        }
        return a0;
    }
    
    public static final int F(final int n) {
        int n2 = 2;
        switch (n) {
            default: {
                n2 = 3;
                return n2;
            }
            case 3:
            case 5:
            case 6: {
                return n2;
            }
            case 1:
            case 2:
            case 4: {
                n2 = 1;
                return n2;
            }
            case 0: {
                n2 = 0;
                return n2;
            }
        }
    }
    
    public static final void G(final cth cth, final ah3 ah3, final wq2 wq2, final float n, final vrp vrp, final xfs xfs) {
        final ArrayList h = cth.h;
        for (int size = h.size(), i = 0; i < size; ++i) {
            final gwj gwj = (gwj)h.get(i);
            o6f.h(gwj.a, ah3, wq2, n, vrp, xfs, (dcu)null, 32, (Object)null);
            ah3.b(0.0f, gwj.a.getHeight());
        }
    }
    
    public static final List H(final swe swe, final List list) {
        final ivh<swe> y = swe.y();
        final int h0 = y.H0;
        if (h0 > 0) {
            int n = 0;
            final Object[] f0 = y.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final swe swe2 = (swe)f0[n];
                final qhp o = O(swe2);
                if (o != null) {
                    list.add(o);
                }
                else {
                    H(swe2, list);
                }
            } while (++n < h0);
        }
        return list;
    }
    
    public static final Rect I(final TextPaint textPaint, final CharSequence charSequence, int i, final int n) {
        if (charSequence instanceof Spanned) {
            final Spanned spanned = (Spanned)charSequence;
            if (spanned.nextSpanTransition(i - 1, n, (Class)MetricAffectingSpan.class) != n) {
                final Rect rect = new Rect();
                final Rect rect2 = new Rect();
                final TextPaint textPaint2 = new TextPaint();
                while (i < n) {
                    final int nextSpanTransition = spanned.nextSpanTransition(i, n, (Class)MetricAffectingSpan.class);
                    final MetricAffectingSpan[] array = (MetricAffectingSpan[])spanned.getSpans(i, nextSpanTransition, (Class)MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    e0e.e((Object)array, "spans");
                    for (final MetricAffectingSpan metricAffectingSpan : array) {
                        if (spanned.getSpanStart((Object)metricAffectingSpan) != spanned.getSpanEnd((Object)metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build$VERSION.SDK_INT >= 29) {
                        tvj.a((Paint)textPaint2, charSequence, i, nextSpanTransition, rect2);
                    }
                    else {
                        ((Paint)textPaint2).getTextBounds(charSequence.toString(), i, nextSpanTransition, rect2);
                    }
                    i = rect.right;
                    rect.right = rect2.width() + i;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        final Rect rect3 = new Rect();
        if (Build$VERSION.SDK_INT >= 29) {
            tvj.a((Paint)textPaint, charSequence, i, n, rect3);
        }
        else {
            ((Paint)textPaint).getTextBounds(charSequence.toString(), i, n, rect3);
        }
        return rect3;
    }
    
    public static final int J(final d86 d86) {
        final sa6$b a = sa6.a;
        return d86.L();
    }
    
    public static final m5m K(final d86 d86) {
        final sa6$b a = sa6.a;
        final m5m v = d86.v();
        if (v != null) {
            d86.G(v);
            return v;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }
    
    public static final float L(final qjs qjs, final int n, final boolean b, final boolean b2) {
        e0e.f((Object)qjs, "<this>");
        final boolean b3 = false;
        int max;
        if ((b && !b2) || (!b && b2)) {
            max = n;
        }
        else {
            max = Math.max(n - 1, 0);
        }
        boolean b4 = b3;
        if (qjs.a(max) == qjs.m(n)) {
            b4 = true;
        }
        final cth b5 = qjs.b;
        b5.d(n);
        int n2;
        if (n == b5.a.a.length()) {
            n2 = shw.F((List)b5.h);
        }
        else {
            n2 = p0b.o((List)b5.h, n);
        }
        final gwj gwj = b5.h.get(n2);
        return gwj.a.n(gwj.b(n), b4);
    }
    
    public static final long M(final KeyEvent keyEvent) {
        return jty.d(keyEvent.getKeyCode());
    }
    
    public static final qhp N(final swe swe) {
        e0e.f((Object)swe, "<this>");
        Object o = swe.g1.e;
        if ((((dlh.c)o).H0 & 0x8) != 0x0) {
            while (o != null) {
                if ((((dlh.c)o).G0 & 0x8) != 0x0 && o instanceof qhp && ((qhp)o).z().G0) {
                    return (qhp)o;
                }
                if ((((dlh.c)o).H0 & 0x8) == 0x0) {
                    break;
                }
                o = ((dlh.c)o).J0;
            }
        }
        o = null;
        return (qhp)o;
    }
    
    public static final qhp O(final swe swe) {
        e0e.f((Object)swe, "<this>");
        Object o = swe.g1.e;
        if ((((dlh.c)o).H0 & 0x8) != 0x0) {
            while (o != null) {
                if ((((dlh.c)o).G0 & 0x8) != 0x0 && o instanceof qhp) {
                    return (qhp)o;
                }
                if ((((dlh.c)o).H0 & 0x8) == 0x0) {
                    break;
                }
                o = ((dlh.c)o).J0;
            }
        }
        o = null;
        return (qhp)o;
    }
    
    public static final long P(final qjs qjs, final int n, final boolean b, final boolean b2) {
        e0e.f((Object)qjs, "textLayoutResult");
        return e(L(qjs, n, b, b2), qjs.d(qjs.f(n)));
    }
    
    public static final int Q() {
        final long c = pks.c(0L);
        Objects.requireNonNull(qks.Companion);
        int n;
        if (qks.a(c, 4294967296L)) {
            n = 0;
        }
        else if (qks.a(c, 8589934592L)) {
            n = 1;
        }
        else {
            n = 2;
        }
        return n;
    }
    
    public static final int R(final KeyEvent keyEvent) {
        final int action = keyEvent.getAction();
        int n = 1;
        if (action != 0) {
            if (action != 1) {
                Objects.requireNonNull(jqe.Companion);
                n = 0;
            }
            else {
                Objects.requireNonNull(jqe.Companion);
            }
        }
        else {
            Objects.requireNonNull(jqe.Companion);
            n = 2;
        }
        return n;
    }
    
    public static final long S(final iq7 iq7) {
        e0e.f((Object)iq7, "<this>");
        int n;
        if (iq7 instanceof iq7$a) {
            final tp7 a = ((iq7$a)iq7).a;
            n = o5j.g((Object)a.a, (Object)a.g);
        }
        else if (e0e.a((Object)iq7, (Object)iq7$c$c.a)) {
            n = iq7.hashCode();
        }
        else if (e0e.a((Object)iq7, (Object)iq7$c$e.a)) {
            n = iq7.hashCode();
        }
        else if (e0e.a((Object)iq7, (Object)iq7$c$a.a)) {
            n = iq7.hashCode();
        }
        else if (iq7 instanceof iq7$b) {
            n = iq7.hashCode();
        }
        else if (iq7 instanceof jq7) {
            n = iq7.hashCode();
        }
        else if (iq7 instanceof iq7$c$b) {
            n = iq7.hashCode();
        }
        else {
            if (!(iq7 instanceof iq7$c$d)) {
                throw new NoWhenBranchMatchedException();
            }
            n = iq7.hashCode();
        }
        return n;
    }
    
    public static final dlh T(final dlh dlh, final stb stb) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)stb, "block");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new y12(stb));
    }
    
    public static dlh U(final dlh dlh, float n, float n2, float n3, float n4, asp a, boolean b, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = 1.0f;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 1.0f;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 1.0f;
        }
        if ((n5 & 0x100) != 0x0) {
            n4 = 0.0f;
        }
        float n6;
        if ((n5 & 0x200) != 0x0) {
            n6 = 8.0f;
        }
        else {
            n6 = 0.0f;
        }
        long b2;
        if ((n5 & 0x400) != 0x0) {
            Objects.requireNonNull(ozt.Companion);
            b2 = ozt.b;
        }
        else {
            b2 = 0L;
        }
        if ((n5 & 0x800) != 0x0) {
            a = (asp)x6m.a;
        }
        if ((n5 & 0x1000) != 0x0) {
            b = false;
        }
        long a2;
        if ((n5 & 0x4000) != 0x0) {
            a2 = r8c.a;
        }
        else {
            a2 = 0L;
        }
        long a3;
        if ((n5 & 0x8000) != 0x0) {
            a3 = r8c.a;
        }
        else {
            a3 = 0L;
        }
        e0e.f((Object)dlh, "$this$graphicsLayer");
        e0e.f((Object)a, "shape");
        final ysd$a a4 = ysd.a;
        final ysd$a a5 = ysd.a;
        return dlh.E((dlh)new s9q(n, n2, n3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, n4, n6, b2, a, b, a2, a3));
    }
    
    public static SpannableString V(String lowerCase, final String s) {
        final SpannableString spannableString = new SpannableString((CharSequence)lowerCase);
        final String trim = s.trim();
        final Locale english = Locale.ENGLISH;
        final String lowerCase2 = trim.toLowerCase(english);
        if (lowerCase2.isEmpty()) {
            return spannableString;
        }
        int i = 0;
        lowerCase = lowerCase.toLowerCase(english);
        while (i < lowerCase.length()) {
            if (lowerCase.substring(i).startsWith(lowerCase2)) {
                spannableString.setSpan((Object)new StyleSpan(1), i, lowerCase2.length() + i, 33);
                i += lowerCase2.length();
            }
            else {
                ++i;
            }
        }
        return spannableString;
    }
    
    public static final void W() {
        throw new IllegalStateException("Invalid applier".toString());
    }
    
    public static final boolean X(final KeyEvent keyEvent) {
        e0e.f((Object)keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }
    
    public static final boolean Y(final long n) {
        final float d = kgj.d(n);
        final boolean infinite = Float.isInfinite(d);
        boolean b = true;
        if (!infinite && !Float.isNaN(d)) {
            final float e = kgj.e(n);
            if (!Float.isInfinite(e) && !Float.isNaN(e)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final boolean Z(final long n) {
        Objects.requireNonNull(kgj.Companion);
        return n != kgj.d;
    }
    
    public static final lc0 a0(lc0 c) {
        e0e.f((Object)c, "<this>");
        c = c.c();
        e0e.d((Object)c, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c;
    }
    
    public static b80 b(final float n) {
        final miv a = cqw.a;
        return new b80((Object)n, (liv)cqw.a, (Object)0.01f, 8);
    }
    
    public static final dlh b0(final dlh dlh, final stb stb) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)stb, "onPlaced");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new xjj(stb));
    }
    
    public static rp8 c() {
        return (rp8)new sp8(1.0f, 1.0f);
    }
    
    public static final String c0(final int n, final int n2, final d86 d86) {
        final sa6$b a = sa6.a;
        final String quantityString = pk7.p(d86).getQuantityString(n, n2);
        e0e.e((Object)quantityString, "resources.getQuantityString(id, count)");
        return quantityString;
    }
    
    public static final long d(final int n, final int n2) {
        final long n3 = n;
        final long n4 = n2;
        final hud$a companion = hud.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final String d0(final int n, final int n2, final Object[] array, final d86 d86) {
        final sa6$b a = sa6.a;
        final String quantityString = pk7.p(d86).getQuantityString(n, n2, Arrays.copyOf(array, array.length));
        e0e.e((Object)quantityString, "resources.getQuantityStr\u2026g(id, count, *formatArgs)");
        return quantityString;
    }
    
    public static final long e(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final kgj$a companion = kgj.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final void e0(final qse$c qse$c, final Annotation annotation) {
        final Class z = jb2.Z(jb2.S(annotation));
        final qse$a b = qse$c.b(v8m.a(z), (smq)new u8m(annotation));
        if (b != null) {
            f0(b, annotation, z);
        }
    }
    
    public static final void f(final dlh dlh, final d86 d86, int n) {
        e0e.f((Object)dlh, "modifier");
        d86.x(-72882467);
        final sa6$b a = sa6.a;
        final dpq a2 = dpq.a;
        d86.x(-1323940314);
        final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
        final cwe cwe = (cwe)d86.m((df6)ff6.k);
        final l7x l7x = (l7x)d86.m((df6)ff6.o);
        Objects.requireNonNull(w76.Companion);
        final swe$a b = w76.a.b;
        final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(dlh);
        n = ((((n << 3 & 0x70) | 0x180) << 9 & 0x1C00) | 0x6);
        if (d86.j() instanceof tr0) {
            d86.E();
            if (d86.f()) {
                d86.A((ptb)b);
            }
            else {
                d86.o();
            }
            d86.F();
            jty.X(d86, a2, (hub)w76.a.e);
            jty.X(d86, rp8, (hub)w76.a.d);
            jty.X(d86, cwe, (hub)w76.a.f);
            ((z36)a3).h0((Object)af.y(d86, l7x, w76.a.g, d86), (Object)d86, (Object)(n >> 3 & 0x70));
            d86.x(2058660585);
            d86.x(1142320198);
            if ((n >> 9 & 0xE & 0xB) == 0x2) {
                if (d86.i()) {
                    d86.H();
                }
            }
            awg.g(d86);
            return;
        }
        W();
        throw null;
    }
    
    public static final void f0(qse$a qse$a, final Annotation annotation, Class clazz) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        e0e.e((Object)declaredMethods, "annotationType.declaredMethods");
        final int length = declaredMethods.length;
        int n = 0;
    Label_0601_Outer:
        while (true) {
            Label_0607: {
                if (n >= length) {
                    break Label_0607;
                }
                final Method method = declaredMethods[n];
                while (true) {
                    try {
                        final Object invoke = method.invoke(annotation, new Object[0]);
                        e0e.c(invoke);
                        final a7i i = a7i.i(method.getName());
                        clazz = ((Class)invoke).getClass();
                        if (e0e.a((Object)clazz, (Object)Class.class)) {
                            qse$a.b(i, D((Class)invoke));
                        }
                        else if (fam.a.contains(clazz)) {
                            qse$a.f(i, invoke);
                        }
                        else {
                            final List a = v8m.a;
                            if (Enum.class.isAssignableFrom(clazz)) {
                                if (!clazz.isEnum()) {
                                    clazz = clazz.getEnclosingClass();
                                }
                                e0e.e((Object)clazz, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                                qse$a.d(i, v8m.a((Class)clazz), a7i.i(((Enum)invoke).name()));
                            }
                            else if (Annotation.class.isAssignableFrom(clazz)) {
                                final Class[] interfaces = clazz.getInterfaces();
                                e0e.e((Object)interfaces, "clazz.interfaces");
                                clazz = (Class)ft0.h1((Object[])interfaces);
                                e0e.e((Object)clazz, "annotationClass");
                                final qse$a e = qse$a.e(i, v8m.a((Class)clazz));
                                if (e != null) {
                                    f0(e, (Annotation)invoke, clazz);
                                }
                            }
                            else {
                                if (!clazz.isArray()) {
                                    qse$a = (qse$a)new StringBuilder();
                                    ((StringBuilder)qse$a).append("Unsupported annotation argument value (");
                                    ((StringBuilder)qse$a).append(clazz);
                                    ((StringBuilder)qse$a).append("): ");
                                    ((StringBuilder)qse$a).append(invoke);
                                    throw new UnsupportedOperationException(((StringBuilder)qse$a).toString());
                                }
                                final qse$b c = qse$a.c(i);
                                if (c != null) {
                                    clazz = clazz.getComponentType();
                                    if (clazz.isEnum()) {
                                        final bc4 a2 = v8m.a((Class)clazz);
                                        for (final Object o : (Object[])invoke) {
                                            e0e.d(o, "null cannot be cast to non-null type kotlin.Enum<*>");
                                            c.d(a2, a7i.i(((Enum)o).name()));
                                        }
                                    }
                                    else if (e0e.a((Object)clazz, (Object)Class.class)) {
                                        for (final Object o2 : (Object[])invoke) {
                                            e0e.d(o2, "null cannot be cast to non-null type java.lang.Class<*>");
                                            c.e(D((Class)o2));
                                        }
                                    }
                                    else if (Annotation.class.isAssignableFrom(clazz)) {
                                        for (final Object o3 : (Object[])invoke) {
                                            final qse$a b = c.b(v8m.a((Class)clazz));
                                            if (b != null) {
                                                e0e.d(o3, "null cannot be cast to non-null type kotlin.Annotation");
                                                f0(b, (Annotation)o3, clazz);
                                            }
                                        }
                                    }
                                    else {
                                        final Object[] array4 = (Object[])invoke;
                                        for (int length5 = array4.length, n2 = 0; n2 < length5; ++n2) {
                                            c.c(array4[n2]);
                                        }
                                    }
                                    c.a();
                                }
                            }
                        }
                        ++n;
                        continue Label_0601_Outer;
                        qse$a.a();
                    }
                    catch (final IllegalAccessException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static int g0(final InputStream inputStream, final byte[] array) throws IOException {
        int length;
        int i;
        int read;
        for (length = array.length, i = 0; i < length; i += read) {
            read = inputStream.read(array, 0 + i, length - i);
            if (read < 0) {
                break;
            }
        }
        return i;
    }
    
    public static final void h(dlh companion, nw8 k0, final d86 d86, final int n, final int n2) {
        final d86 h = d86.h(1376536405);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        final int n6 = n2 & 0x2;
        int n7 = n4;
        if (n6 != 0) {
            n7 = (n4 | 0x10);
        }
        dlh dlh;
        nw8 nw9;
        if (n6 == 2 && (n7 & 0x5B) == 0x12 && h.i()) {
            h.H();
            final nw8 nw8 = k0;
            dlh = companion;
            nw9 = nw8;
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n8 = n7;
                if (n6 != 0) {
                    n8 = (n7 & 0xFFFFFF8F);
                }
                n7 = n8;
            }
            else {
                if (n3 != 0) {
                    companion = (dlh)dlh.Companion;
                }
                if (n6 != 0) {
                    k0 = shw.K0(h);
                    n7 &= 0xFFFFFF8F;
                }
            }
            h.s();
            final sa6$b a = sa6.a;
            final n46 a2 = n46.a;
            de0.a((hub)n46.b, (hub)n46.c, (hub)w9y.i(h, 1123227065, new cl4(k0)), companion, 0L, (asp)null, (hub)null, (kub)n46.d, h, (n7 << 9 & 0x1C00) | 0xC001B6, 112);
            final nw8 nw10 = k0;
            dlh = companion;
            nw9 = nw10;
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new dl4(dlh, nw9, n, n2));
        }
    }
    
    public static final t5j h0(final SwipeRefreshLayout swipeRefreshLayout) {
        e0e.g((Object)swipeRefreshLayout, "$this$refreshes");
        return new h2s(swipeRefreshLayout);
    }
    
    public static final void i(final ivh ivh, final dlh.c c) {
        final ivh<swe> z = m0((en8)c).z();
        int h0 = z.H0;
        if (h0 > 0) {
            --h0;
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ivh.b((Object)((swe)f0[h0]).g1.e);
            } while (--h0 >= 0);
        }
    }
    
    public static final xe6 i0(final d86 d86) {
        d86.x(-1165786124);
        final sa6$b a = sa6.a;
        final xe6 m = d86.M();
        d86.O();
        return m;
    }
    
    public static final boolean j(final int[] array, final int n) {
        boolean b = true;
        if ((array[n * 5 + 1] & 0x4000000) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public static final ne2 j0(final d86 d86) {
        d86.x(-1031410916);
        final sa6$b a = sa6.a;
        final View view = (View)d86.m((df6)z20.f);
        d86.x(1157296644);
        final boolean p = d86.P((Object)view);
        final Object y = d86.y();
        d20 d87 = null;
        Label_0089: {
            if (!p) {
                Objects.requireNonNull(d86.Companion);
                if ((d87 = (d20)y) != d86$a.b) {
                    break Label_0089;
                }
            }
            d87 = new d20(view);
            d86.p((Object)d87);
        }
        d86.O();
        final d20 d88 = d87;
        d86.O();
        return (ne2)d88;
    }
    
    public static final int k(final int[] array, final int n) {
        return array[n * 5 + 4];
    }
    
    public static final wld k0(final d86 d86) {
        d86.x(-840193660);
        final sa6$b a = sa6.a;
        d86.x(-492369756);
        final Object y = d86.y();
        Objects.requireNonNull(d86.Companion);
        Object o = y;
        if (y == d86$a.b) {
            o = new wld();
            d86.p(o);
        }
        d86.O();
        final wld wld = (wld)o;
        wld.a(d86, 8);
        d86.O();
        return wld;
    }
    
    public static final swe l(swe swe, final stb stb) {
        for (swe = swe.x(); swe != null; swe = swe.x()) {
            if (stb.invoke((Object)swe)) {
                return swe;
            }
        }
        swe = null;
        return swe;
    }
    
    public static final qni l0(final en8 en8, final int n) {
        e0e.f((Object)en8, "$this$requireCoordinator");
        final qni k0 = en8.l().K0;
        e0e.c((Object)k0);
        qni m0;
        if (k0.g1() != en8) {
            m0 = k0;
        }
        else {
            m0 = k0;
            if (w9y.n(n)) {
                m0 = k0.M0;
                e0e.c((Object)m0);
            }
        }
        return m0;
    }
    
    public static final int m(final int[] array, final int n) {
        return array[n * 5 + 3];
    }
    
    public static final swe m0(final en8 en8) {
        e0e.f((Object)en8, "<this>");
        final qni k0 = en8.l().K0;
        e0e.c((Object)k0);
        return k0.L0;
    }
    
    public static final boolean n(final int[] array, final int n) {
        boolean b = true;
        if ((array[n * 5 + 1] & 0x10000000) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public static final orj n0(final en8 en8) {
        e0e.f((Object)en8, "<this>");
        final orj m0 = m0(en8).M0;
        e0e.c((Object)m0);
        return m0;
    }
    
    public static final boolean o(final int[] array, final int n) {
        boolean b = true;
        if ((array[n * 5 + 1] & 0x20000000) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public static final int o0(final ArrayList list, final int n, final int n2) {
        int n3 = list.size() - 1;
        int i = 0;
        while (i <= n3) {
            final int n4 = i + n3 >>> 1;
            final int a = list.get(n4).a;
            int n5;
            if ((n5 = a) < 0) {
                n5 = a + n2;
            }
            final int h = e0e.h(n5, n);
            if (h < 0) {
                i = n4 + 1;
            }
            else {
                if (h <= 0) {
                    return n4;
                }
                n3 = n4 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final boolean p(final int[] array, final int n) {
        boolean b = true;
        if ((array[n * 5 + 1] & 0x40000000) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public static final Typeface p0(final Typeface typeface, final plb plb, final Context context) {
        e0e.f((Object)plb, "variationSettings");
        Typeface a = typeface;
        if (Build$VERSION.SDK_INT >= 26) {
            final wmv a2 = wmv.a;
            a = wmv.a(typeface, plb, context);
        }
        return a;
    }
    
    public static final int q(final ArrayList list, int o0, final int n) {
        o0 = o0(list, o0, n);
        if (o0 < 0) {
            o0 = -(o0 + 1);
        }
        return o0;
    }
    
    public static final String q0(final Object o) {
        e0e.f(o, "obj");
        String s;
        if (o.getClass().isAnonymousClass()) {
            s = o.getClass().getName();
        }
        else {
            s = o.getClass().getSimpleName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('@');
        final String format = String.format("%07x", Arrays.copyOf(new Object[] { System.identityHashCode(o) }, 1));
        e0e.e((Object)format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
    
    public static final int r(final int[] array, final int n) {
        return array[n * 5 + 1] & 0x3FFFFFF;
    }
    
    public static final String r0(final int n, final d86 d86) {
        final sa6$b a = sa6.a;
        final String string = pk7.p(d86).getString(n);
        e0e.e((Object)string, "resources.getString(id)");
        return string;
    }
    
    public static final int s(final int[] array, final int n) {
        return array[n * 5 + 2];
    }
    
    public static final String s0(final int n, final Object[] array, final d86 d86) {
        final sa6$b a = sa6.a;
        final String string = pk7.p(d86).getString(n, Arrays.copyOf(array, array.length));
        e0e.e((Object)string, "resources.getString(id, *formatArgs)");
        return string;
    }
    
    public static final int t(final int[] array, int n) {
        n *= 5;
        return F(array[n + 1] >> 28) + array[n + 4];
    }
    
    public static final void t0(final String s, final char[] array, final int n, final int n2, final int n3) {
        e0e.f((Object)s, "<this>");
        e0e.f((Object)array, "destination");
        s.getChars(n2, n3, array, n);
    }
    
    public static final void u(final swe swe, final ivh ivh, final stb stb) {
        final ivh<swe> z = swe.z();
        final int h0 = z.H0;
        if (h0 > 0) {
            int n = 0;
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final swe swe2 = (swe)f0[n];
                if (ivh.H0 <= n) {
                    ivh.b(stb.invoke((Object)swe2));
                }
                else {
                    ivh.r(n, stb.invoke((Object)swe2));
                }
            } while (++n < h0);
        }
        ivh.q(swe.s().size(), ivh.H0);
    }
    
    public static Object[] u0(final Object[] array, final int n) {
        for (int i = 0; i < n; ++i) {
            if (array[i] == null) {
                throw new NullPointerException(go9.p(20, "at index ", i));
            }
        }
        return array;
    }
    
    public static final void v(final int[] array, final int n, final int n2) {
        array[n * 5 + 4] = n2;
    }
    
    public static final void w(final int[] array, final int n, final int n2) {
        sa6.g(n2 >= 0);
        array[n * 5 + 3] = n2;
    }
    
    public static final void x(final int[] array, int n, final int n2) {
        sa6.g(n2 >= 0 && n2 < 67108863);
        n = n * 5 + 1;
        array[n] = (n2 | (array[n] & 0xFC000000));
    }
    
    public static final void y(final int[] array, final int n, final int n2) {
        array[n * 5 + 2] = n2;
    }
    
    public static final dlh z(final dlh dlh, final float n) {
        e0e.f((Object)dlh, "<this>");
        final boolean b = n == 1.0f;
        dlh u = dlh;
        if (!b) {
            u = U(dlh, 0.0f, 0.0f, n, 0.0f, null, true, 61435);
        }
        return u;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().e();
    }
    
    public zsl$a g(final Object o) {
        final String s = (String)o;
        e0e.f((Object)s, "conversationId");
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).s(ttl.b("conversation_id", (Object)s));
        return zsl$a;
    }
}
