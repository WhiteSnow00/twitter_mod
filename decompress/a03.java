import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.AboutModuleDomainData;
import com.twitter.business.model.AboutModuleGoogleData;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a03 extends pue implements stb<d03, vzv>
{
    public final BusinessInfoViewModel F0;
    
    public a03(final BusinessInfoViewModel f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d03 d03 = (d03)o;
        e0e.f((Object)d03, "state");
        final AboutModuleDomainData d4 = this.F0.d1;
        final AboutModuleGoogleData googleMapsData = d4.getGoogleMapsData();
        final boolean j = d03.j;
        vzv a = null;
        d4.setGoogleMapsData(AboutModuleGoogleData.copy$default(googleMapsData, j, (String)null, 2, (Object)null));
        if (d03.j) {
            if (this.F0.d1.getGoogleMapsData().getMapsImageUrl() != null) {
                BusinessInfoViewModel.Y(this.F0);
                a = vzv.a;
            }
            if (a == null) {
                BusinessInfoViewModel.W(this.F0, d03.e);
            }
        }
        else {
            final AboutModuleDomainData d5 = this.F0.d1;
            d5.setGoogleMapsData(AboutModuleGoogleData.copy$default(d5.getGoogleMapsData(), false, (String)null, 1, (Object)null));
            BusinessInfoViewModel.Y(this.F0);
        }
        final BusinessInfoViewModel f0 = this.F0;
        ((MviViewModel)f0).Q((stb)new zz2(f0));
        return vzv.a;
    }
}
