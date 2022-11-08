import androidx.compose.runtime.ComposeRuntimeError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4m extends le6
{
    public static final p4m.p4m$a Companion;
    public static final muh<nak<p4m.p4m$c>> s;
    public static final AtomicReference<Boolean> t;
    public final ei2 a;
    public final hae b;
    public final oy6 c;
    public final Object d;
    public fae e;
    public Throwable f;
    public final List<dq6> g;
    public final List<Set<Object>> h;
    public final List<dq6> i;
    public final List<dq6> j;
    public final List<jrh> k;
    public final Map<hrh<Object>, List<jrh>> l;
    public final Map<jrh, irh> m;
    public List<dq6> n;
    public gg3<? super oyv> o;
    public p4m.p4m$b p;
    public final muh<p4m$d> q;
    public final p4m.p4m$c r;
    
    static {
        Companion = new p4m.p4m$a();
        Objects.requireNonNull(y9k.Companion);
        p4m.s = (s7r)m0n.r((Object)y9k.F0);
        t = new AtomicReference<Boolean>(Boolean.FALSE);
    }
    
    public p4m(final oy6 oy6) {
        zzd.f((Object)oy6, "effectCoroutineContext");
        final ei2 a = new ei2((otb)new otb<oyv>() {
            public final /* synthetic */ p4m C0;
            
            public final Object invoke() {
                final p4m c0 = this.C0;
                synchronized (c0.d) {
                    final gg3<oyv> u = c0.u();
                    if (((Enum<p4m$d>)c0.q.getValue()).compareTo(p4m$d.D0) > 0) {
                        monitorexit(c0.d);
                        if (u != null) {
                            ((ap6)u).resumeWith((Object)oyv.a);
                        }
                        return oyv.a;
                    }
                    throw tdy.d("Recomposer shutdown; frame clock awaiter will never resume", c0.f);
                }
            }
        });
        this.a = a;
        final hae b = new hae((fae)oy6.c((oy6$b)fae$b.C0));
        ((nae)b).Z((rtb)new rtb<Throwable, oyv>() {
            public final /* synthetic */ p4m C0;
            
            public final Object invoke(final Object o) {
                final Throwable t = (Throwable)o;
                final CancellationException d = tdy.d("Recomposer effect job completed", t);
                final p4m c0 = this.C0;
                synchronized (c0.d) {
                    final fae e = c0.e;
                    if (e != null) {
                        c0.q.setValue((Object)p4m$d.D0);
                        e.a(d);
                        c0.o = null;
                        e.Z((rtb)new q4m(c0, t));
                    }
                    else {
                        c0.f = d;
                        c0.q.setValue((Object)p4m$d.C0);
                    }
                    return oyv.a;
                }
            }
        });
        this.b = b;
        this.c = oy6.w0((oy6)a).w0((oy6)b);
        this.d = new Object();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.q = (s7r)m0n.r((Object)p4m$d.E0);
        this.r = new p4m.p4m$c();
    }
    
    public static /* synthetic */ void A(final p4m p4m, final Exception ex, boolean b, final int n) {
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        p4m.z(ex, null, b);
    }
    
    public static final boolean p(final p4m p4m) {
        final boolean empty = p4m.i.isEmpty();
        boolean b = true;
        if (!(empty ^ true)) {
            b = (p4m.a.d() && b);
        }
        return b;
    }
    
    public static final dq6 q(final p4m p4m, dq6 dq6, final r5d r5d) {
        final boolean r = dq6.r();
        Object f;
        final Object o = f = null;
        if (!r) {
            if (((ke6)dq6).isDisposed()) {
                f = o;
            }
            else {
                f = ahq.Companion.f((rtb)new t4m(dq6), (rtb)new w4m(dq6, r5d));
                try {
                    final ahq i = ((ahq)f).i();
                    boolean b = true;
                    try {
                        if (!r5d.g()) {
                            b = false;
                        }
                        if (b) {
                            dq6.t((otb<oyv>)new s4m(r5d, dq6));
                        }
                        final boolean h = dq6.h();
                        ((ahq)f).p(i);
                        p4m.s((kuh)f);
                        if (!h) {
                            dq6 = null;
                        }
                        f = dq6;
                    }
                    finally {
                        ((ahq)f).p(i);
                    }
                }
                finally {
                    p4m.s((kuh)f);
                }
            }
        }
        return (dq6)f;
    }
    
    public static final void r(final p4m p4m) {
        if (p4m.h.isEmpty() ^ true) {
            final ArrayList h = p4m.h;
            for (int size = h.size(), i = 0; i < size; ++i) {
                final Set set = (Set)h.get(i);
                final ArrayList g = p4m.g;
                for (int size2 = g.size(), j = 0; j < size2; ++j) {
                    ((dq6)g.get(j)).o(set);
                }
            }
            p4m.h.clear();
            if (p4m.u() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }
    
    public static final void x(final List<jrh> list, final p4m p4m, final dq6 dq6) {
        list.clear();
        synchronized (p4m.d) {
            final Iterator iterator = p4m.k.iterator();
            while (iterator.hasNext()) {
                final jrh jrh = (jrh)iterator.next();
                if (zzd.a((Object)jrh.c, (Object)dq6)) {
                    list.add(jrh);
                    iterator.remove();
                }
            }
        }
    }
    
    public final void a(final dq6 ex, gub<? super m76, ? super Integer, oyv> d) {
        zzd.f((Object)ex, "composition");
        final boolean r = ((dq6)ex).r();
        try {
            final ahq$a companion = ahq.Companion;
            final kuh f = companion.f((rtb)new t4m((dq6)ex), (rtb)new w4m((dq6)ex, (r5d)null));
            try {
                final ahq i = ((ahq)f).i();
                try {
                    ((dq6)ex).i((gub<? super m76, ? super Integer, oyv>)d);
                    ((ahq)f).p(i);
                    this.s(f);
                    if (!r) {
                        companion.b();
                    }
                    d = this.d;
                    synchronized (d) {
                        if (((Enum<p4m$d>)this.q.getValue()).compareTo(p4m$d.D0) > 0 && !this.g.contains(ex)) {
                            this.g.add(ex);
                        }
                        monitorexit(d);
                        try {
                            this.w((dq6)ex);
                            try {
                                ((dq6)ex).q();
                                ((dq6)ex).c();
                                if (!r) {
                                    companion.b();
                                }
                            }
                            catch (final Exception ex) {
                                A(this, ex, false, 6);
                            }
                        }
                        catch (final Exception d) {
                            this.z((Exception)d, (dq6)ex, true);
                        }
                    }
                }
                finally {
                    ((ahq)f).p(i);
                }
            }
            finally {
                this.s(f);
            }
        }
        catch (final Exception ex2) {
            this.z(ex2, (dq6)ex, true);
        }
    }
    
    public final void b(final jrh jrh) {
        synchronized (this.d) {
            final LinkedHashMap l = this.l;
            final hrh<Object> a = jrh.a;
            zzd.f((Object)l, "<this>");
            Object value;
            if ((value = l.get(a)) == null) {
                value = new ArrayList<jrh>();
                l.put(a, value);
            }
            ((List<jrh>)value).add(jrh);
        }
    }
    
    public final boolean d() {
        return false;
    }
    
    public final int f() {
        return 1000;
    }
    
    public final oy6 g() {
        return this.c;
    }
    
    public final void h(final dq6 dq6) {
        zzd.f((Object)dq6, "composition");
        synchronized (this.d) {
            Object u;
            if (!this.i.contains(dq6)) {
                this.i.add(dq6);
                u = this.u();
            }
            else {
                u = null;
            }
            monitorexit(this.d);
            if (u != null) {
                ((ap6)u).resumeWith((Object)oyv.a);
            }
        }
    }
    
    public final void i(final jrh jrh, final irh irh) {
        synchronized (this.d) {
            this.m.put(jrh, irh);
        }
    }
    
    public final irh j(final jrh jrh) {
        zzd.f((Object)jrh, "reference");
        synchronized (this.d) {
            return (irh)this.m.remove(jrh);
        }
    }
    
    public final void k(final Set<ne6> set) {
    }
    
    public final void o(final dq6 dq6) {
        zzd.f((Object)dq6, "composition");
        synchronized (this.d) {
            this.g.remove(dq6);
            this.i.remove(dq6);
            this.j.remove(dq6);
        }
    }
    
    public final void s(final kuh kuh) {
        try {
            if (!(kuh.u() instanceof bhq.a)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        }
        finally {
            kuh.c();
        }
    }
    
    public final void t() {
        synchronized (this.d) {
            if (((Enum<p4m$d>)this.q.getValue()).compareTo(p4m$d.G0) >= 0) {
                this.q.setValue((Object)p4m$d.D0);
            }
            monitorexit(this.d);
            ((nae)this.b).a((CancellationException)null);
        }
    }
    
    public final gg3<oyv> u() {
        final p4m$d h0 = p4m$d.H0;
        p4m$d value = p4m$d.E0;
        final int compareTo = ((Enum<p4m$d>)this.q.getValue()).compareTo(p4m$d.D0);
        gg3<? super oyv> o = null;
        if (compareTo <= 0) {
            this.g.clear();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            this.k.clear();
            this.n = null;
            final gg3<? super oyv> o2 = this.o;
            if (o2 != null) {
                o2.v((Throwable)null);
            }
            this.o = null;
            this.p = null;
            return null;
        }
        if (this.p == null) {
            if (this.e == null) {
                this.h.clear();
                this.i.clear();
                if (this.a.d()) {
                    value = p4m$d.F0;
                }
            }
            else if (!(this.i.isEmpty() ^ true) && !(this.h.isEmpty() ^ true) && !(this.j.isEmpty() ^ true) && !(this.k.isEmpty() ^ true) && !this.a.d()) {
                value = p4m$d.G0;
            }
            else {
                value = h0;
            }
        }
        this.q.setValue((Object)value);
        if (value == h0) {
            o = this.o;
            this.o = null;
        }
        return (gg3<oyv>)o;
    }
    
    public final boolean v() {
        synchronized (this.d) {
            final boolean empty = this.h.isEmpty();
            boolean b2;
            final boolean b = b2 = true;
            if (!(empty ^ true)) {
                b2 = b;
                if (!(this.i.isEmpty() ^ true)) {
                    b2 = (this.a.d() && b);
                }
            }
            return b2;
        }
    }
    
    public final void w(final dq6 dq6) {
        Object d = this.d;
        synchronized (d) {
            final ArrayList k = this.k;
            final int size = k.size();
            final int n = 0;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= size) {
                    break;
                }
                if (zzd.a((Object)((jrh)k.get(n2)).c, (Object)dq6)) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            if (n3 == 0) {
                return;
            }
            monitorexit(d);
            d = new ArrayList<jrh>();
            x((List<jrh>)d, this, dq6);
            while (((ArrayList)d).isEmpty() ^ true) {
                this.y((List<jrh>)d, null);
                x((List<jrh>)d, this, dq6);
            }
        }
    }
    
    public final List<dq6> y(final List<jrh> list, final r5d<Object> r5d) {
        final HashMap<dq6, ArrayList> hashMap = new HashMap<dq6, ArrayList>(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            final jrh value = list.get(i);
            final dq6 c = value.c;
            ArrayList value2;
            if ((value2 = hashMap.get(c)) == null) {
                value2 = new ArrayList();
                hashMap.put(c, value2);
            }
            value2.add(value);
        }
        for (Map.Entry<dq6, V> entry : hashMap.entrySet()) {
            final dq6 dq6 = entry.getKey();
            final List list2 = (List)entry.getValue();
            ea6.g(dq6.r() ^ true);
            final kuh f = ahq.Companion.f((rtb)new t4m(dq6), (rtb)new w4m(dq6, (r5d)r5d));
            try {
                final ahq j = ((ahq)f).i();
                try {
                    synchronized (this.d) {
                        final ArrayList list3 = new ArrayList<gvj<jrh, jrh>>(list2.size());
                        for (int size2 = list2.size(), k = 0; k < size2; ++k) {
                            final jrh jrh = list2.get(k);
                            final LinkedHashMap l = this.l;
                            final hrh<Object> a = jrh.a;
                            zzd.f((Object)l, "<this>");
                            final List list4 = l.get(a);
                            Object s1;
                            if (list4 != null) {
                                s1 = mr4.s1((List)list4);
                                if (list4.isEmpty()) {
                                    l.remove(a);
                                    s1 = s1;
                                }
                            }
                            else {
                                s1 = null;
                            }
                            list3.add((gvj<jrh, jrh>)new gvj((Object)jrh, s1));
                        }
                        monitorexit(this.d);
                        dq6.f((List<gvj<jrh, jrh>>)list3);
                    }
                }
                finally {
                    ((ahq)f).p(j);
                }
            }
            finally {
                this.s(f);
            }
            break;
        }
        return or4.m2((Iterable)hashMap.keySet());
    }
    
    public final void z(final Exception ex, final dq6 dq6, final boolean b) {
        final Boolean value = p4m.t.get();
        zzd.e((Object)value, "_hotReloadEnabled.get()");
        if (value && !(ex instanceof ComposeRuntimeError)) {
            synchronized (this.d) {
                this.j.clear();
                this.i.clear();
                this.h.clear();
                this.k.clear();
                this.l.clear();
                this.m.clear();
                this.p = new p4m.p4m$b(ex);
                if (dq6 != null) {
                    ArrayList n;
                    if ((n = this.n) == null) {
                        n = new ArrayList();
                        this.n = n;
                    }
                    if (!n.contains(dq6)) {
                        n.add(dq6);
                    }
                    this.g.remove(dq6);
                }
                this.u();
                return;
            }
        }
        throw ex;
    }
}
