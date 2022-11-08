import com.google.mlkit.vision.common.internal.a;
import com.google.mlkit.vision.common.internal.a$a;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;
import java.util.LinkedHashSet;
import java.util.Map;
import android.view.ViewParent;
import java.util.Arrays;
import java.io.IOException;
import com.google.android.play.core.internal.zzbt;
import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import com.twitter.weaver.mvi.MviViewModel;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.ref.WeakReference;
import android.util.TypedValue;
import java.util.Objects;
import android.content.Context;
import android.text.Spanned;
import java.util.concurrent.CancellationException;
import android.text.TextUtils;
import com.twitter.util.user.UserIdentifier;
import com.twitter.rooms.model.helpers.RoomUserItem;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyz implements ygy, fjy, pyy, u16
{
    public static pwy C0;
    public static final int[] D0;
    public static final oyz E0;
    
    public static abm A(final ncq ncq, final ncq ncq2, final List list) {
        abm abm2;
        final abm abm = abm2 = null;
        if (list != null) {
            abm2 = abm;
            if (!list.isEmpty()) {
                abm2 = abm;
                if (!ncq.i()) {
                    if (ncq2.i()) {
                        abm2 = abm;
                    }
                    else {
                        final float n = ncq.b / (float)ncq.a;
                        final float n2 = ncq2.b / (float)ncq2.a;
                        final Iterator iterator = list.iterator();
                        float n3 = 0.0f;
                        abm abm3 = null;
                        while (iterator.hasNext()) {
                            final abm abm4 = (abm)iterator.next();
                            final float n4 = (abm4.d - abm4.b) * n2 / (abm4.c - abm4.a);
                            final float min = Math.min(n4 / n, n / n4);
                            if (min > n3) {
                                abm3 = abm4;
                                n3 = min;
                            }
                        }
                        abm2 = abm;
                        if (abm3 != null) {
                            if (abm3.d()) {
                                abm2 = abm;
                            }
                            else {
                                float d = abm3.d;
                                float b = abm3.b;
                                final float n5 = d - b;
                                float c = abm3.c;
                                float a = abm3.a;
                                final float n6 = c - a;
                                final float n7 = n2 * n5 / n6;
                                if (n < n7) {
                                    final float n8 = (n5 - n * n5 / n7) * 0.5f;
                                    b += n8;
                                    d -= n8;
                                }
                                else {
                                    final float n9 = (n6 - n7 * n6 / n) * 0.5f;
                                    a += n9;
                                    c -= n9;
                                }
                                abm2 = new abm(a, b, c, d);
                            }
                        }
                    }
                }
            }
        }
        return abm2;
    }
    
    public static final fjb B(final zwj zwj) {
        zzd.f((Object)zwj, "<this>");
        final hfv h0 = zwj.H0;
        int h2;
        if (h0 != null) {
            h2 = h0.H1;
        }
        else {
            h2 = 128;
        }
        Object o;
        if (tdy.r0(h2)) {
            o = fjb.F0;
        }
        else if (tdy.e0(h2)) {
            o = fjb.E0;
        }
        else if (tdy.c0(h2)) {
            o = fjb.G0;
        }
        else if (zzd.a((Object)tdy.o0(h2), (Object)Boolean.TRUE)) {
            o = fjb.H0;
        }
        else if (tdy.Y(h2)) {
            o = fjb.I0;
        }
        else {
            o = fjb.C0;
        }
        return (fjb)o;
    }
    
    public static int D() {
        final tev b = xev.b;
        return b.b - b.f - 1;
    }
    
    public static final String G(final gqn gqn, final Resources resources) {
        zzd.f((Object)gqn, "<this>");
        final RoomUserItem roomUserItem = (RoomUserItem)or4.H1((Iterable)gqn.n);
        String s;
        if (roomUserItem != null && roomUserItem.getTwitterUserIdLong() == UserIdentifier.Companion.c().getId()) {
            s = resources.getString(2131958049);
            zzd.e((Object)s, "{\n        resources.getS\u2026ng_title_own_space)\n    }");
        }
        else {
            String name;
            if (roomUserItem == null || (name = roomUserItem.getName()) == null) {
                name = "";
            }
            s = resources.getString(2131953572, new Object[] { name });
            zzd.e((Object)s, "{\n        resources.getS\u2026 admin?.name ?: \"\")\n    }");
        }
        return s;
    }
    
    public static String H(final Resources resources, final String s, final String s2) {
        String string;
        if (TextUtils.isEmpty((CharSequence)s)) {
            string = "";
        }
        else {
            final int d = D();
            string = s;
            if (xev.a(s).a > d) {
                final String string2 = resources.getString(2131956329);
                final int a = xev.a(string2).a;
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, d - a));
                sb.append(string2);
                string = sb.toString();
            }
        }
        return zi.y(string, " ", s2);
    }
    
    public static final void I(final Throwable t, final oy6 oy6) {
        if (t instanceof CancellationException) {
            return;
        }
        try {
            pmo.c(t);
        }
        finally {
            final Throwable t2;
            tdy.t(t, t2);
            asy.U(oy6, t);
        }
    }
    
    public static final boolean J(final Spanned spanned, final Class clazz) {
        zzd.f((Object)spanned, "<this>");
        return spanned.nextSpanTransition(-1, ((CharSequence)spanned).length(), clazz) != ((CharSequence)spanned).length();
    }
    
    public static final boolean K(final yy6 yy6) {
        final oy6 a = yy6.A();
        final int i = fae.I;
        final fae fae = (fae)a.c((oy6$b)fae$b.C0);
        return fae == null || fae.b();
    }
    
    public static final boolean L(final qse qse) {
        zzd.f((Object)qse, "<this>");
        return qse.P0() instanceof bp9;
    }
    
    public static boolean M(final jxg jxg) {
        final boolean a = ((oxg)jxg).a();
        boolean b = false;
        if (a) {
            b = b;
            if (dta.b().b("android_photo_upload_high_quality_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static boolean N(final d3 d3, final u4 u4) {
        final boolean b = true;
        if (u4 == null) {
            return true;
        }
        final zkk c = u4.c;
        boolean b2 = b;
        if (d3 != null) {
            if (d3.z3()) {
                b2 = b;
            }
            else {
                b2 = (c != null && (true ^ c.j()));
            }
        }
        return b2;
    }
    
    public static boolean O(final char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }
    
    public static final jkh P(final jkh jkh, final urj urj) {
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)urj, "paddingValues");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new wrj(urj));
    }
    
    public static final jkh Q(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "$this$padding");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new trj(n, n, n, n));
    }
    
    public static final jkh R(final jkh jkh, final float n, final float n2) {
        zzd.f((Object)jkh, "$this$padding");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new trj(n, n2, n, n2));
    }
    
    public static jkh S(final jkh jkh, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0;
        }
        return R(jkh, n, n2);
    }
    
    public static final jkh T(final jkh jkh, final float n, final float n2, final float n3, final float n4) {
        zzd.f((Object)jkh, "$this$padding");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new trj(n, n2, n3, n4));
    }
    
    public static jkh U(final jkh jkh, float n, float n2, float n3, float n4, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 0;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0;
        }
        return T(jkh, n, n2, n3, n4);
    }
    
    public static final cvj V(int n, final m76 m76) {
        m76.x(473971343);
        final ea6$b a = ea6.a;
        final Context context = (Context)m76.m((re6)a30.b);
        final Resources c = bp7.C(m76);
        m76.x(-492369756);
        final Object y = m76.y();
        Objects.requireNonNull(m76.Companion);
        final m76$a$a b = m76$a.b;
        Object o = y;
        if (y == b) {
            o = new TypedValue();
            m76.p(o);
        }
        m76.O();
        final TypedValue typedValue = (TypedValue)o;
        c.getValue(n, typedValue, true);
        final CharSequence string = typedValue.string;
        n9d$a n9d$a = null;
        Label_1992: {
            if (string != null && gkr.q1(string, (CharSequence)".xml")) {
                m76.x(-738265327);
                final Resources$Theme theme = context.getTheme();
                zzd.e((Object)theme, "context.theme");
                final int changingConfigurations = typedValue.changingConfigurations;
                m76.x(21855625);
                final n9d n9d = (n9d)m76.m((re6)a30.c);
                final n9d$b n9d$b = new n9d$b(theme, n);
                Objects.requireNonNull(n9d);
                final WeakReference weakReference = n9d.a.get(n9d$b);
                if (weakReference != null) {
                    n9d$a = (n9d$a)weakReference.get();
                }
                n9d$a n9d$a2;
                if ((n9d$a2 = n9d$a) == null) {
                    final XmlResourceParser xml = c.getXml(n);
                    zzd.e((Object)xml, "res.getXml(id)");
                    for (n = ((XmlPullParser)xml).next(); n != 2 && n != 1; n = ((XmlPullParser)xml).next()) {}
                    if (n != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!zzd.a((Object)((XmlPullParser)xml).getName(), (Object)"vector")) {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                    }
                    final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                    final q70 q70 = new q70((XmlPullParser)xml);
                    zzd.e((Object)attributeSet, "attrs");
                    final TypedArray e = q70.e(c, theme, attributeSet, tli.D0);
                    final boolean c2 = elv.c(e, (XmlPullParser)xml, "autoMirrored", 5, false);
                    q70.f(e.getChangingConfigurations());
                    final float b2 = q70.b(e, "viewportWidth", 7, 0.0f);
                    final float b3 = q70.b(e, "viewportHeight", 8, 0.0f);
                    if (b2 <= 0.0f) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(e.getPositionDescription());
                        sb.append("<VectorGraphic> tag requires viewportWidth > 0");
                        throw new XmlPullParserException(sb.toString());
                    }
                    if (b3 <= 0.0f) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(e.getPositionDescription());
                        sb2.append("<VectorGraphic> tag requires viewportHeight > 0");
                        throw new XmlPullParserException(sb2.toString());
                    }
                    final float dimension = e.getDimension(3, 0.0f);
                    q70.f(e.getChangingConfigurations());
                    final float dimension2 = e.getDimension(2, 0.0f);
                    q70.f(e.getChangingConfigurations());
                    long n2;
                    if (e.hasValue(1)) {
                        final TypedValue typedValue2 = new TypedValue();
                        e.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            Objects.requireNonNull(pr4.Companion);
                            n2 = pr4.g;
                        }
                        else {
                            final ColorStateList e2 = elv.e(e, (XmlPullParser)xml, theme);
                            q70.f(e.getChangingConfigurations());
                            if (e2 != null) {
                                n2 = m0n.p(e2.getDefaultColor());
                            }
                            else {
                                Objects.requireNonNull(pr4.Companion);
                                n2 = pr4.g;
                            }
                        }
                    }
                    else {
                        Objects.requireNonNull(pr4.Companion);
                        n2 = pr4.g;
                    }
                    n = e.getInt(6, -1);
                    q70.f(e.getChangingConfigurations());
                    Label_0725: {
                        if (n != -1) {
                            if (n == 3) {
                                Objects.requireNonNull(o12.Companion);
                                n = 3;
                                break Label_0725;
                            }
                            if (n != 5) {
                                if (n == 9) {
                                    Objects.requireNonNull(o12.Companion);
                                    n = 9;
                                    break Label_0725;
                                }
                                switch (n) {
                                    default: {
                                        Objects.requireNonNull(o12.Companion);
                                        break;
                                    }
                                    case 16: {
                                        Objects.requireNonNull(o12.Companion);
                                        n = 12;
                                        break Label_0725;
                                    }
                                    case 15: {
                                        Objects.requireNonNull(o12.Companion);
                                        n = 14;
                                        break Label_0725;
                                    }
                                    case 14: {
                                        Objects.requireNonNull(o12.Companion);
                                        n = 13;
                                        break Label_0725;
                                    }
                                }
                            }
                            else {
                                Objects.requireNonNull(o12.Companion);
                            }
                        }
                        else {
                            Objects.requireNonNull(o12.Companion);
                        }
                        n = 5;
                    }
                    final float n3 = dimension / c.getDisplayMetrics().density;
                    final float n4 = dimension2 / c.getDisplayMetrics().density;
                    e.recycle();
                    final m9d$a m9d$a = new m9d$a("", n3, n4, b2, b3, n2, n, c2);
                    n = 0;
                    while (((XmlPullParser)xml).getEventType() != 1 && (((XmlPullParser)xml).getDepth() >= 1 || ((XmlPullParser)xml).getEventType() != 3)) {
                        final int eventType = q70.a.getEventType();
                        if (eventType != 2) {
                            if (eventType == 3) {
                                if (zzd.a((Object)"group", (Object)q70.a.getName())) {
                                    for (int i = 0; i < n + 1; ++i) {
                                        m9d$a.f();
                                    }
                                    n = 0;
                                }
                            }
                        }
                        else {
                            final String name = q70.a.getName();
                            if (name != null) {
                                final int hashCode = name.hashCode();
                                if (hashCode != -1649314686) {
                                    if (hashCode != 3433509) {
                                        if (hashCode == 98629247) {
                                            if (name.equals("group")) {
                                                final TypedArray e3 = q70.e(c, theme, attributeSet, tli.E0);
                                                final float b4 = q70.b(e3, "rotation", 5, 0.0f);
                                                final float float1 = e3.getFloat(1, 0.0f);
                                                q70.f(e3.getChangingConfigurations());
                                                final float float2 = e3.getFloat(2, 0.0f);
                                                q70.f(e3.getChangingConfigurations());
                                                final float b5 = q70.b(e3, "scaleX", 3, 1.0f);
                                                final float b6 = q70.b(e3, "scaleY", 4, 1.0f);
                                                final float b7 = q70.b(e3, "translateX", 6, 0.0f);
                                                final float b8 = q70.b(e3, "translateY", 7, 0.0f);
                                                String d = q70.d(e3, 0);
                                                if (d == null) {
                                                    d = "";
                                                }
                                                e3.recycle();
                                                final int a2 = xow.a;
                                                m9d$a.a(d, b4, float1, float2, b5, b6, b7, b8, (List)v2a.C0);
                                            }
                                        }
                                    }
                                    else if (name.equals("path")) {
                                        final TypedArray e4 = q70.e(c, theme, attributeSet, tli.F0);
                                        if (!elv.n(q70.a, "pathData")) {
                                            throw new IllegalArgumentException("No path data available");
                                        }
                                        String d2 = q70.d(e4, 0);
                                        if (d2 == null) {
                                            d2 = "";
                                        }
                                        final List<rzj> a3 = xow.a(q70.d(e4, 2));
                                        final a16 a4 = q70.a(e4, theme, "fillColor", 1);
                                        final float b9 = q70.b(e4, "fillAlpha", 12, 1.0f);
                                        final int c3 = q70.c(e4, "strokeLineCap", 8, -1);
                                        Objects.requireNonNull(qkr.Companion);
                                        int n5 = 0;
                                        Label_1307: {
                                            if (c3 != 0) {
                                                if (c3 == 1) {
                                                    n5 = 1;
                                                    break Label_1307;
                                                }
                                                if (c3 == 2) {
                                                    n5 = 2;
                                                    break Label_1307;
                                                }
                                            }
                                            n5 = 0;
                                        }
                                        final int c4 = q70.c(e4, "strokeLineJoin", 9, -1);
                                        Objects.requireNonNull(skr.Companion);
                                        int n6;
                                        if (c4 != 0) {
                                            if (c4 != 1) {
                                                n6 = 2;
                                            }
                                            else {
                                                n6 = 1;
                                            }
                                        }
                                        else {
                                            n6 = 0;
                                        }
                                        final float b10 = q70.b(e4, "strokeMiterLimit", 10, 1.0f);
                                        final a16 a5 = q70.a(e4, theme, "strokeColor", 3);
                                        final float b11 = q70.b(e4, "strokeAlpha", 11, 1.0f);
                                        final float b12 = q70.b(e4, "strokeWidth", 4, 1.0f);
                                        final float b13 = q70.b(e4, "trimPathEnd", 6, 1.0f);
                                        final float b14 = q70.b(e4, "trimPathOffset", 7, 0.0f);
                                        final float b15 = q70.b(e4, "trimPathStart", 5, 0.0f);
                                        final int c5 = q70.c(e4, "fillType", 13, 0);
                                        e4.recycle();
                                        final oq2 g0 = m0n.g0(a4);
                                        final oq2 g2 = m0n.g0(a5);
                                        int n7;
                                        if (c5 == 0) {
                                            Objects.requireNonNull(lzj.Companion);
                                            n7 = 0;
                                        }
                                        else {
                                            Objects.requireNonNull(lzj.Companion);
                                            n7 = 1;
                                        }
                                        m9d$a.b((List)a3, n7, d2, g0, b9, g2, b11, b12, n5, n6, b10, b15, b13, b14);
                                    }
                                }
                                else if (name.equals("clip-path")) {
                                    final TypedArray e5 = q70.e(c, theme, attributeSet, tli.G0);
                                    String d3 = q70.d(e5, 0);
                                    if (d3 == null) {
                                        d3 = "";
                                    }
                                    final List<rzj> a6 = xow.a(q70.d(e5, 1));
                                    e5.recycle();
                                    m9d$a.a(d3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, (List)a6);
                                    ++n;
                                }
                            }
                        }
                        ((XmlPullParser)xml).next();
                    }
                    n9d$a2 = new n9d$a(m9d$a.e(), changingConfigurations);
                    n9d.a.put(n9d$b, new WeakReference(n9d$a2));
                }
                final m9d a7 = n9d$a2.a;
                final ea6$b a8 = ea6.a;
                m76.O();
                final Object b16 = cpw.b(a7, m76);
                m76.O();
                break Label_1992;
            }
            m76.x(-738265172);
            final Resources$Theme theme2 = context.getTheme();
            m76.x(1618982084);
            final boolean p2 = m76.P((Object)string);
            final boolean p3 = m76.P((Object)n);
            final boolean p4 = m76.P((Object)theme2);
            final Object y2 = m76.y();
            Label_1968: {
                if (!(p4 | (p3 | p2))) {
                    final Object o2;
                    if ((o2 = y2) != b) {
                        break Label_1968;
                    }
                }
                try {
                    zzd.f((Object)h6d.Companion, "<this>");
                    final Drawable drawable = c.getDrawable(n, (Resources$Theme)null);
                    zzd.d((Object)drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    final Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
                    zzd.e((Object)bitmap, "res.getDrawable(id, null\u2026as BitmapDrawable).bitmap");
                    final Object o2 = new i40(bitmap);
                    m76.p(o2);
                    m76.O();
                    final Object b16 = new w02((h6d)o2);
                    m76.O();
                    m76.O();
                    return (cvj)b16;
                }
                finally {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
            }
        }
    }
    
    public static final yy6 W(final yy6 yy6, final oy6 oy6) {
        return (yy6)new mo6(((mo6)yy6).C0.w0(oy6));
    }
    
    public static final Object[] X(final Object o) {
        final Object[] array = new Object[32];
        array[0] = o;
        return array;
    }
    
    public static final boolean Y() {
        return dta.b().b("rito_safety_mode_modal_prompt_enabled", false);
    }
    
    public static void Z(final View view, final b9x b9x) {
        view.setTag(2131432601, (Object)b9x);
    }
    
    public static final yy6 b(oy6 w0) {
        final int i = fae.I;
        if (w0.c((oy6$b)fae$b.C0) == null) {
            w0 = w0.w0((oy6)new hae((fae)null));
        }
        return (yy6)new mo6(w0);
    }
    
    public static jkh b0(final jkh jkh, final float n, oqp a, long a2, long a3, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            a = (oqp)v5m.a;
        }
        final boolean b = (n2 & 0x4) != 0x0 && Float.compare(n, 0) > 0;
        if ((n2 & 0x8) != 0x0) {
            a2 = o8c.a;
        }
        if ((n2 & 0x10) != 0x0) {
            a3 = o8c.a;
        }
        zzd.f((Object)jkh, "$this$shadow");
        zzd.f((Object)a, "shape");
        if (Float.compare(n, 0) <= 0) {
            final jkh a4 = jkh;
            if (!b) {
                return a4;
            }
        }
        final ssd$a a5 = ssd.a;
        final ssd$a a6 = ssd.a;
        return ssd.a(jkh, ukg.g0((jkh)jkh.Companion, (rtb)new kqp(n, a, b, a2, a3)));
    }
    
    public static final urj c(final float n) {
        return (urj)new vrj(n, n, n, n);
    }
    
    public static final String c0(float n) {
        final int max = Math.max(1, 0);
        final float n2 = (float)Math.pow(10.0f, max);
        n *= n2;
        int n4;
        final int n3 = n4 = (int)n;
        if (n - n3 >= 0.5f) {
            n4 = n3 + 1;
        }
        n = n4 / n2;
        String s;
        if (max > 0) {
            s = String.valueOf(n);
        }
        else {
            s = String.valueOf((int)n);
        }
        return s;
    }
    
    public static urj d(float n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        float n3;
        if ((n2 & 0x2) != 0x0) {
            n3 = 0;
        }
        else {
            n3 = 0.0f;
        }
        return (urj)new vrj(n, n3, n, n3);
    }
    
    public static urj e(float n, float n2, float n3, float n4, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 0;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0;
        }
        return (urj)new vrj(n, n2, n3, n4);
    }
    
    public static final long e0(final long n, final long n2) {
        final int g = mis.g(n);
        final int f = mis.f(n);
        final int g2 = mis.g(n2);
        final int f2 = mis.f(n);
        final int n3 = 1;
        int g3;
        int n5;
        if (g2 < f2 && mis.g(n) < mis.f(n2)) {
            if (mis.a(n2, n)) {
                final int n4;
                g3 = (n4 = mis.g(n2));
                return h6q.f(g3, n4);
            }
            if (mis.a(n, n2)) {
                n5 = mis.e(n2);
                g3 = g;
            }
            else {
                final int g4 = mis.g(n2);
                int n6;
                if (g < mis.f(n2) && g4 <= g) {
                    n6 = n3;
                }
                else {
                    n6 = 0;
                }
                if (n6 == 0) {
                    final int n4 = mis.g(n2);
                    g3 = g;
                    return h6q.f(g3, n4);
                }
                g3 = mis.g(n2);
                n5 = mis.e(n2);
            }
        }
        else {
            g3 = g;
            final int n4;
            if ((n4 = f) <= mis.g(n2)) {
                return h6q.f(g3, n4);
            }
            g3 = g - mis.e(n2);
            n5 = mis.e(n2);
        }
        int n4 = f - n5;
        return h6q.f(g3, n4);
    }
    
    public static final int f(final boolean b, final boolean b2) {
        int n;
        if (b2) {
            n = 2;
        }
        else {
            n = 0;
        }
        return (b ? 1 : 0) | n;
    }
    
    public static final gyh f0(final MviViewModel mviViewModel, final rtb rtb) {
        zzd.f((Object)mviViewModel, "<this>");
        zzd.f((Object)rtb, "block");
        return new gyh(rtb);
    }
    
    public static final void g(final List list, final int n) {
        final int size = list.size();
        if (n >= 0 && n < size) {
            return;
        }
        throw new IndexOutOfBoundsException(k1b.f("Index ", n, " is out of bounds. The list has ", size, " elements."));
    }
    
    public static void g0(final ClassLoader classLoader, final Set set, final aky aky) {
        if (set.isEmpty()) {
            return;
        }
        final HashSet set2 = new HashSet();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            set2.add(((File)iterator.next()).getParentFile());
        }
        final Object p3 = amy.P(classLoader);
        final zra c = k3j.C(p3, "nativeLibraryDirectories", (Class)List.class);
        synchronized (drz.class) {
            final ArrayList list = new ArrayList((Collection<?>)c.a());
            set2.removeAll(list);
            list.addAll(set2);
            c.b((Object)list);
            monitorexit(drz.class);
            final ArrayList list2 = new ArrayList();
            final Object[] e = aky.e(p3, (List)new ArrayList(set2), (List)list2);
            if (!list2.isEmpty()) {
                final zzbt zzbt = new zzbt("Error in makePathElements");
                for (int size = list2.size(), i = 0; i < size; ++i) {
                    final IOException ex = list2.get(i);
                }
                throw zzbt;
            }
            synchronized (drz.class) {
                new sly(p3, k3j.G(p3, "nativeLibraryPathElements"), (Class)Object.class).d((Collection)Arrays.asList(e));
            }
        }
    }
    
    public static final void h(final List list, final int n, final int n2) {
        final int size = list.size();
        if (n > n2) {
            throw new IllegalArgumentException(k1b.f("Indices are out of order. fromIndex (", n, ") is greater than toIndex (", n2, ")."));
        }
        if (n < 0) {
            throw new IndexOutOfBoundsException(ffa.k("fromIndex (", n, ") is less than 0."));
        }
        if (n2 <= size) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("toIndex (");
        sb.append(n2);
        sb.append(") is more than than the list size (");
        sb.append(size);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static boolean h0(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return amy.R(classLoader, file, file2, b, (gjy)new dml(), "zip", (bjy)new bqe());
    }
    
    public static jkh i(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "<this>");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new mv0(n, false));
    }
    
    public static final float j(final urj urj, final tve tve) {
        zzd.f((Object)urj, "<this>");
        zzd.f((Object)tve, "layoutDirection");
        float n;
        if (tve == tve.C0) {
            n = urj.c(tve);
        }
        else {
            n = urj.b(tve);
        }
        return n;
    }
    
    public static final float k(final urj urj, final tve tve) {
        zzd.f((Object)urj, "<this>");
        zzd.f((Object)tve, "layoutDirection");
        float n;
        if (tve == tve.C0) {
            n = urj.b(tve);
        }
        else {
            n = urj.c(tve);
        }
        return n;
    }
    
    public static void l(final yy6 yy6) {
        final fae fae = (fae)yy6.A().c((oy6$b)fae$b.C0);
        if (fae != null) {
            fae.a((CancellationException)null);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Scope cannot be cancelled because it does not have a job: ");
        sb.append(yy6);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final void m(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        throw new IndexOutOfBoundsException(hi.H("index: ", n, ", size: ", n2));
    }
    
    public static final void n(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(hi.H("index: ", n, ", size: ", n2));
    }
    
    public static final void p(final int n, final int n2, final int n3) {
        if (n < 0 || n2 > n3) {
            final StringBuilder j = sbl.j("fromIndex: ", n, ", toIndex: ", n2, ", size: ");
            j.append(n3);
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (n <= n2) {
            return;
        }
        throw new IllegalArgumentException(hi.H("fromIndex: ", n, " > toIndex: ", n2));
    }
    
    public static final Object q(final gub gub, final ap6 ap6) {
        final swo swo = new swo(ap6.getContext(), ap6);
        return asy.z0(swo, (Object)swo, gub);
    }
    
    public static final long r(final int n, final int n2, final boolean b, final boolean b2) {
        if (n2 == 0) {
            return h6q.f(n, n);
        }
        if (n == 0) {
            long n3;
            if (b) {
                n3 = h6q.f(1, 0);
            }
            else {
                n3 = h6q.f(0, 1);
            }
            return n3;
        }
        if (n == n2) {
            long n4;
            if (b) {
                n4 = h6q.f(n2 - 1, n2);
            }
            else {
                n4 = h6q.f(n2, n2 - 1);
            }
            return n4;
        }
        long n5;
        if (b) {
            if (!b2) {
                n5 = h6q.f(n - 1, n);
            }
            else {
                n5 = h6q.f(n + 1, n);
            }
        }
        else if (!b2) {
            n5 = h6q.f(n, n + 1);
        }
        else {
            n5 = h6q.f(n, n - 1);
        }
        return n5;
    }
    
    public static final vmi s(final jwe jwe) {
        zzd.f((Object)jwe, "<this>");
        bgp bgp;
        if ((bgp = dml.P(jwe)) == null) {
            bgp = dml.Q(jwe);
        }
        if (bgp != null) {
            final jkh.c l = ((pm8)bgp).l();
            final vmi vmi;
            if (l != null && (vmi = l.H0) != null) {
                return vmi;
            }
        }
        return jwe.d1.b;
    }
    
    public static final jwe t(final jwe jwe, final rtb rtb) {
        zzd.f((Object)jwe, "<this>");
        if (rtb.invoke((Object)jwe)) {
            return jwe;
        }
        final List s = jwe.s();
        for (int i = 0; i < s.size(); ++i) {
            final jwe t = t(s.get(i), rtb);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
    
    public static final List u(jwe jwe, final List list) {
        zzd.f((Object)jwe, "<this>");
        zzd.f((Object)list, "list");
        if (!jwe.H()) {
            return list;
        }
        final ArrayList list2 = new ArrayList();
        final List s = jwe.s();
        final int size = s.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final jwe jwe2 = s.get(i);
            if (jwe2.H()) {
                list2.add(new ymi(jwe, jwe2));
            }
        }
        List list3;
        try {
            Objects.requireNonNull(ymi.Companion);
            ymi.G0 = 1;
            list3 = or4.p2((Collection)list2);
            lr4.j1(list3);
        }
        catch (final IllegalArgumentException ex) {
            Objects.requireNonNull(ymi.Companion);
            ymi.G0 = 2;
            list3 = or4.p2((Collection)list2);
            lr4.j1(list3);
        }
        final ArrayList list4 = new ArrayList<jwe>(list3.size());
        for (int size2 = list3.size(), j = 0; j < size2; ++j) {
            list4.add(((ymi)list3.get(j)).D0);
        }
        for (int size3 = list4.size(), k = n; k < size3; ++k) {
            jwe = list4.get(k);
            final bgp q = dml.Q(jwe);
            if (q != null) {
                list.add(q);
            }
            else {
                u(jwe, list);
            }
        }
        return list;
    }
    
    public static b9x v(final View view) {
        final b9x b9x = (b9x)view.getTag(2131432601);
        if (b9x != null) {
            return b9x;
        }
        ViewParent viewParent;
        b9x b9x2;
        View view2;
        for (viewParent = view.getParent(), b9x2 = b9x; b9x2 == null && viewParent instanceof View; b9x2 = (b9x)view2.getTag(2131432601), viewParent = view2.getParent()) {
            view2 = (View)viewParent;
        }
        return b9x2;
    }
    
    public static float y(float max, final float n, float n2) {
        final float n3 = n / 3.0f;
        if (max < n3) {
            max = 0.0f;
        }
        else {
            if (max <= 1.0f - n3) {
                if (max <= n2) {
                    max = Math.max(0.0f, max - n3);
                    return cn1.a(max, 0.0f, 1.0f - n);
                }
                n2 = (max -= n3 * 2.0f);
                if (n2 >= 0.0f) {
                    return cn1.a(max, 0.0f, 1.0f - n);
                }
            }
            max = 1.0f - n;
        }
        return cn1.a(max, 0.0f, 1.0f - n);
    }
    
    public static abm z(float n, float y, final List list) {
        final float min = Math.min(n / y, 1.0f);
        final float min2 = Math.min(y / n, 1.0f);
        final float n2 = (1.0f - min) / 2.0f;
        final float n3 = n = (1.0f - min2) / 2.0f;
        y = n2;
        if (!list.isEmpty()) {
            if (n2 == 0.0f) {
                n = n3;
                y = n2;
                if (n3 == 0.0f) {
                    return new abm(y, n, min + y, min2 + n);
                }
            }
            final umu umu = list.get(0);
            n = umu.c * umu.d;
            final Iterator iterator = list.iterator();
            umu umu2 = umu;
            while (iterator.hasNext()) {
                final umu umu3 = (umu)iterator.next();
                y = umu3.c * umu3.d;
                if (y > n) {
                    umu2 = umu3;
                    n = y;
                }
            }
            if (n3 != 0.0f) {
                n = umu2.b;
                n = y(umu2.d * 0.38f + n, min2, 1.0f - 2.0f * min2 / 3.0f);
                y = n2;
            }
            else {
                n = umu2.a;
                y = y(umu2.c * 0.5f + n, min, 0.5f);
                n = n3;
            }
        }
        return new abm(y, n, min + y, min2 + n);
    }
    
    public float C(final hl3 hl3) {
        return this.w(hl3).e;
    }
    
    public float E(final hl3 hl3) {
        return this.w(hl3).a;
    }
    
    public Set F(final Map.Entry entry, List y1) {
        y1 = or4.Y1((Collection)y1, entry.getKey());
        final Object g = ((oca)entry.getValue()).g(oca.J0);
        zzd.e(g, "current.value.get(EventN\u2026paceRuleNode.IS_TERMINAL)");
        Set k;
        if (g) {
            k = rqu.K((Object)y1);
        }
        else {
            final Object g2 = ((oca)entry.getValue()).g(oca.I0);
            zzd.e(g2, "current.value.get<Map<St\u2026mespaceRuleNode.CHILDREN)");
            final Map map = (Map)g2;
            k = new LinkedHashSet();
            final Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                mr4.n1((Collection)k, (Iterable)this.F((Map.Entry)iterator.next(), y1));
            }
        }
        return k;
    }
    
    public Object a() {
        final azy c = fzy.c;
        return dvz.D0.b().b();
    }
    
    public void a0(final hl3 hl3, final float e) {
        final gko w = this.w(hl3);
        final hl3 hl4 = (hl3)hl3;
        final boolean useCompatPadding = hl4.b.getUseCompatPadding();
        final boolean a = hl4.a();
        if (e != w.e || w.f != useCompatPadding || w.g != a) {
            w.e = e;
            w.f = useCompatPadding;
            w.g = a;
            w.c((Rect)null);
            ((Drawable)w).invalidateSelf();
        }
        this.d0(hl3);
    }
    
    public void d0(final hl3 hl3) {
        final hl3 hl4 = (hl3)hl3;
        if (!hl4.b.getUseCompatPadding()) {
            hl4.b(0, 0, 0, 0);
            return;
        }
        final float c = this.C(hl3);
        final float e = this.E(hl3);
        final int n = (int)Math.ceil(hko.a(c, e, hl4.a()));
        final int n2 = (int)Math.ceil(hko.b(c, e, hl4.a()));
        hl4.b(n, n2, n, n2);
    }
    
    public void k0(final ClassLoader classLoader, final Set set) {
        g0(classLoader, set, (aky)new zvj(7));
    }
    
    public Object n0(final o16 o16) {
        return new a(((rrm)o16).p((Class)a$a.class));
    }
    
    public int o(final int n) {
        return n;
    }
    
    public gko w(final hl3 hl3) {
        return (gko)((CardView.CardView$a)hl3).a;
    }
    
    public boolean x(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return h0(classLoader, file, file2, b);
    }
}
