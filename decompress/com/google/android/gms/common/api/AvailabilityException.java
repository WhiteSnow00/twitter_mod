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
    public final ts0<sf0<?>, vg6> D0;
    
    public AvailabilityException(final ts0<sf0<?>, vg6> d0) {
        this.D0 = d0;
    }
    
    @Override
    public final String getMessage() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = ((ts0$c)this.D0.keySet()).iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final sf0 sf0 = iterator.next();
            final vg6 vg6 = ((d8q<K, vg6>)this.D0).getOrDefault(sf0, null);
            Objects.requireNonNull(vg6, "null reference");
            b &= (vg6.s() ^ true);
            final String c = sf0.b.c;
            final String value = String.valueOf(vg6);
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
