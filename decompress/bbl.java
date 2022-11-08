import java.util.Objects;
import com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.profilemodule.modulecontainer.ProfileModuleContainerViewModel$subscribeToProfileModules$2$1", f = "ProfileModuleContainerViewModel.kt", l = {}, m = "invokeSuspend")
public final class bbl extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ProfileModuleContainerViewModel D0;
    
    public bbl(final ProfileModuleContainerViewModel d0, final ap6<? super bbl> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final bbl bbl = new bbl(this.D0, (ap6<? super bbl>)ap6);
        bbl.C0 = c0;
        return (ap6<oyv>)bbl;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final bbl bbl = (bbl)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        bbl.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final Throwable t = (Throwable)this.C0;
        final obl q0 = this.D0.Q0;
        Objects.requireNonNull(q0);
        zzd.f((Object)t, "throwable");
        final nca e = obl.e;
        final String name = t.getClass().getName();
        String message;
        if ((message = t.getMessage()) == null) {
            message = "[no message found]";
        }
        final String y = zi.y(name, ". message: ", message);
        final zf4 zf4 = new zf4(e);
        zf4.C = q0.a;
        final int a = w4j.a;
        zf4.D = y;
        saw.b((okm)zf4);
        return oyv.a;
    }
}
