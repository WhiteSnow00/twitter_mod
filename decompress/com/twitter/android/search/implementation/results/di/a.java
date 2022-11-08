// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.search.implementation.results.di;

import android.content.Intent;

public final class a implements bsm<qv>
{
    @Override
    public final Object c(final Intent intent) {
        zzd.c((Object)intent);
        return tkp.a(intent.getByteArrayExtra("extra_advanced_filters"), (alp)qv.f);
    }
}
