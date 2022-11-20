import java.util.Objects;
import java.util.concurrent.CancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hb9
{
    public static final hb9$a a;
    public static final hb9$b b;
    public static final float c;
    
    static {
        a = new hb9$a();
        b = new hb9$b();
        c = (float)0.125 / 18;
    }
    
    public static final Object a(final le1 le1, final long d0, final go6<? super hpk> go6) {
        Object o = null;
        Label_0053: {
            if (go6 instanceof hb9$c) {
                final hb9$c hb9$c = (hb9$c)go6;
                final int g0 = hb9$c.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    hb9$c.G0 = g0 + Integer.MIN_VALUE;
                    o = hb9$c;
                    break Label_0053;
                }
            }
            o = new hb9$c((go6)go6);
        }
        Object o2 = ((hb9$c)o).F0;
        final dy6 d2 = dy6.D0;
        final int g2 = ((hb9$c)o).G0;
        final Object o3 = null;
        final int n = 1;
        while (true) {
        Label_0157:
            while (true) {
                q7m e0 = null;
                Label_0194: {
                    le1 d3;
                    if (g2 != 0) {
                        if (g2 == 1) {
                            e0 = ((hb9$c)o).E0;
                            d3 = ((hb9$c)o).D0;
                            b1n.u(o2);
                            break Label_0194;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        b1n.u(o2);
                        if (f(le1.e0(), d0)) {
                            return null;
                        }
                        final q7m q7m = new q7m();
                        q7m.D0 = d0;
                        d3 = le1;
                        e0 = q7m;
                    }
                    ((hb9$c)o).D0 = d3;
                    ((hb9$c)o).E0 = e0;
                    ((hb9$c)o).G0 = 1;
                    o2 = g4k.d(d3, (bpk)null, (go6)o, 1, (Object)null);
                    if (o2 == d2) {
                        return d2;
                    }
                }
                final apk apk = (apk)o2;
                final List a = apk.a;
                for (int size = a.size(), i = 0; i < size; ++i) {
                    final Object value = a.get(i);
                    if (gpk.a(((hpk)value).a, e0.D0)) {
                        final hpk hpk = (hpk)value;
                        hpk hpk3 = null;
                        Label_0394: {
                            if (hpk != null) {
                                Label_0427: {
                                    if (gmw.l(hpk)) {
                                        final List a2 = apk.a;
                                        final int size2 = a2.size();
                                        int j = 0;
                                        while (true) {
                                            while (j < size2) {
                                                final Object value2 = a2.get(j);
                                                if (((hpk)value2).d) {
                                                    final hpk hpk2 = (hpk)value2;
                                                    if (hpk2 == null) {
                                                        hpk3 = hpk;
                                                        break Label_0394;
                                                    }
                                                    e0.D0 = hpk2.a;
                                                    break Label_0427;
                                                }
                                                else {
                                                    ++j;
                                                }
                                            }
                                            final Object value2 = null;
                                            continue;
                                        }
                                    }
                                    if (gmw.P(hpk)) {
                                        hpk3 = hpk;
                                        break Label_0394;
                                    }
                                }
                                continue Label_0157;
                            }
                            hpk3 = null;
                        }
                        int n2;
                        if (hpk3 != null && !hpk3.d()) {
                            n2 = n;
                        }
                        else {
                            n2 = 0;
                        }
                        Object o4 = o3;
                        if (n2 != 0) {
                            o4 = hpk3;
                        }
                        return o4;
                    }
                }
                break;
            }
            final Object value = null;
            continue;
        }
    }
    
    public static final Object b(le1 d0, long c, final go6<? super hpk> go6) {
        Object o = null;
        Label_0053: {
            if (go6 instanceof hb9$d) {
                final hb9$d hb9$d = (hb9$d)go6;
                final int g0 = hb9$d.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    hb9$d.G0 = g0 + Integer.MIN_VALUE;
                    o = hb9$d;
                    break Label_0053;
                }
            }
            o = new hb9$d((go6)go6);
        }
        final Object f0 = ((hb9$d)o).F0;
        final dy6 d2 = dy6.D0;
        final int g2 = ((hb9$d)o).G0;
        final le1 le1 = null;
        r7m r7m = null;
        Label_0324: {
            if (g2 != 0) {
                if (g2 == 1) {
                    final r7m e0 = ((hb9$d)o).E0;
                    d0 = (le1)((hb9$d)o).D0;
                    try {
                        b1n.u(f0);
                        d0 = le1;
                        return d0;
                    }
                    catch (final PointerEventTimeoutCancellationException ex) {
                        r7m = e0;
                        break Label_0324;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(f0);
            if (f(d0.e0(), c)) {
                return null;
            }
            final List a = d0.e0().a;
            int i = 0;
            while (true) {
            Label_0437_Outer:
                while (i < a.size()) {
                    final Object value = a.get(i);
                    if (gpk.a(((hpk)value).a, c)) {
                        final hpk hpk = (hpk)value;
                        if (hpk == null) {
                            return null;
                        }
                        final r7m e2 = new r7m();
                        final r7m r7m2 = new r7m();
                        r7m2.D0 = hpk;
                        c = d0.getViewConfiguration().c();
                        try {
                            final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(r7m2, e2, null) {
                                public apk E0;
                                public int F0;
                                public int G0;
                                public Object H0;
                                public final r7m<hpk> I0;
                                public final r7m<hpk> J0;
                                
                                public final go6<fzv> create(final Object h0, final go6<?> go6) {
                                    final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(this.I0, this.J0, go6) {
                                        public apk E0;
                                        public int F0;
                                        public int G0;
                                        public Object H0;
                                        public final r7m<hpk> I0;
                                        public final r7m<hpk> J0;
                                    };
                                    ftb.H0 = h0;
                                    return (go6<fzv>)ftb;
                                }
                                
                                public final Object invoke(final Object o, final Object o2) {
                                    return ((hb9$e)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                                }
                                
                                public final Object invokeSuspend(final Object o) {
                                    final dy6 d0 = dy6.D0;
                                    final int g0 = this.G0;
                                    while (true) {
                                    Label_0109:
                                        while (true) {
                                            ftb<le1, go6<? super fzv>, Object> ftb = null;
                                            apk e0 = null;
                                            Object g3 = null;
                                            Label_0380: {
                                                int n = 0;
                                                le1 le1 = null;
                                                Object g2 = null;
                                                Label_0161: {
                                                    if (g0 != 0) {
                                                        if (g0 == 1) {
                                                            n = this.F0;
                                                            le1 = (le1)this.H0;
                                                            b1n.u(o);
                                                            g2 = o;
                                                            ftb = this;
                                                            break Label_0161;
                                                        }
                                                        if (g0 == 2) {
                                                            n = this.F0;
                                                            e0 = this.E0;
                                                            le1 = (le1)this.H0;
                                                            b1n.u(o);
                                                            g3 = o;
                                                            ftb = this;
                                                            break Label_0380;
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    else {
                                                        b1n.u(o);
                                                        le1 = (le1)this.H0;
                                                        ftb = this;
                                                        n = 0;
                                                    }
                                                    if (n != 0) {
                                                        return fzv.a;
                                                    }
                                                    final bpk e2 = bpk.E0;
                                                    ftb.H0 = le1;
                                                    ftb.E0 = null;
                                                    ftb.F0 = n;
                                                    ftb.G0 = 1;
                                                    g2 = le1.g0(e2, (go6)ftb);
                                                    if (g2 == d0) {
                                                        return d0;
                                                    }
                                                }
                                                e0 = (apk)g2;
                                                final List a = e0.a;
                                                while (true) {
                                                    for (int size = a.size(), i = 0; i < size; ++i) {
                                                        if (!gmw.l((hpk)a.get(i))) {
                                                            final boolean b = false;
                                                            if (b) {
                                                                n = 1;
                                                            }
                                                            final List a2 = e0.a;
                                                            final int size2 = a2.size();
                                                            int j = 0;
                                                            while (true) {
                                                                while (j < size2) {
                                                                    final hpk hpk = a2.get(j);
                                                                    if (hpk.d() || gmw.E(hpk, le1.a(), le1.Q())) {
                                                                        final boolean b2 = true;
                                                                        if (b2) {
                                                                            n = 1;
                                                                        }
                                                                        final bpk f0 = bpk.F0;
                                                                        ftb.H0 = le1;
                                                                        ftb.E0 = e0;
                                                                        ftb.F0 = n;
                                                                        ftb.G0 = 2;
                                                                        g3 = le1.g0(f0, (go6)ftb);
                                                                        if (g3 == d0) {
                                                                            return d0;
                                                                        }
                                                                        break Label_0380;
                                                                    }
                                                                    else {
                                                                        ++j;
                                                                    }
                                                                }
                                                                final boolean b2 = false;
                                                                continue Label_0437_Outer;
                                                            }
                                                        }
                                                    }
                                                    final boolean b = true;
                                                    continue Label_0437_Outer;
                                                }
                                            }
                                            final List a3 = ((apk)g3).a;
                                        Label_0646_Outer:
                                            for (int size3 = a3.size(), k = 0; k < size3; ++k) {
                                                if (((hpk)a3.get(k)).d()) {
                                                    final boolean b3 = true;
                                                    if (b3) {
                                                        final int n = 1;
                                                    }
                                                    Label_0653: {
                                                        if (hb9.f(e0, ((hpk)ftb.I0.D0).a)) {
                                                            final List a4 = e0.a;
                                                            final int size4 = a4.size();
                                                            int l = 0;
                                                            while (true) {
                                                                while (l < size4) {
                                                                    final Object value = a4.get(l);
                                                                    if (((hpk)value).d) {
                                                                        final hpk hpk2 = (hpk)value;
                                                                        if (hpk2 != null) {
                                                                            ftb.I0.D0 = hpk2;
                                                                            ftb.J0.D0 = hpk2;
                                                                            break Label_0653;
                                                                        }
                                                                        final int n = 1;
                                                                        break Label_0653;
                                                                    }
                                                                    else {
                                                                        ++l;
                                                                    }
                                                                }
                                                                final Object value = null;
                                                                continue Label_0646_Outer;
                                                            }
                                                        }
                                                        final r7m<hpk> j2 = ftb.J0;
                                                        final List a5 = e0.a;
                                                        final r7m<hpk> i2 = ftb.I0;
                                                        while (true) {
                                                            for (int size5 = a5.size(), n2 = 0; n2 < size5; ++n2) {
                                                                final Object value2 = a5.get(n2);
                                                                if (gpk.a(((hpk)value2).a, ((hpk)i2.D0).a)) {
                                                                    final Object d2 = value2;
                                                                    j2.D0 = d2;
                                                                    break Label_0653;
                                                                }
                                                            }
                                                            final Object d2 = null;
                                                            continue;
                                                        }
                                                    }
                                                    continue Label_0109;
                                                }
                                            }
                                            break;
                                        }
                                        final boolean b3 = false;
                                        continue;
                                    }
                                }
                            };
                            ((hb9$d)o).D0 = hpk;
                            ((hb9$d)o).E0 = e2;
                            ((hb9$d)o).G0 = 1;
                            final Object j0 = d0.j0(c, (ftb)ftb, (go6)o);
                            d0 = le1;
                            if (j0 == d2) {
                                return d2;
                            }
                            return d0;
                        }
                        catch (final PointerEventTimeoutCancellationException ex2) {
                            r7m = e2;
                            d0 = (le1)hpk;
                        }
                        break Label_0324;
                    }
                    else {
                        ++i;
                    }
                }
                final Object value = null;
                continue;
            }
        }
        final Object o2 = r7m.D0;
        if (o2 != null) {
            d0 = (le1)o2;
        }
        return d0;
    }
    
    public static final Object c(final ppk ppk, final qsb<? super wfj, fzv> qsb, final nsb<fzv> nsb, final nsb<fzv> nsb2, final ftb<? super hpk, ? super wfj, fzv> ftb, final go6<? super fzv> go6) {
        final Object b = wkb.b(ppk, (ftb)new ftb<ppk, go6<? super fzv>, Object>(nsb2, qsb, nsb, ftb, null) {
            public int D0;
            public Object E0;
            public final nsb<fzv> F0;
            public final qsb<wfj, fzv> G0;
            public final nsb<fzv> H0;
            public final ftb<hpk, wfj, fzv> I0;
            
            public final go6<fzv> create(final Object e0, final go6<?> go6) {
                final ftb<ppk, go6<? super fzv>, Object> ftb = (ftb<ppk, go6<? super fzv>, Object>)new ftb<ppk, go6<? super fzv>, Object>(this.F0, this.G0, this.H0, this.I0, go6) {
                    public int D0;
                    public Object E0;
                    public final nsb<fzv> F0;
                    public final qsb<wfj, fzv> G0;
                    public final nsb<fzv> H0;
                    public final ftb<hpk, wfj, fzv> I0;
                };
                ftb.E0 = e0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((hb9$f)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(Object z) {
                final dy6 d0 = dy6.D0;
                final int d2 = this.D0;
                if (d2 != 0) {
                    if (d2 == 1) {
                        Label_0103: {
                            try {
                                b1n.u(z);
                                return fzv.a;
                            }
                            catch (final CancellationException ex) {
                                break Label_0103;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        this.F0.invoke();
                        throw;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b1n.u(z);
                final ppk ppk = (ppk)this.E0;
                z = new ftb<le1, go6<? super fzv>, Object>(this.G0, this.H0, this.F0, this.I0, null) {
                    public int E0;
                    public Object F0;
                    public final qsb<wfj, fzv> G0;
                    public final nsb<fzv> H0;
                    public final nsb<fzv> I0;
                    public final ftb<hpk, wfj, fzv> J0;
                    
                    public final go6<fzv> create(final Object f0, final go6<?> go6) {
                        final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(this.G0, this.H0, this.I0, this.J0, go6) {
                            public int E0;
                            public Object F0;
                            public final qsb<wfj, fzv> G0;
                            public final nsb<fzv> H0;
                            public final nsb<fzv> I0;
                            public final ftb<hpk, wfj, fzv> J0;
                        };
                        ftb.F0 = f0;
                        return (go6<fzv>)ftb;
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((hb9$f$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                    }
                    
                    public final Object invokeSuspend(Object o) {
                        final dy6 d0 = dy6.D0;
                        final int e0 = this.E0;
                        int i = 0;
                        le1 f0 = null;
                        Label_0256: {
                            Label_0178: {
                                if (e0 != 0) {
                                    if (e0 != 1) {
                                        if (e0 == 2) {
                                            f0 = (le1)this.F0;
                                            b1n.u(o);
                                            break Label_0178;
                                        }
                                        if (e0 == 3) {
                                            f0 = (le1)this.F0;
                                            b1n.u(o);
                                            break Label_0256;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        f0 = (le1)this.F0;
                                        b1n.u(o);
                                    }
                                }
                                else {
                                    b1n.u(o);
                                    f0 = (le1)this.F0;
                                    this.F0 = f0;
                                    this.E0 = 1;
                                    if ((o = yas.b(f0, false, (go6<? super hpk>)this)) == d0) {
                                        return d0;
                                    }
                                }
                                final long a = ((hpk)o).a;
                                this.F0 = f0;
                                this.E0 = 2;
                                if ((o = hb9.b(f0, a, (go6<? super hpk>)this)) == d0) {
                                    return d0;
                                }
                            }
                            final hpk hpk = (hpk)o;
                            if (hpk == null) {
                                return fzv.a;
                            }
                            this.G0.invoke((Object)new wfj(hpk.c));
                            final long a2 = hpk.a;
                            o = new hb9$f$a$a((ftb)this.J0);
                            this.F0 = f0;
                            this.E0 = 3;
                            o = hb9.d(f0, a2, (qsb<? super hpk, fzv>)o, (go6<? super Boolean>)this);
                            if (o == d0) {
                                return d0;
                            }
                        }
                        if (o) {
                            for (List a3 = f0.e0().a; i < a3.size(); ++i) {
                                final hpk hpk2 = a3.get(i);
                                if (gmw.k(hpk2)) {
                                    hpk2.a();
                                }
                            }
                            this.H0.invoke();
                        }
                        else {
                            this.I0.invoke();
                        }
                        return fzv.a;
                    }
                };
                this.D0 = 1;
                z = ppk.Z((ftb)z, (go6)this);
                if (z == d0) {
                    return d0;
                }
                return fzv.a;
            }
        }, (go6)go6);
        if (b == dy6.D0) {
            return b;
        }
        return fzv.a;
    }
    
    public static final Object d(le1 d0, long a, qsb<? super hpk, fzv> e0, final go6<? super Boolean> go6) {
        Object o = null;
        Label_0058: {
            if (go6 instanceof hb9$g) {
                final hb9$g hb9$g = (hb9$g)go6;
                final int g0 = hb9$g.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    hb9$g.G0 = g0 + Integer.MIN_VALUE;
                    o = hb9$g;
                    break Label_0058;
                }
            }
            o = new hb9$g((go6)go6);
        }
        Object o2 = ((hb9$g)o).F0;
        final dy6 d2 = dy6.D0;
        final int g2 = ((hb9$g)o).G0;
        while (true) {
            Label_0164: {
                if (g2 != 0) {
                    if (g2 == 1) {
                        e0 = ((hb9$g)o).E0;
                        d0 = ((hb9$g)o).D0;
                        b1n.u(o2);
                        break Label_0164;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    b1n.u(o2);
                }
                ((hb9$g)o).D0 = d0;
                ((hb9$g)o).E0 = e0;
                ((hb9$g)o).G0 = 1;
                if ((o2 = a(d0, a, (go6<? super hpk>)o)) == d2) {
                    return d2;
                }
            }
            final hpk hpk = (hpk)o2;
            if (hpk == null) {
                return Boolean.FALSE;
            }
            if (gmw.l(hpk)) {
                return Boolean.TRUE;
            }
            e0.invoke((Object)hpk);
            a = hpk.a;
            continue;
        }
    }
    
    public static final Object e(le1 e0, long a, final qsb<? super hpk, fzv> qsb, final go6<? super Boolean> go6) {
        hb9$h hb9$h2 = null;
        Label_0058: {
            if (go6 instanceof hb9$h) {
                final hb9$h hb9$h = (hb9$h)go6;
                final int i0 = hb9$h.I0;
                if ((i0 & Integer.MIN_VALUE) != 0x0) {
                    hb9$h.I0 = i0 + Integer.MIN_VALUE;
                    hb9$h2 = hb9$h;
                    break Label_0058;
                }
            }
            hb9$h2 = new hb9$h((go6)go6);
        }
        Object o = hb9$h2.H0;
        dy6 d0 = dy6.D0;
        final int i2 = hb9$h2.I0;
        while (true) {
        Label_0179:
            while (true) {
            Label_0205:
                while (true) {
                    q7m g0 = null;
                    le1 f0 = null;
                    qsb d3 = null;
                    Label_0266: {
                        go6 go7;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                g0 = hb9$h2.G0;
                                f0 = hb9$h2.F0;
                                e0 = hb9$h2.E0;
                                final qsb d2 = hb9$h2.D0;
                                b1n.u(o);
                                go7 = (go6)hb9$h2;
                                d3 = d2;
                                break Label_0266;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            b1n.u(o);
                            if (f(e0.e0(), a)) {
                                return Boolean.FALSE;
                            }
                            go7 = (go6)hb9$h2;
                            d3 = qsb;
                        }
                        final q7m g2 = new q7m();
                        g2.D0 = a;
                        final le1 le1 = e0;
                        final dy6 dy6 = d0;
                        final le1 f2 = le1;
                        ((hb9$h)go7).D0 = d3;
                        ((hb9$h)go7).E0 = e0;
                        ((hb9$h)go7).F0 = f2;
                        ((hb9$h)go7).G0 = g2;
                        ((hb9$h)go7).I0 = 1;
                        o = g4k.d(f2, (bpk)null, go7, 1, (Object)null);
                        if (o == dy6) {
                            return dy6;
                        }
                        f0 = f2;
                        d0 = dy6;
                        g0 = g2;
                    }
                    final apk apk = (apk)o;
                    final List a2 = apk.a;
                    final int size = a2.size();
                    final int n = 0;
                    final int n2 = 0;
                    int j = 0;
                    while (j < size) {
                        final Object value = a2.get(j);
                        if (gpk.a(((hpk)value).a, g0.D0)) {
                            final hpk hpk = (hpk)value;
                            hpk hpk3 = null;
                            Label_0498: {
                                if (hpk != null) {
                                    Label_0558: {
                                        if (gmw.l(hpk)) {
                                            final List a3 = apk.a;
                                            final int size2 = a3.size();
                                            int k = n2;
                                            while (true) {
                                                while (k < size2) {
                                                    final Object value2 = a3.get(k);
                                                    if (((hpk)value2).d) {
                                                        final hpk hpk2 = (hpk)value2;
                                                        if (hpk2 == null) {
                                                            hpk3 = hpk;
                                                            break Label_0498;
                                                        }
                                                        g0.D0 = hpk2.a;
                                                        break Label_0558;
                                                    }
                                                    else {
                                                        ++k;
                                                    }
                                                }
                                                final Object value2 = null;
                                                continue;
                                            }
                                        }
                                        int n3 = n;
                                        if (wfj.d(gmw.O(hpk, true)) == 0.0f) {
                                            n3 = 1;
                                        }
                                        if ((n3 ^ 0x1) != 0x0) {
                                            hpk3 = hpk;
                                            break Label_0498;
                                        }
                                    }
                                    final q7m g2 = g0;
                                    final dy6 dy6 = d0;
                                    final le1 f2 = f0;
                                    continue Label_0205;
                                }
                                hpk3 = null;
                            }
                            if (hpk3 == null) {
                                return Boolean.FALSE;
                            }
                            if (hpk3.d()) {
                                return Boolean.FALSE;
                            }
                            if (gmw.l(hpk3)) {
                                return Boolean.TRUE;
                            }
                            d3.invoke((Object)hpk3);
                            a = hpk3.a;
                            continue Label_0179;
                        }
                        else {
                            ++j;
                        }
                    }
                    break;
                }
                break;
            }
            final Object value = null;
            continue;
        }
    }
    
    public static final boolean f(final apk apk, final long n) {
        final List a = apk.a;
        final int size = a.size();
        final boolean b = false;
        while (true) {
            for (int i = 0; i < size; ++i) {
                final Object value = a.get(i);
                if (gpk.a(((hpk)value).a, n)) {
                    final hpk hpk = (hpk)value;
                    boolean b2 = b;
                    if (hpk != null) {
                        b2 = b;
                        if (hpk.d) {
                            b2 = true;
                        }
                    }
                    return true ^ b2;
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public static final float g(final t6x t6x, int n) {
        czd.f((Object)t6x, "$this$pointerSlop");
        Objects.requireNonNull(tpk.Companion);
        if (n == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        float e;
        if (n != 0) {
            e = t6x.e() * hb9.c;
        }
        else {
            e = t6x.e();
        }
        return e;
    }
    
    public static final Object h(le1 e0, long a, final qsb<? super hpk, fzv> qsb, final go6<? super Boolean> go6) {
        hb9$i hb9$i2 = null;
        Label_0058: {
            if (go6 instanceof hb9$i) {
                final hb9$i hb9$i = (hb9$i)go6;
                final int i0 = hb9$i.I0;
                if ((i0 & Integer.MIN_VALUE) != 0x0) {
                    hb9$i.I0 = i0 + Integer.MIN_VALUE;
                    hb9$i2 = hb9$i;
                    break Label_0058;
                }
            }
            hb9$i2 = new hb9$i((go6)go6);
        }
        Object o = hb9$i2.H0;
        dy6 d0 = dy6.D0;
        final int i2 = hb9$i2.I0;
        while (true) {
        Label_0183:
            while (true) {
            Label_0211:
                while (true) {
                    q7m g0 = null;
                    le1 f0 = null;
                    go6 go7 = null;
                    qsb d3 = null;
                    Label_0278: {
                        go6 go8;
                        dy6 dy7;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                g0 = hb9$i2.G0;
                                f0 = hb9$i2.F0;
                                e0 = hb9$i2.E0;
                                final qsb d2 = hb9$i2.D0;
                                b1n.u(o);
                                go7 = (go6)hb9$i2;
                                d3 = d2;
                                break Label_0278;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            b1n.u(o);
                            if (f(e0.e0(), a)) {
                                return Boolean.FALSE;
                            }
                            final dy6 dy6 = d0;
                            go8 = (go6)hb9$i2;
                            d3 = qsb;
                            dy7 = dy6;
                        }
                        final q7m g2 = new q7m();
                        g2.D0 = a;
                        final le1 le1 = e0;
                        final dy6 dy8 = dy7;
                        final le1 f2 = le1;
                        final Object o2 = go8;
                        ((hb9$i)o2).D0 = d3;
                        ((hb9$i)o2).E0 = e0;
                        ((hb9$i)o2).F0 = f2;
                        ((hb9$i)o2).G0 = g2;
                        ((hb9$i)o2).I0 = 1;
                        o = g4k.d(f2, (bpk)null, (go6)o2, 1, (Object)null);
                        if (o == dy8) {
                            return dy8;
                        }
                        f0 = f2;
                        d0 = dy8;
                        g0 = g2;
                        go7 = (go6)o2;
                    }
                    final apk apk = (apk)o;
                    final List a2 = apk.a;
                    final int size = a2.size();
                    final int n = 0;
                    final int n2 = 0;
                    int j = 0;
                    while (j < size) {
                        final Object value = a2.get(j);
                        if (gpk.a(((hpk)value).a, g0.D0)) {
                            final hpk hpk = (hpk)value;
                            hpk hpk3 = null;
                            Label_0510: {
                                if (hpk != null) {
                                    Label_0580: {
                                        if (gmw.l(hpk)) {
                                            final List a3 = apk.a;
                                            final int size2 = a3.size();
                                            int k = n2;
                                            while (true) {
                                                while (k < size2) {
                                                    final Object value2 = a3.get(k);
                                                    if (((hpk)value2).d) {
                                                        final hpk hpk2 = (hpk)value2;
                                                        if (hpk2 == null) {
                                                            hpk3 = hpk;
                                                            break Label_0510;
                                                        }
                                                        g0.D0 = hpk2.a;
                                                        break Label_0580;
                                                    }
                                                    else {
                                                        ++k;
                                                    }
                                                }
                                                final Object value2 = null;
                                                continue;
                                            }
                                        }
                                        int n3 = n;
                                        if (wfj.e(gmw.O(hpk, true)) == 0.0f) {
                                            n3 = 1;
                                        }
                                        if ((n3 ^ 0x1) != 0x0) {
                                            hpk3 = hpk;
                                            break Label_0510;
                                        }
                                    }
                                    final Object o2 = go7;
                                    final q7m g2 = g0;
                                    final dy6 dy8 = d0;
                                    final le1 f2 = f0;
                                    continue Label_0211;
                                }
                                hpk3 = null;
                            }
                            if (hpk3 == null) {
                                return Boolean.FALSE;
                            }
                            if (hpk3.d()) {
                                return Boolean.FALSE;
                            }
                            if (gmw.l(hpk3)) {
                                return Boolean.TRUE;
                            }
                            d3.invoke((Object)hpk3);
                            a = hpk3.a;
                            final dy6 dy9 = d0;
                            final go6 go8 = go7;
                            final dy6 dy7 = dy9;
                            continue Label_0183;
                        }
                        else {
                            ++j;
                        }
                    }
                    break;
                }
                break;
            }
            final Object value = null;
            continue;
        }
    }
}
