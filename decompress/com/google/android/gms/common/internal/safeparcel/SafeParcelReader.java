// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal.safeparcel;

import android.os.IBinder;
import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

public final class SafeParcelReader
{
    public static Bundle a(final Parcel parcel, int u) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + u);
        return bundle;
    }
    
    public static byte[] b(final Parcel parcel, int u) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + u);
        return byteArray;
    }
    
    public static int[] c(final Parcel parcel, int u) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + u);
        return intArray;
    }
    
    public static <T extends Parcelable> T d(final Parcel parcel, int dataPosition, final Parcelable$Creator<T> parcelable$Creator) {
        final int u = u(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + u);
        return (T)parcelable;
    }
    
    public static String e(final Parcel parcel, int dataPosition) {
        final int u = u(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + u);
        return string;
    }
    
    public static String[] f(final Parcel parcel, int u) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + u);
        return stringArray;
    }
    
    public static ArrayList<String> g(final Parcel parcel, int u) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + u);
        return stringArrayList;
    }
    
    public static <T> T[] h(final Parcel parcel, int dataPosition, final Parcelable$Creator<T> parcelable$Creator) {
        final int u = u(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray((Parcelable$Creator)parcelable$Creator);
        parcel.setDataPosition(dataPosition + u);
        return (T[])typedArray;
    }
    
    public static <T> ArrayList<T> i(final Parcel parcel, int u, final Parcelable$Creator<T> parcelable$Creator) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList((Parcelable$Creator)parcelable$Creator);
        parcel.setDataPosition(dataPosition + u);
        return typedArrayList;
    }
    
    public static void j(final Parcel parcel, final int n) {
        if (parcel.dataPosition() == n) {
            return;
        }
        throw new ParseException(jxa.p(37, "Overread allowed size end=", n), parcel);
    }
    
    public static boolean k(final Parcel parcel, final int n) {
        y(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static Boolean l(final Parcel parcel, int u) {
        u = u(parcel, u);
        if (u == 0) {
            return null;
        }
        x(parcel, u, 4);
        return parcel.readInt() != 0;
    }
    
    public static byte m(final Parcel parcel, final int n) {
        y(parcel, n, 4);
        return (byte)parcel.readInt();
    }
    
    public static Double n(final Parcel parcel, int u) {
        u = u(parcel, u);
        if (u == 0) {
            return null;
        }
        x(parcel, u, 8);
        return parcel.readDouble();
    }
    
    public static float o(final Parcel parcel, final int n) {
        y(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static Float p(final Parcel parcel, int u) {
        u = u(parcel, u);
        if (u == 0) {
            return null;
        }
        x(parcel, u, 4);
        return parcel.readFloat();
    }
    
    public static IBinder q(final Parcel parcel, int u) {
        u = u(parcel, u);
        final int dataPosition = parcel.dataPosition();
        if (u == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + u);
        return strongBinder;
    }
    
    public static int r(final Parcel parcel, final int n) {
        y(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static Integer s(final Parcel parcel, int u) {
        u = u(parcel, u);
        if (u == 0) {
            return null;
        }
        x(parcel, u, 4);
        return parcel.readInt();
    }
    
    public static long t(final Parcel parcel, final int n) {
        y(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static int u(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static void v(final Parcel parcel, int u) {
        u = u(parcel, u);
        parcel.setDataPosition(parcel.dataPosition() + u);
    }
    
    public static int w(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final int u = u(parcel, int1);
        final int dataPosition = parcel.dataPosition();
        if ((char)int1 != '\u4f45') {
            final String value = String.valueOf(Integer.toHexString(int1));
            String concat;
            if (value.length() != 0) {
                concat = "Expected object header. Got 0x".concat(value);
            }
            else {
                concat = new String("Expected object header. Got 0x");
            }
            throw new ParseException(concat, parcel);
        }
        final int n = u + dataPosition;
        if (n >= dataPosition && n <= parcel.dataSize()) {
            return n;
        }
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(n);
        throw new ParseException(sb.toString(), parcel);
    }
    
    public static void x(final Parcel parcel, final int n, final int n2) {
        if (n == n2) {
            return;
        }
        final String hexString = Integer.toHexString(n);
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(n2);
        sb.append(" got ");
        sb.append(n);
        throw new ParseException(ta0.z(sb, " (0x", hexString, ")"), parcel);
    }
    
    public static void y(final Parcel parcel, int u, final int n) {
        u = u(parcel, u);
        if (u == n) {
            return;
        }
        final String hexString = Integer.toHexString(u);
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(n);
        sb.append(" got ");
        sb.append(u);
        throw new ParseException(ta0.z(sb, " (0x", hexString, ")"), parcel);
    }
    
    public static class ParseException extends RuntimeException
    {
        public ParseException(final String s, final Parcel parcel) {
            final int dataPosition = parcel.dataPosition();
            final int dataSize = parcel.dataSize();
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 41);
            bo1.z(sb, s, " Parcel: pos=", dataPosition, " size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }
}
