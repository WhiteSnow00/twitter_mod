import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.AboutModuleDomainData;
import com.twitter.business.model.AboutModuleGoogleData;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hz2 extends ste implements qsb<kz2, fzv>
{
    public final BusinessInfoViewModel D0;
    
    public hz2(final BusinessInfoViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final kz2 kz2 = (kz2)o;
        czd.f((Object)kz2, "state");
        final AboutModuleDomainData b1 = this.D0.b1;
        final AboutModuleGoogleData googleMapsData = b1.getGoogleMapsData();
        final boolean j = kz2.j;
        fzv a = null;
        b1.setGoogleMapsData(AboutModuleGoogleData.copy$default(googleMapsData, j, (String)null, 2, (Object)null));
        if (kz2.j) {
            if (this.D0.b1.getGoogleMapsData().getMapsImageUrl() != null) {
                BusinessInfoViewModel.Y(this.D0);
                a = fzv.a;
            }
            if (a == null) {
                BusinessInfoViewModel.W(this.D0, kz2.e);
            }
        }
        else {
            final AboutModuleDomainData b2 = this.D0.b1;
            b2.setGoogleMapsData(AboutModuleGoogleData.copy$default(b2.getGoogleMapsData(), false, (String)null, 1, (Object)null));
            BusinessInfoViewModel.Y(this.D0);
        }
        final BusinessInfoViewModel d0 = this.D0;
        ((MviViewModel)d0).Q((qsb)new gz2(d0));
        return fzv.a;
    }
}
