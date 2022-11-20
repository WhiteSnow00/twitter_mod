import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.model.address.BusinessAddressInfoData;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iu2 extends ste implements qsb<ku2, ku2>
{
    public final BusinessAddressViewModel D0;
    
    public iu2(final BusinessAddressViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "$this$setState");
        final BusinessAddressViewModel d0 = this.D0;
        final BusinessAddressInfoData q0 = d0.Q0;
        final fx2 p = d0.P0;
        final String address = q0.getAddress();
        Objects.requireNonNull(p);
        czd.f((Object)address, "address");
        final String b = p.b(address, 2131951885);
        final fx2 p2 = d0.P0;
        final String city = q0.getCity();
        Objects.requireNonNull(p2);
        czd.f((Object)city, "city");
        final String b2 = p2.b(city, 2131952457);
        final fx2 p3 = d0.P0;
        final String adminArea = q0.getAdminArea();
        Objects.requireNonNull(p3);
        czd.f((Object)adminArea, "adminArea");
        final String b3 = p3.b(adminArea, 2131958478);
        final fx2 p4 = d0.P0;
        final String zipCode = q0.getZipCode();
        Objects.requireNonNull(p4);
        czd.f((Object)zipCode, "zip");
        final String b4 = p4.b(zipCode, 2131959668);
        final fx2 p5 = d0.P0;
        final CountryIso countryIso = q0.getCountryIso();
        Objects.requireNonNull(p5);
        String localizedCountryName;
        if (countryIso != null) {
            localizedCountryName = countryIso.getLocalizedCountryName();
        }
        else {
            localizedCountryName = null;
        }
        final String b5 = p5.b(localizedCountryName, 2131952906);
        final BusinessAddressInfoData q2 = d0.Q0;
        return new ku2(b3, b, b4, b2, b5, (vkr.V((CharSequence)q2.getAddress()) ^ true) && (vkr.V((CharSequence)q2.getCity()) ^ true) && (vkr.V((CharSequence)q2.getZipCode()) ^ true) && !czd.a((Object)d0.Q0, (Object)d0.O0.getAddressData()));
    }
}
