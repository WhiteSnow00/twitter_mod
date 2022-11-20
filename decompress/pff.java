import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pff extends ste implements qsb<LinkModuleConfigurationViewModel.b, LinkModuleConfigurationViewModel.b>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public pff(final LinkModuleConfigurationViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "$this$setState");
        final LinkModuleConfigurationViewModel d0 = this.D0;
        final oef o2 = d0.O0;
        return new LinkModuleConfigurationViewModel.b(o2.a(d0.c1.getCta()), o2.b(d0.c1.getUrl()), d0.c1.hasMandatoryData(), 25);
    }
}
