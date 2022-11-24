import android.content.res.Resources;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.io.UnsupportedEncodingException;
import kotlin.NoWhenBranchMatchedException;
import java.io.IOException;
import com.google.android.play.core.internal.zzbt;
import java.util.HashSet;
import java.util.Locale;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import java.util.Collection;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Objects;
import tv.periscope.model.b;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.Iterator;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpz implements s3c, iiy, km2, c0z, k26
{
    public static qpz F0;
    public static duh G0;
    public static final v4s H0;
    public static final v4s I0;
    public static int J0;
    public static volatile jdi K0;
    public static volatile adi L0;
    public static final int[] M0;
    public static final tpz N0;
    public static final tpz O0;
    
    static {
        H0 = new v4s("NO_DECISION");
        I0 = new v4s("RETRY_ATOMIC");
        M0 = new int[] { 16842948, 16842987, 16842993, 2130969480, 2130969481, 2130969482, 2130969483, 2130969484, 2130969930, 2130970488, 2130970672, 2130970685 };
        N0 = new tpz();
        O0 = new tpz();
    }
    
    public tpz() {
    }
    
    public tpz(final pml pml, final f5j f5j) {
        f5j.a(pml, ita.c().b("android_growth_performance_holdback_perf_optimize_user_scope_initializers", false));
    }
    
    public static final bc4 A(final c7i c7i, final int n) {
        e0e.f((Object)c7i, "<this>");
        return bc4.f(c7i.b(n), c7i.a(n));
    }
    
    public static final mmo B(final jzd jzd) {
        final Object m = jzd.m();
        mmo mmo;
        if (m instanceof mmo) {
            mmo = (mmo)m;
        }
        else {
            mmo = null;
        }
        return mmo;
    }
    
    public static final File C(final Context context) {
        e0e.f((Object)context, "context");
        final File databasePath = context.getDatabasePath("androidx.work.workdb");
        e0e.e((Object)databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }
    
    public static final boolean D(final int n) {
        boolean b = true;
        if ((n & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public static Object E(final Iterable iterable, Object next) {
        final Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            next = iterator.next();
        }
        return next;
    }
    
    public static Object F(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            final Iterator iterator = iterable.iterator();
            Object next;
            do {
                next = iterator.next();
            } while (iterator.hasNext());
            return next;
        }
        final List list = (List)iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException();
    }
    
    public static final a7i G(final c7i c7i, final int n) {
        e0e.f((Object)c7i, "<this>");
        return a7i.g(c7i.getString(n));
    }
    
    public static String H(final mm3 mm3) {
        final int j = mm3.j;
        final String s = null;
        final String s2 = null;
        if (j == 1) {
            final b b = mm3.b;
            String w = s;
            if (b != null) {
                w = b.w();
            }
            return w;
        }
        if (j != 3) {
            return null;
        }
        final xnu g = mm3.g;
        String a = s2;
        if (g != null) {
            a = g.a;
        }
        return a;
    }
    
    public static final float I(final mmo mmo) {
        float a;
        if (mmo != null) {
            a = mmo.a;
        }
        else {
            a = 0.0f;
        }
        return a;
    }
    
    public static boolean J(final byte[] array, final byte[] array2, final int n) {
        Objects.requireNonNull(array2);
        if (array2.length + n > array.length) {
            return false;
        }
        for (int i = 0; i < array2.length; ++i) {
            if (array[n + i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static final int K(final SerialDescriptor serialDescriptor, final SerialDescriptor[] array) {
        e0e.f((Object)serialDescriptor, "<this>");
        e0e.f((Object)array, "typeParams");
        final int hashCode = serialDescriptor.h().hashCode();
        final int hashCode2 = Arrays.hashCode(array);
        int d = serialDescriptor.d();
        int n = 1;
        while (true) {
            final int n2 = 0;
            if (d <= 0) {
                break;
            }
            final String h = serialDescriptor.g(serialDescriptor.d() - d).h();
            int hashCode3 = n2;
            if (h != null) {
                hashCode3 = h.hashCode();
            }
            n = n * 31 + hashCode3;
            --d;
        }
        int i = serialDescriptor.d();
        int n3 = 1;
        while (i > 0) {
            final zlp j = serialDescriptor.g(serialDescriptor.d() - i).i();
            int hashCode4;
            if (j != null) {
                hashCode4 = j.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            n3 = n3 * 31 + hashCode4;
            --i;
        }
        return ((hashCode * 31 + hashCode2) * 31 + n) * 31 + n3;
    }
    
    public static final boolean L(final mne mne) {
        final boolean b = mne instanceof ooe;
        final boolean b2 = true;
        if (b) {
            final ape ape = (ape)mne;
            final Field a0 = jb2.a0(ape);
            if (a0 == null || a0.isAccessible()) {
                final Method b3 = jb2.b0((ioe)ape.f());
                if (b3 == null || b3.isAccessible()) {
                    final Method b4 = jb2.b0((ioe)((ooe)mne).g());
                    if (b4 == null || b4.isAccessible()) {
                        return b2;
                    }
                }
            }
        }
        else {
            final ape ape2 = (ape)mne;
            final Field a2 = jb2.a0(ape2);
            if (a2 == null || a2.isAccessible()) {
                final Method b6 = jb2.b0((ioe)ape2.f());
                if (b6 == null || b6.isAccessible()) {
                    return b2;
                }
            }
        }
        return false;
    }
    
    public static final boolean M(final aqk aqk) {
        e0e.f((Object)aqk, "<this>");
        return ((en8)aqk).l().L0;
    }
    
    public static boolean N() {
        return ita.b().b("media_autoplay_android_enabled", false);
    }
    
    public static final void O(final Context context) {
        e0e.f((Object)context, "context");
        final File c = C(context);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23 && c.exists()) {
            jag.e().a(xrx.a, "Migrating WorkDatabase to the no-backup directory");
            Object o;
            if (sdk_INT >= 23) {
                final File c2 = C(context);
                File c3;
                if (sdk_INT < 23) {
                    c3 = C(context);
                }
                else {
                    c3 = new File(he0.a.a(context), "androidx.work.workdb");
                }
                final String[] b = xrx.b;
                int e;
                if ((e = vmw.E(b.length)) < 16) {
                    e = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (int i = 0; i < b.length; ++i) {
                    final String s = b[i];
                    final StringBuilder sb = new StringBuilder();
                    sb.append(c2.getPath());
                    sb.append(s);
                    final File file = new File(sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(c3.getPath());
                    sb2.append(s);
                    linkedHashMap.put((Object)file, (Object)new File(sb2.toString()));
                }
                o = mlg.W((Map)linkedHashMap, new awj((Object)c2, (Object)c3));
            }
            else {
                o = m3a.F0;
            }
            for (final Map.Entry<File, V> entry : ((Map)o).entrySet()) {
                final File file2 = entry.getKey();
                final File file3 = (File)entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        final jag e2 = jag.e();
                        final String a = xrx.a;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Over-writing contents of ");
                        sb3.append(file3);
                        e2.h(a, sb3.toString());
                    }
                    String s2;
                    if (file2.renameTo(file3)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Migrated ");
                        sb4.append(file2);
                        sb4.append("to ");
                        sb4.append(file3);
                        s2 = sb4.toString();
                    }
                    else {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Renaming ");
                        sb5.append(file2);
                        sb5.append(" to ");
                        sb5.append(file3);
                        sb5.append(" failed");
                        s2 = sb5.toString();
                    }
                    jag.e().a(xrx.a, s2);
                }
            }
        }
    }
    
    public static final yse P(final yse yse, final List list) {
        yse.K0().size();
        list.size();
        final ArrayList list2 = new ArrayList(nr4.d1((Iterable)list, 10));
        for (final tjv tjv : list) {
            final upw j0 = upw.J0;
            Objects.requireNonNull(tjv);
            zse.a.d(tjv.b, tjv.c);
            clv clv = null;
            Label_0231: {
                if (!e0e.a((Object)tjv.b, (Object)tjv.c)) {
                    final upw z = tjv.a.z();
                    final upw i0 = upw.I0;
                    if (z != i0) {
                        if (mse.H(tjv.b) && tjv.a.z() != i0) {
                            clv = new clv(X(tjv, j0), tjv.c);
                            break Label_0231;
                        }
                        if (mse.I(tjv.c)) {
                            clv = new clv(X(tjv, i0), tjv.b);
                            break Label_0231;
                        }
                        clv = new clv(X(tjv, j0), tjv.c);
                        break Label_0231;
                    }
                }
                clv = new clv(tjv.b);
            }
            list2.add(clv);
        }
        return bs4.f0(yse, list2, null, 6);
    }
    
    public static final zqg Q(final int n, final oub oub, final float n2, final t77 t77) {
        mqb.n(n, "orientation");
        e0e.f((Object)oub, "arrangement");
        mqb.n(1, "crossAxisSize");
        return new lmo(n, n2, oub, t77);
    }
    
    public static final boolean R(final List list) {
        e0e.f((Object)list, "attachments");
        final boolean empty = list.isEmpty();
        boolean b = true;
        if (!empty) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final jx9 b2 = ((x99)iterator.next()).b(2);
                boolean b3 = false;
                Label_0120: {
                    if (b2 instanceof ex9) {
                        final ex9 ex9 = (ex9)b2;
                        final String r0 = ex9.R0;
                        if (r0 != null && !slr.k1((CharSequence)r0) && !ex9.K0) {
                            b3 = true;
                            break Label_0120;
                        }
                    }
                    b3 = false;
                }
                if (b3) {
                    return b;
                }
            }
        }
        b = false;
        return b;
    }
    
    public static void S(final List list, final muk muk, final int n, final int n2) {
        int size = list.size();
        int n4;
        while (true) {
            final int n3 = size - 1;
            if (n3 <= (n4 = n2)) {
                break;
            }
            size = n3;
            if (!muk.apply(list.get(n3))) {
                continue;
            }
            list.remove(n3);
            size = n3;
        }
        while (--n4 >= n) {
            list.remove(n4);
        }
    }
    
    public static String T(final int n) {
        return rnw.m("rgba(%d,%d,%d,%.3f)", new Object[] { Color.red(n), Color.green(n), Color.blue(n), Color.alpha(n) / 255.0 });
    }
    
    public static final Set U(final Collection collection) {
        e0e.f((Object)collection, "<this>");
        final ArrayList list = new ArrayList(nr4.d1((Iterable)collection, 10));
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(((AudioSpaceTopicItem)iterator.next()).getCategoryId());
        }
        return rr4.n2((Iterable)list);
    }
    
    public static final Locale V(final q5g q5g) {
        e0e.f((Object)q5g, "<this>");
        final eik a = q5g.a;
        e0e.d((Object)a, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((o40)a).a;
    }
    
    public static String W(final String s) {
        return c0e.h("ModelUrl(url=", s, ")");
    }
    
    public static final upw X(final tjv tjv, final upw upw) {
        upw h0 = upw;
        if (upw == tjv.a.z()) {
            h0 = upw.H0;
        }
        return h0;
    }
    
    public static final int Y(final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final boolean b7, final boolean b8) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        int n2 = n;
        if (b2) {
            n2 = (n | 0x2);
        }
        int n3 = n2;
        if (b3) {
            n3 = (n2 | 0x1);
        }
        int n4 = n3;
        if (b4) {
            n4 = (n3 | 0x10);
        }
        int n5 = n4;
        if (b6) {
            n5 = (n4 | 0x80);
        }
        int n6 = n5;
        if (b7) {
            n6 = (n5 | 0x4);
        }
        int n7 = n6;
        if (b8) {
            n7 = (n6 | 0x40);
        }
        int n8 = n7;
        if (b5) {
            n8 = (n7 | 0x20);
        }
        return n8;
    }
    
    public static woz Z(final String a) {
        synchronized (tpz.class) {
            final jnz jnz = new jnz();
            Objects.requireNonNull(a, "Null libraryName");
            jnz.a = a;
            jnz.b = Boolean.TRUE;
            jnz.c = 1;
            final rnz a2 = jnz.a();
            synchronized (tpz.class) {
                if (tpz.F0 == null) {
                    tpz.F0 = new qpz();
                }
                return (woz)((mze<rnz, Object>)tpz.F0).b(a2);
            }
        }
    }
    
    public static void a0(final ClassLoader classLoader, final Set set, final kly kly) {
        if (set.isEmpty()) {
            return;
        }
        final HashSet set2 = new HashSet();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            set2.add(((File)iterator.next()).getParentFile());
        }
        final Object i = kny.i(classLoader);
        final esa e0 = d4j.E0(i, "nativeLibraryDirectories", (Class)List.class);
        synchronized (qsz.class) {
            final ArrayList list = new ArrayList((Collection<?>)e0.c());
            set2.removeAll(list);
            list.addAll(set2);
            e0.d((Object)list);
            monitorexit(qsz.class);
            final ArrayList list2 = new ArrayList();
            final Object[] c = kly.c(i, (List)new ArrayList(set2), (List)list2);
            if (!list2.isEmpty()) {
                final zzbt zzbt = new zzbt("Error in makePathElements");
                for (int size = list2.size(), j = 0; j < size; ++j) {
                    final IOException ex = list2.get(j);
                }
                throw zzbt;
            }
            synchronized (qsz.class) {
                new cny(i, d4j.I0(i, "nativeLibraryPathElements"), (Class)Object.class).f((Collection)Arrays.asList(c));
            }
        }
    }
    
    public static boolean b0(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return kny.l(classLoader, file, file2, b, (qky)new r1n(), "zip", (lky)new qsz());
    }
    
    public static void o(final int n) {
        final Object[] array = new Object[3];
        switch (n) {
            default: {
                array[0] = "a";
                break;
            }
            case 9: {
                array[0] = "typeProjection";
                break;
            }
            case 8: {
                array[0] = "type";
                break;
            }
            case 6:
            case 11: {
                array[0] = "supertype";
                break;
            }
            case 5:
            case 10: {
                array[0] = "subtype";
                break;
            }
            case 2:
            case 7: {
                array[0] = "typeCheckingProcedure";
                break;
            }
            case 1:
            case 4: {
                array[0] = "b";
                break;
            }
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n) {
            default: {
                array[2] = "assertEqualTypes";
                break;
            }
            case 10:
            case 11: {
                array[2] = "noCorrespondingSupertype";
                break;
            }
            case 8:
            case 9: {
                array[2] = "capture";
                break;
            }
            case 5:
            case 6:
            case 7: {
                array[2] = "assertSubtype";
                break;
            }
            case 3:
            case 4: {
                array[2] = "assertEqualTypeConstructors";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public static final int p(final List list, final hub hub, final hub hub2, int n, int n2, int i, int j) {
        final int n3 = 1;
        final int n4 = 0;
        if (i == j) {
            final int size = list.size();
            j = 0;
            int n5 = 0;
            float n6 = 0.0f;
            i = 0;
            while (j < size) {
                final jzd jzd = list.get(j);
                final float k = I(B(jzd));
                final int intValue = ((Number)hub.invoke((Object)jzd, (Object)n)).intValue();
                int n7;
                float n8;
                int max;
                if (k == 0.0f) {
                    n7 = i + intValue;
                    n8 = n6;
                    max = n5;
                }
                else {
                    n8 = n6;
                    n7 = i;
                    max = n5;
                    if (k > 0.0f) {
                        n8 = n6 + k;
                        max = Math.max(n5, jb2.B0(intValue / k));
                        n7 = i;
                    }
                }
                ++j;
                n6 = n8;
                i = n7;
                n5 = max;
            }
            n = jb2.B0(n5 * n6);
            n2 = (list.size() - 1) * n2 + (n + i);
        }
        else {
            i = Math.min((list.size() - 1) * n2, n);
            final int size2 = list.size();
            j = 0;
            float n9 = 0.0f;
            n2 = 0;
            while (j < size2) {
                final jzd jzd2 = list.get(j);
                final float l = I(B(jzd2));
                int n10;
                int max2;
                float n11;
                if (l == 0.0f) {
                    final int min = Math.min(((Number)hub2.invoke((Object)jzd2, (Object)Integer.MAX_VALUE)).intValue(), n - i);
                    n10 = i + min;
                    max2 = Math.max(n2, ((Number)hub.invoke((Object)jzd2, (Object)min)).intValue());
                    n11 = n9;
                }
                else {
                    n11 = n9;
                    max2 = n2;
                    n10 = i;
                    if (l > 0.0f) {
                        n11 = n9 + l;
                        n10 = i;
                        max2 = n2;
                    }
                }
                ++j;
                n9 = n11;
                n2 = max2;
                i = n10;
            }
            if (n9 == 0.0f) {
                j = n3;
            }
            else {
                j = 0;
            }
            if (j != 0) {
                n = 0;
            }
            else if (n == Integer.MAX_VALUE) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = jb2.B0(Math.max(n - i, 0) / n9);
            }
            int size3;
            jzd jzd3;
            float m;
            for (size3 = list.size(), i = n4; i < size3; ++i, n2 = j) {
                jzd3 = list.get(i);
                m = I(B(jzd3));
                j = n2;
                if (m > 0.0f) {
                    if (n != Integer.MAX_VALUE) {
                        j = jb2.B0(n * m);
                    }
                    else {
                        j = Integer.MAX_VALUE;
                    }
                    j = Math.max(n2, ((Number)hub.invoke((Object)jzd3, (Object)j)).intValue());
                }
            }
        }
        return n2;
    }
    
    public static final Object q(final en8 en8, final int n) {
        final dlh.c j0 = en8.l().J0;
        if (j0 != null) {
            Object j2 = j0;
            if ((j0.H0 & n) != 0x0) {
                while (j2 != null) {
                    final int g0 = ((dlh.c)j2).G0;
                    if ((g0 & 0x2) != 0x0) {
                        break;
                    }
                    if ((g0 & n) != 0x0) {
                        return j2;
                    }
                    j2 = ((dlh.c)j2).J0;
                }
            }
        }
        return null;
    }
    
    public static final int r(final khk khk, int n) {
        if (n == 1) {
            n = khk.F0;
        }
        else {
            n = khk.G0;
        }
        return n;
    }
    
    public static final ur0 s(yse k) {
        e0e.f((Object)k, "type");
        if (qsz.p(k)) {
            final ur0 s = s((yse)qsz.s(k));
            final ur0 s2 = s((yse)qsz.y(k));
            return new ur0((Object)fr0.G(ate.c(qsz.s((yse)s.a), qsz.y((yse)s2.a)), k), (Object)fr0.G(ate.c(qsz.s((yse)s.b), qsz.y((yse)s2.b)), k));
        }
        final akv m0 = k.M0();
        final boolean b = li3.b(k);
        boolean b2 = true;
        if (b) {
            e0e.d((Object)m0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            final alv c = ((ji3)m0).c();
            final yse type = c.getType();
            e0e.e((Object)type, "typeProjection.type");
            final yse i = olv.k(type, k.N0());
            e0e.e((Object)i, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            final int ordinal = ((Enum)c.c()).ordinal();
            ur0 ur0;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Only nontrivial projections should have been captured, not: ");
                    sb.append(c);
                    throw new AssertionError((Object)sb.toString());
                }
                final raq p = dfv.h(k).p();
                e0e.e((Object)p, "type.builtIns.nothingType");
                k = olv.k((yse)p, k.N0());
                e0e.e((Object)k, "makeNullableIfNeeded(this, type.isMarkedNullable)");
                ur0 = new ur0((Object)k, (Object)i);
            }
            else {
                final raq q = dfv.h(k).q();
                e0e.e((Object)q, "type.builtIns.nullableAnyType");
                ur0 = new ur0((Object)i, (Object)q);
            }
            return ur0;
        }
        if (!k.K0().isEmpty() && k.K0().size() == m0.getParameters().size()) {
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            final List k2 = k.K0();
            final List parameters = m0.getParameters();
            e0e.e((Object)parameters, "typeConstructor.parameters");
            for (final awj awj : (ArrayList)rr4.q2((Iterable)k2, (Iterable)parameters)) {
                final alv alv = (alv)awj.F0;
                final rkv rkv = (rkv)awj.G0;
                e0e.e((Object)rkv, "typeParameter");
                final upw z = rkv.z();
                final jlv b3 = jlv.b;
                if (z == null) {
                    jlv.a(35);
                    throw null;
                }
                if (alv == null) {
                    jlv.a(36);
                    throw null;
                }
                upw upw;
                if (alv.b()) {
                    upw = upw.J0;
                }
                else {
                    upw = jlv.b(z, alv.c());
                }
                final int ordinal2 = ((Enum)upw).ordinal();
                tjv tjv;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final raq p2 = er8.e((kc8)rkv).p();
                        e0e.e((Object)p2, "typeParameter.builtIns.nothingType");
                        final yse type2 = alv.getType();
                        e0e.e((Object)type2, "type");
                        tjv = new tjv(rkv, (yse)p2, type2);
                    }
                    else {
                        final yse type3 = alv.getType();
                        e0e.e((Object)type3, "type");
                        final raq q2 = er8.e((kc8)rkv).q();
                        e0e.e((Object)q2, "typeParameter.builtIns.nullableAnyType");
                        tjv = new tjv(rkv, type3, (yse)q2);
                    }
                }
                else {
                    final yse type4 = alv.getType();
                    e0e.e((Object)type4, "type");
                    final yse type5 = alv.getType();
                    e0e.e((Object)type5, "type");
                    tjv = new tjv(rkv, type4, type5);
                }
                if (alv.b()) {
                    list.add(tjv);
                    list2.add(tjv);
                }
                else {
                    final ur0 s3 = s(tjv.b);
                    final yse yse = (yse)s3.a;
                    final yse yse2 = (yse)s3.b;
                    final ur0 s4 = s(tjv.c);
                    final yse yse3 = (yse)s4.a;
                    final yse yse4 = (yse)s4.b;
                    final tjv tjv2 = new tjv(tjv.a, yse2, yse3);
                    final tjv tjv3 = new tjv(tjv.a, yse, yse4);
                    list.add(tjv2);
                    list2.add(tjv3);
                }
            }
            Label_0917: {
                if (!list.isEmpty()) {
                    for (final tjv tjv4 : list) {
                        Objects.requireNonNull(tjv4);
                        if (zse.a.d(tjv4.b, tjv4.c) ^ true) {
                            break Label_0917;
                        }
                    }
                }
                b2 = false;
            }
            Object o;
            if (b2) {
                o = dfv.h(k).p();
                e0e.e(o, "type.builtIns.nothingType");
            }
            else {
                o = P(k, list);
            }
            return new ur0(o, (Object)P(k, list2));
        }
        return new ur0((Object)k, (Object)k);
    }
    
    public static byte[] t(final String s) {
        try {
            return s.getBytes("ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException("ASCII not found!", ex);
        }
    }
    
    public static final int v(final float n) {
        return (int)(float)Math.ceil(n);
    }
    
    public static mgt w(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final int n) {
        final mgt mgt = new mgt((ToggleTwitterButton)layoutInflater.inflate(n, viewGroup, false));
        mgt.b(2131954794);
        return mgt;
    }
    
    public static String x(final String s) {
        final StringBuilder k = tf8.k(l58.g(s, l58.g(s, 5)), ".", s, ",.", s);
        k.append(" *");
        return k.toString();
    }
    
    public static void y() {
        final int j0 = tpz.J0;
        if (j0 > 0) {
            tpz.J0 = j0 - 1;
        }
    }
    
    public static final CharSequence z(final Context context, final List list) {
        e0e.f((Object)context, "context");
        e0e.f((Object)list, "attachments");
        final Resources resources = context.getResources();
        final boolean empty = list.isEmpty();
        int n = 0;
        int n2 = 0;
        if (!empty) {
            final Iterator iterator = list.iterator();
            while (true) {
                n = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                if (!(((x99)iterator.next()).b(2) instanceof ex9)) {
                    continue;
                }
                if (++n2 >= 0) {
                    continue;
                }
                shw.T0();
                throw null;
            }
        }
        final CharSequence quantityText = resources.getQuantityText(2131820588, n);
        e0e.e((Object)quantityText, "context.resources.getQua\u2026EditableImage }\n        )");
        return quantityText;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().o();
    }
    
    public t5j b(final String s) {
        return t5j.empty();
    }
    
    public t5j c(final String s) {
        return t5j.empty();
    }
    
    public boolean d(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return b0(classLoader, file, file2, b);
    }
    
    public boolean e() {
        return true;
    }
    
    public t5j f(final String s) {
        return t5j.empty();
    }
    
    public t5j g(final String s) {
        return t5j.empty();
    }
    
    public t5j h(final String s) {
        return t5j.empty();
    }
    
    public void i() {
    }
    
    public void j() {
    }
    
    public void k(final ClassLoader classLoader, final Set set) {
        a0(classLoader, set, (kly)new twj(7));
    }
    
    public String l(final Integer n) {
        return "";
    }
    
    public Object m(final e26 e26) {
        final tc4 tc4 = (tc4)((xsm)e26).f((Class)tc4.class);
        return new xi4();
    }
    
    public boolean n() {
        return true;
    }
    
    public boolean u(final akv akv, final akv akv2) {
        if (akv == null) {
            o(3);
            throw null;
        }
        if (akv2 != null) {
            return akv.equals(akv2);
        }
        o(4);
        throw null;
    }
}
