// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import android.os.Bundle;

public final class q extends pue implements hub<LinkModuleConfigurationViewModel$b, Bundle, vzv>
{
    public final String F0;
    public final LinkModuleConfigurationViewModel G0;
    
    public q(final String f0, final LinkModuleConfigurationViewModel g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final ccx ccx = (ccx)o;
        final Bundle bundle = (Bundle)o2;
        e0e.f((Object)ccx, "$this$invoke");
        e0e.f((Object)bundle, "bundle");
        final LinkModuleConfigurationViewModel$b linkModuleConfigurationViewModel$b = (LinkModuleConfigurationViewModel$b)ccx;
        final LinkModuleDomainConfig e1 = this.G0.e1;
        if (e1 != null) {
            gte.b((Object)e1, this.F0, bundle, (bde)null, 4);
        }
        return vzv.a;
    }
}
