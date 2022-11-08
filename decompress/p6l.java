import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.settings.overview.ProfessionalSettingsViewModel$a;
import java.util.Objects;
import com.twitter.business.settings.overview.ProfessionalSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$subscribeToProfessionalUpdates$1", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class p6l extends xzr implements gub<snj<v3l>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ProfessionalSettingsViewModel D0;
    
    public p6l(final ProfessionalSettingsViewModel d0, final ap6<? super p6l> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final p6l p6l = new p6l(this.D0, (ap6<? super p6l>)ap6);
        p6l.C0 = c0;
        return (ap6<oyv>)p6l;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final p6l p6l = (p6l)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        p6l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final snj snj = (snj)this.C0;
        if (snj.f()) {
            final ProfessionalSettingsViewModel d0 = this.D0;
            final Object c = snj.c();
            zzd.e(c, "professional.get()");
            final v3l v3l = (v3l)c;
            final ProfessionalSettingsViewModel$a companion = ProfessionalSettingsViewModel.Companion;
            Objects.requireNonNull(d0);
            ((MviViewModel)d0).Q((rtb)new q6l(v3l));
        }
        else {
            final ProfessionalSettingsViewModel d2 = this.D0;
            final v4l.a a = v4l.a.a;
            final ProfessionalSettingsViewModel$a companion2 = ProfessionalSettingsViewModel.Companion;
            ((MviViewModel)d2).V((Object)a);
        }
        return oyv.a;
    }
}
