// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import android.os.Bundle;

public final class r extends pue implements stb<Bundle, vzv>
{
    public final String F0;
    public final stb G0;
    
    public r(final String f0, final stb g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(Object c) {
        final Bundle bundle = (Bundle)c;
        e0e.f((Object)bundle, "bundle");
        c = gte.c(bundle, (Class)LinkModuleDomainConfig.class, this.F0, (bde)bde.d);
        if (c != null) {
            this.G0.invoke(c);
        }
        return vzv.a;
    }
}
