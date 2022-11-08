// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.conversation.di.retained;

import java.util.List;

public final class b extends gue implements rtb<List<lt6>, i4e<lt6>>
{
    public static final b C0;
    
    static {
        C0 = new b();
    }
    
    public b() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        zzd.f((Object)list, "items");
        return new skf((Iterable)list);
    }
}
