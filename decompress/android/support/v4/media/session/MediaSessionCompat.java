// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.IInterface;
import android.os.BaseBundle;
import android.media.Rating;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import android.os.IBinder;
import java.util.Objects;
import androidx.versionedparcelable.ParcelImpl;
import android.media.session.MediaSession$Callback;
import android.os.Message;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;
import android.media.session.MediaSession$QueueItem;
import android.media.MediaDescription;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.util.TypedValue;
import j$.util.concurrent.ConcurrentHashMap;
import android.os.Handler;
import android.os.Looper;
import android.app.PendingIntent;
import android.util.Log;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.text.TextUtils;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.ArrayList;

public final class MediaSessionCompat
{
    public static final int c;
    public static int d;
    public final MediaSessionCompat$c a;
    public final ArrayList<g> b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int c2 = 0;
        boolean b = false;
        Label_0040: {
            Label_0038: {
                if (sdk_INT < 31) {
                    if (sdk_INT >= 30) {
                        final String codename = Build$VERSION.CODENAME;
                        if (qs2.a("S")) {
                            break Label_0038;
                        }
                    }
                    b = false;
                    break Label_0040;
                }
            }
            b = true;
        }
        if (b) {
            c2 = 33554432;
        }
        c = c2;
    }
    
    public MediaSessionCompat(final Context context) {
        this.b = new ArrayList<g>();
        if (!TextUtils.isEmpty((CharSequence)"AVMediaSession")) {
            final int a = bsg.a;
            final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            final List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            final int size = queryBroadcastReceivers.size();
            PendingIntent broadcast = null;
            ComponentName component;
            if (size == 1) {
                final ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                component = new ComponentName(activityInfo.packageName, activityInfo.name);
            }
            else {
                if (queryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                component = null;
            }
            if (component == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (component != null) {
                final Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(component);
                broadcast = PendingIntent.getBroadcast(context, 0, intent2, MediaSessionCompat.c);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 29) {
                this.a = (MediaSessionCompat$c)new MediaSessionCompat.MediaSessionCompat$f(context);
            }
            else if (sdk_INT >= 28) {
                this.a = (MediaSessionCompat$c)new e(context);
            }
            else if (sdk_INT >= 22) {
                this.a = (MediaSessionCompat$c)new MediaSessionCompat$d(context);
            }
            else {
                this.a = new MediaSessionCompat$c(context);
            }
            Looper looper;
            if (Looper.myLooper() != null) {
                looper = Looper.myLooper();
            }
            else {
                looper = Looper.getMainLooper();
            }
            this.a.f((a)new c(), new Handler(looper));
            this.a.g(broadcast);
            new ConcurrentHashMap();
            final Token b = this.a.b;
            if (sdk_INT >= 29) {
                new MediaControllerCompat$b(context, b);
            }
            else {
                new MediaControllerCompat.MediaControllerImplApi21(context, b);
            }
            if (MediaSessionCompat.d == 0) {
                MediaSessionCompat.d = (int)(TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
    
    public static void a(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
    
    public static Bundle b(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            ((BaseBundle)bundle).isEmpty();
            return bundle;
        }
        catch (final BadParcelableException ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class QueueItem implements Parcelable
    {
        public static final Parcelable$Creator<QueueItem> CREATOR;
        public final MediaDescriptionCompat F0;
        public final long G0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<QueueItem>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new QueueItem(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new QueueItem[n];
                }
            };
        }
        
        public QueueItem(final Parcel parcel) {
            this.F0 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.G0 = parcel.readLong();
        }
        
        public QueueItem(final MediaDescriptionCompat f0, final long g0) {
            if (f0 == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (g0 != -1L) {
                this.F0 = f0;
                this.G0 = g0;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("MediaSession.QueueItem {Description=");
            f.append(this.F0);
            f.append(", Id=");
            return ang.c(f, this.G0, " }");
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            this.F0.writeToParcel(parcel, n);
            parcel.writeLong(this.G0);
        }
        
        public static final class b
        {
            public static MediaSession$QueueItem a(final MediaDescription mediaDescription, final long n) {
                return new MediaSession$QueueItem(mediaDescription, n);
            }
            
            public static MediaDescription b(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getDescription();
            }
            
            public static long c(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getQueueId();
            }
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class ResultReceiverWrapper implements Parcelable
    {
        public static final Parcelable$Creator<ResultReceiverWrapper> CREATOR;
        public ResultReceiver F0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<ResultReceiverWrapper>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new ResultReceiverWrapper(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new ResultReceiverWrapper[n];
                }
            };
        }
        
        public ResultReceiverWrapper(final Parcel parcel) {
            this.F0 = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            this.F0.writeToParcel(parcel, n);
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class Token implements Parcelable
    {
        public static final Parcelable$Creator<Token> CREATOR;
        public final Object F0;
        public final Object G0;
        public android.support.v4.media.session.b H0;
        public ftw I0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<Token>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new Token(parcel.readParcelable((ClassLoader)null), null);
                }
                
                public final Object[] newArray(final int n) {
                    return new Token[n];
                }
            };
        }
        
        public Token(final Object g0, final android.support.v4.media.session.b h0) {
            this.F0 = new Object();
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = null;
        }
        
        public final android.support.v4.media.session.b a() {
            synchronized (this.F0) {
                return this.H0;
            }
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(Object g0) {
            boolean b = true;
            if (this == g0) {
                return true;
            }
            if (!(g0 instanceof Token)) {
                return false;
            }
            final Token token = (Token)g0;
            g0 = this.G0;
            if (g0 == null) {
                if (token.G0 != null) {
                    b = false;
                }
                return b;
            }
            final Object g2 = token.G0;
            return g2 != null && g0.equals(g2);
        }
        
        @Override
        public final int hashCode() {
            final Object g0 = this.G0;
            if (g0 == null) {
                return 0;
            }
            return g0.hashCode();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable((Parcelable)this.G0, n);
        }
    }
    
    public abstract static class a
    {
        public final Object a;
        public final b b;
        public boolean c;
        public WeakReference<MediaSessionCompat.b> d;
        public MediaSessionCompat.a.a e;
        
        public a() {
            this.a = new Object();
            this.b = new b();
            this.d = new WeakReference<MediaSessionCompat.b>(null);
        }
        
        public final void a(final MediaSessionCompat.b b, final Handler handler) {
            if (!this.c) {
                return;
            }
            this.c = false;
            handler.removeMessages(1);
            b.n();
        }
        
        public final boolean b(final Intent intent) {
            if (Build$VERSION.SDK_INT >= 27) {
                return false;
            }
            Object o = this.a;
            synchronized (o) {
                final MediaSessionCompat.b b = this.d.get();
                final MediaSessionCompat.a.a e = this.e;
                monitorexit(o);
                if (b != null) {
                    if (e != null) {
                        final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                        if (keyEvent != null) {
                            if (keyEvent.getAction() == 0) {
                                o = b.c();
                                final int keyCode = keyEvent.getKeyCode();
                                if (keyCode != 79 && keyCode != 85) {
                                    this.a(b, e);
                                    return false;
                                }
                                if (keyEvent.getRepeatCount() == 0) {
                                    if (this.c) {
                                        e.removeMessages(1);
                                        this.c = false;
                                        b.n();
                                    }
                                    else {
                                        this.c = true;
                                        e.sendMessageDelayed(e.obtainMessage(1, o), (long)ViewConfiguration.getDoubleTapTimeout());
                                    }
                                }
                                else {
                                    this.a(b, e);
                                }
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        
        public final void c(final MediaSessionCompat.b b, final Handler handler) {
            synchronized (this.a) {
                this.d = new WeakReference<MediaSessionCompat.b>(b);
                final MediaSessionCompat.a.a e = this.e;
                final MediaSessionCompat.a.a a = null;
                if (e != null) {
                    e.removeCallbacksAndMessages((Object)null);
                }
                MediaSessionCompat.a.a e2 = a;
                if (b != null) {
                    if (handler == null) {
                        e2 = a;
                    }
                    else {
                        e2 = new MediaSessionCompat.a.a(handler.getLooper());
                    }
                }
                this.e = e2;
            }
        }
        
        public final class a extends Handler
        {
            public final MediaSessionCompat.a a;
            
            public a(final MediaSessionCompat.a a, final Looper looper) {
                this.a = a;
                super(looper);
            }
            
            public final void handleMessage(final Message message) {
                if (message.what == 1) {
                    synchronized (this.a.a) {
                        final MediaSessionCompat.b b = this.a.d.get();
                        final MediaSessionCompat.a a = this.a;
                        final a e = a.e;
                        monitorexit(this.a.a);
                        if (b == null || a != b.a() || e == null) {
                            return;
                        }
                        b.b((i0h)message.obj);
                        this.a.a(b, e);
                        b.b(null);
                    }
                }
            }
        }
        
        public final class b extends MediaSession$Callback
        {
            public final MediaSessionCompat.a a;
            
            public b(final MediaSessionCompat.a a) {
                this.a = a;
            }
            
            public final MediaSessionCompat$c a() {
                synchronized (this.a.a) {
                    final MediaSessionCompat$c mediaSessionCompat$c = this.a.d.get();
                    monitorexit(this.a.a);
                    if (mediaSessionCompat$c != null) {
                        final MediaSessionCompat.a a = this.a;
                        final Object c = mediaSessionCompat$c.c;
                        synchronized (this.a.a) {
                            final MediaSessionCompat.a g = mediaSessionCompat$c.g;
                            monitorexit(this.a.a);
                            if (a == g) {
                                return;
                            }
                        }
                    }
                    return null;
                }
            }
            
            public final void b(final MediaSessionCompat.b b) {
                if (Build$VERSION.SDK_INT >= 28) {
                    return;
                }
                String e;
                if (TextUtils.isEmpty((CharSequence)(e = ((MediaSessionCompat$c)b).e()))) {
                    e = "android.media.session.MediaController";
                }
                b.b(new i0h(e, -1, -1));
            }
            
            public final void onCommand(String f0, final Bundle bundle, final ResultReceiver resultReceiver) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Label_0285: {
                    try {
                        if (f0.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            final Bundle bundle2 = new Bundle();
                            final Token b = a.b;
                            final android.support.v4.media.session.b a2 = b.a();
                            IBinder binder;
                            if (a2 == null) {
                                binder = null;
                            }
                            else {
                                binder = ((IInterface)a2).asBinder();
                            }
                            rt2.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", binder);
                            f0 = (String)b.F0;
                            synchronized (f0) {
                                final ftw i0 = b.I0;
                                monitorexit(f0);
                                if (i0 != null) {
                                    final Bundle bundle3 = new Bundle();
                                    f0 = (String)new ParcelImpl(i0);
                                    bundle3.putParcelable("a", (Parcelable)f0);
                                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable)bundle3);
                                }
                                resultReceiver.send(0, bundle2);
                                break Label_0285;
                            }
                        }
                        if (f0.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            final MediaSessionCompat.a a3 = this.a;
                            final MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                            Objects.requireNonNull(a3);
                        }
                        else if (f0.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            final MediaSessionCompat.a a4 = this.a;
                            final MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                            ((BaseBundle)bundle).getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                            Objects.requireNonNull(a4);
                        }
                        else if (f0.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            final MediaSessionCompat.a a5 = this.a;
                            final MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                            Objects.requireNonNull(a5);
                        }
                        else if (!f0.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            Objects.requireNonNull(this.a);
                        }
                    }
                    catch (final BadParcelableException ex) {
                        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                    }
                }
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onCustomAction(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                try {
                    if (s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        final Uri uri = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE")) {
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        ((BaseBundle)bundle).getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        ((BaseBundle)bundle).getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        final Uri uri2 = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        ((BaseBundle)bundle).getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        ((BaseBundle)bundle).getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_RATING")) {
                        final RatingCompat ratingCompat = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(this.a);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        Objects.requireNonNull(this.a);
                    }
                    else {
                        Objects.requireNonNull(this.a);
                    }
                }
                catch (final BadParcelableException ex) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onFastForward() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final boolean onMediaButtonEvent(final Intent intent) {
                final MediaSessionCompat$c a = this.a();
                boolean b = false;
                if (a == null) {
                    return false;
                }
                this.b((MediaSessionCompat.b)a);
                final boolean b2 = this.a.b(intent);
                ((MediaSessionCompat.b)a).b(null);
                if (b2 || super.onMediaButtonEvent(intent)) {
                    b = true;
                }
                return b;
            }
            
            public final void onPause() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPlay() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPlayFromMediaId(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPlayFromSearch(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPlayFromUri(final Uri uri, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPrepare() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPrepareFromMediaId(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPrepareFromSearch(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onPrepareFromUri(final Uri uri, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onRewind() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onSeekTo(final long n) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onSetPlaybackSpeed(final float n) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onSetRating(final Rating rating) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                final MediaSessionCompat.a a2 = this.a;
                RatingCompat.a(rating);
                Objects.requireNonNull(a2);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onSkipToNext() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onSkipToPrevious() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onSkipToQueueItem(final long n) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
            
            public final void onStop() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                this.b((MediaSessionCompat.b)a);
                Objects.requireNonNull(this.a);
                ((MediaSessionCompat.b)a).b(null);
            }
        }
    }
    
    public interface b
    {
        a a();
        
        void b(final i0h p0);
        
        i0h c();
        
        PlaybackStateCompat n();
    }
    
    public static class e extends MediaSessionCompat$d
    {
        public e(final Context context) {
            super(context);
        }
        
        public final void b(final i0h i0h) {
        }
        
        public final i0h c() {
            return new i0h(((MediaSessionCompat$c)this).a.getCurrentControllerInfo());
        }
    }
    
    public interface g
    {
        void a();
    }
}
