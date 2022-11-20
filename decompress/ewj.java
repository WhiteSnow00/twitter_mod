import java.util.Set;
import java.io.File;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import com.twitter.weaver.mvi.MviViewModel;
import java.util.Collection;
import java.util.Iterator;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import android.graphics.Color;
import android.text.SpannableString;
import java.util.List;
import androidx.appcompat.app.a$a;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewj implements gry, dkv, ohy
{
    public static final int[] D0;
    public static final int[] E0;
    public static final ewj F0;
    
    static {
        D0 = new int[] { 2130971120 };
        E0 = new int[] { 2130969033 };
        F0 = new ewj();
    }
    
    public ewj() {
    }
    
    public ewj(final hai hai, final akx akx, final View view) {
        hai.d().M(view, new a$a(-1, -1));
        akx.b(view);
    }
    
    public static final SpannableString h(final String s, final String s2, List list, final List list2, final List list3) {
        czd.f((Object)s2, "hexColor");
        czd.f((Object)list, "highlightSpan");
        czd.f((Object)list2, "boldSpan");
        czd.f((Object)list3, "italicizeSpan");
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list = (List)iterator.next();
            if (k(list, spannableString)) {
                return spannableString;
            }
            spannableString.setSpan((Object)new ForegroundColorSpan(Color.parseColor(s2)), ((Number)list.get(0)).intValue(), ((Number)list.get(1)).intValue(), 33);
        }
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list = (List)iterator2.next();
            if (k(list, spannableString)) {
                return spannableString;
            }
            spannableString.setSpan((Object)new StyleSpan(1), ((Number)list.get(0)).intValue(), ((Number)list.get(1)).intValue(), 33);
        }
        for (final List list4 : list3) {
            if (k(list4, spannableString)) {
                return spannableString;
            }
            spannableString.setSpan((Object)new StyleSpan(2), ((Number)list4.get(0)).intValue(), ((Number)list4.get(1)).intValue(), 33);
        }
        return spannableString;
    }
    
    public static final boolean j(final hwv hwv) {
        return kwv.Companion.a().b(hwv) && l(hwv);
    }
    
    public static final boolean k(final List list, final SpannableString spannableString) {
        boolean b = false;
        if (list.get(0).intValue() > spannableString.length() || list.get(1).intValue() > spannableString.length()) {
            b = true;
        }
        return b;
    }
    
    public static final boolean l(final hwv hwv) {
        czd.f((Object)hwv, "unifiedCard");
        final ixv f = hwv.f;
        final boolean b = f instanceof x2s;
        final boolean b2 = true;
        final boolean b3 = b || f instanceof eq4;
        boolean b4 = b2;
        if (!b3) {
            final List<mwv> k = hwv.k;
            boolean b5 = false;
            Label_0123: {
                if (!(k instanceof Collection) || !k.isEmpty()) {
                    final Iterator iterator = k.iterator();
                    while (iterator.hasNext()) {
                        if (((mwv)iterator.next()).getName() == faa.O0) {
                            b5 = true;
                            break Label_0123;
                        }
                    }
                }
                b5 = false;
            }
            b4 = (b5 && b2);
        }
        return b4;
    }
    
    public static final hyh n(final MviViewModel mviViewModel, final qsb qsb) {
        czd.f((Object)mviViewModel, "<this>");
        czd.f((Object)qsb, "block");
        return new hyh(qsb);
    }
    
    public static int o(@NullableDecl final Object o, @NullableDecl final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, @NullableDecl final Object[] array3) {
        final int s0 = npe.s0(o);
        final int n2 = s0 & n;
        int p7 = p(o3, n2);
        if (p7 != 0) {
            final int n3 = ~n;
            int n4 = -1;
            while (true) {
                --p7;
                final int n5 = array[p7];
                if ((n5 & n3) == (s0 & n3) && ffz.I0(o, array2[p7]) && (array3 == null || ffz.I0(o2, array3[p7]))) {
                    final int n6 = n5 & n;
                    if (n4 == -1) {
                        r(o3, n2, n6);
                    }
                    else {
                        array[n4] = ((n6 & n) | (array[n4] & n3));
                    }
                    return p7;
                }
                final int n7 = n5 & n;
                if (n7 == 0) {
                    break;
                }
                n4 = p7;
                p7 = n7;
            }
        }
        return -1;
    }
    
    public static int p(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return (char)((short[])o)[n];
        }
        return ((int[])o)[n];
    }
    
    public static Object q(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            throw new IllegalArgumentException(jxa.p(52, "must be power of 2 between 2^1 and 2^30: ", n));
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    public static void r(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    @Override
    public /* bridge */ Object a() {
        return new rmy();
    }
    
    public void b(final ta4 ta4) {
        czd.f((Object)ta4, "classDescriptor");
    }
    
    public void c(final ta4 ta4) {
    }
    
    public bse d(final Collection collection) {
        czd.f((Object)collection, "types");
        final StringBuilder j = fu8.j("There should be no intersection type in existing descriptors, but found: ");
        j.append(mq4.m0((Iterable)collection, (CharSequence)null, (CharSequence)null, (CharSequence)null, (qsb)null, 63));
        throw new AssertionError((Object)j.toString());
    }
    
    public gfv e(final String s, final cgv cgv) {
        final gfv$a gfv$a = new gfv$a();
        gfv$a.a = Long.parseLong(s);
        gfv$a.T0 = chw.c0(cgv.I1);
        gfv$a.S0 = chw.d0(cgv.I1);
        return (gfv)((n4j)gfv$a).e();
    }
    
    public boolean f(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return rml.A(classLoader, file, file2, b);
    }
    
    public gfv g(final String s, final cgv cgv, final rii rii) {
        czd.f((Object)s, "id");
        czd.f((Object)cgv, "profileUser");
        czd.f((Object)rii, "newsletterSource");
        final gfv$a gfv$a = new gfv$a();
        gfv$a.a = Long.parseLong(s);
        gfv$a.T0 = chw.c0(cgv.I1);
        gfv$a.S0 = chw.d0(cgv.I1);
        final qii$a qii$a = new qii$a();
        qii$a.o(rii.D0);
        gfv$a.i1 = (qii)((n4j)qii$a).e();
        return (gfv)((n4j)gfv$a).e();
    }
    
    public void i(final ClassLoader classLoader, final Set set) {
        rml.z(classLoader, set, (rky)new xli());
    }
    
    public void m() {
        throw null;
    }
}
