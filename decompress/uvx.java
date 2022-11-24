import java.io.File;
import java.util.Iterator;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uvx implements iiy, qur, c0z
{
    public static volatile Integer F0;
    public static final int[] G0;
    public static final uvx H0;
    public static final uvx I0;
    
    static {
        G0 = new int[] { 2130968694, 2130970131, 2130970132, 2130970133, 2130970162, 2130970483, 2130970516 };
        H0 = new uvx();
        I0 = new uvx();
    }
    
    public static int b(final Context context) {
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        final long totalMem = activityManager$MemoryInfo.totalMem;
        final int n = 2014;
        final int n2 = 2013;
        int n3 = 2011;
        if (totalMem == -1L) {
            final ArrayList list = new ArrayList();
            final int d = pu8.d();
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
            c(list, n5);
            final long n6 = pu8.b();
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
            c(list, n7);
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
            c(list, n8);
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
            if (pu8.d() <= 1) {
                n10 = 2009;
            }
            else {
                n10 = 2010;
            }
            return n10;
        }
        if (totalMem <= 1073741824L) {
            if (pu8.b() >= 1300000) {
                n3 = 2012;
            }
            return n3;
        }
        if (totalMem <= 1610612736L) {
            int n11 = n2;
            if (pu8.b() < 1800000) {
                n11 = 2012;
            }
            return n11;
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
    
    public static void c(final ArrayList list, final int n) {
        if (n != -1) {
            list.add(n);
        }
    }
    
    public static final dfb f(dfb j0) {
        final int ordinal = ((Enum)j0.I0).ordinal();
        dfb f = j0;
        if (ordinal != 0) {
            Label_0057: {
                if (ordinal != 1) {
                    f = j0;
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                break Label_0057;
                            }
                            if (ordinal != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        f = null;
                        return f;
                    }
                    return f;
                }
            }
            j0 = j0.J0;
            if (j0 != null) {
                f = f(j0);
                if (f != null) {
                    return f;
                }
            }
            throw new IllegalStateException("no child".toString());
        }
        return f;
    }
    
    public static final awj g(final Set set, final Map map) {
        e0e.f((Object)map, "inviteTotals");
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final Object next : set) {
            final Integer n = map.get(((CohostInvite)next).getTwitterId());
            boolean b = false;
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            final vjo a = vjo.a;
            if (intValue < ita.b().f("android_audio_room_max_cohost_invites", 5)) {
                b = true;
            }
            if (b) {
                list.add(next);
            }
            else {
                list2.add(next);
            }
        }
        return new awj((Object)list, (Object)list2);
    }
    
    public static final void h(final dfb dfb) {
        lfb.b(dfb);
        final ivh<dfb> h0 = dfb.H0;
        final int h2 = h0.H0;
        if (h2 > 0) {
            int n = 0;
            final Object[] f0 = h0.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                h((dfb)f0[n]);
            } while (++n < h2);
        }
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return gtz.G0.b().d();
    }
    
    public boolean d(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return kny.l(classLoader, file, file2, b, (qky)new r1n(), "path", new llg());
    }
    
    public mcs e(final Object o) {
        final Map map = (Map)o;
        final int c = r5c.c;
        return mds.e((Object)null);
    }
    
    public void k(final ClassLoader classLoader, final Set set) {
        tpz.a0(classLoader, set, (kly)new p4j());
    }
}
