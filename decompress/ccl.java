import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel$a;
import java.util.List;
import java.util.Objects;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel$subscribeToProfileModules$2$2", f = "ProfileModuleContainerViewModel.kt", l = {}, m = "invokeSuspend")
public final class ccl extends l1s implements hub<awj<? extends noj<btm<z9w, zbv>>, ? extends String>, mp6<? super vzv>, Object>
{
    public Object F0;
    public final ProfileModuleContainerViewModel G0;
    
    public ccl(final ProfileModuleContainerViewModel g0, final mp6<? super ccl> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final ccl ccl = new ccl(this.G0, (mp6<? super ccl>)mp6);
        ccl.F0 = f0;
        return (mp6<vzv>)ccl;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final ccl ccl = (ccl)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        ccl.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object c) {
        jb2.M0(c);
        final awj awj = (awj)this.F0;
        final noj noj = (noj)awj.F0;
        final String s = (String)awj.G0;
        if (noj.f()) {
            c = noj.c();
            final ProfileModuleContainerViewModel g0 = this.G0;
            final btm btm = (btm)c;
            if (btm.d()) {
                g0.T0.a(ocl.d);
                final lcl.a companion = lcl.Companion;
                final List a = ((z9w)btm.c()).a();
                Objects.requireNonNull(companion);
                final tbl tbl = (tbl)rr4.E1(a);
                Object o;
                if (tbl != null) {
                    if (tbl instanceof uwm) {
                        o = new o0s$d((uwm)tbl);
                    }
                    else if (tbl instanceof f7) {
                        o = new o0s$a((f7)tbl);
                    }
                    else if (tbl instanceof u1q) {
                        o = new o0s$e((u1q)tbl);
                    }
                    else if (tbl instanceof ref) {
                        if (c5l.Companion.a()) {
                            o = new o0s$b((ref)tbl);
                        }
                        else {
                            o = dli.a;
                        }
                    }
                    else if (tbl instanceof jdh) {
                        if (c5l.Companion.c()) {
                            o = new o0s$c((jdh)tbl);
                        }
                        else {
                            o = dli.a;
                        }
                    }
                    else {
                        o = dli.a;
                    }
                }
                else {
                    o = dli.a;
                }
                e0e.e((Object)s, "profileId");
                if (o instanceof o0s) {
                    g0.S0.a(((o0s)o).b());
                    g0.T0.a(ocl.f);
                    ((MviViewModel)g0).Q((stb)new ecl((u29)o));
                }
                else {
                    Objects.requireNonNull(c5l.Companion);
                    final rmv b = ita.b();
                    int n2;
                    final int n = n2 = 0;
                    if (b.b("android_professional_no_spotlight_enabled", false)) {
                        n2 = n;
                        if (o instanceof dli) {
                            n2 = n;
                            if (e0e.a((Object)s, (Object)g0.U0)) {
                                n2 = n;
                                if (g0.W0) {
                                    n2 = 1;
                                }
                            }
                        }
                    }
                    if (n2 != 0) {
                        g0.S0.a((tbl)null);
                        ((MviViewModel)g0).Q((stb)fcl.F0);
                    }
                    else {
                        ((MviViewModel)g0).Q((stb)ybl.F0);
                    }
                }
            }
            else {
                final ocl t0 = g0.T0;
                final String e = ((zbv)btm.b()).e();
                Objects.requireNonNull(t0);
                final fg4 fg4 = new fg4(ocl.e);
                ((o1p)fg4).C = t0.a;
                final int a2 = o5j.a;
                ((o1p)fg4).D = e;
                sbw.b((tlm)fg4);
                ((MviViewModel)g0).Q((stb)ybl.F0);
            }
        }
        else {
            final ProfileModuleContainerViewModel g2 = this.G0;
            final ProfileModuleContainerViewModel$a companion2 = ProfileModuleContainerViewModel.Companion;
            ((MviViewModel)g2).Q((stb)ybl.F0);
        }
        return vzv.a;
    }
}
