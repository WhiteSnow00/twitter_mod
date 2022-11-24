import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.model.address.BusinessAddressInfoData;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class av2 extends pue implements stb<cv2, cv2>
{
    public final BusinessAddressViewModel F0;
    
    public av2(final BusinessAddressViewModel f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "$this$setState");
        final BusinessAddressViewModel f0 = this.F0;
        final BusinessAddressInfoData s0 = f0.S0;
        final yx2 r0 = f0.R0;
        final String address = s0.getAddress();
        Objects.requireNonNull(r0);
        e0e.f((Object)address, "address");
        final String b = r0.b(address, 2131951885);
        final yx2 r2 = f0.R0;
        final String city = s0.getCity();
        Objects.requireNonNull(r2);
        e0e.f((Object)city, "city");
        final String b2 = r2.b(city, 2131952457);
        final yx2 r3 = f0.R0;
        final String adminArea = s0.getAdminArea();
        Objects.requireNonNull(r3);
        e0e.f((Object)adminArea, "adminArea");
        final String b3 = r3.b(adminArea, 2131958478);
        final yx2 r4 = f0.R0;
        final String zipCode = s0.getZipCode();
        Objects.requireNonNull(r4);
        e0e.f((Object)zipCode, "zip");
        final String b4 = r4.b(zipCode, 2131959668);
        final yx2 r5 = f0.R0;
        final CountryIso countryIso = s0.getCountryIso();
        Objects.requireNonNull(r5);
        String localizedCountryName;
        if (countryIso != null) {
            localizedCountryName = countryIso.getLocalizedCountryName();
        }
        else {
            localizedCountryName = null;
        }
        final String b5 = r5.b(localizedCountryName, 2131952906);
        final BusinessAddressInfoData s2 = f0.S0;
        return new cv2(b3, b, b4, b2, b5, (slr.k1((CharSequence)s2.getAddress()) ^ true) && (slr.k1((CharSequence)s2.getCity()) ^ true) && (slr.k1((CharSequence)s2.getZipCode()) ^ true) && !e0e.a((Object)f0.S0, (Object)f0.Q0.getAddressData()));
    }
}
