import com.twitter.business.features.linkmodule.api.LinkConfigurationContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ymh extends gue implements rtb<LinkConfigurationContentViewResult, Boolean>
{
    public static final ymh C0;
    
    static {
        C0 = new ymh();
    }
    
    public ymh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final LinkConfigurationContentViewResult linkConfigurationContentViewResult = (LinkConfigurationContentViewResult)o;
        zzd.f((Object)linkConfigurationContentViewResult, "result");
        return linkConfigurationContentViewResult.isFeatured();
    }
}
