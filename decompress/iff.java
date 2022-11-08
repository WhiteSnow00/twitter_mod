import android.widget.TextView;
import android.view.View;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iff extends gue implements rtb<LinkModuleConfigurationViewModel$b, oyv>
{
    public final /* synthetic */ dff C0;
    
    public iff(final dff c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final LinkModuleConfigurationViewModel$b linkModuleConfigurationViewModel$b = (LinkModuleConfigurationViewModel$b)o;
        zzd.f((Object)linkModuleConfigurationViewModel$b, "$this$distinct");
        final View t0 = this.C0.T0;
        zzd.e((Object)t0, "previewGroup");
        final boolean f = linkModuleConfigurationViewModel$b.f;
        final int n = 8;
        int visibility;
        if (f) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        t0.setVisibility(visibility);
        final TextView s0 = this.C0.S0;
        zzd.e((Object)s0, "previewMessage");
        int visibility2 = n;
        if (linkModuleConfigurationViewModel$b.f ^ true) {
            visibility2 = 0;
        }
        ((View)s0).setVisibility(visibility2);
        return oyv.a;
    }
}
