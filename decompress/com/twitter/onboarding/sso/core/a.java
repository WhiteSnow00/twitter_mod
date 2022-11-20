// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.sso.core;

import com.google.android.gms.common.api.Scope;

public final class a extends ste implements qsb<Scope, CharSequence>
{
    public static final a D0;
    
    static {
        D0 = new a();
    }
    
    public a() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String e0 = ((Scope)o).E0;
        czd.e((Object)e0, "it.scopeUri");
        return e0;
    }
}
