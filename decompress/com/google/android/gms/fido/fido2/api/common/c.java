// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public final class c extends sd
{
    public static final Parcelable$Creator<c> CREATOR;
    public final Attachment C0;
    public final Boolean D0;
    public final eay E0;
    
    static {
        CREATOR = (Parcelable$Creator)new eaz();
    }
    
    public c(final String s, final Boolean d0, final String s2) {
        Label_0024: {
            if (s == null) {
                this.C0 = null;
                break Label_0024;
            }
            try {
                this.C0 = Attachment.b(s);
                this.D0 = d0;
                if (s2 == null) {
                    this.E0 = null;
                    return;
                }
                try {
                    this.E0 = eay.b(s2);
                }
                catch (final zzae zzae) {
                    throw new IllegalArgumentException((Throwable)zzae);
                }
            }
            catch (final Attachment$UnsupportedAttachmentException ex) {
                throw new IllegalArgumentException((Throwable)ex);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return z4j.a((Object)this.C0, (Object)c.C0) && z4j.a((Object)this.D0, (Object)c.D0) && z4j.a((Object)this.E0, (Object)c.E0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        final Attachment c0 = this.C0;
        final String s = null;
        String c2;
        if (c0 == null) {
            c2 = null;
        }
        else {
            c2 = c0.C0;
        }
        ri4.s0(parcel, 2, c2);
        ri4.f0(parcel, 3, this.D0);
        final eay e0 = this.E0;
        String c3;
        if (e0 == null) {
            c3 = s;
        }
        else {
            c3 = e0.C0;
        }
        ri4.s0(parcel, 4, c3);
        ri4.A0(parcel, x0);
    }
}
