import com.twitter.business.settings.overview.ProfessionalSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$doAccountTypeMutation$2$2", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class l6l extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    
    public l6l(final ProfessionalSettingsViewModel c0, final ap6<? super l6l> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new l6l(this.C0, (ap6<? super l6l>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l6l l6l = (l6l)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        l6l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        ProfessionalSettingsViewModel.W(this.C0);
        ProfessionalSettingsViewModel.X(this.C0, 2131951808);
        return oyv.a;
    }
}
