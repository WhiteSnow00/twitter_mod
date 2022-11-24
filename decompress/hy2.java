import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.api.BusinessHoursContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hy2 extends pue implements stb<BusinessHoursContentViewResult, BusinessHoursData>
{
    public static final hy2 F0;
    
    static {
        F0 = new hy2();
    }
    
    public hy2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessHoursContentViewResult businessHoursContentViewResult = (BusinessHoursContentViewResult)o;
        e0e.f((Object)businessHoursContentViewResult, "it");
        return businessHoursContentViewResult.getResult();
    }
}
