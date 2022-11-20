// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.endscreen.communities;

public final class b extends ste implements qsb<qs5, qs5>
{
    public static final b D0;
    
    static {
        D0 = new b();
    }
    
    public b() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qs5 qs5 = (qs5)o;
        czd.f((Object)qs5, "$this$setState");
        final tg5 a = qs5.a;
        final boolean c = qs5.c;
        czd.f((Object)a, "community");
        return new qs5(a, false, c);
    }
}
