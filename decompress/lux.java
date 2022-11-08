import java.io.File;
import java.util.Set;
import android.os.IInterface;
import android.os.IBinder;
import java.util.Iterator;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import android.graphics.Color;
import android.text.SpannableString;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.Context;
import kotlinx.coroutines.flow.internal.AbortFlowException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lux implements ygy, pyy, sdy
{
    public static volatile Integer C0;
    public static final int[] D0;
    
    public static final void c(final h8b c0, final Object o, final ap6 ap6) {
        h9b h9b2 = null;
        Label_0049: {
            if (ap6 instanceof h9b) {
                final h9b h9b = (h9b)ap6;
                final int e0 = h9b.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    h9b.E0 = e0 + Integer.MIN_VALUE;
                    h9b2 = h9b;
                    break Label_0049;
                }
            }
            h9b2 = new h9b(ap6);
        }
        final Object d0 = h9b2.D0;
        final zy6 c2 = zy6.C0;
        final int e2 = h9b2.E0;
        h8b c3;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3 = h9b2.C0;
            kq9.b1(d0);
        }
        else {
            kq9.b1(d0);
            h9b2.C0 = c0;
            h9b2.E0 = 1;
            c3 = c0;
            if (c0.a(o, (ap6)h9b2) == c2) {
                return;
            }
        }
        throw new AbortFlowException(c3);
    }
    
    public static int d(final Context context) {
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        final long totalMem = activityManager$MemoryInfo.totalMem;
        final int n = 2014;
        int n2 = 2013;
        final int n3 = 2011;
        if (totalMem == -1L) {
            final ArrayList list = new ArrayList();
            final int d = au8.d();
            final int n4 = -1;
            int n5;
            if (d < 1) {
                n5 = -1;
            }
            else if (d == 1) {
                n5 = 2008;
            }
            else if (d <= 3) {
                n5 = 2011;
            }
            else {
                n5 = 2012;
            }
            e(list, n5);
            final long n6 = au8.b();
            int n7;
            if (n6 == -1L) {
                n7 = -1;
            }
            else if (n6 <= 528000L) {
                n7 = 2008;
            }
            else if (n6 <= 620000L) {
                n7 = 2009;
            }
            else if (n6 <= 1020000L) {
                n7 = 2010;
            }
            else if (n6 <= 1220000L) {
                n7 = 2011;
            }
            else if (n6 <= 1520000L) {
                n7 = 2012;
            }
            else if (n6 <= 2020000L) {
                n7 = 2013;
            }
            else {
                n7 = 2014;
            }
            e(list, n7);
            final ActivityManager$MemoryInfo activityManager$MemoryInfo2 = new ActivityManager$MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo2);
            final long totalMem2 = activityManager$MemoryInfo2.totalMem;
            int n8;
            if (totalMem2 <= 0L) {
                n8 = -1;
            }
            else if (totalMem2 <= 201326592L) {
                n8 = 2008;
            }
            else if (totalMem2 <= 304087040L) {
                n8 = 2009;
            }
            else if (totalMem2 <= 536870912L) {
                n8 = 2010;
            }
            else if (totalMem2 <= 1073741824L) {
                n8 = 2011;
            }
            else if (totalMem2 <= 1610612736L) {
                n8 = 2012;
            }
            else {
                n8 = n;
                if (totalMem2 <= 2147483648L) {
                    n8 = 2013;
                }
            }
            e(list, n8);
            int intValue;
            if (list.isEmpty()) {
                intValue = n4;
            }
            else {
                Collections.sort((List<Comparable>)list);
                if ((list.size() & 0x1) == 0x1) {
                    intValue = list.get(list.size() / 2);
                }
                else {
                    final int n9 = list.size() / 2 - 1;
                    intValue = ((int)list.get(n9 + 1) - (int)list.get(n9)) / 2 + (int)list.get(n9);
                }
            }
            return intValue;
        }
        if (totalMem <= 805306368L) {
            int n10;
            if (au8.d() <= 1) {
                n10 = 2009;
            }
            else {
                n10 = 2010;
            }
            return n10;
        }
        if (totalMem <= 1073741824L) {
            int n11;
            if (au8.b() < 1300000) {
                n11 = n3;
            }
            else {
                n11 = 2012;
            }
            return n11;
        }
        if (totalMem <= 1610612736L) {
            if (au8.b() < 1800000) {
                n2 = 2012;
            }
            return n2;
        }
        if (totalMem <= 2147483648L) {
            return 2013;
        }
        if (totalMem <= 3221225472L) {
            return 2014;
        }
        int n12;
        if (totalMem <= 5368709120L) {
            n12 = 2015;
        }
        else {
            n12 = 2016;
        }
        return n12;
    }
    
    public static void e(final ArrayList list, final int n) {
        if (n != -1) {
            list.add(n);
        }
    }
    
    public static final SpannableString f(final String s, final String s2, final List list, final List list2, final List list3) {
        zzd.f((Object)s2, "hexColor");
        zzd.f((Object)list, "highlightSpan");
        zzd.f((Object)list2, "boldSpan");
        zzd.f((Object)list3, "italicizeSpan");
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        for (final List list4 : list) {
            if (g(list4, spannableString)) {
                return spannableString;
            }
            spannableString.setSpan((Object)new ForegroundColorSpan(Color.parseColor(s2)), ((Number)list4.get(0)).intValue(), ((Number)list4.get(1)).intValue(), 33);
        }
        for (final List list5 : list2) {
            if (g(list5, spannableString)) {
                return spannableString;
            }
            spannableString.setSpan((Object)new StyleSpan(1), ((Number)list5.get(0)).intValue(), ((Number)list5.get(1)).intValue(), 33);
        }
        for (final List list6 : list3) {
            if (g(list6, spannableString)) {
                return spannableString;
            }
            spannableString.setSpan((Object)new StyleSpan(2), ((Number)list6.get(0)).intValue(), ((Number)list6.get(1)).intValue(), 33);
        }
        return spannableString;
    }
    
    public static final boolean g(final List list, final SpannableString spannableString) {
        boolean b = false;
        if (list.get(0).intValue() > spannableString.length() || list.get(1).intValue() > spannableString.length()) {
            b = true;
        }
        return b;
    }
    
    public static RuntimeException h(final Throwable t) {
        i(t);
        throw new RuntimeException(t);
    }
    
    public static void i(final Throwable t) {
        if (Error.class.isInstance(t)) {
            throw Error.class.cast(t);
        }
        if (!RuntimeException.class.isInstance(t)) {
            return;
        }
        throw RuntimeException.class.cast(t);
    }
    
    public static final void j(final nca nca) {
        zzd.f((Object)nca, "eventNamespace");
        saw.b((okm)new zf4(nca));
    }
    
    public static String l(final String s) {
        return zi.y("ModelUrl(url=", s, ")");
    }
    
    public Object a() {
        final azy c = fzy.c;
        return (int)fsz.D0.b().u();
    }
    
    public Object b(final IBinder binder) {
        final int a = qsz.a;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof iuz) {
                o = queryLocalInterface;
            }
            else {
                o = new brz(binder);
            }
        }
        return o;
    }
    
    public void k0(final ClassLoader classLoader, final Set set) {
        oyz.g0(classLoader, set, (aky)new vqb());
    }
    
    public boolean x(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return amy.R(classLoader, file, file2, b, (gjy)new dml(), "path", (bjy)new ca7());
    }
}
