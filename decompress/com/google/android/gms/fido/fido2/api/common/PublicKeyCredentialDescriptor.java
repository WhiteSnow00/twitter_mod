// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import com.google.android.gms.fido.common.Transport;
import java.util.List;
import android.os.Parcelable$Creator;

public final class PublicKeyCredentialDescriptor extends sd
{
    public static final Parcelable$Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType C0;
    public final byte[] D0;
    public final List<Transport> E0;
    
    static {
        final fky a = i6z.a;
        final fky b = i6z.b;
        final int e0 = cgy.E0;
        int i = 2;
        final Object[] array = { a, b };
        while (true) {
            while (i != 0) {
                if (i != 1) {
                    final int m = cgy.m(i);
                    final Object[] array2 = new Object[m];
                    final int n = m - 1;
                    int j = 0;
                    int n2 = 0;
                    int n3 = 0;
                    while (j < i) {
                        final Object o = array[j];
                        fk7.G0(o, j);
                        final int hashCode = o.hashCode();
                        int f = nkz.F(hashCode);
                        int n5;
                        int n6;
                        while (true) {
                            final int n4 = f & n;
                            final Object o2 = array2[n4];
                            if (o2 == null) {
                                array2[n4] = (array[n3] = o);
                                n5 = n2 + hashCode;
                                n6 = n3 + 1;
                                break;
                            }
                            n5 = n2;
                            n6 = n3;
                            if (o2.equals(o)) {
                                break;
                            }
                            ++f;
                        }
                        ++j;
                        n2 = n5;
                        n3 = n6;
                    }
                    Arrays.fill(array, n3, i, null);
                    if (n3 == 1) {
                        new riy(array[0], n2);
                    }
                    else {
                        if (cgy.m(n3) < m / 2) {
                            i = n3;
                            continue;
                        }
                        Object[] copy = array;
                        if (n3 < 1) {
                            copy = Arrays.copyOf(array, n3);
                        }
                        new zgy(copy, n2, array2, n, n3);
                    }
                }
                else {
                    new riy(array[0]);
                }
                CREATOR = (Parcelable$Creator)new eyz();
                return;
            }
            final zgy<Object> k0 = zgy.K0;
            continue;
        }
    }
    
    public PublicKeyCredentialDescriptor(final String s, final byte[] d0, final List<Transport> e0) {
        Objects.requireNonNull(s, "null reference");
        try {
            this.C0 = PublicKeyCredentialType.b(s);
            Objects.requireNonNull(d0, "null reference");
            this.D0 = d0;
            this.E0 = e0;
        }
        catch (final PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        final PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor)o;
        if (!this.C0.equals(publicKeyCredentialDescriptor.C0)) {
            return false;
        }
        if (!Arrays.equals(this.D0, publicKeyCredentialDescriptor.D0)) {
            return false;
        }
        final List<Transport> e0 = this.E0;
        if (e0 == null && publicKeyCredentialDescriptor.E0 == null) {
            return true;
        }
        if (e0 != null) {
            final List<Transport> e2 = publicKeyCredentialDescriptor.E0;
            if (e2 != null) {
                if (e0.containsAll(e2) && publicKeyCredentialDescriptor.E0.containsAll(this.E0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, Arrays.hashCode(this.D0), this.E0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 2, this.C0.C0);
        ri4.i0(parcel, 3, this.D0);
        ri4.w0(parcel, 4, (List)this.E0);
        ri4.A0(parcel, x0);
    }
}
