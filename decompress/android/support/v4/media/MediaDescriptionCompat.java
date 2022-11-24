// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.os.BaseBundle;
import android.media.MediaDescription$Builder;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaDescriptionCompat> CREATOR;
    public final String F0;
    public final CharSequence G0;
    public final CharSequence H0;
    public final CharSequence I0;
    public final Bitmap J0;
    public final Uri K0;
    public final Bundle L0;
    public final Uri M0;
    public MediaDescription N0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaDescriptionCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            }
            
            public final Object[] newArray(final int n) {
                return new MediaDescriptionCompat[n];
            }
        };
    }
    
    public MediaDescriptionCompat(final String f0, final CharSequence g0, final CharSequence h0, final CharSequence i0, final Bitmap j0, final Uri k0, final Bundle l0, final Uri m0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
    }
    
    public static MediaDescriptionCompat a(final Object o) {
        MediaDescriptionCompat mediaDescriptionCompat = null;
        final Uri uri = null;
        if (o != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final MediaDescription n0 = (MediaDescription)o;
            final String g = b.g(n0);
            final CharSequence i = b.i(n0);
            final CharSequence h = b.h(n0);
            final CharSequence c = b.c(n0);
            final Bitmap e = b.e(n0);
            final Uri f = b.f(n0);
            final Bundle d = b.d(n0);
            Bundle b;
            if ((b = d) != null) {
                b = MediaSessionCompat.b(d);
            }
            Uri uri2;
            if (b != null) {
                uri2 = (Uri)b.getParcelable("android.support.v4.media.description.MEDIA_URI");
            }
            else {
                uri2 = null;
            }
            Bundle bundle = null;
            Label_0137: {
                if (uri2 != null) {
                    if (((BaseBundle)b).containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && ((BaseBundle)b).size() == 2) {
                        bundle = null;
                        break Label_0137;
                    }
                    b.remove("android.support.v4.media.description.MEDIA_URI");
                    b.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
                bundle = b;
            }
            Uri a;
            if (uri2 != null) {
                a = uri2;
            }
            else {
                a = uri;
                if (sdk_INT >= 23) {
                    a = MediaDescriptionCompat.c.a(n0);
                }
            }
            mediaDescriptionCompat = new MediaDescriptionCompat(g, i, h, c, e, f, bundle, a);
            mediaDescriptionCompat.N0 = n0;
        }
        return mediaDescriptionCompat;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.G0);
        sb.append(", ");
        sb.append((Object)this.H0);
        sb.append(", ");
        sb.append((Object)this.I0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        MediaDescription n2;
        if ((n2 = this.N0) == null) {
            final MediaDescription$Builder b = MediaDescriptionCompat.b.b();
            MediaDescriptionCompat.b.n(b, this.F0);
            MediaDescriptionCompat.b.p(b, this.G0);
            MediaDescriptionCompat.b.o(b, this.H0);
            MediaDescriptionCompat.b.j(b, this.I0);
            MediaDescriptionCompat.b.l(b, this.J0);
            MediaDescriptionCompat.b.m(b, this.K0);
            if (sdk_INT < 23 && this.M0 != null) {
                Bundle bundle;
                if (this.L0 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                else {
                    bundle = new Bundle(this.L0);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.M0);
                MediaDescriptionCompat.b.k(b, bundle);
            }
            else {
                MediaDescriptionCompat.b.k(b, this.L0);
            }
            if (sdk_INT >= 23) {
                c.b(b, this.M0);
            }
            n2 = MediaDescriptionCompat.b.a(b);
            this.N0 = n2;
        }
        n2.writeToParcel(parcel, n);
    }
    
    public static final class b
    {
        public static MediaDescription a(final MediaDescription$Builder mediaDescription$Builder) {
            return mediaDescription$Builder.build();
        }
        
        public static MediaDescription$Builder b() {
            return new MediaDescription$Builder();
        }
        
        public static CharSequence c(final MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }
        
        public static Bundle d(final MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }
        
        public static Bitmap e(final MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }
        
        public static Uri f(final MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }
        
        public static String g(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }
        
        public static CharSequence h(final MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }
        
        public static CharSequence i(final MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }
        
        public static void j(final MediaDescription$Builder mediaDescription$Builder, final CharSequence description) {
            mediaDescription$Builder.setDescription(description);
        }
        
        public static void k(final MediaDescription$Builder mediaDescription$Builder, final Bundle extras) {
            mediaDescription$Builder.setExtras(extras);
        }
        
        public static void l(final MediaDescription$Builder mediaDescription$Builder, final Bitmap iconBitmap) {
            mediaDescription$Builder.setIconBitmap(iconBitmap);
        }
        
        public static void m(final MediaDescription$Builder mediaDescription$Builder, final Uri iconUri) {
            mediaDescription$Builder.setIconUri(iconUri);
        }
        
        public static void n(final MediaDescription$Builder mediaDescription$Builder, final String mediaId) {
            mediaDescription$Builder.setMediaId(mediaId);
        }
        
        public static void o(final MediaDescription$Builder mediaDescription$Builder, final CharSequence subtitle) {
            mediaDescription$Builder.setSubtitle(subtitle);
        }
        
        public static void p(final MediaDescription$Builder mediaDescription$Builder, final CharSequence title) {
            mediaDescription$Builder.setTitle(title);
        }
    }
    
    public static final class c
    {
        public static Uri a(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
        
        public static void b(final MediaDescription$Builder mediaDescription$Builder, final Uri mediaUri) {
            mediaDescription$Builder.setMediaUri(mediaUri);
        }
    }
}
