// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.os.Parcelable$Creator;

public final class TokenBinding extends sd
{
    public static final Parcelable$Creator<TokenBinding> CREATOR;
    public final TokenBinding.TokenBinding$a C0;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new g9y();
        new TokenBinding("supported", null);
        new TokenBinding("not-supported", null);
    }
    
    public TokenBinding(final String s, final String d0) {
        Objects.requireNonNull(s, "null reference");
        try {
            this.C0 = TokenBinding.TokenBinding$a.b(s);
            this.D0 = d0;
        }
        catch (final TokenBinding.TokenBinding$UnsupportedTokenBindingStatusException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof TokenBinding)) {
            return false;
        }
        final TokenBinding tokenBinding = (TokenBinding)o;
        return rqu.V((Object)this.C0, (Object)tokenBinding.C0) && rqu.V((Object)this.D0, (Object)tokenBinding.D0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 2, this.C0.C0);
        ri4.s0(parcel, 3, this.D0);
        ri4.A0(parcel, x0);
    }
}
