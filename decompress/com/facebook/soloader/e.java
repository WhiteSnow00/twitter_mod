// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.soloader;

import android.content.Context;
import java.io.File;

public class e extends g
{
    public final File h;
    public final String i;
    
    public e(final Context context, final String s, final File h) {
        super(context, s);
        this.h = h;
        this.i = "^lib/([^/]+)/([^/]+\\.so)$";
    }
}
