import androidx.appcompat.app.f;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sff extends gue implements rtb<LinkModuleConfigurationViewModel$b, oyv>
{
    public final /* synthetic */ dff C0;
    
    public sff(final dff c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final LinkModuleConfigurationViewModel$b linkModuleConfigurationViewModel$b = (LinkModuleConfigurationViewModel$b)o;
        zzd.f((Object)linkModuleConfigurationViewModel$b, "$this$distinct");
        final tef j0 = this.C0.J0;
        j0.E0 = linkModuleConfigurationViewModel$b.d;
        ((f)j0.D0).invalidateOptionsMenu();
        return oyv.a;
    }
}
