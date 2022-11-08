// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class c implements DynamiteModule$a
{
    public final DynamiteModule$a$b a(final Context context, final String s, final DynamiteModule$a$a dynamiteModule$a$a) throws DynamiteModule$LoadingException {
        final DynamiteModule$a$b dynamiteModule$a$b = new DynamiteModule$a$b();
        final int b = dynamiteModule$a$a.b(context, s);
        dynamiteModule$a$b.a = b;
        if (b != 0) {
            dynamiteModule$a$b.c = -1;
        }
        else if ((dynamiteModule$a$b.b = dynamiteModule$a$a.a(context, s, true)) != 0) {
            dynamiteModule$a$b.c = 1;
        }
        return dynamiteModule$a$b;
    }
}
