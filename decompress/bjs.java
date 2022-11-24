import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.ref.WeakReference;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjs implements ajk
{
    public final View a;
    public final csd b;
    public boolean c;
    public stb<? super List<? extends sr9>, vzv> d;
    public stb<? super z9d, vzv> e;
    public sis f;
    public aad g;
    public List<WeakReference<j6m>> h;
    public final nxe i;
    public final xp3<bjs.bjs$a> j;
    
    public bjs(final View a) {
        e0e.f((Object)a, "view");
        final Context context = a.getContext();
        e0e.e((Object)context, "view.context");
        final dsd b = new dsd(context);
        this.a = a;
        this.b = (csd)b;
        this.d = (stb<? super List<? extends sr9>, vzv>)ejs.F0;
        this.e = (stb<? super z9d, vzv>)fjs.F0;
        Objects.requireNonNull(zjs.Companion);
        this.f = new sis("", zjs.b, 4);
        Objects.requireNonNull(aad.Companion);
        this.g = aad.f;
        this.h = new ArrayList();
        this.i = jty.M(3, (ptb)new cjs(this));
        this.j = (ya)eg8.b(Integer.MAX_VALUE, null, 6);
    }
    
    public final void a(final sis f, final aad g, final stb<? super List<? extends sr9>, vzv> d, final stb<? super z9d, vzv> e) {
        e0e.f((Object)f, "value");
        e0e.f((Object)g, "imeOptions");
        e0e.f((Object)e, "onImeActionPerformed");
        this.c = true;
        this.f = f;
        this.g = g;
        this.d = d;
        this.e = e;
        ((ud)this.j).o((Object)bjs.bjs$a.F0);
    }
    
    public final void b() {
        this.c = false;
        this.d = (stb<? super List<? extends sr9>, vzv>)bjs$b.F0;
        this.e = (stb<? super z9d, vzv>)bjs$c.F0;
        ((ud)this.j).o((Object)bjs.bjs$a.G0);
    }
    
    public final void c(final sis sis, sis f) {
        final boolean b = zjs.b(this.f.b, f.b);
        final int n = 0;
        final boolean b2 = true;
        final boolean b3 = !b || !e0e.a((Object)this.f.c, (Object)f.c);
        this.f = f;
        for (int size = this.h.size(), i = 0; i < size; ++i) {
            final j6m j6m = this.h.get(i).get();
            if (j6m != null) {
                j6m.d = f;
            }
        }
        if (e0e.a((Object)sis, (Object)f)) {
            if (b3) {
                final csd b4 = this.b;
                final View a = this.a;
                final int g = zjs.g(f.b);
                final int f2 = zjs.f(f.b);
                final zjs c = this.f.c;
                int g2;
                if (c != null) {
                    g2 = zjs.g(c.a);
                }
                else {
                    g2 = -1;
                }
                final zjs c2 = this.f.c;
                int f3;
                if (c2 != null) {
                    f3 = zjs.f(c2.a);
                }
                else {
                    f3 = -1;
                }
                b4.b(a, g, f2, g2, f3);
            }
            return;
        }
        int n2 = 0;
        Label_0290: {
            if (sis != null) {
                n2 = (b2 ? 1 : 0);
                if (!e0e.a((Object)sis.a.F0, (Object)f.a.F0)) {
                    break Label_0290;
                }
                if (zjs.b(sis.b, f.b) && !e0e.a((Object)sis.c, (Object)f.c)) {
                    n2 = (b2 ? 1 : 0);
                    break Label_0290;
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            this.f();
        }
        else {
            for (int size2 = this.h.size(), j = n; j < size2; ++j) {
                final j6m j6m2 = this.h.get(j).get();
                if (j6m2 != null) {
                    f = this.f;
                    final csd b5 = this.b;
                    final View a2 = this.a;
                    e0e.f((Object)f, "state");
                    e0e.f((Object)b5, "inputMethodManager");
                    e0e.f((Object)a2, "view");
                    if (j6m2.h) {
                        j6m2.d = f;
                        if (j6m2.f) {
                            b5.d(a2, j6m2.e, shw.X0(f));
                        }
                        final zjs c3 = f.c;
                        int g3;
                        if (c3 != null) {
                            g3 = zjs.g(c3.a);
                        }
                        else {
                            g3 = -1;
                        }
                        final zjs c4 = f.c;
                        int f4;
                        if (c4 != null) {
                            f4 = zjs.f(c4.a);
                        }
                        else {
                            f4 = -1;
                        }
                        b5.b(a2, zjs.g(f.b), zjs.f(f.b), g3, f4);
                    }
                }
            }
        }
    }
    
    public final void d() {
        ((ud)this.j).o((Object)bjs.bjs$a.I0);
    }
    
    public final void e() {
        ((ud)this.j).o((Object)bjs.bjs$a.H0);
    }
    
    public final void f() {
        this.b.e(this.a);
    }
    
    public final Object g(final mp6<? super vzv> mp6) {
        Object o = null;
        Label_0053: {
            if (mp6 instanceof bjs$d) {
                final bjs$d bjs$d = (bjs$d)mp6;
                final int j0 = bjs$d.J0;
                if ((j0 & Integer.MIN_VALUE) != 0x0) {
                    bjs$d.J0 = j0 + Integer.MIN_VALUE;
                    o = bjs$d;
                    break Label_0053;
                }
            }
            o = new bjs$d(this, (mp6)mp6);
        }
        final Object h0 = ((bjs$d)o).H0;
        final jz6 f0 = jz6.F0;
        final int j2 = ((bjs$d)o).J0;
        while (true) {
            qq3 g0 = null;
            bjs f2 = null;
            mp6 mp7 = null;
            Boolean b = null;
            Label_0197: {
                Object g2;
                bjs f3;
                if (j2 != 0) {
                    if (j2 == 1) {
                        g0 = ((bjs$d)o).G0;
                        f2 = ((bjs$d)o).F0;
                        jb2.M0(h0);
                        mp7 = (mp6)o;
                        b = (Boolean)h0;
                        break Label_0197;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    jb2.M0(h0);
                    final ya i = this.j;
                    Objects.requireNonNull(i);
                    g2 = new ya$a(i);
                    f3 = this;
                }
                ((bjs$d)o).F0 = f3;
                ((bjs$d)o).G0 = (qq3)g2;
                ((bjs$d)o).J0 = 1;
                final Object a = ((qq3)g2).a((mp6)o);
                mp7 = (mp6)o;
                g0 = (qq3)g2;
                f2 = f3;
                if ((b = (Boolean)a) == f0) {
                    return f0;
                }
            }
            if (!b) {
                return vzv.a;
            }
            bjs.bjs$a bjs$a = (bjs.bjs$a)g0.next();
            if (!f2.a.isFocused()) {
                while (f2.j.s() instanceof xq3$c ^ true) {}
                o = mp7;
                final Object g2 = g0;
                final bjs f3 = f2;
                continue;
            }
            Boolean b2 = null;
            Boolean value = null;
            while (bjs$a != null) {
                final int ordinal = ((Enum)bjs$a).ordinal();
                Boolean b3 = null;
                Label_0364: {
                    Boolean b4;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                b3 = b2;
                                break Label_0364;
                            }
                            b3 = b2;
                            if (!e0e.a((Object)b2, (Object)Boolean.FALSE)) {
                                value = (bjs$a == bjs.bjs$a.H0);
                                b3 = b2;
                            }
                            break Label_0364;
                        }
                        else {
                            b4 = Boolean.FALSE;
                        }
                    }
                    else {
                        b4 = Boolean.TRUE;
                    }
                    value = b4;
                    b3 = b4;
                }
                bjs$a = (bjs.bjs$a)xq3.a(f2.j.s());
                b2 = b3;
            }
            if (e0e.a((Object)b2, (Object)Boolean.TRUE)) {
                f2.f();
            }
            if (value != null) {
                if (value) {
                    f2.b.c(f2.a);
                }
                else {
                    f2.b.a(f2.a.getWindowToken());
                }
            }
            o = mp7;
            Object g2 = g0;
            bjs f3 = f2;
            if (e0e.a((Object)b2, (Object)Boolean.FALSE)) {
                f2.f();
                o = mp7;
                g2 = g0;
                f3 = f2;
            }
            continue;
        }
    }
}
