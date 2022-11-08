// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import android.accounts.Account;
import java.util.ArrayList;
import java.util.Comparator;
import com.google.android.gms.common.api.Scope;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.api.a$d;

public class GoogleSignInOptions extends sd implements a$d, ReflectedParcelable
{
    public static final Parcelable$Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions N0;
    public static final Scope O0;
    public static final Scope P0;
    public static final Scope Q0;
    public static Comparator<Scope> R0;
    public final int C0;
    public final ArrayList<Scope> D0;
    public Account E0;
    public boolean F0;
    public final boolean G0;
    public final boolean H0;
    public String I0;
    public String J0;
    public ArrayList<g6c> K0;
    public String L0;
    public Map<Integer, g6c> M0;
    
    static {
        final Scope scope = new Scope("profile");
        new Scope("email");
        final Scope scope2 = O0 = new Scope("openid");
        final Scope scope3 = P0 = new Scope("https://www.googleapis.com/auth/games_lite");
        final Scope scope4 = Q0 = new Scope("https://www.googleapis.com/auth/games");
        final HashSet set = new HashSet();
        final HashMap hashMap = new HashMap();
        set.add(scope2);
        set.add(scope);
        if (set.contains(scope4) && set.contains(scope3)) {
            set.remove(scope3);
        }
        N0 = new GoogleSignInOptions(3, new ArrayList<Scope>(set), null, false, false, false, null, null, hashMap, null);
        final HashSet set2 = new HashSet();
        final HashMap hashMap2 = new HashMap();
        set2.add(scope3);
        set2.addAll(Arrays.asList(new Scope[0]));
        if (set2.contains(scope4) && set2.contains(scope3)) {
            set2.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList<Scope>(set2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = (Parcelable$Creator)new l3y();
        GoogleSignInOptions.R0 = new n2y();
    }
    
    public GoogleSignInOptions(final int c0, final ArrayList<Scope> d0, final Account e0, final boolean f0, final boolean g0, final boolean h0, final String i0, final String j0, final Map<Integer, g6c> m0, final String l0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = new ArrayList<g6c>(m0.values());
        this.M0 = m0;
        this.L0 = l0;
    }
    
    public static GoogleSignInOptions s(String optString) throws JSONException {
        final boolean empty = TextUtils.isEmpty((CharSequence)optString);
        String optString2 = null;
        if (empty) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject(optString);
        final HashSet set = new HashSet();
        final JSONArray jsonArray = jsonObject.getJSONArray("scopes");
        for (int length = jsonArray.length(), i = 0; i < length; ++i) {
            set.add(new Scope(jsonArray.getString(i)));
        }
        if (jsonObject.has("accountName")) {
            optString = jsonObject.optString("accountName");
        }
        else {
            optString = null;
        }
        Account account;
        if (!TextUtils.isEmpty((CharSequence)optString)) {
            account = new Account(optString, "com.google");
        }
        else {
            account = null;
        }
        final ArrayList list = new ArrayList<Scope>(set);
        final boolean boolean1 = jsonObject.getBoolean("idTokenRequested");
        final boolean boolean2 = jsonObject.getBoolean("serverAuthRequested");
        final boolean boolean3 = jsonObject.getBoolean("forceCodeForRefreshToken");
        String optString3;
        if (jsonObject.has("serverClientId")) {
            optString3 = jsonObject.optString("serverClientId");
        }
        else {
            optString3 = null;
        }
        if (jsonObject.has("hostedDomain")) {
            optString2 = jsonObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>)list, account, boolean1, boolean2, boolean3, optString3, optString2, new HashMap<Integer, g6c>(), null);
    }
    
    public static Map<Integer, g6c> t(final List<g6c> list) {
        final HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (final g6c g6c : list) {
            hashMap.put(g6c.D0, g6c);
        }
        return hashMap;
    }
    
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            final GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)o;
            if (this.K0.size() <= 0) {
                if (googleSignInOptions.K0.size() <= 0) {
                    if (this.D0.size() == googleSignInOptions.r().size()) {
                        if (this.D0.containsAll(googleSignInOptions.r())) {
                            final Account e0 = this.E0;
                            if (e0 == null) {
                                if (googleSignInOptions.E0 != null) {
                                    return false;
                                }
                            }
                            else if (!e0.equals((Object)googleSignInOptions.E0)) {
                                return false;
                            }
                            if (TextUtils.isEmpty((CharSequence)this.I0)) {
                                if (!TextUtils.isEmpty((CharSequence)googleSignInOptions.I0)) {
                                    return false;
                                }
                            }
                            else if (!this.I0.equals(googleSignInOptions.I0)) {
                                return false;
                            }
                            if (this.H0 == googleSignInOptions.H0 && this.F0 == googleSignInOptions.F0 && this.G0 == googleSignInOptions.G0 && TextUtils.equals((CharSequence)this.L0, (CharSequence)googleSignInOptions.L0)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    public final int hashCode() {
        final ArrayList list = new ArrayList();
        final ArrayList<Scope> d0 = this.D0;
        for (int size = d0.size(), i = 0; i < size; ++i) {
            list.add(((Scope)d0.get(i)).D0);
        }
        Collections.sort((List<Comparable>)list);
        final gfc gfc = new gfc();
        gfc.a((Object)list);
        gfc.a((Object)this.E0);
        gfc.a((Object)this.I0);
        gfc.b(this.H0);
        gfc.b(this.F0);
        gfc.b(this.G0);
        gfc.a((Object)this.L0);
        return gfc.a;
    }
    
    public final ArrayList<Scope> r() {
        return new ArrayList<Scope>(this.D0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.w0(parcel, 2, (List)this.r());
        ri4.r0(parcel, 3, (Parcelable)this.E0, n);
        ri4.e0(parcel, 4, this.F0);
        ri4.e0(parcel, 5, this.G0);
        ri4.e0(parcel, 6, this.H0);
        ri4.s0(parcel, 7, this.I0);
        ri4.s0(parcel, 8, this.J0);
        ri4.w0(parcel, 9, (List)this.K0);
        ri4.s0(parcel, 10, this.L0);
        ri4.A0(parcel, x0);
    }
}
