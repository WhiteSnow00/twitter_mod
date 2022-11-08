import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel$a;
import java.util.List;
import java.util.Objects;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel$subscribeToProfileModules$2$2", f = "ProfileModuleContainerViewModel.kt", l = {}, m = "invokeSuspend")
public final class cbl extends xzr implements gub<gvj<? extends snj<vrm<b9w, pav>>, ? extends String>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ProfileModuleContainerViewModel D0;
    
    public cbl(final ProfileModuleContainerViewModel d0, final ap6<? super cbl> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final cbl cbl = new cbl(this.D0, (ap6<? super cbl>)ap6);
        cbl.C0 = c0;
        return (ap6<oyv>)cbl;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final cbl cbl = (cbl)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        cbl.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object c) {
        kq9.b1(c);
        final gvj gvj = (gvj)this.C0;
        final snj snj = (snj)gvj.C0;
        final String s = (String)gvj.D0;
        if (snj.f()) {
            c = snj.c();
            final ProfileModuleContainerViewModel d0 = this.D0;
            final vrm vrm = (vrm)c;
            if (vrm.d()) {
                d0.Q0.a(obl.d);
                final lbl$a companion = lbl.Companion;
                final List a = ((b9w)vrm.c()).a();
                Objects.requireNonNull(companion);
                final ual ual = (ual)or4.I1(a);
                Object o;
                if (ual != null) {
                    if (ual instanceof nvm) {
                        o = new azr.d((nvm)ual);
                    }
                    else if (ual instanceof h7) {
                        o = new azr.a((h7)ual);
                    }
                    else if (ual instanceof g0q) {
                        o = new azr.e((g0q)ual);
                    }
                    else if (ual instanceof ief) {
                        if (e4l.Companion.a()) {
                            o = new azr.b((ief)ual);
                        }
                        else {
                            o = jki.a;
                        }
                    }
                    else if (ual instanceof sch) {
                        if (e4l.Companion.c()) {
                            o = new azr.c((sch)ual);
                        }
                        else {
                            o = jki.a;
                        }
                    }
                    else {
                        o = jki.a;
                    }
                }
                else {
                    o = jki.a;
                }
                zzd.e((Object)s, "profileId");
                if (o instanceof azr) {
                    d0.P0.a(((azr)o).b());
                    d0.Q0.a(obl.f);
                    ((MviViewModel)d0).Q((rtb)new ebl((c29)o));
                }
                else {
                    Objects.requireNonNull(e4l.Companion);
                    final hlv b = dta.b();
                    int n2;
                    final int n = n2 = 0;
                    if (b.b("android_professional_no_spotlight_enabled", false)) {
                        n2 = n;
                        if (o instanceof jki) {
                            n2 = n;
                            if (zzd.a((Object)s, (Object)d0.R0)) {
                                n2 = n;
                                if (d0.T0) {
                                    n2 = 1;
                                }
                            }
                        }
                    }
                    if (n2 != 0) {
                        d0.P0.a(null);
                        ((MviViewModel)d0).Q((rtb)fbl.C0);
                    }
                    else {
                        ((MviViewModel)d0).Q((rtb)yal.C0);
                    }
                }
            }
            else {
                final obl q0 = d0.Q0;
                final String e = ((pav)vrm.b()).e();
                Objects.requireNonNull(q0);
                final zf4 zf4 = new zf4(obl.e);
                zf4.C = q0.a;
                final int a2 = w4j.a;
                zf4.D = e;
                saw.b((okm)zf4);
                ((MviViewModel)d0).Q((rtb)yal.C0);
            }
        }
        else {
            final ProfileModuleContainerViewModel d2 = this.D0;
            final ProfileModuleContainerViewModel$a companion2 = ProfileModuleContainerViewModel.Companion;
            ((MviViewModel)d2).Q((rtb)yal.C0);
        }
        return oyv.a;
    }
}
