import com.twitter.business.model.address.BusinessAddressInfoData;
import com.twitter.business.api.BusinessAddressContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gy2 extends pue implements stb<BusinessAddressContentViewResult, BusinessAddressInfoData>
{
    public static final gy2 F0;
    
    static {
        F0 = new gy2();
    }
    
    public gy2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessAddressContentViewResult businessAddressContentViewResult = (BusinessAddressContentViewResult)o;
        e0e.f((Object)businessAddressContentViewResult, "it");
        return businessAddressContentViewResult.getAddressData();
    }
}
