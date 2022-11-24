import com.twitter.business.api.BusinessInfoContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nnh extends pue implements stb<BusinessInfoContentViewResult, Boolean>
{
    public static final nnh F0;
    
    static {
        F0 = new nnh();
    }
    
    public nnh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessInfoContentViewResult businessInfoContentViewResult = (BusinessInfoContentViewResult)o;
        e0e.f((Object)businessInfoContentViewResult, "result");
        return businessInfoContentViewResult.getModulesWereUpdated();
    }
}
