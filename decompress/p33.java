import com.twitter.business.model.phone.BusinessPhoneInfoData;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p33 extends gue implements rtb<r33, r33>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public p33(final BusinessPhoneViewModel c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "$this$setState");
        final BusinessPhoneViewModel c0 = this.C0;
        final BusinessPhoneInfoData s0 = c0.S0;
        final String localizedCountryName = s0.getCountryIso().getLocalizedCountryName();
        final boolean a = c0.R0.a(c0.S0.getRawPhoneNumber(), c0.S0.getCountryIso().getIsoString());
        final int countryCode = s0.getCountryCode();
        final r23 n0 = c0.N0;
        final int countryCode2 = s0.getCountryCode();
        Objects.requireNonNull(n0);
        zzd.f((Object)localizedCountryName, "countryName");
        final StringBuilder sb = new StringBuilder();
        sb.append(localizedCountryName);
        sb.append(" (+");
        sb.append(countryCode2);
        sb.append(")");
        return new r33(countryCode, localizedCountryName, sb.toString(), s0.getRawPhoneNumber(), c0.N0.a(s0.getCountryCode(), s0.getRawPhoneNumber(), false, s0.getCountryIso().getIsoString()), s0.getContactMethod(), c0.S0.getRawPhoneNumber().length() == 0 || c0.X(), s0.getRawPhoneNumber().length() > 0, a, a);
    }
}
