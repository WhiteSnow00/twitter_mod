// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.List;

public final class k extends ste implements qsb<tg5, lcq<? extends p01>>
{
    public final p01 D0;
    
    public k(final p01 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tg5 tg5 = (tg5)o;
        czd.f((Object)tg5, "it");
        final r21 a = r21.a(this.D0.c, (String)null, (Long)null, false, (String)null, (List)null, false, ds5.Companion.a(tg5), -1, 786431);
        final p01 d0 = this.D0;
        czd.e((Object)d0, "audioSpace");
        return eaq.v((Object)p01.a(d0, a));
    }
}
