// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState$CustomAction$Builder;
import android.media.session.PlaybackState$CustomAction;
import android.media.session.PlaybackState$Builder;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class PlaybackStateCompat implements Parcelable
{
    public static final Parcelable$Creator<PlaybackStateCompat> CREATOR;
    public final int F0;
    public final long G0;
    public final long H0;
    public final float I0;
    public final long J0;
    public final int K0;
    public final CharSequence L0;
    public final long M0;
    public List<CustomAction> N0;
    public final long O0;
    public final Bundle P0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<PlaybackStateCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new PlaybackStateCompat(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new PlaybackStateCompat[n];
            }
        };
    }
    
    public PlaybackStateCompat(final int f0, final long g0, final long h0, final float i0, final long j0, final int k0, final CharSequence l0, final long m0, final List<CustomAction> list, final long o0, final Bundle p11) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = new ArrayList((Collection<? extends E>)list);
        this.O0 = o0;
        this.P0 = p11;
    }
    
    public PlaybackStateCompat(final Parcel parcel) {
        this.F0 = parcel.readInt();
        this.G0 = parcel.readLong();
        this.I0 = parcel.readFloat();
        this.M0 = parcel.readLong();
        this.H0 = parcel.readLong();
        this.J0 = parcel.readLong();
        this.L0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.N0 = parcel.createTypedArrayList((Parcelable$Creator)CustomAction.CREATOR);
        this.O0 = parcel.readLong();
        this.P0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.K0 = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("PlaybackState {", "state=");
        j.append(this.F0);
        j.append(", position=");
        j.append(this.G0);
        j.append(", buffered position=");
        j.append(this.H0);
        j.append(", speed=");
        j.append(this.I0);
        j.append(", updated=");
        j.append(this.M0);
        j.append(", actions=");
        j.append(this.J0);
        j.append(", error code=");
        j.append(this.K0);
        j.append(", error message=");
        j.append(this.L0);
        j.append(", custom actions=");
        j.append(this.N0);
        j.append(", active item id=");
        return ang.c(j, this.O0, "}");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.F0);
        parcel.writeLong(this.G0);
        parcel.writeFloat(this.I0);
        parcel.writeLong(this.M0);
        parcel.writeLong(this.H0);
        parcel.writeLong(this.J0);
        TextUtils.writeToParcel(this.L0, parcel, n);
        parcel.writeTypedList((List)this.N0);
        parcel.writeLong(this.O0);
        parcel.writeBundle(this.P0);
        parcel.writeInt(this.K0);
    }
    
    public static final class CustomAction implements Parcelable
    {
        public static final Parcelable$Creator<CustomAction> CREATOR;
        public final String F0;
        public final CharSequence G0;
        public final int H0;
        public final Bundle I0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<CustomAction>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new CustomAction(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new CustomAction[n];
                }
            };
        }
        
        public CustomAction(final Parcel parcel) {
            this.F0 = parcel.readString();
            this.G0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.H0 = parcel.readInt();
            this.I0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
        
        public CustomAction(final String f0, final CharSequence g0, final int h0, final Bundle i0) {
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("Action:mName='");
            f.append((Object)this.G0);
            f.append(", mIcon=");
            f.append(this.H0);
            f.append(", mExtras=");
            f.append(this.I0);
            return f.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.F0);
            TextUtils.writeToParcel(this.G0, parcel, n);
            parcel.writeInt(this.H0);
            parcel.writeBundle(this.I0);
        }
    }
    
    public static final class b
    {
        public static void a(final PlaybackState$Builder playbackState$Builder, final PlaybackState$CustomAction playbackState$CustomAction) {
            playbackState$Builder.addCustomAction(playbackState$CustomAction);
        }
        
        public static PlaybackState$CustomAction b(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder) {
            return playbackState$CustomAction$Builder.build();
        }
        
        public static PlaybackState c(final PlaybackState$Builder playbackState$Builder) {
            return playbackState$Builder.build();
        }
        
        public static PlaybackState$Builder d() {
            return new PlaybackState$Builder();
        }
        
        public static PlaybackState$CustomAction$Builder e(final String s, final CharSequence charSequence, final int n) {
            return new PlaybackState$CustomAction$Builder(s, charSequence, n);
        }
        
        public static String f(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getAction();
        }
        
        public static long g(final PlaybackState playbackState) {
            return playbackState.getActions();
        }
        
        public static long h(final PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }
        
        public static long i(final PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }
        
        public static List<PlaybackState$CustomAction> j(final PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }
        
        public static CharSequence k(final PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }
        
        public static Bundle l(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getExtras();
        }
        
        public static int m(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getIcon();
        }
        
        public static long n(final PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }
        
        public static CharSequence o(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getName();
        }
        
        public static float p(final PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }
        
        public static long q(final PlaybackState playbackState) {
            return playbackState.getPosition();
        }
        
        public static int r(final PlaybackState playbackState) {
            return playbackState.getState();
        }
        
        public static void s(final PlaybackState$Builder playbackState$Builder, final long actions) {
            playbackState$Builder.setActions(actions);
        }
        
        public static void t(final PlaybackState$Builder playbackState$Builder, final long activeQueueItemId) {
            playbackState$Builder.setActiveQueueItemId(activeQueueItemId);
        }
        
        public static void u(final PlaybackState$Builder playbackState$Builder, final long bufferedPosition) {
            playbackState$Builder.setBufferedPosition(bufferedPosition);
        }
        
        public static void v(final PlaybackState$Builder playbackState$Builder, final CharSequence errorMessage) {
            playbackState$Builder.setErrorMessage(errorMessage);
        }
        
        public static void w(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder, final Bundle extras) {
            playbackState$CustomAction$Builder.setExtras(extras);
        }
        
        public static void x(final PlaybackState$Builder playbackState$Builder, final int n, final long n2, final float n3, final long n4) {
            playbackState$Builder.setState(n, n2, n3, n4);
        }
    }
    
    public static final class c
    {
        public static Bundle a(final PlaybackState playbackState) {
            return playbackState.getExtras();
        }
        
        public static void b(final PlaybackState$Builder playbackState$Builder, final Bundle extras) {
            playbackState$Builder.setExtras(extras);
        }
    }
}
