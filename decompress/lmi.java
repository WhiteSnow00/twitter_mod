import java.util.AbstractCollection;
import kotlin.NoWhenBranchMatchedException;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.ImageView;
import android.view.View;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmi implements x4h, hw1, k26
{
    public static lmi F0;
    public static final lmi G0;
    public static final lmi H0;
    public static final lmi I0;
    public static final lmi J0;
    
    static {
        G0 = new lmi();
        H0 = new lmi();
        I0 = new lmi();
        J0 = new lmi();
    }
    
    public static boolean B(lmi g0, final zjv zjv, bte bte, bte bte2) {
        Objects.requireNonNull(g0);
        e0e.f((Object)zjv, "state");
        e0e.f((Object)bte, "subType");
        e0e.f((Object)bte2, "superType");
    Label_1675_Outer:
        while (true) {
            klv d12 = null;
            Iterator iterator9 = null;
            Block_73: {
                while (true) {
                Block_72:
                    while (true) {
                        while (true) {
                            taq t3 = null;
                            taq x3 = null;
                            boolean b9 = false;
                        Label_1678:
                            while (true) {
                                if (bte != bte2) {
                                    if (zjv.c(bte, bte2)) {
                                        final klv d = zjv.d;
                                        final bte e = zjv.e(zjv.f(bte));
                                        final bte e2 = zjv.e(zjv.f(bte2));
                                        final lmi g2 = lmi.G0;
                                        final taq t = d.T(e);
                                        final taq x = d.x(e2);
                                        final klv d2 = zjv.d;
                                        Boolean b2 = null;
                                        Label_0861: {
                                            if (!d2.L((bte)t) && !d2.L((bte)x)) {
                                                if (d2.Q(t) && d2.Q(x)) {
                                                    final jm8 n0 = d2.n0(t);
                                                    taq h0;
                                                    if (n0 == null || (h0 = d2.h0(n0)) == null) {
                                                        h0 = t;
                                                    }
                                                    final jm8 n2 = d2.n0(x);
                                                    taq h2;
                                                    if (n2 == null || (h2 = d2.h0(n2)) == null) {
                                                        h2 = x;
                                                    }
                                                    boolean b = false;
                                                    Label_0297: {
                                                        if (d2.d(h0) == d2.d(h2)) {
                                                            if (d2.r((bte)t) || !d2.r((bte)x)) {
                                                                if (!d2.D(t) || d2.D(x)) {
                                                                    b = true;
                                                                    break Label_0297;
                                                                }
                                                            }
                                                        }
                                                        b = false;
                                                    }
                                                    b2 = (b || zjv.b);
                                                }
                                                else if (!d2.W(t) && !d2.W(x)) {
                                                    final jm8 n3 = d2.n0(x);
                                                    taq h3;
                                                    if (n3 == null || (h3 = d2.h0(n3)) == null) {
                                                        h3 = x;
                                                    }
                                                    final oi3 f = d2.f(h3);
                                                    bte n4;
                                                    if (f != null) {
                                                        n4 = d2.n(f);
                                                    }
                                                    else {
                                                        n4 = null;
                                                    }
                                                    if (f != null && n4 != null) {
                                                        Label_0471: {
                                                            bte bte3;
                                                            if (d2.D(x)) {
                                                                bte3 = d2.K(n4);
                                                            }
                                                            else {
                                                                bte2 = n4;
                                                                if (!d2.r((bte)x)) {
                                                                    break Label_0471;
                                                                }
                                                                bte3 = d2.b0(n4);
                                                            }
                                                            bte2 = bte3;
                                                        }
                                                        e0e.f((Object)t, "subType");
                                                        if (B(g2, zjv, (bte)t, bte2)) {
                                                            b2 = Boolean.TRUE;
                                                            break Label_0861;
                                                        }
                                                    }
                                                    final bkv d3 = d2.d(x);
                                                    if (d2.l(d3)) {
                                                        d2.D(x);
                                                        final Collection u = d2.U(d3);
                                                        boolean b3 = false;
                                                        Label_0602: {
                                                            if (!(u instanceof Collection) || !u.isEmpty()) {
                                                                final Iterator iterator = u.iterator();
                                                                while (iterator.hasNext()) {
                                                                    bte = (bte)iterator.next();
                                                                    if (!B(lmi.G0, zjv, (bte)t, bte)) {
                                                                        b3 = false;
                                                                        break Label_0602;
                                                                    }
                                                                }
                                                            }
                                                            b3 = true;
                                                        }
                                                        b2 = b3;
                                                    }
                                                    else {
                                                        final bkv d4 = d2.d(t);
                                                        Label_0757: {
                                                            if (!(t instanceof oi3)) {
                                                                if (!d2.l(d4)) {
                                                                    break Label_0757;
                                                                }
                                                                final Collection u2 = d2.U(d4);
                                                                boolean b4 = false;
                                                                Label_0708: {
                                                                    if (!(u2 instanceof Collection) || !u2.isEmpty()) {
                                                                        final Iterator iterator2 = u2.iterator();
                                                                        while (iterator2.hasNext()) {
                                                                            if (!(((bte)iterator2.next()) instanceof oi3)) {
                                                                                b4 = false;
                                                                                break Label_0708;
                                                                            }
                                                                        }
                                                                    }
                                                                    b4 = true;
                                                                }
                                                                if (!b4) {
                                                                    break Label_0757;
                                                                }
                                                            }
                                                            final tkv r = lmi.G0.r(zjv.d, (bte)x, (bte)t);
                                                            if (r != null && d2.M(r, d2.d(x))) {
                                                                b2 = Boolean.TRUE;
                                                                break Label_0861;
                                                            }
                                                        }
                                                        b2 = null;
                                                    }
                                                }
                                                else {
                                                    b2 = zjv.b;
                                                }
                                            }
                                            else if (zjv.a) {
                                                b2 = Boolean.TRUE;
                                            }
                                            else if (d2.D(t) && !d2.D(x)) {
                                                b2 = Boolean.FALSE;
                                            }
                                            else {
                                                final taq c = d2.c(t, false);
                                                final taq c2 = d2.c(x, false);
                                                e0e.f((Object)c, "a");
                                                e0e.f((Object)c2, "b");
                                                b2 = p4j.Y(d2, (bte)c, (bte)c2);
                                            }
                                        }
                                        if (b2 != null) {
                                            final boolean b5 = b2;
                                            zjv.a(e, e2);
                                            return b5;
                                        }
                                        zjv.a(e, e2);
                                        final taq t2 = d.T(e);
                                        final taq x2 = d.x(e2);
                                        final klv d5 = zjv.d;
                                        e0e.f((Object)t2, "subType");
                                        e0e.f((Object)x2, "superType");
                                        final klv d6 = zjv.d;
                                        boolean b6 = false;
                                        Label_1431: {
                                            Label_1428: {
                                                if (!d6.D(x2)) {
                                                    if (!d6.r((bte)t2)) {
                                                        if (!d6.C((bte)t2)) {
                                                            if (!(t2 instanceof oi3) || !d6.j0((oi3)t2)) {
                                                                if (!d4j.V(zjv, t2, (zjv$b)zjv$b$b.a)) {
                                                                    if (!d6.r((bte)x2)) {
                                                                        if (!d4j.V(zjv, x2, (zjv$b)zjv$b$d.a)) {
                                                                            if (!d6.S(t2)) {
                                                                                final bkv d7 = d6.d(x2);
                                                                                e0e.f((Object)d7, "end");
                                                                                final klv d8 = zjv.d;
                                                                                if (d4j.c0(zjv, t2, d7)) {
                                                                                    break Label_1428;
                                                                                }
                                                                                zjv.d();
                                                                                final ArrayDeque h4 = zjv.h;
                                                                                e0e.c((Object)h4);
                                                                                final bhq i = zjv.i;
                                                                                e0e.c((Object)i);
                                                                                h4.push(t2);
                                                                                while (h4.isEmpty() ^ true) {
                                                                                    if (i.G0 > 1000) {
                                                                                        final StringBuilder g3 = fd.G("Too many supertypes for type: ", t2, ". Supertypes = ");
                                                                                        g3.append(rr4.I1((Iterable)i, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63));
                                                                                        throw new IllegalStateException(g3.toString().toString());
                                                                                    }
                                                                                    final taq taq = h4.pop();
                                                                                    e0e.e((Object)taq, "current");
                                                                                    if (!i.add((Object)taq)) {
                                                                                        continue Label_1675_Outer;
                                                                                    }
                                                                                    Object o;
                                                                                    if (d8.D(taq)) {
                                                                                        o = zjv$b$c.a;
                                                                                    }
                                                                                    else {
                                                                                        o = zjv$b$b.a;
                                                                                    }
                                                                                    if (!(true ^ e0e.a(o, (Object)zjv$b$c.a))) {
                                                                                        o = null;
                                                                                    }
                                                                                    if (o == null) {
                                                                                        continue Label_1675_Outer;
                                                                                    }
                                                                                    final klv d9 = zjv.d;
                                                                                    final Iterator iterator3 = d9.U(d9.d(taq)).iterator();
                                                                                    while (true) {
                                                                                        boolean d10 = false;
                                                                                        if (!iterator3.hasNext()) {
                                                                                            break;
                                                                                        }
                                                                                        final taq a = ((zjv$b)o).a(zjv, (bte)iterator3.next());
                                                                                        final klv d11 = zjv.d;
                                                                                        Label_1351: {
                                                                                            if (!d11.X((bte)a)) {
                                                                                                if (d11.D(a)) {
                                                                                                    break Label_1351;
                                                                                                }
                                                                                                if (!zjv.b || !d11.W(a)) {
                                                                                                    d10 = d11.d0(d11.d(a), d7);
                                                                                                    break Label_1351;
                                                                                                }
                                                                                            }
                                                                                            d10 = true;
                                                                                        }
                                                                                        if (d10) {
                                                                                            zjv.b();
                                                                                            break Label_1428;
                                                                                        }
                                                                                        h4.add(a);
                                                                                    }
                                                                                }
                                                                                zjv.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    b6 = false;
                                                                    break Label_1431;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            b6 = true;
                                        }
                                        if (b6) {
                                            t3 = d5.T((bte)t2);
                                            x3 = d5.x((bte)x2);
                                            d12 = zjv.d;
                                            Boolean b7 = null;
                                            if (d12.u(t3) || d12.u(x3)) {
                                                if (e(d12, t3) && e(d12, x3)) {
                                                    b7 = Boolean.TRUE;
                                                    break Label_1718;
                                                }
                                                if (d12.u(t3) ? f(d12, zjv, t3, x3, false) : d12.u(x3)) {
                                                    b7 = Boolean.TRUE;
                                                    break Label_1718;
                                                }
                                            }
                                            Label_1716: {
                                                b7 = null;
                                            }
                                            if (b7 != null) {
                                                final boolean b5 = b7;
                                                zjv.a((bte)t2, (bte)x2);
                                                return b5;
                                            }
                                            final bkv d13 = d5.d(x2);
                                            if (d5.d0(d5.d(t2), d13) && d5.w(d13) == 0) {
                                                return true;
                                            }
                                            if (d5.i0(d5.d(x2))) {
                                                return true;
                                            }
                                            g0 = lmi.G0;
                                            e0e.f((Object)d13, "superConstructor");
                                            final klv d14 = zjv.d;
                                            List list;
                                            if (d14.S(t2)) {
                                                list = g0.h(zjv, t2, d13);
                                            }
                                            else if (!d14.m(d13) && !d14.g0(d13)) {
                                                list = g0.g(zjv, t2, d13);
                                            }
                                            else {
                                                final wgq wgq = new wgq();
                                                zjv.d();
                                                final ArrayDeque h5 = zjv.h;
                                                e0e.c((Object)h5);
                                                final bhq j = zjv.i;
                                                e0e.c((Object)j);
                                                h5.push(t2);
                                                while (h5.isEmpty() ^ true) {
                                                    if (j.G0 > 1000) {
                                                        final StringBuilder g4 = fd.G("Too many supertypes for type: ", t2, ". Supertypes = ");
                                                        g4.append(rr4.I1((Iterable)j, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63));
                                                        throw new IllegalStateException(g4.toString().toString());
                                                    }
                                                    final taq taq2 = h5.pop();
                                                    e0e.e((Object)taq2, "current");
                                                    if (!j.add((Object)taq2)) {
                                                        continue Label_1675_Outer;
                                                    }
                                                    Object o2;
                                                    if (d14.S(taq2)) {
                                                        wgq.add((Object)taq2);
                                                        o2 = zjv$b$c.a;
                                                    }
                                                    else {
                                                        o2 = zjv$b$b.a;
                                                    }
                                                    if (!(e0e.a(o2, (Object)zjv$b$c.a) ^ true)) {
                                                        o2 = null;
                                                    }
                                                    if (o2 == null) {
                                                        continue Label_1675_Outer;
                                                    }
                                                    final klv d15 = zjv.d;
                                                    final Iterator iterator4 = d15.U(d15.d(taq2)).iterator();
                                                    while (iterator4.hasNext()) {
                                                        h5.add(((zjv$b)o2).a(zjv, (bte)iterator4.next()));
                                                    }
                                                }
                                                zjv.b();
                                                list = new ArrayList();
                                                for (final taq taq3 : wgq) {
                                                    final lmi g5 = lmi.G0;
                                                    e0e.e((Object)taq3, "it");
                                                    pr4.j1((Collection)list, (Iterable)g5.h(zjv, taq3, d13));
                                                }
                                            }
                                            final ArrayList list2 = new ArrayList<taq>(nr4.d1((Iterable)list, 10));
                                            for (final taq taq4 : list) {
                                                taq b8 = d5.b(zjv.e((bte)taq4));
                                                if (b8 == null) {
                                                    b8 = taq4;
                                                }
                                                list2.add(b8);
                                            }
                                            final int size = list2.size();
                                            if (size != 0) {
                                                if (size == 1) {
                                                    return lmi.G0.z(zjv, d5.P((taq)rr4.C1((List)list2)), x2);
                                                }
                                                final es0 es0 = new es0(d5.w(d13));
                                                final int w = d5.w(d13);
                                                int k = 0;
                                                int n5 = 0;
                                                while (k < w) {
                                                    if (n5 == 0 && d5.Y(d5.A(d13, k)) == 2) {
                                                        n5 = 0;
                                                    }
                                                    else {
                                                        n5 = 1;
                                                    }
                                                    if (n5 == 0) {
                                                        final ArrayList list3 = new ArrayList<bte>(nr4.d1((Iterable)list2, 10));
                                                        for (final taq taq5 : list2) {
                                                            vjv e3 = d5.E(taq5, k);
                                                            if (e3 != null) {
                                                                if (d5.l0(e3) != 3) {
                                                                    e3 = null;
                                                                }
                                                                if (e3 != null) {
                                                                    final bte l = d5.k(e3);
                                                                    if (l != null) {
                                                                        list3.add(l);
                                                                        continue Label_1675_Outer;
                                                                    }
                                                                }
                                                            }
                                                            final StringBuilder sb = new StringBuilder();
                                                            sb.append("Incorrect type: ");
                                                            sb.append(taq5);
                                                            sb.append(", subType: ");
                                                            sb.append(t2);
                                                            sb.append(", superType: ");
                                                            sb.append(x2);
                                                            throw new IllegalStateException(sb.toString().toString());
                                                        }
                                                        ((AbstractCollection<vjv>)es0).add(d5.y(d5.Z((List)list3)));
                                                    }
                                                    ++k;
                                                }
                                                if (n5 == 0 && lmi.G0.z(zjv, (ujv)es0, x2)) {
                                                    return true;
                                                }
                                                final me me = new me((List)list2, zjv, d5, x2);
                                                final zjv$a$a zjv$a$a = new zjv$a$a();
                                                me.invoke((Object)zjv$a$a);
                                                return zjv$a$a.a;
                                            }
                                            else {
                                                final klv d16 = zjv.d;
                                                final bkv d17 = d16.d(t2);
                                                if (d16.m(d17)) {
                                                    return d16.F(d17);
                                                }
                                                if (d16.F(d16.d(t2))) {
                                                    return true;
                                                }
                                                zjv.d();
                                                final ArrayDeque h6 = zjv.h;
                                                e0e.c((Object)h6);
                                                final bhq m = zjv.i;
                                                e0e.c((Object)m);
                                                h6.push(t2);
                                                while (h6.isEmpty() ^ true) {
                                                    if (m.G0 > 1000) {
                                                        final StringBuilder g6 = fd.G("Too many supertypes for type: ", t2, ". Supertypes = ");
                                                        g6.append(rr4.I1((Iterable)m, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63));
                                                        throw new IllegalStateException(g6.toString().toString());
                                                    }
                                                    final taq taq6 = h6.pop();
                                                    e0e.e((Object)taq6, "current");
                                                    if (!m.add((Object)taq6)) {
                                                        continue Label_1675_Outer;
                                                    }
                                                    Object o3;
                                                    if (d16.S(taq6)) {
                                                        o3 = zjv$b$c.a;
                                                    }
                                                    else {
                                                        o3 = zjv$b$b.a;
                                                    }
                                                    if (!(e0e.a(o3, (Object)zjv$b$c.a) ^ true)) {
                                                        o3 = null;
                                                    }
                                                    if (o3 == null) {
                                                        continue Label_1675_Outer;
                                                    }
                                                    final klv d18 = zjv.d;
                                                    final Iterator iterator8 = d18.U(d18.d(taq6)).iterator();
                                                    while (iterator8.hasNext()) {
                                                        final taq a2 = ((zjv$b)o3).a(zjv, (bte)iterator8.next());
                                                        if (d16.F(d16.d(a2))) {
                                                            zjv.b();
                                                            return true;
                                                        }
                                                        h6.add(a2);
                                                    }
                                                }
                                                zjv.b();
                                            }
                                        }
                                    }
                                    return false;
                                }
                                return true;
                                iftrue(Label_1675:)(!iterator9.hasNext());
                                break Block_73;
                                b9 = true;
                                break Label_1678;
                                b9 = false;
                                break Label_1678;
                                Boolean b7 = Boolean.TRUE;
                                continue Label_1675_Outer;
                            }
                            iftrue(Label_1716:)(!b9 && !f(d12, zjv, x3, t3, true));
                            continue;
                        }
                        final bkv bkv;
                        final Collection u3 = d12.U(bkv);
                        iftrue(Label_1601:)(!(u3 instanceof Collection) || !u3.isEmpty());
                        break Block_72;
                        Label_1601: {
                            iterator9 = u3.iterator();
                        }
                        continue Label_1675_Outer;
                    }
                    continue;
                }
            }
            final taq b10 = d12.b((bte)iterator9.next());
            iftrue(Label_1610:)(b10 == null || !d12.u(b10));
            continue;
        }
    }
    
    public static final boolean D() {
        final rmv b = ita.b();
        boolean b2 = false;
        if (b.b("dm_vdl_enabled", false)) {
            b2 = b2;
            if (ita.b().b("dm_vdl_chat_p0_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean E() {
        final rmv b = ita.b();
        boolean b2 = false;
        if (b.b("dm_vdl_enabled", false)) {
            b2 = b2;
            if (ita.b().b("dm_vdl_inbox_p0_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean F() {
        return ita.b().b("dm_voice_creation_enabled", false);
    }
    
    public static final int G() {
        return ita.b().f("dm_max_group_size", 20);
    }
    
    public static final boolean e(final klv klv, final taq taq) {
        final boolean u = klv.u(taq);
        boolean b = true;
        if (!u) {
            boolean b2 = false;
            Label_0086: {
                if (taq instanceof oi3) {
                    final vjv z = klv.z(klv.R((oi3)taq));
                    if (!klv.O(z) && klv.u(klv.x(klv.k(z)))) {
                        b2 = true;
                        break Label_0086;
                    }
                }
                b2 = false;
            }
            b = (b2 && b);
        }
        return b;
    }
    
    public static final boolean f(final klv klv, final zjv zjv, final taq taq, final taq taq2, final boolean b) {
        final Collection o = klv.o(taq);
        final boolean b2 = o instanceof Collection;
        final boolean b3 = false;
        boolean b4;
        if (b2 && o.isEmpty()) {
            b4 = b3;
        }
        else {
            final Iterator iterator = o.iterator();
            bte bte;
            do {
                b4 = b3;
                if (!iterator.hasNext()) {
                    return b4;
                }
                bte = (bte)iterator.next();
            } while (!e0e.a((Object)klv.f0(bte), (Object)klv.d(taq2)) && (!b || !B(lmi.G0, zjv, (bte)taq2, bte)));
            b4 = true;
        }
        return b4;
    }
    
    public static lmi j() {
        synchronized (lmi.class) {
            if (lmi.F0 == null) {
                lmi.F0 = new lmi();
            }
            return lmi.F0;
        }
    }
    
    public static final int k() {
        return ita.b().f("dm_conversation_labels_max_pinned_count", 6);
    }
    
    public static final int l() {
        int a;
        if (y()) {
            a = (int)ita.b().h("dm_share_sheet_send_individually_max_count", 20L);
        }
        else {
            a = qiv.a();
        }
        return a;
    }
    
    public static final boolean n() {
        final boolean u = u();
        boolean b = false;
        if (u) {
            b = b;
            if (ita.b().b("dm_inbox_search_message_results_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean o() {
        final boolean n = n();
        boolean b = false;
        if (n) {
            b = b;
            if (ita.b().b("dm_inbox_search_message_attachment_previews_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean p() {
        return ita.b().b("dm_inbox_search_modular_results_enabled", false);
    }
    
    public static final long q() {
        return ita.b().h("dm_inbox_search_debounce_ms", 200L);
    }
    
    public static final boolean u() {
        return ita.b().b("direct_messages_incremental_holdback_2022h1", false);
    }
    
    public static final boolean v() {
        final ojw a = pdw.d().A();
        e0e.e((Object)a, "getCurrent().userSettings");
        final boolean b = a.b();
        final boolean a2 = a.a();
        return b && a2;
    }
    
    public static final boolean w() {
        return ita.b().b("dm_conversations_nsfw_media_filter_enabled", false);
    }
    
    public static final boolean x() {
        final rmv b = ita.b();
        boolean b2 = false;
        if (b.b("dm_inbox_search_server_enabled", false)) {
            b2 = b2;
            if (ita.b().b("dm_inbox_search_quick_share_server_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean y() {
        final rmv b = ita.b();
        boolean b2 = false;
        if (b.b("dm_share_sheet_send_individually_enabled", false)) {
            b2 = b2;
            if (u()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public boolean A(final zjv zjv, final bte bte, final bte bte2) {
        e0e.f((Object)bte, "subType");
        e0e.f((Object)bte2, "superType");
        return B(this, zjv, bte, bte2);
    }
    
    public boolean C(final klv klv, final bte bte, final bte bte2, final bkv bkv) {
        final taq b = klv.b(bte);
        final boolean b2 = b instanceof oi3;
        boolean b3 = true;
        if (b2) {
            final oi3 oi3 = (oi3)b;
            if (!klv.h(oi3)) {
                if (klv.O(klv.z(klv.R(oi3)))) {
                    if (klv.p(oi3) != zh3.F0) {
                        return false;
                    }
                    final bkv f0 = klv.f0(bte2);
                    slv slv;
                    if (f0 instanceof slv) {
                        slv = (slv)f0;
                    }
                    else {
                        slv = null;
                    }
                    if (slv == null) {
                        return false;
                    }
                    final tkv t = klv.t(slv);
                    if (t != null && klv.M(t, bkv)) {
                        return b3;
                    }
                }
            }
        }
        b3 = false;
        return b3;
    }
    
    public void a(final w4h w4h) {
    }
    
    public Object b(final Object o, final Object o2) {
        e0e.g(o, "t1");
        e0e.g(o2, "t2");
        return new awj(o, o2);
    }
    
    public void c(final x3c x3c, final int n, final float n2, final float n3) {
        e0e.f((Object)x3c, "<this>");
        final View s = this.s(x3c, n);
        s.animate().withStartAction((Runnable)new gxn(s, 0)).scaleX(1.0f).scaleY(1.0f).setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator()).setDuration(200L).withEndAction((Runnable)new hxn(s, n3, n2)).start();
    }
    
    public void d(final ImageView imageView, final int n) {
        e0e.f((Object)imageView, "<this>");
        final Context context = ((View)imageView).getContext();
        final Object a = qo6.a;
        imageView.setImageDrawable(qo6$c.b(context, n));
        imageView.setVisibility(4);
        ((View)imageView).animate().withStartAction((Runnable)new f26((Object)imageView, 14)).scaleX(1.0f).scaleY(1.0f).setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator()).setDuration(200L).withEndAction((Runnable)new n20((Object)imageView, 16)).start();
    }
    
    public List g(final zjv zjv, final taq taq, final bkv bkv) {
        final klv d = zjv.d;
        d.J(taq, bkv);
        if (!d.m(bkv) && d.S(taq)) {
            return (List)h3a.F0;
        }
        if (d.G(bkv)) {
            Object o;
            if (d.d0(d.d(taq), bkv)) {
                taq v = d.v(taq);
                if (v == null) {
                    v = taq;
                }
                o = shw.x0((Object)v);
            }
            else {
                o = h3a.F0;
            }
            return (List)o;
        }
        final wgq wgq = new wgq();
        zjv.d();
        final ArrayDeque h = zjv.h;
        e0e.c((Object)h);
        final bhq i = zjv.i;
        e0e.c((Object)i);
        h.push(taq);
        while (h.isEmpty() ^ true) {
            if (i.G0 > 1000) {
                final StringBuilder g = fd.G("Too many supertypes for type: ", taq, ". Supertypes = ");
                g.append(rr4.I1((Iterable)i, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63));
                throw new IllegalStateException(g.toString().toString());
            }
            final taq taq2 = h.pop();
            e0e.e((Object)taq2, "current");
            if (!i.add((Object)taq2)) {
                continue;
            }
            Object v2;
            if ((v2 = d.v(taq2)) == null) {
                v2 = taq2;
            }
            Object o2;
            if (d.d0(d.d((taq)v2), bkv)) {
                wgq.add(v2);
                o2 = zjv$b$c.a;
            }
            else if (d.N((bte)v2) == 0) {
                o2 = zjv$b$b.a;
            }
            else {
                o2 = zjv.d.s((taq)v2);
            }
            if (!(e0e.a(o2, (Object)zjv$b$c.a) ^ true)) {
                o2 = null;
            }
            if (o2 == null) {
                continue;
            }
            final klv d2 = zjv.d;
            final Iterator iterator = d2.U(d2.d(taq2)).iterator();
            while (iterator.hasNext()) {
                h.add(((zjv$b)o2).a(zjv, (bte)iterator.next()));
            }
        }
        zjv.b();
        return (List)wgq;
    }
    
    public List h(final zjv zjv, final taq taq, final bkv bkv) {
        final List g = this.g(zjv, taq, bkv);
        final klv d = zjv.d;
        List list;
        if (g.size() < 2) {
            list = g;
        }
        else {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = g.iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                final int n = 1;
                if (!hasNext) {
                    break;
                }
                final Object next = iterator.next();
                final ujv p3 = d.P((taq)next);
                final int i = d.i(p3);
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= i) {
                        break;
                    }
                    if (d.e0(d.k(d.k0(p3, n2))) != null) {
                        n3 = 0;
                        break;
                    }
                    ++n2;
                }
                if (n3 == 0) {
                    continue;
                }
                list2.add(next);
            }
            list = g;
            if (list2.isEmpty() ^ true) {
                list = list2;
            }
        }
        return list;
    }
    
    public boolean i(final zjv zjv, final bte bte, final bte bte2) {
        e0e.f((Object)zjv, "state");
        e0e.f((Object)bte, "a");
        e0e.f((Object)bte2, "b");
        final klv d = zjv.d;
        boolean b = true;
        final boolean b2 = true;
        if (bte == bte2) {
            return true;
        }
        final lmi g0 = lmi.G0;
        if (g0.t(d, bte) && g0.t(d, bte2)) {
            final bte e = zjv.e(zjv.f(bte));
            final bte e2 = zjv.e(zjv.f(bte2));
            final taq t = d.T(e);
            if (!d.d0(d.f0(e), d.f0(e2))) {
                return false;
            }
            if (d.N((bte)t) == 0) {
                boolean b3 = b2;
                if (!d.q(e)) {
                    if (d.q(e2)) {
                        b3 = b2;
                    }
                    else {
                        b3 = (d.D(t) == d.D(d.T(e2)) && b2);
                    }
                }
                return b3;
            }
        }
        if (!B(g0, zjv, bte, bte2) || !B(g0, zjv, bte2, bte)) {
            b = false;
        }
        return b;
    }
    
    public Object m(final e26 e26) {
        return new hem(((xsm)e26).o((Class)hem$a.class));
    }
    
    public tkv r(final klv klv, final bte bte, final bte bte2) {
        final int n = klv.N(bte);
        int n2 = 0;
        while (true) {
            vjv vjv = null;
            if (n2 >= n) {
                return null;
            }
            final vjv h = klv.H(bte, n2);
            final boolean o = klv.O(h);
            boolean b = true;
            if (o ^ true) {
                vjv = h;
            }
            if (vjv != null) {
                final bte k = klv.k(vjv);
                if (k != null) {
                    if (!klv.a0((bte)klv.T(k)) || !klv.a0((bte)klv.T(bte2))) {
                        b = false;
                    }
                    if (e0e.a((Object)k, (Object)bte2) || (b && e0e.a((Object)klv.f0(k), (Object)klv.f0(bte2)))) {
                        return klv.A(klv.f0(bte), n2);
                    }
                    final tkv r = this.r(klv, k, bte2);
                    if (r != null) {
                        return r;
                    }
                }
            }
            ++n2;
        }
    }
    
    public View s(final x3c x3c, final int n) {
        e0e.f((Object)x3c, "<this>");
        final View d = x3c.d();
        final ImageView imageView = (ImageView)((View)d).findViewById(2131431146);
        final Context context = ((View)x3c.d()).getContext();
        final Object a = qo6.a;
        imageView.setImageDrawable(qo6$c.b(context, n));
        e0e.e((Object)d, "visibleView.apply {\n    \u2026xt, emojiResource))\n    }");
        return d;
    }
    
    public boolean t(final klv klv, final bte bte) {
        return klv.V(klv.f0(bte)) && !klv.j(bte) && !klv.r(bte) && !klv.C(bte) && e0e.a((Object)klv.d(klv.T(bte)), (Object)klv.d(klv.x(bte)));
    }
    
    public boolean z(final zjv zjv, final ujv ujv, final taq taq) {
        e0e.f((Object)zjv, "<this>");
        e0e.f((Object)ujv, "capturedSubArguments");
        e0e.f((Object)taq, "superType");
        final klv d = zjv.d;
        final bkv d2 = d.d(taq);
        final int i = d.i(ujv);
        final int w = d.w(d2);
        if (i == w && i == d.N((bte)taq)) {
            for (int j = 0; j < w; ++j) {
                final vjv h = d.H((bte)taq, j);
                if (!d.O(h)) {
                    final bte k = d.k(h);
                    final vjv k2 = d.k0(ujv, j);
                    d.l0(k2);
                    final bte l = d.k(k2);
                    final lmi g0 = lmi.G0;
                    int y = d.Y(d.A(d2, j));
                    final int l2 = d.l0(h);
                    mqb.n(y, "declared");
                    mqb.n(l2, "useSite");
                    if (y == 3) {
                        y = l2;
                    }
                    else if (l2 != 3) {
                        if (y != l2) {
                            y = 0;
                        }
                    }
                    if (y == 0) {
                        return zjv.a;
                    }
                    if (y != 3 || (!g0.C(d, l, k, d2) && !g0.C(d, k, l, d2))) {
                        final int g2 = zjv.g;
                        if (g2 > 100) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Arguments depth is too high. Some related argument: ");
                            sb.append(l);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        zjv.g = g2 + 1;
                        final int g3 = lb0.G(y);
                        boolean b;
                        if (g3 != 0) {
                            if (g3 != 1) {
                                if (g3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                b = g0.i(zjv, l, k);
                            }
                            else {
                                b = B(g0, zjv, l, k);
                            }
                        }
                        else {
                            b = B(g0, zjv, k, l);
                        }
                        --zjv.g;
                        if (!b) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
