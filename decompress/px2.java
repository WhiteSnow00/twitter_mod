import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.twitter.business.api.BusinessPhoneContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class px2 extends ste implements qsb<BusinessPhoneContentViewResult, ynj<BusinessPhoneInfoData>>
{
    public static final px2 D0;
    
    static {
        D0 = new px2();
    }
    
    public px2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessPhoneContentViewResult businessPhoneContentViewResult = (BusinessPhoneContentViewResult)o;
        czd.f((Object)businessPhoneContentViewResult, "it");
        return ynj.b((Object)businessPhoneContentViewResult.getPhoneInfoData());
    }
}
