import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rkh
{
    public final zqj a;
    public final suh<lvj<og1, pkh<?>>> b;
    public final suh<lvj<og1, pkh<?>>> c;
    public final suh<lvj<vve, pkh<?>>> d;
    public boolean e;
    
    public rkh(final zqj a) {
        czd.f((Object)a, "owner");
        this.a = a;
        this.b = (suh<lvj<og1, pkh<?>>>)new suh((Object[])new lvj[16]);
        this.c = (suh<lvj<og1, pkh<?>>>)new suh((Object[])new lvj[16]);
        this.d = (suh<lvj<vve, pkh<?>>>)new suh((Object[])new lvj[16]);
    }
    
    public final void a() {
        if (!this.e) {
            this.e = true;
            this.a.t((nsb)new rkh$a(this));
        }
    }
    
    public final void b(okh$c okh$c, final pkh<?> pkh, final Set<og1> set) {
        okh$c = okh$c.D0;
        if (okh$c.J0) {
            final suh suh = new suh((Object[])new okh$c[16]);
            final okh$c h0 = okh$c.H0;
            if (h0 == null) {
                wd.l(suh, okh$c);
            }
            else {
                suh.b((Object)h0);
            }
        Label_0053:
            while (suh.m()) {
                final okh$c okh$c2 = (okh$c)suh.p(suh.F0 - 1);
                if ((okh$c2.F0 & 0x20) != 0x0) {
                    skh skh;
                    og1 og1;
                    boolean b = false;
                    for (okh$c = okh$c2; okh$c != null; okh$c = okh$c.H0) {
                        if ((okh$c.E0 & 0x20) != 0x0) {
                            Label_0192: {
                                if (okh$c instanceof skh) {
                                    skh = (skh)okh$c;
                                    if (skh instanceof og1) {
                                        og1 = (og1)skh;
                                        if (og1.K0 instanceof qkh && og1.O0.contains(pkh)) {
                                            set.add((og1)skh);
                                        }
                                    }
                                    if (skh.f().H((pkh)pkh)) {
                                        b = false;
                                        break Label_0192;
                                    }
                                }
                                b = true;
                            }
                            if (!b) {
                                continue Label_0053;
                            }
                        }
                    }
                }
                wd.l(suh, okh$c2);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void c(final og1 og1, final pkh<?> pkh) {
        czd.f((Object)og1, "node");
        czd.f((Object)pkh, "key");
        this.d.b((Object)new lvj((Object)wd.y((yl8)og1), (Object)pkh));
        this.a();
    }
}
