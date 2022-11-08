import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkh
{
    public final uqj a;
    public final ouh<gvj<sg1, kkh<?>>> b;
    public final ouh<gvj<sg1, kkh<?>>> c;
    public final ouh<gvj<jwe, kkh<?>>> d;
    public boolean e;
    
    public mkh(final uqj a) {
        zzd.f((Object)a, "owner");
        this.a = a;
        this.b = (ouh<gvj<sg1, kkh<?>>>)new ouh((Object[])new gvj[16]);
        this.c = (ouh<gvj<sg1, kkh<?>>>)new ouh((Object[])new gvj[16]);
        this.d = (ouh<gvj<jwe, kkh<?>>>)new ouh((Object[])new gvj[16]);
    }
    
    public final void a() {
        if (!this.e) {
            this.e = true;
            this.a.t((otb)new mkh$a(this));
        }
    }
    
    public final void b(jkh.c c, final kkh<?> kkh, final Set<sg1> set) {
        final jkh.c c2 = c.C0;
        if (c2.I0) {
            final ouh ouh = new ouh((Object[])new jkh.c[16]);
            c = c2.G0;
            if (c == null) {
                ukg.q(ouh, c2);
            }
            else {
                ouh.b((Object)c);
            }
        Label_0054:
            while (ouh.m()) {
                final jkh.c c3 = (jkh.c)ouh.p(ouh.E0 - 1);
                if ((c3.E0 & 0x20) != 0x0) {
                    nkh nkh;
                    sg1 sg1;
                    boolean b = false;
                    for (c = c3; c != null; c = c.G0) {
                        if ((c.D0 & 0x20) != 0x0) {
                            Label_0193: {
                                if (c instanceof nkh) {
                                    nkh = (nkh)c;
                                    if (nkh instanceof sg1) {
                                        sg1 = (sg1)nkh;
                                        if (sg1.J0 instanceof lkh && sg1.N0.contains(kkh)) {
                                            set.add((sg1)nkh);
                                        }
                                    }
                                    if (nkh.f().H((kkh)kkh)) {
                                        b = false;
                                        break Label_0193;
                                    }
                                }
                                b = true;
                            }
                            if (!b) {
                                continue Label_0054;
                            }
                        }
                    }
                }
                ukg.q(ouh, c3);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void c(final sg1 sg1, final kkh<?> kkh) {
        zzd.f((Object)sg1, "node");
        zzd.f((Object)kkh, "key");
        this.d.b((Object)new gvj((Object)ukg.U0((pm8)sg1), (Object)kkh));
        this.a();
    }
}
