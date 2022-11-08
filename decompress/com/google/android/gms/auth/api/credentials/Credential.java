// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Collections;
import android.text.TextUtils;
import java.util.List;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class Credential extends sd implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<Credential> CREATOR;
    public final String C0;
    public final String D0;
    public final Uri E0;
    public final List<IdToken> F0;
    public final String G0;
    public final String H0;
    public final String I0;
    public final String J0;
    
    static {
        CREATOR = (Parcelable$Creator)new d5y();
    }
    
    public Credential(String d0, final String s, final Uri e0, final List<IdToken> list, final String g0, final String h0, final String i0, final String j0) {
        xd.u((Object)d0, (Object)"credential identifier cannot be null");
        final String trim = d0.trim();
        xd.r(trim, (Object)"credential identifier cannot be empty");
        if (g0 != null && TextUtils.isEmpty((CharSequence)g0)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (h0 != null) {
            Boolean b;
            if (TextUtils.isEmpty((CharSequence)h0)) {
                b = Boolean.FALSE;
            }
            else {
                final Uri parse = Uri.parse(h0);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty((CharSequence)parse.getScheme()) && !TextUtils.isEmpty((CharSequence)parse.getAuthority())) {
                    final boolean equalsIgnoreCase = "http".equalsIgnoreCase(parse.getScheme());
                    boolean b2 = true;
                    if (!equalsIgnoreCase) {
                        b2 = ("https".equalsIgnoreCase(parse.getScheme()) && b2);
                    }
                    b = b2;
                }
                else {
                    b = Boolean.FALSE;
                }
            }
            if (!b) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty((CharSequence)h0) && !TextUtils.isEmpty((CharSequence)g0)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if ((d0 = s) != null) {
            d0 = s;
            if (TextUtils.isEmpty((CharSequence)s.trim())) {
                d0 = null;
            }
        }
        this.D0 = d0;
        this.E0 = e0;
        List<Object> f0;
        if (list == null) {
            f0 = (List<Object>)Collections.emptyList();
        }
        else {
            f0 = (List<Object>)Collections.unmodifiableList((List<? extends IdToken>)list);
        }
        this.F0 = (List<IdToken>)f0;
        this.C0 = trim;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Credential)) {
            return false;
        }
        final Credential credential = (Credential)o;
        return TextUtils.equals((CharSequence)this.C0, (CharSequence)credential.C0) && TextUtils.equals((CharSequence)this.D0, (CharSequence)credential.D0) && z4j.a((Object)this.E0, (Object)credential.E0) && TextUtils.equals((CharSequence)this.G0, (CharSequence)credential.G0) && TextUtils.equals((CharSequence)this.H0, (CharSequence)credential.H0);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0, this.G0, this.H0 });
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 1, this.C0);
        ri4.s0(parcel, 2, this.D0);
        ri4.r0(parcel, 3, (Parcelable)this.E0, n);
        ri4.w0(parcel, 4, (List)this.F0);
        ri4.s0(parcel, 5, this.G0);
        ri4.s0(parcel, 6, this.H0);
        ri4.s0(parcel, 9, this.I0);
        ri4.s0(parcel, 10, this.J0);
        ri4.A0(parcel, x0);
    }
}
