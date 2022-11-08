import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduledisplay.mobileappmodule.MobileAppModuleViewModel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduledisplay.mobileappmodule.MobileAppModuleViewModel$subscribeMobileAppModuleData$2", f = "MobileAppModuleViewModel.kt", l = {}, m = "invokeSuspend")
public final class gfh extends xzr implements gub<gvj<? extends String, ? extends List<? extends neh>>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ MobileAppModuleViewModel D0;
    
    public gfh(final MobileAppModuleViewModel d0, final ap6<? super gfh> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final gfh gfh = new gfh(this.D0, (ap6<? super gfh>)ap6);
        gfh.C0 = c0;
        return (ap6<oyv>)gfh;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final gfh gfh = (gfh)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        gfh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final gvj gvj = (gvj)this.C0;
        final String s = (String)gvj.C0;
        final List list = (List)gvj.D0;
        final reh o2 = this.D0.O0;
        zzd.e((Object)s, "profileId");
        o2.a(s);
        ((MviViewModel)this.D0).Q((rtb)new gfh$a(list));
        this.D0.O0.b();
        return oyv.a;
    }
}
