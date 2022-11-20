// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safety.mutedkeywords.composer;

import android.content.DialogInterface;

public class e extends jjl
{
    public static final int o2 = 0;
    public a n2;
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -2) {
            final a n2 = this.n2;
            if (n2 != null) {
                ((c)n2).a1.cancel();
            }
        }
        ((wk1)this).i2(n);
    }
    
    public interface a
    {
    }
}
