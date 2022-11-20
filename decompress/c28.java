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

public final class c28 extends ste implements qsb<ixl, taj<? extends j3q>>
{
    public final b28 D0;
    public final UserIdentifier E0;
    
    public c28(final b28 d0, final UserIdentifier e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final ixl ixl = (ixl)o;
        czd.f((Object)ixl, "suggestionResultItem");
        final b28 d0 = this.D0;
        final UserIdentifier e0 = this.E0;
        final List b = ixl.b;
        Objects.requireNonNull(d0);
        final ArrayList list = new ArrayList();
        final Iterator iterator = b.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b2 = false;
            if (!hasNext) {
                break;
            }
            final Object next = iterator.next();
            final m28 m28 = (m28)next;
            if (m28 instanceof x38 || m28 instanceof ao7) {
                b2 = true;
            }
            if (!b2) {
                continue;
            }
            list.add(next);
        }
        final List h0 = mq4.H0((Iterable)list, d0.b.a());
        o = new ArrayList(iq4.H((Iterable)h0, 10));
        final Iterator iterator2 = h0.iterator();
        while (iterator2.hasNext()) {
            ((ArrayList<String>)o).add(d0.e(e0, (m28)iterator2.next()));
        }
        final String[] array = ((ArrayList)o).toArray(new String[0]);
        czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final String[] array2 = array;
        final List d2 = r3q.d(d0.c);
        czd.e((Object)d2, "getDynamicShortcuts(context)");
        final ArrayList list2 = new ArrayList<String>(iq4.H((Iterable)d2, 10));
        final Iterator iterator3 = d2.iterator();
        while (iterator3.hasNext()) {
            list2.add(((j3q)iterator3.next()).b);
        }
        final String[] array3 = list2.toArray(new String[0]);
        czd.d((Object)array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        h5j h5j;
        if (Arrays.equals(array2, array3)) {
            if (b28.h) {
                s9g.a("DynamicShortcut", "Skipping dynamic shortcut update because shortcuts are unchanged");
            }
            h5j = h5j.empty();
            czd.e((Object)h5j, "empty()");
        }
        else {
            final ArrayList list3 = new ArrayList<j3q>(iq4.H((Iterable)h0, 10));
            final Iterator iterator4 = h0.iterator();
            int n = 0;
            while (iterator4.hasNext()) {
                o = iterator4.next();
                if (n < 0) {
                    s9i.E();
                    throw null;
                }
                final m28 m29 = (m28)o;
                final fca a = fca.a();
                final af4 af4 = new af4(new vba("notification", "launcher", "dynamic_shortcut", "", "create"));
                ((u0p)af4).A();
                a.b(e0, (elm)af4);
                j3q j3q;
                if (m29 instanceof x38) {
                    final j3q$a b3 = d0.b(e0, (x38)m29, null);
                    b3.a.n = n;
                    j3q = b3.a();
                }
                else {
                    if (!(m29 instanceof ao7)) {
                        throw new IllegalArgumentException("Suggested item is not a valid share target");
                    }
                    final j3q$a a2 = d0.a(e0, ((ao7)m29).a, null);
                    a2.a.n = n;
                    j3q = a2.a();
                }
                list3.add(j3q);
                ++n;
            }
            if (b28.h) {
                final int size = list3.size();
                final int b4 = d0.b.b();
                o = new StringBuilder();
                ((StringBuilder)o).append("Setting (");
                ((StringBuilder)o).append(size);
                ((StringBuilder)o).append(") dynamic shortcuts for ");
                ((StringBuilder)o).append(e0);
                ((StringBuilder)o).append(", (");
                ((StringBuilder)o).append(b4);
                ((StringBuilder)o).append(" static shortcuts found)");
                s9g.a("DynamicShortcut", ((StringBuilder)o).toString());
            }
            r3q.j(d0.c);
            r3q.a(d0.c, (List)list3);
            final ArrayList list4 = new ArrayList<h5j>(iq4.H((Iterable)h0, 10));
            final Iterator iterator5 = h0.iterator();
            int n2 = 0;
            while (iterator5.hasNext()) {
                o = iterator5.next();
                if (n2 < 0) {
                    s9i.E();
                    throw null;
                }
                final m28 m30 = (m28)o;
                h5j h5j2;
                if (m30 instanceof x38) {
                    final String e2 = ((x38)m30).a.E0;
                    Object o2;
                    if (e2 == null) {
                        o2 = xog.D0;
                    }
                    else {
                        o2 = d0.f.h(d0.c(e2));
                    }
                    h5j2 = ((kog)o2).l((psb)new di((qsb)new d28(d0, e0, m30, n2), 8)).s();
                }
                else if (m30 instanceof ao7) {
                    final soj d3 = ((ao7)m30).a.d;
                    String a3;
                    if (d3 != null) {
                        a3 = d3.a;
                    }
                    else {
                        a3 = null;
                    }
                    Object o3;
                    if (a3 == null) {
                        o3 = xog.D0;
                    }
                    else {
                        o3 = d0.f.h(d0.c(a3));
                    }
                    h5j2 = ((kog)o3).l((psb)new lka((qsb)new e28(d0, e0, m30, n2), 10)).s();
                }
                else {
                    h5j2 = h5j.error((Throwable)new IllegalArgumentException("Suggested item is not a valid share target"));
                }
                list4.add(h5j2);
                ++n2;
            }
            h5j = h5j.merge((Iterable)list4);
            czd.e((Object)h5j, "merge(\n                t\u2026          }\n            )");
        }
        return h5j;
    }
}
