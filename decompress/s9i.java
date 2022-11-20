import android.content.Context;
import tv.periscope.android.api.Constants;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import java.util.Iterator;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import kotlinx.serialization.SerializationException;
import kotlin.reflect.KClass;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class s9i implements fzy
{
    public static t9i D0;
    public static final s9i E0;
    public static final s9i F0;
    
    static {
        E0 = new s9i();
        F0 = new s9i();
    }
    
    public static final Object A(final View view, final Object o) {
        if (o == null) {
            view.setVisibility(8);
        }
        else {
            view.setVisibility(0);
        }
        return o;
    }
    
    public static final List B(final Iterable iterable) {
        czd.f((Object)iterable, "<this>");
        final List o0 = mq4.O0(iterable);
        Collections.shuffle(o0);
        return o0;
    }
    
    public static long C(final InputStream inputStream, final long n) throws IOException {
        fli.m(Boolean.valueOf(n >= 0L));
        long n2 = n;
        long n3;
        while (true) {
            n3 = n;
            if (n2 <= 0L) {
                break;
            }
            long skip = inputStream.skip(n2);
            if (skip <= 0L) {
                if (inputStream.read() == -1) {
                    n3 = n - n2;
                    break;
                }
                skip = 1L;
            }
            n2 -= skip;
        }
        return n3;
    }
    
    public static final void D() {
        throw new ArithmeticException("Count overflow has happened.");
    }
    
    public static final void E() {
        throw new ArithmeticException("Index overflow has happened.");
    }
    
    public static final Void F(String s, final KClass kClass) {
        czd.f((Object)kClass, "baseClass");
        final StringBuilder sb = new StringBuilder();
        sb.append("in the scope of '");
        sb.append(kClass.o());
        sb.append('\'');
        final String string = sb.toString();
        if (s == null) {
            s = hmg.h("Class discriminator was missing and no default polymorphic serializers were registered ", string);
        }
        else {
            s = zh8.o("Class '", s, "' is not registered for polymorphic serialization ", string, ".\nMark the base class as 'sealed' or register the serializer explicitly.");
        }
        throw new SerializationException(s);
    }
    
    public static String G(final String s, final String s2, final String s3) {
        final String j = pbu.c().j("periscope_api_environment", "Production");
        Objects.requireNonNull(j);
        if (j.equals("Dev")) {
            return s;
        }
        if (!j.equals("Canary")) {
            return s3;
        }
        return s2;
    }
    
    public static final ArrayList b(final Object... array) {
        ArrayList list;
        if (array.length == 0) {
            list = new ArrayList();
        }
        else {
            list = new ArrayList((Collection<? extends E>)new gs0(array, true));
        }
        return list;
    }
    
    public static final int c(final List list, int i, int n, final qsb qsb) {
        czd.f((Object)list, "<this>");
        y(list.size(), i, n);
        --n;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final int intValue = ((Number)qsb.invoke(list.get(n2))).intValue();
            if (intValue < 0) {
                i = n2 + 1;
            }
            else {
                if (intValue <= 0) {
                    return n2;
                }
                n = n2 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static int d(final List list, final Comparable comparable) {
        int i = 0;
        int size = list.size();
        czd.f((Object)list, "<this>");
        y(list.size(), 0, size);
        --size;
        while (i <= size) {
            final int n = i + size >>> 1;
            final int b = pev.b((Comparable)list.get(n), comparable);
            if (b < 0) {
                i = n + 1;
            }
            else {
                final int n2 = n;
                if (b <= 0) {
                    return n2;
                }
                size = n - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final List e(final List list) {
        final sif sif = (sif)list;
        if (sif.H0 == null) {
            sif.j();
            sif.G0 = true;
            return (List)sif;
        }
        throw new IllegalStateException();
    }
    
    public static Set f(final String s, final String s2) {
        czd.f((Object)s, "twitterId");
        return rp9.H0(new CohostInvite(s, "", "", s2));
    }
    
    public static final rjv g(final ta4 ta4, final ta4 ta5) {
        czd.f((Object)ta5, "to");
        ta4.q().size();
        ta5.q().size();
        final rjv$a companion = rjv.Companion;
        final List q = ta4.q();
        czd.e((Object)q, "from.declaredTypeParameters");
        final ArrayList list = new ArrayList<ojv>(iq4.H((Iterable)q, 10));
        final Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            list.add(((fkv)iterator.next()).j());
        }
        final List q2 = ta5.q();
        czd.e((Object)q2, "to.declaredTypeParameters");
        final ArrayList list2 = new ArrayList<okv>(iq4.H((Iterable)q2, 10));
        final Iterator iterator2 = q2.iterator();
        while (iterator2.hasNext()) {
            final u9q p2 = ((lb4)iterator2.next()).p();
            czd.e((Object)p2, "it.defaultType");
            list2.add(q3j.o((bse)p2));
        }
        return rjv$a.c(companion, tkg.u0((Iterable)mq4.U0((Iterable)list, (Iterable)list2)));
    }
    
    public static final long h(long n, final long n2, final long n3, final x66 x66) {
        final n96$b a = n96.a;
        final int ordinal = ((Enum)((dpc)x66.m((wd6)ipc.a)).l()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n = n3;
            }
            else {
                n = n2;
            }
        }
        return n;
    }
    
    public static final String i(final Set set, final String s) {
        czd.f((Object)set, "<this>");
        String s2;
        if (set.size() == 1) {
            s2 = ((CohostInvite)mq4.f0((Iterable)set)).getDisplayName();
        }
        else {
            final ArrayList list = new ArrayList(iq4.H((Iterable)set, 10));
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                list.add(((CohostInvite)iterator.next()).getDisplayName());
            }
            s2 = mq4.m0((Iterable)list, (CharSequence)s, (CharSequence)null, (CharSequence)null, (qsb)null, 62);
        }
        return s2;
    }
    
    public static String j(final Resources resources, final List list, final boolean b, final boolean b2, final String s) {
        final int size = list.size();
        cj1.b(size > 0);
        int size2;
        if ((size2 = list.size()) > 3) {
            size2 = 2;
        }
        final String[] array = new String[size2];
        for (int i = 0; i < size2; ++i) {
            final i4h i4h = list.get(i);
            Objects.requireNonNull(i4h);
            final StringBuilder sb = new StringBuilder();
            sb.append("\u200e@");
            sb.append(i4h.J0);
            array[i] = sb.toString();
        }
        final int n = size - size2;
        cj1.b(n != 1);
        cj1.b(size2 > 0);
        if (n > 0) {
            if (size2 == 1) {
                String s2;
                if (s != null) {
                    s2 = resources.getQuantityString(2131820656, n, new Object[] { array[0], n, s });
                }
                else {
                    int n2;
                    if (b) {
                        n2 = 2131820655;
                    }
                    else {
                        n2 = 2131820654;
                    }
                    s2 = resources.getQuantityString(n2, n, new Object[] { array[0], n });
                }
                return s2;
            }
            if (size2 == 2) {
                String s3;
                if (s != null) {
                    s3 = resources.getQuantityString(2131820659, n, new Object[] { array[0], array[1], n, s });
                }
                else {
                    int n3;
                    if (b) {
                        n3 = 2131820658;
                    }
                    else {
                        n3 = 2131820657;
                    }
                    s3 = resources.getQuantityString(n3, n, new Object[] { array[0], array[1], n });
                }
                return s3;
            }
            throw new IllegalStateException("Not expecting so many names + others for the reply context.");
        }
        else if (size2 == 1) {
            if (s != null) {
                return resources.getString(2131957025, new Object[] { s });
            }
            if (b) {
                int n4;
                if (b2) {
                    n4 = 2131957017;
                }
                else {
                    n4 = 2131957021;
                }
                return resources.getString(n4, new Object[] { array[0] });
            }
            return resources.getString(2131957016, new Object[] { array[0] });
        }
        else {
            if (size2 == 2) {
                String s4;
                if (s != null) {
                    s4 = resources.getString(2131957020, new Object[] { array[0], array[1], s });
                }
                else {
                    int n5;
                    if (b) {
                        n5 = 2131957019;
                    }
                    else {
                        n5 = 2131957018;
                    }
                    s4 = resources.getString(n5, new Object[] { array[0], array[1] });
                }
                return s4;
            }
            if (size2 == 3) {
                String s5;
                if (s != null) {
                    s5 = resources.getString(2131957024, new Object[] { array[0], array[1], array[2], s });
                }
                else {
                    int n6;
                    if (b) {
                        n6 = 2131957023;
                    }
                    else {
                        n6 = 2131957022;
                    }
                    s5 = resources.getString(n6, new Object[] { array[0], array[1], array[2] });
                }
                return s5;
            }
            throw new IllegalStateException("Not expecting so many names for the reply context.");
        }
    }
    
    public static final Set l(final r21 r21) {
        czd.f((Object)r21, "<this>");
        final List z = r21.z;
        final List y = r21.y;
        final int n = 0;
        if (z != null && !z.isEmpty()) {
            int n2 = 0;
            Label_0062: {
                if (y != null) {
                    n2 = n;
                    if (!y.isEmpty()) {
                        break Label_0062;
                    }
                }
                n2 = 1;
            }
            if (n2 == 0) {
                if (z.size() != y.size()) {
                    final Set<Object> emptySet = Collections.emptySet();
                    czd.e((Object)emptySet, "emptySet()");
                    return emptySet;
                }
                final List u0 = mq4.U0((Iterable)z, (Iterable)y);
                final ArrayList list = new ArrayList(iq4.H((Iterable)u0, 10));
                for (final lvj lvj : u0) {
                    list.add((Object)new CohostInvite((String)lvj.D0, (String)lvj.E0, (String)null, (String)null, 12, (rf8)null));
                }
                return mq4.R0((Iterable)list);
            }
        }
        final Set<Object> emptySet2 = Collections.emptySet();
        czd.e((Object)emptySet2, "emptySet()");
        return emptySet2;
    }
    
    public static String m() {
        return G(Constants.GUEST_SERVICE_DEV_URL, Constants.GUEST_SERVICE_CANARY_URL, Constants.GUEST_SERVICE_PROD_URL);
    }
    
    public static final itd n(final Collection collection) {
        czd.f((Object)collection, "<this>");
        return new itd(0, collection.size() - 1);
    }
    
    public static final int o(final List list) {
        czd.f((Object)list, "<this>");
        return list.size() - 1;
    }
    
    public static dym p(final List list, final int n) {
        if (list.isEmpty()) {
            return null;
        }
        int i = 0;
        while (i < list.size()) {
            final dym dym = list.get(i);
            final int a = dym.a;
            if (a == n) {
                return dym;
            }
            if (a > n) {
                if (i == 0) {
                    return null;
                }
                return (dym)list.get(i - 1);
            }
            else {
                ++i;
            }
        }
        return list.get(list.size() - 1);
    }
    
    public static void q(final t9i d0) {
        synchronized (s9i.class) {
            synchronized (s9i.class) {
                final boolean b = s9i.D0 != null;
                monitorexit(s9i.class);
                if (!b) {
                    monitorenter(s9i.class);
                    try {
                        if (s9i.D0 != null) {
                            throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                        }
                        s9i.D0 = d0;
                        monitorexit(s9i.class);
                    }
                    finally {}
                }
            }
        }
    }
    
    public static final List r(final Object o) {
        final List<Object> singletonList = Collections.singletonList(o);
        czd.e((Object)singletonList, "singletonList(element)");
        return singletonList;
    }
    
    public static final List s(final Object... array) {
        czd.f((Object)array, "elements");
        Object o;
        if (array.length > 0) {
            o = bt0.u0(array);
        }
        else {
            o = f2a.D0;
        }
        return (List)o;
    }
    
    public static final List t(final Object o) {
        Object o2;
        if (o != null) {
            o2 = r(o);
        }
        else {
            o2 = f2a.D0;
        }
        return (List)o2;
    }
    
    public static boolean u(final String s) {
        return v(s);
    }
    
    public static boolean v(final String s) {
        synchronized (s9i.class) {
            final t9i d0 = s9i.D0;
            if (d0 != null) {
                monitorexit(s9i.class);
                return d0.d(s);
            }
            throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
        }
    }
    
    public static final List w(final Object... array) {
        czd.f((Object)array, "elements");
        ArrayList list;
        if (array.length == 0) {
            list = new ArrayList();
        }
        else {
            list = new ArrayList((Collection<? extends E>)new gs0(array, true));
        }
        return list;
    }
    
    public static final List x(List o) {
        final int size = ((List)o).size();
        if (size != 0) {
            if (size == 1) {
                o = r(((List)o).get(0));
            }
        }
        else {
            o = f2a.D0;
        }
        return (List)o;
    }
    
    public static final void y(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            throw new IllegalArgumentException(zh8.n("fromIndex (", n2, ") is greater than toIndex (", n3, ")."));
        }
        if (n2 < 0) {
            throw new IndexOutOfBoundsException(ze.G("fromIndex (", n2, ") is less than zero."));
        }
        if (n3 <= n) {
            return;
        }
        throw new IndexOutOfBoundsException(zh8.n("toIndex (", n3, ") is greater than size (", n, ")."));
    }
    
    public static final Set z(final Set set, final String s) {
        czd.f((Object)s, "twitterId");
        final ArrayList list = new ArrayList();
        for (final Object next : set) {
            if (czd.a((Object)((CohostInvite)next).getTwitterId(), (Object)s)) {
                list.add(next);
            }
        }
        return onp.Y0(set, (Iterable)list);
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return auz.E0.b().d();
    }
    
    public String k(final Context context, final int n, int n2) {
        da8.m(n2, "plus");
        int n3 = 1000;
        float n4;
        if (n < 1000) {
            if (n2 == 0) {
                throw null;
            }
            if (--n2 != 0) {
                if (n2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                n2 = 2131952811;
            }
            else {
                n2 = 2131952809;
            }
            n4 = (float)n;
        }
        else {
            float n5 = 0.0f;
            float n6 = 0.0f;
            Label_0114: {
                if (n < 1000000) {
                    if (n2 == 0) {
                        throw null;
                    }
                    if (--n2 != 0) {
                        if (n2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n2 = 2131952810;
                    }
                    else {
                        n2 = 2131952808;
                    }
                }
                else {
                    n3 = 1000000000;
                    if (n < 1000000000) {
                        if (n2 != 0) {
                            if (--n2 != 0) {
                                if (n2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                n2 = 2131952805;
                            }
                            else {
                                n2 = 2131952807;
                            }
                            n5 = (float)n;
                            n6 = 1000000;
                            break Label_0114;
                        }
                        throw null;
                    }
                    else {
                        if (n2 == 0) {
                            throw null;
                        }
                        if (--n2 != 0) {
                            if (n2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n2 = 2131952804;
                        }
                        else {
                            n2 = 2131952806;
                        }
                    }
                }
                n5 = (float)n;
                n6 = (float)n3;
            }
            n4 = n5 / n6;
        }
        final Resources resources = context.getResources();
        final float n7 = (float)Math.pow(10.0f, 1);
        final String string = resources.getString(n2, new Object[] { (float)Math.floor(n4 * n7) / n7 });
        czd.e((Object)string, "context.resources.getString(fmt, arg.truncate())");
        return string;
    }
}
