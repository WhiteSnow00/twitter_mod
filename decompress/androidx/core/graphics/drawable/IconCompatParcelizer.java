// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.graphics.drawable;

import java.util.Objects;
import android.os.Parcelable;
import java.nio.charset.Charset;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer
{
    public static IconCompat read(final VersionedParcel versionedParcel) {
        final IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.k(iconCompat.a, 1);
        byte[] c = iconCompat.c;
        if (versionedParcel.i(2)) {
            c = versionedParcel.g();
        }
        iconCompat.c = c;
        iconCompat.d = versionedParcel.m(iconCompat.d, 3);
        iconCompat.e = versionedParcel.k(iconCompat.e, 4);
        iconCompat.f = versionedParcel.k(iconCompat.f, 5);
        iconCompat.g = versionedParcel.m(iconCompat.g, 6);
        String i = iconCompat.i;
        if (versionedParcel.i(7)) {
            i = versionedParcel.n();
        }
        iconCompat.i = i;
        final String j = iconCompat.j;
        String n;
        if (!versionedParcel.i(8)) {
            n = j;
        }
        else {
            n = versionedParcel.n();
        }
        iconCompat.j = n;
        iconCompat.h = PorterDuff$Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case 3: {
                iconCompat.b = iconCompat.c;
                break;
            }
            case 2:
            case 4:
            case 6: {
                final String b = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = b;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = b.split(":", -1)[0];
                    break;
                }
                break;
            }
            case 1:
            case 5: {
                final Parcelable d = iconCompat.d;
                if (d != null) {
                    iconCompat.b = d;
                    break;
                }
                final byte[] c2 = iconCompat.c;
                iconCompat.b = c2;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = c2.length;
                break;
            }
            case -1: {
                final Parcelable d2 = iconCompat.d;
                if (d2 != null) {
                    iconCompat.b = d2;
                    break;
                }
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        return iconCompat;
    }
    
    public static void write(final IconCompat iconCompat, final VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        iconCompat.i = ((Enum)iconCompat.h).name();
        switch (iconCompat.a) {
            case 4:
            case 6: {
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 3: {
                iconCompat.c = (byte[])iconCompat.b;
                break;
            }
            case 2: {
                iconCompat.c = ((String)iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 1:
            case 5: {
                iconCompat.d = (Parcelable)iconCompat.b;
                break;
            }
            case -1: {
                iconCompat.d = (Parcelable)iconCompat.b;
                break;
            }
        }
        final int a = iconCompat.a;
        if (-1 != a) {
            versionedParcel.u(a, 1);
        }
        final byte[] c = iconCompat.c;
        if (c != null) {
            versionedParcel.p(2);
            versionedParcel.r(c);
        }
        final Parcelable d = iconCompat.d;
        if (d != null) {
            versionedParcel.w(d, 3);
        }
        final int e = iconCompat.e;
        if (e != 0) {
            versionedParcel.u(e, 4);
        }
        final int f = iconCompat.f;
        if (f != 0) {
            versionedParcel.u(f, 5);
        }
        final ColorStateList g = iconCompat.g;
        if (g != null) {
            versionedParcel.w((Parcelable)g, 6);
        }
        final String i = iconCompat.i;
        if (i != null) {
            versionedParcel.p(7);
            versionedParcel.x(i);
        }
        final String j = iconCompat.j;
        if (j != null) {
            versionedParcel.p(8);
            versionedParcel.x(j);
        }
    }
}
