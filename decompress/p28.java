import java.util.Iterator;
import java.util.List;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p28 extends gue implements rtb<rwl, naj<? extends s2q>>
{
    public final /* synthetic */ o28 C0;
    public final /* synthetic */ UserIdentifier D0;
    
    public p28(final o28 c0, final UserIdentifier d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final rwl rwl = (rwl)o;
        zzd.f((Object)rwl, "suggestionResultItem");
        final o28 c0 = this.C0;
        final UserIdentifier d0 = this.D0;
        final List b = rwl.b;
        Objects.requireNonNull(c0);
        final ArrayList list = new ArrayList();
        final Iterator iterator = b.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b2 = false;
            if (!hasNext) {
                break;
            }
            final Object next = iterator.next();
            final z28 z28 = (z28)next;
            if (z28 instanceof l48 || z28 instanceof to7) {
                b2 = true;
            }
            if (!b2) {
                continue;
            }
            list.add(next);
        }
        final List h2 = or4.h2((Iterable)list, c0.b.a());
        final ArrayList list2 = new ArrayList<String>(kr4.h1((Iterable)h2, 10));
        final Iterator iterator2 = h2.iterator();
        while (iterator2.hasNext()) {
            list2.add(c0.e(d0, (z28)iterator2.next()));
        }
        final String[] array = list2.toArray(new String[0]);
        zzd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final String[] array2 = array;
        final List d2 = a3q.d(c0.c);
        zzd.e((Object)d2, "getDynamicShortcuts(context)");
        final ArrayList list3 = new ArrayList<String>(kr4.h1((Iterable)d2, 10));
        final Iterator iterator3 = d2.iterator();
        while (iterator3.hasNext()) {
            list3.add(((s2q)iterator3.next()).b);
        }
        final String[] array3 = list3.toArray(new String[0]);
        zzd.d((Object)array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        b5j b5j;
        if (Arrays.equals(array2, array3)) {
            if (o28.h) {
                cag.a("DynamicShortcut", "Skipping dynamic shortcut update because shortcuts are unchanged");
            }
            b5j = b5j.empty();
            zzd.e((Object)b5j, "empty()");
        }
        else {
            final ArrayList list4 = new ArrayList<s2q>(kr4.h1((Iterable)h2, 10));
            final Iterator iterator4 = h2.iterator();
            int n = 0;
            while (iterator4.hasNext()) {
                o = iterator4.next();
                if (n < 0) {
                    tdy.V0();
                    throw null;
                }
                final z28 z29 = (z28)o;
                final xca a = xca.a();
                final zf4 zf4 = new zf4(new nca("notification", "launcher", "dynamic_shortcut", "", "create"));
                zf4.A();
                a.b(d0, (okm)zf4);
                s2q s2q;
                if (z29 instanceof l48) {
                    final s2q$a b3 = c0.b(d0, (l48)z29, (Bitmap)null);
                    b3.a.n = n;
                    s2q = b3.a();
                }
                else {
                    if (!(z29 instanceof to7)) {
                        throw new IllegalArgumentException("Suggested item is not a valid share target");
                    }
                    final s2q$a a2 = c0.a(d0, ((to7)z29).a, (Bitmap)null);
                    a2.a.n = n;
                    s2q = a2.a();
                }
                list4.add(s2q);
                ++n;
            }
            if (o28.h) {
                final int size = list4.size();
                final int b4 = c0.b.b();
                o = new StringBuilder();
                ((StringBuilder)o).append("Setting (");
                ((StringBuilder)o).append(size);
                ((StringBuilder)o).append(") dynamic shortcuts for ");
                ((StringBuilder)o).append(d0);
                ((StringBuilder)o).append(", (");
                ((StringBuilder)o).append(b4);
                ((StringBuilder)o).append(" static shortcuts found)");
                cag.a("DynamicShortcut", ((StringBuilder)o).toString());
            }
            a3q.j(c0.c);
            a3q.a(c0.c, (List)list4);
            final ArrayList list5 = new ArrayList<b5j>(kr4.h1((Iterable)h2, 10));
            final Iterator iterator5 = h2.iterator();
            int n2 = 0;
            while (iterator5.hasNext()) {
                o = iterator5.next();
                if (n2 < 0) {
                    tdy.V0();
                    throw null;
                }
                final z28 z30 = (z28)o;
                b5j b5j2;
                if (z30 instanceof l48) {
                    final String d3 = ((l48)z30).a.D0;
                    Object o2;
                    if (d3 == null) {
                        o2 = yog.C0;
                    }
                    else {
                        o2 = c0.f.h(c0.c(d3));
                    }
                    b5j2 = ((log)o2).m((qtb)new c9v((rtb)new q28(c0, d0, z30, n2), 8)).s();
                }
                else if (z30 instanceof to7) {
                    final moj d4 = ((to7)z30).a.d;
                    String a3;
                    if (d4 != null) {
                        a3 = d4.a;
                    }
                    else {
                        a3 = null;
                    }
                    Object o3;
                    if (a3 == null) {
                        o3 = yog.C0;
                    }
                    else {
                        o3 = c0.f.h(c0.c(a3));
                    }
                    b5j2 = ((log)o3).m((qtb)new d9v((rtb)new r28(c0, d0, z30, n2), 5)).s();
                }
                else {
                    b5j2 = b5j.error((Throwable)new IllegalArgumentException("Suggested item is not a valid share target"));
                }
                list5.add(b5j2);
                ++n2;
            }
            b5j = b5j.merge((Iterable)list5);
            zzd.e((Object)b5j, "merge(\n                t\u2026          }\n            )");
        }
        return b5j;
    }
}
