import com.twitter.business.features.linkmodule.api.LinkConfigurationContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnh extends ste implements qsb<LinkConfigurationContentViewResult, Boolean>
{
    public static final dnh D0;
    
    static {
        D0 = new dnh();
    }
    
    public dnh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final LinkConfigurationContentViewResult linkConfigurationContentViewResult = (LinkConfigurationContentViewResult)o;
        czd.f((Object)linkConfigurationContentViewResult, "result");
        return linkConfigurationContentViewResult.isFeatured();
    }
}
