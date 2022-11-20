// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.Parcelable;
import java.util.Objects;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final VersionedParcel versionedParcel) {
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        IconCompat iconCompat = remoteActionCompat.a;
        if (versionedParcel.i(1)) {
            iconCompat = versionedParcel.o();
        }
        remoteActionCompat.a = iconCompat;
        CharSequence b = remoteActionCompat.b;
        if (versionedParcel.i(2)) {
            b = versionedParcel.h();
        }
        remoteActionCompat.b = b;
        CharSequence c = remoteActionCompat.c;
        if (versionedParcel.i(3)) {
            c = versionedParcel.h();
        }
        remoteActionCompat.c = c;
        remoteActionCompat.d = versionedParcel.m(remoteActionCompat.d, 4);
        boolean e = remoteActionCompat.e;
        if (versionedParcel.i(5)) {
            e = versionedParcel.f();
        }
        remoteActionCompat.e = e;
        boolean f = remoteActionCompat.f;
        if (versionedParcel.i(6)) {
            f = versionedParcel.f();
        }
        remoteActionCompat.f = f;
        return remoteActionCompat;
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        final IconCompat a = remoteActionCompat.a;
        versionedParcel.p(1);
        versionedParcel.y((qsw)a);
        final CharSequence b = remoteActionCompat.b;
        versionedParcel.p(2);
        versionedParcel.s(b);
        final CharSequence c = remoteActionCompat.c;
        versionedParcel.p(3);
        versionedParcel.s(c);
        versionedParcel.w((Parcelable)remoteActionCompat.d, 4);
        final boolean e = remoteActionCompat.e;
        versionedParcel.p(5);
        versionedParcel.q(e);
        final boolean f = remoteActionCompat.f;
        versionedParcel.p(6);
        versionedParcel.q(f);
    }
}
