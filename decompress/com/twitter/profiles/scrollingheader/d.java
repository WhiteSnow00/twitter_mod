// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.scrollingheader;

public final class d extends tp1<Integer[]>
{
    public final c$b E0;
    
    public d(final c$b e0) {
        this.E0 = e0;
    }
    
    public final void b(final Object o) {
        final Integer[] array = (Integer[])o;
        int i = 0;
        int n = 0;
        while (i < 4) {
            int n2 = n;
            if (array[i] != 0) {
                this.E0.c.F1[i] = array[i];
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        if (n > 0) {
            final c c = this.E0.c;
            c.h1.setColorScheme(c.F1);
        }
        this.E0.c.h5();
    }
}
