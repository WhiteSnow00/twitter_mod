// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.di.app;

import java.util.List;
import android.content.Context;

public final class TwitterFeatureConfigurationProviderObjectSubgraph_SSM_Private_Provide0Factory implements wqa<fta>
{
    public static fta a(final Context context, final xua xua, final fxe<bsa> fxe) {
        bsa bsa;
        if (kds.b) {
            bsa = (bsa)fxe.get();
        }
        else {
            bsa = null;
        }
        final ijf h = ijf.H();
        if (bsa != null) {
            h.p((Object)bsa);
        }
        bl0.a().t();
        h.p((Object)new mua(xua));
        return (fta)new ud6((List)((h4j)h).e());
    }
    
    public final Object get() {
        throw null;
    }
}
