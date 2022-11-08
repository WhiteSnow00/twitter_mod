// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.Collection;
import java.util.ArrayList;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import com.google.android.gms.common.api.Scope;
import java.util.List;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class GoogleSignInAccount extends sd implements ReflectedParcelable
{
    public static final Parcelable$Creator<GoogleSignInAccount> CREATOR;
    public final int C0;
    public String D0;
    public String E0;
    public String F0;
    public String G0;
    public Uri H0;
    public String I0;
    public long J0;
    public String K0;
    public List<Scope> L0;
    public String M0;
    public String N0;
    public Set<Scope> O0;
    
    static {
        CREATOR = (Parcelable$Creator)new k1y();
    }
    
    public GoogleSignInAccount(final int c0, final String d0, final String e0, final String f0, final String g0, final Uri h0, final String i0, final long j0, final String k0, final List<Scope> l0, final String m0, final String n0) {
        this.O0 = new HashSet();
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
    }
    
    public static GoogleSignInAccount s(String i0) throws JSONException {
        if (TextUtils.isEmpty((CharSequence)i0)) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject(i0);
        i0 = jsonObject.optString("photoUrl");
        Uri parse;
        if (!TextUtils.isEmpty((CharSequence)i0)) {
            parse = Uri.parse(i0);
        }
        else {
            parse = null;
        }
        final long long1 = Long.parseLong(jsonObject.getString("expirationTime"));
        final HashSet<Scope> set = new HashSet<Scope>();
        final JSONArray jsonArray = jsonObject.getJSONArray("grantedScopes");
        for (int length = jsonArray.length(), j = 0; j < length; ++j) {
            set.add(new Scope(jsonArray.getString(j)));
        }
        final String optString = jsonObject.optString("id");
        String optString2;
        if (jsonObject.has("tokenId")) {
            optString2 = jsonObject.optString("tokenId");
        }
        else {
            optString2 = null;
        }
        String optString3;
        if (jsonObject.has("email")) {
            optString3 = jsonObject.optString("email");
        }
        else {
            optString3 = null;
        }
        String optString4;
        if (jsonObject.has("displayName")) {
            optString4 = jsonObject.optString("displayName");
        }
        else {
            optString4 = null;
        }
        String optString5;
        if (jsonObject.has("givenName")) {
            optString5 = jsonObject.optString("givenName");
        }
        else {
            optString5 = null;
        }
        String optString6;
        if (jsonObject.has("familyName")) {
            optString6 = jsonObject.optString("familyName");
        }
        else {
            optString6 = null;
        }
        final String string = jsonObject.getString("obfuscatedIdentifier");
        final long longValue = long1;
        xd.q(string);
        final GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString, optString2, optString3, optString4, parse, null, longValue, string, new ArrayList<Scope>(set), optString5, optString6);
        if (jsonObject.has("serverAuthCode")) {
            i0 = jsonObject.optString("serverAuthCode");
        }
        else {
            i0 = null;
        }
        googleSignInAccount.I0 = i0;
        return googleSignInAccount;
    }
    
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoogleSignInAccount)) {
            return false;
        }
        final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)o;
        return googleSignInAccount.K0.equals(this.K0) && googleSignInAccount.r().equals(this.r());
    }
    
    public final int hashCode() {
        return this.r().hashCode() + l7k.a(this.K0, 527, 31);
    }
    
    public final Set<Scope> r() {
        final HashSet set = new HashSet((Collection<? extends E>)this.L0);
        set.addAll(this.O0);
        return set;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.s0(parcel, 2, this.D0);
        ri4.s0(parcel, 3, this.E0);
        ri4.s0(parcel, 4, this.F0);
        ri4.s0(parcel, 5, this.G0);
        ri4.r0(parcel, 6, (Parcelable)this.H0, n);
        ri4.s0(parcel, 7, this.I0);
        ri4.q0(parcel, 8, this.J0);
        ri4.s0(parcel, 9, this.K0);
        ri4.w0(parcel, 10, (List)this.L0);
        ri4.s0(parcel, 11, this.M0);
        ri4.s0(parcel, 12, this.N0);
        ri4.A0(parcel, x0);
    }
}
