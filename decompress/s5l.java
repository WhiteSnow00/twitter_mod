import com.twitter.business.api.ModuleOverviewContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5l extends gue implements rtb<ModuleOverviewContentViewResult, Boolean>
{
    public static final s5l C0;
    
    static {
        C0 = new s5l();
    }
    
    public s5l() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ModuleOverviewContentViewResult moduleOverviewContentViewResult = (ModuleOverviewContentViewResult)o;
        zzd.f((Object)moduleOverviewContentViewResult, "it");
        return moduleOverviewContentViewResult.getModulesUpdated();
    }
}
