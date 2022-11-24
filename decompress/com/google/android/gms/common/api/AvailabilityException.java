// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.Objects;
import java.util.ArrayList;

public class AvailabilityException extends Exception
{
    public final ws0<tf0<?>, bi6> F0;
    
    public AvailabilityException(final ws0<tf0<?>, bi6> f0) {
        this.F0 = f0;
    }
    
    @Override
    public final String getMessage() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = ((ws0$c)this.F0.keySet()).iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final tf0 tf0 = iterator.next();
            final bi6 bi6 = (bi6)this.F0.getOrDefault((Object)tf0, (Object)null);
            Objects.requireNonNull(bi6, "null reference");
            b &= (bi6.s() ^ true);
            final String c = tf0.b.c;
            final String value = String.valueOf(bi6);
            final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 2 + value.length());
            sb.append(c);
            sb.append(": ");
            sb.append(value);
            list.add(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        if (b) {
            sb2.append("None of the queried APIs are available. ");
        }
        else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join((CharSequence)"; ", (Iterable)list));
        return sb2.toString();
    }
}
